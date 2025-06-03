// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

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
 * {@link RotateSecretResponseBody} extends {@link TeaModel}
 *
 * <p>RotateSecretResponseBody</p>
 */
public class RotateSecretResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    private RotateSecretResponseBody(Builder builder) {
        this.arn = builder.arn;
        this.requestId = builder.requestId;
        this.secretName = builder.secretName;
        this.versionId = builder.versionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RotateSecretResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return versionId
     */
    public String getVersionId() {
        return this.versionId;
    }

    public static final class Builder {
        private String arn; 
        private String requestId; 
        private String secretName; 
        private String versionId; 

        private Builder() {
        } 

        private Builder(RotateSecretResponseBody model) {
            this.arn = model.arn;
            this.requestId = model.requestId;
            this.secretName = model.secretName;
            this.versionId = model.versionId;
        } 

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:kms:cn-hangzhou:154035569884****:secret/RdsSecret/Mysql5.4/MyCred</p>
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>10257c86-269d-43aa-aaf3-90ed4144bb7c</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>RdsSecret/Mysql5.4/MyCred</p>
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The version number of the secret after the secret is rotated.</p>
         * 
         * <strong>example:</strong>
         * <p>000000123</p>
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        public RotateSecretResponseBody build() {
            return new RotateSecretResponseBody(this);
        } 

    } 

}
