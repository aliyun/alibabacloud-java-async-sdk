// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMFAAuthenticationSettingInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetMFAAuthenticationSettingInfoResponseBody</p>
 */
public class GetMFAAuthenticationSettingInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MFAAuthenticationSettingInfo")
    private MFAAuthenticationSettingInfo MFAAuthenticationSettingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The MFA setting of all users.</p>
         */
        public Builder MFAAuthenticationSettingInfo(MFAAuthenticationSettingInfo MFAAuthenticationSettingInfo) {
            this.MFAAuthenticationSettingInfo = MFAAuthenticationSettingInfo;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>95D3B107-DA80-5B34-A3D0-9E82F8F0DA0E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMFAAuthenticationSettingInfoResponseBody build() {
            return new GetMFAAuthenticationSettingInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMFAAuthenticationSettingInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetMFAAuthenticationSettingInfoResponseBody</p>
     */
    public static class MFAAuthenticationSettingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MfaAuthenticationAdvanceSettings")
        private String mfaAuthenticationAdvanceSettings;

        @com.aliyun.core.annotation.NameInMap("OperationForRiskLogin")
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
             * <p>The MFA policy of all users. Valid values:</p>
             * <ul>
             * <li>Enabled: MFA is enabled for all users.</li>
             * <li>Byuser: User-specific settings are applied. For more information about how to configure MFA for a single user, see <a href="https://help.aliyun.com/document_detail/450135.html">UpdateUserMFAAuthenticationSettings</a>.</li>
             * <li>Disabled: MFA is disabled for all users.</li>
             * <li>OnlyRiskyLogin: MFA is required only for unusual logons.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>OnlyRiskyLogin</p>
             */
            public Builder mfaAuthenticationAdvanceSettings(String mfaAuthenticationAdvanceSettings) {
                this.mfaAuthenticationAdvanceSettings = mfaAuthenticationAdvanceSettings;
                return this;
            }

            /**
             * <p>The MFA policy for unusual logons. Valid values:</p>
             * <ul>
             * <li>Autonomous: MFA is prompted for users who initiated unusual logons. However, the users are allowed to skip MFA. If an MFA device is bound to a user who initiated an unusual logon, the user must pass MFA.</li>
             * <li>EnforceVerify: MFA is required. If no MFA devices are bound to a user who initiated an unusual logon, the user must bind an MFA device. If an MFA device is already bound to a user who initiated an unusual logon, the user must pass MFA.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is displayed only when Byuser or OnlyRiskyLogin is returned for the MfaAuthenticationAdvanceSettings parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>EnforceVerify</p>
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
