// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddFilePermissionRequest} extends {@link RequestModel}
 *
 * <p>AddFilePermissionRequest</p>
 */
public class AddFilePermissionRequest extends Request {
    @Query
    @NameInMap("CdsId")
    @Validation(required = true)
    private String cdsId;

    @Query
    @NameInMap("EndUserId")
    @Validation(required = true)
    private String endUserId;

    @Query
    @NameInMap("FileId")
    @Validation(required = true)
    private String fileId;

    @Query
    @NameInMap("MemberList")
    @Validation(required = true)
    private java.util.List < MemberList> memberList;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private AddFilePermissionRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.endUserId = builder.endUserId;
        this.fileId = builder.fileId;
        this.memberList = builder.memberList;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddFilePermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cdsId
     */
    public String getCdsId() {
        return this.cdsId;
    }

    /**
     * @return endUserId
     */
    public String getEndUserId() {
        return this.endUserId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return memberList
     */
    public java.util.List < MemberList> getMemberList() {
        return this.memberList;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<AddFilePermissionRequest, Builder> {
        private String cdsId; 
        private String endUserId; 
        private String fileId; 
        private java.util.List < MemberList> memberList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddFilePermissionRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.endUserId = request.endUserId;
            this.fileId = request.fileId;
            this.memberList = request.memberList;
            this.regionId = request.regionId;
        } 

        /**
         * CdsId.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * EndUserId.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * FileId.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * MemberList.
         */
        public Builder memberList(java.util.List < MemberList> memberList) {
            String memberListShrink = shrink(memberList, "MemberList", "json");
            this.putQueryParameter("MemberList", memberListShrink);
            this.memberList = memberList;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public AddFilePermissionRequest build() {
            return new AddFilePermissionRequest(this);
        } 

    } 

    public static class CdsIdentity extends TeaModel {
        @NameInMap("Id")
        @Validation(required = true)
        private String id;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        private CdsIdentity(Builder builder) {
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CdsIdentity create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String id; 
            private String type; 

            /**
             * 用户ID
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 用户类型
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public CdsIdentity build() {
                return new CdsIdentity(this);
            } 

        } 

    }
    public static class MemberList extends TeaModel {
        @NameInMap("CdsIdentity")
        @Validation(required = true)
        private CdsIdentity cdsIdentity;

        @NameInMap("DisinheritSubGroup")
        private Boolean disinheritSubGroup;

        @NameInMap("ExpireTime")
        private Long expireTime;

        @NameInMap("RoleId")
        @Validation(required = true)
        private String roleId;

        private MemberList(Builder builder) {
            this.cdsIdentity = builder.cdsIdentity;
            this.disinheritSubGroup = builder.disinheritSubGroup;
            this.expireTime = builder.expireTime;
            this.roleId = builder.roleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberList create() {
            return builder().build();
        }

        /**
         * @return cdsIdentity
         */
        public CdsIdentity getCdsIdentity() {
            return this.cdsIdentity;
        }

        /**
         * @return disinheritSubGroup
         */
        public Boolean getDisinheritSubGroup() {
            return this.disinheritSubGroup;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        public static final class Builder {
            private CdsIdentity cdsIdentity; 
            private Boolean disinheritSubGroup; 
            private Long expireTime; 
            private String roleId; 

            /**
             * 用户对象
             */
            public Builder cdsIdentity(CdsIdentity cdsIdentity) {
                this.cdsIdentity = cdsIdentity;
                return this;
            }

            /**
             * 子用户组是否继承
             */
            public Builder disinheritSubGroup(Boolean disinheritSubGroup) {
                this.disinheritSubGroup = disinheritSubGroup;
                return this;
            }

            /**
             * 过期时间
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * 角色ID
             */
            public Builder roleId(String roleId) {
                this.roleId = roleId;
                return this;
            }

            public MemberList build() {
                return new MemberList(this);
            } 

        } 

    }
}
