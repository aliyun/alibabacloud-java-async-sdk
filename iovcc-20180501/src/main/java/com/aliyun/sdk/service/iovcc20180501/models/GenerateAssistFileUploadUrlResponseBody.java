// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GenerateAssistFileUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateAssistFileUploadUrlResponseBody</p>
 */
public class GenerateAssistFileUploadUrlResponseBody extends TeaModel {
    @NameInMap("FileKey")
    private String fileKey;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UploadUrl")
    private String uploadUrl;

    private GenerateAssistFileUploadUrlResponseBody(Builder builder) {
        this.fileKey = builder.fileKey;
        this.requestId = builder.requestId;
        this.uploadUrl = builder.uploadUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAssistFileUploadUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return fileKey
     */
    public String getFileKey() {
        return this.fileKey;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadUrl
     */
    public String getUploadUrl() {
        return this.uploadUrl;
    }

    public static final class Builder {
        private String fileKey; 
        private String requestId; 
        private String uploadUrl; 

        /**
         * FileKey.
         */
        public Builder fileKey(String fileKey) {
            this.fileKey = fileKey;
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
         * UploadUrl.
         */
        public Builder uploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }

        public GenerateAssistFileUploadUrlResponseBody build() {
            return new GenerateAssistFileUploadUrlResponseBody(this);
        } 

    } 

}
