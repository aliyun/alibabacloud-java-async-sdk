// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link CreateYikeAssetUploadResponseBody} extends {@link TeaModel}
 *
 * <p>CreateYikeAssetUploadResponseBody</p>
 */
public class CreateYikeAssetUploadResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FileURL")
    private String fileURL;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadAddress")
    private String uploadAddress;

    @com.aliyun.core.annotation.NameInMap("UploadAuth")
    private String uploadAuth;

    private CreateYikeAssetUploadResponseBody(Builder builder) {
        this.fileURL = builder.fileURL;
        this.requestId = builder.requestId;
        this.uploadAddress = builder.uploadAddress;
        this.uploadAuth = builder.uploadAuth;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateYikeAssetUploadResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return fileURL
     */
    public String getFileURL() {
        return this.fileURL;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadAddress
     */
    public String getUploadAddress() {
        return this.uploadAddress;
    }

    /**
     * @return uploadAuth
     */
    public String getUploadAuth() {
        return this.uploadAuth;
    }

    public static final class Builder {
        private String fileURL; 
        private String requestId; 
        private String uploadAddress; 
        private String uploadAuth; 

        private Builder() {
        } 

        private Builder(CreateYikeAssetUploadResponseBody model) {
            this.fileURL = model.fileURL;
            this.requestId = model.requestId;
            this.uploadAddress = model.uploadAddress;
            this.uploadAuth = model.uploadAuth;
        } 

        /**
         * FileURL.
         */
        public Builder fileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UploadAddress.
         */
        public Builder uploadAddress(String uploadAddress) {
            this.uploadAddress = uploadAddress;
            return this;
        }

        /**
         * UploadAuth.
         */
        public Builder uploadAuth(String uploadAuth) {
            this.uploadAuth = uploadAuth;
            return this;
        }

        public CreateYikeAssetUploadResponseBody build() {
            return new CreateYikeAssetUploadResponseBody(this);
        } 

    } 

}
