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
    private String endUserId;

    @Query
    @NameInMap("FileId")
    @Validation(required = true)
    private String fileId;

    @Query
    @NameInMap("GroupId")
    private String groupId;

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
        private String groupId; 
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
            this.groupId = request.groupId;
            this.memberList = request.memberList;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud disk whose folder you want to share.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The ID of the end user who uses the cloud disk.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The ID of the file.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The ID of the team that uses cloud disks in Cloud Drive Service.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The members who are granted the folder permissions.
         */
        public Builder memberList(java.util.List < MemberList> memberList) {
            String memberListShrink = shrink(memberList, "MemberList", "json");
            this.putQueryParameter("MemberList", memberListShrink);
            this.memberList = memberList;
            return this;
        }

        /**
         * The region ID of the folder. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
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
             * The ID of the user.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The type of the user.
             * <p>
             * 
             * Valid values:
             * 
             * *   <!-- -->
             * 
             *     IT_Group
             * 
             *     <!-- -->
             * 
             *     <!-- -->
             * 
             * *   <!-- -->
             * 
             *     IT_User
             * 
             *     <!-- -->
             * 
             *     <!-- -->
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
             * The user of the cloud disk.
             */
            public Builder cdsIdentity(CdsIdentity cdsIdentity) {
                this.cdsIdentity = cdsIdentity;
                return this;
            }

            /**
             * Specifies whether the users of the child group can inherit the folder permissions.
             */
            public Builder disinheritSubGroup(Boolean disinheritSubGroup) {
                this.disinheritSubGroup = disinheritSubGroup;
                return this;
            }

            /**
             * The time when the authorization expires. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC. The value never expires. You can specify a value that is predefined by the system for this parameter. Example: 4775500800000.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * The ID of the role to which you want to attach the folder permissions. To configure the folder permissions: you can specify a role or create custom operation permissions. You can use RoleId to specify a role. RoleId is mutually exclusive with ActionList. If you specify both of them, the value of RoleId takes precedence.
             * <p>
             * 
             * Valid values:
             * 
             * * SystemFileEditorWithoutShareLink
             * * SystemFileUploaderAndDownloaderWithShareLink
             * * SystemFileDownloader
             * * SystemFileEditorWithoutDelete
             * * SystemFileOwner
             * * SystemFileDownloaderWithShareLink
             * * SystemFileUploaderAndViewer
             * * SystemFileViewer
             * * SystemFileEditor
             * * SystemFileUploaderWithShareLink
             * * SystemFileUploader
             * * SystemFileUploaderAndDownloader
             * * SystemFileMetaViewer
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
