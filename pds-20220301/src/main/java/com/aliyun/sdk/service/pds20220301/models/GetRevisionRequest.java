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
 * {@link GetRevisionRequest} extends {@link RequestModel}
 *
 * <p>GetRevisionRequest</p>
 */
public class GetRevisionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("fields")
    private String fields;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("revision_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String revisionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url_expire_sec")
    private Long urlExpireSec;

    private GetRevisionRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fields = builder.fields;
        this.fileId = builder.fileId;
        this.revisionId = builder.revisionId;
        this.urlExpireSec = builder.urlExpireSec;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRevisionRequest create() {
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
     * @return fields
     */
    public String getFields() {
        return this.fields;
    }

    /**
     * @return fileId
     */
    public String getFileId() {
        return this.fileId;
    }

    /**
     * @return revisionId
     */
    public String getRevisionId() {
        return this.revisionId;
    }

    /**
     * @return urlExpireSec
     */
    public Long getUrlExpireSec() {
        return this.urlExpireSec;
    }

    public static final class Builder extends Request.Builder<GetRevisionRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fields; 
        private String fileId; 
        private String revisionId; 
        private Long urlExpireSec; 

        private Builder() {
            super();
        } 

        private Builder(GetRevisionRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fields = request.fields;
            this.fileId = request.fileId;
            this.revisionId = request.revisionId;
            this.urlExpireSec = request.urlExpireSec;
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
         * <p>Specifies the returned fields.</p>
         * <p>By default, this parameter is left empty. If you set this parameter to *, all fields are returned. If you leave this parameter empty, the creator of the file is not returned.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        public Builder fields(String fields) {
            this.putBodyParameter("fields", fields);
            this.fields = fields;
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

        /**
         * <p>The validity period of the file download or preview. Valid values: 10 to 86400.</p>
         * <p>Default value: 900. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        public Builder urlExpireSec(Long urlExpireSec) {
            this.putBodyParameter("url_expire_sec", urlExpireSec);
            this.urlExpireSec = urlExpireSec;
            return this;
        }

        @Override
        public GetRevisionRequest build() {
            return new GetRevisionRequest(this);
        } 

    } 

}
