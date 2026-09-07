// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link AddFilePermissionRequest} extends {@link RequestModel}
 *
 * <p>AddFilePermissionRequest</p>
 */
public class AddFilePermissionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CdsId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cdsId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndUserId")
    private String endUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FileId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MemberList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<MemberList> memberList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private AddFilePermissionRequest(Builder builder) {
        super(builder);
        this.cdsId = builder.cdsId;
        this.endUserId = builder.endUserId;
        this.fileId = builder.fileId;
        this.groupId = builder.groupId;
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return memberList
     */
    public java.util.List<MemberList> getMemberList() {
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
        private String groupId; 
        private java.util.List<MemberList> memberList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(AddFilePermissionRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.endUserId = request.endUserId;
            this.fileId = request.fileId;
            this.groupId = request.groupId;
            this.memberList = request.memberList;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The enterprise cloud disk ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou+cds-352282****</p>
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * <p>The ID of the user who uses the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>alice</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The file ID. You can call <a href="https://help.aliyun.com/document_detail/2247622.html">ListCdsFiles</a> to query the file ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6333e553a133ce21e6f747cf948bb9ef95d7****</p>
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The team space ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cg-i1ruuudp92qpj****</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The list of authorized users.</p>
         * <p>This parameter is required.</p>
         */
        public Builder memberList(java.util.List<MemberList> memberList) {
            String memberListShrink = shrink(memberList, "MemberList", "json");
            this.putQueryParameter("MemberList", memberListShrink);
            this.memberList = memberList;
            return this;
        }

        /**
         * <p>The region ID. You can call <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

    /**
     * 
     * {@link AddFilePermissionRequest} extends {@link TeaModel}
     *
     * <p>AddFilePermissionRequest</p>
     */
    public static class CdsIdentity extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(CdsIdentity model) {
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * <p>The user ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>alice</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The user type.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>IT_User</p>
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
    /**
     * 
     * {@link AddFilePermissionRequest} extends {@link TeaModel}
     *
     * <p>AddFilePermissionRequest</p>
     */
    public static class MemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CdsIdentity")
        @com.aliyun.core.annotation.Validation(required = true)
        private CdsIdentity cdsIdentity;

        @com.aliyun.core.annotation.NameInMap("DisinheritSubGroup")
        private Boolean disinheritSubGroup;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("RoleId")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(MemberList model) {
                this.cdsIdentity = model.cdsIdentity;
                this.disinheritSubGroup = model.disinheritSubGroup;
                this.expireTime = model.expireTime;
                this.roleId = model.roleId;
            } 

            /**
             * <p>The user object.</p>
             * <p>This parameter is required.</p>
             */
            public Builder cdsIdentity(CdsIdentity cdsIdentity) {
                this.cdsIdentity = cdsIdentity;
                return this;
            }

            /**
             * <p>Specifies whether sub-user groups inherit the permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disinheritSubGroup(Boolean disinheritSubGroup) {
                this.disinheritSubGroup = disinheritSubGroup;
                return this;
            }

            /**
             * <p>The time when the authorization expires. The value is the number of milliseconds from January 1, 1970, 00:00:00 to the target time. To set the authorization to never expire, specify a predefined value such as 4775500800000.</p>
             * 
             * <strong>example:</strong>
             * <p>4775500800000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Two methods are supported for setting permissions: specifying a role or customizing operation permissions. This parameter specifies a role for permission settings and is mutually exclusive with ActionList. If both parameters are set, this parameter takes precedence.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SystemFileUploaderAndDownloader</p>
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
