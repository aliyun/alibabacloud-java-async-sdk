// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

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
 * {@link ListVpcEndpointServicesByEndUserResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcEndpointServicesByEndUserResponseBody</p>
 */
public class ListVpcEndpointServicesByEndUserResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Services")
    private java.util.List<Services> services;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListVpcEndpointServicesByEndUserResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.services = builder.services;
        this.totalCount = builder.totalCount;
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
    public java.util.List<Services> getServices() {
        return this.services;
    }

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List<Services> services; 
        private String totalCount; 

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that is used for the next query. Valid values:</p>
         * <ul>
         * <li>If no value is returned for <strong>NextToken</strong>, no next queries are sent.</li>
         * <li>If <strong>NextToken</strong> is returned, the value is the token that is used for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>FFmyTO70tTpLG6I3FmYAXGKPd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>0AB1129F-32C1-5E4D-9E22-E4A859CA46EB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of entries returned.</p>
         */
        public Builder services(java.util.List<Services> services) {
            this.services = services;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVpcEndpointServicesByEndUserResponseBody build() {
            return new ListVpcEndpointServicesByEndUserResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcEndpointServicesByEndUserResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcEndpointServicesByEndUserResponseBody</p>
     */
    public static class Services extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DefaultPolicyDocument")
        private String defaultPolicyDocument;

        @com.aliyun.core.annotation.NameInMap("ServiceDomain")
        private String serviceDomain;

        @com.aliyun.core.annotation.NameInMap("ServiceId")
        private String serviceId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("SupportPolicy")
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
             * <p>The default access policy.</p>
             * 
             * <strong>example:</strong>
             * <p>{   &quot;Version&quot; : &quot;1&quot;,   &quot;Statement&quot; : [ {     &quot;Effect&quot; : &quot;Allow&quot;,     &quot;Action&quot; : &quot;<em>&quot;,     &quot;Principal&quot; : &quot;</em>&quot;,     &quot;Resource&quot; : &quot;*&quot;   } ] }</p>
             */
            public Builder defaultPolicyDocument(String defaultPolicyDocument) {
                this.defaultPolicyDocument = defaultPolicyDocument;
                return this;
            }

            /**
             * <p>The domain name of the cloud service to which the endpoint service belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-admin.aliyuncs.com</p>
             */
            public Builder serviceDomain(String serviceDomain) {
                this.serviceDomain = serviceDomain;
                return this;
            }

            /**
             * <p>The ID of the endpoint service.</p>
             * 
             * <strong>example:</strong>
             * <p>vpces-m5enwdmilo210aibo9****</p>
             */
            public Builder serviceId(String serviceId) {
                this.serviceId = serviceId;
                return this;
            }

            /**
             * <p>The name of the endpoint service.</p>
             * 
             * <strong>example:</strong>
             * <p>com.aliyun.cn-hangzhou.oss</p>
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * <p>Indicate whether the endpoint service supports the access policy. Valid values:</p>
             * <ul>
             * <li><strong>false</strong></li>
             * <li><strong>true</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
