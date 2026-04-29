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
 * {@link ArchiveFilesRequest} extends {@link RequestModel}
 *
 * <p>ArchiveFilesRequest</p>
 */
public class ArchiveFilesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("domain_id")
    private String domainId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("drive_id")
    private String driveId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("file_ids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> fileIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("share_id")
    private String shareId;

    private ArchiveFilesRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileIds = builder.fileIds;
        this.name = builder.name;
        this.shareId = builder.shareId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ArchiveFilesRequest create() {
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
     * @return fileIds
     */
    public java.util.List<String> getFileIds() {
        return this.fileIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return shareId
     */
    public String getShareId() {
        return this.shareId;
    }

    public static final class Builder extends Request.Builder<ArchiveFilesRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private java.util.List<String> fileIds; 
        private String name; 
        private String shareId; 

        private Builder() {
            super();
        } 

        private Builder(ArchiveFilesRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fileIds = request.fileIds;
            this.name = request.name;
            this.shareId = request.shareId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>bj1</p>
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
         * <p>This parameter is required.</p>
         */
        public Builder fileIds(java.util.List<String> fileIds) {
            this.putBodyParameter("file_ids", fileIds);
            this.fileIds = fileIds;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_archive_files.zip</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * share_id.
         */
        public Builder shareId(String shareId) {
            this.putBodyParameter("share_id", shareId);
            this.shareId = shareId;
            return this;
        }

        @Override
        public ArchiveFilesRequest build() {
            return new ArchiveFilesRequest(this);
        } 

    } 

}
