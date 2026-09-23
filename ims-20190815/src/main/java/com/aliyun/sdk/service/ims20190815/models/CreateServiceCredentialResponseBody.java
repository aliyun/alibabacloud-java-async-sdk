// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link CreateServiceCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>CreateServiceCredentialResponseBody</p>
 */
public class CreateServiceCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceCredential")
    private ServiceCredential serviceCredential;

    private CreateServiceCredentialResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceCredential = builder.serviceCredential;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceCredentialResponseBody create() {
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
     * @return serviceCredential
     */
    public ServiceCredential getServiceCredential() {
        return this.serviceCredential;
    }

    public static final class Builder {
        private String requestId; 
        private ServiceCredential serviceCredential; 

        private Builder() {
        } 

        private Builder(CreateServiceCredentialResponseBody model) {
            this.requestId = model.requestId;
            this.serviceCredential = model.serviceCredential;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>81313F5E-3C85-478F-BCC9-E1B70E4556DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The service credential information.</p>
         */
        public Builder serviceCredential(ServiceCredential serviceCredential) {
            this.serviceCredential = serviceCredential;
            return this;
        }

        public CreateServiceCredentialResponseBody build() {
            return new CreateServiceCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CreateServiceCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>CreateServiceCredentialResponseBody</p>
     */
    public static class ServiceCredential extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("ExpirationTime")
        private String expirationTime;

        @com.aliyun.core.annotation.NameInMap("ServiceCredentialId")
        private String serviceCredentialId;

        @com.aliyun.core.annotation.NameInMap("ServiceCredentialName")
        private String serviceCredentialName;

        @com.aliyun.core.annotation.NameInMap("ServiceCredentialSecret")
        private String serviceCredentialSecret;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserPrincipalName")
        private String userPrincipalName;

        private ServiceCredential(Builder builder) {
            this.createTime = builder.createTime;
            this.expirationTime = builder.expirationTime;
            this.serviceCredentialId = builder.serviceCredentialId;
            this.serviceCredentialName = builder.serviceCredentialName;
            this.serviceCredentialSecret = builder.serviceCredentialSecret;
            this.serviceName = builder.serviceName;
            this.status = builder.status;
            this.userPrincipalName = builder.userPrincipalName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ServiceCredential create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return expirationTime
         */
        public String getExpirationTime() {
            return this.expirationTime;
        }

        /**
         * @return serviceCredentialId
         */
        public String getServiceCredentialId() {
            return this.serviceCredentialId;
        }

        /**
         * @return serviceCredentialName
         */
        public String getServiceCredentialName() {
            return this.serviceCredentialName;
        }

        /**
         * @return serviceCredentialSecret
         */
        public String getServiceCredentialSecret() {
            return this.serviceCredentialSecret;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userPrincipalName
         */
        public String getUserPrincipalName() {
            return this.userPrincipalName;
        }

        public static final class Builder {
            private String createTime; 
            private String expirationTime; 
            private String serviceCredentialId; 
            private String serviceCredentialName; 
            private String serviceCredentialSecret; 
            private String serviceName; 
            private String status; 
            private String userPrincipalName; 

            private Builder() {
            } 

            private Builder(ServiceCredential model) {
                this.createTime = model.createTime;
                this.expirationTime = model.expirationTime;
                this.serviceCredentialId = model.serviceCredentialId;
                this.serviceCredentialName = model.serviceCredentialName;
                this.serviceCredentialSecret = model.serviceCredentialSecret;
                this.serviceName = model.serviceName;
                this.status = model.status;
                this.userPrincipalName = model.userPrincipalName;
            } 

            /**
             * <p>The time when the service credential was created. The time follows RFC 3339 (UTC). Example: 2026-01-01T10:05:24Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-01-01T10:05:24Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The expiration time of the service credential. This field is not returned for service credentials that never expire. The time follows RFC 3339 (UTC). Example: 2026-02-01T10:05:24Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-02-01T10:05:24Z</p>
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The ID of the service credential.</p>
             * 
             * <strong>example:</strong>
             * <p>SC*************</p>
             */
            public Builder serviceCredentialId(String serviceCredentialId) {
                this.serviceCredentialId = serviceCredentialId;
                return this;
            }

            /**
             * <p>The name of the service credential.</p>
             * 
             * <strong>example:</strong>
             * <p>yourServiceCredentialName</p>
             */
            public Builder serviceCredentialName(String serviceCredentialName) {
                this.serviceCredentialName = serviceCredentialName;
                return this;
            }

            /**
             * <p>The secret of the service credential.</p>
             * 
             * <strong>example:</strong>
             * <p>yourServiceCredentialSecret</p>
             */
            public Builder serviceCredentialSecret(String serviceCredentialSecret) {
                this.serviceCredentialSecret = serviceCredentialSecret;
                return this;
            }

            /**
             * <p>The service name of the Alibaba Cloud service.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.aliyuncs.com</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The status of the service credential. Valid values:</p>
             * <ul>
             * <li>Active: enabled.</li>
             * <li>Inactive: disabled.</li>
             * <li>Expired: expired.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The logon name of the RAM user.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@example.onaliyun.com">test@example.onaliyun.com</a></p>
             */
            public Builder userPrincipalName(String userPrincipalName) {
                this.userPrincipalName = userPrincipalName;
                return this;
            }

            public ServiceCredential build() {
                return new ServiceCredential(this);
            } 

        } 

    }
}
