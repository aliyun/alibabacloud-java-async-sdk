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
 * {@link GetSecurityInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetSecurityInfoResponseBody</p>
 */
public class GetSecurityInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SecurityEmail")
    private SecurityEmail securityEmail;

    private GetSecurityInfoResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.securityEmail = builder.securityEmail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSecurityInfoResponseBody create() {
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
     * @return securityEmail
     */
    public SecurityEmail getSecurityEmail() {
        return this.securityEmail;
    }

    public static final class Builder {
        private String requestId; 
        private SecurityEmail securityEmail; 

        private Builder() {
        } 

        private Builder(GetSecurityInfoResponseBody model) {
            this.requestId = model.requestId;
            this.securityEmail = model.securityEmail;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE42D2C4-A30A-59B7-ACEB-6D22FB44174A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The security email information of the user.</p>
         * <blockquote>
         * <p>If the user has not configured a security email address, this field is not returned.</p>
         * </blockquote>
         */
        public Builder securityEmail(SecurityEmail securityEmail) {
            this.securityEmail = securityEmail;
            return this;
        }

        public GetSecurityInfoResponseBody build() {
            return new GetSecurityInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSecurityInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetSecurityInfoResponseBody</p>
     */
    public static class SecurityEmail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Email")
        private String email;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SecurityEmail(Builder builder) {
            this.email = builder.email;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SecurityEmail create() {
            return builder().build();
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String email; 
            private String status; 

            private Builder() {
            } 

            private Builder(SecurityEmail model) {
                this.email = model.email;
                this.status = model.status;
            } 

            /**
             * <p>The security email address of the user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:Alice@example.com">Alice@example.com</a></p>
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * <p>The verification status of the security email address. Valid values:</p>
             * <ul>
             * <li>active: Verified.</li>
             * <li>pending: Pending verification.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pending</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SecurityEmail build() {
                return new SecurityEmail(this);
            } 

        } 

    }
}
