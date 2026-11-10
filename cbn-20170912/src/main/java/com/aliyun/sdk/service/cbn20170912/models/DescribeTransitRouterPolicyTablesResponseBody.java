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
 * {@link DescribeTransitRouterPolicyTablesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTransitRouterPolicyTablesResponseBody</p>
 */
public class DescribeTransitRouterPolicyTablesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PolicyTables")
    private java.util.List<PolicyTables> policyTables;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTransitRouterPolicyTablesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.policyTables = builder.policyTables;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTransitRouterPolicyTablesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return policyTables
     */
    public java.util.List<PolicyTables> getPolicyTables() {
        return this.policyTables;
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
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<PolicyTables> policyTables; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTransitRouterPolicyTablesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.policyTables = model.policyTables;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The number of entries returned on each page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token for the next query. Valid values:</p>
         * <ul>
         * <li>If NextToken is empty, no subsequent query is required.</li>
         * <li>If NextToken is returned, the value indicates the token for the next query.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dd20****</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The policy route tables.</p>
         */
        public Builder policyTables(java.util.List<PolicyTables> policyTables) {
            this.policyTables = policyTables;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2BFA6822-240E-4E27-B4C8-AA400EF7474D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTransitRouterPolicyTablesResponseBody build() {
            return new DescribeTransitRouterPolicyTablesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTransitRouterPolicyTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransitRouterPolicyTablesResponseBody</p>
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>tagtest</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>tagtest</p>
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
     * {@link DescribeTransitRouterPolicyTablesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTransitRouterPolicyTablesResponseBody</p>
     */
    public static class PolicyTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attachments")
        private java.util.List<String> attachments;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("PolicyTableId")
        private String policyTableId;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TransitRouterId")
        private String transitRouterId;

        private PolicyTables(Builder builder) {
            this.attachments = builder.attachments;
            this.creationTime = builder.creationTime;
            this.description = builder.description;
            this.name = builder.name;
            this.policyTableId = builder.policyTableId;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.tags = builder.tags;
            this.transitRouterId = builder.transitRouterId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PolicyTables create() {
            return builder().build();
        }

        /**
         * @return attachments
         */
        public java.util.List<String> getAttachments() {
            return this.attachments;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return policyTableId
         */
        public String getPolicyTableId() {
            return this.policyTableId;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return transitRouterId
         */
        public String getTransitRouterId() {
            return this.transitRouterId;
        }

        public static final class Builder {
            private java.util.List<String> attachments; 
            private String creationTime; 
            private String description; 
            private String name; 
            private String policyTableId; 
            private String regionId; 
            private String status; 
            private java.util.List<Tags> tags; 
            private String transitRouterId; 

            private Builder() {
            } 

            private Builder(PolicyTables model) {
                this.attachments = model.attachments;
                this.creationTime = model.creationTime;
                this.description = model.description;
                this.name = model.name;
                this.policyTableId = model.policyTableId;
                this.regionId = model.regionId;
                this.status = model.status;
                this.tags = model.tags;
                this.transitRouterId = model.transitRouterId;
            } 

            /**
             * <p>The network instance attachments associated with the policy route table.</p>
             */
            public Builder attachments(java.util.List<String> attachments) {
                this.attachments = attachments;
                return this;
            }

            /**
             * <p>The time when the policy route table was created.</p>
             * <p>The time is displayed in the ISO 8601 standard in the YYYY-MM-DDThh:mmZ format. The time is displayed in UTC.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mm:ssZ</p>
             * 
             * <strong>example:</strong>
             * <p>2019-10-22T07:44Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The description of the policy route table.</p>
             * 
             * <strong>example:</strong>
             * <p>descriptiontest</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the policy route table.</p>
             * 
             * <strong>example:</strong>
             * <p>nametest</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The policy routing table instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ptbl-44m0p68spvlrqq****</p>
             */
            public Builder policyTableId(String policyTableId) {
                this.policyTableId = policyTableId;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The status of the policy route table. Valid values:</p>
             * <ul>
             * <li><p>Creating: The policy route table is being created.</p>
             * </li>
             * <li><p>Active: The policy route table is running.</p>
             * </li>
             * <li><p>Deleting: The policy route table is being deleted.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Active</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The tags added to the policy route table.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the Enterprise Edition transit router.</p>
             * 
             * <strong>example:</strong>
             * <p>tr-uf654ttymmljlvh2x****</p>
             */
            public Builder transitRouterId(String transitRouterId) {
                this.transitRouterId = transitRouterId;
                return this;
            }

            public PolicyTables build() {
                return new PolicyTables(this);
            } 

        } 

    }
}
