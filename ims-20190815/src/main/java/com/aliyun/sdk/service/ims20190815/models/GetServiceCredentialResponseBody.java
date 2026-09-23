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
 * {@link GetServiceCredentialResponseBody} extends {@link TeaModel}
 *
 * <p>GetServiceCredentialResponseBody</p>
 */
public class GetServiceCredentialResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceCredential")
    private ServiceCredential serviceCredential;

    private GetServiceCredentialResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.serviceCredential = builder.serviceCredential;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceCredentialResponseBody create() {
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

        private Builder(GetServiceCredentialResponseBody model) {
            this.requestId = model.requestId;
            this.serviceCredential = model.serviceCredential;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>66815255-7CCE-4759-AC37-9755794C3626</p>
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

        public GetServiceCredentialResponseBody build() {
            return new GetServiceCredentialResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetServiceCredentialResponseBody} extends {@link TeaModel}
     *
     * <p>GetServiceCredentialResponseBody</p>
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
                this.serviceName = model.serviceName;
                this.status = model.status;
                this.userPrincipalName = model.userPrincipalName;
            } 

            /**
             * <p>The creation time.</p>
             * <p>Format: RFC 3339 (UTC), for example, 2026-03-15T09:20:58Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-03-15T09:20:58Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The expiration time.
             * This field is not returned for permanent service credentials.</p>
             * <p>Format: RFC 3339 (UTC), for example, 2026-04-15T09:20:58Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-04-15T09:20:58Z</p>
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * <p>The service credential ID.</p>
             * 
             * <strong>example:</strong>
             * <p>SC***************</p>
             */
            public Builder serviceCredentialId(String serviceCredentialId) {
                this.serviceCredentialId = serviceCredentialId;
                return this;
            }

            /**
             * <p>The service credential name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder serviceCredentialName(String serviceCredentialName) {
                this.serviceCredentialName = serviceCredentialName;
                return this;
            }

            /**
             * <p>The Alibaba Cloud service name.</p>
             * 
             * <strong>example:</strong>
             * <p>xxx.aliyuncs.com</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>The service credential status.</p>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The logon name of the Resource Access Management (RAM) user.</p>
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
