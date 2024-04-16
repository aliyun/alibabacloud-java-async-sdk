// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListModelsByPageResponseBody} extends {@link TeaModel}
 *
 * <p>ListModelsByPageResponseBody</p>
 */
public class ListModelsByPageResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private ListModelsByPageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelsByPageResponseBody create() {
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

        public ListModelsByPageResponseBody build() {
            return new ListModelsByPageResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("Attributes")
        private java.util.List < java.util.Map<String, String>> attributes;

        @NameInMap("Content")
        private java.util.Map < String, String > content;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private String id;

        @NameInMap("LinkModelId")
        private String linkModelId;

        @NameInMap("LinkModuleId")
        private String linkModuleId;

        @NameInMap("Linked")
        private Boolean linked;

        @NameInMap("ModelId")
        private String modelId;

        @NameInMap("ModelName")
        private String modelName;

        @NameInMap("ModelStatus")
        private String modelStatus;

        @NameInMap("ModelType")
        private String modelType;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("ModuleId")
        private String moduleId;

        @NameInMap("Props")
        private java.util.Map < String, String > props;

        @NameInMap("Revision")
        private Integer revision;

        @NameInMap("SchemaVersion")
        private String schemaVersion;

        @NameInMap("SubType")
        private String subType;

        @NameInMap("Visibility")
        private String visibility;

        private Items(Builder builder) {
            this.appId = builder.appId;
            this.attributes = builder.attributes;
            this.content = builder.content;
            this.createTime = builder.createTime;
            this.description = builder.description;
            this.id = builder.id;
            this.linkModelId = builder.linkModelId;
            this.linkModuleId = builder.linkModuleId;
            this.linked = builder.linked;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.modelStatus = builder.modelStatus;
            this.modelType = builder.modelType;
            this.modifiedTime = builder.modifiedTime;
            this.moduleId = builder.moduleId;
            this.props = builder.props;
            this.revision = builder.revision;
            this.schemaVersion = builder.schemaVersion;
            this.subType = builder.subType;
            this.visibility = builder.visibility;
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
         * @return attributes
         */
        public java.util.List < java.util.Map<String, String>> getAttributes() {
            return this.attributes;
        }

        /**
         * @return content
         */
        public java.util.Map < String, String > getContent() {
            return this.content;
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
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return linkModelId
         */
        public String getLinkModelId() {
            return this.linkModelId;
        }

        /**
         * @return linkModuleId
         */
        public String getLinkModuleId() {
            return this.linkModuleId;
        }

        /**
         * @return linked
         */
        public Boolean getLinked() {
            return this.linked;
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        /**
         * @return modelStatus
         */
        public String getModelStatus() {
            return this.modelStatus;
        }

        /**
         * @return modelType
         */
        public String getModelType() {
            return this.modelType;
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
         * @return props
         */
        public java.util.Map < String, String > getProps() {
            return this.props;
        }

        /**
         * @return revision
         */
        public Integer getRevision() {
            return this.revision;
        }

        /**
         * @return schemaVersion
         */
        public String getSchemaVersion() {
            return this.schemaVersion;
        }

        /**
         * @return subType
         */
        public String getSubType() {
            return this.subType;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        public static final class Builder {
            private String appId; 
            private java.util.List < java.util.Map<String, String>> attributes; 
            private java.util.Map < String, String > content; 
            private String createTime; 
            private String description; 
            private String id; 
            private String linkModelId; 
            private String linkModuleId; 
            private Boolean linked; 
            private String modelId; 
            private String modelName; 
            private String modelStatus; 
            private String modelType; 
            private String modifiedTime; 
            private String moduleId; 
            private java.util.Map < String, String > props; 
            private Integer revision; 
            private String schemaVersion; 
            private String subType; 
            private String visibility; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List < java.util.Map<String, String>> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(java.util.Map < String, String > content) {
                this.content = content;
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
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * LinkModelId.
             */
            public Builder linkModelId(String linkModelId) {
                this.linkModelId = linkModelId;
                return this;
            }

            /**
             * LinkModuleId.
             */
            public Builder linkModuleId(String linkModuleId) {
                this.linkModuleId = linkModuleId;
                return this;
            }

            /**
             * Linked.
             */
            public Builder linked(Boolean linked) {
                this.linked = linked;
                return this;
            }

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * ModelStatus.
             */
            public Builder modelStatus(String modelStatus) {
                this.modelStatus = modelStatus;
                return this;
            }

            /**
             * ModelType.
             */
            public Builder modelType(String modelType) {
                this.modelType = modelType;
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
             * Props.
             */
            public Builder props(java.util.Map < String, String > props) {
                this.props = props;
                return this;
            }

            /**
             * Revision.
             */
            public Builder revision(Integer revision) {
                this.revision = revision;
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
             * SubType.
             */
            public Builder subType(String subType) {
                this.subType = subType;
                return this;
            }

            /**
             * Visibility.
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
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
