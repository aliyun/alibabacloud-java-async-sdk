// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link CreateDataQualityEvaluationTaskInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateDataQualityEvaluationTaskInstanceRequest</p>
 */
public class CreateDataQualityEvaluationTaskInstanceRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataQualityEvaluationTaskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long dataQualityEvaluationTaskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Parameters")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameters;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long projectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuntimeResource")
    private RuntimeResource runtimeResource;

    private CreateDataQualityEvaluationTaskInstanceRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataQualityEvaluationTaskId = builder.dataQualityEvaluationTaskId;
        this.parameters = builder.parameters;
        this.projectId = builder.projectId;
        this.runtimeResource = builder.runtimeResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataQualityEvaluationTaskInstanceRequest create() {
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
     * @return dataQualityEvaluationTaskId
     */
    public Long getDataQualityEvaluationTaskId() {
        return this.dataQualityEvaluationTaskId;
    }

    /**
     * @return parameters
     */
    public String getParameters() {
        return this.parameters;
    }

    /**
     * @return projectId
     */
    public Long getProjectId() {
        return this.projectId;
    }

    /**
     * @return runtimeResource
     */
    public RuntimeResource getRuntimeResource() {
        return this.runtimeResource;
    }

    public static final class Builder extends Request.Builder<CreateDataQualityEvaluationTaskInstanceRequest, Builder> {
        private String regionId; 
        private Long dataQualityEvaluationTaskId; 
        private String parameters; 
        private Long projectId; 
        private RuntimeResource runtimeResource; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataQualityEvaluationTaskInstanceRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataQualityEvaluationTaskId = request.dataQualityEvaluationTaskId;
            this.parameters = request.parameters;
            this.projectId = request.projectId;
            this.runtimeResource = request.runtimeResource;
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
         * <p>The ID of the data quality check task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000011</p>
         */
        public Builder dataQualityEvaluationTaskId(Long dataQualityEvaluationTaskId) {
            this.putBodyParameter("DataQualityEvaluationTaskId", dataQualityEvaluationTaskId);
            this.dataQualityEvaluationTaskId = dataQualityEvaluationTaskId;
            return this;
        }

        /**
         * <p>The execution parameters of the data quality check in JSON format. The following keys are available:</p>
         * <ul>
         * <li>triggerTime: the timestamp in milliseconds of the trigger time. This value is used as the base time for the $[yyyymmdd] expression in the data range of the data quality monitoring task. This key is required.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;triggerTime&quot;: 1733284062000 }</p>
         */
        public Builder parameters(String parameters) {
            this.putBodyParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace. You can logon to the <a href="https://workbench.data.aliyun.com/console">DataWorks console</a> and go to the Storage Management page to obtain the ID.</p>
         * <p>This parameter specifies the DataWorks workspace for this API invoke operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        public Builder projectId(Long projectId) {
            this.putBodyParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The resource group information. This parameter is required when running data quality checks on non-MaxCompute data.</p>
         */
        public Builder runtimeResource(RuntimeResource runtimeResource) {
            String runtimeResourceShrink = shrink(runtimeResource, "RuntimeResource", "json");
            this.putBodyParameter("RuntimeResource", runtimeResourceShrink);
            this.runtimeResource = runtimeResource;
            return this;
        }

        @Override
        public CreateDataQualityEvaluationTaskInstanceRequest build() {
            return new CreateDataQualityEvaluationTaskInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataQualityEvaluationTaskInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateDataQualityEvaluationTaskInstanceRequest</p>
     */
    public static class RuntimeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cu")
        private Double cu;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
        private String resourceGroupId;

        private RuntimeResource(Builder builder) {
            this.cu = builder.cu;
            this.resourceGroupId = builder.resourceGroupId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RuntimeResource create() {
            return builder().build();
        }

        /**
         * @return cu
         */
        public Double getCu() {
            return this.cu;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public static final class Builder {
            private Double cu; 
            private String resourceGroupId; 

            private Builder() {
            } 

            private Builder(RuntimeResource model) {
                this.cu = model.cu;
                this.resourceGroupId = model.resourceGroupId;
            } 

            /**
             * <p>The CU consumption configured for the task. This parameter is required if you use a serverless resource group.</p>
             * 
             * <strong>example:</strong>
             * <p>0.25</p>
             */
            public Builder cu(Double cu) {
                this.cu = cu;
                return this;
            }

            /**
             * <p>The identifier of the schedule resource group configured for the task.</p>
             * 
             * <strong>example:</strong>
             * <p>63900680</p>
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
                return this;
            }

            public RuntimeResource build() {
                return new RuntimeResource(this);
            } 

        } 

    }
}
