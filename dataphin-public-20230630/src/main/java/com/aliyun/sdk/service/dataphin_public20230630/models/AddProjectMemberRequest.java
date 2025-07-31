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
 * {@link AddProjectMemberRequest} extends {@link RequestModel}
 *
 * <p>AddProjectMemberRequest</p>
 */
public class AddProjectMemberRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AddCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private AddCommand addCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    private AddProjectMemberRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.addCommand = builder.addCommand;
        this.id = builder.id;
        this.opTenantId = builder.opTenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddProjectMemberRequest create() {
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
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    public static final class Builder extends Request.Builder<AddProjectMemberRequest, Builder> {
        private String regionId; 
        private AddCommand addCommand; 
        private Long id; 
        private Long opTenantId; 

        private Builder() {
            super();
        } 

        private Builder(AddProjectMemberRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.addCommand = request.addCommand;
            this.id = request.id;
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
         * <p>711833</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
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
        public AddProjectMemberRequest build() {
            return new AddProjectMemberRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddProjectMemberRequest} extends {@link TeaModel}
     *
     * <p>AddProjectMemberRequest</p>
     */
    public static class UserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("RoleList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<Integer> roleList;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String userId;

        private UserList(Builder builder) {
            this.roleList = builder.roleList;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UserList create() {
            return builder().build();
        }

        /**
         * @return roleList
         */
        public java.util.List<Integer> getRoleList() {
            return this.roleList;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List<Integer> roleList; 
            private String userId; 

            private Builder() {
            } 

            private Builder(UserList model) {
                this.roleList = model.roleList;
                this.userId = model.userId;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder roleList(java.util.List<Integer> roleList) {
                this.roleList = roleList;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>30012011</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public UserList build() {
                return new UserList(this);
            } 

        } 

    }
    /**
     * 
     * {@link AddProjectMemberRequest} extends {@link TeaModel}
     *
     * <p>AddProjectMemberRequest</p>
     */
    public static class AddCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Env")
        @com.aliyun.core.annotation.Validation(required = true)
        private String env;

        @com.aliyun.core.annotation.NameInMap("UserList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<UserList> userList;

        private AddCommand(Builder builder) {
            this.env = builder.env;
            this.userList = builder.userList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AddCommand create() {
            return builder().build();
        }

        /**
         * @return env
         */
        public String getEnv() {
            return this.env;
        }

        /**
         * @return userList
         */
        public java.util.List<UserList> getUserList() {
            return this.userList;
        }

        public static final class Builder {
            private String env; 
            private java.util.List<UserList> userList; 

            private Builder() {
            } 

            private Builder(AddCommand model) {
                this.env = model.env;
                this.userList = model.userList;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>DEV</p>
             */
            public Builder env(String env) {
                this.env = env;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder userList(java.util.List<UserList> userList) {
                this.userList = userList;
                return this;
            }

            public AddCommand build() {
                return new AddCommand(this);
            } 

        } 

    }
}
