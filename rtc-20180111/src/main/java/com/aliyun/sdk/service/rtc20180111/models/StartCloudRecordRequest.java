// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCloudRecordRequest} extends {@link RequestModel}
 *
 * <p>StartCloudRecordRequest</p>
 */
public class StartCloudRecordRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ChannelId")
    private String channelId;

    @Query
    @NameInMap("Panes")
    private java.util.List < Panes> panes;

    @Query
    @NameInMap("StorageConfig")
    private StorageConfig storageConfig;

    @Query
    @NameInMap("TaskId")
    private String taskId;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    private StartCloudRecordRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.channelId = builder.channelId;
        this.panes = builder.panes;
        this.storageConfig = builder.storageConfig;
        this.taskId = builder.taskId;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartCloudRecordRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return panes
     */
    public java.util.List < Panes> getPanes() {
        return this.panes;
    }

    /**
     * @return storageConfig
     */
    public StorageConfig getStorageConfig() {
        return this.storageConfig;
    }

    /**
     * @return taskId
     */
    public String getTaskId() {
        return this.taskId;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    public static final class Builder extends Request.Builder<StartCloudRecordRequest, Builder> {
        private String appId; 
        private String channelId; 
        private java.util.List < Panes> panes; 
        private StorageConfig storageConfig; 
        private String taskId; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(StartCloudRecordRequest request) {
            super(request);
            this.appId = request.appId;
            this.channelId = request.channelId;
            this.panes = request.panes;
            this.storageConfig = request.storageConfig;
            this.taskId = request.taskId;
            this.templateId = request.templateId;
        } 

        /**
         * appId
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * channelName
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
        }

        /**
         * panes
         */
        public Builder panes(java.util.List < Panes> panes) {
            this.putQueryParameter("Panes", panes);
            this.panes = panes;
            return this;
        }

        /**
         * storageConfig
         */
        public Builder storageConfig(StorageConfig storageConfig) {
            this.putQueryParameter("StorageConfig", storageConfig);
            this.storageConfig = storageConfig;
            return this;
        }

        /**
         * taskId
         */
        public Builder taskId(String taskId) {
            this.putQueryParameter("TaskId", taskId);
            this.taskId = taskId;
            return this;
        }

        /**
         * templateId
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public StartCloudRecordRequest build() {
            return new StartCloudRecordRequest(this);
        } 

    } 

    public static class Panes extends TeaModel {
        @NameInMap("PaneId")
        private String paneId;

        @NameInMap("Source")
        private String source;

        @NameInMap("SourceType")
        private String sourceType;

        private Panes(Builder builder) {
            this.paneId = builder.paneId;
            this.source = builder.source;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Panes create() {
            return builder().build();
        }

        /**
         * @return paneId
         */
        public String getPaneId() {
            return this.paneId;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private String paneId; 
            private String source; 
            private String sourceType; 

            /**
             * paneId
             */
            public Builder paneId(String paneId) {
                this.paneId = paneId;
                return this;
            }

            /**
             * source
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            /**
             * sourceType
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public Panes build() {
                return new Panes(this);
            } 

        } 

    }
    public static class StorageConfig extends TeaModel {
        @NameInMap("AccessKey")
        private String accessKey;

        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Region")
        private Integer region;

        @NameInMap("SecretKey")
        private String secretKey;

        @NameInMap("Vendor")
        private Integer vendor;

        private StorageConfig(Builder builder) {
            this.accessKey = builder.accessKey;
            this.bucket = builder.bucket;
            this.region = builder.region;
            this.secretKey = builder.secretKey;
            this.vendor = builder.vendor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StorageConfig create() {
            return builder().build();
        }

        /**
         * @return accessKey
         */
        public String getAccessKey() {
            return this.accessKey;
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return region
         */
        public Integer getRegion() {
            return this.region;
        }

        /**
         * @return secretKey
         */
        public String getSecretKey() {
            return this.secretKey;
        }

        /**
         * @return vendor
         */
        public Integer getVendor() {
            return this.vendor;
        }

        public static final class Builder {
            private String accessKey; 
            private String bucket; 
            private Integer region; 
            private String secretKey; 
            private Integer vendor; 

            /**
             * accessKey
             */
            public Builder accessKey(String accessKey) {
                this.accessKey = accessKey;
                return this;
            }

            /**
             * bucket
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * region
             */
            public Builder region(Integer region) {
                this.region = region;
                return this;
            }

            /**
             * secretKey
             */
            public Builder secretKey(String secretKey) {
                this.secretKey = secretKey;
                return this;
            }

            /**
             * vendor
             */
            public Builder vendor(Integer vendor) {
                this.vendor = vendor;
                return this;
            }

            public StorageConfig build() {
                return new StorageConfig(this);
            } 

        } 

    }
}
