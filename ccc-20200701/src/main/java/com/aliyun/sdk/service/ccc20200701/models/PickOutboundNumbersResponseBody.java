// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link PickOutboundNumbersResponseBody} extends {@link TeaModel}
 *
 * <p>PickOutboundNumbersResponseBody</p>
 */
public class PickOutboundNumbersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private PickOutboundNumbersResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PickOutboundNumbersResponseBody create() {
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
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
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

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(PickOutboundNumbersResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public PickOutboundNumbersResponseBody build() {
            return new PickOutboundNumbersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PickOutboundNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>PickOutboundNumbersResponseBody</p>
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
             * <p>City of number registration.</p>
             * 
             * <strong>example:</strong>
             * <p>北京</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>Number</p>
             * 
             * <strong>example:</strong>
             * <p>1388888****</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>Province of number registration.</p>
             * 
             * <strong>example:</strong>
             * <p>北京</p>
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
     * {@link PickOutboundNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>PickOutboundNumbersResponseBody</p>
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
             * <p>City of number registration.</p>
             * 
             * <strong>example:</strong>
             * <p>北京</p>
             */
            public Builder city(String city) {
                this.city = city;
                return this;
            }

            /**
             * <p>Number</p>
             * 
             * <strong>example:</strong>
             * <p>0108989****</p>
             */
            public Builder number(String number) {
                this.number = number;
                return this;
            }

            /**
             * <p>Province of number registration.</p>
             * 
             * <strong>example:</strong>
             * <p>北京</p>
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
     * {@link PickOutboundNumbersResponseBody} extends {@link TeaModel}
     *
     * <p>PickOutboundNumbersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Callee")
        private Callee callee;

        @com.aliyun.core.annotation.NameInMap("Caller")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.callee = model.callee;
                this.caller = model.caller;
            } 

            /**
             * <p>Callee number.</p>
             */
            public Builder callee(Callee callee) {
                this.callee = callee;
                return this;
            }

            /**
             * <p>Caller number.</p>
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
