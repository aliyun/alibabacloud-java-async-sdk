// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link CreateFeatureViewRequest} extends {@link RequestModel}
 *
 * <p>CreateFeatureViewRequest</p>
 */
public class CreateFeatureViewRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureEntityId")
    private String featureEntityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Fields")
    private java.util.List<Fields> fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegisterDatasourceId")
    private String registerDatasourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegisterTable")
    private String registerTable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SyncOnlineTable")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean syncOnlineTable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TTL")
    private Integer TTL;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List<String> tags;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WriteMethod")
    @com.aliyun.core.annotation.Validation(required = true)
    private String writeMethod;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WriteToFeatureDB")
    private Boolean writeToFeatureDB;

    private CreateFeatureViewRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.config = builder.config;
        this.featureEntityId = builder.featureEntityId;
        this.fields = builder.fields;
        this.name = builder.name;
        this.projectId = builder.projectId;
        this.registerDatasourceId = builder.registerDatasourceId;
        this.registerTable = builder.registerTable;
        this.syncOnlineTable = builder.syncOnlineTable;
        this.TTL = builder.TTL;
        this.tags = builder.tags;
        this.type = builder.type;
        this.writeMethod = builder.writeMethod;
        this.writeToFeatureDB = builder.writeToFeatureDB;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFeatureViewRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return featureEntityId
     */
    public String getFeatureEntityId() {
        return this.featureEntityId;
    }

    /**
     * @return fields
     */
    public java.util.List<Fields> getFields() {
        return this.fields;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return registerDatasourceId
     */
    public String getRegisterDatasourceId() {
        return this.registerDatasourceId;
    }

    /**
     * @return registerTable
     */
    public String getRegisterTable() {
        return this.registerTable;
    }

    /**
     * @return syncOnlineTable
     */
    public Boolean getSyncOnlineTable() {
        return this.syncOnlineTable;
    }

    /**
     * @return TTL
     */
    public Integer getTTL() {
        return this.TTL;
    }

    /**
     * @return tags
     */
    public java.util.List<String> getTags() {
        return this.tags;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return writeMethod
     */
    public String getWriteMethod() {
        return this.writeMethod;
    }

    /**
     * @return writeToFeatureDB
     */
    public Boolean getWriteToFeatureDB() {
        return this.writeToFeatureDB;
    }

    public static final class Builder extends Request.Builder<CreateFeatureViewRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String config; 
        private String featureEntityId; 
        private java.util.List<Fields> fields; 
        private String name; 
        private String projectId; 
        private String registerDatasourceId; 
        private String registerTable; 
        private Boolean syncOnlineTable; 
        private Integer TTL; 
        private java.util.List<String> tags; 
        private String type; 
        private String writeMethod; 
        private Boolean writeToFeatureDB; 

        private Builder() {
            super();
        } 

        private Builder(CreateFeatureViewRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.config = request.config;
            this.featureEntityId = request.featureEntityId;
            this.fields = request.fields;
            this.name = request.name;
            this.projectId = request.projectId;
            this.registerDatasourceId = request.registerDatasourceId;
            this.registerTable = request.registerTable;
            this.syncOnlineTable = request.syncOnlineTable;
            this.TTL = request.TTL;
            this.tags = request.tags;
            this.type = request.type;
            this.writeMethod = request.writeMethod;
            this.writeToFeatureDB = request.writeToFeatureDB;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fs-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
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
         * FeatureEntityId.
         */
        public Builder featureEntityId(String featureEntityId) {
            this.putBodyParameter("FeatureEntityId", featureEntityId);
            this.featureEntityId = featureEntityId;
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
         * <p>FeatureView1</p>
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
         * <p>3</p>
         */
        public Builder projectId(String projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegisterDatasourceId.
         */
        public Builder registerDatasourceId(String registerDatasourceId) {
            this.putBodyParameter("RegisterDatasourceId", registerDatasourceId);
            this.registerDatasourceId = registerDatasourceId;
            return this;
        }

        /**
         * RegisterTable.
         */
        public Builder registerTable(String registerTable) {
            this.putBodyParameter("RegisterTable", registerTable);
            this.registerTable = registerTable;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder syncOnlineTable(Boolean syncOnlineTable) {
            this.putBodyParameter("SyncOnlineTable", syncOnlineTable);
            this.syncOnlineTable = syncOnlineTable;
            return this;
        }

        /**
         * TTL.
         */
        public Builder TTL(Integer TTL) {
            this.putBodyParameter("TTL", TTL);
            this.TTL = TTL;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List<String> tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Batch</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Custom</p>
         */
        public Builder writeMethod(String writeMethod) {
            this.putBodyParameter("WriteMethod", writeMethod);
            this.writeMethod = writeMethod;
            return this;
        }

        /**
         * WriteToFeatureDB.
         */
        public Builder writeToFeatureDB(Boolean writeToFeatureDB) {
            this.putBodyParameter("WriteToFeatureDB", writeToFeatureDB);
            this.writeToFeatureDB = writeToFeatureDB;
            return this;
        }

        @Override
        public CreateFeatureViewRequest build() {
            return new CreateFeatureViewRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateFeatureViewRequest} extends {@link TeaModel}
     *
     * <p>CreateFeatureViewRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
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
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FeatureView1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Batch</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateFeatureViewRequest} extends {@link TeaModel}
     *
     * <p>CreateFeatureViewRequest</p>
     */
    public static class Transform extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Input")
        private java.util.List<Input> input;

        @com.aliyun.core.annotation.NameInMap("LLMConfigId")
        private Integer LLMConfigId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Transform(Builder builder) {
            this.input = builder.input;
            this.LLMConfigId = builder.LLMConfigId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Transform create() {
            return builder().build();
        }

        /**
         * @return input
         */
        public java.util.List<Input> getInput() {
            return this.input;
        }

        /**
         * @return LLMConfigId
         */
        public Integer getLLMConfigId() {
            return this.LLMConfigId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Input> input; 
            private Integer LLMConfigId; 
            private String type; 

            private Builder() {
            } 

            private Builder(Transform model) {
                this.input = model.input;
                this.LLMConfigId = model.LLMConfigId;
                this.type = model.type;
            } 

            /**
             * Input.
             */
            public Builder input(java.util.List<Input> input) {
                this.input = input;
                return this;
            }

            /**
             * LLMConfigId.
             */
            public Builder LLMConfigId(Integer LLMConfigId) {
                this.LLMConfigId = LLMConfigId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Batch</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Transform build() {
                return new Transform(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateFeatureViewRequest} extends {@link TeaModel}
     *
     * <p>CreateFeatureViewRequest</p>
     */
    public static class Fields extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attributes")
        private java.util.List<String> attributes;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Transform")
        private java.util.List<Transform> transform;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Fields(Builder builder) {
            this.attributes = builder.attributes;
            this.name = builder.name;
            this.transform = builder.transform;
            this.type = builder.type;
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
         * @return transform
         */
        public java.util.List<Transform> getTransform() {
            return this.transform;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<String> attributes; 
            private String name; 
            private java.util.List<Transform> transform; 
            private String type; 

            private Builder() {
            } 

            private Builder(Fields model) {
                this.attributes = model.attributes;
                this.name = model.name;
                this.transform = model.transform;
                this.type = model.type;
            } 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List<String> attributes) {
                this.attributes = attributes;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>FeatureView1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Transform.
             */
            public Builder transform(java.util.List<Transform> transform) {
                this.transform = transform;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Batch</p>
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
