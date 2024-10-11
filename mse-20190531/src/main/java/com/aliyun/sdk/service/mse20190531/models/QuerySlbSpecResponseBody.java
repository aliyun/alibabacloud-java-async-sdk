// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The return value.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data entries returned.</p>
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The message returned. If the request is successful, a success message is returned. If the request fails, an error message is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The request is successfully processed.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>316F5F64-F73D-42DC-8632-01E308B6****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><code>true</code>: The request was successful.</li>
         * <li><code>false</code>: The request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QuerySlbSpecResponseBody build() {
            return new QuerySlbSpecResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySlbSpecResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySlbSpecResponseBody</p>
     */
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
             * <p>The ID of the returned data.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The maximum number of connections.</p>
             * 
             * <strong>example:</strong>
             * <p>50,000</p>
             */
            public Builder maxConnection(String maxConnection) {
                this.maxConnection = maxConnection;
                return this;
            }

            /**
             * <p>The name of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>Standard I</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The number of connections per second.</p>
             * 
             * <strong>example:</strong>
             * <p>50,000</p>
             */
            public Builder newConnectionPerSecond(String newConnectionPerSecond) {
                this.newConnectionPerSecond = newConnectionPerSecond;
                return this;
            }

            /**
             * <p>The number of queries per second (QPS).</p>
             * 
             * <strong>example:</strong>
             * <p>50,000</p>
             */
            public Builder qps(String qps) {
                this.qps = qps;
                return this;
            }

            /**
             * <p>The specification of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>slb.s2.small</p>
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
