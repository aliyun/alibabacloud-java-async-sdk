// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RemoveUserGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>RemoveUserGroupMemberRequest</p>
 */
public class RemoveUserGroupMemberRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemoveCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private RemoveCommand removeCommand;

    private RemoveUserGroupMemberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.opTenantId = builder.opTenantId;
        this.removeCommand = builder.removeCommand;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveUserGroupMemberRequest create() {
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
     * @return removeCommand
     */
    public RemoveCommand getRemoveCommand() {
        return this.removeCommand;
    }

    public static final class Builder extends Request.Builder<RemoveUserGroupMemberRequest, Builder> {
        private String regionId; 
        private Long opTenantId; 
        private RemoveCommand removeCommand; 

        private Builder() {
            super();
        } 

        private Builder(RemoveUserGroupMemberRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.opTenantId = request.opTenantId;
            this.removeCommand = request.removeCommand;
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
        public Builder removeCommand(RemoveCommand removeCommand) {
            String removeCommandShrink = shrink(removeCommand, "RemoveCommand", "json");
            this.putBodyParameter("RemoveCommand", removeCommandShrink);
            this.removeCommand = removeCommand;
            return this;
        }

        @Override
        public RemoveUserGroupMemberRequest build() {
            return new RemoveUserGroupMemberRequest(this);
        } 

    } 

    /**
     * 
     * {@link RemoveUserGroupMemberRequest} extends {@link TeaModel}
     *
     * <p>RemoveUserGroupMemberRequest</p>
     */
    public static class RemoveCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userGroupId;

        @com.aliyun.core.annotation.NameInMap("UserIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > userIdList;

        private RemoveCommand(Builder builder) {
            this.userGroupId = builder.userGroupId;
            this.userIdList = builder.userIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemoveCommand create() {
            return builder().build();
        }

        /**
         * @return userGroupId
         */
        public String getUserGroupId() {
            return this.userGroupId;
        }

        /**
         * @return userIdList
         */
        public java.util.List < String > getUserIdList() {
            return this.userIdList;
        }

        public static final class Builder {
            private String userGroupId; 
            private java.util.List < String > userIdList; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2311</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder userIdList(java.util.List < String > userIdList) {
                this.userIdList = userIdList;
                return this;
            }

            public RemoveCommand build() {
                return new RemoveCommand(this);
            } 

        } 

    }
}
