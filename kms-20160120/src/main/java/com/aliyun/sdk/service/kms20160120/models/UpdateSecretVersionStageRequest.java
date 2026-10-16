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
         * <p>The version number of the secret. This parameter specifies that the version stage set by VersionStage is attached to this version.</p>
         * <blockquote>
         * <ul>
         * <li><p>You must specify at least one of RemoveFromVersion and MoveToVersion.</p>
         * </li>
         * <li><p>If you set VersionStage to ACSCurrent or ACSPrevious, you must specify this parameter.</p>
         * </li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>002</p>
         */
        public Builder moveToVersion(String moveToVersion) {
            this.putQueryParameter("MoveToVersion", moveToVersion);
            this.moveToVersion = moveToVersion;
            return this;
        }

        /**
         * <p>The version number of the secret. This parameter specifies that the version stage set by VersionStage is removed from this version.</p>
         * <blockquote>
         * <p>You must specify at least one of RemoveFromVersion and MoveToVersion.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>001</p>
         */
        public Builder removeFromVersion(String removeFromVersion) {
            this.putQueryParameter("RemoveFromVersion", removeFromVersion);
            this.removeFromVersion = removeFromVersion;
            return this;
        }

        /**
         * <p>The name or Alibaba Cloud Resource Name (ARN) of the secret.</p>
         * <blockquote>
         * <p>To access a secret in a different Alibaba Cloud account, you must specify the ARN of the secret. The ARN is in the format of <code>acs:kms:${region}:${account}:secret/${secret-name}</code>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>secret001</p>
         */
        public Builder secretName(String secretName) {
            this.putQueryParameter("SecretName", secretName);
            this.secretName = secretName;
            return this;
        }

        /**
         * <p>The version stage of the secret.</p>
         * <p><strong>Scenario 1: Add a version stage to a specified secret version.</strong></p>
         * <p>Specify this parameter and MoveToVersion. Do not specify RemoveFromVersion. This parameter can be set to ACSCurrent, ACSPrevious, or a custom stage.</p>
         * <p><strong>Scenario 2: Remove a version stage from a specified secret version.</strong></p>
         * <p>Specify this parameter and RemoveFromVersion. Do not specify MoveToVersion. This parameter must be set to a custom stage.</p>
         * <blockquote>
         * <p>ACSCurrent and ACSPrevious are system-reserved stages. You cannot directly remove them. You can only remove them from one secret version and attach them to another.</p>
         * </blockquote>
         * <p><strong>Scenario 3: Remove a version stage from a specified secret version and attach it to another secret version.</strong></p>
         * <p>Specify this parameter, MoveToVersion, and RemoveFromVersion. This parameter can be set to ACSCurrent, ACSPrevious, or a custom stage.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ACSCurrent</p>
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
