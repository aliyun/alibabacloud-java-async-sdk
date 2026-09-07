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
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>3D7EC0AF-DB2A-5D9C-90EC-F090A6BAAEA7</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The maximum size of a single virus file that can be uploaded, in KB. A value of 0 indicates no size limit.</p>
         * 
         * <strong>example:</strong>
         * <p>10240</p>
         */
        public Builder uploadFileMaxSize(Long uploadFileMaxSize) {
            this.uploadFileMaxSize = uploadFileMaxSize;
            return this;
        }

        /**
         * <p>The maximum upload rate for virus files, in KB/s. A value of 0 indicates no rate limit.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        public Builder uploadFileMaxSpeed(Long uploadFileMaxSpeed) {
            this.uploadFileMaxSpeed = uploadFileMaxSpeed;
            return this;
        }

        /**
         * <p>The collection of file types that are prohibited from being uploaded. Files that match these types are not uploaded even if the upload feature is enabled. An empty list is returned if no file types are configured.</p>
         */
        public Builder uploadFileSuffixBlacklist(java.util.List<String> uploadFileSuffixBlacklist) {
            this.uploadFileSuffixBlacklist = uploadFileSuffixBlacklist;
            return this;
        }

        /**
         * <p>Indicates whether user terminal devices are allowed to upload detected virus files to the cloud for further analysis. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Upload is allowed.</li>
         * <li><strong>false</strong>: Upload is not allowed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
