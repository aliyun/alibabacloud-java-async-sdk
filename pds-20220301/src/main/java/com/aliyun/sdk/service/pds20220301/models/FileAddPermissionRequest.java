// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link FileAddPermissionRequest} extends {@link RequestModel}
 *
 * <p>FileAddPermissionRequest</p>
 */
public class FileAddPermissionRequest extends Request {
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
    private java.util.List < FilePermissionMember > memberList;

    private FileAddPermissionRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.memberList = builder.memberList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileAddPermissionRequest create() {
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
    public java.util.List < FilePermissionMember > getMemberList() {
        return this.memberList;
    }

    public static final class Builder extends Request.Builder<FileAddPermissionRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private java.util.List < FilePermissionMember > memberList; 

        private Builder() {
            super();
        } 

        private Builder(FileAddPermissionRequest request) {
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
         * The ID of the folder. If you want to authorize a user or group to access a team drive, set this parameter to root. If you want to authorize a user or group to access an individual drive, you cannot set this parameter to root.
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * The members that are authorized to access files.
         */
        public Builder memberList(java.util.List < FilePermissionMember > memberList) {
            this.putBodyParameter("member_list", memberList);
            this.memberList = memberList;
            return this;
        }

        @Override
        public FileAddPermissionRequest build() {
            return new FileAddPermissionRequest(this);
        } 

    } 

}
