// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20180601.models;

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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Bizdate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bizdate;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DagPara")
    private String dagPara;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FlowName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String flowName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodePara")
    private String nodePara;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    private CreateManualDagRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizdate = builder.bizdate;
        this.dagPara = builder.dagPara;
        this.flowName = builder.flowName;
        this.nodePara = builder.nodePara;
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
     * @return bizdate
     */
    public String getBizdate() {
        return this.bizdate;
    }

    /**
     * @return dagPara
     */
    public String getDagPara() {
        return this.dagPara;
    }

    /**
     * @return flowName
     */
    public String getFlowName() {
        return this.flowName;
    }

    /**
     * @return nodePara
     */
    public String getNodePara() {
        return this.nodePara;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    public static final class Builder extends Request.Builder<CreateManualDagRequest, Builder> {
        private String regionId; 
        private String bizdate; 
        private String dagPara; 
        private String flowName; 
        private String nodePara; 
        private String projectName; 

        private Builder() {
            super();
        } 

        private Builder(CreateManualDagRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizdate = request.bizdate;
            this.dagPara = request.dagPara;
            this.flowName = request.flowName;
            this.nodePara = request.nodePara;
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
         * Bizdate.
         */
        public Builder bizdate(String bizdate) {
            this.putQueryParameter("Bizdate", bizdate);
            this.bizdate = bizdate;
            return this;
        }

        /**
         * DagPara.
         */
        public Builder dagPara(String dagPara) {
            this.putQueryParameter("DagPara", dagPara);
            this.dagPara = dagPara;
            return this;
        }

        /**
         * FlowName.
         */
        public Builder flowName(String flowName) {
            this.putQueryParameter("FlowName", flowName);
            this.flowName = flowName;
            return this;
        }

        /**
         * NodePara.
         */
        public Builder nodePara(String nodePara) {
            this.putQueryParameter("NodePara", nodePara);
            this.nodePara = nodePara;
            return this;
        }

        /**
         * ProjectName.
         */
        public Builder projectName(String projectName) {
            this.putQueryParameter("ProjectName", projectName);
            this.projectName = projectName;
            return this;
        }

        @Override
        public CreateManualDagRequest build() {
            return new CreateManualDagRequest(this);
        } 

    } 

}
