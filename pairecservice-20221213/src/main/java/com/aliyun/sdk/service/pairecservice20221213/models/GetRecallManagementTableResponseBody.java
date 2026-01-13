// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link GetRecallManagementTableResponseBody} extends {@link TeaModel}
 *
 * <p>GetRecallManagementTableResponseBody</p>
 */
public class GetRecallManagementTableResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CanDelete")
    private Boolean canDelete;

    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("DataSource")
    private String dataSource;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EnableDataSizeFluctuationThreshold")
    private Boolean enableDataSizeFluctuationThreshold;

    @com.aliyun.core.annotation.NameInMap("EnableRowCountFluctuationThreshold")
    private Boolean enableRowCountFluctuationThreshold;

    @com.aliyun.core.annotation.NameInMap("Fields")
    private Fields fields;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("IndexEffectiveTime")
    private String indexEffectiveTime;

    @com.aliyun.core.annotation.NameInMap("IndexVersionId")
    private String indexVersionId;

    @com.aliyun.core.annotation.NameInMap("MaxDataSizeFluctuationThreshold")
    private Integer maxDataSizeFluctuationThreshold;

    @com.aliyun.core.annotation.NameInMap("MaxRowCountFluctuationThreshold")
    private Integer maxRowCountFluctuationThreshold;

    @com.aliyun.core.annotation.NameInMap("MaxcomputeProjectName")
    private String maxcomputeProjectName;

    @com.aliyun.core.annotation.NameInMap("MaxcomputeSchema")
    private String maxcomputeSchema;

    @com.aliyun.core.annotation.NameInMap("MaxcomputeTableName")
    private String maxcomputeTableName;

    @com.aliyun.core.annotation.NameInMap("MinDataSizeFluctuationThreshold")
    private Integer minDataSizeFluctuationThreshold;

    @com.aliyun.core.annotation.NameInMap("MinRowCountFluctuationThreshold")
    private Integer minRowCountFluctuationThreshold;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("PartitionFields")
    private String partitionFields;

    @com.aliyun.core.annotation.NameInMap("RecallManagementTableId")
    private String recallManagementTableId;

    @com.aliyun.core.annotation.NameInMap("RecallType")
    private String recallType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetRecallManagementTableResponseBody(Builder builder) {
        this.canDelete = builder.canDelete;
        this.config = builder.config;
        this.dataSource = builder.dataSource;
        this.description = builder.description;
        this.enableDataSizeFluctuationThreshold = builder.enableDataSizeFluctuationThreshold;
        this.enableRowCountFluctuationThreshold = builder.enableRowCountFluctuationThreshold;
        this.fields = builder.fields;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.indexEffectiveTime = builder.indexEffectiveTime;
        this.indexVersionId = builder.indexVersionId;
        this.maxDataSizeFluctuationThreshold = builder.maxDataSizeFluctuationThreshold;
        this.maxRowCountFluctuationThreshold = builder.maxRowCountFluctuationThreshold;
        this.maxcomputeProjectName = builder.maxcomputeProjectName;
        this.maxcomputeSchema = builder.maxcomputeSchema;
        this.maxcomputeTableName = builder.maxcomputeTableName;
        this.minDataSizeFluctuationThreshold = builder.minDataSizeFluctuationThreshold;
        this.minRowCountFluctuationThreshold = builder.minRowCountFluctuationThreshold;
        this.name = builder.name;
        this.partitionFields = builder.partitionFields;
        this.recallManagementTableId = builder.recallManagementTableId;
        this.recallType = builder.recallType;
        this.requestId = builder.requestId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRecallManagementTableResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return canDelete
     */
    public Boolean getCanDelete() {
        return this.canDelete;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return dataSource
     */
    public String getDataSource() {
        return this.dataSource;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return enableDataSizeFluctuationThreshold
     */
    public Boolean getEnableDataSizeFluctuationThreshold() {
        return this.enableDataSizeFluctuationThreshold;
    }

    /**
     * @return enableRowCountFluctuationThreshold
     */
    public Boolean getEnableRowCountFluctuationThreshold() {
        return this.enableRowCountFluctuationThreshold;
    }

    /**
     * @return fields
     */
    public Fields getFields() {
        return this.fields;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return indexEffectiveTime
     */
    public String getIndexEffectiveTime() {
        return this.indexEffectiveTime;
    }

    /**
     * @return indexVersionId
     */
    public String getIndexVersionId() {
        return this.indexVersionId;
    }

    /**
     * @return maxDataSizeFluctuationThreshold
     */
    public Integer getMaxDataSizeFluctuationThreshold() {
        return this.maxDataSizeFluctuationThreshold;
    }

    /**
     * @return maxRowCountFluctuationThreshold
     */
    public Integer getMaxRowCountFluctuationThreshold() {
        return this.maxRowCountFluctuationThreshold;
    }

    /**
     * @return maxcomputeProjectName
     */
    public String getMaxcomputeProjectName() {
        return this.maxcomputeProjectName;
    }

    /**
     * @return maxcomputeSchema
     */
    public String getMaxcomputeSchema() {
        return this.maxcomputeSchema;
    }

    /**
     * @return maxcomputeTableName
     */
    public String getMaxcomputeTableName() {
        return this.maxcomputeTableName;
    }

    /**
     * @return minDataSizeFluctuationThreshold
     */
    public Integer getMinDataSizeFluctuationThreshold() {
        return this.minDataSizeFluctuationThreshold;
    }

    /**
     * @return minRowCountFluctuationThreshold
     */
    public Integer getMinRowCountFluctuationThreshold() {
        return this.minRowCountFluctuationThreshold;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return partitionFields
     */
    public String getPartitionFields() {
        return this.partitionFields;
    }

    /**
     * @return recallManagementTableId
     */
    public String getRecallManagementTableId() {
        return this.recallManagementTableId;
    }

    /**
     * @return recallType
     */
    public String getRecallType() {
        return this.recallType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private Boolean canDelete; 
        private String config; 
        private String dataSource; 
        private String description; 
        private Boolean enableDataSizeFluctuationThreshold; 
        private Boolean enableRowCountFluctuationThreshold; 
        private Fields fields; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String indexEffectiveTime; 
        private String indexVersionId; 
        private Integer maxDataSizeFluctuationThreshold; 
        private Integer maxRowCountFluctuationThreshold; 
        private String maxcomputeProjectName; 
        private String maxcomputeSchema; 
        private String maxcomputeTableName; 
        private Integer minDataSizeFluctuationThreshold; 
        private Integer minRowCountFluctuationThreshold; 
        private String name; 
        private String partitionFields; 
        private String recallManagementTableId; 
        private String recallType; 
        private String requestId; 
        private String type; 

        private Builder() {
        } 

        private Builder(GetRecallManagementTableResponseBody model) {
            this.canDelete = model.canDelete;
            this.config = model.config;
            this.dataSource = model.dataSource;
            this.description = model.description;
            this.enableDataSizeFluctuationThreshold = model.enableDataSizeFluctuationThreshold;
            this.enableRowCountFluctuationThreshold = model.enableRowCountFluctuationThreshold;
            this.fields = model.fields;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.indexEffectiveTime = model.indexEffectiveTime;
            this.indexVersionId = model.indexVersionId;
            this.maxDataSizeFluctuationThreshold = model.maxDataSizeFluctuationThreshold;
            this.maxRowCountFluctuationThreshold = model.maxRowCountFluctuationThreshold;
            this.maxcomputeProjectName = model.maxcomputeProjectName;
            this.maxcomputeSchema = model.maxcomputeSchema;
            this.maxcomputeTableName = model.maxcomputeTableName;
            this.minDataSizeFluctuationThreshold = model.minDataSizeFluctuationThreshold;
            this.minRowCountFluctuationThreshold = model.minRowCountFluctuationThreshold;
            this.name = model.name;
            this.partitionFields = model.partitionFields;
            this.recallManagementTableId = model.recallManagementTableId;
            this.recallType = model.recallType;
            this.requestId = model.requestId;
            this.type = model.type;
        } 

        /**
         * CanDelete.
         */
        public Builder canDelete(Boolean canDelete) {
            this.canDelete = canDelete;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * DataSource.
         */
        public Builder dataSource(String dataSource) {
            this.dataSource = dataSource;
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
         * EnableDataSizeFluctuationThreshold.
         */
        public Builder enableDataSizeFluctuationThreshold(Boolean enableDataSizeFluctuationThreshold) {
            this.enableDataSizeFluctuationThreshold = enableDataSizeFluctuationThreshold;
            return this;
        }

        /**
         * EnableRowCountFluctuationThreshold.
         */
        public Builder enableRowCountFluctuationThreshold(Boolean enableRowCountFluctuationThreshold) {
            this.enableRowCountFluctuationThreshold = enableRowCountFluctuationThreshold;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(Fields fields) {
            this.fields = fields;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * IndexEffectiveTime.
         */
        public Builder indexEffectiveTime(String indexEffectiveTime) {
            this.indexEffectiveTime = indexEffectiveTime;
            return this;
        }

        /**
         * IndexVersionId.
         */
        public Builder indexVersionId(String indexVersionId) {
            this.indexVersionId = indexVersionId;
            return this;
        }

        /**
         * MaxDataSizeFluctuationThreshold.
         */
        public Builder maxDataSizeFluctuationThreshold(Integer maxDataSizeFluctuationThreshold) {
            this.maxDataSizeFluctuationThreshold = maxDataSizeFluctuationThreshold;
            return this;
        }

        /**
         * MaxRowCountFluctuationThreshold.
         */
        public Builder maxRowCountFluctuationThreshold(Integer maxRowCountFluctuationThreshold) {
            this.maxRowCountFluctuationThreshold = maxRowCountFluctuationThreshold;
            return this;
        }

        /**
         * MaxcomputeProjectName.
         */
        public Builder maxcomputeProjectName(String maxcomputeProjectName) {
            this.maxcomputeProjectName = maxcomputeProjectName;
            return this;
        }

        /**
         * <p>maxcompute schema。</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder maxcomputeSchema(String maxcomputeSchema) {
            this.maxcomputeSchema = maxcomputeSchema;
            return this;
        }

        /**
         * MaxcomputeTableName.
         */
        public Builder maxcomputeTableName(String maxcomputeTableName) {
            this.maxcomputeTableName = maxcomputeTableName;
            return this;
        }

        /**
         * MinDataSizeFluctuationThreshold.
         */
        public Builder minDataSizeFluctuationThreshold(Integer minDataSizeFluctuationThreshold) {
            this.minDataSizeFluctuationThreshold = minDataSizeFluctuationThreshold;
            return this;
        }

        /**
         * MinRowCountFluctuationThreshold.
         */
        public Builder minRowCountFluctuationThreshold(Integer minRowCountFluctuationThreshold) {
            this.minRowCountFluctuationThreshold = minRowCountFluctuationThreshold;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * PartitionFields.
         */
        public Builder partitionFields(String partitionFields) {
            this.partitionFields = partitionFields;
            return this;
        }

        /**
         * RecallManagementTableId.
         */
        public Builder recallManagementTableId(String recallManagementTableId) {
            this.recallManagementTableId = recallManagementTableId;
            return this;
        }

        /**
         * RecallType.
         */
        public Builder recallType(String recallType) {
            this.recallType = recallType;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetRecallManagementTableResponseBody build() {
            return new GetRecallManagementTableResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetRecallManagementTableResponseBody} extends {@link TeaModel}
     *
     * <p>GetRecallManagementTableResponseBody</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List<String> attributes;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("VectorDimension")
        private Integer vectorDimension;

        @com.aliyun.core.annotation.NameInMap("VectorMetricType")
        private String vectorMetricType;

        private Fields(Builder builder) {
            this.attributes = builder.attributes;
            this.name = builder.name;
            this.type = builder.type;
            this.vectorDimension = builder.vectorDimension;
            this.vectorMetricType = builder.vectorMetricType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return attributes
         */
        public java.util.List<String> getAttributes() {
            return this.attributes;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return vectorDimension
         */
        public Integer getVectorDimension() {
            return this.vectorDimension;
        }

        /**
         * @return vectorMetricType
         */
        public String getVectorMetricType() {
            return this.vectorMetricType;
        }

        public static final class Builder {
            private java.util.List<String> attributes; 
            private String name; 
            private String type; 
            private Integer vectorDimension; 
            private String vectorMetricType; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.attributes = model.attributes;
                this.name = model.name;
                this.type = model.type;
                this.vectorDimension = model.vectorDimension;
                this.vectorMetricType = model.vectorMetricType;
            } 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List<String> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * VectorDimension.
             */
            public Builder vectorDimension(Integer vectorDimension) {
                this.vectorDimension = vectorDimension;
                return this;
            }

            /**
             * VectorMetricType.
             */
            public Builder vectorMetricType(String vectorMetricType) {
                this.vectorMetricType = vectorMetricType;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
