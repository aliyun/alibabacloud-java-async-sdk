// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySlbSpecResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySlbSpecResponseBody</p>
 */
public class QuerySlbSpecResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List < Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
         * The return value.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data entries returned.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * The HTTP status code returned.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * The message returned. If the request is successful, a success message is returned. If the request fails, an error message is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   `true`: The request was successful.
         * *   `false`: The request failed.
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
        @com.aliyun.core.annotation.NameInMap("Id")
        private Integer id;

        @com.aliyun.core.annotation.NameInMap("MaxConnection")
        private String maxConnection;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NewConnectionPerSecond")
        private String newConnectionPerSecond;

        @com.aliyun.core.annotation.NameInMap("Qps")
        private String qps;

        @com.aliyun.core.annotation.NameInMap("Spec")
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
             * The ID of the returned data.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * The maximum number of connections.
             */
            public Builder maxConnection(String maxConnection) {
                this.maxConnection = maxConnection;
                return this;
            }

            /**
             * The name of the instance.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The number of connections per second.
             */
            public Builder newConnectionPerSecond(String newConnectionPerSecond) {
                this.newConnectionPerSecond = newConnectionPerSecond;
                return this;
            }

            /**
             * The number of queries per second (QPS).
             */
            public Builder qps(String qps) {
                this.qps = qps;
                return this;
            }

            /**
             * The specification of the instance.
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
