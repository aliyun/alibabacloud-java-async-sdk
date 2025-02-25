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
 * {@link ListVpcGatewayEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcGatewayEndpointsResponseBody</p>
 */
public class ListVpcGatewayEndpointsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Endpoints")
    private java.util.List<Endpoints> endpoints;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListVpcGatewayEndpointsResponseBody(Builder builder) {
        this.endpoints = builder.endpoints;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListVpcGatewayEndpointsResponseBody create() {
        return builder().build();
    }

    /**
     * @return endpoints
     */
    public java.util.List<Endpoints> getEndpoints() {
        return this.endpoints;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Endpoints> endpoints; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * <p>The list of gateway endpoints.</p>
         */
        public Builder endpoints(java.util.List<Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:</p>
         * <ul>
         * <li>If no value is returned for <strong>NextToken</strong>, no next queries are sent.</li>
         * <li>If a value is returned for <strong>NextToken</strong>, the value can be used in the next request to retrieve a new page of results.</li>
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0AB1129F-32C1-5E4D-9E22-E4A859CA46EB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVpcGatewayEndpointsResponseBody build() {
            return new ListVpcGatewayEndpointsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListVpcGatewayEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcGatewayEndpointsResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The key of tag N added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceDept</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of tag N added to the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FinanceJoshua</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListVpcGatewayEndpointsResponseBody} extends {@link TeaModel}
     *
     * <p>ListVpcGatewayEndpointsResponseBody</p>
     */
    public static class Endpoints extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociatedRouteTables")
        private java.util.List<String> associatedRouteTables;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("EndpointDescription")
        private String endpointDescription;

        @com.aliyun.core.annotation.NameInMap("EndpointId")
        private String endpointId;

        @com.aliyun.core.annotation.NameInMap("EndpointName")
        private String endpointName;

        @com.aliyun.core.annotation.NameInMap("EndpointStatus")
        private String endpointStatus;

        @com.aliyun.core.annotation.NameInMap("PolicyDocument")
        private String policyDocument;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @com.aliyun.core.annotation.NameInMap("ServiceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Endpoints(Builder builder) {
            this.associatedRouteTables = builder.associatedRouteTables;
            this.creationTime = builder.creationTime;
            this.endpointDescription = builder.endpointDescription;
            this.endpointId = builder.endpointId;
            this.endpointName = builder.endpointName;
            this.endpointStatus = builder.endpointStatus;
            this.policyDocument = builder.policyDocument;
            this.resourceGroupId = builder.resourceGroupId;
            this.serviceName = builder.serviceName;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Endpoints create() {
            return builder().build();
        }

        /**
         * @return associatedRouteTables
         */
        public java.util.List<String> getAssociatedRouteTables() {
            return this.associatedRouteTables;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return endpointDescription
         */
        public String getEndpointDescription() {
            return this.endpointDescription;
        }

        /**
         * @return endpointId
         */
        public String getEndpointId() {
            return this.endpointId;
        }

        /**
         * @return endpointName
         */
        public String getEndpointName() {
            return this.endpointName;
        }

        /**
         * @return endpointStatus
         */
        public String getEndpointStatus() {
            return this.endpointStatus;
        }

        /**
         * @return policyDocument
         */
        public String getPolicyDocument() {
            return this.policyDocument;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List<String> associatedRouteTables; 
            private String creationTime; 
            private String endpointDescription; 
            private String endpointId; 
            private String endpointName; 
            private String endpointStatus; 
            private String policyDocument; 
            private String resourceGroupId; 
            private String serviceName; 
            private java.util.List<Tags> tags; 
            private String vpcId; 

            /**
             * <p>The ID of the route table associated with the gateway endpoint.</p>
             */
            public Builder associatedRouteTables(java.util.List<String> associatedRouteTables) {
                this.associatedRouteTables = associatedRouteTables;
                return this;
            }

            /**
             * <p>The time when the endpoint was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-09-08T08:43:04Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the gateway endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>test_description</p>
             */
            public Builder endpointDescription(String endpointDescription) {
                this.endpointDescription = endpointDescription;
                return this;
            }

            /**
             * <p>The ID of the gateway endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>vpce-bp1i1212ss2whuwyw****</p>
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * <p>The name of the gateway endpoint.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * <p>The status of the gateway endpoint. Valid values:</p>
             * <ul>
             * <li><strong>Creating</strong></li>
             * <li><strong>Created</strong></li>
             * <li><strong>Modifying</strong></li>
             * <li><strong>Associating</strong></li>
             * <li><strong>Dissociating</strong></li>
             * <li><strong>Deleting</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Created</p>
             */
            public Builder endpointStatus(String endpointStatus) {
                this.endpointStatus = endpointStatus;
                return this;
            }

            /**
             * <p>The access policy for the cloud service.</p>
             * <p>For more information about the syntax and structure of the access policy, see <a href="https://help.aliyun.com/document_detail/93739.html">Policy syntax and structure</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{\n  &quot;Version&quot;: &quot;1&quot;,\n  &quot;Statement&quot;: [\n    {\n      &quot;Effect&quot;: &quot;Allow&quot;,\n      &quot;Action&quot;: &quot;<em>&quot;,\n      &quot;Principal&quot;: &quot;</em>&quot;,\n      &quot;Resource&quot;: &quot;*&quot;\n    }\n  ]\n}</p>
             */
            public Builder policyDocument(String policyDocument) {
                this.policyDocument = policyDocument;
                return this;
            }

            /**
             * <p>The ID of the resource group to which the gateway endpoint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>rg-acfmxvfvazb4p****</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * <p>The tag list.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) to which the gateway endpoint belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-bp1gsk7h12ew7oegk****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Endpoints build() {
                return new Endpoints(this);
            } 

        } 

    }
}
