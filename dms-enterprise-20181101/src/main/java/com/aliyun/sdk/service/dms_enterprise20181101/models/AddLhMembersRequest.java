// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLhMembersRequest} extends {@link RequestModel}
 *
 * <p>AddLhMembersRequest</p>
 */
public class AddLhMembersRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Members")
    @Validation(required = true)
    private java.util.List < Members> members;

    @Query
    @NameInMap("ObjectId")
    @Validation(required = true)
    private Long objectId;

    @Query
    @NameInMap("ObjectType")
    @Validation(required = true)
    private Integer objectType;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
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
         * The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) or [ListUserTenants](~~198074~~) operation to obtain the tenant ID.
         */
        public Builder members(java.util.List < Members> members) {
            String membersShrink = shrink(members, "Members", "json");
            this.putQueryParameter("Members", membersShrink);
            this.members = members;
            return this;
        }

        /**
         * The ID of the user to be added. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to obtain the user ID.
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
         * Tid.
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
        @NameInMap("Roles")
        @Validation(required = true)
        private java.util.List < String > roles;

        @NameInMap("UserId")
        @Validation(required = true)
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
             * Roles.
             */
            public Builder roles(java.util.List < String > roles) {
                this.roles = roles;
                return this;
            }

            /**
             * The ID of the request.
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
