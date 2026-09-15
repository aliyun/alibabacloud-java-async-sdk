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
 * {@link GetVpcPrefixListAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>GetVpcPrefixListAssociationsResponseBody</p>
 */
public class GetVpcPrefixListAssociationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Long count;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PrefixListAssociation")
    private java.util.List<PrefixListAssociation> prefixListAssociation;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<PrefixListAssociation> getPrefixListAssociation() {
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
        private java.util.List<PrefixListAssociation> prefixListAssociation; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(GetVpcPrefixListAssociationsResponseBody model) {
            this.count = model.count;
            this.nextToken = model.nextToken;
            this.prefixListAssociation = model.prefixListAssociation;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder count(Long count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The token for the next query. Valid values:</p>
         * <ul>
         * <li>If <strong>NextToken</strong> is empty, no next query exists.</li>
         * <li>If <strong>NextToken</strong> has a return value, the value is the token for the next query.</li>
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
         * <p>The association information of the prefix list.</p>
         */
        public Builder prefixListAssociation(java.util.List<PrefixListAssociation> prefixListAssociation) {
            this.prefixListAssociation = prefixListAssociation;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4EC47282-1B74-4534-BD0E-403F3EE64CAF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetVpcPrefixListAssociationsResponseBody build() {
            return new GetVpcPrefixListAssociationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetVpcPrefixListAssociationsResponseBody} extends {@link TeaModel}
     *
     * <p>GetVpcPrefixListAssociationsResponseBody</p>
     */
    public static class PrefixListAssociation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CidrList")
        private String cidrList;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private String ownerId;

        @com.aliyun.core.annotation.NameInMap("PrefixListId")
        private String prefixListId;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceUid")
        private String resourceUid;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("SuppressedList")
        private String suppressedList;

        private PrefixListAssociation(Builder builder) {
            this.cidrList = builder.cidrList;
            this.ownerId = builder.ownerId;
            this.prefixListId = builder.prefixListId;
            this.reason = builder.reason;
            this.regionId = builder.regionId;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
            this.resourceUid = builder.resourceUid;
            this.status = builder.status;
            this.suppressedList = builder.suppressedList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrefixListAssociation create() {
            return builder().build();
        }

        /**
         * @return cidrList
         */
        public String getCidrList() {
            return this.cidrList;
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

        /**
         * @return suppressedList
         */
        public String getSuppressedList() {
            return this.suppressedList;
        }

        public static final class Builder {
            private String cidrList; 
            private String ownerId; 
            private String prefixListId; 
            private String reason; 
            private String regionId; 
            private String resourceId; 
            private String resourceType; 
            private String resourceUid; 
            private String status; 
            private String suppressedList; 

            private Builder() {
            } 

            private Builder(PrefixListAssociation model) {
                this.cidrList = model.cidrList;
                this.ownerId = model.ownerId;
                this.prefixListId = model.prefixListId;
                this.reason = model.reason;
                this.regionId = model.regionId;
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
                this.resourceUid = model.resourceUid;
                this.status = model.status;
                this.suppressedList = model.suppressedList;
            } 

            /**
             * <p>The list of CIDR blocks in the prefix list that are effective for the associated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.0.0/16</p>
             */
            public Builder cidrList(String cidrList) {
                this.cidrList = cidrList;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that owns the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>153460731706****</p>
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * <p>The instance ID of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>pl-0b7hwu67****</p>
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * <p>The reason for the association failure.</p>
             * 
             * <strong>example:</strong>
             * <p>failed</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The region ID of the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the associated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>vtb-bp1drpcfz9srr393h****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The type of the associated resource. Valid values:</p>
             * <ul>
             * <li><strong>vpcRouteTable</strong>: VPC route table.</li>
             * <li><strong>trRouteTable</strong>: transit router route table.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>vpcRouteTable</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that owns the resource associated with the prefix list.</p>
             * 
             * <strong>example:</strong>
             * <p>132193271328****</p>
             */
            public Builder resourceUid(String resourceUid) {
                this.resourceUid = resourceUid;
                return this;
            }

            /**
             * <p>The association status of the prefix list. Valid values:</p>
             * <ul>
             * <li><strong>Created</strong>: Succeeded.</li>
             * <li><strong>ModifyFailed</strong>: Not associated with the latest version.</li>
             * <li><strong>Creating</strong>: Being created.</li>
             * <li><strong>Modifying</strong>: Being modified.</li>
             * <li><strong>Deleting</strong>: Being deleted.</li>
             * <li><strong>Deleted</strong>: Deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The list of CIDR blocks in the prefix list that are not effective for the associated resource.</p>
             * 
             * <strong>example:</strong>
             * <p>192.124.0.0/16</p>
             */
            public Builder suppressedList(String suppressedList) {
                this.suppressedList = suppressedList;
                return this;
            }

            public PrefixListAssociation build() {
                return new PrefixListAssociation(this);
            } 

        } 

    }
}
