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
    @Validation(required = true)
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

        private Builder(ExecuteJobRequest request) {
            super(request);
            this.checkJobStatus = request.checkJobStatus;
            this.designateType = request.designateType;
            this.groupId = request.groupId;
            this.instanceParameters = request.instanceParameters;
            this.jobId = request.jobId;
            this.label = request.label;
            this.namespace = request.namespace;
            this.namespaceSource = request.namespaceSource;
            this.regionId = request.regionId;
            this.worker = request.worker;
        } 

        /**
         * Specifies whether to check the job status. Valid values: -**true**: The job can be run only if the job is enabled. -**false**: The job can be run even if the job is disabled.
         */
        public Builder checkJobStatus(Boolean checkJobStatus) {
            this.putQueryParameter("CheckJobStatus", checkJobStatus);
            this.checkJobStatus = checkJobStatus;
            return this;
        }

        /**
         * The type of the designated machine. Valid values: -**1**: worker. -**2**: label.
         */
        public Builder designateType(Integer designateType) {
            this.putQueryParameter("DesignateType", designateType);
            this.designateType = designateType;
            return this;
        }

        /**
         * The application ID. You can obtain the application ID on the Application Management page in the SchedulerX console.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * The parameters that are passed to trigger the job to run. The input value can be a random string. The parameters that are passed are obtained by calling the `context.getInstanceParameters()` class in the `processor` code. The parameters are different from custom parameters for creating jobs.
         */
        public Builder instanceParameters(String instanceParameters) {
            this.putQueryParameter("InstanceParameters", instanceParameters);
            this.instanceParameters = instanceParameters;
            return this;
        }

        /**
         * The job ID. You can obtain the job ID on the Task Management page in the SchedulerX console.
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * The label of the worker.
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * The source of the namespace. This parameter is required only for a special third party.
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The worker address of the application. To query the worker address, call the GetWokerList operation.
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
