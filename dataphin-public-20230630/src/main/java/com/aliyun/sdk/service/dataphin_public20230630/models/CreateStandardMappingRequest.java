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
 * {@link CreateStandardMappingRequest} extends {@link RequestModel}
 *
 * <p>CreateStandardMappingRequest</p>
 */
public class CreateStandardMappingRequest extends Request {
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

    private CreateStandardMappingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateStandardMappingRequest create() {
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

    public static final class Builder extends Request.Builder<CreateStandardMappingRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(CreateStandardMappingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.opTenantId = request.opTenantId;
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

        @Override
        public CreateStandardMappingRequest build() {
            return new CreateStandardMappingRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateStandardMappingRequest} extends {@link TeaModel}
     *
     * <p>CreateStandardMappingRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssetGuidList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<String> assetGuidList;

        @com.aliyun.core.annotation.NameInMap("InvalidMappingRelationOperationType")
        private String invalidMappingRelationOperationType;

        @com.aliyun.core.annotation.NameInMap("RelationType")
        private String relationType;

        @com.aliyun.core.annotation.NameInMap("StandardId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long standardId;

        private CreateCommand(Builder builder) {
            this.assetGuidList = builder.assetGuidList;
            this.invalidMappingRelationOperationType = builder.invalidMappingRelationOperationType;
            this.relationType = builder.relationType;
            this.standardId = builder.standardId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return assetGuidList
         */
        public java.util.List<String> getAssetGuidList() {
            return this.assetGuidList;
        }

        /**
         * @return invalidMappingRelationOperationType
         */
        public String getInvalidMappingRelationOperationType() {
            return this.invalidMappingRelationOperationType;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return standardId
         */
        public Long getStandardId() {
            return this.standardId;
        }

        public static final class Builder {
            private java.util.List<String> assetGuidList; 
            private String invalidMappingRelationOperationType; 
            private String relationType; 
            private Long standardId; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.assetGuidList = model.assetGuidList;
                this.invalidMappingRelationOperationType = model.invalidMappingRelationOperationType;
                this.relationType = model.relationType;
                this.standardId = model.standardId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder assetGuidList(java.util.List<String> assetGuidList) {
                this.assetGuidList = assetGuidList;
                return this;
            }

            /**
             * InvalidMappingRelationOperationType.
             */
            public Builder invalidMappingRelationOperationType(String invalidMappingRelationOperationType) {
                this.invalidMappingRelationOperationType = invalidMappingRelationOperationType;
                return this;
            }

            /**
             * RelationType.
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder standardId(Long standardId) {
                this.standardId = standardId;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
