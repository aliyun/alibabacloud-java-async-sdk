// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVpcGatewayEndpointsResponseBody} extends {@link TeaModel}
 *
 * <p>ListVpcGatewayEndpointsResponseBody</p>
 */
public class ListVpcGatewayEndpointsResponseBody extends TeaModel {
    @NameInMap("Endpoints")
    private java.util.List < Endpoints> endpoints;

    @NameInMap("MaxResults")
    private Long maxResults;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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
    public java.util.List < Endpoints> getEndpoints() {
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
        private java.util.List < Endpoints> endpoints; 
        private Long maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The list of gateway endpoints.
         */
        public Builder endpoints(java.util.List < Endpoints> endpoints) {
            this.endpoints = endpoints;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that is used for the next query. Valid values:
         * <p>
         * 
         * *   If no value is returned for **NextToken**, no next queries are sent.
         * *   If **NextToken** is not empty, the value indicates the token that is used for the next query.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListVpcGatewayEndpointsResponseBody build() {
            return new ListVpcGatewayEndpointsResponseBody(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
    public static class Endpoints extends TeaModel {
        @NameInMap("AssociatedRouteTables")
        private java.util.List < String > associatedRouteTables;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("EndpointDescription")
        private String endpointDescription;

        @NameInMap("EndpointId")
        private String endpointId;

        @NameInMap("EndpointName")
        private String endpointName;

        @NameInMap("EndpointStatus")
        private String endpointStatus;

        @NameInMap("PolicyDocument")
        private String policyDocument;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("ServiceName")
        private String serviceName;

        @NameInMap("Tags")
        private java.util.List < Tags> tags;

        @NameInMap("VpcId")
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
        public java.util.List < String > getAssociatedRouteTables() {
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private java.util.List < String > associatedRouteTables; 
            private String creationTime; 
            private String endpointDescription; 
            private String endpointId; 
            private String endpointName; 
            private String endpointStatus; 
            private String policyDocument; 
            private String resourceGroupId; 
            private String serviceName; 
            private java.util.List < Tags> tags; 
            private String vpcId; 

            /**
             * The ID of the route table associated with the gateway endpoint.
             */
            public Builder associatedRouteTables(java.util.List < String > associatedRouteTables) {
                this.associatedRouteTables = associatedRouteTables;
                return this;
            }

            /**
             * The time when the endpoint was created. The time follows the ISO 8601 standard in the YYYY-MM-DDThh:mm:ssZ format. The time must be in UTC.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * The description of the gateway endpoint.
             */
            public Builder endpointDescription(String endpointDescription) {
                this.endpointDescription = endpointDescription;
                return this;
            }

            /**
             * The ID of the gateway endpoint.
             */
            public Builder endpointId(String endpointId) {
                this.endpointId = endpointId;
                return this;
            }

            /**
             * The name of the gateway endpoint.
             */
            public Builder endpointName(String endpointName) {
                this.endpointName = endpointName;
                return this;
            }

            /**
             * The status of the gateway endpoint. Valid values:
             * <p>
             * 
             * *   **Creating**
             * *   **Created**
             * *   **Modifying**
             * *   **Associating**
             * *   **Dissociating**
             * *   **Deleting**
             */
            public Builder endpointStatus(String endpointStatus) {
                this.endpointStatus = endpointStatus;
                return this;
            }

            /**
             * The access policy for the cloud service.
             * <p>
             * 
             * For more information about the syntax and structure of the access policy, see [Policy syntax and structure](~~93739~~).
             */
            public Builder policyDocument(String policyDocument) {
                this.policyDocument = policyDocument;
                return this;
            }

            /**
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            /**
             * The name of the endpoint service.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC) to which the gateway endpoint belongs.
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
