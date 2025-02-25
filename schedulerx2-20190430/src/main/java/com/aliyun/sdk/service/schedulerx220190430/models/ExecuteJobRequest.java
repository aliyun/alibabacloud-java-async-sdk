// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.schedulerx220190430.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecuteJobRequest} extends {@link RequestModel}
 *
 * <p>ExecuteJobRequest</p>
 */
public class ExecuteJobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckJobStatus")
    private Boolean checkJobStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DesignateType")
    private Integer designateType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String groupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceParameters")
    private String instanceParameters;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Label")
    private String label;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Namespace")
    @com.aliyun.core.annotation.Validation(required = true)
    private String namespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceSource")
    private String namespaceSource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Worker")
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
         * <p>Specifies whether to check the job status. Valid values: -<strong>true</strong>: The job can be run only if the job is enabled. -<strong>false</strong>: The job can be run even if the job is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder checkJobStatus(Boolean checkJobStatus) {
            this.putQueryParameter("CheckJobStatus", checkJobStatus);
            this.checkJobStatus = checkJobStatus;
            return this;
        }

        /**
         * <p>The type of the designated machine. Valid values: -<strong>1</strong>: worker. -<strong>2</strong>: label.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder designateType(Integer designateType) {
            this.putQueryParameter("DesignateType", designateType);
            this.designateType = designateType;
            return this;
        }

        /**
         * <p>The application ID. You can obtain the application ID on the Application Management page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testSchedulerx.defaultGroup</p>
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * <p>The parameters that are passed to trigger the job to run. The input value can be a random string. The parameters that are passed are obtained by calling the <code>context.getInstanceParameters()</code> class in the <code>processor</code> code. The parameters are different from custom parameters for creating jobs.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder instanceParameters(String instanceParameters) {
            this.putQueryParameter("InstanceParameters", instanceParameters);
            this.instanceParameters = instanceParameters;
            return this;
        }

        /**
         * <p>The job ID. You can obtain the job ID on the Task Management page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>92583</p>
         */
        public Builder jobId(Long jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The label of the worker.</p>
         * 
         * <strong>example:</strong>
         * <p>gray</p>
         */
        public Builder label(String label) {
            this.putQueryParameter("Label", label);
            this.label = label;
            return this;
        }

        /**
         * <p>The namespace ID. You can obtain the namespace ID on the Namespace page in the SchedulerX console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>adcfc35d-e2fe-4fe9-bbaa-20e90ffc****</p>
         */
        public Builder namespace(String namespace) {
            this.putQueryParameter("Namespace", namespace);
            this.namespace = namespace;
            return this;
        }

        /**
         * <p>The source of the namespace. This parameter is required only for a special third party.</p>
         * 
         * <strong>example:</strong>
         * <p>schedulerx</p>
         */
        public Builder namespaceSource(String namespaceSource) {
            this.putQueryParameter("NamespaceSource", namespaceSource);
            this.namespaceSource = namespaceSource;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The worker address of the application. To query the worker address, call the GetWokerList operation.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="mailto:xxxxxxx@127.0.0.1">xxxxxxx@127.0.0.1</a>:222</p>
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
