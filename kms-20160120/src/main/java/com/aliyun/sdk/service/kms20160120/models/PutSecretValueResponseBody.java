// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutSecretValueResponseBody} extends {@link TeaModel}
 *
 * <p>PutSecretValueResponseBody</p>
 */
public class PutSecretValueResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    @com.aliyun.core.annotation.NameInMap("VersionId")
    private String versionId;

    @com.aliyun.core.annotation.NameInMap("VersionStages")
    private VersionStages versionStages;

    private PutSecretValueResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secretName = builder.secretName;
        this.versionId = builder.versionId;
        this.versionStages = builder.versionStages;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PutSecretValueResponseBody create() {
        return builder().build();
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

    /**
     * @return versionStages
     */
    public VersionStages getVersionStages() {
        return this.versionStages;
    }

    public static final class Builder {
        private String requestId; 
        private String secretName; 
        private String versionId; 
        private VersionStages versionStages; 

        /**
         * The ID of the request, which is used to locate and troubleshoot issues.
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
         * The new version of the secret value.
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * The stage labels that are used to mark the new version.
         */
        public Builder versionStages(VersionStages versionStages) {
            this.versionStages = versionStages;
            return this;
        }

        public PutSecretValueResponseBody build() {
            return new PutSecretValueResponseBody(this);
        } 

    } 

    public static class VersionStages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VersionStage")
        private java.util.List < String > versionStage;

        private VersionStages(Builder builder) {
            this.versionStage = builder.versionStage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VersionStages create() {
            return builder().build();
        }

        /**
         * @return versionStage
         */
        public java.util.List < String > getVersionStage() {
            return this.versionStage;
        }

        public static final class Builder {
            private java.util.List < String > versionStage; 

            /**
             * VersionStage.
             */
            public Builder versionStage(java.util.List < String > versionStage) {
                this.versionStage = versionStage;
                return this;
            }

            public VersionStages build() {
                return new VersionStages(this);
            } 

        } 

    }
}
