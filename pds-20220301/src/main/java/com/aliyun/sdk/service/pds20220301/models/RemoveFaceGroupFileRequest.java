// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveFaceGroupFileRequest} extends {@link RequestModel}
 *
 * <p>RemoveFaceGroupFileRequest</p>
 */
public class RemoveFaceGroupFileRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("face_group_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String faceGroupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    private RemoveFaceGroupFileRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.faceGroupId = builder.faceGroupId;
        this.fileId = builder.fileId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveFaceGroupFileRequest create() {
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
     * @return faceGroupId
     */
    public String getFaceGroupId() {
        return this.faceGroupId;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    public static final class Builder extends Request.Builder<RemoveFaceGroupFileRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String faceGroupId; 
        private String fileId; 

        private Builder() {
            super();
        } 

        private Builder(RemoveFaceGroupFileRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.faceGroupId = request.faceGroupId;
            this.fileId = request.fileId;
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
         * drive_id.
         */
        public Builder driveId(String driveId) {
            this.putBodyParameter("drive_id", driveId);
            this.driveId = driveId;
            return this;
        }

        /**
         * face_group_id.
         */
        public Builder faceGroupId(String faceGroupId) {
            this.putBodyParameter("face_group_id", faceGroupId);
            this.faceGroupId = faceGroupId;
            return this;
        }

        /**
         * file_id.
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        @Override
        public RemoveFaceGroupFileRequest build() {
            return new RemoveFaceGroupFileRequest(this);
        } 

    } 

}
