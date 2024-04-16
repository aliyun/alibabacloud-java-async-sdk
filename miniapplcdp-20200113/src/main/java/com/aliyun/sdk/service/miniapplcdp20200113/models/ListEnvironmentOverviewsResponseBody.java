// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEnvironmentOverviewsResponseBody} extends {@link TeaModel}
 *
 * <p>ListEnvironmentOverviewsResponseBody</p>
 */
public class ListEnvironmentOverviewsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListEnvironmentOverviewsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEnvironmentOverviewsResponseBody create() {
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

        public ListEnvironmentOverviewsResponseBody build() {
            return new ListEnvironmentOverviewsResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("Config")
        private java.util.Map < String, String > config;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("CurrentPublish")
        private java.util.Map < String, String > currentPublish;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("EnvStatus")
        private String envStatus;

        @NameInMap("EnvType")
        private String envType;

        @NameInMap("LatestAppAccessTime")
        private String latestAppAccessTime;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("OpsRecord")
        private java.util.Map < String, String > opsRecord;

        @NameInMap("Publishing")
        private java.util.Map < String, String > publishing;

        private Items(Builder builder) {
            this.appId = builder.appId;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.currentPublish = builder.currentPublish;
            this.endpoint = builder.endpoint;
            this.envId = builder.envId;
            this.envStatus = builder.envStatus;
            this.envType = builder.envType;
            this.latestAppAccessTime = builder.latestAppAccessTime;
            this.modifiedTime = builder.modifiedTime;
            this.opsRecord = builder.opsRecord;
            this.publishing = builder.publishing;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return config
         */
        public java.util.Map < String, String > getConfig() {
            return this.config;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return currentPublish
         */
        public java.util.Map < String, String > getCurrentPublish() {
            return this.currentPublish;
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
         * @return envStatus
         */
        public String getEnvStatus() {
            return this.envStatus;
        }

        /**
         * @return envType
         */
        public String getEnvType() {
            return this.envType;
        }

        /**
         * @return latestAppAccessTime
         */
        public String getLatestAppAccessTime() {
            return this.latestAppAccessTime;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return opsRecord
         */
        public java.util.Map < String, String > getOpsRecord() {
            return this.opsRecord;
        }

        /**
         * @return publishing
         */
        public java.util.Map < String, String > getPublishing() {
            return this.publishing;
        }

        public static final class Builder {
            private String appId; 
            private java.util.Map < String, String > config; 
            private String createTime; 
            private java.util.Map < String, String > currentPublish; 
            private String endpoint; 
            private String envId; 
            private String envStatus; 
            private String envType; 
            private String latestAppAccessTime; 
            private String modifiedTime; 
            private java.util.Map < String, String > opsRecord; 
            private java.util.Map < String, String > publishing; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(java.util.Map < String, String > config) {
                this.config = config;
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
             * CurrentPublish.
             */
            public Builder currentPublish(java.util.Map < String, String > currentPublish) {
                this.currentPublish = currentPublish;
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
             * EnvStatus.
             */
            public Builder envStatus(String envStatus) {
                this.envStatus = envStatus;
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
             * LatestAppAccessTime.
             */
            public Builder latestAppAccessTime(String latestAppAccessTime) {
                this.latestAppAccessTime = latestAppAccessTime;
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
             * OpsRecord.
             */
            public Builder opsRecord(java.util.Map < String, String > opsRecord) {
                this.opsRecord = opsRecord;
                return this;
            }

            /**
             * Publishing.
             */
            public Builder publishing(java.util.Map < String, String > publishing) {
                this.publishing = publishing;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        private Data(Builder builder) {
            this.items = builder.items;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return items
         */
        public java.util.List < Items> getItems() {
            return this.items;
        }

        public static final class Builder {
            private java.util.List < Items> items; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
