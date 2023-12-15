// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateDialogFlowModuleDefinition} extends {@link TeaModel}
 *
 * <p>UpdateDialogFlowModuleDefinition</p>
 */
public class UpdateDialogFlowModuleDefinition extends TeaModel {
    @NameInMap("Edges")
    private java.util.List < PaasEdgeDTO > edges;

    @NameInMap("Nodes")
    private java.util.List < PaasNodeDTO > nodes;

    private UpdateDialogFlowModuleDefinition(Builder builder) {
        this.edges = builder.edges;
        this.nodes = builder.nodes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDialogFlowModuleDefinition create() {
        return builder().build();
    }

    /**
     * @return edges
     */
    public java.util.List < PaasEdgeDTO > getEdges() {
        return this.edges;
    }

    /**
     * @return nodes
     */
    public java.util.List < PaasNodeDTO > getNodes() {
        return this.nodes;
    }

    public static final class Builder {
        private java.util.List < PaasEdgeDTO > edges; 
        private java.util.List < PaasNodeDTO > nodes; 

        /**
         * Edges.
         */
        public Builder edges(java.util.List < PaasEdgeDTO > edges) {
            this.edges = edges;
            return this;
        }

        /**
         * Nodes.
         */
        public Builder nodes(java.util.List < PaasNodeDTO > nodes) {
            this.nodes = nodes;
            return this;
        }

        public UpdateDialogFlowModuleDefinition build() {
            return new UpdateDialogFlowModuleDefinition(this);
        } 

    } 

}
