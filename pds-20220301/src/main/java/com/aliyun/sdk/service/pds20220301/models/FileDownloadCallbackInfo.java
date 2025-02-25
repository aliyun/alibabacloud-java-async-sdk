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
 * {@link FileDownloadCallbackInfo} extends {@link TeaModel}
 *
 * <p>FileDownloadCallbackInfo</p>
 */
public class FileDownloadCallbackInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("bucket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucket;

    @com.aliyun.core.annotation.NameInMap("domain_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainId;

    @com.aliyun.core.annotation.NameInMap("drive_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String driveId;

    @com.aliyun.core.annotation.NameInMap("file_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String fileId;

    @com.aliyun.core.annotation.NameInMap("object")
    @com.aliyun.core.annotation.Validation(required = true)
    private String object;

    @com.aliyun.core.annotation.NameInMap("user_id")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private FileDownloadCallbackInfo(Builder builder) {
        this.bucket = builder.bucket;
        this.domainId = builder.domainId;
        this.driveId = builder.driveId;
        this.fileId = builder.fileId;
        this.object = builder.object;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static FileDownloadCallbackInfo create() {
        return builder().build();
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
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
     * @return object
     */
    public String getObject() {
        return this.object;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder {
        private String bucket; 
        private String domainId; 
        private String driveId; 
        private String fileId; 
        private String object; 
        private String userId; 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccp-bj1-bj-1234</p>
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder domainId(String domainId) {
            this.domainId = domainId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder driveId(String driveId) {
            this.driveId = driveId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder fileId(String fileId) {
            this.fileId = fileId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder object(String object) {
            this.object = object;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        public FileDownloadCallbackInfo build() {
            return new FileDownloadCallbackInfo(this);
        } 

    } 

}
