// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link RunManualDagNodesRequest} extends {@link RequestModel}
 *
 * <p>RunManualDagNodesRequest</p>
 */
public class RunManualDagNodesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizDate")
    private String bizDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DagParameters")
    private String dagParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndBizDate")
    private String endBizDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeNodeIds")
    private String excludeNodeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeNodeIds")
    private String includeNodeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeParameters")
    private String nodeParameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartBizDate")
    private String startBizDate;

    private RunManualDagNodesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizDate = builder.bizDate;
        this.dagParameters = builder.dagParameters;
        this.endBizDate = builder.endBizDate;
        this.excludeNodeIds = builder.excludeNodeIds;
        this.flowName = builder.flowName;
        this.includeNodeIds = builder.includeNodeIds;
        this.nodeParameters = builder.nodeParameters;
        this.projectEnv = builder.projectEnv;
        this.projectId = builder.projectId;
        this.projectName = builder.projectName;
        this.startBizDate = builder.startBizDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RunManualDagNodesRequest create() {
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
     * @return bizDate
     */
    public String getBizDate() {
        return this.bizDate;
    }

    /**
     * @return dagParameters
     */
    public String getDagParameters() {
        return this.dagParameters;
    }

    /**
     * @return endBizDate
     */
    public String getEndBizDate() {
        return this.endBizDate;
    }

    /**
     * @return excludeNodeIds
     */
    public String getExcludeNodeIds() {
        return this.excludeNodeIds;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return includeNodeIds
     */
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    /**
     * @return nodeParameters
     */
    public String getNodeParameters() {
        return this.nodeParameters;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return startBizDate
     */
    public String getStartBizDate() {
        return this.startBizDate;
    }

    public static final class Builder extends Request.Builder<RunManualDagNodesRequest, Builder> {
        private String regionId; 
        private String bizDate; 
        private String dagParameters; 
        private String endBizDate; 
        private String excludeNodeIds; 
        private String flowName; 
        private String includeNodeIds; 
        private String nodeParameters; 
        private String projectEnv; 
        private Long projectId; 
        private String projectName; 
        private String startBizDate; 

        private Builder() {
            super();
        } 

        private Builder(RunManualDagNodesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizDate = request.bizDate;
            this.dagParameters = request.dagParameters;
            this.endBizDate = request.endBizDate;
            this.excludeNodeIds = request.excludeNodeIds;
            this.flowName = request.flowName;
            this.includeNodeIds = request.includeNodeIds;
            this.nodeParameters = request.nodeParameters;
            this.projectEnv = request.projectEnv;
            this.projectId = request.projectId;
            this.projectName = request.projectName;
            this.startBizDate = request.startBizDate;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The data timestamp. The value of the data timestamp must be one or more days before the current date. For example, if the current date is November 11, 2020, set the value to 2020-11-10 00:00:00 or earlier. Configure this parameter in the YYYY-MM-DD 00:00:00 format. The StartBizDate parameter is used together with the EndBizDate parameter. You can configure only the BizDate parameter or the StartBizDate and EndBizDate parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-11-11 00:00:00</p>
         */
        public Builder bizDate(String bizDate) {
            this.putBodyParameter("BizDate", bizDate);
            this.bizDate = bizDate;
            return this;
        }

        /**
         * <p>The parameters are synchronized to all the instances in the directed acyclic graph (DAG) of the workflow. If a workflow parameter specified in DagParameters is referenced as a scheduling parameter of a <a href="https://help.aliyun.com/document_detail/147245.html">node</a>, the value of the scheduling parameter is replaced with the value of the workflow parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;kaaaa&quot;: &quot;vaaaaa&quot;, &quot;kbbbb&quot;: &quot;vbbbbb&quot;}</p>
         */
        public Builder dagParameters(String dagParameters) {
            this.putBodyParameter("DagParameters", dagParameters);
            this.dagParameters = dagParameters;
            return this;
        }

        /**
         * <p>The end of the time range in which data generated needs to be processed. Configure this parameter in the yyyy-MM-dd HH:mm:ss format. The StartBizDate parameter is used together with the EndBizDate parameter. You can configure only the BizDate parameter or the StartBizDate and EndBizDate parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-03 00:00:00</p>
         */
        public Builder endBizDate(String endBizDate) {
            this.putBodyParameter("EndBizDate", endBizDate);
            this.endBizDate = endBizDate;
            return this;
        }

        /**
         * <p>The IDs of the nodes that you do not need to run in the manually triggered workflow. DataWorks generates dry-run instances for all these nodes. After the dry-run instances are scheduled, the states of these instances are directly set to successful, but the scripts are not run. Separate multiple node IDs with commas (,). The ExcludeNodeIds parameter must be used together with the IncludeNodeIds parameter. This way, the settings of the ExcludeNodeIds parameter can take effect.</p>
         * 
         * <strong>example:</strong>
         * <p>123,456</p>
         */
        public Builder excludeNodeIds(String excludeNodeIds) {
            this.putBodyParameter("ExcludeNodeIds", excludeNodeIds);
            this.excludeNodeIds = excludeNodeIds;
            return this;
        }

        /**
         * <p>The name of the manually triggered workflow.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_workflow</p>
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * <p>The IDs of the nodes that you need to run in the manually triggered workflow. Separate multiple node IDs with commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>74324,74325</p>
         */
        public Builder includeNodeIds(String includeNodeIds) {
            this.putBodyParameter("IncludeNodeIds", includeNodeIds);
            this.includeNodeIds = includeNodeIds;
            return this;
        }

        /**
         * <p>The scheduling parameters of nodes in the manually triggered workflow. Configure NodeParameters in the following JSON format: {&quot;&lt;ID of a node in the manually triggered workflow&gt;&quot;: &quot;Scheduling parameter settings of the node, which are in the same format as the parameter settings in the Scheduling Parameter section of the Properties tab on the DataStudio page&quot;, &quot;&lt;ID of a node in the manually triggered workflow&gt;&quot;: &quot;Scheduling parameter settings of the node, which are in the same format as the parameter settings in the Scheduling Parameter section of the Properties tab on the DataStudio page&quot;}.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;20000123121&quot;: &quot;key1=val2 key2=val2&quot;, &quot;20000123124&quot;: &quot;kkkk=vvvvv aaaa=bbbb&quot;}</p>
         */
        public Builder nodeParameters(String nodeParameters) {
            this.putBodyParameter("NodeParameters", nodeParameters);
            this.nodeParameters = nodeParameters;
            return this;
        }

        /**
         * <p>The environment type of Operation Center. Valid values: PROD and DEV. The value PROD indicates the production environment. The value DEV indicates the development environment.</p>
         * <p>This parameter is required.</p>
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * <p>The ID of the workspace to which the manually triggered workflow belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The name of the workspace to which the manually triggered workflow belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test_workspace</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The beginning of the time range in which data generated needs to be processed. Configure this parameter in the yyyy-MM-dd HH:mm:ss format. The StartBizDate parameter is used together with the EndBizDate parameter. You can configure only the BizDate parameter or the StartBizDate and EndBizDate parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-02-02 00:00:00</p>
         */
        public Builder startBizDate(String startBizDate) {
            this.putBodyParameter("StartBizDate", startBizDate);
            this.startBizDate = startBizDate;
            return this;
        }

        @Override
        public RunManualDagNodesRequest build() {
            return new RunManualDagNodesRequest(this);
        } 

    } 

}
