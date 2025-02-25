// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSecretVersionStageResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateSecretVersionStageResponseBody</p>
 */
public class UpdateSecretVersionStageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecretName")
    private String secretName;

    private UpdateSecretVersionStageResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.secretName = builder.secretName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecretVersionStageResponseBody create() {
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

    public static final class Builder {
        private String requestId; 
        private String secretName; 

        /**
         * The name of the secret.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The version to which you want to apply the specified stage label.
         * <p>
         * 
         * > * You must specify at least one of the RemoveFromVersion and MoveToVersion parameters.
         * > * If the VersionStage parameter is set to ACSCurrent or ACSPrevious, this parameter is required.
         */
        public Builder secretName(String secretName) {
            this.secretName = secretName;
            return this;
        }

        public UpdateSecretVersionStageResponseBody build() {
            return new UpdateSecretVersionStageResponseBody(this);
        } 

    } 

}
