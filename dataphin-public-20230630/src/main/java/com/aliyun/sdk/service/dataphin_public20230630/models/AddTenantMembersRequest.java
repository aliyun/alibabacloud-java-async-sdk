// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AddTenantMembersRequest} extends {@link RequestModel}
 *
 * <p>AddTenantMembersRequest</p>
 */
public class AddTenantMembersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private AddCommand addCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private AddTenantMembersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addCommand = builder.addCommand;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTenantMembersRequest create() {
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

    public static final class Builder extends Request.Builder<AddTenantMembersRequest, Builder> {
        private String regionId; 
        private AddCommand addCommand; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(AddTenantMembersRequest request) {
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
         * <p>This parameter is required.</p>
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
        public AddTenantMembersRequest build() {
            return new AddTenantMembersRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddTenantMembersRequest} extends {@link TeaModel}
     *
     * <p>AddTenantMembersRequest</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("RoleList")
        private java.util.List < String > roleList;

        private UserList(Builder builder) {
            this.id = builder.id;
            this.roleList = builder.roleList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return roleList
         */
        public java.util.List < String > getRoleList() {
            return this.roleList;
        }

        public static final class Builder {
            private String id; 
            private java.util.List < String > roleList; 

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * RoleList.
             */
            public Builder roleList(java.util.List < String > roleList) {
                this.roleList = roleList;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddTenantMembersRequest} extends {@link TeaModel}
     *
     * <p>AddTenantMembersRequest</p>
     */
    public static class AddCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("UserList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < UserList> userList;

        private AddCommand(Builder builder) {
            this.userList = builder.userList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddCommand create() {
            return builder().build();
        }

        /**
         * @return userList
         */
        public java.util.List < UserList> getUserList() {
            return this.userList;
        }

        public static final class Builder {
            private java.util.List < UserList> userList; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder userList(java.util.List < UserList> userList) {
                this.userList = userList;
                return this;
            }

            public AddCommand build() {
                return new AddCommand(this);
            } 

        } 

    }
}
