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
 * {@link SetSecurityInfoPreferenceResponseBody} extends {@link TeaModel}
 *
 * <p>SetSecurityInfoPreferenceResponseBody</p>
 */
public class SetSecurityInfoPreferenceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityInfoPreference")
    private SecurityInfoPreference securityInfoPreference;

    private SetSecurityInfoPreferenceResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityInfoPreference = builder.securityInfoPreference;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetSecurityInfoPreferenceResponseBody create() {
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

        private Builder(SetSecurityInfoPreferenceResponseBody model) {
            this.requestId = model.requestId;
            this.securityInfoPreference = model.securityInfoPreference;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B13E4EE-3853-5852-9165-597C32AD8FB7</p>
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

        public SetSecurityInfoPreferenceResponseBody build() {
            return new SetSecurityInfoPreferenceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link SetSecurityInfoPreferenceResponseBody} extends {@link TeaModel}
     *
     * <p>SetSecurityInfoPreferenceResponseBody</p>
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
             * <p>Specifies whether CloudSSO users in the directory are allowed to manage their security email addresses in the CloudSSO user portal. Valid values:</p>
             * <ul>
             * <li>true: allowed.</li>
             * <li>false: not allowed.</li>
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
