// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetMFAAuthenticationSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetMFAAuthenticationSettingsResponseBody</p>
 */
public class GetMFAAuthenticationSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MFAAuthenticationAdvanceSettings")
    private String MFAAuthenticationAdvanceSettings;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMFAAuthenticationSettingsResponseBody(Builder builder) {
        this.MFAAuthenticationAdvanceSettings = builder.MFAAuthenticationAdvanceSettings;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMFAAuthenticationSettingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return MFAAuthenticationAdvanceSettings
     */
    public String getMFAAuthenticationAdvanceSettings() {
        return this.MFAAuthenticationAdvanceSettings;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String MFAAuthenticationAdvanceSettings; 
        private String requestId; 

        /**
         * <p>Indicates whether MFA is enabled for all users. Valid values:</p>
         * <ul>
         * <li>Enabled: MFA is enabled for all users.</li>
         * <li>Byuser: User-specific settings are applied.</li>
         * <li>Disabled: MFA is disabled for all users.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder MFAAuthenticationAdvanceSettings(String MFAAuthenticationAdvanceSettings) {
            this.MFAAuthenticationAdvanceSettings = MFAAuthenticationAdvanceSettings;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A2BC00C5-76A2-5FFC-A340-927940A98377</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMFAAuthenticationSettingsResponseBody build() {
            return new GetMFAAuthenticationSettingsResponseBody(this);
        } 

    } 

}
