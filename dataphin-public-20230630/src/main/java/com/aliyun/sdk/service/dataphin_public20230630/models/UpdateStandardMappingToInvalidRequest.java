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
 * {@link UpdateStandardMappingToInvalidRequest} extends {@link RequestModel}
 *
 * <p>UpdateStandardMappingToInvalidRequest</p>
 */
public class UpdateStandardMappingToInvalidRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UpdateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private UpdateCommand updateCommand;

    private UpdateStandardMappingToInvalidRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateStandardMappingToInvalidRequest create() {
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
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return updateCommand
     */
    public UpdateCommand getUpdateCommand() {
        return this.updateCommand;
    }

    public static final class Builder extends Request.Builder<UpdateStandardMappingToInvalidRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateStandardMappingToInvalidRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.updateCommand = request.updateCommand;
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
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder updateCommand(UpdateCommand updateCommand) {
            String updateCommandShrink = shrink(updateCommand, "UpdateCommand", "json");
            this.putBodyParameter("UpdateCommand", updateCommandShrink);
            this.updateCommand = updateCommand;
            return this;
        }

        @Override
        public UpdateStandardMappingToInvalidRequest build() {
            return new UpdateStandardMappingToInvalidRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateStandardMappingToInvalidRequest} extends {@link TeaModel}
     *
     * <p>UpdateStandardMappingToInvalidRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BelongGuidList")
        private java.util.List<String> belongGuidList;

        @com.aliyun.core.annotation.NameInMap("GuidList")
        private java.util.List<String> guidList;

        @com.aliyun.core.annotation.NameInMap("StandardId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long standardId;

        private UpdateCommand(Builder builder) {
            this.belongGuidList = builder.belongGuidList;
            this.guidList = builder.guidList;
            this.standardId = builder.standardId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return belongGuidList
         */
        public java.util.List<String> getBelongGuidList() {
            return this.belongGuidList;
        }

        /**
         * @return guidList
         */
        public java.util.List<String> getGuidList() {
            return this.guidList;
        }

        /**
         * @return standardId
         */
        public Long getStandardId() {
            return this.standardId;
        }

        public static final class Builder {
            private java.util.List<String> belongGuidList; 
            private java.util.List<String> guidList; 
            private Long standardId; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.belongGuidList = model.belongGuidList;
                this.guidList = model.guidList;
                this.standardId = model.standardId;
            } 

            /**
             * BelongGuidList.
             */
            public Builder belongGuidList(java.util.List<String> belongGuidList) {
                this.belongGuidList = belongGuidList;
                return this;
            }

            /**
             * GuidList.
             */
            public Builder guidList(java.util.List<String> guidList) {
                this.guidList = guidList;
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

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
