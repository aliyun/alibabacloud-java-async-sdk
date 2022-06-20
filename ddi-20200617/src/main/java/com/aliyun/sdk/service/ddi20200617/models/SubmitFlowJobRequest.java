// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddi20200617.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitFlowJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitFlowJobRequest</p>
 */
public class SubmitFlowJobRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("Conf")
    private String conf;

    @Query
    @NameInMap("HostName")
    private String hostName;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SubmitFlowJobRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.conf = builder.conf;
        this.hostName = builder.hostName;
        this.jobId = builder.jobId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitFlowJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return conf
     */
    public String getConf() {
        return this.conf;
    }

    /**
     * @return hostName
     */
    public String getHostName() {
        return this.hostName;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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

    public static final class Builder extends Request.Builder<SubmitFlowJobRequest, Builder> {
        private String clusterId; 
        private String conf; 
        private String hostName; 
        private String jobId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitFlowJobRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.conf = request.conf;
            this.hostName = request.hostName;
            this.jobId = request.jobId;
            this.projectId = request.projectId;
            this.regionId = request.regionId;
        } 

        /**
         * 集群ID。您可以调用ListClusters查看集群的ID。
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * 配置参数信息：{"key1":"value1"}。key为params的参数值会覆盖实际作业中运行的内容。
         */
        public Builder conf(String conf) {
            this.putQueryParameter("Conf", conf);
            this.conf = conf;
            return this;
        }

        /**
         * 保留参数。
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * 作业ID。您可以调用ListFlowJob查看作业ID。
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
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
        public SubmitFlowJobRequest build() {
            return new SubmitFlowJobRequest(this);
        } 

    } 

}
