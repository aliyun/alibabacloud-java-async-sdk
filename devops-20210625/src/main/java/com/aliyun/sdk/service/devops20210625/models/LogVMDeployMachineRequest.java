// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link LogVMDeployMachineRequest} extends {@link RequestModel}
 *
 * <p>LogVMDeployMachineRequest</p>
 */
public class LogVMDeployMachineRequest extends Request {
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

    private LogVMDeployMachineRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.deployOrderId = builder.deployOrderId;
        this.machineSn = builder.machineSn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LogVMDeployMachineRequest create() {
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

    public static final class Builder extends Request.Builder<LogVMDeployMachineRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private Long deployOrderId; 
        private String machineSn; 

        private Builder() {
            super();
        } 

        private Builder(LogVMDeployMachineRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.deployOrderId = request.deployOrderId;
            this.machineSn = request.machineSn;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        public Builder deployOrderId(Long deployOrderId) {
            this.putPathParameter("deployOrderId", deployOrderId);
            this.deployOrderId = deployOrderId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sasassasa</p>
         */
        public Builder machineSn(String machineSn) {
            this.putPathParameter("machineSn", machineSn);
            this.machineSn = machineSn;
            return this;
        }

        @Override
        public LogVMDeployMachineRequest build() {
            return new LogVMDeployMachineRequest(this);
        } 

    } 

}
