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
         * <p>The business date. The value must be less than or equal to the current date minus 1 day. For example, if today is November 11, 2020, the business date must be 00:00:00 on November 10, 2020 or an earlier date. The hour, minute, and second values of the business date must all be set to 00.</p>
         * <p>This parameter is used together with the StartBizDate and EndBizDate parameters. You can configure only one of BizDate or the StartBizDate and EndBizDate pair.</p>
         * <p>Format: <code>yyyy-MM-dd HH:mm:ss</code>. Example: <code>2020-11-11 00:00:00</code>.</p>
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
         * <p>This parameter is synchronized to all instances of the current dagrun. If the scheduling parameters of internal nodes (<a href="https://help.aliyun.com/document_detail/147245.html">supported node types</a>) reference workflow parameters in DagParameters, the corresponding parameter values of the nodes are replaced with the workflow parameters in DagParameters.</p>
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
         * <p>The business end date. Format: yyyy-MM-dd HH:mm:ss.</p>
         * <p>This parameter is used together with the StartBizDate parameter. You can configure only one of the StartBizDate and EndBizDate pair or the BizDate parameter.</p>
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
         * <p>The IDs of nodes that you do not want to run within the workflow. The specified nodes generate dry-run instances during execution. After a dry-run instance is scheduled, it immediately succeeds without executing the script content. Separate multiple node IDs with commas (,).</p>
         * <p>The ExcludeNodeIds parameter takes effect only when used together with the IncludeNodeIds parameter.</p>
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
         * <p>The name of the manual workflow.</p>
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
         * <p>The IDs of specific nodes to run within the manual workflow. Separate multiple node IDs with commas (,).</p>
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
         * <p>The node parameter information passed when the manual workflow is executed. This corresponds to the <strong>scheduling parameters</strong> configured in the <strong>Properties</strong> of nodes within the manual workflow.</p>
         * <p>A JSON format: { &quot;<Node ID within the manual workflow>&quot;: &quot;Scheduling parameter information of the node, in the same format as the parameters in the data development scheduling configuration&quot;, &quot;<Node ID within the manual workflow>&quot;: &quot;Scheduling parameter information of the node, in the same format as the parameters in the data development scheduling configuration&quot; }</p>
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
         * <p>The environment identifier of the Operation Center. PROD indicates the production environment. DEV indicates the development environment.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD or DEV</p>
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * <p>The project ID.</p>
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
         * <p>The name of the workspace to which the manual workflow belongs.</p>
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
         * <p>The business start date. Format: yyyy-MM-dd HH:mm:ss.</p>
         * <p>This parameter is used together with the EndBizDate parameter. You can configure only one of the StartBizDate and EndBizDate pair or the BizDate parameter.</p>
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
