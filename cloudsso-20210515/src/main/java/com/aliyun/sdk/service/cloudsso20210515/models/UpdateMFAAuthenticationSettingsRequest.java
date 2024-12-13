// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

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
        private String directoryId; 
        private String MFAAuthenticationSettings; 
        private String operationForRiskLogin; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMFAAuthenticationSettingsRequest request) {
            super(request);
            this.directoryId = request.directoryId;
            this.MFAAuthenticationSettings = request.MFAAuthenticationSettings;
            this.operationForRiskLogin = request.operationForRiskLogin;
        } 

        /**
         * <p>The ID of the directory.</p>
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
         * <p>Specifies whether to enable MFA for all users. Valid value:</p>
         * <ul>
         * <li>Enabled: enables MFA for all users.</li>
         * <li>Byuser: uses user-specific settings. For more information about how to configure MFA for a single user, see <a href="https://help.aliyun.com/document_detail/450135.html">UpdateUserMFAAuthenticationSettings</a>.</li>
         * <li>Disabled: disables MFA for all users.</li>
         * <li>OnlyRiskyLogin: MFA is required only for unusual logons.</li>
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
         * <p>Specifies whether MFA is required for users who initiated unusual logons. Valid value:</p>
         * <ul>
         * <li><p>Autonomous: MFA is prompted for users who initiated unusual logons. However, the users are allowed to skip MFA. If an MFA device is bound to a user who initiated an unusual logon, the user must pass MFA.</p>
         * </li>
         * <li><p>EnforceVerify: MFA is required. If no MFA devices are bound to a user who initiated an unusual logon, the user must bind an MFA device. If an MFA device is already bound to a user who initiated an unusual logon, the user must pass MFA.</p>
         * </li>
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
