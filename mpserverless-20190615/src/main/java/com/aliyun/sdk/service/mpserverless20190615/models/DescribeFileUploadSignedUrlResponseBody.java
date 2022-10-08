// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFileUploadSignedUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFileUploadSignedUrlResponseBody</p>
 */
public class DescribeFileUploadSignedUrlResponseBody extends TeaModel {
    @NameInMap("Id")
    private String id;

    @NameInMap("OssCallbackUrl")
    private String ossCallbackUrl;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SignUrl")
    private String signUrl;

    private DescribeFileUploadSignedUrlResponseBody(Builder builder) {
        this.id = builder.id;
        this.ossCallbackUrl = builder.ossCallbackUrl;
        this.requestId = builder.requestId;
        this.signUrl = builder.signUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFileUploadSignedUrlResponseBody create() {
        return builder().build();
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return ossCallbackUrl
     */
    public String getOssCallbackUrl() {
        return this.ossCallbackUrl;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signUrl
     */
    public String getSignUrl() {
        return this.signUrl;
    }

    public static final class Builder {
        private String id; 
        private String ossCallbackUrl; 
        private String requestId; 
        private String signUrl; 

        /**
         * Id.
         */
        public Builder id(String id) {
            this.id = id;
            return this;
        }

        /**
         * OssCallbackUrl.
         */
        public Builder ossCallbackUrl(String ossCallbackUrl) {
            this.ossCallbackUrl = ossCallbackUrl;
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
         * SignUrl.
         */
        public Builder signUrl(String signUrl) {
            this.signUrl = signUrl;
            return this;
        }

        public DescribeFileUploadSignedUrlResponseBody build() {
            return new DescribeFileUploadSignedUrlResponseBody(this);
        } 

    } 

}
