// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcEndpointServicesByEndUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointServicesByEndUserResponseBody</p>
 */
public class ListVpcEndpointServicesByEndUserResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Services")
    private java.util.List < Services> services;

    private ListVpcEndpointServicesByEndUserResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.services = builder.services;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcEndpointServicesByEndUserResponseBody create() {
        return builder().build();
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
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
     * @return services
     */
    public java.util.List < Services> getServices() {
        return this.services;
    }

    public static final class Builder {
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < Services> services; 

        /**
         * The ID of the endpoint service.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The list of entries returned.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The name of the endpoint service.
         */
        public Builder services(java.util.List < Services> services) {
            this.services = services;
            return this;
        }

        public ListVpcEndpointServicesByEndUserResponseBody build() {
            return new ListVpcEndpointServicesByEndUserResponseBody(this);
        } 

    } 

    public static class Services extends TeaModel {
        @NameInMap("DefaultPolicyDocument")
        private String defaultPolicyDocument;

        @NameInMap("ServiceDomain")
        private String serviceDomain;

        @NameInMap("ServiceId")
        private String serviceId;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("SupportPolicy")
        private Boolean supportPolicy;

        private Services(Builder builder) {
            this.defaultPolicyDocument = builder.defaultPolicyDocument;
            this.serviceDomain = builder.serviceDomain;
            this.serviceId = builder.serviceId;
            this.serviceName = builder.serviceName;
            this.supportPolicy = builder.supportPolicy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Services create() {
            return builder().build();
        }

        /**
         * @return defaultPolicyDocument
         */
        public String getDefaultPolicyDocument() {
            return this.defaultPolicyDocument;
        }

        /**
         * @return serviceDomain
         */
        public String getServiceDomain() {
            return this.serviceDomain;
        }

        /**
         * @return serviceId
         */
        public String getServiceId() {
            return this.serviceId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return supportPolicy
         */
        public Boolean getSupportPolicy() {
            return this.supportPolicy;
        }

        public static final class Builder {
            private String defaultPolicyDocument; 
            private String serviceDomain; 
            private String serviceId; 
            private String serviceName; 
            private Boolean supportPolicy; 

            /**
             * The domain name of the cloud service to which the endpoint service belongs.
             */
            public Builder defaultPolicyDocument(String defaultPolicyDocument) {
                this.defaultPolicyDocument = defaultPolicyDocument;
                return this;
            }

            /**
             * ServiceDomain.
             */
            public Builder serviceDomain(String serviceDomain) {
                this.serviceDomain = serviceDomain;
                return this;
            }

            /**
             * The default access policy.
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * Indicate whether the endpoint service supports the access policy. Valid values:
             * <p>
             * 
             * *   **false**: no
             * *   **true**: yes
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * SupportPolicy.
             */
            public Builder supportPolicy(Boolean supportPolicy) {
                this.supportPolicy = supportPolicy;
                return this;
            }

            public Services build() {
                return new Services(this);
            } 

        } 

    }
}
