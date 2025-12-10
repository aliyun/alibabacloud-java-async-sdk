// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20210202.models;

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
 * {@link GetExperimentVisualizationMetaResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentVisualizationMetaResponseBody</p>
 */
public class GetExperimentVisualizationMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("VisualizationMeta")
    private java.util.List<VisualizationMeta> visualizationMeta;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetExperimentVisualizationMetaResponseBody(Builder builder) {
        this.visualizationMeta = builder.visualizationMeta;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentVisualizationMetaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return visualizationMeta
     */
    public java.util.List<VisualizationMeta> getVisualizationMeta() {
        return this.visualizationMeta;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<VisualizationMeta> visualizationMeta; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetExperimentVisualizationMetaResponseBody model) {
            this.visualizationMeta = model.visualizationMeta;
            this.requestId = model.requestId;
        } 

        /**
         * VisualizationMeta.
         */
        public Builder visualizationMeta(java.util.List<VisualizationMeta> visualizationMeta) {
            this.visualizationMeta = visualizationMeta;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetExperimentVisualizationMetaResponseBody build() {
            return new GetExperimentVisualizationMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetExperimentVisualizationMetaResponseBody} extends {@link TeaModel}
     *
     * <p>GetExperimentVisualizationMetaResponseBody</p>
     */
    public static class VisualizationMeta extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Meta")
        private String meta;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        private VisualizationMeta(Builder builder) {
            this.meta = builder.meta;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VisualizationMeta create() {
            return builder().build();
        }

        /**
         * @return meta
         */
        public String getMeta() {
            return this.meta;
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

        public static final class Builder {
            private String meta; 
            private String nodeId; 
            private String nodeName; 

            private Builder() {
            } 

            private Builder(VisualizationMeta model) {
                this.meta = model.meta;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
            } 

            /**
             * Meta.
             */
            public Builder meta(String meta) {
                this.meta = meta;
                return this;
            }

            /**
             * NodeId.
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            public VisualizationMeta build() {
                return new VisualizationMeta(this);
            } 

        } 

    }
}
