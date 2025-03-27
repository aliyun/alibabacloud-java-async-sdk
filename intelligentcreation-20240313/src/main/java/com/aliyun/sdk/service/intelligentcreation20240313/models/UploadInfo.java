// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.intelligentcreation20240313.models;

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
 * {@link UploadInfo} extends {@link TeaModel}
 *
 * <p>UploadInfo</p>
 */
public class UploadInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accessId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessId;

    @com.aliyun.core.annotation.NameInMap("host")
    @com.aliyun.core.annotation.Validation(required = true)
    private String host;

    @com.aliyun.core.annotation.NameInMap("key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.NameInMap("policy")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policy;

    @com.aliyun.core.annotation.NameInMap("policySignature")
    @com.aliyun.core.annotation.Validation(required = true)
    private String policySignature;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private UploadInfo(Builder builder) {
        this.accessId = builder.accessId;
        this.host = builder.host;
        this.key = builder.key;
        this.policy = builder.policy;
        this.policySignature = builder.policySignature;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadInfo create() {
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
     * @return policySignature
     */
    public String getPolicySignature() {
        return this.policySignature;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String accessId; 
        private String host; 
        private String key; 
        private String policy; 
        private String policySignature; 
        private String url; 

        private Builder() {
        } 

        private Builder(UploadInfo model) {
            this.accessId = model.accessId;
            this.host = model.host;
            this.key = model.key;
            this.policy = model.policy;
            this.policySignature = model.policySignature;
            this.url = model.url;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxx</p>
         */
        public Builder accessId(String accessId) {
            this.accessId = accessId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>yic-pre.oss-cn-hangzhou.aliyuncs.com</p>
         */
        public Builder host(String host) {
            this.host = host;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234/temp-novels/xxxx-xxx-xx.txt</p>
         */
        public Builder key(String key) {
            this.key = key;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxxx</p>
         */
        public Builder policy(String policy) {
            this.policy = policy;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxxxx</p>
         */
        public Builder policySignature(String policySignature) {
            this.policySignature = policySignature;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public UploadInfo build() {
            return new UploadInfo(this);
        } 

    } 

}
