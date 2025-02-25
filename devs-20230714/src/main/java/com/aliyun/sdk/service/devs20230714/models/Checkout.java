// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Checkout} extends {@link TeaModel}
 *
 * <p>Checkout</p>
 */
public class Checkout extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ref")
    private String ref;

    @com.aliyun.core.annotation.NameInMap("remote")
    private String remote;

    private Checkout(Builder builder) {
        this.ref = builder.ref;
        this.remote = builder.remote;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Checkout create() {
        return builder().build();
    }

    /**
     * @return ref
     */
    public String getRef() {
        return this.ref;
    }

    /**
     * @return remote
     */
    public String getRemote() {
        return this.remote;
    }

    public static final class Builder {
        private String ref; 
        private String remote; 

        /**
         * ref.
         */
        public Builder ref(String ref) {
            this.ref = ref;
            return this;
        }

        /**
         * remote.
         */
        public Builder remote(String remote) {
            this.remote = remote;
            return this;
        }

        public Checkout build() {
            return new Checkout(this);
        } 

    } 

}
