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
         * <p>The ID of the cloud disk whose folder you want to share.</p>
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
         * <p>The ID of the end user who uses the cloud disk.</p>
         * 
         * <strong>example:</strong>
         * <p>user01</p>
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * <p>The ID of the file.</p>
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
         * <p>The ID of the team that uses cloud disks in Cloud Drive Service.</p>
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
         * <p>The members who are granted the folder permissions.</p>
         * <p>This parameter is required.</p>
         */
        public Builder memberList(java.util.List<MemberList> memberList) {
            String memberListShrink = shrink(memberList, "MemberList", "json");
            this.putQueryParameter("MemberList", memberListShrink);
            this.memberList = memberList;
            return this;
        }

        /**
         * <p>The region ID of the folder. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
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

            /**
             * <p>The ID of the user.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>user01</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The type of the user.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li><!-- -->
             * 
             * <p>IT_Group</p>
             * <!-- -->
             * 
             * <!-- -->
             * </li>
             * <li><!-- -->
             * 
             * <p>IT_User</p>
             * <!-- -->
             * 
             * <!-- --></li>
             * </ul>
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

            /**
             * <p>The user of the cloud disk.</p>
             * <p>This parameter is required.</p>
             */
            public Builder cdsIdentity(CdsIdentity cdsIdentity) {
                this.cdsIdentity = cdsIdentity;
                return this;
            }

            /**
             * <p>Specifies whether the users of the child group can inherit the folder permissions.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder disinheritSubGroup(Boolean disinheritSubGroup) {
                this.disinheritSubGroup = disinheritSubGroup;
                return this;
            }

            /**
             * <p>The time when the authorization expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The value never expires. You can specify a value that is predefined by the system for this parameter. Example: 4775500800000.</p>
             * 
             * <strong>example:</strong>
             * <p>4775500800000</p>
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>The ID of the role to which you want to attach the folder permissions. To configure the folder permissions: you can specify a role or create custom operation permissions. You can use RoleId to specify a role. RoleId is mutually exclusive with ActionList. If you specify both of them, the value of RoleId takes precedence.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>SystemFileEditorWithoutShareLink</li>
             * <li>SystemFileUploaderAndDownloaderWithShareLink</li>
             * <li>SystemFileDownloader</li>
             * <li>SystemFileEditorWithoutDelete</li>
             * <li>SystemFileOwner</li>
             * <li>SystemFileDownloaderWithShareLink</li>
             * <li>SystemFileUploaderAndViewer</li>
             * <li>SystemFileViewer</li>
             * <li>SystemFileEditor</li>
             * <li>SystemFileUploaderWithShareLink</li>
             * <li>SystemFileUploader</li>
             * <li>SystemFileUploaderAndDownloader</li>
             * <li>SystemFileMetaViewer</li>
             * </ul>
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
