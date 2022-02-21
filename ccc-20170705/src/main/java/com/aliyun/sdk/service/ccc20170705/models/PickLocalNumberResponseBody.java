// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PickLocalNumberResponseBody} extends {@link TeaModel}
 *
 * <p>PickLocalNumberResponseBody</p>
 */
public class PickLocalNumberResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private PickLocalNumberResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PickLocalNumberResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
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
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public PickLocalNumberResponseBody build() {
            return new PickLocalNumberResponseBody(this);
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
    public static class Data extends TeaModel {
        @NameInMap("Callee")
        private Callee callee;

        @NameInMap("Caller")
        private Caller caller;

        private Data(Builder builder) {
            this.callee = builder.callee;
            this.caller = builder.caller;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
