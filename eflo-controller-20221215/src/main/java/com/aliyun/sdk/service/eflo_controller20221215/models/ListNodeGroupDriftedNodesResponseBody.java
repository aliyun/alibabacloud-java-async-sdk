// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

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
 * {@link ListNodeGroupDriftedNodesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodeGroupDriftedNodesResponseBody</p>
 */
public class ListNodeGroupDriftedNodesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("Nodes")
    private java.util.List<Nodes> nodes;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListNodeGroupDriftedNodesResponseBody(Builder builder) {
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.nodes = builder.nodes;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeGroupDriftedNodesResponseBody create() {
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
     * @return nodes
     */
    public java.util.List<Nodes> getNodes() {
        return this.nodes;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer maxResults; 
        private String nextToken; 
        private java.util.List<Nodes> nodes; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListNodeGroupDriftedNodesResponseBody model) {
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.nodes = model.nodes;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The maximum number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token returned by this call. An empty value indicates that no more pages exist.</p>
         * 
         * <strong>example:</strong>
         * <p>3a6b93229825ac667104463b56790c91</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The list of nodes that are inconsistent with the node group configuration (paginated).</p>
         */
        public Builder nodes(java.util.List<Nodes> nodes) {
            this.nodes = nodes;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>887FA855-89F4-5DB3-B305-C5879EC480E6</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNodeGroupDriftedNodesResponseBody build() {
            return new ListNodeGroupDriftedNodesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodeGroupDriftedNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeGroupDriftedNodesResponseBody</p>
     */
    public static class PropertyDrifts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActualValue")
        private String actualValue;

        @com.aliyun.core.annotation.NameInMap("MinRequiredAction")
        private String minRequiredAction;

        @com.aliyun.core.annotation.NameInMap("PropertyPath")
        private String propertyPath;

        @com.aliyun.core.annotation.NameInMap("TargetValue")
        private String targetValue;

        private PropertyDrifts(Builder builder) {
            this.actualValue = builder.actualValue;
            this.minRequiredAction = builder.minRequiredAction;
            this.propertyPath = builder.propertyPath;
            this.targetValue = builder.targetValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PropertyDrifts create() {
            return builder().build();
        }

        /**
         * @return actualValue
         */
        public String getActualValue() {
            return this.actualValue;
        }

        /**
         * @return minRequiredAction
         */
        public String getMinRequiredAction() {
            return this.minRequiredAction;
        }

        /**
         * @return propertyPath
         */
        public String getPropertyPath() {
            return this.propertyPath;
        }

        /**
         * @return targetValue
         */
        public String getTargetValue() {
            return this.targetValue;
        }

        public static final class Builder {
            private String actualValue; 
            private String minRequiredAction; 
            private String propertyPath; 
            private String targetValue; 

            private Builder() {
            } 

            private Builder(PropertyDrifts model) {
                this.actualValue = model.actualValue;
                this.minRequiredAction = model.minRequiredAction;
                this.propertyPath = model.propertyPath;
                this.targetValue = model.targetValue;
            } 

            /**
             * <p>The current value of the node property. Complex types are serialized as JSON strings.</p>
             * 
             * <strong>example:</strong>
             * <p>old-role</p>
             */
            public Builder actualValue(String actualValue) {
                this.actualValue = actualValue;
                return this;
            }

            /**
             * <p>The minimum action required to apply the TargetValue: Refresh, Reboot, or Reimage. For more information, refer to the MaxDisruptiveAction parameter of the RefreshNodeGroupNodes operation.</p>
             * 
             * <strong>example:</strong>
             * <p>Refresh</p>
             */
            public Builder minRequiredAction(String minRequiredAction) {
                this.minRequiredAction = minRequiredAction;
                return this;
            }

            /**
             * <p>The property path in dot notation (such as a.b.c), compatible with both flat and nested properties.</p>
             * 
             * <strong>example:</strong>
             * <p>RamRoleName</p>
             */
            public Builder propertyPath(String propertyPath) {
                this.propertyPath = propertyPath;
                return this;
            }

            /**
             * <p>The target value of the node property. Complex types are serialized as JSON strings.</p>
             * 
             * <strong>example:</strong>
             * <p>new-role</p>
             */
            public Builder targetValue(String targetValue) {
                this.targetValue = targetValue;
                return this;
            }

            public PropertyDrifts build() {
                return new PropertyDrifts(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeGroupDriftedNodesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeGroupDriftedNodesResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("PropertyDrifts")
        private java.util.List<PropertyDrifts> propertyDrifts;

        private Nodes(Builder builder) {
            this.nodeId = builder.nodeId;
            this.propertyDrifts = builder.propertyDrifts;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return propertyDrifts
         */
        public java.util.List<PropertyDrifts> getPropertyDrifts() {
            return this.propertyDrifts;
        }

        public static final class Builder {
            private String nodeId; 
            private java.util.List<PropertyDrifts> propertyDrifts; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.nodeId = model.nodeId;
                this.propertyDrifts = model.propertyDrifts;
            } 

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>node-001</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The list of inconsistent properties for this node.</p>
             */
            public Builder propertyDrifts(java.util.List<PropertyDrifts> propertyDrifts) {
                this.propertyDrifts = propertyDrifts;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
}
