// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

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
 * {@link ListOpenSourcePermissionsResponseBody} extends {@link TeaModel}
 *
 * <p>ListOpenSourcePermissionsResponseBody</p>
 */
public class ListOpenSourcePermissionsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListOpenSourcePermissionsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpenSourcePermissionsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<Data> data; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListOpenSourcePermissionsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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

        public ListOpenSourcePermissionsResponseBody build() {
            return new ListOpenSourcePermissionsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOpenSourcePermissionsResponseBody} extends {@link TeaModel}
     *
     * <p>ListOpenSourcePermissionsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUserId")
        private Long aliyunUserId;

        @com.aliyun.core.annotation.NameInMap("CInstanceId")
        private String cInstanceId;

        @com.aliyun.core.annotation.NameInMap("Configure")
        private String configure;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Read")
        private String read;

        @com.aliyun.core.annotation.NameInMap("Vhost")
        private String vhost;

        @com.aliyun.core.annotation.NameInMap("Write")
        private String write;

        private Data(Builder builder) {
            this.aliyunUserId = builder.aliyunUserId;
            this.cInstanceId = builder.cInstanceId;
            this.configure = builder.configure;
            this.name = builder.name;
            this.read = builder.read;
            this.vhost = builder.vhost;
            this.write = builder.write;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunUserId
         */
        public Long getAliyunUserId() {
            return this.aliyunUserId;
        }

        /**
         * @return cInstanceId
         */
        public String getCInstanceId() {
            return this.cInstanceId;
        }

        /**
         * @return configure
         */
        public String getConfigure() {
            return this.configure;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return read
         */
        public String getRead() {
            return this.read;
        }

        /**
         * @return vhost
         */
        public String getVhost() {
            return this.vhost;
        }

        /**
         * @return write
         */
        public String getWrite() {
            return this.write;
        }

        public static final class Builder {
            private Long aliyunUserId; 
            private String cInstanceId; 
            private String configure; 
            private String name; 
            private String read; 
            private String vhost; 
            private String write; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunUserId = model.aliyunUserId;
                this.cInstanceId = model.cInstanceId;
                this.configure = model.configure;
                this.name = model.name;
                this.read = model.read;
                this.vhost = model.vhost;
                this.write = model.write;
            } 

            /**
             * AliyunUserId.
             */
            public Builder aliyunUserId(Long aliyunUserId) {
                this.aliyunUserId = aliyunUserId;
                return this;
            }

            /**
             * CInstanceId.
             */
            public Builder cInstanceId(String cInstanceId) {
                this.cInstanceId = cInstanceId;
                return this;
            }

            /**
             * Configure.
             */
            public Builder configure(String configure) {
                this.configure = configure;
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
             * Read.
             */
            public Builder read(String read) {
                this.read = read;
                return this;
            }

            /**
             * Vhost.
             */
            public Builder vhost(String vhost) {
                this.vhost = vhost;
                return this;
            }

            /**
             * Write.
             */
            public Builder write(String write) {
                this.write = write;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
