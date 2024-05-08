// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * The Alibaba Cloud Resource Name (ARN) of the secret.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the secret.
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * The version number of the secret after the secret is rotated.
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
