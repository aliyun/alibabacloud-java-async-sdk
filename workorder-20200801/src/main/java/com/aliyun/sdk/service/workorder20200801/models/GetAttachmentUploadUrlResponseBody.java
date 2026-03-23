// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.workorder20200801.models;

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
 * {@link GetAttachmentUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>GetAttachmentUploadUrlResponseBody</p>
 */
public class GetAttachmentUploadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessFileUrl")
    private String accessFileUrl;

    @com.aliyun.core.annotation.NameInMap("ObjectKey")
    private String objectKey;

    @com.aliyun.core.annotation.NameInMap("PutObjectUrl")
    private String putObjectUrl;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetAttachmentUploadUrlResponseBody(Builder builder) {
        this.accessFileUrl = builder.accessFileUrl;
        this.objectKey = builder.objectKey;
        this.putObjectUrl = builder.putObjectUrl;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAttachmentUploadUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessFileUrl
     */
    public String getAccessFileUrl() {
        return this.accessFileUrl;
    }

    /**
     * @return objectKey
     */
    public String getObjectKey() {
        return this.objectKey;
    }

    /**
     * @return putObjectUrl
     */
    public String getPutObjectUrl() {
        return this.putObjectUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessFileUrl; 
        private String objectKey; 
        private String putObjectUrl; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetAttachmentUploadUrlResponseBody model) {
            this.accessFileUrl = model.accessFileUrl;
            this.objectKey = model.objectKey;
            this.putObjectUrl = model.putObjectUrl;
            this.requestId = model.requestId;
        } 

        /**
         * AccessFileUrl.
         */
        public Builder accessFileUrl(String accessFileUrl) {
            this.accessFileUrl = accessFileUrl;
            return this;
        }

        /**
         * ObjectKey.
         */
        public Builder objectKey(String objectKey) {
            this.objectKey = objectKey;
            return this;
        }

        /**
         * PutObjectUrl.
         */
        public Builder putObjectUrl(String putObjectUrl) {
            this.putObjectUrl = putObjectUrl;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetAttachmentUploadUrlResponseBody build() {
            return new GetAttachmentUploadUrlResponseBody(this);
        } 

    } 

}
