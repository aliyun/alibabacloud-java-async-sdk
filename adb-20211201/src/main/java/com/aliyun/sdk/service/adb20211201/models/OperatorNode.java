// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OperatorNode} extends {@link TeaModel}
 *
 * <p>OperatorNode</p>
 */
public class OperatorNode extends TeaModel {
    @NameInMap("children")
    private java.util.List < OperatorNode > children;

    @NameInMap("id")
    private Integer id;

    @NameInMap("levelWidth")
    private Integer levelWidth;

    @NameInMap("nodeDepth")
    private Integer nodeDepth;

    @NameInMap("nodeName")
    private String nodeName;

    @NameInMap("nodeWidth")
    private Integer nodeWidth;

    @NameInMap("parentId")
    private Integer parentId;

    @NameInMap("stats")
    private Stats stats;

    private OperatorNode(Builder builder) {
        this.children = builder.children;
        this.id = builder.id;
        this.levelWidth = builder.levelWidth;
        this.nodeDepth = builder.nodeDepth;
        this.nodeName = builder.nodeName;
        this.nodeWidth = builder.nodeWidth;
        this.parentId = builder.parentId;
        this.stats = builder.stats;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OperatorNode create() {
        return builder().build();
    }

    /**
     * @return children
     */
    public java.util.List < OperatorNode > getChildren() {
        return this.children;
    }

    /**
     * @return id
     */
    public Integer getId() {
        return this.id;
    }

    /**
     * @return levelWidth
     */
    public Integer getLevelWidth() {
        return this.levelWidth;
    }

    /**
     * @return nodeDepth
     */
    public Integer getNodeDepth() {
        return this.nodeDepth;
    }

    /**
     * @return nodeName
     */
    public String getNodeName() {
        return this.nodeName;
    }

    /**
     * @return nodeWidth
     */
    public Integer getNodeWidth() {
        return this.nodeWidth;
    }

    /**
     * @return parentId
     */
    public Integer getParentId() {
        return this.parentId;
    }

    /**
     * @return stats
     */
    public Stats getStats() {
        return this.stats;
    }

    public static final class Builder {
        private java.util.List < OperatorNode > children; 
        private Integer id; 
        private Integer levelWidth; 
        private Integer nodeDepth; 
        private String nodeName; 
        private Integer nodeWidth; 
        private Integer parentId; 
        private Stats stats; 

        /**
         * children.
         */
        public Builder children(java.util.List < OperatorNode > children) {
            this.children = children;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Integer id) {
            this.id = id;
            return this;
        }

        /**
         * levelWidth.
         */
        public Builder levelWidth(Integer levelWidth) {
            this.levelWidth = levelWidth;
            return this;
        }

        /**
         * nodeDepth.
         */
        public Builder nodeDepth(Integer nodeDepth) {
            this.nodeDepth = nodeDepth;
            return this;
        }

        /**
         * nodeName.
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * nodeWidth.
         */
        public Builder nodeWidth(Integer nodeWidth) {
            this.nodeWidth = nodeWidth;
            return this;
        }

        /**
         * parentId.
         */
        public Builder parentId(Integer parentId) {
            this.parentId = parentId;
            return this;
        }

        /**
         * stats.
         */
        public Builder stats(Stats stats) {
            this.stats = stats;
            return this;
        }

        public OperatorNode build() {
            return new OperatorNode(this);
        } 

    } 

    public static class Stats extends TeaModel {
        @NameInMap("bytes")
        private Long bytes;

        @NameInMap("outputRows")
        private Long outputRows;

        @NameInMap("parameters")
        private String parameters;

        @NameInMap("peakMemory")
        private Long peakMemory;

        @NameInMap("timeCost")
        private Long timeCost;

        private Stats(Builder builder) {
            this.bytes = builder.bytes;
            this.outputRows = builder.outputRows;
            this.parameters = builder.parameters;
            this.peakMemory = builder.peakMemory;
            this.timeCost = builder.timeCost;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Stats create() {
            return builder().build();
        }

        /**
         * @return bytes
         */
        public Long getBytes() {
            return this.bytes;
        }

        /**
         * @return outputRows
         */
        public Long getOutputRows() {
            return this.outputRows;
        }

        /**
         * @return parameters
         */
        public String getParameters() {
            return this.parameters;
        }

        /**
         * @return peakMemory
         */
        public Long getPeakMemory() {
            return this.peakMemory;
        }

        /**
         * @return timeCost
         */
        public Long getTimeCost() {
            return this.timeCost;
        }

        public static final class Builder {
            private Long bytes; 
            private Long outputRows; 
            private String parameters; 
            private Long peakMemory; 
            private Long timeCost; 

            /**
             * bytes.
             */
            public Builder bytes(Long bytes) {
                this.bytes = bytes;
                return this;
            }

            /**
             * outputRows.
             */
            public Builder outputRows(Long outputRows) {
                this.outputRows = outputRows;
                return this;
            }

            /**
             * parameters.
             */
            public Builder parameters(String parameters) {
                this.parameters = parameters;
                return this;
            }

            /**
             * peakMemory.
             */
            public Builder peakMemory(Long peakMemory) {
                this.peakMemory = peakMemory;
                return this;
            }

            /**
             * timeCost.
             */
            public Builder timeCost(Long timeCost) {
                this.timeCost = timeCost;
                return this;
            }

            public Stats build() {
                return new Stats(this);
            } 

        } 

    }
}
