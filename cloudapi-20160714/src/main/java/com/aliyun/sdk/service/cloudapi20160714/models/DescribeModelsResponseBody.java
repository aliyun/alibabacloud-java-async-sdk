// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeModelsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeModelsResponseBody</p>
 */
public class DescribeModelsResponseBody extends TeaModel {
    @NameInMap("ModelDetails")
    private ModelDetails modelDetails;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

        /**
         * The ID of the API group to which the model belongs.
         */
        public Builder modelDetails(ModelDetails modelDetails) {
            this.modelDetails = modelDetails;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The returned information about models. It is an array consisting of ModelDetail data.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The last modification time of the model.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeModelsResponseBody build() {
            return new DescribeModelsResponseBody(this);
        } 

    } 

    public static class ModelDetail extends TeaModel {
        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("Description")
        private String description;

        @NameInMap("GroupId")
        private String groupId;

        @NameInMap("ModelId")
        private String modelId;

        @NameInMap("ModelName")
        private String modelName;

        @NameInMap("ModelRef")
        private String modelRef;

        @NameInMap("ModifiedTime")
        private String modifiedTime;

        @NameInMap("Schema")
        private String schema;

        private ModelDetail(Builder builder) {
            this.createdTime = builder.createdTime;
            this.description = builder.description;
            this.groupId = builder.groupId;
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
            this.modelRef = builder.modelRef;
            this.modifiedTime = builder.modifiedTime;
            this.schema = builder.schema;
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

        public static final class Builder {
            private String createdTime; 
            private String description; 
            private String groupId; 
            private String modelId; 
            private String modelName; 
            private String modelRef; 
            private String modifiedTime; 
            private String schema; 

            /**
             * The URI of the model.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * The name of the model.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The definition of the model.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * *   Fuzzy queries are supported.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * The ID of the model.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            /**
             * Obtains the created models of an API group.
             */
            public Builder modelRef(String modelRef) {
                this.modelRef = modelRef;
                return this;
            }

            /**
             * The definition of the model description.
             */
            public Builder modifiedTime(String modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * The time when the model was created.
             */
            public Builder schema(String schema) {
                this.schema = schema;
                return this;
            }

            public ModelDetail build() {
                return new ModelDetail(this);
            } 

        } 

    }
    public static class ModelDetails extends TeaModel {
        @NameInMap("ModelDetail")
        private java.util.List < ModelDetail> modelDetail;

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
        public java.util.List < ModelDetail> getModelDetail() {
            return this.modelDetail;
        }

        public static final class Builder {
            private java.util.List < ModelDetail> modelDetail; 

            /**
             * ModelDetail.
             */
            public Builder modelDetail(java.util.List < ModelDetail> modelDetail) {
                this.modelDetail = modelDetail;
                return this;
            }

            public ModelDetails build() {
                return new ModelDetails(this);
            } 

        } 

    }
}
