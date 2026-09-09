// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

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
 * {@link DescribeComfyUserDataUploadUrlResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeComfyUserDataUploadUrlResponseBody</p>
 */
public class DescribeComfyUserDataUploadUrlResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Long code;

    @com.aliyun.core.annotation.NameInMap("ExpiredTime")
    private String expiredTime;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadUrl")
    private String uploadUrl;

    private DescribeComfyUserDataUploadUrlResponseBody(Builder builder) {
        this.code = builder.code;
        this.expiredTime = builder.expiredTime;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.uploadUrl = builder.uploadUrl;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeComfyUserDataUploadUrlResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return expiredTime
     */
    public String getExpiredTime() {
        return this.expiredTime;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
        private Long code; 
        private String expiredTime; 
        private String message; 
        private String requestId; 
        private String uploadUrl; 

        private Builder() {
        } 

        private Builder(DescribeComfyUserDataUploadUrlResponseBody model) {
            this.code = model.code;
            this.expiredTime = model.expiredTime;
            this.message = model.message;
            this.requestId = model.requestId;
            this.uploadUrl = model.uploadUrl;
        } 

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder code(Long code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The expiration time of the upload URL.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-08-28T16:00Z</p>
         */
        public Builder expiredTime(String expiredTime) {
            this.expiredTime = expiredTime;
            return this;
        }

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>BEA5625F-8FCF-48F4-851B-CA63946DA664</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The URL for uploading the user file.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-bucket.oss-cn-shanghai-cloudspe.aliyuncs.com/path/userid/test.png?x-oss-date=20260602T093618Z&amp;x-oss-expires=29&amp;x-oss-security-token=xxxxx%2F68FY2NI6nyNgueynMjneKjKXD6l5tS5h3S2%xxxxx%xxxx%xxxxxxx%2Fb%xxxx%sdffeeeaasdf%xxx%xx%xx%xxxx%2BeASOv2N8q%xxx%2B6XBxllroojFliSTfsqGI2YMHpoRwJmyfXK32BQPb2SvQ0AM23soq%2FspAI4f9vtFG0yv9fKWMw%xxxxxxxxx%xxxxxxxx%3D%3D&amp;x-oss-signature-version=OSS4-HMAC&amp;x-oss-credential=STS.xxxxx%2F20260dfa202%2Fcn-shanghai-cloud%2Foss%2Faliyun_v4_request&amp;x-oss-signature=xxxxxxxxxxxxxx</p>
         */
        public Builder uploadUrl(String uploadUrl) {
            this.uploadUrl = uploadUrl;
            return this;
        }

        public DescribeComfyUserDataUploadUrlResponseBody build() {
            return new DescribeComfyUserDataUploadUrlResponseBody(this);
        } 

    } 

}
