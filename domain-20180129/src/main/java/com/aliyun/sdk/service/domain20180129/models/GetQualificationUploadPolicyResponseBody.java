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
 * {@link GetQualificationUploadPolicyResponseBody} extends {@link TeaModel}
 *
 * <p>GetQualificationUploadPolicyResponseBody</p>
 */
public class GetQualificationUploadPolicyResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessid")
    private String accessid;

    @com.aliyun.core.annotation.NameInMap("Dir")
    private String dir;

    @com.aliyun.core.annotation.NameInMap("Expire")
    private String expire;

    @com.aliyun.core.annotation.NameInMap("Host")
    private String host;

    @com.aliyun.core.annotation.NameInMap("Policy")
    private String policy;

    @com.aliyun.core.annotation.NameInMap("Prefix")
    private String prefix;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Signature")
    private String signature;

    private GetQualificationUploadPolicyResponseBody(Builder builder) {
        this.accessid = builder.accessid;
        this.dir = builder.dir;
        this.expire = builder.expire;
        this.host = builder.host;
        this.policy = builder.policy;
        this.prefix = builder.prefix;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetQualificationUploadPolicyResponseBody create() {
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
     * @return dir
     */
    public String getDir() {
        return this.dir;
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
     * @return policy
     */
    public String getPolicy() {
        return this.policy;
    }

    /**
     * @return prefix
     */
    public String getPrefix() {
        return this.prefix;
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
        private String dir; 
        private String expire; 
        private String host; 
        private String policy; 
        private String prefix; 
        private String requestId; 
        private String signature; 

        private Builder() {
        } 

        private Builder(GetQualificationUploadPolicyResponseBody model) {
            this.accessid = model.accessid;
            this.dir = model.dir;
            this.expire = model.expire;
            this.host = model.host;
            this.policy = model.policy;
            this.prefix = model.prefix;
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
         * <p>File path.</p>
         * 
         * <strong>example:</strong>
         * <p>20211220/131953297274****_4de3db85-4f98-488d-845b-d75bf035b13d</p>
         */
        public Builder dir(String dir) {
            this.dir = dir;
            return this;
        }

        /**
         * <p>Expiration time.</p>
         * 
         * <strong>example:</strong>
         * <p>1593688811881</p>
         */
        public Builder expire(String expire) {
            this.expire = expire;
            return this;
        }

        /**
         * <p>OSS Endpoint.</p>
         * 
         * <strong>example:</strong>
         * <p>https://<strong><strong><strong><strong>-review.oss-cn-</strong></strong></strong></strong>.aliyuncs.com</p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>Encryption policy.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJleHBpcmF0aW9uIjoiMjAaMC0wNy0wMlQxKToyMDoxMS44ODRaIiwiY29uZGl0aW9ucyI6W1siY29udGVudC1sZW5ndGgtcmFuZ2UiLDAsNTI0Mjg4MDBdLFsic3RhcnRzLXdpdGgiLCIka2V5IiwiMTIxOTU0MTE2MTIxMzA1Ny9PRkZMSU5FX1RSQU5TRkVSLzE1OTM2ODg1MTE4ODMi****</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>File prefix.</p>
         * 
         * <strong>example:</strong>
         * <p>20211220/131953297274****<em>4de3db85-4f98-488d-845b-d75bf035b13d</em>${filename}</p>
         */
        public Builder prefix(String prefix) {
            this.prefix = prefix;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9DFCF6F8-243C-****-8035-4B12FEFD7D48</p>
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

        public GetQualificationUploadPolicyResponseBody build() {
            return new GetQualificationUploadPolicyResponseBody(this);
        } 

    } 

}
