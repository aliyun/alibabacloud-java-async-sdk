// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RetryVMDeployMachineRequest} extends {@link RequestModel}
 *
 * <p>RetryVMDeployMachineRequest</p>
 */
public class RetryVMDeployMachineRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("pipelineId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long pipelineId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("deployOrderId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long deployOrderId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("machineSn")
    @com.aliyun.core.annotation.Validation(required = true)
    private String machineSn;

    private RetryVMDeployMachineRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.deployOrderId = builder.deployOrderId;
        this.machineSn = builder.machineSn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RetryVMDeployMachineRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return pipelineId
     */
    public Long getPipelineId() {
        return this.pipelineId;
    }

    /**
     * @return deployOrderId
     */
    public Long getDeployOrderId() {
        return this.deployOrderId;
    }

    /**
     * @return machineSn
     */
    public String getMachineSn() {
        return this.machineSn;
    }

    public static final class Builder extends Request.Builder<RetryVMDeployMachineRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private Long deployOrderId; 
        private String machineSn; 

        private Builder() {
            super();
        } 

        private Builder(RetryVMDeployMachineRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.deployOrderId = request.deployOrderId;
            this.machineSn = request.machineSn;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * pipelineId.
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * deployOrderId.
         */
        public Builder deployOrderId(Long deployOrderId) {
            this.putPathParameter("deployOrderId", deployOrderId);
            this.deployOrderId = deployOrderId;
            return this;
        }

        /**
         * machineSn.
         */
        public Builder machineSn(String machineSn) {
            this.putPathParameter("machineSn", machineSn);
            this.machineSn = machineSn;
            return this;
        }

        @Override
        public RetryVMDeployMachineRequest build() {
            return new RetryVMDeployMachineRequest(this);
        } 

    } 

}
