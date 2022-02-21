// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PickOutboundNumbersResponseBody} extends {@link TeaModel}
 *
 * <p>PickOutboundNumbersResponseBody</p>
 */
public class PickOutboundNumbersResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DialNumberPairs")
    private DialNumberPairs dialNumberPairs;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PickOutboundNumbersResponseBody(Builder builder) {
        this.code = builder.code;
        this.dialNumberPairs = builder.dialNumberPairs;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PickOutboundNumbersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dialNumberPairs
     */
    public DialNumberPairs getDialNumberPairs() {
        return this.dialNumberPairs;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private DialNumberPairs dialNumberPairs; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DialNumberPairs.
         */
        public Builder dialNumberPairs(DialNumberPairs dialNumberPairs) {
            this.dialNumberPairs = dialNumberPairs;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PickOutboundNumbersResponseBody build() {
            return new PickOutboundNumbersResponseBody(this);
        } 

    } 

    public static class Callee extends TeaModel {
        @NameInMap("City")
        private String city;

        @NameInMap("Number")
        private String number;

        @NameInMap("Province")
        private String province;

        private Callee(Builder builder) {
            this.city = builder.city;
            this.number = builder.number;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Callee create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private String city; 
            private String number; 
            private String province; 

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public Callee build() {
                return new Callee(this);
            } 

        } 

    }
    public static class Caller extends TeaModel {
        @NameInMap("City")
        private String city;

        @NameInMap("Number")
        private String number;

        @NameInMap("Province")
        private String province;

        private Caller(Builder builder) {
            this.city = builder.city;
            this.number = builder.number;
            this.province = builder.province;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Caller create() {
            return builder().build();
        }

        /**
         * @return city
         */
        public String getCity() {
            return this.city;
        }

        /**
         * @return number
         */
        public String getNumber() {
            return this.number;
        }

        /**
         * @return province
         */
        public String getProvince() {
            return this.province;
        }

        public static final class Builder {
            private String city; 
            private String number; 
            private String province; 

            /**
             * City.
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * Number.
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * Province.
             */
            public Builder province(String province) {
                this.province = province;
                return this;
            }

            public Caller build() {
                return new Caller(this);
            } 

        } 

    }
    public static class DialNumberPair extends TeaModel {
        @NameInMap("Callee")
        private Callee callee;

        @NameInMap("Caller")
        private Caller caller;

        private DialNumberPair(Builder builder) {
            this.callee = builder.callee;
            this.caller = builder.caller;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialNumberPair create() {
            return builder().build();
        }

        /**
         * @return callee
         */
        public Callee getCallee() {
            return this.callee;
        }

        /**
         * @return caller
         */
        public Caller getCaller() {
            return this.caller;
        }

        public static final class Builder {
            private Callee callee; 
            private Caller caller; 

            /**
             * Callee.
             */
            public Builder callee(Callee callee) {
                this.callee = callee;
                return this;
            }

            /**
             * Caller.
             */
            public Builder caller(Caller caller) {
                this.caller = caller;
                return this;
            }

            public DialNumberPair build() {
                return new DialNumberPair(this);
            } 

        } 

    }
    public static class DialNumberPairs extends TeaModel {
        @NameInMap("DialNumberPair")
        private java.util.List < DialNumberPair> dialNumberPair;

        private DialNumberPairs(Builder builder) {
            this.dialNumberPair = builder.dialNumberPair;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialNumberPairs create() {
            return builder().build();
        }

        /**
         * @return dialNumberPair
         */
        public java.util.List < DialNumberPair> getDialNumberPair() {
            return this.dialNumberPair;
        }

        public static final class Builder {
            private java.util.List < DialNumberPair> dialNumberPair; 

            /**
             * DialNumberPair.
             */
            public Builder dialNumberPair(java.util.List < DialNumberPair> dialNumberPair) {
                this.dialNumberPair = dialNumberPair;
                return this;
            }

            public DialNumberPairs build() {
                return new DialNumberPairs(this);
            } 

        } 

    }
}
