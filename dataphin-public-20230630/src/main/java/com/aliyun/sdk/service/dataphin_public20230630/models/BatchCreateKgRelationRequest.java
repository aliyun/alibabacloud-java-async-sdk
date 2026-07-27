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
 * {@link BatchCreateKgRelationRequest} extends {@link RequestModel}
 *
 * <p>BatchCreateKgRelationRequest</p>
 */
public class BatchCreateKgRelationRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private BatchCreateKgRelationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchCreateKgRelationRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<BatchCreateKgRelationRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchCreateKgRelationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
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
        public BatchCreateKgRelationRequest build() {
            return new BatchCreateKgRelationRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchCreateKgRelationRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateKgRelationRequest</p>
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
     * {@link BatchCreateKgRelationRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateKgRelationRequest</p>
     */
    public static class RelationList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PropertyList")
        private java.util.List<PropertyList> propertyList;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("SourceEntityId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sourceEntityId;

        @com.aliyun.core.annotation.NameInMap("TargetEntityId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String targetEntityId;

        private RelationList(Builder builder) {
            this.propertyList = builder.propertyList;
            this.relationType = builder.relationType;
            this.sourceEntityId = builder.sourceEntityId;
            this.targetEntityId = builder.targetEntityId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RelationList create() {
            return builder().build();
        }

        /**
         * @return propertyList
         */
        public java.util.List<PropertyList> getPropertyList() {
            return this.propertyList;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return sourceEntityId
         */
        public String getSourceEntityId() {
            return this.sourceEntityId;
        }

        /**
         * @return targetEntityId
         */
        public String getTargetEntityId() {
            return this.targetEntityId;
        }

        public static final class Builder {
            private java.util.List<PropertyList> propertyList; 
            private String relationType; 
            private String sourceEntityId; 
            private String targetEntityId; 

            private Builder() {
            } 

            private Builder(RelationList model) {
                this.propertyList = model.propertyList;
                this.relationType = model.relationType;
                this.sourceEntityId = model.sourceEntityId;
                this.targetEntityId = model.targetEntityId;
            } 

            /**
             * PropertyList.
             */
            public Builder propertyList(java.util.List<PropertyList> propertyList) {
                this.propertyList = propertyList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Company</p>
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>e1d4559a4db044158305e2d89bccf81f</p>
             */
            public Builder sourceEntityId(String sourceEntityId) {
                this.sourceEntityId = sourceEntityId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>e1d4559a4db044158305e2d89bccf82f</p>
             */
            public Builder targetEntityId(String targetEntityId) {
                this.targetEntityId = targetEntityId;
                return this;
            }

            public RelationList build() {
                return new RelationList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchCreateKgRelationRequest} extends {@link TeaModel}
     *
     * <p>BatchCreateKgRelationRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RelationList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<RelationList> relationList;

        private CreateCommand(Builder builder) {
            this.relationList = builder.relationList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return relationList
         */
        public java.util.List<RelationList> getRelationList() {
            return this.relationList;
        }

        public static final class Builder {
            private java.util.List<RelationList> relationList; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.relationList = model.relationList;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder relationList(java.util.List<RelationList> relationList) {
                this.relationList = relationList;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
