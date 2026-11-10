// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

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
 * {@link DescribeTransitRouterPolicyTableAssociationsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransitRouterPolicyTableAssociationsResponseBody</p>
 */
public class DescribeTransitRouterPolicyTableAssociationsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Associations")
    private java.util.List<Associations> associations;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTransitRouterPolicyTableAssociationsResponseBody(Builder builder) {
        this.associations = builder.associations;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitRouterPolicyTableAssociationsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return associations
     */
    public java.util.List<Associations> getAssociations() {
        return this.associations;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Associations> associations; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTransitRouterPolicyTableAssociationsResponseBody model) {
            this.associations = model.associations;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The associate relationships between the policy routing table and network connectivity instances.</p>
         */
        public Builder associations(java.util.List<Associations> associations) {
            this.associations = associations;
            return this;
        }

        /**
         * <p>The number of entries returned per page in a paginated query.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query in a paginated query.</p>
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
         * <p>13526224-5780-4426-8BDF-BC8B08700F22</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTransitRouterPolicyTableAssociationsResponseBody build() {
            return new DescribeTransitRouterPolicyTableAssociationsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTransitRouterPolicyTableAssociationsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransitRouterPolicyTableAssociationsResponseBody</p>
     */
    public static class Associations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AssociationId")
        private String associationId;

        @com.aliyun.core.annotation.NameInMap("AttachmentId")
        private String attachmentId;

        @com.aliyun.core.annotation.NameInMap("PolicyTableId")
        private String policyTableId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Associations(Builder builder) {
            this.associationId = builder.associationId;
            this.attachmentId = builder.attachmentId;
            this.policyTableId = builder.policyTableId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Associations create() {
            return builder().build();
        }

        /**
         * @return associationId
         */
        public String getAssociationId() {
            return this.associationId;
        }

        /**
         * @return attachmentId
         */
        public String getAttachmentId() {
            return this.attachmentId;
        }

        /**
         * @return policyTableId
         */
        public String getPolicyTableId() {
            return this.policyTableId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String associationId; 
            private String attachmentId; 
            private String policyTableId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Associations model) {
                this.associationId = model.associationId;
                this.attachmentId = model.attachmentId;
                this.policyTableId = model.policyTableId;
                this.status = model.status;
            } 

            /**
             * <p>The ID of the association between the policy route table and the network instance connection.</p>
             * 
             * <strong>example:</strong>
             * <p>pta-vfan3mbxoespx7xvyt</p>
             */
            public Builder associationId(String associationId) {
                this.associationId = associationId;
                return this;
            }

            /**
             * <p>The ID of the network instance connection.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-attach-123qsrads</p>
             */
            public Builder attachmentId(String attachmentId) {
                this.attachmentId = attachmentId;
                return this;
            }

            /**
             * <p>The instance ID of the policy routing table.</p>
             * 
             * <strong>example:</strong>
             * <p>ptbl-123adfzcx</p>
             */
            public Builder policyTableId(String policyTableId) {
                this.policyTableId = policyTableId;
                return this;
            }

            /**
             * <p>The status of the association. Valid values:</p>
             * <ul>
             * <li><strong>Active</strong>: Active.</li>
             * <li><strong>Associating</strong>: Associating.</li>
             * <li><strong>Dissociating</strong>: Dissociating.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Associations build() {
                return new Associations(this);
            } 

        } 

    }
}
