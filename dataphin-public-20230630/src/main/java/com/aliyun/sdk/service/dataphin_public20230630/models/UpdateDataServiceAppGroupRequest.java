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
 * {@link UpdateDataServiceAppGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataServiceAppGroupRequest</p>
 */
public class UpdateDataServiceAppGroupRequest extends Request {
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

    private UpdateDataServiceAppGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.updateCommand = builder.updateCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataServiceAppGroupRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateDataServiceAppGroupRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private UpdateCommand updateCommand; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataServiceAppGroupRequest request) {
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
        public UpdateDataServiceAppGroupRequest build() {
            return new UpdateDataServiceAppGroupRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateDataServiceAppGroupRequest} extends {@link TeaModel}
     *
     * <p>UpdateDataServiceAppGroupRequest</p>
     */
    public static class UpdateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer groupId;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 64)
        private String groupName;

        private UpdateCommand(Builder builder) {
            this.groupId = builder.groupId;
            this.groupName = builder.groupName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UpdateCommand create() {
            return builder().build();
        }

        /**
         * @return groupId
         */
        public Integer getGroupId() {
            return this.groupId;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        public static final class Builder {
            private Integer groupId; 
            private String groupName; 

            private Builder() {
            } 

            private Builder(UpdateCommand model) {
                this.groupId = model.groupId;
                this.groupName = model.groupName;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>12345</p>
             */
            public Builder groupId(Integer groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>默认应用分组</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            public UpdateCommand build() {
                return new UpdateCommand(this);
            } 

        } 

    }
}
