package com.mycompany.rx.java;

import rx.Observable;
import rx.Subscriber;
import rx.functions.Action1;

/**
 * Hello world!
 */
public class HelloWorld {

    public static void main(String[] args) {

        /** Using 'from' */
        String[] names = {"Colin", "Michael", "Peter", "Jamie", "Ryan"};

        Observable.from(names).subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println("Hello " + s + "!");
            }
        });


        /** Using 'just' */
        Observable.just("Colin","Daniel").subscribe(new Action1<String>() {
            @Override
            public void call(String s) {
                System.out.println("Hello " + s + "!");
            }
        });

        Observable.just("This is a HelloWorld example of ReactiveX in Java using RXJava")
            .subscribe(new Subscriber<String>() {
                @Override
                public void onCompleted() {
                    System.out.println("Emitting has completed");
                }

                @Override
                public void onError(Throwable throwable) {
                    System.err.println("There was an error emitting from the Observable and that error was: "
                        + throwable.getLocalizedMessage());
                }

                @Override
                public void onNext(String s) {
                    System.out.println(s);
                }
            });

    }
}
