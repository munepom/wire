// Code generated by Wire protocol buffer compiler, do not edit.
// Source file: ../wire-runtime/src/test/proto/one_extension.proto at 26:1
package com.squareup.wire.protos.one_extension;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoField;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public final class Foo extends Message {
  private static final long serialVersionUID = 0L;

  public static final String DEFAULT_BAR = "";

  @ProtoField(
      tag = 1,
      type = Message.Datatype.STRING
  )
  public final String bar;

  public Foo(String bar) {
    this.bar = bar;
  }

  private Foo(Builder builder) {
    this(builder.bar);
    setBuilder(builder);
  }

  @Override
  public boolean equals(Object other) {
    if (other == this) return true;
    if (!(other instanceof Foo)) return false;
    return equals(bar, ((Foo) other).bar);
  }

  @Override
  public int hashCode() {
    int result = hashCode;
    return result != 0 ? result : (hashCode = bar != null ? bar.hashCode() : 0);
  }

  public static final class Builder extends com.squareup.wire.Message.Builder<Foo> {
    public String bar;

    public Builder() {
    }

    public Builder(Foo message) {
      super(message);
      if (message == null) return;
      this.bar = message.bar;
    }

    public Builder bar(String bar) {
      this.bar = bar;
      return this;
    }

    @Override
    public Foo build() {
      return new Foo(this);
    }
  }
}
