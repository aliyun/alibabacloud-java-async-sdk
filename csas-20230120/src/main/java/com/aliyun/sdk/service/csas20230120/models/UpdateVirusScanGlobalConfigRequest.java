// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

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
 * {@link UpdateVirusScanGlobalConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateVirusScanGlobalConfigRequest</p>
 */
public class UpdateVirusScanGlobalConfigRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UploadFileMaxSize")
    private Long uploadFileMaxSize;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UploadFileMaxSpeed")
    private Long uploadFileMaxSpeed;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UploadFileSuffixBlacklist")
    private java.util.List<String> uploadFileSuffixBlacklist;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VirusFileUpload")
    private Boolean virusFileUpload;

    private UpdateVirusScanGlobalConfigRequest(Builder builder) {
        super(builder);
        this.uploadFileMaxSize = builder.uploadFileMaxSize;
        this.uploadFileMaxSpeed = builder.uploadFileMaxSpeed;
        this.uploadFileSuffixBlacklist = builder.uploadFileSuffixBlacklist;
        this.virusFileUpload = builder.virusFileUpload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateVirusScanGlobalConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return uploadFileMaxSize
     */
    public Long getUploadFileMaxSize() {
        return this.uploadFileMaxSize;
    }

    /**
     * @return uploadFileMaxSpeed
     */
    public Long getUploadFileMaxSpeed() {
        return this.uploadFileMaxSpeed;
    }

    /**
     * @return uploadFileSuffixBlacklist
     */
    public java.util.List<String> getUploadFileSuffixBlacklist() {
        return this.uploadFileSuffixBlacklist;
    }

    /**
     * @return virusFileUpload
     */
    public Boolean getVirusFileUpload() {
        return this.virusFileUpload;
    }

    public static final class Builder extends Request.Builder<UpdateVirusScanGlobalConfigRequest, Builder> {
        private Long uploadFileMaxSize; 
        private Long uploadFileMaxSpeed; 
        private java.util.List<String> uploadFileSuffixBlacklist; 
        private Boolean virusFileUpload; 

        private Builder() {
            super();
        } 

        private Builder(UpdateVirusScanGlobalConfigRequest request) {
            super(request);
            this.uploadFileMaxSize = request.uploadFileMaxSize;
            this.uploadFileMaxSpeed = request.uploadFileMaxSpeed;
            this.uploadFileSuffixBlacklist = request.uploadFileSuffixBlacklist;
            this.virusFileUpload = request.virusFileUpload;
        } 

        /**
         * UploadFileMaxSize.
         */
        public Builder uploadFileMaxSize(Long uploadFileMaxSize) {
            this.putBodyParameter("UploadFileMaxSize", uploadFileMaxSize);
            this.uploadFileMaxSize = uploadFileMaxSize;
            return this;
        }

        /**
         * UploadFileMaxSpeed.
         */
        public Builder uploadFileMaxSpeed(Long uploadFileMaxSpeed) {
            this.putBodyParameter("UploadFileMaxSpeed", uploadFileMaxSpeed);
            this.uploadFileMaxSpeed = uploadFileMaxSpeed;
            return this;
        }

        /**
         * UploadFileSuffixBlacklist.
         */
        public Builder uploadFileSuffixBlacklist(java.util.List<String> uploadFileSuffixBlacklist) {
            this.putBodyParameter("UploadFileSuffixBlacklist", uploadFileSuffixBlacklist);
            this.uploadFileSuffixBlacklist = uploadFileSuffixBlacklist;
            return this;
        }

        /**
         * VirusFileUpload.
         */
        public Builder virusFileUpload(Boolean virusFileUpload) {
            this.putBodyParameter("VirusFileUpload", virusFileUpload);
            this.virusFileUpload = virusFileUpload;
            return this;
        }

        @Override
        public UpdateVirusScanGlobalConfigRequest build() {
            return new UpdateVirusScanGlobalConfigRequest(this);
        } 

    } 

}
