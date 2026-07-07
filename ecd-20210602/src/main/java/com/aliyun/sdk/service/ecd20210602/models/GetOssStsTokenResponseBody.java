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
         * AccessKeyId.
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * AccessKeySecret.
         */
        public Builder accessKeySecret(String accessKeySecret) {
            this.accessKeySecret = accessKeySecret;
            return this;
        }

        /**
         * Bucket.
         */
        public Builder bucket(String bucket) {
            this.bucket = bucket;
            return this;
        }

        /**
         * ObjectKeyPrefix.
         */
        public Builder objectKeyPrefix(String objectKeyPrefix) {
            this.objectKeyPrefix = objectKeyPrefix;
            return this;
        }

        /**
         * OssRegion.
         */
        public Builder ossRegion(String ossRegion) {
            this.ossRegion = ossRegion;
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
         * SecurityToken.
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
