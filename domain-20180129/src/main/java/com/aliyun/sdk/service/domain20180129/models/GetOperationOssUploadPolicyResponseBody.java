// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.domain20180129.models;

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
 * {@link GetOperationOssUploadPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetOperationOssUploadPolicyResponseBody</p>
 */
public class GetOperationOssUploadPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessid")
    private String accessid;

    @com.aliyun.core.annotation.NameInMap("EncodedPolicy")
    private String encodedPolicy;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private String expireTime;

    @com.aliyun.core.annotation.NameInMap("FileDir")
    private String fileDir;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    private GetOperationOssUploadPolicyResponseBody(Builder builder) {
        this.accessid = builder.accessid;
        this.encodedPolicy = builder.encodedPolicy;
        this.expireTime = builder.expireTime;
        this.fileDir = builder.fileDir;
        this.host = builder.host;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOperationOssUploadPolicyResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessid
     */
    public String getAccessid() {
        return this.accessid;
    }

    /**
     * @return encodedPolicy
     */
    public String getEncodedPolicy() {
        return this.encodedPolicy;
    }

    /**
     * @return expireTime
     */
    public String getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return fileDir
     */
    public String getFileDir() {
        return this.fileDir;
    }

    /**
     * @return host
     */
    public String getHost() {
        return this.host;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return signature
     */
    public String getSignature() {
        return this.signature;
    }

    public static final class Builder {
        private String accessid; 
        private String encodedPolicy; 
        private String expireTime; 
        private String fileDir; 
        private String host; 
        private String requestId; 
        private String signature; 

        private Builder() {
        } 

        private Builder(GetOperationOssUploadPolicyResponseBody model) {
            this.accessid = model.accessid;
            this.encodedPolicy = model.encodedPolicy;
            this.expireTime = model.expireTime;
            this.fileDir = model.fileDir;
            this.host = model.host;
            this.requestId = model.requestId;
            this.signature = model.signature;
        } 

        /**
         * <p>Access ID.</p>
         * 
         * <strong>example:</strong>
         * <p>hObpgEXoca42****</p>
         */
        public Builder accessid(String accessid) {
            this.accessid = accessid;
            return this;
        }

        /**
         * <p>Encrypted policy.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAaMC0wNy0wMlQxKToyMDoxMS44ODRaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsNTI0Mjg4MDBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwiMTIxOTU0MTE2MTIxMzA1Ny9PRkZMSU5FX1RSQU5TRkVSLzE1OTM2ODg1MTE4ODMi****</p>
         */
        public Builder encodedPolicy(String encodedPolicy) {
            this.encodedPolicy = encodedPolicy;
            return this;
        }

        /**
         * <p>Expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1593688811881</p>
         */
        public Builder expireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>File directory.</p>
         * 
         * <strong>example:</strong>
         * <p>1219541161213157/OFFLINE_TRANSFER/159368851****</p>
         */
        public Builder fileDir(String fileDir) {
            this.fileDir = fileDir;
            return this;
        }

        /**
         * <p>OSS Endpoint。</p>
         * 
         * <strong>example:</strong>
         * <p>//<em><strong>-basic-cert.oss-cn-</strong></em>.aliyuncs.com/</p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DFCF6F8-243C-40EC-8035-4B12FEFD7D011</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Signature data.</p>
         * 
         * <strong>example:</strong>
         * <p>pNVECGkyL0tl4bKXekV5ErZ****</p>
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public GetOperationOssUploadPolicyResponseBody build() {
            return new GetOperationOssUploadPolicyResponseBody(this);
        } 

    } 

}
