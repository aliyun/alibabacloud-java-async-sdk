// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteJobRequest} extends {@link RequestModel}
 *
 * <p>ExecuteJobRequest</p>
 */
public class ExecuteJobRequest extends Request {
    @Query
    @NameInMap("CheckJobStatus")
    private Boolean checkJobStatus;

    @Query
    @NameInMap("DesignateType")
    private Integer designateType;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("InstanceParameters")
    private String instanceParameters;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private Long jobId;

    @Query
    @NameInMap("Label")
    private String label;

    @Query
    @NameInMap("Namespace")
    @Validation(required = true)
    private String namespace;

    @Query
    @NameInMap("NamespaceSource")
    private String namespaceSource;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Worker")
    private String worker;

    private ExecuteJobRequest(Builder builder) {
        super(builder);
        this.checkJobStatus = builder.checkJobStatus;
        this.designateType = builder.designateType;
        this.groupId = builder.groupId;
        this.instanceParameters = builder.instanceParameters;
        this.jobId = builder.jobId;
        this.label = builder.label;
        this.namespace = builder.namespace;
        this.namespaceSource = builder.namespaceSource;
        this.regionId = builder.regionId;
        this.worker = builder.worker;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteJobRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkJobStatus
     */
    public Boolean getCheckJobStatus() {
        return this.checkJobStatus;
    }

    /**
     * @return designateType
     */
    public Integer getDesignateType() {
        return this.designateType;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return instanceParameters
     */
    public String getInstanceParameters() {
        return this.instanceParameters;
    }

    /**
     * @return jobId
     */
    public Long getJobId() {
        return this.jobId;
    }

    /**
     * @return label
     */
    public String getLabel() {
        return this.label;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return namespaceSource
     */
    public String getNamespaceSource() {
        return this.namespaceSource;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return worker
     */
    public String getWorker() {
        return this.worker;
    }

    public static final class Builder extends Request.Builder<ExecuteJobRequest, Builder> {
        private Boolean checkJobStatus; 
        private Integer designateType; 
        private String groupId; 
        private String instanceParameters; 
        private Long jobId; 
        private String label; 
        private String namespace; 
        private String namespaceSource; 
        private String regionId; 
        private String worker; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteJobRequest response) {
            super(response);
            this.checkJobStatus = response.checkJobStatus;
            this.designateType = response.designateType;
            this.groupId = response.groupId;
            this.instanceParameters = response.instanceParameters;
            this.jobId = response.jobId;
            this.label = response.label;
            this.namespace = response.namespace;
            this.namespaceSource = response.namespaceSource;
            this.regionId = response.regionId;
            this.worker = response.worker;
        } 

        /**
         * CheckJobStatus.
         */
        public Builder checkJobStatus(Boolean checkJobStatus) {
            this.putQueryParameter("CheckJobStatus", checkJobStatus);
            this.checkJobStatus = checkJobStatus;
            return this;
        }

        /**
         * 指定机器类型：1.workerAddr; 2. label
         */
        public Builder designateType(Integer designateType) {
            this.putQueryParameter("DesignateType", designateType);
            this.designateType = designateType;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * InstanceParameters.
         */
        public Builder instanceParameters(String instanceParameters) {
            this.putQueryParameter("InstanceParameters", instanceParameters);
            this.instanceParameters = instanceParameters;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * 指定机器的标签
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
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
         * NamespaceSource.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
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

        /**
         * 指定机器的workerAddr
         */
        public Builder worker(String worker) {
            this.putQueryParameter("Worker", worker);
            this.worker = worker;
            return this;
        }

        @Override
        public ExecuteJobRequest build() {
            return new ExecuteJobRequest(this);
        } 

    } 

}
