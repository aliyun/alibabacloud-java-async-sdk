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
         * Count.
         */
        public Builder count(Long count) {
            this.count = count;
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
         * PrefixListAssociation.
         */
        public Builder prefixListAssociation(java.util.List < PrefixListAssociation> prefixListAssociation) {
            this.prefixListAssociation = prefixListAssociation;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
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

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("Status")
        private String status;

        private PrefixListAssociation(Builder builder) {
            this.ownerId = builder.ownerId;
            this.prefixListId = builder.prefixListId;
            this.reason = builder.reason;
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String ownerId; 
            private String prefixListId; 
            private String reason; 
            private String resourceId; 
            private String resourceType; 
            private String status; 

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * 前缀列表的实例ID
             */
            public Builder prefixListId(String prefixListId) {
                this.prefixListId = prefixListId;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * 状态
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * 名称
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * IpVersion
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
