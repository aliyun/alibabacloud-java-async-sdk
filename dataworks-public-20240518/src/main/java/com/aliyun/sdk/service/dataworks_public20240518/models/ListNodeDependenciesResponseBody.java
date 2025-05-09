// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
 *
 * <p>ListNodeDependenciesResponseBody</p>
 */
public class ListNodeDependenciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PagingInfo")
    private PagingInfo pagingInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListNodeDependenciesResponseBody(Builder builder) {
        this.pagingInfo = builder.pagingInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNodeDependenciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return pagingInfo
     */
    public PagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private PagingInfo pagingInfo; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListNodeDependenciesResponseBody model) {
            this.pagingInfo = model.pagingInfo;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The pagination information.</p>
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>204EAF68-CCE3-5112-8DA0-E7A60F02XXXX</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNodeDependenciesResponseBody build() {
            return new ListNodeDependenciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class DataSource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private DataSource(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DataSource create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(DataSource model) {
                this.name = model.name;
                this.type = model.type;
            } 

            /**
             * <p>The name of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>odps_first</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the data source.</p>
             * 
             * <strong>example:</strong>
             * <p>odps</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public DataSource build() {
                return new DataSource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class NodeOutputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        private NodeOutputs(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeOutputs create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        public static final class Builder {
            private String data; 

            private Builder() {
            } 

            private Builder(NodeOutputs model) {
                this.data = model.data;
            } 

            /**
             * <p>The node output.</p>
             * 
             * <strong>example:</strong>
             * <p>860438872620113XXXX</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            public NodeOutputs build() {
                return new NodeOutputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class Tables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        private Tables(Builder builder) {
            this.guid = builder.guid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tables create() {
            return builder().build();
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        public static final class Builder {
            private String guid; 

            private Builder() {
            } 

            private Builder(Tables model) {
                this.guid = model.guid;
            } 

            /**
             * <p>The table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.autotest.test_output_table_1</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            public Tables build() {
                return new Tables(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class Node extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        private Node(Builder builder) {
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Node create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        public static final class Builder {
            private String output; 

            private Builder() {
            } 

            private Builder(Node model) {
                this.output = model.output;
            } 

            /**
             * <p>The output of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>860438872620113XXXX</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public Node build() {
                return new Node(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactType")
        private String artifactType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Node")
        private Node node;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Variables(Builder builder) {
            this.artifactType = builder.artifactType;
            this.id = builder.id;
            this.name = builder.name;
            this.node = builder.node;
            this.scope = builder.scope;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Variables create() {
            return builder().build();
        }

        /**
         * @return artifactType
         */
        public String getArtifactType() {
            return this.artifactType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return node
         */
        public Node getNode() {
            return this.node;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String artifactType; 
            private Long id; 
            private String name; 
            private Node node; 
            private String scope; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Variables model) {
                this.artifactType = model.artifactType;
                this.id = model.id;
                this.name = model.name;
                this.node = model.node;
                this.scope = model.scope;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The artifact type.</p>
             * 
             * <strong>example:</strong>
             * <p>Variable</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * <p>The variable ID.</p>
             * 
             * <strong>example:</strong>
             * <p>543218872620113XXXX</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>input</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node to which the variable belongs.</p>
             */
            public Builder node(Node node) {
                this.node = node;
                return this;
            }

            /**
             * <p>The scope of the variable. Valid values:</p>
             * <ul>
             * <li>NodeParameter</li>
             * <li>NodeContext</li>
             * <li>Workflow</li>
             * <li>Workspace</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NodeParameter</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The type of the variable. Valid values:</p>
             * <ul>
             * <li>NoKvVariableExpression</li>
             * <li>Constant</li>
             * <li>PassThrough</li>
             * <li>System</li>
             * <li>NodeOutput</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Constant</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Variables build() {
                return new Variables(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class Inputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeOutputs")
        private java.util.List<NodeOutputs> nodeOutputs;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<Tables> tables;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List<Variables> variables;

        private Inputs(Builder builder) {
            this.nodeOutputs = builder.nodeOutputs;
            this.tables = builder.tables;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Inputs create() {
            return builder().build();
        }

        /**
         * @return nodeOutputs
         */
        public java.util.List<NodeOutputs> getNodeOutputs() {
            return this.nodeOutputs;
        }

        /**
         * @return tables
         */
        public java.util.List<Tables> getTables() {
            return this.tables;
        }

        /**
         * @return variables
         */
        public java.util.List<Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List<NodeOutputs> nodeOutputs; 
            private java.util.List<Tables> tables; 
            private java.util.List<Variables> variables; 

            private Builder() {
            } 

            private Builder(Inputs model) {
                this.nodeOutputs = model.nodeOutputs;
                this.tables = model.tables;
                this.variables = model.variables;
            } 

            /**
             * <p>The node outputs.</p>
             */
            public Builder nodeOutputs(java.util.List<NodeOutputs> nodeOutputs) {
                this.nodeOutputs = nodeOutputs;
                return this;
            }

            /**
             * <p>The tables.</p>
             */
            public Builder tables(java.util.List<Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>The variables.</p>
             */
            public Builder variables(java.util.List<Variables> variables) {
                this.variables = variables;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class OutputsNodeOutputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        private OutputsNodeOutputs(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputsNodeOutputs create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        public static final class Builder {
            private String data; 

            private Builder() {
            } 

            private Builder(OutputsNodeOutputs model) {
                this.data = model.data;
            } 

            /**
             * <p>The node output.</p>
             * 
             * <strong>example:</strong>
             * <p>463497880880954XXXX</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            public OutputsNodeOutputs build() {
                return new OutputsNodeOutputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class OutputsTables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Guid")
        private String guid;

        private OutputsTables(Builder builder) {
            this.guid = builder.guid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputsTables create() {
            return builder().build();
        }

        /**
         * @return guid
         */
        public String getGuid() {
            return this.guid;
        }

        public static final class Builder {
            private String guid; 

            private Builder() {
            } 

            private Builder(OutputsTables model) {
                this.guid = model.guid;
            } 

            /**
             * <p>The table ID.</p>
             * 
             * <strong>example:</strong>
             * <p>odps.autotest.test_output_table_1</p>
             */
            public Builder guid(String guid) {
                this.guid = guid;
                return this;
            }

            public OutputsTables build() {
                return new OutputsTables(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class VariablesNode extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        private VariablesNode(Builder builder) {
            this.output = builder.output;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VariablesNode create() {
            return builder().build();
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        public static final class Builder {
            private String output; 

            private Builder() {
            } 

            private Builder(VariablesNode model) {
                this.output = model.output;
            } 

            /**
             * <p>The output of the node to which the variable belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>463497880880954XXXX</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            public VariablesNode build() {
                return new VariablesNode(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class OutputsVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactType")
        private String artifactType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Node")
        private VariablesNode node;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private OutputsVariables(Builder builder) {
            this.artifactType = builder.artifactType;
            this.id = builder.id;
            this.name = builder.name;
            this.node = builder.node;
            this.scope = builder.scope;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputsVariables create() {
            return builder().build();
        }

        /**
         * @return artifactType
         */
        public String getArtifactType() {
            return this.artifactType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return node
         */
        public VariablesNode getNode() {
            return this.node;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String artifactType; 
            private Long id; 
            private String name; 
            private VariablesNode node; 
            private String scope; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(OutputsVariables model) {
                this.artifactType = model.artifactType;
                this.id = model.id;
                this.name = model.name;
                this.node = model.node;
                this.scope = model.scope;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The artifact type.</p>
             * 
             * <strong>example:</strong>
             * <p>Variable</p>
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * <p>The variable ID.</p>
             * 
             * <strong>example:</strong>
             * <p>543217824470354XXXX</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The name of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>output</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The node to which the variable belongs.</p>
             */
            public Builder node(VariablesNode node) {
                this.node = node;
                return this;
            }

            /**
             * <p>The scope of the variable. Valid values:</p>
             * <ul>
             * <li>NodeParameter</li>
             * <li>NodeContext</li>
             * <li>Workflow</li>
             * <li>Workspace</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NodeParameter</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The type of the variable. Valid values:</p>
             * <ul>
             * <li>NoKvVariableExpression</li>
             * <li>Constant</li>
             * <li>PassThrough</li>
             * <li>System</li>
             * <li>NodeOutput</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Constant</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The value of the variable.</p>
             * 
             * <strong>example:</strong>
             * <p>111</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public OutputsVariables build() {
                return new OutputsVariables(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeOutputs")
        private java.util.List<OutputsNodeOutputs> nodeOutputs;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<OutputsTables> tables;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List<OutputsVariables> variables;

        private Outputs(Builder builder) {
            this.nodeOutputs = builder.nodeOutputs;
            this.tables = builder.tables;
            this.variables = builder.variables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Outputs create() {
            return builder().build();
        }

        /**
         * @return nodeOutputs
         */
        public java.util.List<OutputsNodeOutputs> getNodeOutputs() {
            return this.nodeOutputs;
        }

        /**
         * @return tables
         */
        public java.util.List<OutputsTables> getTables() {
            return this.tables;
        }

        /**
         * @return variables
         */
        public java.util.List<OutputsVariables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List<OutputsNodeOutputs> nodeOutputs; 
            private java.util.List<OutputsTables> tables; 
            private java.util.List<OutputsVariables> variables; 

            private Builder() {
            } 

            private Builder(Outputs model) {
                this.nodeOutputs = model.nodeOutputs;
                this.tables = model.tables;
                this.variables = model.variables;
            } 

            /**
             * <p>The node outputs.</p>
             */
            public Builder nodeOutputs(java.util.List<OutputsNodeOutputs> nodeOutputs) {
                this.nodeOutputs = nodeOutputs;
                return this;
            }

            /**
             * <p>The tables.</p>
             */
            public Builder tables(java.util.List<OutputsTables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>The variables.</p>
             */
            public Builder variables(java.util.List<OutputsVariables> variables) {
                this.variables = variables;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class RuntimeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private RuntimeResource(Builder builder) {
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeResource create() {
            return builder().build();
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(RuntimeResource model) {
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The resource group ID.</p>
             * 
             * <strong>example:</strong>
             * <p>S_res_group_XXXX_XXXX</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public RuntimeResource build() {
                return new RuntimeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class Runtime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Command")
        private String command;

        private Runtime(Builder builder) {
            this.command = builder.command;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Runtime create() {
            return builder().build();
        }

        /**
         * @return command
         */
        public String getCommand() {
            return this.command;
        }

        public static final class Builder {
            private String command; 

            private Builder() {
            } 

            private Builder(Runtime model) {
                this.command = model.command;
            } 

            /**
             * <p>The command used to distinguish node types.</p>
             * 
             * <strong>example:</strong>
             * <p>ODPS_SQL</p>
             */
            public Builder command(String command) {
                this.command = command;
                return this;
            }

            public Runtime build() {
                return new Runtime(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class Script extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Path")
        private String path;

        @com.aliyun.core.annotation.NameInMap("Runtime")
        private Runtime runtime;

        private Script(Builder builder) {
            this.id = builder.id;
            this.path = builder.path;
            this.runtime = builder.runtime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Script create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return path
         */
        public String getPath() {
            return this.path;
        }

        /**
         * @return runtime
         */
        public Runtime getRuntime() {
            return this.runtime;
        }

        public static final class Builder {
            private Long id; 
            private String path; 
            private Runtime runtime; 

            private Builder() {
            } 

            private Builder(Script model) {
                this.id = model.id;
                this.path = model.path;
                this.runtime = model.runtime;
            } 

            /**
             * <p>The script ID.</p>
             * 
             * <strong>example:</strong>
             * <p>853573334108680XXXX</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The script path.</p>
             * 
             * <strong>example:</strong>
             * <p>root/demo</p>
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * <p>The runtime.</p>
             */
            public Builder runtime(Runtime runtime) {
                this.runtime = runtime;
                return this;
            }

            public Script build() {
                return new Script(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class Strategy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceMode")
        private String instanceMode;

        @com.aliyun.core.annotation.NameInMap("RerunInterval")
        private Integer rerunInterval;

        @com.aliyun.core.annotation.NameInMap("RerunMode")
        private String rerunMode;

        @com.aliyun.core.annotation.NameInMap("RerunTimes")
        private Integer rerunTimes;

        @com.aliyun.core.annotation.NameInMap("Timeout")
        private Integer timeout;

        private Strategy(Builder builder) {
            this.instanceMode = builder.instanceMode;
            this.rerunInterval = builder.rerunInterval;
            this.rerunMode = builder.rerunMode;
            this.rerunTimes = builder.rerunTimes;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Strategy create() {
            return builder().build();
        }

        /**
         * @return instanceMode
         */
        public String getInstanceMode() {
            return this.instanceMode;
        }

        /**
         * @return rerunInterval
         */
        public Integer getRerunInterval() {
            return this.rerunInterval;
        }

        /**
         * @return rerunMode
         */
        public String getRerunMode() {
            return this.rerunMode;
        }

        /**
         * @return rerunTimes
         */
        public Integer getRerunTimes() {
            return this.rerunTimes;
        }

        /**
         * @return timeout
         */
        public Integer getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private String instanceMode; 
            private Integer rerunInterval; 
            private String rerunMode; 
            private Integer rerunTimes; 
            private Integer timeout; 

            private Builder() {
            } 

            private Builder(Strategy model) {
                this.instanceMode = model.instanceMode;
                this.rerunInterval = model.rerunInterval;
                this.rerunMode = model.rerunMode;
                this.rerunTimes = model.rerunTimes;
                this.timeout = model.timeout;
            } 

            /**
             * <p>The instance generation mode. Valid values:</p>
             * <ul>
             * <li>T+1</li>
             * <li>Immediately</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>T+1</p>
             */
            public Builder instanceMode(String instanceMode) {
                this.instanceMode = instanceMode;
                return this;
            }

            /**
             * <p>The rerun interval after a failure. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>180000</p>
             */
            public Builder rerunInterval(Integer rerunInterval) {
                this.rerunInterval = rerunInterval;
                return this;
            }

            /**
             * <p>The rerun mode. Valid values:</p>
             * <ul>
             * <li>Allowed</li>
             * <li>Denied</li>
             * <li>FailureAllowed</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Allowed</p>
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * <p>The number of reruns after a failure.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder rerunTimes(Integer rerunTimes) {
                this.rerunTimes = rerunTimes;
                return this;
            }

            /**
             * <p>The timeout period. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder timeout(Integer timeout) {
                this.timeout = timeout;
                return this;
            }

            public Strategy build() {
                return new Strategy(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
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
             * <p>null</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
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
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class Trigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        @com.aliyun.core.annotation.NameInMap("Timezone")
        private String timezone;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Trigger(Builder builder) {
            this.cron = builder.cron;
            this.endTime = builder.endTime;
            this.id = builder.id;
            this.startTime = builder.startTime;
            this.timezone = builder.timezone;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trigger create() {
            return builder().build();
        }

        /**
         * @return cron
         */
        public String getCron() {
            return this.cron;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return timezone
         */
        public String getTimezone() {
            return this.timezone;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String cron; 
            private String endTime; 
            private Long id; 
            private String startTime; 
            private String timezone; 
            private String type; 

            private Builder() {
            } 

            private Builder(Trigger model) {
                this.cron = model.cron;
                this.endTime = model.endTime;
                this.id = model.id;
                this.startTime = model.startTime;
                this.timezone = model.timezone;
                this.type = model.type;
            } 

            /**
             * <p>The CRON expression for scheduling.</p>
             * 
             * <strong>example:</strong>
             * <p>00 00 00 * * ?</p>
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * <p>The end time of the validity period of the scheduling. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>9999-01-01 00:00:00</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The trigger ID.</p>
             * 
             * <strong>example:</strong>
             * <p>543680677872062XXXX</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The start time of the validity period of the scheduling. The time is in the yyyy-MM-dd HH:mm:ss format.</p>
             * 
             * <strong>example:</strong>
             * <p>1970-01-01 00:00:00</p>
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The time zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Asia/Shanghai</p>
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * <p>The type of the trigger.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Scheduler</li>
             * <li>Manual</li>
             * <li>Streaming</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Scheduler</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Trigger build() {
                return new Trigger(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Inputs")
        private Inputs inputs;

        @com.aliyun.core.annotation.NameInMap("ModifyTime")
        private Long modifyTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Outputs")
        private Outputs outputs;

        @com.aliyun.core.annotation.NameInMap("Owner")
        private String owner;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("Recurrence")
        private String recurrence;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private RuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("Script")
        private Script script;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Strategy strategy;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private Long taskId;

        @com.aliyun.core.annotation.NameInMap("Trigger")
        private Trigger trigger;

        private Nodes(Builder builder) {
            this.createTime = builder.createTime;
            this.dataSource = builder.dataSource;
            this.description = builder.description;
            this.id = builder.id;
            this.inputs = builder.inputs;
            this.modifyTime = builder.modifyTime;
            this.name = builder.name;
            this.outputs = builder.outputs;
            this.owner = builder.owner;
            this.projectId = builder.projectId;
            this.recurrence = builder.recurrence;
            this.runtimeResource = builder.runtimeResource;
            this.script = builder.script;
            this.strategy = builder.strategy;
            this.tags = builder.tags;
            this.taskId = builder.taskId;
            this.trigger = builder.trigger;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Nodes create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataSource
         */
        public DataSource getDataSource() {
            return this.dataSource;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return inputs
         */
        public Inputs getInputs() {
            return this.inputs;
        }

        /**
         * @return modifyTime
         */
        public Long getModifyTime() {
            return this.modifyTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputs
         */
        public Outputs getOutputs() {
            return this.outputs;
        }

        /**
         * @return owner
         */
        public String getOwner() {
            return this.owner;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return recurrence
         */
        public String getRecurrence() {
            return this.recurrence;
        }

        /**
         * @return runtimeResource
         */
        public RuntimeResource getRuntimeResource() {
            return this.runtimeResource;
        }

        /**
         * @return script
         */
        public Script getScript() {
            return this.script;
        }

        /**
         * @return strategy
         */
        public Strategy getStrategy() {
            return this.strategy;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
        }

        /**
         * @return taskId
         */
        public Long getTaskId() {
            return this.taskId;
        }

        /**
         * @return trigger
         */
        public Trigger getTrigger() {
            return this.trigger;
        }

        public static final class Builder {
            private Long createTime; 
            private DataSource dataSource; 
            private String description; 
            private Long id; 
            private Inputs inputs; 
            private Long modifyTime; 
            private String name; 
            private Outputs outputs; 
            private String owner; 
            private Long projectId; 
            private String recurrence; 
            private RuntimeResource runtimeResource; 
            private Script script; 
            private Strategy strategy; 
            private java.util.List<Tags> tags; 
            private Long taskId; 
            private Trigger trigger; 

            private Builder() {
            } 

            private Builder(Nodes model) {
                this.createTime = model.createTime;
                this.dataSource = model.dataSource;
                this.description = model.description;
                this.id = model.id;
                this.inputs = model.inputs;
                this.modifyTime = model.modifyTime;
                this.name = model.name;
                this.outputs = model.outputs;
                this.owner = model.owner;
                this.projectId = model.projectId;
                this.recurrence = model.recurrence;
                this.runtimeResource = model.runtimeResource;
                this.script = model.script;
                this.strategy = model.strategy;
                this.tags = model.tags;
                this.taskId = model.taskId;
                this.trigger = model.trigger;
            } 

            /**
             * <p>The time when the node was created. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1724505917000</p>
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The information about the data source.</p>
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * <p>The description of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Node description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The ID of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>723932906364267XXXX</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The input of the node.</p>
             */
            public Builder inputs(Inputs inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * <p>The time when the node was last modified. This value is a UNIX timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1724505917000</p>
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * <p>The name of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>Node name</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output of the node.</p>
             */
            public Builder outputs(Outputs outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>The owner of the node.</p>
             * 
             * <strong>example:</strong>
             * <p>110755000425XXXX</p>
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * <p>The ID of the workspace to which the node belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>65133</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>The scheduling type.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>Normal: Nodes are scheduled as expected.</li>
             * <li>Pause: Nodes are paused, and the running of their descendant nodes is blocked.</li>
             * <li>Skip: Nodes are dry run. The system does not actually run the nodes but directly prompts that the nodes are successfully run. The running duration of the nodes is 0 seconds. In addition, the nodes do not occupy resources or block the running of their descendant nodes.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder recurrence(String recurrence) {
                this.recurrence = recurrence;
                return this;
            }

            /**
             * <p>The information about the resource group.</p>
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * <p>The script information.</p>
             */
            public Builder script(Script script) {
                this.script = script;
                return this;
            }

            /**
             * <p>The scheduling policy.</p>
             */
            public Builder strategy(Strategy strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * <p>The tags. This parameter is not in use.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The scheduling task ID.</p>
             * 
             * <strong>example:</strong>
             * <p>580667964888595XXXX</p>
             */
            public Builder taskId(Long taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The trigger.</p>
             */
            public Builder trigger(Trigger trigger) {
                this.trigger = trigger;
                return this;
            }

            public Nodes build() {
                return new Nodes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListNodeDependenciesResponseBody} extends {@link TeaModel}
     *
     * <p>ListNodeDependenciesResponseBody</p>
     */
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List<Nodes> nodes;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private String pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private String pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private String totalCount;

        private PagingInfo(Builder builder) {
            this.nodes = builder.nodes;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PagingInfo create() {
            return builder().build();
        }

        /**
         * @return nodes
         */
        public java.util.List<Nodes> getNodes() {
            return this.nodes;
        }

        /**
         * @return pageNumber
         */
        public String getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public String getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public String getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<Nodes> nodes; 
            private String pageNumber; 
            private String pageSize; 
            private String totalCount; 

            private Builder() {
            } 

            private Builder(PagingInfo model) {
                this.nodes = model.nodes;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>The descendant nodes.</p>
             */
            public Builder nodes(java.util.List<Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * <p>The page number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>The number of entries per page.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of entries returned.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder totalCount(String totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public PagingInfo build() {
                return new PagingInfo(this);
            } 

        } 

    }
}
