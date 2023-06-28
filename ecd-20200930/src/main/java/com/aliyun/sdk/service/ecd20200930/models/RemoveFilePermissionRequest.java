// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveFilePermissionRequest} extends {@link RequestModel}
 *
 * <p>RemoveFilePermissionRequest</p>
 */
public class RemoveFilePermissionRequest extends Request {
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

    private RemoveFilePermissionRequest(Builder builder) {
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

    public static RemoveFilePermissionRequest create() {
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

    public static final class Builder extends Request.Builder<RemoveFilePermissionRequest, Builder> {
        private String cdsId; 
        private String endUserId; 
        private String fileId; 
        private java.util.List < MemberList> memberList; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveFilePermissionRequest request) {
            super(request);
            this.cdsId = request.cdsId;
            this.endUserId = request.endUserId;
            this.fileId = request.fileId;
            this.memberList = request.memberList;
            this.regionId = request.regionId;
        } 

        /**
         * The ID of the cloud disk in Cloud Drive Service.
         */
        public Builder cdsId(String cdsId) {
            this.putQueryParameter("CdsId", cdsId);
            this.cdsId = cdsId;
            return this;
        }

        /**
         * The user ID.
         */
        public Builder endUserId(String endUserId) {
            this.putQueryParameter("EndUserId", endUserId);
            this.endUserId = endUserId;
            return this;
        }

        /**
         * The file ID. The ID is a unique identifier for the file.
         */
        public Builder fileId(String fileId) {
            this.putQueryParameter("FileId", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The users that you want to authorize.
         */
        public Builder memberList(java.util.List < MemberList> memberList) {
            String memberListShrink = shrink(memberList, "MemberList", "json");
            this.putQueryParameter("MemberList", memberListShrink);
            this.memberList = memberList;
            return this;
        }

        /**
         * The region ID. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public RemoveFilePermissionRequest build() {
            return new RemoveFilePermissionRequest(this);
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
             * The user ID or group ID.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * The object type.
             * <p>
             * 
             * Valid values:
             * 
             * *   IT_Group
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     group
             * 
             *     <!-- -->
             * 
             * *   IT_User
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     user
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

        @NameInMap("RoleId")
        @Validation(required = true)
        private String roleId;

        private MemberList(Builder builder) {
            this.cdsIdentity = builder.cdsIdentity;
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
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        public static final class Builder {
            private CdsIdentity cdsIdentity; 
            private String roleId; 

            /**
             * The permission information.
             */
            public Builder cdsIdentity(CdsIdentity cdsIdentity) {
                this.cdsIdentity = cdsIdentity;
                return this;
            }

            /**
             * The role ID. You can configure permissions on roles or actions. This parameter is used to specify the permissions on roles, which conflicts with the ActionList parameter. When you configure both the parameters, this parameter shall prevail.
             * <p>
             * 
             * Valid values:
             * 
             * *   SystemFileEditorWithoutShareLink
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permissions to edit files but cannot share files
             * 
             *     <!-- -->
             * 
             * *   SystemFileUploaderAndDownloaderWithShareLink
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permissions to upload, download, and share files
             * 
             *     <!-- -->
             * 
             * *   SystemFileDownloader
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permissions to download files
             * 
             *     <!-- -->
             * 
             * *   SystemFileEditorWithoutDelete
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permissions to edit files but cannot delete files
             * 
             *     <!-- -->
             * 
             * *   SystemFileOwner
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permissions to collaborate with others
             * 
             *     <!-- -->
             * 
             * *   SystemFileDownloaderWithShareLink
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permissions to download and share files
             * 
             *     <!-- -->
             * 
             * *   SystemFileUploaderAndViewer
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permissions to preview or upload files
             * 
             *     <!-- -->
             * 
             * *   SystemFileViewer
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permissions to preview files
             * 
             *     <!-- -->
             * 
             * *   SystemFileEditor
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permissions to edit files
             * 
             *     <!-- -->
             * 
             * *   SystemFileUploaderWithShareLink
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permissions to upload or share files
             * 
             *     <!-- -->
             * 
             * *   SystemFileUploader
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permission to upload files
             * 
             *     <!-- -->
             * 
             * *   SystemFileUploaderAndDownloader
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permissions to upload or download files
             * 
             *     <!-- -->
             * 
             * *   SystemFileMetaViewer
             * 
             *     <!-- -->
             * 
             *     :
             * 
             *     <!-- -->
             * 
             *     the role that has the permissions to view files
             * 
             *     <!-- -->
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
