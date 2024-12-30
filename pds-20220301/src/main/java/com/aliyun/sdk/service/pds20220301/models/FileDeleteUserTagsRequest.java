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
 * {@link FileDeleteUserTagsRequest} extends {@link RequestModel}
 *
 * <p>FileDeleteUserTagsRequest</p>
 */
public class FileDeleteUserTagsRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("key_list")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> keyList;

    private FileDeleteUserTagsRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.keyList = builder.keyList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileDeleteUserTagsRequest create() {
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
     * @return keyList
     */
    public java.util.List<String> getKeyList() {
        return this.keyList;
    }

    public static final class Builder extends Request.Builder<FileDeleteUserTagsRequest, Builder> {
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private java.util.List<String> keyList; 

        private Builder() {
            super();
        } 

        private Builder(FileDeleteUserTagsRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.driveId = request.driveId;
            this.fileId = request.fileId;
            this.keyList = request.keyList;
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
         * <p>9520943DC264</p>
         */
        public Builder fileId(String fileId) {
            this.putBodyParameter("file_id", fileId);
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>The tags that you want to remove from a file. You cannot leave this parameter empty. You can specify up to 1,000 tags.</p>
         * <p>This parameter is required.</p>
         */
        public Builder keyList(java.util.List<String> keyList) {
            this.putBodyParameter("key_list", keyList);
            this.keyList = keyList;
            return this;
        }

        @Override
        public FileDeleteUserTagsRequest build() {
            return new FileDeleteUserTagsRequest(this);
        } 

    } 

}
