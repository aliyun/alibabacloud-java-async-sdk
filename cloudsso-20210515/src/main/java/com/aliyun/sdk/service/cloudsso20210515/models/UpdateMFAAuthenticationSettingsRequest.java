// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
 * {@link UpdateMFAAuthenticationSettingsRequest} extends {@link RequestModel}
 *
 * <p>UpdateMFAAuthenticationSettingsRequest</p>
 */
public class UpdateMFAAuthenticationSettingsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowedVerificationTypes")
    private java.util.List<String> allowedVerificationTypes;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DirectoryId")
    private String directoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MFAAuthenticationSettings")
    private String MFAAuthenticationSettings;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationForRiskLogin")
    private String operationForRiskLogin;

    private UpdateMFAAuthenticationSettingsRequest(Builder builder) {
        super(builder);
        this.allowedVerificationTypes = builder.allowedVerificationTypes;
        this.directoryId = builder.directoryId;
        this.MFAAuthenticationSettings = builder.MFAAuthenticationSettings;
        this.operationForRiskLogin = builder.operationForRiskLogin;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMFAAuthenticationSettingsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowedVerificationTypes
     */
    public java.util.List<String> getAllowedVerificationTypes() {
        return this.allowedVerificationTypes;
    }

    /**
     * @return directoryId
     */
    public String getDirectoryId() {
        return this.directoryId;
    }

    /**
     * @return MFAAuthenticationSettings
     */
    public String getMFAAuthenticationSettings() {
        return this.MFAAuthenticationSettings;
    }

    /**
     * @return operationForRiskLogin
     */
    public String getOperationForRiskLogin() {
        return this.operationForRiskLogin;
    }

    public static final class Builder extends Request.Builder<UpdateMFAAuthenticationSettingsRequest, Builder> {
        private java.util.List<String> allowedVerificationTypes; 
        private String directoryId; 
        private String MFAAuthenticationSettings; 
        private String operationForRiskLogin; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMFAAuthenticationSettingsRequest request) {
            super(request);
            this.allowedVerificationTypes = request.allowedVerificationTypes;
            this.directoryId = request.directoryId;
            this.MFAAuthenticationSettings = request.MFAAuthenticationSettings;
            this.operationForRiskLogin = request.operationForRiskLogin;
        } 

        /**
         * AllowedVerificationTypes.
         */
        public Builder allowedVerificationTypes(java.util.List<String> allowedVerificationTypes) {
            String allowedVerificationTypesShrink = shrink(allowedVerificationTypes, "AllowedVerificationTypes", "json");
            this.putQueryParameter("AllowedVerificationTypes", allowedVerificationTypesShrink);
            this.allowedVerificationTypes = allowedVerificationTypes;
            return this;
        }

        /**
         * <p>The directory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d-00fc2p61****</p>
         */
        public Builder directoryId(String directoryId) {
            this.putQueryParameter("DirectoryId", directoryId);
            this.directoryId = directoryId;
            return this;
        }

        /**
         * <p>The global MFA settings. Valid values:</p>
         * <ul>
         * <li>Enabled: MFA verification is enabled for all users.</li>
         * <li>Byuser: MFA verification depends on the individual MFA settings of each user. For more information about individual user MFA settings, see <a href="https://help.aliyun.com/document_detail/450135.html">UpdateUserMFAAuthenticationSettings</a>.</li>
         * <li>Disabled: MFA verification is disabled for all users.</li>
         * <li>OnlyRiskyLogin: MFA verification is required only for unusual logon attempts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder MFAAuthenticationSettings(String MFAAuthenticationSettings) {
            this.putQueryParameter("MFAAuthenticationSettings", MFAAuthenticationSettings);
            this.MFAAuthenticationSettings = MFAAuthenticationSettings;
            return this;
        }

        /**
         * <p>The action to take when the MFA settings option is set to verify only for unusual logon attempts. Valid values:</p>
         * <ul>
         * <li>Autonomous: Users can skip MFA binding during unusual logon, but users who have already bound MFA must complete MFA verification.</li>
         * <li>EnforceVerify: Users who have not bound MFA are required to bind it, and users who have already bound MFA must complete verification.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Autonomous</p>
         */
        public Builder operationForRiskLogin(String operationForRiskLogin) {
            this.putQueryParameter("OperationForRiskLogin", operationForRiskLogin);
            this.operationForRiskLogin = operationForRiskLogin;
            return this;
        }

        @Override
        public UpdateMFAAuthenticationSettingsRequest build() {
            return new UpdateMFAAuthenticationSettingsRequest(this);
        } 

    } 

}
