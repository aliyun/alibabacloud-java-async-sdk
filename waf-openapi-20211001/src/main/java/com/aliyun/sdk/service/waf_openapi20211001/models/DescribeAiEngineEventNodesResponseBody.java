// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.waf_openapi20211001.models;

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
 * {@link DescribeAiEngineEventNodesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAiEngineEventNodesResponseBody</p>
 */
public class DescribeAiEngineEventNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAiEngineEventNodesResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiEngineEventNodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAiEngineEventNodesResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of nodes.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries to return on each page in a paging query. Valid values: 1 to 20. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token that is used to query the next page. If a next page exists, this field returns a value.</p>
         * <blockquote>
         * <p>If this parameter returns a value, a next page exists. You can use the returned <strong>NextToken</strong> as a request parameter to obtain the data on the next page until no value is returned, which indicates that all data is obtained.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>AAAAAGBgV9tolsLfijC4wam2htS*****D/46H3X2wIS</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>request-demo</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of nodes for the event.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAiEngineEventNodesResponseBody build() {
            return new DescribeAiEngineEventNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAiEngineEventNodesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAiEngineEventNodesResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeDetail")
        private String nodeDetail;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeSummary")
        private String nodeSummary;

        @com.aliyun.core.annotation.NameInMap("NodeTag")
        private String nodeTag;

        @com.aliyun.core.annotation.NameInMap("OccurredAt")
        private Long occurredAt;

        private Items(Builder builder) {
            this.nodeDetail = builder.nodeDetail;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeSummary = builder.nodeSummary;
            this.nodeTag = builder.nodeTag;
            this.occurredAt = builder.occurredAt;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return nodeDetail
         */
        public String getNodeDetail() {
            return this.nodeDetail;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeSummary
         */
        public String getNodeSummary() {
            return this.nodeSummary;
        }

        /**
         * @return nodeTag
         */
        public String getNodeTag() {
            return this.nodeTag;
        }

        /**
         * @return occurredAt
         */
        public Long getOccurredAt() {
            return this.occurredAt;
        }

        public static final class Builder {
            private String nodeDetail; 
            private String nodeId; 
            private String nodeName; 
            private String nodeSummary; 
            private String nodeTag; 
            private Long occurredAt; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.nodeDetail = model.nodeDetail;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeSummary = model.nodeSummary;
                this.nodeTag = model.nodeTag;
                this.occurredAt = model.occurredAt;
            } 

            /**
             * <p>The details of the node in the specified language. The details are in Markdown format.</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li><strong>Characteristic</strong>: single quote closure</li>
             * <li><strong>Risk</strong>: high</li>
             * </ul>
             */
            public Builder nodeDetail(String nodeDetail) {
                this.nodeDetail = nodeDetail;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>node-109-04</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The name of the node in the specified language.</p>
             * 
             * <strong>example:</strong>
             * <p>SQL Injection</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>The summary of the node in the specified language.</p>
             * 
             * <strong>example:</strong>
             * <p>The request matches SQL injection characteristics.</p>
             */
            public Builder nodeSummary(String nodeSummary) {
                this.nodeSummary = nodeSummary;
                return this;
            }

            /**
             * <p>The node tag. Valid values:</p>
             * <ul>
             * <li><p><strong>bypass</strong>: Suspected bypass.</p>
             * </li>
             * <li><p><strong>protect</strong>: Mitigated.</p>
             * </li>
             * <li><p><strong>attempt</strong>: Reconnaissance and probing.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>bypass</p>
             */
            public Builder nodeTag(String nodeTag) {
                this.nodeTag = nodeTag;
                return this;
            }

            /**
             * <p>The time when the node occurred. The time is in the UNIX timestamp format. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1792973400000</p>
             */
            public Builder occurredAt(Long occurredAt) {
                this.occurredAt = occurredAt;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
