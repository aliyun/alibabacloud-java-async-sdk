// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVpcPrefixListAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcPrefixListAssociationsResponseBody</p>
 */
public class GetVpcPrefixListAssociationsResponseBody extends TeaModel {
    @NameInMap("Count")
    private Long count;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PrefixListAssociation")
    private java.util.List < PrefixListAssociation> prefixListAssociation;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private GetVpcPrefixListAssociationsResponseBody(Builder builder) {
        this.count = builder.count;
        this.nextToken = builder.nextToken;
        this.prefixListAssociation = builder.prefixListAssociation;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVpcPrefixListAssociationsResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Long getCount() {
        return this.count;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return prefixListAssociation
     */
    public java.util.List < PrefixListAssociation> getPrefixListAssociation() {
        return this.prefixListAssociation;
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
        private Long count; 
        private String nextToken; 
        private java.util.List < PrefixListAssociation> prefixListAssociation; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The number of entries.
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * A pagination token. It can be used in the next request to retrieve a new page of results. Valid values:
         * <p>
         * 
         * *   If **NextToken** is empty, no next page exists.
         * *   If a value is returned for **NextToken**, the value is used to retrieve a new page of results.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The information about the network instances that are associated with the prefix list.
         */
        public Builder prefixListAssociation(java.util.List < PrefixListAssociation> prefixListAssociation) {
            this.prefixListAssociation = prefixListAssociation;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The number of entries returned.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetVpcPrefixListAssociationsResponseBody build() {
            return new GetVpcPrefixListAssociationsResponseBody(this);
        } 

    } 

    public static class PrefixListAssociation extends TeaModel {
        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("PrefixListId")
        private String prefixListId;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("ResourceUid")
        private String resourceUid;

        @NameInMap("Status")
        private String status;

        private PrefixListAssociation(Builder builder) {
            this.ownerId = builder.ownerId;
            this.prefixListId = builder.prefixListId;
            this.reason = builder.reason;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.resourceUid = builder.resourceUid;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrefixListAssociation create() {
            return builder().build();
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return prefixListId
         */
        public String getPrefixListId() {
            return this.prefixListId;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return resourceUid
         */
        public String getResourceUid() {
            return this.resourceUid;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ownerId; 
            private String prefixListId; 
            private String reason; 
            private String regionId; 
            private String resourceId; 
            private String resourceType; 
            private String resourceUid; 
            private String status; 

            /**
             * The ID of the Alibaba Cloud account to which the prefix list belongs.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * The prefix list ID.
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * The reason why the association failed.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The region ID of the prefix list.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The ID of the associated resource.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * The type of the associated resource. Valid values:
             * <p>
             * 
             * *   **vpcRouteTable**: virtual private cloud (VPC) route table.
             * *   **trRouteTable**: route table of a transit router.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account to which the resource associated with the prefix list belongs.
             */
            public Builder resourceUid(String resourceUid) {
                this.resourceUid = resourceUid;
                return this;
            }

            /**
             * The status of the prefix list. Valid values:
             * <p>
             * 
             * *   **Created**
             * *   **ModifyFailed**
             * *   **Creating**
             * *   **Modifying**
             * *   **Deleting**
             * *   **Deleted**
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public PrefixListAssociation build() {
                return new PrefixListAssociation(this);
            } 

        } 

    }
}
