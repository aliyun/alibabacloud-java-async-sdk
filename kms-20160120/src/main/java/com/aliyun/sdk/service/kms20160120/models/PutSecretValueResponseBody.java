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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(PutSecretValueResponseBody model) {
            this.requestId = model.requestId;
            this.secretName = model.secretName;
            this.versionId = model.versionId;
            this.versionStages = model.versionStages;
        } 

        /**
         * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>f94ec9d3-2d10-4922-9a5c-5dcd5ebcb5e8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The new version of the secret value.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000000000000000000000000000203</p>
         */
        public Builder versionId(String versionId) {
            this.versionId = versionId;
            return this;
        }

        /**
         * <p>The stage labels that are used to mark the new version.</p>
         */
        public Builder versionStages(VersionStages versionStages) {
            this.versionStages = versionStages;
            return this;
        }

        public PutSecretValueResponseBody build() {
            return new PutSecretValueResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PutSecretValueResponseBody} extends {@link TeaModel}
     *
     * <p>PutSecretValueResponseBody</p>
     */
    public static class VersionStages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("VersionStage")
        private java.util.List<String> versionStage;

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
        public java.util.List<String> getVersionStage() {
            return this.versionStage;
        }

        public static final class Builder {
            private java.util.List<String> versionStage; 

            private Builder() {
            } 

            private Builder(VersionStages model) {
                this.versionStage = model.versionStage;
            } 

            /**
             * VersionStage.
             */
            public Builder versionStage(java.util.List<String> versionStage) {
                this.versionStage = versionStage;
                return this;
            }

            public VersionStages build() {
                return new VersionStages(this);
            } 

        } 

    }
}
