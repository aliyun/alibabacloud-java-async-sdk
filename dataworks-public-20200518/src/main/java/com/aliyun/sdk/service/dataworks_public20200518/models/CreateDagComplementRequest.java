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
 * {@link CreateDagComplementRequest} extends {@link RequestModel}
 *
 * <p>CreateDagComplementRequest</p>
 */
public class CreateDagComplementRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizBeginTime")
    private String bizBeginTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BizEndTime")
    private String bizEndTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EndBizDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endBizDate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExcludeNodeIds")
    private String excludeNodeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IncludeNodeIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String includeNodeIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NodeParams")
    private String nodeParams;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parallelism")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean parallelism;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectEnv")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectEnv;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RootNodeId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long rootNodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StartBizDate")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startBizDate;

    private CreateDagComplementRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizBeginTime = builder.bizBeginTime;
        this.bizEndTime = builder.bizEndTime;
        this.endBizDate = builder.endBizDate;
        this.excludeNodeIds = builder.excludeNodeIds;
        this.includeNodeIds = builder.includeNodeIds;
        this.name = builder.name;
        this.nodeParams = builder.nodeParams;
        this.parallelism = builder.parallelism;
        this.projectEnv = builder.projectEnv;
        this.rootNodeId = builder.rootNodeId;
        this.startBizDate = builder.startBizDate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDagComplementRequest create() {
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
     * @return bizBeginTime
     */
    public String getBizBeginTime() {
        return this.bizBeginTime;
    }

    /**
     * @return bizEndTime
     */
    public String getBizEndTime() {
        return this.bizEndTime;
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
     * @return includeNodeIds
     */
    public String getIncludeNodeIds() {
        return this.includeNodeIds;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return nodeParams
     */
    public String getNodeParams() {
        return this.nodeParams;
    }

    /**
     * @return parallelism
     */
    public Boolean getParallelism() {
        return this.parallelism;
    }

    /**
     * @return projectEnv
     */
    public String getProjectEnv() {
        return this.projectEnv;
    }

    /**
     * @return rootNodeId
     */
    public Long getRootNodeId() {
        return this.rootNodeId;
    }

    /**
     * @return startBizDate
     */
    public String getStartBizDate() {
        return this.startBizDate;
    }

    public static final class Builder extends Request.Builder<CreateDagComplementRequest, Builder> {
        private String regionId; 
        private String bizBeginTime; 
        private String bizEndTime; 
        private String endBizDate; 
        private String excludeNodeIds; 
        private String includeNodeIds; 
        private String name; 
        private String nodeParams; 
        private Boolean parallelism; 
        private String projectEnv; 
        private Long rootNodeId; 
        private String startBizDate; 

        private Builder() {
            super();
        } 

        private Builder(CreateDagComplementRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizBeginTime = request.bizBeginTime;
            this.bizEndTime = request.bizEndTime;
            this.endBizDate = request.endBizDate;
            this.excludeNodeIds = request.excludeNodeIds;
            this.includeNodeIds = request.includeNodeIds;
            this.name = request.name;
            this.nodeParams = request.nodeParams;
            this.parallelism = request.parallelism;
            this.projectEnv = request.projectEnv;
            this.rootNodeId = request.rootNodeId;
            this.startBizDate = request.startBizDate;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * BizBeginTime.
         */
        public Builder bizBeginTime(String bizBeginTime) {
            this.putBodyParameter("BizBeginTime", bizBeginTime);
            this.bizBeginTime = bizBeginTime;
            return this;
        }

        /**
         * BizEndTime.
         */
        public Builder bizEndTime(String bizEndTime) {
            this.putBodyParameter("BizEndTime", bizEndTime);
            this.bizEndTime = bizEndTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-21 00:00:00</p>
         */
        public Builder endBizDate(String endBizDate) {
            this.putBodyParameter("EndBizDate", endBizDate);
            this.endBizDate = endBizDate;
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
         * <p>This parameter is required.</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xm_test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * NodeParams.
         */
        public Builder nodeParams(String nodeParams) {
            this.putBodyParameter("NodeParams", nodeParams);
            this.nodeParams = nodeParams;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder parallelism(Boolean parallelism) {
            this.putBodyParameter("Parallelism", parallelism);
            this.parallelism = parallelism;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>PROD</p>
         */
        public Builder projectEnv(String projectEnv) {
            this.putBodyParameter("ProjectEnv", projectEnv);
            this.projectEnv = projectEnv;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder rootNodeId(Long rootNodeId) {
            this.putBodyParameter("RootNodeId", rootNodeId);
            this.rootNodeId = rootNodeId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-20 00:00:00</p>
         */
        public Builder startBizDate(String startBizDate) {
            this.putBodyParameter("StartBizDate", startBizDate);
            this.startBizDate = startBizDate;
            return this;
        }

        @Override
        public CreateDagComplementRequest build() {
            return new CreateDagComplementRequest(this);
        } 

    } 

}
