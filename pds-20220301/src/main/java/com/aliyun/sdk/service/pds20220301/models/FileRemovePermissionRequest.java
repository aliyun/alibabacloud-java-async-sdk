// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FileRemovePermissionRequest} extends {@link RequestModel}
 *
 * <p>FileRemovePermissionRequest</p>
 */
public class FileRemovePermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("member_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < MemberList> memberList;

    private FileRemovePermissionRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.memberList = builder.memberList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileRemovePermissionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return driveId
     */
    public String getDriveId() {
        return this.driveId;
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

    public static final class Builder extends Request.Builder<FileRemovePermissionRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private java.util.List < MemberList> memberList; 

        private Builder() {
            super();
        } 

        private Builder(FileRemovePermissionRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.memberList = request.memberList;
        } 

        /**
         * domain_id.
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * The drive ID.
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * The file ID.
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The identities with whom the file is shared.
         */
        public Builder memberList(java.util.List < MemberList> memberList) {
            this.putBodyParameter("member_list", memberList);
            this.memberList = memberList;
            return this;
        }

        @Override
        public FileRemovePermissionRequest build() {
            return new FileRemovePermissionRequest(this);
        } 

    } 

    public static class MemberList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("identity")
        @com.aliyun.core.annotation.Validation(required = true)
        private Identity identity;

        @com.aliyun.core.annotation.NameInMap("role_id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roleId;

        private MemberList(Builder builder) {
            this.identity = builder.identity;
            this.roleId = builder.roleId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MemberList create() {
            return builder().build();
        }

        /**
         * @return identity
         */
        public Identity getIdentity() {
            return this.identity;
        }

        /**
         * @return roleId
         */
        public String getRoleId() {
            return this.roleId;
        }

        public static final class Builder {
            private Identity identity; 
            private String roleId; 

            /**
             * The identity to whom the permissions are granted, which is a user or a group.
             */
            public Builder identity(Identity identity) {
                this.identity = identity;
                return this;
            }

            /**
             * The role ID. You can grant permissions by assigning roles to identities, or you can customize the permissions. To grant permissions by assigning roles to identities, specify role_id. role_id and action_list are mutually exclusive. If both parameters are specified, role_id has a higher priority.
             * <p>
             * 
             * Valid values:
             * 
             * SystemFileOwner: collaborator.
             * 
             * SystemFileDownloader: downloader.
             * 
             * SystemFileEditor: editor.
             * 
             * SystemFileEditorWithoutDelete: editor without permissions to delete the file.
             * 
             * SystemFileEditorWithoutShareLink: editor without permissions to share the file.
             * 
             * SystemFileMetaViewer: viewer of lists.
             * 
             * SystemFileUploader: uploader. SystemFileUploaderAndDownloader: uploader and downloader.
             * 
             * SystemFileDownloaderWithShareLink: downloader and sharer.
             * 
             * SystemFileUploaderAndDownloaderWithShareLink: uploader, downloader, and sharer.
             * 
             * SystemFileUploaderAndViewer: viewer and uploader.
             * 
             * SystemFileUploaderWithShareLink: uploader and sharer.
             * 
             * SystemFileViewer: viewer.
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
