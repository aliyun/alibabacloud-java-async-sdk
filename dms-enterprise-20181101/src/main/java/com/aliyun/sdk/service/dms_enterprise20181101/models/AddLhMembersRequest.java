// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLhMembersRequest} extends {@link RequestModel}
 *
 * <p>AddLhMembersRequest</p>
 */
public class AddLhMembersRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Members")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Members> members;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long objectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ObjectType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer objectType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    @com.aliyun.core.annotation.Validation(minimum = 1)
    private Long tid;

    private AddLhMembersRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.members = builder.members;
        this.objectId = builder.objectId;
        this.objectType = builder.objectType;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLhMembersRequest create() {
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
     * @return members
     */
    public java.util.List < Members> getMembers() {
        return this.members;
    }

    /**
     * @return objectId
     */
    public Long getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectType
     */
    public Integer getObjectType() {
        return this.objectType;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<AddLhMembersRequest, Builder> {
        private String regionId; 
        private java.util.List < Members> members; 
        private Long objectId; 
        private Integer objectType; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(AddLhMembersRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.members = request.members;
            this.objectId = request.objectId;
            this.objectType = request.objectType;
            this.tid = request.tid;
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
         * The information about the users to be added.
         */
        public Builder members(java.util.List < Members> members) {
            String membersShrink = shrink(members, "Members", "json");
            this.putQueryParameter("Members", membersShrink);
            this.members = members;
            return this;
        }

        /**
         * The ID of the object.
         * <p>
         * 
         * *   If the object is a workspace, you can call the [GetLhSpaceByName](~~424379~~) operation to obtain the workspace ID.
         * *   If the object is a task flow, you can call the [ListLhTaskFlowAndScenario](~~426672~~) operation to obtain the task flow ID.
         */
        public Builder objectId(Long objectId) {
            this.putQueryParameter("ObjectId", objectId);
            this.objectId = objectId;
            return this;
        }

        /**
         * The type of the object. Valid values:
         * <p>
         * 
         * *   **0**: workspace
         * *   **1**: task flow
         */
        public Builder objectType(Integer objectType) {
            this.putQueryParameter("ObjectType", objectType);
            this.objectType = objectType;
            return this;
        }

        /**
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public AddLhMembersRequest build() {
            return new AddLhMembersRequest(this);
        } 

    } 

    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Roles")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < String > roles;

        @com.aliyun.core.annotation.NameInMap("UserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long userId;

        private Members(Builder builder) {
            this.roles = builder.roles;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return roles
         */
        public java.util.List < String > getRoles() {
            return this.roles;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private java.util.List < String > roles; 
            private Long userId; 

            /**
             * The role. Valid values:
             * <p>
             * 
             * *   **ADMIN**: workspace administrator. You can add a workspace administrator only as a DMS administrator or a DBA.
             * *   **MEMBER**: workspace member.
             * *   **DEVELOPER**: task flow developer. Only a workspace member can be added as a task flow developer.
             */
            public Builder roles(java.util.List < String > roles) {
                this.roles = roles;
                return this;
            }

            /**
             * The ID of the user to be added. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to obtain the user ID.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
}
