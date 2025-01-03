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
 * {@link StopVMDeployOrderRequest} extends {@link RequestModel}
 *
 * <p>StopVMDeployOrderRequest</p>
 */
public class StopVMDeployOrderRequest extends Request {
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

    private StopVMDeployOrderRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.deployOrderId = builder.deployOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StopVMDeployOrderRequest create() {
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

    public static final class Builder extends Request.Builder<StopVMDeployOrderRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private Long deployOrderId; 

        private Builder() {
            super();
        } 

        private Builder(StopVMDeployOrderRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.deployOrderId = request.deployOrderId;
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
         * <p>12222</p>
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

        @Override
        public StopVMDeployOrderRequest build() {
            return new StopVMDeployOrderRequest(this);
        } 

    } 

}
