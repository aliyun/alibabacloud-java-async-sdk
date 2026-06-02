// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appflow20230904.models;

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
 * {@link GetFlowResponseBody} extends {@link TeaModel}
 *
 * <p>GetFlowResponseBody</p>
 */
public class GetFlowResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Flow")
    private Flow flow;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetFlowResponseBody(Builder builder) {
        this.flow = builder.flow;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFlowResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return flow
     */
    public Flow getFlow() {
        return this.flow;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Flow flow; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetFlowResponseBody model) {
            this.flow = model.flow;
            this.requestId = model.requestId;
        } 

        /**
         * Flow.
         */
        public Builder flow(Flow flow) {
            this.flow = flow;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B6E1E38D-011F-5368-ADD8-4DC278254AA3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFlowResponseBody build() {
            return new GetFlowResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetFlowResponseBody</p>
     */
    public static class FlowNodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuthMetadata")
        private String authMetadata;

        @com.aliyun.core.annotation.NameInMap("ConnectorId")
        private String connectorId;

        @com.aliyun.core.annotation.NameInMap("ConnectorVersion")
        private String connectorVersion;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowVersion")
        private String flowVersion;

        @com.aliyun.core.annotation.NameInMap("InputSchema")
        private String inputSchema;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeKey")
        private String nodeKey;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("PrevNodeId")
        private String prevNodeId;

        @com.aliyun.core.annotation.NameInMap("RefId")
        private String refId;

        @com.aliyun.core.annotation.NameInMap("RefVersion")
        private String refVersion;

        @com.aliyun.core.annotation.NameInMap("WebhookUrl")
        private String webhookUrl;

        private FlowNodes(Builder builder) {
            this.authMetadata = builder.authMetadata;
            this.connectorId = builder.connectorId;
            this.connectorVersion = builder.connectorVersion;
            this.flowId = builder.flowId;
            this.flowVersion = builder.flowVersion;
            this.inputSchema = builder.inputSchema;
            this.nodeId = builder.nodeId;
            this.nodeKey = builder.nodeKey;
            this.nodeName = builder.nodeName;
            this.nodeType = builder.nodeType;
            this.prevNodeId = builder.prevNodeId;
            this.refId = builder.refId;
            this.refVersion = builder.refVersion;
            this.webhookUrl = builder.webhookUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FlowNodes create() {
            return builder().build();
        }

        /**
         * @return authMetadata
         */
        public String getAuthMetadata() {
            return this.authMetadata;
        }

        /**
         * @return connectorId
         */
        public String getConnectorId() {
            return this.connectorId;
        }

        /**
         * @return connectorVersion
         */
        public String getConnectorVersion() {
            return this.connectorVersion;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowVersion
         */
        public String getFlowVersion() {
            return this.flowVersion;
        }

        /**
         * @return inputSchema
         */
        public String getInputSchema() {
            return this.inputSchema;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeKey
         */
        public String getNodeKey() {
            return this.nodeKey;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return prevNodeId
         */
        public String getPrevNodeId() {
            return this.prevNodeId;
        }

        /**
         * @return refId
         */
        public String getRefId() {
            return this.refId;
        }

        /**
         * @return refVersion
         */
        public String getRefVersion() {
            return this.refVersion;
        }

        /**
         * @return webhookUrl
         */
        public String getWebhookUrl() {
            return this.webhookUrl;
        }

        public static final class Builder {
            private String authMetadata; 
            private String connectorId; 
            private String connectorVersion; 
            private String flowId; 
            private String flowVersion; 
            private String inputSchema; 
            private String nodeId; 
            private String nodeKey; 
            private String nodeName; 
            private String nodeType; 
            private String prevNodeId; 
            private String refId; 
            private String refVersion; 
            private String webhookUrl; 

            private Builder() {
            } 

            private Builder(FlowNodes model) {
                this.authMetadata = model.authMetadata;
                this.connectorId = model.connectorId;
                this.connectorVersion = model.connectorVersion;
                this.flowId = model.flowId;
                this.flowVersion = model.flowVersion;
                this.inputSchema = model.inputSchema;
                this.nodeId = model.nodeId;
                this.nodeKey = model.nodeKey;
                this.nodeName = model.nodeName;
                this.nodeType = model.nodeType;
                this.prevNodeId = model.prevNodeId;
                this.refId = model.refId;
                this.refVersion = model.refVersion;
                this.webhookUrl = model.webhookUrl;
            } 

            /**
             * AuthMetadata.
             */
            public Builder authMetadata(String authMetadata) {
                this.authMetadata = authMetadata;
                return this;
            }

            /**
             * ConnectorId.
             */
            public Builder connectorId(String connectorId) {
                this.connectorId = connectorId;
                return this;
            }

            /**
             * ConnectorVersion.
             */
            public Builder connectorVersion(String connectorVersion) {
                this.connectorVersion = connectorVersion;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * FlowVersion.
             */
            public Builder flowVersion(String flowVersion) {
                this.flowVersion = flowVersion;
                return this;
            }

            /**
             * InputSchema.
             */
            public Builder inputSchema(String inputSchema) {
                this.inputSchema = inputSchema;
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
             * NodeKey.
             */
            public Builder nodeKey(String nodeKey) {
                this.nodeKey = nodeKey;
                return this;
            }

            /**
             * NodeName.
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * NodeType.
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * PrevNodeId.
             */
            public Builder prevNodeId(String prevNodeId) {
                this.prevNodeId = prevNodeId;
                return this;
            }

            /**
             * RefId.
             */
            public Builder refId(String refId) {
                this.refId = refId;
                return this;
            }

            /**
             * RefVersion.
             */
            public Builder refVersion(String refVersion) {
                this.refVersion = refVersion;
                return this;
            }

            /**
             * WebhookUrl.
             */
            public Builder webhookUrl(String webhookUrl) {
                this.webhookUrl = webhookUrl;
                return this;
            }

            public FlowNodes build() {
                return new FlowNodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetFlowResponseBody</p>
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
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
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
     * {@link GetFlowResponseBody} extends {@link TeaModel}
     *
     * <p>GetFlowResponseBody</p>
     */
    public static class Flow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Enabled")
        private String enabled;

        @com.aliyun.core.annotation.NameInMap("FlowDesc")
        private String flowDesc;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        @com.aliyun.core.annotation.NameInMap("FlowNodes")
        private java.util.List<FlowNodes> flowNodes;

        @com.aliyun.core.annotation.NameInMap("FlowTemplate")
        private String flowTemplate;

        @com.aliyun.core.annotation.NameInMap("FlowVersion")
        private String flowVersion;

        @com.aliyun.core.annotation.NameInMap("FlowVersionStatus")
        private String flowVersionStatus;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        private Flow(Builder builder) {
            this.enabled = builder.enabled;
            this.flowDesc = builder.flowDesc;
            this.flowId = builder.flowId;
            this.flowName = builder.flowName;
            this.flowNodes = builder.flowNodes;
            this.flowTemplate = builder.flowTemplate;
            this.flowVersion = builder.flowVersion;
            this.flowVersionStatus = builder.flowVersionStatus;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flow create() {
            return builder().build();
        }

        /**
         * @return enabled
         */
        public String getEnabled() {
            return this.enabled;
        }

        /**
         * @return flowDesc
         */
        public String getFlowDesc() {
            return this.flowDesc;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return flowNodes
         */
        public java.util.List<FlowNodes> getFlowNodes() {
            return this.flowNodes;
        }

        /**
         * @return flowTemplate
         */
        public String getFlowTemplate() {
            return this.flowTemplate;
        }

        /**
         * @return flowVersion
         */
        public String getFlowVersion() {
            return this.flowVersion;
        }

        /**
         * @return flowVersionStatus
         */
        public String getFlowVersionStatus() {
            return this.flowVersionStatus;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        public static final class Builder {
            private String enabled; 
            private String flowDesc; 
            private String flowId; 
            private String flowName; 
            private java.util.List<FlowNodes> flowNodes; 
            private String flowTemplate; 
            private String flowVersion; 
            private String flowVersionStatus; 
            private String gmtCreate; 
            private String gmtModified; 
            private java.util.List<Tags> tags; 

            private Builder() {
            } 

            private Builder(Flow model) {
                this.enabled = model.enabled;
                this.flowDesc = model.flowDesc;
                this.flowId = model.flowId;
                this.flowName = model.flowName;
                this.flowNodes = model.flowNodes;
                this.flowTemplate = model.flowTemplate;
                this.flowVersion = model.flowVersion;
                this.flowVersionStatus = model.flowVersionStatus;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.tags = model.tags;
            } 

            /**
             * Enabled.
             */
            public Builder enabled(String enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * FlowDesc.
             */
            public Builder flowDesc(String flowDesc) {
                this.flowDesc = flowDesc;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * FlowName.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * FlowNodes.
             */
            public Builder flowNodes(java.util.List<FlowNodes> flowNodes) {
                this.flowNodes = flowNodes;
                return this;
            }

            /**
             * FlowTemplate.
             */
            public Builder flowTemplate(String flowTemplate) {
                this.flowTemplate = flowTemplate;
                return this;
            }

            /**
             * FlowVersion.
             */
            public Builder flowVersion(String flowVersion) {
                this.flowVersion = flowVersion;
                return this;
            }

            /**
             * FlowVersionStatus.
             */
            public Builder flowVersionStatus(String flowVersionStatus) {
                this.flowVersionStatus = flowVersionStatus;
                return this;
            }

            /**
             * GmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * GmtModified.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * Tags.
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            public Flow build() {
                return new Flow(this);
            } 

        } 

    }
}
