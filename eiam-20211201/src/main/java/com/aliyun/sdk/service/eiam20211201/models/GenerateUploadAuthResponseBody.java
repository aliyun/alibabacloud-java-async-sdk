// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link GenerateUploadAuthResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateUploadAuthResponseBody</p>
 */
public class GenerateUploadAuthResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessId")
    private String accessId;

    @com.aliyun.core.annotation.NameInMap("DownLoadUrl")
    private String downLoadUrl;

    @com.aliyun.core.annotation.NameInMap("EncryptedKey")
    private String encryptedKey;

    @com.aliyun.core.annotation.NameInMap("Expire")
    private Long expire;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("Key")
    private String key;

    @com.aliyun.core.annotation.NameInMap("PlaintextKey")
    private String plaintextKey;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    private GenerateUploadAuthResponseBody(Builder builder) {
        this.accessId = builder.accessId;
        this.downLoadUrl = builder.downLoadUrl;
        this.encryptedKey = builder.encryptedKey;
        this.expire = builder.expire;
        this.host = builder.host;
        this.key = builder.key;
        this.plaintextKey = builder.plaintextKey;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.securityToken = builder.securityToken;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateUploadAuthResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessId
     */
    public String getAccessId() {
        return this.accessId;
    }

    /**
     * @return downLoadUrl
     */
    public String getDownLoadUrl() {
        return this.downLoadUrl;
    }

    /**
     * @return encryptedKey
     */
    public String getEncryptedKey() {
        return this.encryptedKey;
    }

    /**
     * @return expire
     */
    public Long getExpire() {
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
     * @return plaintextKey
     */
    public String getPlaintextKey() {
        return this.plaintextKey;
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
        private String accessId; 
        private String downLoadUrl; 
        private String encryptedKey; 
        private Long expire; 
        private String host; 
        private String key; 
        private String plaintextKey; 
        private String policy; 
        private String requestId; 
        private String securityToken; 
        private String signature; 

        private Builder() {
        } 

        private Builder(GenerateUploadAuthResponseBody model) {
            this.accessId = model.accessId;
            this.downLoadUrl = model.downLoadUrl;
            this.encryptedKey = model.encryptedKey;
            this.expire = model.expire;
            this.host = model.host;
            this.key = model.key;
            this.plaintextKey = model.plaintextKey;
            this.policy = model.policy;
            this.requestId = model.requestId;
            this.securityToken = model.securityToken;
            this.signature = model.signature;
        } 

        /**
         * <p>认证的AccessId</p>
         * 
         * <strong>example:</strong>
         * <p>STS.NYgAmE3cyPoMDxtWgtwG3xxxx</p>
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * <p>预下载地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://temp.oss.aliyuncs.com/idaas_ly77wa2oexrciw5v672vizxxxx/file_import/68866d21-0ab7-450d-b9e6-5b1eafe06xxxx">https://temp.oss.aliyuncs.com/idaas_ly77wa2oexrciw5v672vizxxxx/file_import/68866d21-0ab7-450d-b9e6-5b1eafe06xxxx</a></p>
         */
        public Builder downLoadUrl(String downLoadUrl) {
            this.downLoadUrl = downLoadUrl;
            return this;
        }

        /**
         * EncryptedKey.
         */
        public Builder encryptedKey(String encryptedKey) {
            this.encryptedKey = encryptedKey;
            return this;
        }

        /**
         * <p>过期时间</p>
         * 
         * <strong>example:</strong>
         * <p>1766470716</p>
         */
        public Builder expire(Long expire) {
            this.expire = expire;
            return this;
        }

        /**
         * <p>bucket地址host</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://temp.oss.aliyuncs.com">https://temp.oss.aliyuncs.com</a></p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>认证对应的key</p>
         * 
         * <strong>example:</strong>
         * <p>idaas-csv://idaas_ly77wa2oexrciw5v672vizxxxx
         * /file_import/68866d21-0ab7-450d-b9e6-5b1eafxxxx&quot;</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * PlaintextKey.
         */
        public Builder plaintextKey(String plaintextKey) {
            this.plaintextKey = plaintextKey;
            return this;
        }

        /**
         * <p>认证的policy</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAyNS0xMi0yM1QwNjoxODozNi4zNTZaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsMTA0ODU3NjBdLHsiYnVja2V0IjoidGVtcC1pZGFhcy1laWFtLWNuLWhhbmd6aG91In0seyJrZXkiOiJpZGFhc19seTc3d2Eyb2V4cmNpdzV2Njcydml6eG12ZS9maWxlX2ltcG9ydC82ODg2NmQyMS0wYWI3LTQ1MGQtYjllNi01YjFlYWZlMDYzZTEifSx7Ingtb3NzLWZvcmJpZC1vdmVyd3JpdGUiOiJ0cnVlIn0seyJ4LW9zcy1vYmplY3QtYWNsIjoicHJpdmF0ZSJxxxx</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
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

        /**
         * <p>认证的签名</p>
         * 
         * <strong>example:</strong>
         * <p>t3JyykEKg3kHQuUrhaXYxtboUxxxxx</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public GenerateUploadAuthResponseBody build() {
            return new GenerateUploadAuthResponseBody(this);
        } 

    } 

}
