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
 * {@link AddUserGroupMemberRequest} extends {@link RequestModel}
 *
 * <p>AddUserGroupMemberRequest</p>
 */
public class AddUserGroupMemberRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddCommand")
    private AddCommand addCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private AddUserGroupMemberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addCommand = builder.addCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddUserGroupMemberRequest create() {
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
     * @return addCommand
     */
    public AddCommand getAddCommand() {
        return this.addCommand;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<AddUserGroupMemberRequest, Builder> {
        private String regionId; 
        private AddCommand addCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(AddUserGroupMemberRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addCommand = request.addCommand;
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
         * AddCommand.
         */
        public Builder addCommand(AddCommand addCommand) {
            String addCommandShrink = shrink(addCommand, "AddCommand", "json");
            this.putBodyParameter("AddCommand", addCommandShrink);
            this.addCommand = addCommand;
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
        public AddUserGroupMemberRequest build() {
            return new AddUserGroupMemberRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddUserGroupMemberRequest} extends {@link TeaModel}
     *
     * <p>AddUserGroupMemberRequest</p>
     */
    public static class AddCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserGroupId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userGroupId;

        @com.aliyun.core.annotation.NameInMap("UserIdList")
        private java.util.List<String> userIdList;

        private AddCommand(Builder builder) {
            this.userGroupId = builder.userGroupId;
            this.userIdList = builder.userIdList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddCommand create() {
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
        public java.util.List<String> getUserIdList() {
            return this.userIdList;
        }

        public static final class Builder {
            private String userGroupId; 
            private java.util.List<String> userIdList; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>132331</p>
             */
            public Builder userGroupId(String userGroupId) {
                this.userGroupId = userGroupId;
                return this;
            }

            /**
             * UserIdList.
             */
            public Builder userIdList(java.util.List<String> userIdList) {
                this.userIdList = userIdList;
                return this;
            }

            public AddCommand build() {
                return new AddCommand(this);
            } 

        } 

    }
}
