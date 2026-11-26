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
 * {@link GetSecurityInfoPreferenceResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecurityInfoPreferenceResponseBody</p>
 */
public class GetSecurityInfoPreferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityInfoPreference")
    private SecurityInfoPreference securityInfoPreference;

    private GetSecurityInfoPreferenceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityInfoPreference = builder.securityInfoPreference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityInfoPreferenceResponseBody create() {
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
     * @return securityInfoPreference
     */
    public SecurityInfoPreference getSecurityInfoPreference() {
        return this.securityInfoPreference;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityInfoPreference securityInfoPreference; 

        private Builder() {
        } 

        private Builder(GetSecurityInfoPreferenceResponseBody model) {
            this.requestId = model.requestId;
            this.securityInfoPreference = model.securityInfoPreference;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>8CE8B990-193D-50CE-A604-69F3E7DCE740</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security information management preferences.</p>
         */
        public Builder securityInfoPreference(SecurityInfoPreference securityInfoPreference) {
            this.securityInfoPreference = securityInfoPreference;
            return this;
        }

        public GetSecurityInfoPreferenceResponseBody build() {
            return new GetSecurityInfoPreferenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecurityInfoPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityInfoPreferenceResponseBody</p>
     */
    public static class SecurityInfoPreference extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AllowUserManageSecurityEmail")
        private Boolean allowUserManageSecurityEmail;

        private SecurityInfoPreference(Builder builder) {
            this.allowUserManageSecurityEmail = builder.allowUserManageSecurityEmail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityInfoPreference create() {
            return builder().build();
        }

        /**
         * @return allowUserManageSecurityEmail
         */
        public Boolean getAllowUserManageSecurityEmail() {
            return this.allowUserManageSecurityEmail;
        }

        public static final class Builder {
            private Boolean allowUserManageSecurityEmail; 

            private Builder() {
            } 

            private Builder(SecurityInfoPreference model) {
                this.allowUserManageSecurityEmail = model.allowUserManageSecurityEmail;
            } 

            /**
             * <p>Indicates whether CloudSSO users in the directory are allowed to manage their security email addresses in the CloudSSO user portal. Valid values:</p>
             * <ul>
             * <li>true: Allowed.</li>
             * <li>false: Not allowed. This is the default value.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder allowUserManageSecurityEmail(Boolean allowUserManageSecurityEmail) {
                this.allowUserManageSecurityEmail = allowUserManageSecurityEmail;
                return this;
            }

            public SecurityInfoPreference build() {
                return new SecurityInfoPreference(this);
            } 

        } 

    }
}
