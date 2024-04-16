// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModulesByPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListModulesByPageResponseBody</p>
 */
public class ListModulesByPageResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListModulesByPageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModulesByPageResponseBody create() {
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

        public ListModulesByPageResponseBody build() {
            return new ListModulesByPageResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
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

        @NameInMap("ModuleType")
        private String moduleType;

        @NameInMap("OwnerAppId")
        private String ownerAppId;

        @NameInMap("OwnerUserId")
        private String ownerUserId;

        @NameInMap("Platform")
        private String platform;

        @NameInMap("PlatformVersion")
        private String platformVersion;

        private Items(Builder builder) {
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.icon = builder.icon;
            this.latestPublishedCommit = builder.latestPublishedCommit;
            this.latestPublishedVersion = builder.latestPublishedVersion;
            this.minimumPlatformVersion = builder.minimumPlatformVersion;
            this.modifiedTime = builder.modifiedTime;
            this.moduleId = builder.moduleId;
            this.moduleName = builder.moduleName;
            this.moduleType = builder.moduleType;
            this.ownerAppId = builder.ownerAppId;
            this.ownerUserId = builder.ownerUserId;
            this.platform = builder.platform;
            this.platformVersion = builder.platformVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
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
         * @return moduleType
         */
        public String getModuleType() {
            return this.moduleType;
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
            private String moduleType; 
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
             * ModuleType.
             */
            public Builder moduleType(String moduleType) {
                this.moduleType = moduleType;
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

            public Items build() {
                return new Items(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("Items")
        private java.util.List < Items> items;

        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.items = builder.items;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
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

        /**
         * @return pageNumber
         */
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Items> items; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * Items.
             */
            public Builder items(java.util.List < Items> items) {
                this.items = items;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
