// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAppResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateAppResponseBody</p>
 */
public class UpdateAppResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateAppResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAppResponseBody create() {
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

        public UpdateAppResponseBody build() {
            return new UpdateAppResponseBody(this);
        } 

    } 

    public static class Categories extends TeaModel {
        @NameInMap("CategoryId")
        private String categoryId;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("ParentCategoryId")
        private String parentCategoryId;

        private Categories(Builder builder) {
            this.categoryId = builder.categoryId;
            this.categoryName = builder.categoryName;
            this.parentCategoryId = builder.parentCategoryId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Categories create() {
            return builder().build();
        }

        /**
         * @return categoryId
         */
        public String getCategoryId() {
            return this.categoryId;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return parentCategoryId
         */
        public String getParentCategoryId() {
            return this.parentCategoryId;
        }

        public static final class Builder {
            private String categoryId; 
            private String categoryName; 
            private String parentCategoryId; 

            /**
             * CategoryId.
             */
            public Builder categoryId(String categoryId) {
                this.categoryId = categoryId;
                return this;
            }

            /**
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * ParentCategoryId.
             */
            public Builder parentCategoryId(String parentCategoryId) {
                this.parentCategoryId = parentCategoryId;
                return this;
            }

            public Categories build() {
                return new Categories(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppStatus")
        private String appStatus;

        @NameInMap("AppType")
        private String appType;

        @NameInMap("Categories")
        private java.util.List < Categories> categories;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Icon")
        private String icon;

        @NameInMap("IsTemplate")
        private Boolean isTemplate;

        @NameInMap("LastEditTime")
        private String lastEditTime;

        @NameInMap("MainModuleId")
        private String mainModuleId;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("SchemaVersion")
        private String schemaVersion;

        @NameInMap("Source")
        private String source;

        private Data(Builder builder) {
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.appStatus = builder.appStatus;
            this.appType = builder.appType;
            this.categories = builder.categories;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.icon = builder.icon;
            this.isTemplate = builder.isTemplate;
            this.lastEditTime = builder.lastEditTime;
            this.mainModuleId = builder.mainModuleId;
            this.modifiedTime = builder.modifiedTime;
            this.schemaVersion = builder.schemaVersion;
            this.source = builder.source;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appStatus
         */
        public String getAppStatus() {
            return this.appStatus;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return categories
         */
        public java.util.List < Categories> getCategories() {
            return this.categories;
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
         * @return isTemplate
         */
        public Boolean getIsTemplate() {
            return this.isTemplate;
        }

        /**
         * @return lastEditTime
         */
        public String getLastEditTime() {
            return this.lastEditTime;
        }

        /**
         * @return mainModuleId
         */
        public String getMainModuleId() {
            return this.mainModuleId;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return schemaVersion
         */
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        /**
         * @return source
         */
        public String getSource() {
            return this.source;
        }

        public static final class Builder {
            private String appId; 
            private String appName; 
            private String appStatus; 
            private String appType; 
            private java.util.List < Categories> categories; 
            private String createTime; 
            private String description; 
            private String icon; 
            private Boolean isTemplate; 
            private String lastEditTime; 
            private String mainModuleId; 
            private String modifiedTime; 
            private String schemaVersion; 
            private String source; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * AppStatus.
             */
            public Builder appStatus(String appStatus) {
                this.appStatus = appStatus;
                return this;
            }

            /**
             * AppType.
             */
            public Builder appType(String appType) {
                this.appType = appType;
                return this;
            }

            /**
             * Categories.
             */
            public Builder categories(java.util.List < Categories> categories) {
                this.categories = categories;
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
             * IsTemplate.
             */
            public Builder isTemplate(Boolean isTemplate) {
                this.isTemplate = isTemplate;
                return this;
            }

            /**
             * LastEditTime.
             */
            public Builder lastEditTime(String lastEditTime) {
                this.lastEditTime = lastEditTime;
                return this;
            }

            /**
             * MainModuleId.
             */
            public Builder mainModuleId(String mainModuleId) {
                this.mainModuleId = mainModuleId;
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
             * SchemaVersion.
             */
            public Builder schemaVersion(String schemaVersion) {
                this.schemaVersion = schemaVersion;
                return this;
            }

            /**
             * Source.
             */
            public Builder source(String source) {
                this.source = source;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
