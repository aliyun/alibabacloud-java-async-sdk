// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitFlowRequest} extends {@link RequestModel}
 *
 * <p>SubmitFlowRequest</p>
 */
public class SubmitFlowRequest extends Request {
    @Query
    @NameInMap("Conf")
    private String conf;

    @Query
    @NameInMap("FlowId")
    @Validation(required = true)
    private String flowId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SubmitFlowRequest(Builder builder) {
        super(builder);
        this.conf = builder.conf;
        this.flowId = builder.flowId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitFlowRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return conf
     */
    public String getConf() {
        return this.conf;
    }

    /**
     * @return flowId
     */
    public String getFlowId() {
        return this.flowId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SubmitFlowRequest, Builder> {
        private String conf; 
        private String flowId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitFlowRequest response) {
            super(response);
            this.conf = response.conf;
            this.flowId = response.flowId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * 配置信息{"key":"value"}格式。  本示例中cyctime表示实际调度运行的时间（长整型时间戳）。
         */
        public Builder conf(String conf) {
            this.putQueryParameter("Conf", conf);
            this.conf = conf;
            return this;
        }

        /**
         * 工作流ID。您可以调用ListFlowInstance查看工作流ID。
         */
        public Builder flowId(String flowId) {
            this.putQueryParameter("FlowId", flowId);
            this.flowId = flowId;
            return this;
        }

        /**
         * 项目ID。您可以调用ListFlowProject查看项目的ID。
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * 地域ID。您可以调用DescribeRegions查看最新的阿里云地域列表。
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SubmitFlowRequest build() {
            return new SubmitFlowRequest(this);
        } 

    } 

}
