// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySlbSpecResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySlbSpecResponseBody</p>
 */
public class QuerySlbSpecResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QuerySlbSpecResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySlbSpecResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private java.util.List < Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * Id of the request
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

        public QuerySlbSpecResponseBody build() {
            return new QuerySlbSpecResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Id")
        private Integer id;

        @NameInMap("MaxConnection")
        private String maxConnection;

        @NameInMap("Name")
        private String name;

        @NameInMap("NewConnectionPerSecond")
        private String newConnectionPerSecond;

        @NameInMap("Qps")
        private String qps;

        @NameInMap("Spec")
        private String spec;

        private Data(Builder builder) {
            this.id = builder.id;
            this.maxConnection = builder.maxConnection;
            this.name = builder.name;
            this.newConnectionPerSecond = builder.newConnectionPerSecond;
            this.qps = builder.qps;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return maxConnection
         */
        public String getMaxConnection() {
            return this.maxConnection;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return newConnectionPerSecond
         */
        public String getNewConnectionPerSecond() {
            return this.newConnectionPerSecond;
        }

        /**
         * @return qps
         */
        public String getQps() {
            return this.qps;
        }

        /**
         * @return spec
         */
        public String getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private Integer id; 
            private String maxConnection; 
            private String name; 
            private String newConnectionPerSecond; 
            private String qps; 
            private String spec; 

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * MaxConnection.
             */
            public Builder maxConnection(String maxConnection) {
                this.maxConnection = maxConnection;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * NewConnectionPerSecond.
             */
            public Builder newConnectionPerSecond(String newConnectionPerSecond) {
                this.newConnectionPerSecond = newConnectionPerSecond;
                return this;
            }

            /**
             * Qps.
             */
            public Builder qps(String qps) {
                this.qps = qps;
                return this;
            }

            /**
             * Spec.
             */
            public Builder spec(String spec) {
                this.spec = spec;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
