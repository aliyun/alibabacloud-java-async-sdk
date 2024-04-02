// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20170823.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUploadInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUploadInfoResponseBody</p>
 */
public class DescribeUploadInfoResponseBody extends TeaModel {
    @NameInMap("Accessid")
    private String accessid;

    @NameInMap("Expire")
    private Integer expire;

    @NameInMap("Folder")
    private String folder;

    @NameInMap("Host")
    private String host;

    @NameInMap("Policy")
    private String policy;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Signature")
    private String signature;

    private DescribeUploadInfoResponseBody(Builder builder) {
        this.accessid = builder.accessid;
        this.expire = builder.expire;
        this.folder = builder.folder;
        this.host = builder.host;
        this.policy = builder.policy;
        this.requestId = builder.requestId;
        this.signature = builder.signature;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUploadInfoResponseBody create() {
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
    public Integer getExpire() {
        return this.expire;
    }

    /**
     * @return folder
     */
    public String getFolder() {
        return this.folder;
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
        private Integer expire; 
        private String folder; 
        private String host; 
        private String policy; 
        private String requestId; 
        private String signature; 

        /**
         * Accessid.
         */
        public Builder accessid(String accessid) {
            this.accessid = accessid;
            return this;
        }

        /**
         * Expire.
         */
        public Builder expire(Integer expire) {
            this.expire = expire;
            return this;
        }

        /**
         * Folder.
         */
        public Builder folder(String folder) {
            this.folder = folder;
            return this;
        }

        /**
         * Host.
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * Policy.
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
         * Signature.
         */
        public Builder signature(String signature) {
            this.signature = signature;
            return this;
        }

        public DescribeUploadInfoResponseBody build() {
            return new DescribeUploadInfoResponseBody(this);
        } 

    } 

}
