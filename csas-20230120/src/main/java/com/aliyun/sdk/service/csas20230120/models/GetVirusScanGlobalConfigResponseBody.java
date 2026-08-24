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
 * {@link GetVirusScanGlobalConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetVirusScanGlobalConfigResponseBody</p>
 */
public class GetVirusScanGlobalConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadFileMaxSize")
    private Long uploadFileMaxSize;

    @com.aliyun.core.annotation.NameInMap("UploadFileMaxSpeed")
    private Long uploadFileMaxSpeed;

    @com.aliyun.core.annotation.NameInMap("UploadFileSuffixBlacklist")
    private java.util.List<String> uploadFileSuffixBlacklist;

    @com.aliyun.core.annotation.NameInMap("VirusFileUpload")
    private Boolean virusFileUpload;

    private GetVirusScanGlobalConfigResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uploadFileMaxSize = builder.uploadFileMaxSize;
        this.uploadFileMaxSpeed = builder.uploadFileMaxSpeed;
        this.uploadFileSuffixBlacklist = builder.uploadFileSuffixBlacklist;
        this.virusFileUpload = builder.virusFileUpload;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVirusScanGlobalConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String requestId; 
        private Long uploadFileMaxSize; 
        private Long uploadFileMaxSpeed; 
        private java.util.List<String> uploadFileSuffixBlacklist; 
        private Boolean virusFileUpload; 

        private Builder() {
        } 

        private Builder(GetVirusScanGlobalConfigResponseBody model) {
            this.requestId = model.requestId;
            this.uploadFileMaxSize = model.uploadFileMaxSize;
            this.uploadFileMaxSpeed = model.uploadFileMaxSpeed;
            this.uploadFileSuffixBlacklist = model.uploadFileSuffixBlacklist;
            this.virusFileUpload = model.virusFileUpload;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UploadFileMaxSize.
         */
        public Builder uploadFileMaxSize(Long uploadFileMaxSize) {
            this.uploadFileMaxSize = uploadFileMaxSize;
            return this;
        }

        /**
         * UploadFileMaxSpeed.
         */
        public Builder uploadFileMaxSpeed(Long uploadFileMaxSpeed) {
            this.uploadFileMaxSpeed = uploadFileMaxSpeed;
            return this;
        }

        /**
         * UploadFileSuffixBlacklist.
         */
        public Builder uploadFileSuffixBlacklist(java.util.List<String> uploadFileSuffixBlacklist) {
            this.uploadFileSuffixBlacklist = uploadFileSuffixBlacklist;
            return this;
        }

        /**
         * VirusFileUpload.
         */
        public Builder virusFileUpload(Boolean virusFileUpload) {
            this.virusFileUpload = virusFileUpload;
            return this;
        }

        public GetVirusScanGlobalConfigResponseBody build() {
            return new GetVirusScanGlobalConfigResponseBody(this);
        } 

    } 

}
