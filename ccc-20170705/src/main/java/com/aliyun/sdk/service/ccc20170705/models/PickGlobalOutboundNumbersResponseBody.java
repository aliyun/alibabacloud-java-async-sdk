// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PickGlobalOutboundNumbersResponseBody} extends {@link TeaModel}
 *
 * <p>PickGlobalOutboundNumbersResponseBody</p>
 */
public class PickGlobalOutboundNumbersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DialNumberPairs")
    private DialNumberPairs dialNumberPairs;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PickGlobalOutboundNumbersResponseBody(Builder builder) {
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

    public static PickGlobalOutboundNumbersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(PickGlobalOutboundNumbersResponseBody model) {
            this.code = model.code;
            this.dialNumberPairs = model.dialNumberPairs;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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

        public PickGlobalOutboundNumbersResponseBody build() {
            return new PickGlobalOutboundNumbersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PickGlobalOutboundNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>PickGlobalOutboundNumbersResponseBody</p>
     */
    public static class Callee extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("Province")
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

            private Builder() {
            } 

            private Builder(Callee model) {
                this.city = model.city;
                this.number = model.number;
                this.province = model.province;
            } 

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
    /**
     * 
     * {@link PickGlobalOutboundNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>PickGlobalOutboundNumbersResponseBody</p>
     */
    public static class Caller extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("City")
        private String city;

        @com.aliyun.core.annotation.NameInMap("Number")
        private String number;

        @com.aliyun.core.annotation.NameInMap("Province")
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

            private Builder() {
            } 

            private Builder(Caller model) {
                this.city = model.city;
                this.number = model.number;
                this.province = model.province;
            } 

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
    /**
     * 
     * {@link PickGlobalOutboundNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>PickGlobalOutboundNumbersResponseBody</p>
     */
    public static class DialNumberPair extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Callee")
        private Callee callee;

        @com.aliyun.core.annotation.NameInMap("Caller")
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

            private Builder() {
            } 

            private Builder(DialNumberPair model) {
                this.callee = model.callee;
                this.caller = model.caller;
            } 

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
    /**
     * 
     * {@link PickGlobalOutboundNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>PickGlobalOutboundNumbersResponseBody</p>
     */
    public static class DialNumberPairs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DialNumberPair")
        private java.util.List<DialNumberPair> dialNumberPair;

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
        public java.util.List<DialNumberPair> getDialNumberPair() {
            return this.dialNumberPair;
        }

        public static final class Builder {
            private java.util.List<DialNumberPair> dialNumberPair; 

            private Builder() {
            } 

            private Builder(DialNumberPairs model) {
                this.dialNumberPair = model.dialNumberPair;
            } 

            /**
             * DialNumberPair.
             */
            public Builder dialNumberPair(java.util.List<DialNumberPair> dialNumberPair) {
                this.dialNumberPair = dialNumberPair;
                return this;
            }

            public DialNumberPairs build() {
                return new DialNumberPairs(this);
            } 

        } 

    }
}
