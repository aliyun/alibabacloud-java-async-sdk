// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataphin_public20230630.models;

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
 * {@link CreateNodeSupplementRequest} extends {@link RequestModel}
 *
 * <p>CreateNodeSupplementRequest</p>
 */
public class CreateNodeSupplementRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CreateCommand")
    @com.aliyun.core.annotation.Validation(required = true)
    private CreateCommand createCommand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Env")
    private String env;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpTenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long opTenantId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OpUserId")
    private String opUserId;

    private CreateNodeSupplementRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.createCommand = builder.createCommand;
        this.env = builder.env;
        this.opTenantId = builder.opTenantId;
        this.opUserId = builder.opUserId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateNodeSupplementRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return createCommand
     */
    public CreateCommand getCreateCommand() {
        return this.createCommand;
    }

    /**
     * @return env
     */
    public String getEnv() {
        return this.env;
    }

    /**
     * @return opTenantId
     */
    public Long getOpTenantId() {
        return this.opTenantId;
    }

    /**
     * @return opUserId
     */
    public String getOpUserId() {
        return this.opUserId;
    }

    public static final class Builder extends Request.Builder<CreateNodeSupplementRequest, Builder> {
        private String regionId; 
        private CreateCommand createCommand; 
        private String env; 
        private Long opTenantId; 
        private String opUserId; 

        private Builder() {
            super();
        } 

        private Builder(CreateNodeSupplementRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.createCommand = request.createCommand;
            this.env = request.env;
            this.opTenantId = request.opTenantId;
            this.opUserId = request.opUserId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The data backfill request.</p>
         * <p>This parameter is required.</p>
         */
        public Builder createCommand(CreateCommand createCommand) {
            String createCommandShrink = shrink(createCommand, "CreateCommand", "json");
            this.putBodyParameter("CreateCommand", createCommandShrink);
            this.createCommand = createCommand;
            return this;
        }

        /**
         * <p>The environment identifier. Valid values:</p>
         * <ul>
         * <li>DEV: Development environment. </li>
         * <li>PROD (default): Production environment.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        public Builder env(String env) {
            this.putQueryParameter("Env", env);
            this.env = env;
            return this;
        }

        /**
         * <p>The tenant ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opTenantId(Long opTenantId) {
            this.putQueryParameter("OpTenantId", opTenantId);
            this.opTenantId = opTenantId;
            return this;
        }

        /**
         * <p>The ID of the operator user.</p>
         * 
         * <strong>example:</strong>
         * <p>30001011</p>
         */
        public Builder opUserId(String opUserId) {
            this.putQueryParameter("OpUserId", opUserId);
            this.opUserId = opUserId;
            return this;
        }

        @Override
        public CreateNodeSupplementRequest build() {
            return new CreateNodeSupplementRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateNodeSupplementRequest} extends {@link TeaModel}
     *
     * <p>CreateNodeSupplementRequest</p>
     */
    public static class DownStreamNodeIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldIdList")
        private java.util.List<String> fieldIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        private DownStreamNodeIdList(Builder builder) {
            this.fieldIdList = builder.fieldIdList;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DownStreamNodeIdList create() {
            return builder().build();
        }

        /**
         * @return fieldIdList
         */
        public java.util.List<String> getFieldIdList() {
            return this.fieldIdList;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.List<String> fieldIdList; 
            private String id; 

            private Builder() {
            } 

            private Builder(DownStreamNodeIdList model) {
                this.fieldIdList = model.fieldIdList;
                this.id = model.id;
            } 

            /**
             * <p>The field ID.</p>
             */
            public Builder fieldIdList(java.util.List<String> fieldIdList) {
                this.fieldIdList = fieldIdList;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>2323232</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public DownStreamNodeIdList build() {
                return new DownStreamNodeIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNodeSupplementRequest} extends {@link TeaModel}
     *
     * <p>CreateNodeSupplementRequest</p>
     */
    public static class FilterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Exclude")
        private Boolean exclude;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("ValueList")
        private java.util.List<String> valueList;

        private FilterList(Builder builder) {
            this.exclude = builder.exclude;
            this.key = builder.key;
            this.valueList = builder.valueList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FilterList create() {
            return builder().build();
        }

        /**
         * @return exclude
         */
        public Boolean getExclude() {
            return this.exclude;
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return valueList
         */
        public java.util.List<String> getValueList() {
            return this.valueList;
        }

        public static final class Builder {
            private Boolean exclude; 
            private String key; 
            private java.util.List<String> valueList; 

            private Builder() {
            } 

            private Builder(FilterList model) {
                this.exclude = model.exclude;
                this.key = model.key;
                this.valueList = model.valueList;
            } 

            /**
             * <p>Specifies whether to exclude the matched items. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder exclude(Boolean exclude) {
                this.exclude = exclude;
                return this;
            }

            /**
             * <p>The filter key. Valid values:</p>
             * <ul>
             * <li>PROJECT: project</li>
             * <li>NODE_OUTPUT_NAME: node output name</li>
             * <li>NODE_NAME: node name</li>
             * <li>NODE_ID: node ID</li>
             * <li>TARGETS: specified endpoints</li>
             * <li>SOURCES: specified start points</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NODE_OUTPUT_NAME</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The list of filter values.</p>
             */
            public Builder valueList(java.util.List<String> valueList) {
                this.valueList = valueList;
                return this;
            }

            public FilterList build() {
                return new FilterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNodeSupplementRequest} extends {@link TeaModel}
     *
     * <p>CreateNodeSupplementRequest</p>
     */
    public static class GlobalParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private GlobalParamList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GlobalParamList create() {
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

            private Builder(GlobalParamList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>param1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public GlobalParamList build() {
                return new GlobalParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNodeSupplementRequest} extends {@link TeaModel}
     *
     * <p>CreateNodeSupplementRequest</p>
     */
    public static class NodeIdList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FieldIdList")
        private java.util.List<String> fieldIdList;

        @com.aliyun.core.annotation.NameInMap("Id")
        @com.aliyun.core.annotation.Validation(required = true)
        private String id;

        private NodeIdList(Builder builder) {
            this.fieldIdList = builder.fieldIdList;
            this.id = builder.id;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeIdList create() {
            return builder().build();
        }

        /**
         * @return fieldIdList
         */
        public java.util.List<String> getFieldIdList() {
            return this.fieldIdList;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        public static final class Builder {
            private java.util.List<String> fieldIdList; 
            private String id; 

            private Builder() {
            } 

            private Builder(NodeIdList model) {
                this.fieldIdList = model.fieldIdList;
                this.id = model.id;
            } 

            /**
             * <p>The list of field IDs. This parameter is applicable when the node ID is a logical table node ID. If this parameter is not specified, all fields in the table are used by default.</p>
             */
            public Builder fieldIdList(java.util.List<String> fieldIdList) {
                this.fieldIdList = fieldIdList;
                return this;
            }

            /**
             * <p>The node ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>n_1232324</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            public NodeIdList build() {
                return new NodeIdList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNodeSupplementRequest} extends {@link TeaModel}
     *
     * <p>CreateNodeSupplementRequest</p>
     */
    public static class ParamList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private ParamList(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ParamList create() {
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

            private Builder(ParamList model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>param1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The parameter value.</p>
             * 
             * <strong>example:</strong>
             * <p>value1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public ParamList build() {
                return new ParamList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNodeSupplementRequest} extends {@link TeaModel}
     *
     * <p>CreateNodeSupplementRequest</p>
     */
    public static class NodeParamsList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("ParamList")
        private java.util.List<ParamList> paramList;

        private NodeParamsList(Builder builder) {
            this.nodeId = builder.nodeId;
            this.paramList = builder.paramList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NodeParamsList create() {
            return builder().build();
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return paramList
         */
        public java.util.List<ParamList> getParamList() {
            return this.paramList;
        }

        public static final class Builder {
            private String nodeId; 
            private java.util.List<ParamList> paramList; 

            private Builder() {
            } 

            private Builder(NodeParamsList model) {
                this.nodeId = model.nodeId;
                this.paramList = model.paramList;
            } 

            /**
             * <p>The node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>n_23324</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>The parameter list.</p>
             */
            public Builder paramList(java.util.List<ParamList> paramList) {
                this.paramList = paramList;
                return this;
            }

            public NodeParamsList build() {
                return new NodeParamsList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateNodeSupplementRequest} extends {@link TeaModel}
     *
     * <p>CreateNodeSupplementRequest</p>
     */
    public static class CreateCommand extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContainAllDownStream")
        private Boolean containAllDownStream;

        @com.aliyun.core.annotation.NameInMap("DownStreamNodeIdList")
        private java.util.List<DownStreamNodeIdList> downStreamNodeIdList;

        @com.aliyun.core.annotation.NameInMap("EndBizDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endBizDate;

        @com.aliyun.core.annotation.NameInMap("FilterList")
        private java.util.List<FilterList> filterList;

        @com.aliyun.core.annotation.NameInMap("GlobalParamList")
        private java.util.List<GlobalParamList> globalParamList;

        @com.aliyun.core.annotation.NameInMap("MaxDueTime")
        private String maxDueTime;

        @com.aliyun.core.annotation.NameInMap("MinDueTime")
        private String minDueTime;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NodeIdList")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<NodeIdList> nodeIdList;

        @com.aliyun.core.annotation.NameInMap("NodeParamsList")
        private java.util.List<NodeParamsList> nodeParamsList;

        @com.aliyun.core.annotation.NameInMap("Parallelism")
        private Integer parallelism;

        @com.aliyun.core.annotation.NameInMap("ProjectId")
        @com.aliyun.core.annotation.Validation(required = true)
        private Long projectId;

        @com.aliyun.core.annotation.NameInMap("RunImmediately")
        private Boolean runImmediately;

        @com.aliyun.core.annotation.NameInMap("StartBizDate")
        @com.aliyun.core.annotation.Validation(required = true)
        private String startBizDate;

        private CreateCommand(Builder builder) {
            this.containAllDownStream = builder.containAllDownStream;
            this.downStreamNodeIdList = builder.downStreamNodeIdList;
            this.endBizDate = builder.endBizDate;
            this.filterList = builder.filterList;
            this.globalParamList = builder.globalParamList;
            this.maxDueTime = builder.maxDueTime;
            this.minDueTime = builder.minDueTime;
            this.name = builder.name;
            this.nodeIdList = builder.nodeIdList;
            this.nodeParamsList = builder.nodeParamsList;
            this.parallelism = builder.parallelism;
            this.projectId = builder.projectId;
            this.runImmediately = builder.runImmediately;
            this.startBizDate = builder.startBizDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CreateCommand create() {
            return builder().build();
        }

        /**
         * @return containAllDownStream
         */
        public Boolean getContainAllDownStream() {
            return this.containAllDownStream;
        }

        /**
         * @return downStreamNodeIdList
         */
        public java.util.List<DownStreamNodeIdList> getDownStreamNodeIdList() {
            return this.downStreamNodeIdList;
        }

        /**
         * @return endBizDate
         */
        public String getEndBizDate() {
            return this.endBizDate;
        }

        /**
         * @return filterList
         */
        public java.util.List<FilterList> getFilterList() {
            return this.filterList;
        }

        /**
         * @return globalParamList
         */
        public java.util.List<GlobalParamList> getGlobalParamList() {
            return this.globalParamList;
        }

        /**
         * @return maxDueTime
         */
        public String getMaxDueTime() {
            return this.maxDueTime;
        }

        /**
         * @return minDueTime
         */
        public String getMinDueTime() {
            return this.minDueTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return nodeIdList
         */
        public java.util.List<NodeIdList> getNodeIdList() {
            return this.nodeIdList;
        }

        /**
         * @return nodeParamsList
         */
        public java.util.List<NodeParamsList> getNodeParamsList() {
            return this.nodeParamsList;
        }

        /**
         * @return parallelism
         */
        public Integer getParallelism() {
            return this.parallelism;
        }

        /**
         * @return projectId
         */
        public Long getProjectId() {
            return this.projectId;
        }

        /**
         * @return runImmediately
         */
        public Boolean getRunImmediately() {
            return this.runImmediately;
        }

        /**
         * @return startBizDate
         */
        public String getStartBizDate() {
            return this.startBizDate;
        }

        public static final class Builder {
            private Boolean containAllDownStream; 
            private java.util.List<DownStreamNodeIdList> downStreamNodeIdList; 
            private String endBizDate; 
            private java.util.List<FilterList> filterList; 
            private java.util.List<GlobalParamList> globalParamList; 
            private String maxDueTime; 
            private String minDueTime; 
            private String name; 
            private java.util.List<NodeIdList> nodeIdList; 
            private java.util.List<NodeParamsList> nodeParamsList; 
            private Integer parallelism; 
            private Long projectId; 
            private Boolean runImmediately; 
            private String startBizDate; 

            private Builder() {
            } 

            private Builder(CreateCommand model) {
                this.containAllDownStream = model.containAllDownStream;
                this.downStreamNodeIdList = model.downStreamNodeIdList;
                this.endBizDate = model.endBizDate;
                this.filterList = model.filterList;
                this.globalParamList = model.globalParamList;
                this.maxDueTime = model.maxDueTime;
                this.minDueTime = model.minDueTime;
                this.name = model.name;
                this.nodeIdList = model.nodeIdList;
                this.nodeParamsList = model.nodeParamsList;
                this.parallelism = model.parallelism;
                this.projectId = model.projectId;
                this.runImmediately = model.runImmediately;
                this.startBizDate = model.startBizDate;
            } 

            /**
             * <p>Specifies whether to include all downstream nodes in batch mode. Default value: false.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder containAllDownStream(Boolean containAllDownStream) {
                this.containAllDownStream = containAllDownStream;
                return this;
            }

            /**
             * <p>The IDs of downstream nodes to run. This parameter takes effect only when ContainAllDownStream is set to false.</p>
             */
            public Builder downStreamNodeIdList(java.util.List<DownStreamNodeIdList> downStreamNodeIdList) {
                this.downStreamNodeIdList = downStreamNodeIdList;
                return this;
            }

            /**
             * <p>The end business date.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-21</p>
             */
            public Builder endBizDate(String endBizDate) {
                this.endBizDate = endBizDate;
                return this;
            }

            /**
             * <p>The list of filters. This parameter is used together with ContainAllDownStream to include or exclude nodes based on criteria such as project or node. Default value: empty.</p>
             */
            public Builder filterList(java.util.List<FilterList> filterList) {
                this.filterList = filterList;
                return this;
            }

            /**
             * <p>The runtime global parameters.</p>
             */
            public Builder globalParamList(java.util.List<GlobalParamList> globalParamList) {
                this.globalParamList = globalParamList;
                return this;
            }

            /**
             * <p>The latest trigger time in the HH:MM format. This parameter is applicable only to hourly nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>20:59</p>
             */
            public Builder maxDueTime(String maxDueTime) {
                this.maxDueTime = maxDueTime;
                return this;
            }

            /**
             * <p>The earliest trigger time in the HH:MM format. This parameter is applicable only to hourly nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>00:00</p>
             */
            public Builder minDueTime(String minDueTime) {
                this.minDueTime = minDueTime;
                return this;
            }

            /**
             * <p>The name of the data backfill. If this parameter is not specified, the system automatically generates a name.</p>
             * 
             * <strong>example:</strong>
             * <p>TestBackfill</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The root nodes for data backfill. Multiple root nodes are supported.</p>
             * <p>This parameter is required.</p>
             */
            public Builder nodeIdList(java.util.List<NodeIdList> nodeIdList) {
                this.nodeIdList = nodeIdList;
                return this;
            }

            /**
             * <p>The runtime custom parameters configured by node.</p>
             */
            public Builder nodeParamsList(java.util.List<NodeParamsList> nodeParamsList) {
                this.nodeParamsList = nodeParamsList;
                return this;
            }

            /**
             * <p>The concurrency. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder parallelism(Integer parallelism) {
                this.parallelism = parallelism;
                return this;
            }

            /**
             * <p>The project ID.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>101121</p>
             */
            public Builder projectId(Long projectId) {
                this.projectId = projectId;
                return this;
            }

            /**
             * <p>Corresponds to the &quot;Task Run Time&quot; option in the data backfill dialog box. If this parameter is set to true, the scheduled run time of instances is ignored and all instances run immediately. If this parameter is set to false, instances wait for their scheduled run time before running. Default value: true.</p>
             */
            public Builder runImmediately(Boolean runImmediately) {
                this.runImmediately = runImmediately;
                return this;
            }

            /**
             * <p>The start business date.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-05-21</p>
             */
            public Builder startBizDate(String startBizDate) {
                this.startBizDate = startBizDate;
                return this;
            }

            public CreateCommand build() {
                return new CreateCommand(this);
            } 

        } 

    }
}
