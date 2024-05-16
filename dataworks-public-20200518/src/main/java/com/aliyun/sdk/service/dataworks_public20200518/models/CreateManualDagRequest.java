// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateManualDagRequest} extends {@link RequestModel}
 *
 * <p>CreateManualDagRequest</p>
 */
public class CreateManualDagRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DagParameters")
    private String dagParameters;

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
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    private CreateManualDagRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizDate = builder.bizDate;
        this.dagParameters = builder.dagParameters;
        this.excludeNodeIds = builder.excludeNodeIds;
        this.flowName = builder.flowName;
        this.includeNodeIds = builder.includeNodeIds;
        this.nodeParameters = builder.nodeParameters;
        this.projectEnv = builder.projectEnv;
        this.projectName = builder.projectName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateManualDagRequest create() {
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
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<CreateManualDagRequest, Builder> {
        private String regionId; 
        private String bizDate; 
        private String dagParameters; 
        private String excludeNodeIds; 
        private String flowName; 
        private String includeNodeIds; 
        private String nodeParameters; 
        private String projectEnv; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(CreateManualDagRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizDate = request.bizDate;
            this.dagParameters = request.dagParameters;
            this.excludeNodeIds = request.excludeNodeIds;
            this.flowName = request.flowName;
            this.includeNodeIds = request.includeNodeIds;
            this.nodeParameters = request.nodeParameters;
            this.projectEnv = request.projectEnv;
            this.projectName = request.projectName;
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
         * BizDate.
         */
        public Builder bizDate(String bizDate) {
            this.putBodyParameter("BizDate", bizDate);
            this.bizDate = bizDate;
            return this;
        }

        /**
         * DagParameters.
         */
        public Builder dagParameters(String dagParameters) {
            this.putBodyParameter("DagParameters", dagParameters);
            this.dagParameters = dagParameters;
            return this;
        }

        /**
         * ExcludeNodeIds.
         */
        public Builder excludeNodeIds(String excludeNodeIds) {
            this.putBodyParameter("ExcludeNodeIds", excludeNodeIds);
            this.excludeNodeIds = excludeNodeIds;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putBodyParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * IncludeNodeIds.
         */
        public Builder includeNodeIds(String includeNodeIds) {
            this.putBodyParameter("IncludeNodeIds", includeNodeIds);
            this.includeNodeIds = includeNodeIds;
            return this;
        }

        /**
         * NodeParameters.
         */
        public Builder nodeParameters(String nodeParameters) {
            this.putBodyParameter("NodeParameters", nodeParameters);
            this.nodeParameters = nodeParameters;
            return this;
        }

        /**
         * ProjectEnv.
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public CreateManualDagRequest build() {
            return new CreateManualDagRequest(this);
        } 

    } 

}
