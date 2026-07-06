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
 * {@link ListServiceCredentialsResponseBody} extends {@link TeaModel}
 *
 * <p>ListServiceCredentialsResponseBody</p>
 */
public class ListServiceCredentialsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("IsTruncated")
    private Boolean isTruncated;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ServiceCredentials")
    private java.util.List<ServiceCredentials> serviceCredentials;

    private ListServiceCredentialsResponseBody(Builder builder) {
        this.isTruncated = builder.isTruncated;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.serviceCredentials = builder.serviceCredentials;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServiceCredentialsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return isTruncated
     */
    public Boolean getIsTruncated() {
        return this.isTruncated;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return serviceCredentials
     */
    public java.util.List<ServiceCredentials> getServiceCredentials() {
        return this.serviceCredentials;
    }

    public static final class Builder {
        private Boolean isTruncated; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<ServiceCredentials> serviceCredentials; 

        private Builder() {
        } 

        private Builder(ListServiceCredentialsResponseBody model) {
            this.isTruncated = model.isTruncated;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.serviceCredentials = model.serviceCredentials;
        } 

        /**
         * IsTruncated.
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ServiceCredentials.
         */
        public Builder serviceCredentials(java.util.List<ServiceCredentials> serviceCredentials) {
            this.serviceCredentials = serviceCredentials;
            return this;
        }

        public ListServiceCredentialsResponseBody build() {
            return new ListServiceCredentialsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListServiceCredentialsResponseBody} extends {@link TeaModel}
     *
     * <p>ListServiceCredentialsResponseBody</p>
     */
    public static class ServiceCredentials extends TeaModel {
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

        private ServiceCredentials(Builder builder) {
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

        public static ServiceCredentials create() {
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

            private Builder(ServiceCredentials model) {
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

            public ServiceCredentials build() {
                return new ServiceCredentials(this);
            } 

        } 

    }
}
