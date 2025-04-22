// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
    private java.util.List<MemberList> memberList;

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
    public java.util.List<MemberList> getMemberList() {
        return this.memberList;
    }

    public static final class Builder extends Request.Builder<FileRemovePermissionRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private java.util.List<MemberList> memberList; 

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
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.putHostParameter("domain_id", domainId);
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>The drive ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>The file ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4221bf6e6ab43c255edc4463bf3a6f5f5d317406</p>
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The identities with whom the file is shared.</p>
         * <p>This parameter is required.</p>
         */
        public Builder memberList(java.util.List<MemberList> memberList) {
            this.putBodyParameter("member_list", memberList);
            this.memberList = memberList;
            return this;
        }

        @Override
        public FileRemovePermissionRequest build() {
            return new FileRemovePermissionRequest(this);
        } 

    } 

    /**
     * 
     * {@link FileRemovePermissionRequest} extends {@link TeaModel}
     *
     * <p>FileRemovePermissionRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(MemberList model) {
                this.identity = model.identity;
                this.roleId = model.roleId;
            } 

            /**
             * <p>The identity to whom the permissions are granted, which is a user or a group.</p>
             * <p>This parameter is required.</p>
             */
            public Builder identity(Identity identity) {
                this.identity = identity;
                return this;
            }

            /**
             * <p>The role ID. You can grant permissions by assigning roles to identities, or you can customize the permissions. To grant permissions by assigning roles to identities, specify role_id. role_id and action_list are mutually exclusive. If both parameters are specified, role_id has a higher priority.</p>
             * <p>Valid values:</p>
             * <p>SystemFileOwner: collaborator.</p>
             * <p>SystemFileDownloader: downloader.</p>
             * <p>SystemFileEditor: editor.</p>
             * <p>SystemFileEditorWithoutDelete: editor without permissions to delete the file.</p>
             * <p>SystemFileEditorWithoutShareLink: editor without permissions to share the file.</p>
             * <p>SystemFileMetaViewer: viewer of lists.</p>
             * <p>SystemFileUploader: uploader. SystemFileUploaderAndDownloader: uploader and downloader.</p>
             * <p>SystemFileDownloaderWithShareLink: downloader and sharer.</p>
             * <p>SystemFileUploaderAndDownloaderWithShareLink: uploader, downloader, and sharer.</p>
             * <p>SystemFileUploaderAndViewer: viewer and uploader.</p>
             * <p>SystemFileUploaderWithShareLink: uploader and sharer.</p>
             * <p>SystemFileViewer: viewer.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>SystemFileDownloader</p>
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
