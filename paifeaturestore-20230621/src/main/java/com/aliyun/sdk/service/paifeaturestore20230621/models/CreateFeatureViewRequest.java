// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFeatureViewRequest} extends {@link RequestModel}
 *
 * <p>CreateFeatureViewRequest</p>
 */
public class CreateFeatureViewRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("Config")
    private String config;

    @Body
    @NameInMap("FeatureEntityId")
    private String featureEntityId;

    @Body
    @NameInMap("Fields")
    private java.util.List < Fields> fields;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Body
    @NameInMap("RegisterDatasourceId")
    private String registerDatasourceId;

    @Body
    @NameInMap("RegisterTable")
    private String registerTable;

    @Body
    @NameInMap("SyncOnlineTable")
    @Validation(required = true)
    private Boolean syncOnlineTable;

    @Body
    @NameInMap("TTL")
    private Integer TTL;

    @Body
    @NameInMap("Tags")
    private java.util.List < String > tags;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    @Body
    @NameInMap("WriteMethod")
    @Validation(required = true)
    private String writeMethod;

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
    public java.util.List < Fields> getFields() {
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
    public java.util.List < String > getTags() {
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

    public static final class Builder extends Request.Builder<CreateFeatureViewRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String config; 
        private String featureEntityId; 
        private java.util.List < Fields> fields; 
        private String name; 
        private String projectId; 
        private String registerDatasourceId; 
        private String registerTable; 
        private Boolean syncOnlineTable; 
        private Integer TTL; 
        private java.util.List < String > tags; 
        private String type; 
        private String writeMethod; 

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
        } 

        /**
         * InstanceId.
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
        public Builder fields(java.util.List < Fields> fields) {
            this.putBodyParameter("Fields", fields);
            this.fields = fields;
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
         * ProjectId.
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
         * SyncOnlineTable.
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
        public Builder tags(java.util.List < String > tags) {
            this.putBodyParameter("Tags", tags);
            this.tags = tags;
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

        /**
         * WriteMethod.
         */
        public Builder writeMethod(String writeMethod) {
            this.putBodyParameter("WriteMethod", writeMethod);
            this.writeMethod = writeMethod;
            return this;
        }

        @Override
        public CreateFeatureViewRequest build() {
            return new CreateFeatureViewRequest(this);
        } 

    } 

    public static class Fields extends TeaModel {
        @NameInMap("Attributes")
        private java.util.List < String > attributes;

        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
        private String type;

        private Fields(Builder builder) {
            this.attributes = builder.attributes;
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
         * @return attributes
         */
        public java.util.List < String > getAttributes() {
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

        public static final class Builder {
            private java.util.List < String > attributes; 
            private String name; 
            private String type; 

            /**
             * Attributes.
             */
            public Builder attributes(java.util.List < String > attributes) {
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

            public Fields build() {
                return new Fields(this);
            } 

        } 

    }
}
