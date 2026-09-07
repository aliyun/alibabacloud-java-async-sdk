// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20210602.models;

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
 * {@link GetOssStsTokenResponseBody} extends {@link TeaModel}
 *
 * <p>GetOssStsTokenResponseBody</p>
 */
public class GetOssStsTokenResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeyId")
    private String accessKeyId;

    @com.aliyun.core.annotation.NameInMap("AccessKeySecret")
    private String accessKeySecret;

    @com.aliyun.core.annotation.NameInMap("Bucket")
    private String bucket;

    @com.aliyun.core.annotation.NameInMap("ObjectKeyPrefix")
    private String objectKeyPrefix;

    @com.aliyun.core.annotation.NameInMap("OssRegion")
    private String ossRegion;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private GetOssStsTokenResponseBody(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.accessKeySecret = builder.accessKeySecret;
        this.bucket = builder.bucket;
        this.objectKeyPrefix = builder.objectKeyPrefix;
        this.ossRegion = builder.ossRegion;
        this.requestId = builder.requestId;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOssStsTokenResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * @return accessKeySecret
     */
    public String getAccessKeySecret() {
        return this.accessKeySecret;
    }

    /**
     * @return bucket
     */
    public String getBucket() {
        return this.bucket;
    }

    /**
     * @return objectKeyPrefix
     */
    public String getObjectKeyPrefix() {
        return this.objectKeyPrefix;
    }

    /**
     * @return ossRegion
     */
    public String getOssRegion() {
        return this.ossRegion;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String accessKeySecret; 
        private String bucket; 
        private String objectKeyPrefix; 
        private String ossRegion; 
        private String requestId; 
        private String securityToken; 

        private Builder() {
        } 

        private Builder(GetOssStsTokenResponseBody model) {
            this.accessKeyId = model.accessKeyId;
            this.accessKeySecret = model.accessKeySecret;
            this.bucket = model.bucket;
            this.objectKeyPrefix = model.objectKeyPrefix;
            this.ossRegion = model.ossRegion;
            this.requestId = model.requestId;
            this.securityToken = model.securityToken;
        } 

        /**
         * <p>The AccessKey ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>STS.NZeNA1kdCm4QPuAJ9kN******</p>
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * <p>The STS temporary AccessKey secret.</p>
         * 
         * <strong>example:</strong>
         * <p>9EStV7fgkSQsPuBi576EmNQXLxJGddL2EGyX********</p>
         */
        public Builder accessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }

        /**
         * <p>The logical OSS bucket name.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-wy-*****</p>
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * <p>The project storage path.</p>
         */
        public Builder objectKeyPrefix(String objectKeyPrefix) {
            this.objectKeyPrefix = objectKeyPrefix;
            return this;
        }

        /**
         * <p>The region to which the current OSS bucket belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou</p>
         */
        public Builder ossRegion(String ossRegion) {
            this.ossRegion = ossRegion;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The Security Token Service (STS) token.</p>
         * 
         * <strong>example:</strong>
         * <p>CAISvAN1q6Ft5B2yfSjIr5n2Bez81ZRTgqOGZn6FkHBnXf9qgI6apjz2IH*******</p>
         */
        public Builder securityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        public GetOssStsTokenResponseBody build() {
            return new GetOssStsTokenResponseBody(this);
        } 

    } 

}
