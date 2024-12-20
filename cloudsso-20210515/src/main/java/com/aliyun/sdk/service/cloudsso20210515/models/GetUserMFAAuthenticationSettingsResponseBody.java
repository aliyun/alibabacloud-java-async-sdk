// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetUserMFAAuthenticationSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetUserMFAAuthenticationSettingsResponseBody</p>
 */
public class GetUserMFAAuthenticationSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UserMFAAuthenticationSettings")
    private String userMFAAuthenticationSettings;

    private GetUserMFAAuthenticationSettingsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.userMFAAuthenticationSettings = builder.userMFAAuthenticationSettings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserMFAAuthenticationSettingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return userMFAAuthenticationSettings
     */
    public String getUserMFAAuthenticationSettings() {
        return this.userMFAAuthenticationSettings;
    }

    public static final class Builder {
        private String requestId; 
        private String userMFAAuthenticationSettings; 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>5B598B62-85E6-5792-9DF1-246D251B07DA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether MFA is enabled for the user. Valid values:</p>
         * <ul>
         * <li>Enabled: MFA is enabled for the user.</li>
         * <li>Disabled: MFA is disabled for the user.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Enabled</p>
         */
        public Builder userMFAAuthenticationSettings(String userMFAAuthenticationSettings) {
            this.userMFAAuthenticationSettings = userMFAAuthenticationSettings;
            return this;
        }

        public GetUserMFAAuthenticationSettingsResponseBody build() {
            return new GetUserMFAAuthenticationSettingsResponseBody(this);
        } 

    } 

}
