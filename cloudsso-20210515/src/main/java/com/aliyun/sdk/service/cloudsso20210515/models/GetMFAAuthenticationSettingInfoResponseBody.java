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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetMFAAuthenticationSettingInfoResponseBody model) {
            this.MFAAuthenticationSettingInfo = model.MFAAuthenticationSettingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The global MFA verification configuration.</p>
         */
        public Builder MFAAuthenticationSettingInfo(MFAAuthenticationSettingInfo MFAAuthenticationSettingInfo) {
            this.MFAAuthenticationSettingInfo = MFAAuthenticationSettingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
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
        @com.aliyun.core.annotation.NameInMap("AllowedVerificationTypes")
        private java.util.List<String> allowedVerificationTypes;

        @com.aliyun.core.annotation.NameInMap("MfaAuthenticationAdvanceSettings")
        private String mfaAuthenticationAdvanceSettings;

        @com.aliyun.core.annotation.NameInMap("OperationForRiskLogin")
        private String operationForRiskLogin;

        private MFAAuthenticationSettingInfo(Builder builder) {
            this.allowedVerificationTypes = builder.allowedVerificationTypes;
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
         * @return allowedVerificationTypes
         */
        public java.util.List<String> getAllowedVerificationTypes() {
            return this.allowedVerificationTypes;
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
            private java.util.List<String> allowedVerificationTypes; 
            private String mfaAuthenticationAdvanceSettings; 
            private String operationForRiskLogin; 

            private Builder() {
            } 

            private Builder(MFAAuthenticationSettingInfo model) {
                this.allowedVerificationTypes = model.allowedVerificationTypes;
                this.mfaAuthenticationAdvanceSettings = model.mfaAuthenticationAdvanceSettings;
                this.operationForRiskLogin = model.operationForRiskLogin;
            } 

            /**
             * AllowedVerificationTypes.
             */
            public Builder allowedVerificationTypes(java.util.List<String> allowedVerificationTypes) {
                this.allowedVerificationTypes = allowedVerificationTypes;
                return this;
            }

            /**
             * <p>The global MFA verification policy. Valid values:</p>
             * <ul>
             * <li>Enabled: MFA verification is enabled for all users.</li>
             * <li>Byuser: MFA verification depends on the independent MFA configuration of each user. For more information about user-specific MFA configuration, see <a href="https://help.aliyun.com/document_detail/450135.html">UpdateUserMFAAuthenticationSettings</a>.</li>
             * <li>Disabled: MFA verification is disabled for all users.</li>
             * <li>OnlyRiskyLogin: MFA verification is required only for unusual logon attempts.</li>
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
             * <p>The MFA verification policy for unusual logon attempts. Valid values:</p>
             * <ul>
             * <li>Autonomous: Users can skip MFA binding during unusual logon, but users who have already bound MFA must complete verification.</li>
             * <li>EnforceVerify: Users are required to bind or verify MFA during unusual logon.</li>
             * </ul>
             * <blockquote>
             * <p>This parameter is displayed only when MfaAuthenticationAdvanceSettings is set to Byuser or OnlyRiskyLogin.</p>
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
