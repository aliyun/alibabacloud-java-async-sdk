// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSecretVersionStageRequest} extends {@link RequestModel}
 *
 * <p>UpdateSecretVersionStageRequest</p>
 */
public class UpdateSecretVersionStageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MoveToVersion")
    private String moveToVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RemoveFromVersion")
    private String removeFromVersion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecretName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String secretName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VersionStage")
    @com.aliyun.core.annotation.Validation(required = true)
    private String versionStage;

    private UpdateSecretVersionStageRequest(Builder builder) {
        super(builder);
        this.moveToVersion = builder.moveToVersion;
        this.removeFromVersion = builder.removeFromVersion;
        this.secretName = builder.secretName;
        this.versionStage = builder.versionStage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSecretVersionStageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return moveToVersion
     */
    public String getMoveToVersion() {
        return this.moveToVersion;
    }

    /**
     * @return removeFromVersion
     */
    public String getRemoveFromVersion() {
        return this.removeFromVersion;
    }

    /**
     * @return secretName
     */
    public String getSecretName() {
        return this.secretName;
    }

    /**
     * @return versionStage
     */
    public String getVersionStage() {
        return this.versionStage;
    }

    public static final class Builder extends Request.Builder<UpdateSecretVersionStageRequest, Builder> {
        private String moveToVersion; 
        private String removeFromVersion; 
        private String secretName; 
        private String versionStage; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSecretVersionStageRequest request) {
            super(request);
            this.moveToVersion = request.moveToVersion;
            this.removeFromVersion = request.removeFromVersion;
            this.secretName = request.secretName;
            this.versionStage = request.versionStage;
        } 

        /**
         * The version from which you want to remove the specified stage label.
         * <p>
         * 
         * >  You must specify at least one of the RemoveFromVersion and MoveToVersion parameters.
         */
        public Builder moveToVersion(String moveToVersion) {
            this.putQueryParameter("MoveToVersion", moveToVersion);
            this.moveToVersion = moveToVersion;
            return this;
        }

        /**
         * The specified stage label. Valid values:
         * <p>
         * 
         * *   ACSCurrent
         * *   ACSPrevious
         * *   Custom stage label
         */
        public Builder removeFromVersion(String removeFromVersion) {
            this.putQueryParameter("RemoveFromVersion", removeFromVersion);
            this.removeFromVersion = removeFromVersion;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **UpdateSecretVersionStage**.
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * The name of the secret.
         */
        public Builder versionStage(String versionStage) {
            this.putQueryParameter("VersionStage", versionStage);
            this.versionStage = versionStage;
            return this;
        }

        @Override
        public UpdateSecretVersionStageRequest build() {
            return new UpdateSecretVersionStageRequest(this);
        } 

    } 

}
