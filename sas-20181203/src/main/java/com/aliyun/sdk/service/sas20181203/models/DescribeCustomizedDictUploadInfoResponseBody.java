// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link DescribeCustomizedDictUploadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizedDictUploadInfoResponseBody</p>
 */
public class DescribeCustomizedDictUploadInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessid")
    private String accessid;

    @com.aliyun.core.annotation.NameInMap("Expire")
    private String expire;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    private DescribeCustomizedDictUploadInfoResponseBody(Builder builder) {
        this.accessid = builder.accessid;
        this.expire = builder.expire;
        this.host = builder.host;
        this.key = builder.key;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.securityToken = builder.securityToken;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizedDictUploadInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return accessid
     */
    public String getAccessid() {
        return this.accessid;
    }

    /**
     * @return expire
     */
    public String getExpire() {
        return this.expire;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
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

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    public static final class Builder {
        private String accessid; 
        private String expire; 
        private String host; 
        private String key; 
        private String policy; 
        private String requestId; 
        private String securityToken; 
        private String signature; 

        /**
         * <p>The AccessKey ID that is required to access the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>LTAI4G1mgPbjvG********</p>
         */
        public Builder accessid(String accessid) {
            this.accessid = accessid;
            return this;
        }

        /**
         * <p>The time when the OSS signature expires. This value is a UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1719921470</p>
         */
        public Builder expire(String expire) {
            this.expire = expire;
            return this;
        }

        /**
         * <p>The OSS endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aegis-update-static-file.oss-cn-hangzhou.aliyuncs.com">https://aegis-update-static-file.oss-cn-hangzhou.aliyuncs.com</a></p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>The key of the OSS object.</p>
         * 
         * <strong>example:</strong>
         * <p>HC_CUSTOMIZED_DICT/176618589410****.tmp</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>The policy of the OSS bucket.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNC0wNy0wMlQxMTo1Nzo1MC44MzJaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsNDA5NjBdLFsiZXEiLCIka2V5IiwiSENfQ1VTVE9NSVpFRF9ESUNUXC8xNzY2MTg1ODk0MTA0Njc1LnRtc****</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BDEDEEE7-AC25-559E-8C12-5168B139****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security token.</p>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder securityToken(String securityToken) {
            this.securityToken = securityToken;
            return this;
        }

        /**
         * <p>The OSS signature.</p>
         * 
         * <strong>example:</strong>
         * <p>mWGRgn0CtdbVf8UuJbTXOmo2****</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public DescribeCustomizedDictUploadInfoResponseBody build() {
            return new DescribeCustomizedDictUploadInfoResponseBody(this);
        } 

    } 

}
