// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListPreChecksResponseBody} extends {@link TeaModel}
 *
 * <p>ListPreChecksResponseBody</p>
 */
public class ListPreChecksResponseBody extends TeaModel {
    @NameInMap("PreChecks")
    private java.util.List < PreChecks> preChecks;

    @NameInMap("RequestId")
    private String requestId;

    private ListPreChecksResponseBody(Builder builder) {
        this.preChecks = builder.preChecks;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPreChecksResponseBody create() {
        return builder().build();
    }

    /**
     * @return preChecks
     */
    public java.util.List < PreChecks> getPreChecks() {
        return this.preChecks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < PreChecks> preChecks; 
        private String requestId; 

        /**
         * PreChecks.
         */
        public Builder preChecks(java.util.List < PreChecks> preChecks) {
            this.preChecks = preChecks;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPreChecksResponseBody build() {
            return new ListPreChecksResponseBody(this);
        } 

    } 

    public static class PreChecks extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Link")
        private String link;

        @NameInMap("Price")
        private String price;

        @NameInMap("State")
        private String state;

        private PreChecks(Builder builder) {
            this.key = builder.key;
            this.link = builder.link;
            this.price = builder.price;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreChecks create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return link
         */
        public String getLink() {
            return this.link;
        }

        /**
         * @return price
         */
        public String getPrice() {
            return this.price;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private String key; 
            private String link; 
            private String price; 
            private String state; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Link.
             */
            public Builder link(String link) {
                this.link = link;
                return this;
            }

            /**
             * Price.
             */
            public Builder price(String price) {
                this.price = price;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public PreChecks build() {
                return new PreChecks(this);
            } 

        } 

    }
}
