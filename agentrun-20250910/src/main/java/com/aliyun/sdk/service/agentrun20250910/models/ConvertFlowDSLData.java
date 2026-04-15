// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ConvertFlowDSLData} extends {@link TeaModel}
 *
 * <p>ConvertFlowDSLData</p>
 */
public class ConvertFlowDSLData extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("conversionPlan")
    private ConversionPlan conversionPlan;

    @com.aliyun.core.annotation.NameInMap("flow")
    @com.aliyun.core.annotation.Validation(required = true)
    private Flow flow;

    @com.aliyun.core.annotation.NameInMap("pluginErrors")
    private java.util.List<PluginErrors> pluginErrors;

    @com.aliyun.core.annotation.NameInMap("toolsetInstallations")
    private java.util.List<ToolsetInstallations> toolsetInstallations;

    private ConvertFlowDSLData(Builder builder) {
        this.conversionPlan = builder.conversionPlan;
        this.flow = builder.flow;
        this.pluginErrors = builder.pluginErrors;
        this.toolsetInstallations = builder.toolsetInstallations;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConvertFlowDSLData create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conversionPlan
     */
    public ConversionPlan getConversionPlan() {
        return this.conversionPlan;
    }

    /**
     * @return flow
     */
    public Flow getFlow() {
        return this.flow;
    }

    /**
     * @return pluginErrors
     */
    public java.util.List<PluginErrors> getPluginErrors() {
        return this.pluginErrors;
    }

    /**
     * @return toolsetInstallations
     */
    public java.util.List<ToolsetInstallations> getToolsetInstallations() {
        return this.toolsetInstallations;
    }

    public static final class Builder {
        private ConversionPlan conversionPlan; 
        private Flow flow; 
        private java.util.List<PluginErrors> pluginErrors; 
        private java.util.List<ToolsetInstallations> toolsetInstallations; 

        private Builder() {
        } 

        private Builder(ConvertFlowDSLData model) {
            this.conversionPlan = model.conversionPlan;
            this.flow = model.flow;
            this.pluginErrors = model.pluginErrors;
            this.toolsetInstallations = model.toolsetInstallations;
        } 

        /**
         * <p>DSL兼容性分析和转换计划</p>
         */
        public Builder conversionPlan(ConversionPlan conversionPlan) {
            this.conversionPlan = conversionPlan;
            return this;
        }

        /**
         * <p>转换后的AgentRun Flow配置信息</p>
         * <p>This parameter is required.</p>
         */
        public Builder flow(Flow flow) {
            this.flow = flow;
            return this;
        }

        /**
         * <p>插件识别或转换过程中的错误信息</p>
         */
        public Builder pluginErrors(java.util.List<PluginErrors> pluginErrors) {
            this.pluginErrors = pluginErrors;
            return this;
        }

        /**
         * <p>需要安装的Toolset配置列表</p>
         */
        public Builder toolsetInstallations(java.util.List<ToolsetInstallations> toolsetInstallations) {
            this.toolsetInstallations = toolsetInstallations;
            return this;
        }

        public ConvertFlowDSLData build() {
            return new ConvertFlowDSLData(this);
        } 

    } 

    /**
     * 
     * {@link ConvertFlowDSLData} extends {@link TeaModel}
     *
     * <p>ConvertFlowDSLData</p>
     */
    public static class Issues extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        @com.aliyun.core.annotation.Validation(required = true)
        private String description;

        @com.aliyun.core.annotation.NameInMap("details")
        private java.util.Map<String, String> details;

        @com.aliyun.core.annotation.NameInMap("issueType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String issueType;

        @com.aliyun.core.annotation.NameInMap("level")
        @com.aliyun.core.annotation.Validation(required = true)
        private String level;

        @com.aliyun.core.annotation.NameInMap("nodeId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("nodeTitle")
        private String nodeTitle;

        @com.aliyun.core.annotation.NameInMap("nodeType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("suggestion")
        private String suggestion;

        private Issues(Builder builder) {
            this.description = builder.description;
            this.details = builder.details;
            this.issueType = builder.issueType;
            this.level = builder.level;
            this.nodeId = builder.nodeId;
            this.nodeTitle = builder.nodeTitle;
            this.nodeType = builder.nodeType;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Issues create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return details
         */
        public java.util.Map<String, String> getDetails() {
            return this.details;
        }

        /**
         * @return issueType
         */
        public String getIssueType() {
            return this.issueType;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeTitle
         */
        public String getNodeTitle() {
            return this.nodeTitle;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String description; 
            private java.util.Map<String, String> details; 
            private String issueType; 
            private String level; 
            private String nodeId; 
            private String nodeTitle; 
            private String nodeType; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(Issues model) {
                this.description = model.description;
                this.details = model.details;
                this.issueType = model.issueType;
                this.level = model.level;
                this.nodeId = model.nodeId;
                this.nodeTitle = model.nodeTitle;
                this.nodeType = model.nodeType;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>问题描述</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Tool node requires Toolset installation</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>问题的详细信息（JSON对象）</p>
             */
            public Builder details(java.util.Map<String, String> details) {
                this.details = details;
                return this;
            }

            /**
             * <p>问题类型：needs_config, needs_conversion, unsupported</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>needs_config</p>
             */
            public Builder issueType(String issueType) {
                this.issueType = issueType;
                return this;
            }

            /**
             * <p>问题严重程度：info, warning, error</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>warning</p>
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * <p>Dify DSL中的节点标识符</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1760514991682</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>节点显示名称</p>
             * 
             * <strong>example:</strong>
             * <p>Google Search</p>
             */
            public Builder nodeTitle(String nodeTitle) {
                this.nodeTitle = nodeTitle;
                return this;
            }

            /**
             * <p>节点类型</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>tool</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>解决建议</p>
             * 
             * <strong>example:</strong>
             * <p>Install Toolset &quot;google&quot; before using this flow</p>
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Issues build() {
                return new Issues(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConvertFlowDSLData} extends {@link TeaModel}
     *
     * <p>ConvertFlowDSLData</p>
     */
    public static class Summary extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("compatibleNodes")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer compatibleNodes;

        @com.aliyun.core.annotation.NameInMap("nodesNeedConfig")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer nodesNeedConfig;

        @com.aliyun.core.annotation.NameInMap("nodesNeedConversion")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer nodesNeedConversion;

        @com.aliyun.core.annotation.NameInMap("totalNodes")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer totalNodes;

        @com.aliyun.core.annotation.NameInMap("unsupportedNodes")
        @com.aliyun.core.annotation.Validation(required = true)
        private Integer unsupportedNodes;

        private Summary(Builder builder) {
            this.compatibleNodes = builder.compatibleNodes;
            this.nodesNeedConfig = builder.nodesNeedConfig;
            this.nodesNeedConversion = builder.nodesNeedConversion;
            this.totalNodes = builder.totalNodes;
            this.unsupportedNodes = builder.unsupportedNodes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Summary create() {
            return builder().build();
        }

        /**
         * @return compatibleNodes
         */
        public Integer getCompatibleNodes() {
            return this.compatibleNodes;
        }

        /**
         * @return nodesNeedConfig
         */
        public Integer getNodesNeedConfig() {
            return this.nodesNeedConfig;
        }

        /**
         * @return nodesNeedConversion
         */
        public Integer getNodesNeedConversion() {
            return this.nodesNeedConversion;
        }

        /**
         * @return totalNodes
         */
        public Integer getTotalNodes() {
            return this.totalNodes;
        }

        /**
         * @return unsupportedNodes
         */
        public Integer getUnsupportedNodes() {
            return this.unsupportedNodes;
        }

        public static final class Builder {
            private Integer compatibleNodes; 
            private Integer nodesNeedConfig; 
            private Integer nodesNeedConversion; 
            private Integer totalNodes; 
            private Integer unsupportedNodes; 

            private Builder() {
            } 

            private Builder(Summary model) {
                this.compatibleNodes = model.compatibleNodes;
                this.nodesNeedConfig = model.nodesNeedConfig;
                this.nodesNeedConversion = model.nodesNeedConversion;
                this.totalNodes = model.totalNodes;
                this.unsupportedNodes = model.unsupportedNodes;
            } 

            /**
             * <p>完全兼容的节点数</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
             */
            public Builder compatibleNodes(Integer compatibleNodes) {
                this.compatibleNodes = compatibleNodes;
                return this;
            }

            /**
             * <p>需要手动配置的节点数</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder nodesNeedConfig(Integer nodesNeedConfig) {
                this.nodesNeedConfig = nodesNeedConfig;
                return this;
            }

            /**
             * <p>需要特殊转换处理的节点数</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder nodesNeedConversion(Integer nodesNeedConversion) {
                this.nodesNeedConversion = nodesNeedConversion;
                return this;
            }

            /**
             * <p>Dify DSL中的总节点数</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalNodes(Integer totalNodes) {
                this.totalNodes = totalNodes;
                return this;
            }

            /**
             * <p>不支持的节点数</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder unsupportedNodes(Integer unsupportedNodes) {
                this.unsupportedNodes = unsupportedNodes;
                return this;
            }

            public Summary build() {
                return new Summary(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConvertFlowDSLData} extends {@link TeaModel}
     *
     * <p>ConvertFlowDSLData</p>
     */
    public static class ConversionPlan extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("issues")
        private java.util.List<Issues> issues;

        @com.aliyun.core.annotation.NameInMap("summary")
        @com.aliyun.core.annotation.Validation(required = true)
        private Summary summary;

        private ConversionPlan(Builder builder) {
            this.issues = builder.issues;
            this.summary = builder.summary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConversionPlan create() {
            return builder().build();
        }

        /**
         * @return issues
         */
        public java.util.List<Issues> getIssues() {
            return this.issues;
        }

        /**
         * @return summary
         */
        public Summary getSummary() {
            return this.summary;
        }

        public static final class Builder {
            private java.util.List<Issues> issues; 
            private Summary summary; 

            private Builder() {
            } 

            private Builder(ConversionPlan model) {
                this.issues = model.issues;
                this.summary = model.summary;
            } 

            /**
             * <p>节点兼容性问题详情</p>
             */
            public Builder issues(java.util.List<Issues> issues) {
                this.issues = issues;
                return this;
            }

            /**
             * <p>节点兼容性统计摘要</p>
             * <p>This parameter is required.</p>
             */
            public Builder summary(Summary summary) {
                this.summary = summary;
                return this;
            }

            public ConversionPlan build() {
                return new ConversionPlan(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConvertFlowDSLData} extends {@link TeaModel}
     *
     * <p>ConvertFlowDSLData</p>
     */
    public static class Flow extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("definition")
        @com.aliyun.core.annotation.Validation(required = true)
        private String definition;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("environmentConfiguration")
        private EnvironmentConfiguration environmentConfiguration;

        @com.aliyun.core.annotation.NameInMap("flowName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String flowName;

        private Flow(Builder builder) {
            this.definition = builder.definition;
            this.description = builder.description;
            this.environmentConfiguration = builder.environmentConfiguration;
            this.flowName = builder.flowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flow create() {
            return builder().build();
        }

        /**
         * @return definition
         */
        public String getDefinition() {
            return this.definition;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return environmentConfiguration
         */
        public EnvironmentConfiguration getEnvironmentConfiguration() {
            return this.environmentConfiguration;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        public static final class Builder {
            private String definition; 
            private String description; 
            private EnvironmentConfiguration environmentConfiguration; 
            private String flowName; 

            private Builder() {
            } 

            private Builder(Flow model) {
                this.definition = model.definition;
                this.description = model.description;
                this.environmentConfiguration = model.environmentConfiguration;
                this.flowName = model.flowName;
            } 

            /**
             * <p>工作流的FnF State Machine定义（YAML格式）</p>
             * <p>This parameter is required.</p>
             */
            public Builder definition(String definition) {
                this.definition = definition;
                return this;
            }

            /**
             * <p>工作流的描述信息</p>
             * 
             * <strong>example:</strong>
             * <p>Converted from external workflow</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>工作流的环境变量配置</p>
             */
            public Builder environmentConfiguration(EnvironmentConfiguration environmentConfiguration) {
                this.environmentConfiguration = environmentConfiguration;
                return this;
            }

            /**
             * <p>转换后的工作流名称</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>dify-flow</p>
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            public Flow build() {
                return new Flow(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConvertFlowDSLData} extends {@link TeaModel}
     *
     * <p>ConvertFlowDSLData</p>
     */
    public static class PluginErrors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("nodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("providerName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String providerName;

        @com.aliyun.core.annotation.NameInMap("reason")
        @com.aliyun.core.annotation.Validation(required = true)
        private String reason;

        @com.aliyun.core.annotation.NameInMap("toolName")
        private String toolName;

        private PluginErrors(Builder builder) {
            this.nodeId = builder.nodeId;
            this.providerName = builder.providerName;
            this.reason = builder.reason;
            this.toolName = builder.toolName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PluginErrors create() {
            return builder().build();
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return providerName
         */
        public String getProviderName() {
            return this.providerName;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return toolName
         */
        public String getToolName() {
            return this.toolName;
        }

        public static final class Builder {
            private String nodeId; 
            private String providerName; 
            private String reason; 
            private String toolName; 

            private Builder() {
            } 

            private Builder(PluginErrors model) {
                this.nodeId = model.nodeId;
                this.providerName = model.providerName;
                this.reason = model.reason;
                this.toolName = model.toolName;
            } 

            /**
             * <p>相关节点的标识符</p>
             * 
             * <strong>example:</strong>
             * <p>1760514996015</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>插件提供商名称</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>langgenius</p>
             */
            public Builder providerName(String providerName) {
                this.providerName = providerName;
                return this;
            }

            /**
             * <p>错误原因描述</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>Plugin not found in marketplace</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>工具名称</p>
             * 
             * <strong>example:</strong>
             * <p>google_search</p>
             */
            public Builder toolName(String toolName) {
                this.toolName = toolName;
                return this;
            }

            public PluginErrors build() {
                return new PluginErrors(this);
            } 

        } 

    }
    /**
     * 
     * {@link ConvertFlowDSLData} extends {@link TeaModel}
     *
     * <p>ConvertFlowDSLData</p>
     */
    public static class ToolsetInstallations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("name")
        @com.aliyun.core.annotation.Validation(required = true)
        private String name;

        @com.aliyun.core.annotation.NameInMap("spec")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.Map<String, ?> spec;

        private ToolsetInstallations(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.spec = builder.spec;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ToolsetInstallations create() {
            return builder().build();
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
         * @return spec
         */
        public java.util.Map<String, ?> getSpec() {
            return this.spec;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private java.util.Map<String, ?> spec; 

            private Builder() {
            } 

            private Builder(ToolsetInstallations model) {
                this.description = model.description;
                this.name = model.name;
                this.spec = model.spec;
            } 

            /**
             * <p>Toolset描述</p>
             * 
             * <strong>example:</strong>
             * <p>Google Search Plugin</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Toolset名称</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>google</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Toolset规格配置（JSON对象）</p>
             * <p>This parameter is required.</p>
             */
            public Builder spec(java.util.Map<String, ?> spec) {
                this.spec = spec;
                return this;
            }

            public ToolsetInstallations build() {
                return new ToolsetInstallations(this);
            } 

        } 

    }
}
