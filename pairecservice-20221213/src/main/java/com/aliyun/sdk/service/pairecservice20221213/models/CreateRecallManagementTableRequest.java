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
 * {@link CreateRecallManagementTableRequest} extends {@link RequestModel}
 *
 * <p>CreateRecallManagementTableRequest</p>
 */
public class CreateRecallManagementTableRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataSource")
    private String dataSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableDataSizeFluctuationThreshold")
    private Boolean enableDataSizeFluctuationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableRowCountFluctuationThreshold")
    private Boolean enableRowCountFluctuationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.List<Fields> fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxDataSizeFluctuationThreshold")
    private Long maxDataSizeFluctuationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxRowCountFluctuationThreshold")
    private Long maxRowCountFluctuationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxcomputeProjectName")
    private String maxcomputeProjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxcomputeSchema")
    private String maxcomputeSchema;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxcomputeTableName")
    private String maxcomputeTableName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinDataSizeFluctuationThreshold")
    private Long minDataSizeFluctuationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MinRowCountFluctuationThreshold")
    private Long minRowCountFluctuationThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecallType")
    private String recallType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private CreateRecallManagementTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.dataSource = builder.dataSource;
        this.description = builder.description;
        this.enableDataSizeFluctuationThreshold = builder.enableDataSizeFluctuationThreshold;
        this.enableRowCountFluctuationThreshold = builder.enableRowCountFluctuationThreshold;
        this.fields = builder.fields;
        this.instanceId = builder.instanceId;
        this.maxDataSizeFluctuationThreshold = builder.maxDataSizeFluctuationThreshold;
        this.maxRowCountFluctuationThreshold = builder.maxRowCountFluctuationThreshold;
        this.maxcomputeProjectName = builder.maxcomputeProjectName;
        this.maxcomputeSchema = builder.maxcomputeSchema;
        this.maxcomputeTableName = builder.maxcomputeTableName;
        this.minDataSizeFluctuationThreshold = builder.minDataSizeFluctuationThreshold;
        this.minRowCountFluctuationThreshold = builder.minRowCountFluctuationThreshold;
        this.name = builder.name;
        this.recallType = builder.recallType;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRecallManagementTableRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
    public java.util.List<Fields> getFields() {
        return this.fields;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return maxDataSizeFluctuationThreshold
     */
    public Long getMaxDataSizeFluctuationThreshold() {
        return this.maxDataSizeFluctuationThreshold;
    }

    /**
     * @return maxRowCountFluctuationThreshold
     */
    public Long getMaxRowCountFluctuationThreshold() {
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
    public Long getMinDataSizeFluctuationThreshold() {
        return this.minDataSizeFluctuationThreshold;
    }

    /**
     * @return minRowCountFluctuationThreshold
     */
    public Long getMinRowCountFluctuationThreshold() {
        return this.minRowCountFluctuationThreshold;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recallType
     */
    public String getRecallType() {
        return this.recallType;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateRecallManagementTableRequest, Builder> {
        private String regionId; 
        private String config; 
        private String dataSource; 
        private String description; 
        private Boolean enableDataSizeFluctuationThreshold; 
        private Boolean enableRowCountFluctuationThreshold; 
        private java.util.List<Fields> fields; 
        private String instanceId; 
        private Long maxDataSizeFluctuationThreshold; 
        private Long maxRowCountFluctuationThreshold; 
        private String maxcomputeProjectName; 
        private String maxcomputeSchema; 
        private String maxcomputeTableName; 
        private Long minDataSizeFluctuationThreshold; 
        private Long minRowCountFluctuationThreshold; 
        private String name; 
        private String recallType; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateRecallManagementTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.config = request.config;
            this.dataSource = request.dataSource;
            this.description = request.description;
            this.enableDataSizeFluctuationThreshold = request.enableDataSizeFluctuationThreshold;
            this.enableRowCountFluctuationThreshold = request.enableRowCountFluctuationThreshold;
            this.fields = request.fields;
            this.instanceId = request.instanceId;
            this.maxDataSizeFluctuationThreshold = request.maxDataSizeFluctuationThreshold;
            this.maxRowCountFluctuationThreshold = request.maxRowCountFluctuationThreshold;
            this.maxcomputeProjectName = request.maxcomputeProjectName;
            this.maxcomputeSchema = request.maxcomputeSchema;
            this.maxcomputeTableName = request.maxcomputeTableName;
            this.minDataSizeFluctuationThreshold = request.minDataSizeFluctuationThreshold;
            this.minRowCountFluctuationThreshold = request.minRowCountFluctuationThreshold;
            this.name = request.name;
            this.recallType = request.recallType;
            this.type = request.type;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * DataSource.
         */
        public Builder dataSource(String dataSource) {
            this.putBodyParameter("DataSource", dataSource);
            this.dataSource = dataSource;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * EnableDataSizeFluctuationThreshold.
         */
        public Builder enableDataSizeFluctuationThreshold(Boolean enableDataSizeFluctuationThreshold) {
            this.putBodyParameter("EnableDataSizeFluctuationThreshold", enableDataSizeFluctuationThreshold);
            this.enableDataSizeFluctuationThreshold = enableDataSizeFluctuationThreshold;
            return this;
        }

        /**
         * EnableRowCountFluctuationThreshold.
         */
        public Builder enableRowCountFluctuationThreshold(Boolean enableRowCountFluctuationThreshold) {
            this.putBodyParameter("EnableRowCountFluctuationThreshold", enableRowCountFluctuationThreshold);
            this.enableRowCountFluctuationThreshold = enableRowCountFluctuationThreshold;
            return this;
        }

        /**
         * Fields.
         */
        public Builder fields(java.util.List<Fields> fields) {
            this.putBodyParameter("Fields", fields);
            this.fields = fields;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-test123</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MaxDataSizeFluctuationThreshold.
         */
        public Builder maxDataSizeFluctuationThreshold(Long maxDataSizeFluctuationThreshold) {
            this.putBodyParameter("MaxDataSizeFluctuationThreshold", maxDataSizeFluctuationThreshold);
            this.maxDataSizeFluctuationThreshold = maxDataSizeFluctuationThreshold;
            return this;
        }

        /**
         * MaxRowCountFluctuationThreshold.
         */
        public Builder maxRowCountFluctuationThreshold(Long maxRowCountFluctuationThreshold) {
            this.putBodyParameter("MaxRowCountFluctuationThreshold", maxRowCountFluctuationThreshold);
            this.maxRowCountFluctuationThreshold = maxRowCountFluctuationThreshold;
            return this;
        }

        /**
         * MaxcomputeProjectName.
         */
        public Builder maxcomputeProjectName(String maxcomputeProjectName) {
            this.putBodyParameter("MaxcomputeProjectName", maxcomputeProjectName);
            this.maxcomputeProjectName = maxcomputeProjectName;
            return this;
        }

        /**
         * MaxcomputeSchema.
         */
        public Builder maxcomputeSchema(String maxcomputeSchema) {
            this.putBodyParameter("MaxcomputeSchema", maxcomputeSchema);
            this.maxcomputeSchema = maxcomputeSchema;
            return this;
        }

        /**
         * MaxcomputeTableName.
         */
        public Builder maxcomputeTableName(String maxcomputeTableName) {
            this.putBodyParameter("MaxcomputeTableName", maxcomputeTableName);
            this.maxcomputeTableName = maxcomputeTableName;
            return this;
        }

        /**
         * MinDataSizeFluctuationThreshold.
         */
        public Builder minDataSizeFluctuationThreshold(Long minDataSizeFluctuationThreshold) {
            this.putBodyParameter("MinDataSizeFluctuationThreshold", minDataSizeFluctuationThreshold);
            this.minDataSizeFluctuationThreshold = minDataSizeFluctuationThreshold;
            return this;
        }

        /**
         * MinRowCountFluctuationThreshold.
         */
        public Builder minRowCountFluctuationThreshold(Long minRowCountFluctuationThreshold) {
            this.putBodyParameter("MinRowCountFluctuationThreshold", minRowCountFluctuationThreshold);
            this.minRowCountFluctuationThreshold = minRowCountFluctuationThreshold;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RecallType.
         */
        public Builder recallType(String recallType) {
            this.putBodyParameter("RecallType", recallType);
            this.recallType = recallType;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateRecallManagementTableRequest build() {
            return new CreateRecallManagementTableRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateRecallManagementTableRequest} extends {@link TeaModel}
     *
     * <p>CreateRecallManagementTableRequest</p>
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
