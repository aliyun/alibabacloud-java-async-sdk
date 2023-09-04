// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMFAAuthenticationSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetMFAAuthenticationSettingsResponseBody</p>
 */
public class GetMFAAuthenticationSettingsResponseBody extends TeaModel {
    @NameInMap("MFAAuthenticationAdvanceSettings")
    private String MFAAuthenticationAdvanceSettings;

    @NameInMap("RequestId")
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
         * Indicates whether MFA is enabled for all users. Valid values:
         * <p>
         * 
         * *   Enabled: MFA is enabled for all users.
         * *   Byuser: User-specific settings are applied.
         * *   Disabled: MFA is disabled for all users.
         */
        public Builder MFAAuthenticationAdvanceSettings(String MFAAuthenticationAdvanceSettings) {
            this.MFAAuthenticationAdvanceSettings = MFAAuthenticationAdvanceSettings;
            return this;
        }

        /**
         * The ID of the request.
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
