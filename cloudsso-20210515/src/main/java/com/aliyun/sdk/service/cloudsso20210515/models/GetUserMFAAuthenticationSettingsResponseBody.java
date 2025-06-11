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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetUserMFAAuthenticationSettingsResponseBody model) {
            this.requestId = model.requestId;
            this.userMFAAuthenticationSettings = model.userMFAAuthenticationSettings;
        } 

        /**
         * <p>The request ID.</p>
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
         * <li>Enabled</li>
         * <li>Disabled</li>
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
