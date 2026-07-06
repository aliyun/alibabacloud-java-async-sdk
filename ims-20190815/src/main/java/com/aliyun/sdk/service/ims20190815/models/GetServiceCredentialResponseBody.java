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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceCredential.
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * ExpirationTime.
             */
            public Builder expirationTime(String expirationTime) {
                this.expirationTime = expirationTime;
                return this;
            }

            /**
             * ServiceCredentialId.
             */
            public Builder serviceCredentialId(String serviceCredentialId) {
                this.serviceCredentialId = serviceCredentialId;
                return this;
            }

            /**
             * ServiceCredentialName.
             */
            public Builder serviceCredentialName(String serviceCredentialName) {
                this.serviceCredentialName = serviceCredentialName;
                return this;
            }

            /**
             * ServiceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserPrincipalName.
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
