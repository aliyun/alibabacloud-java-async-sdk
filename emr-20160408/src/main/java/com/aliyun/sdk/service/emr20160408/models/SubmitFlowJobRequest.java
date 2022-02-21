// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

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
    @NameInMap("JobInstanceId")
    private String jobInstanceId;

    @Query
    @NameInMap("Namespace")
    private String namespace;

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
        this.jobInstanceId = builder.jobInstanceId;
        this.namespace = builder.namespace;
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
     * @return jobInstanceId
     */
    public String getJobInstanceId() {
        return this.jobInstanceId;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
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
        private String jobInstanceId; 
        private String namespace; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitFlowJobRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.conf = response.conf;
            this.hostName = response.hostName;
            this.jobId = response.jobId;
            this.jobInstanceId = response.jobInstanceId;
            this.namespace = response.namespace;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * Conf.
         */
        public Builder conf(String conf) {
            this.putQueryParameter("Conf", conf);
            this.conf = conf;
            return this;
        }

        /**
         * HostName.
         */
        public Builder hostName(String hostName) {
            this.putQueryParameter("HostName", hostName);
            this.hostName = hostName;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * JobInstanceId.
         */
        public Builder jobInstanceId(String jobInstanceId) {
            this.putQueryParameter("JobInstanceId", jobInstanceId);
            this.jobInstanceId = jobInstanceId;
            return this;
        }

        /**
         * Namespace.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * RegionId.
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
