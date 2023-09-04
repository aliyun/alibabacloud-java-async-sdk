// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMFAAuthenticationSettingInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetMFAAuthenticationSettingInfoResponseBody</p>
 */
public class GetMFAAuthenticationSettingInfoResponseBody extends TeaModel {
    @NameInMap("MFAAuthenticationSettingInfo")
    private MFAAuthenticationSettingInfo MFAAuthenticationSettingInfo;

    @NameInMap("RequestId")
    private String requestId;

    private GetMFAAuthenticationSettingInfoResponseBody(Builder builder) {
        this.MFAAuthenticationSettingInfo = builder.MFAAuthenticationSettingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMFAAuthenticationSettingInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return MFAAuthenticationSettingInfo
     */
    public MFAAuthenticationSettingInfo getMFAAuthenticationSettingInfo() {
        return this.MFAAuthenticationSettingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MFAAuthenticationSettingInfo MFAAuthenticationSettingInfo; 
        private String requestId; 

        /**
         * The MFA setting of all users.
         */
        public Builder MFAAuthenticationSettingInfo(MFAAuthenticationSettingInfo MFAAuthenticationSettingInfo) {
            this.MFAAuthenticationSettingInfo = MFAAuthenticationSettingInfo;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMFAAuthenticationSettingInfoResponseBody build() {
            return new GetMFAAuthenticationSettingInfoResponseBody(this);
        } 

    } 

    public static class MFAAuthenticationSettingInfo extends TeaModel {
        @NameInMap("MfaAuthenticationAdvanceSettings")
        private String mfaAuthenticationAdvanceSettings;

        @NameInMap("OperationForRiskLogin")
        private String operationForRiskLogin;

        private MFAAuthenticationSettingInfo(Builder builder) {
            this.mfaAuthenticationAdvanceSettings = builder.mfaAuthenticationAdvanceSettings;
            this.operationForRiskLogin = builder.operationForRiskLogin;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MFAAuthenticationSettingInfo create() {
            return builder().build();
        }

        /**
         * @return mfaAuthenticationAdvanceSettings
         */
        public String getMfaAuthenticationAdvanceSettings() {
            return this.mfaAuthenticationAdvanceSettings;
        }

        /**
         * @return operationForRiskLogin
         */
        public String getOperationForRiskLogin() {
            return this.operationForRiskLogin;
        }

        public static final class Builder {
            private String mfaAuthenticationAdvanceSettings; 
            private String operationForRiskLogin; 

            /**
             * The MFA policy of all users. Valid values:
             * <p>
             * 
             * *   Enabled: MFA is enabled for all users.
             * *   Byuser: User-specific settings are applied. For more information about how to configure MFA for a single user, see [UpdateUserMFAAuthenticationSettings](~~450135~~).
             * *   Disabled: MFA is disabled for all users.
             * *   OnlyRiskyLogin: MFA is required only for unusual logons.
             */
            public Builder mfaAuthenticationAdvanceSettings(String mfaAuthenticationAdvanceSettings) {
                this.mfaAuthenticationAdvanceSettings = mfaAuthenticationAdvanceSettings;
                return this;
            }

            /**
             * The MFA policy for unusual logons. Valid values:
             * <p>
             * 
             * *   Autonomous: MFA is prompted for users who initiated unusual logons. However, the users are allowed to skip MFA. If an MFA device is bound to a user who initiated an unusual logon, the user must pass MFA.
             * *   EnforceVerify: MFA is required. If no MFA devices are bound to a user who initiated an unusual logon, the user must bind an MFA device. If an MFA device is already bound to a user who initiated an unusual logon, the user must pass MFA.
             * 
             * > This parameter is displayed only when Byuser or OnlyRiskyLogin is returned for the MfaAuthenticationAdvanceSettings parameter.
             */
            public Builder operationForRiskLogin(String operationForRiskLogin) {
                this.operationForRiskLogin = operationForRiskLogin;
                return this;
            }

            public MFAAuthenticationSettingInfo build() {
                return new MFAAuthenticationSettingInfo(this);
            } 

        } 

    }
}
