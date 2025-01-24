// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20201002.models;

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
 * {@link OssUploadCredential} extends {@link TeaModel}
 *
 * <p>OssUploadCredential</p>
 */
public class OssUploadCredential extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessKeyId")
    private String accessKeyId;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("FilePath")
    private String filePath;

    @com.aliyun.core.annotation.NameInMap("OssPolicy")
    private String ossPolicy;

    @com.aliyun.core.annotation.NameInMap("OssSignature")
    private String ossSignature;

    @com.aliyun.core.annotation.NameInMap("StsToken")
    private String stsToken;

    private OssUploadCredential(Builder builder) {
        this.accessKeyId = builder.accessKeyId;
        this.endpoint = builder.endpoint;
        this.filePath = builder.filePath;
        this.ossPolicy = builder.ossPolicy;
        this.ossSignature = builder.ossSignature;
        this.stsToken = builder.stsToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OssUploadCredential create() {
        return builder().build();
    }

    /**
     * @return accessKeyId
     */
    public String getAccessKeyId() {
        return this.accessKeyId;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return filePath
     */
    public String getFilePath() {
        return this.filePath;
    }

    /**
     * @return ossPolicy
     */
    public String getOssPolicy() {
        return this.ossPolicy;
    }

    /**
     * @return ossSignature
     */
    public String getOssSignature() {
        return this.ossSignature;
    }

    /**
     * @return stsToken
     */
    public String getStsToken() {
        return this.stsToken;
    }

    public static final class Builder {
        private String accessKeyId; 
        private String endpoint; 
        private String filePath; 
        private String ossPolicy; 
        private String ossSignature; 
        private String stsToken; 

        /**
         * AccessKeyId.
         */
        public Builder accessKeyId(String accessKeyId) {
            this.accessKeyId = accessKeyId;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * FilePath.
         */
        public Builder filePath(String filePath) {
            this.filePath = filePath;
            return this;
        }

        /**
         * OssPolicy.
         */
        public Builder ossPolicy(String ossPolicy) {
            this.ossPolicy = ossPolicy;
            return this;
        }

        /**
         * OssSignature.
         */
        public Builder ossSignature(String ossSignature) {
            this.ossSignature = ossSignature;
            return this;
        }

        /**
         * StsToken.
         */
        public Builder stsToken(String stsToken) {
            this.stsToken = stsToken;
            return this;
        }

        public OssUploadCredential build() {
            return new OssUploadCredential(this);
        } 

    } 

}
