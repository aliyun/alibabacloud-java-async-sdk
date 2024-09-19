// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * PagingInfo.
         */
        public Builder pagingInfo(PagingInfo pagingInfo) {
            this.pagingInfo = pagingInfo;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListNodeDependenciesResponseBody build() {
            return new ListNodeDependenciesResponseBody(this);
        } 

    } 

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

            /**
             * 数据源名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 数据源类型
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

            /**
             * 节点输出
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

            /**
             * 表id
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

            /**
             * 节点输出
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
    public static class Variables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactType")
        private String artifactType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

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
        public String getId() {
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
            private String id; 
            private String name; 
            private Node node; 
            private String scope; 
            private String type; 
            private String value; 

            /**
             * 制品类型
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * 变量id
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 变量名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 变量所属节点
             */
            public Builder node(Node node) {
                this.node = node;
                return this;
            }

            /**
             * 范围
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * 类型
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 变量值
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
    public static class Inputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeOutputs")
        private java.util.List < NodeOutputs> nodeOutputs;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List < Tables> tables;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List < Variables> variables;

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
        public java.util.List < NodeOutputs> getNodeOutputs() {
            return this.nodeOutputs;
        }

        /**
         * @return tables
         */
        public java.util.List < Tables> getTables() {
            return this.tables;
        }

        /**
         * @return variables
         */
        public java.util.List < Variables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List < NodeOutputs> nodeOutputs; 
            private java.util.List < Tables> tables; 
            private java.util.List < Variables> variables; 

            /**
             * 节点输出列表
             */
            public Builder nodeOutputs(java.util.List < NodeOutputs> nodeOutputs) {
                this.nodeOutputs = nodeOutputs;
                return this;
            }

            /**
             * 表列表
             */
            public Builder tables(java.util.List < Tables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * 变量列表
             */
            public Builder variables(java.util.List < Variables> variables) {
                this.variables = variables;
                return this;
            }

            public Inputs build() {
                return new Inputs(this);
            } 

        } 

    }
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

            /**
             * 节点输出
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

            /**
             * 表id
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

            /**
             * 节点输出
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
    public static class OutputsVariables extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArtifactType")
        private String artifactType;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

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
        public String getId() {
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
            private String id; 
            private String name; 
            private VariablesNode node; 
            private String scope; 
            private String type; 
            private String value; 

            /**
             * 制品类型
             */
            public Builder artifactType(String artifactType) {
                this.artifactType = artifactType;
                return this;
            }

            /**
             * 变量id
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 变量名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 变量所属节点
             */
            public Builder node(VariablesNode node) {
                this.node = node;
                return this;
            }

            /**
             * 范围
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * 类型
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 变量值
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
    public static class Outputs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeOutputs")
        private java.util.List < OutputsNodeOutputs> nodeOutputs;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List < OutputsTables> tables;

        @com.aliyun.core.annotation.NameInMap("Variables")
        private java.util.List < OutputsVariables> variables;

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
        public java.util.List < OutputsNodeOutputs> getNodeOutputs() {
            return this.nodeOutputs;
        }

        /**
         * @return tables
         */
        public java.util.List < OutputsTables> getTables() {
            return this.tables;
        }

        /**
         * @return variables
         */
        public java.util.List < OutputsVariables> getVariables() {
            return this.variables;
        }

        public static final class Builder {
            private java.util.List < OutputsNodeOutputs> nodeOutputs; 
            private java.util.List < OutputsTables> tables; 
            private java.util.List < OutputsVariables> variables; 

            /**
             * 节点输出列表
             */
            public Builder nodeOutputs(java.util.List < OutputsNodeOutputs> nodeOutputs) {
                this.nodeOutputs = nodeOutputs;
                return this;
            }

            /**
             * 表列表
             */
            public Builder tables(java.util.List < OutputsTables> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * 变量列表
             */
            public Builder variables(java.util.List < OutputsVariables> variables) {
                this.variables = variables;
                return this;
            }

            public Outputs build() {
                return new Outputs(this);
            } 

        } 

    }
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

            /**
             * 资源组id
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

            /**
             * 脚本所属类型
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
    public static class Script extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

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
        public String getId() {
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
            private String id; 
            private String path; 
            private Runtime runtime; 

            /**
             * 脚本的id
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 脚本路径
             */
            public Builder path(String path) {
                this.path = path;
                return this;
            }

            /**
             * 脚本的运行时信息
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

            /**
             * 生成实例的模式
             */
            public Builder instanceMode(String instanceMode) {
                this.instanceMode = instanceMode;
                return this;
            }

            /**
             * 重试时间间隔
             */
            public Builder rerunInterval(Integer rerunInterval) {
                this.rerunInterval = rerunInterval;
                return this;
            }

            /**
             * 允许重跑的模式
             */
            public Builder rerunMode(String rerunMode) {
                this.rerunMode = rerunMode;
                return this;
            }

            /**
             * 重试次数
             */
            public Builder rerunTimes(Integer rerunTimes) {
                this.rerunTimes = rerunTimes;
                return this;
            }

            /**
             * 超时时间
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

            /**
             * 标签键
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 标签值
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
    public static class Trigger extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cron")
        private String cron;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

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
        public String getId() {
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
            private String id; 
            private String startTime; 
            private String timezone; 
            private String type; 

            /**
             * 触发器的cron表达式
             */
            public Builder cron(String cron) {
                this.cron = cron;
                return this;
            }

            /**
             * 结束时间，格式为yyyy-MM-dd HH:mm:ss
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * 触发器id
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 开始时间，格式为yyyy-MM-dd HH:mm:ss
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * 时区
             */
            public Builder timezone(String timezone) {
                this.timezone = timezone;
                return this;
            }

            /**
             * 触发器类型
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
    public static class Nodes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataSource")
        private DataSource dataSource;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

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
        private String projectId;

        @com.aliyun.core.annotation.NameInMap("Recurrence")
        private String recurrence;

        @com.aliyun.core.annotation.NameInMap("RuntimeResource")
        private RuntimeResource runtimeResource;

        @com.aliyun.core.annotation.NameInMap("Script")
        private Script script;

        @com.aliyun.core.annotation.NameInMap("Strategy")
        private Strategy strategy;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List < Tags> tags;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

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
        public String getId() {
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
        public String getProjectId() {
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
        public java.util.List < Tags> getTags() {
            return this.tags;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
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
            private String id; 
            private Inputs inputs; 
            private Long modifyTime; 
            private String name; 
            private Outputs outputs; 
            private String owner; 
            private String projectId; 
            private String recurrence; 
            private RuntimeResource runtimeResource; 
            private Script script; 
            private Strategy strategy; 
            private java.util.List < Tags> tags; 
            private String taskId; 
            private Trigger trigger; 

            /**
             * 节点的创建时间
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * 数据源信息
             */
            public Builder dataSource(DataSource dataSource) {
                this.dataSource = dataSource;
                return this;
            }

            /**
             * 描述
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * 触发器id
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * 节点输入
             */
            public Builder inputs(Inputs inputs) {
                this.inputs = inputs;
                return this;
            }

            /**
             * 属性修改时间
             */
            public Builder modifyTime(Long modifyTime) {
                this.modifyTime = modifyTime;
                return this;
            }

            /**
             * 节点名
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 节点输出
             */
            public Builder outputs(Outputs outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * 节点的责任人
             */
            public Builder owner(String owner) {
                this.owner = owner;
                return this;
            }

            /**
             * ProjectId.
             */
            public Builder projectId(String projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * Recurrence.
             */
            public Builder recurrence(String recurrence) {
                this.recurrence = recurrence;
                return this;
            }

            /**
             * 资源组信息
             */
            public Builder runtimeResource(RuntimeResource runtimeResource) {
                this.runtimeResource = runtimeResource;
                return this;
            }

            /**
             * 工作流的脚本信息
             */
            public Builder script(Script script) {
                this.script = script;
                return this;
            }

            /**
             * 调度策略
             */
            public Builder strategy(Strategy strategy) {
                this.strategy = strategy;
                return this;
            }

            /**
             * 标签信息
             */
            public Builder tags(java.util.List < Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * 调度任务Id
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * 触发器信息
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
    public static class PagingInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Nodes")
        private java.util.List < Nodes> nodes;

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
        public java.util.List < Nodes> getNodes() {
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
            private java.util.List < Nodes> nodes; 
            private String pageNumber; 
            private String pageSize; 
            private String totalCount; 

            /**
             * Nodes.
             */
            public Builder nodes(java.util.List < Nodes> nodes) {
                this.nodes = nodes;
                return this;
            }

            /**
             * PageNumber.
             */
            public Builder pageNumber(String pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(String pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
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
