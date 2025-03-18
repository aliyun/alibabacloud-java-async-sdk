// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

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
 * {@link DescribeModelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelsResponseBody</p>
 */
public class DescribeModelsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ModelDetails")
    private ModelDetails modelDetails;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeModelsResponseBody(Builder builder) {
        this.modelDetails = builder.modelDetails;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeModelsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelDetails
     */
    public ModelDetails getModelDetails() {
        return this.modelDetails;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private ModelDetails modelDetails; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeModelsResponseBody model) {
            this.modelDetails = model.modelDetails;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The returned information about models. It is an array consisting of ModelDetail data.</p>
         */
        public Builder modelDetails(ModelDetails modelDetails) {
            this.modelDetails = modelDetails;
            return this;
        }

        /**
         * <p>The page number of the page to return.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>40306469-2FB5-417A-B723-AF1F4A4FA204</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeModelsResponseBody build() {
            return new DescribeModelsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelsResponseBody</p>
     */
    public static class TagInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TagInfo(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TagInfo create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(TagInfo model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>ENV</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>ST4</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TagInfo build() {
                return new TagInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TagInfo")
        private java.util.List<TagInfo> tagInfo;

        private Tags(Builder builder) {
            this.tagInfo = builder.tagInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tagInfo
         */
        public java.util.List<TagInfo> getTagInfo() {
            return this.tagInfo;
        }

        public static final class Builder {
            private java.util.List<TagInfo> tagInfo; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.tagInfo = model.tagInfo;
            } 

            /**
             * TagInfo.
             */
            public Builder tagInfo(java.util.List<TagInfo> tagInfo) {
                this.tagInfo = tagInfo;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelsResponseBody</p>
     */
    public static class ModelDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private String createdTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        @com.aliyun.core.annotation.NameInMap("ModelRef")
        private String modelRef;

        @com.aliyun.core.annotation.NameInMap("ModifiedTime")
        private String modifiedTime;

        @com.aliyun.core.annotation.NameInMap("Schema")
        private String schema;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private Tags tags;

        private ModelDetail(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.modelRef = builder.modelRef;
            this.modifiedTime = builder.modifiedTime;
            this.schema = builder.schema;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelDetail create() {
            return builder().build();
        }

        /**
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
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
         * @return modelRef
         */
        public String getModelRef() {
            return this.modelRef;
        }

        /**
         * @return modifiedTime
         */
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return schema
         */
        public String getSchema() {
            return this.schema;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String groupId; 
            private String modelId; 
            private String modelName; 
            private String modelRef; 
            private String modifiedTime; 
            private String schema; 
            private Tags tags; 

            private Builder() {
            } 

            private Builder(ModelDetail model) {
                this.createdTime = model.createdTime;
                this.description = model.description;
                this.groupId = model.groupId;
                this.modelId = model.modelId;
                this.modelName = model.modelName;
                this.modelRef = model.modelRef;
                this.modifiedTime = model.modifiedTime;
                this.schema = model.schema;
                this.tags = model.tags;
            } 

            /**
             * <p>The time when the model was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-29T11:07:48Z</p>
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * <p>The description of the model definition.</p>
             * 
             * <strong>example:</strong>
             * <p>Model Description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the API group to which the model belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>30e792398d6c4569b04c0e53a3494381</p>
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>The ID of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>766c0b9538a04bdf974953b5576783ba</p>
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * <p>The name of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * <p>The URI of the model.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://apigateway.aliyun.com/models/30e792398d6c4569b04c0e53a3494381/766c0b9538a04bdf974953b5576783ba">https://apigateway.aliyun.com/models/30e792398d6c4569b04c0e53a3494381/766c0b9538a04bdf974953b5576783ba</a></p>
             */
            public Builder modelRef(String modelRef) {
                this.modelRef = modelRef;
                return this;
            }

            /**
             * <p>The time when the model was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2019-01-29T11:07:48Z</p>
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * <p>The definition of the model.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;id&quot;:{&quot;format&quot;:&quot;int64&quot;,&quot;maximum&quot;:100,&quot;exclusiveMaximum&quot;:true,&quot;type&quot;:&quot;integer&quot;},&quot;name&quot;:{&quot;maxLength&quot;:10,&quot;type&quot;:&quot;string&quot;}}}</p>
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            /**
             * <p>The tags of the model.</p>
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public ModelDetail build() {
                return new ModelDetail(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeModelsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeModelsResponseBody</p>
     */
    public static class ModelDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ModelDetail")
        private java.util.List<ModelDetail> modelDetail;

        private ModelDetails(Builder builder) {
            this.modelDetail = builder.modelDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ModelDetails create() {
            return builder().build();
        }

        /**
         * @return modelDetail
         */
        public java.util.List<ModelDetail> getModelDetail() {
            return this.modelDetail;
        }

        public static final class Builder {
            private java.util.List<ModelDetail> modelDetail; 

            private Builder() {
            } 

            private Builder(ModelDetails model) {
                this.modelDetail = model.modelDetail;
            } 

            /**
             * ModelDetail.
             */
            public Builder modelDetail(java.util.List<ModelDetail> modelDetail) {
                this.modelDetail = modelDetail;
                return this;
            }

            public ModelDetails build() {
                return new ModelDetails(this);
            } 

        } 

    }
}
