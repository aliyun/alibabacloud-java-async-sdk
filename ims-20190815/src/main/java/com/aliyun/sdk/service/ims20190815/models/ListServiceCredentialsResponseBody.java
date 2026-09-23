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
         * <p>Indicates whether there is a next page.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isTruncated(Boolean isTruncated) {
            this.isTruncated = isTruncated;
            return this;
        }

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token used to retrieve the next page of results.</p>
         * 
         * <strong>example:</strong>
         * <p>EXAMPLE*******</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D80A0F97-6F12-5CD1-A70A-77A03BF4CFC5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of service credentials.</p>
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
             * <p>The time when the service credential was created.</p>
             * <p>Format: RFC 3339 (UTC). Example: 2026-05-07T05:49:57Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-05-07T05:49:57Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The expiration time. This field is not returned for permanent service credentials.</p>
             * <p>Format: RFC 3339 (UTC). Example: 2026-06-07T05:49:57Z.</p>
             * 
             * <strong>example:</strong>
             * <p>2026-06-07T05:49:57Z</p>
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
             * <p>The status of the service credential.</p>
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

            public ServiceCredentials build() {
                return new ServiceCredentials(this);
            } 

        } 

    }
}
