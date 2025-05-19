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
 * {@link CreateTableMetaRequest} extends {@link RequestModel}
 *
 * <p>CreateTableMetaRequest</p>
 */
public class CreateTableMetaRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Fields")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Fields> fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Module")
    @com.aliyun.core.annotation.Validation(required = true)
    private String module;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    private CreateTableMetaRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.description = builder.description;
        this.fields = builder.fields;
        this.instanceId = builder.instanceId;
        this.module = builder.module;
        this.name = builder.name;
        this.resourceId = builder.resourceId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTableMetaRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
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
     * @return module
     */
    public String getModule() {
        return this.module;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<CreateTableMetaRequest, Builder> {
        private String regionId; 
        private String description; 
        private java.util.List<Fields> fields; 
        private String instanceId; 
        private String module; 
        private String name; 
        private String resourceId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(CreateTableMetaRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.description = request.description;
            this.fields = request.fields;
            this.instanceId = request.instanceId;
            this.module = request.module;
            this.name = request.name;
            this.resourceId = request.resourceId;
            this.tableName = request.tableName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>this is a test table</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ABTest</p>
         */
        public Builder module(String module) {
            this.putBodyParameter("Module", module);
            this.module = module;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table_test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>reso-2s416t146ffjc3yefx</p>
         */
        public Builder resourceId(String resourceId) {
            this.putBodyParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table_mysql</p>
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public CreateTableMetaRequest build() {
            return new CreateTableMetaRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateTableMetaRequest} extends {@link TeaModel}
     *
     * <p>CreateTableMetaRequest</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DataType")
        private String dataType;

        @com.aliyun.core.annotation.NameInMap("IsDimensionField")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean isDimensionField;

        @com.aliyun.core.annotation.NameInMap("IsPartitionField")
        @com.aliyun.core.annotation.Validation(required = true)
        private String isPartitionField;

        @com.aliyun.core.annotation.NameInMap("Meaning")
        @com.aliyun.core.annotation.Validation(required = true)
        private String meaning;

        @com.aliyun.core.annotation.NameInMap("Name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Fields(Builder builder) {
            this.dataType = builder.dataType;
            this.isDimensionField = builder.isDimensionField;
            this.isPartitionField = builder.isPartitionField;
            this.meaning = builder.meaning;
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fields create() {
            return builder().build();
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        /**
         * @return isDimensionField
         */
        public Boolean getIsDimensionField() {
            return this.isDimensionField;
        }

        /**
         * @return isPartitionField
         */
        public String getIsPartitionField() {
            return this.isPartitionField;
        }

        /**
         * @return meaning
         */
        public String getMeaning() {
            return this.meaning;
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

        public static final class Builder {
            private String dataType; 
            private Boolean isDimensionField; 
            private String isPartitionField; 
            private String meaning; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.dataType = model.dataType;
                this.isDimensionField = model.isDimensionField;
                this.isPartitionField = model.isPartitionField;
                this.meaning = model.meaning;
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * DataType.
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isDimensionField(Boolean isDimensionField) {
                this.isDimensionField = isDimensionField;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder isPartitionField(String isPartitionField) {
                this.isPartitionField = isPartitionField;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>this is gender of people</p>
             */
            public Builder meaning(String meaning) {
                this.meaning = meaning;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>gender</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BIGINT</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
