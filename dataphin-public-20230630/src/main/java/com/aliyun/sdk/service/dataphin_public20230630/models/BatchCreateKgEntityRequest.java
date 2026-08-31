// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link BatchCreateKgEntityRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateKgEntityRequest</p>
 */
public class BatchCreateKgEntityRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private BatchCreateKgEntityRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateKgEntityRequest create() {
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
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<BatchCreateKgEntityRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 
        private String opUserId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateKgEntityRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
            this.workspaceId = request.workspaceId;
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
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * OpUserId.
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f1d4559a4db044158305e2d89bccf81f</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public BatchCreateKgEntityRequest build() {
            return new BatchCreateKgEntityRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateKgEntityRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateKgEntityRequest</p>
     */
    public static class PropertyList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        @com.aliyun.core.annotation.Validation(required = true)
        private String code;

        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        private PropertyList(Builder builder) {
            this.code = builder.code;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyList create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String code; 
            private String value; 

            private Builder() {
            } 

            private Builder(PropertyList model) {
                this.code = model.code;
                this.value = model.value;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>company_name</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Alibaba</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public PropertyList build() {
                return new PropertyList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCreateKgEntityRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateKgEntityRequest</p>
     */
    public static class EntityList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String entityType;

        @com.aliyun.core.annotation.NameInMap("PropertyList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<PropertyList> propertyList;

        private EntityList(Builder builder) {
            this.entityType = builder.entityType;
            this.propertyList = builder.propertyList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EntityList create() {
            return builder().build();
        }

        /**
         * @return entityType
         */
        public String getEntityType() {
            return this.entityType;
        }

        /**
         * @return propertyList
         */
        public java.util.List<PropertyList> getPropertyList() {
            return this.propertyList;
        }

        public static final class Builder {
            private String entityType; 
            private java.util.List<PropertyList> propertyList; 

            private Builder() {
            } 

            private Builder(EntityList model) {
                this.entityType = model.entityType;
                this.propertyList = model.propertyList;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Company</p>
             */
            public Builder entityType(String entityType) {
                this.entityType = entityType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder propertyList(java.util.List<PropertyList> propertyList) {
                this.propertyList = propertyList;
                return this;
            }

            public EntityList build() {
                return new EntityList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCreateKgEntityRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateKgEntityRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EntityList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<EntityList> entityList;

        private CreateCommand(Builder builder) {
            this.entityList = builder.entityList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return entityList
         */
        public java.util.List<EntityList> getEntityList() {
            return this.entityList;
        }

        public static final class Builder {
            private java.util.List<EntityList> entityList; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.entityList = model.entityList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder entityList(java.util.List<EntityList> entityList) {
                this.entityList = entityList;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
