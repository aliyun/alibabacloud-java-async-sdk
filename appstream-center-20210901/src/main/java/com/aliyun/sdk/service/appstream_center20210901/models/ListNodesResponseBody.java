// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210901.models;

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
 * {@link ListNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodesResponseBody</p>
 */
public class ListNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("NodeModels")
    private java.util.List<NodeModels> nodeModels;

    @com.aliyun.core.annotation.NameInMap("PerPageSize")
    private Integer perPageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ToPage")
    private Integer toPage;

    private ListNodesResponseBody(Builder builder) {
        this.count = builder.count;
        this.nodeModels = builder.nodeModels;
        this.perPageSize = builder.perPageSize;
        this.requestId = builder.requestId;
        this.toPage = builder.toPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return nodeModels
     */
    public java.util.List<NodeModels> getNodeModels() {
        return this.nodeModels;
    }

    /**
     * @return perPageSize
     */
    public Integer getPerPageSize() {
        return this.perPageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return toPage
     */
    public Integer getToPage() {
        return this.toPage;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<NodeModels> nodeModels; 
        private Integer perPageSize; 
        private String requestId; 
        private Integer toPage; 

        private Builder() {
        } 

        private Builder(ListNodesResponseBody model) {
            this.count = model.count;
            this.nodeModels = model.nodeModels;
            this.perPageSize = model.perPageSize;
            this.requestId = model.requestId;
            this.toPage = model.toPage;
        } 

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The resource nodes.</p>
         */
        public Builder nodeModels(java.util.List<NodeModels> nodeModels) {
            this.nodeModels = nodeModels;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder perPageSize(Integer perPageSize) {
            this.perPageSize = perPageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder toPage(Integer toPage) {
            this.toPage = toPage;
            return this;
        }

        public ListNodesResponseBody build() {
            return new ListNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodesResponseBody</p>
     */
    public static class NodeModels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private String chargeType;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        private NodeModels(Builder builder) {
            this.chargeType = builder.chargeType;
            this.nodeId = builder.nodeId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeModels create() {
            return builder().build();
        }

        /**
         * @return chargeType
         */
        public String getChargeType() {
            return this.chargeType;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        public static final class Builder {
            private String chargeType; 
            private String nodeId; 

            private Builder() {
            } 

            private Builder(NodeModels model) {
                this.chargeType = model.chargeType;
                this.nodeId = model.nodeId;
            } 

            /**
             * <p>The billing method of the resource node.</p>
             * <blockquote>
             * <p> This parameter is returned only if the ChargeResourceMode parameter of the delivery group to which the resource node belongs is set to Node.</p>
             * </blockquote>
             * <p>Valid values:</p>
             * <ul>
             * <li>PostPaid: pay-as-you-go</li>
             * <li>Prepaid: subscription</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PostPaid</p>
             */
            public Builder chargeType(String chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The ID of the resource node.</p>
             * <blockquote>
             * <p> This parameter is returned only if the ChargeResourceMode parameter of the delivery group to which the resource node belongs is set to Node.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>i-bp13********</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            public NodeModels build() {
                return new NodeModels(this);
            } 

        } 

    }
}
