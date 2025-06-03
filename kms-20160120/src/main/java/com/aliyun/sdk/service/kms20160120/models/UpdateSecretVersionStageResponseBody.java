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

    public static final class Builder {
        private String requestId; 
        private String secretName; 

        private Builder() {
        } 

        private Builder(UpdateSecretVersionStageResponseBody model) {
            this.requestId = model.requestId;
            this.secretName = model.secretName;
        } 

        /**
         * <p>The name of the secret.</p>
         * 
         * <strong>example:</strong>
         * <p>8cad259f-4d77-40ec-bbd7-b9c47a423bb9</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The version to which you want to apply the specified stage label.</p>
         * <blockquote>
         * <ul>
         * <li>You must specify at least one of the RemoveFromVersion and MoveToVersion parameters.</li>
         * <li>If the VersionStage parameter is set to ACSCurrent or ACSPrevious, this parameter is required.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
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
