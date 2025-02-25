// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModuleResponseBody} extends {@link TeaModel}
 *
 * <p>GetModuleResponseBody</p>
 */
public class GetModuleResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetModuleResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModuleResponseBody create() {
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

        public GetModuleResponseBody build() {
            return new GetModuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("LatestPublishedCommit")
        private String latestPublishedCommit;

        @NameInMap("LatestPublishedVersion")
        private String latestPublishedVersion;

        @NameInMap("MinimumPlatformVersion")
        private String minimumPlatformVersion;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ModuleId")
        private String moduleId;

        @NameInMap("ModuleName")
        private String moduleName;

        @NameInMap("OwnerAppId")
        private String ownerAppId;

        @NameInMap("OwnerUserId")
        private String ownerUserId;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("PlatformVersion")
        private String platformVersion;

        private Data(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.icon = builder.icon;
            this.latestPublishedCommit = builder.latestPublishedCommit;
            this.latestPublishedVersion = builder.latestPublishedVersion;
            this.minimumPlatformVersion = builder.minimumPlatformVersion;
            this.modifiedTime = builder.modifiedTime;
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
            this.ownerAppId = builder.ownerAppId;
            this.ownerUserId = builder.ownerUserId;
            this.platform = builder.platform;
            this.platformVersion = builder.platformVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
        }

        /**
         * @return latestPublishedCommit
         */
        public String getLatestPublishedCommit() {
            return this.latestPublishedCommit;
        }

        /**
         * @return latestPublishedVersion
         */
        public String getLatestPublishedVersion() {
            return this.latestPublishedVersion;
        }

        /**
         * @return minimumPlatformVersion
         */
        public String getMinimumPlatformVersion() {
            return this.minimumPlatformVersion;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return moduleId
         */
        public String getModuleId() {
            return this.moduleId;
        }

        /**
         * @return moduleName
         */
        public String getModuleName() {
            return this.moduleName;
        }

        /**
         * @return ownerAppId
         */
        public String getOwnerAppId() {
            return this.ownerAppId;
        }

        /**
         * @return ownerUserId
         */
        public String getOwnerUserId() {
            return this.ownerUserId;
        }

        /**
         * @return platform
         */
        public String getPlatform() {
            return this.platform;
        }

        /**
         * @return platformVersion
         */
        public String getPlatformVersion() {
            return this.platformVersion;
        }

        public static final class Builder {
            private String createTime; 
            private String description; 
            private String icon; 
            private String latestPublishedCommit; 
            private String latestPublishedVersion; 
            private String minimumPlatformVersion; 
            private String modifiedTime; 
            private String moduleId; 
            private String moduleName; 
            private String ownerAppId; 
            private String ownerUserId; 
            private String platform; 
            private String platformVersion; 

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
            }

            /**
             * LatestPublishedCommit.
             */
            public Builder latestPublishedCommit(String latestPublishedCommit) {
                this.latestPublishedCommit = latestPublishedCommit;
                return this;
            }

            /**
             * LatestPublishedVersion.
             */
            public Builder latestPublishedVersion(String latestPublishedVersion) {
                this.latestPublishedVersion = latestPublishedVersion;
                return this;
            }

            /**
             * MinimumPlatformVersion.
             */
            public Builder minimumPlatformVersion(String minimumPlatformVersion) {
                this.minimumPlatformVersion = minimumPlatformVersion;
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
             * ModuleId.
             */
            public Builder moduleId(String moduleId) {
                this.moduleId = moduleId;
                return this;
            }

            /**
             * ModuleName.
             */
            public Builder moduleName(String moduleName) {
                this.moduleName = moduleName;
                return this;
            }

            /**
             * OwnerAppId.
             */
            public Builder ownerAppId(String ownerAppId) {
                this.ownerAppId = ownerAppId;
                return this;
            }

            /**
             * OwnerUserId.
             */
            public Builder ownerUserId(String ownerUserId) {
                this.ownerUserId = ownerUserId;
                return this;
            }

            /**
             * Platform.
             */
            public Builder platform(String platform) {
                this.platform = platform;
                return this;
            }

            /**
             * PlatformVersion.
             */
            public Builder platformVersion(String platformVersion) {
                this.platformVersion = platformVersion;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
