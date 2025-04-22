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
 * {@link UpdateRevisionRequest} extends {@link RequestModel}
 *
 * <p>UpdateRevisionRequest</p>
 */
public class UpdateRevisionRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("keep_forever")
    private Boolean keepForever;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("revision_description")
    private String revisionDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("revision_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String revisionId;

    private UpdateRevisionRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.keepForever = builder.keepForever;
        this.revisionDescription = builder.revisionDescription;
        this.revisionId = builder.revisionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateRevisionRequest create() {
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
     * @return keepForever
     */
    public Boolean getKeepForever() {
        return this.keepForever;
    }

    /**
     * @return revisionDescription
     */
    public String getRevisionDescription() {
        return this.revisionDescription;
    }

    /**
     * @return revisionId
     */
    public String getRevisionId() {
        return this.revisionId;
    }

    public static final class Builder extends Request.Builder<UpdateRevisionRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private Boolean keepForever; 
        private String revisionDescription; 
        private String revisionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateRevisionRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.keepForever = request.keepForever;
            this.revisionDescription = request.revisionDescription;
            this.revisionId = request.revisionId;
        } 

        /**
         * <p>A short description of struct</p>
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
         * <p>9520943DC264</p>
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>Specifies whether to permanently retain a version.</p>
         * <p>By default, this parameter is not specified, which indicates that you do not modify the permanent retention configuration of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder keepForever(Boolean keepForever) {
            this.putBodyParameter("keep_forever", keepForever);
            this.keepForever = keepForever;
            return this;
        }

        /**
         * <p>The description of the version. The description can be up to 1,024 characters in length.</p>
         * <p>By default, this parameter is not specified, which indicates that you do not modify the description of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>aaa</p>
         */
        public Builder revisionDescription(String revisionDescription) {
            this.putBodyParameter("revision_description", revisionDescription);
            this.revisionDescription = revisionDescription;
            return this;
        }

        /**
         * <p>The version ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>40CB7794C929</p>
         */
        public Builder revisionId(String revisionId) {
            this.putBodyParameter("revision_id", revisionId);
            this.revisionId = revisionId;
            return this;
        }

        @Override
        public UpdateRevisionRequest build() {
            return new UpdateRevisionRequest(this);
        } 

    } 

}
