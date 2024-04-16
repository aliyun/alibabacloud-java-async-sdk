// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAppTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAppTemplatesResponseBody</p>
 */
public class ListAppTemplatesResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListAppTemplatesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppTemplatesResponseBody create() {
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

        public ListAppTemplatesResponseBody build() {
            return new ListAppTemplatesResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("AppType")
        private String appType;

        @NameInMap("CategoryName")
        private String categoryName;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Icon")
        private String icon;

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

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateType")
        private String templateType;

        private Items(Builder builder) {
            this.appName = builder.appName;
            this.appType = builder.appType;
            this.categoryName = builder.categoryName;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.icon = builder.icon;
            this.lastEditTime = builder.lastEditTime;
            this.mainModuleId = builder.mainModuleId;
            this.modifiedTime = builder.modifiedTime;
            this.schemaVersion = builder.schemaVersion;
            this.source = builder.source;
            this.templateId = builder.templateId;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return appType
         */
        public String getAppType() {
            return this.appType;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
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

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private String appName; 
            private String appType; 
            private String categoryName; 
            private String createTime; 
            private String description; 
            private String icon; 
            private String lastEditTime; 
            private String mainModuleId; 
            private String modifiedTime; 
            private String schemaVersion; 
            private String source; 
            private String templateId; 
            private String templateType; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * CategoryName.
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
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

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
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
