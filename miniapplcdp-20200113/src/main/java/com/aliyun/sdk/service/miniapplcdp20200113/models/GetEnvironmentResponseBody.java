// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEnvironmentResponseBody} extends {@link TeaModel}
 *
 * <p>GetEnvironmentResponseBody</p>
 */
public class GetEnvironmentResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetEnvironmentResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEnvironmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetEnvironmentResponseBody build() {
            return new GetEnvironmentResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AccountOpsEndpoint")
        private String accountOpsEndpoint;

        @NameInMap("AppId")
        private String appId;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CurrentPublishId")
        private String currentPublishId;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("PublishingId")
        private String publishingId;

        private Data(Builder builder) {
            this.accountOpsEndpoint = builder.accountOpsEndpoint;
            this.appId = builder.appId;
            this.createTime = builder.createTime;
            this.currentPublishId = builder.currentPublishId;
            this.endpoint = builder.endpoint;
            this.envId = builder.envId;
            this.envType = builder.envType;
            this.modifiedTime = builder.modifiedTime;
            this.publishingId = builder.publishingId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountOpsEndpoint
         */
        public String getAccountOpsEndpoint() {
            return this.accountOpsEndpoint;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentPublishId
         */
        public String getCurrentPublishId() {
            return this.currentPublishId;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return publishingId
         */
        public String getPublishingId() {
            return this.publishingId;
        }

        public static final class Builder {
            private String accountOpsEndpoint; 
            private String appId; 
            private String createTime; 
            private String currentPublishId; 
            private String endpoint; 
            private String envId; 
            private String envType; 
            private String modifiedTime; 
            private String publishingId; 

            /**
             * AccountOpsEndpoint.
             */
            public Builder accountOpsEndpoint(String accountOpsEndpoint) {
                this.accountOpsEndpoint = accountOpsEndpoint;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * CurrentPublishId.
             */
            public Builder currentPublishId(String currentPublishId) {
                this.currentPublishId = currentPublishId;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * EnvType.
             */
            public Builder envType(String envType) {
                this.envType = envType;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * PublishingId.
             */
            public Builder publishingId(String publishingId) {
                this.publishingId = publishingId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
