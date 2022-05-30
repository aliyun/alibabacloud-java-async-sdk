// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetVMDeployOrderRequest} extends {@link RequestModel}
 *
 * <p>GetVMDeployOrderRequest</p>
 */
public class GetVMDeployOrderRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Path
    @NameInMap("pipelineId")
    @Validation(required = true)
    private Long pipelineId;

    @Path
    @NameInMap("deployOrderId")
    @Validation(required = true)
    private Long deployOrderId;

    private GetVMDeployOrderRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.pipelineId = builder.pipelineId;
        this.deployOrderId = builder.deployOrderId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetVMDeployOrderRequest create() {
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

    public static final class Builder extends Request.Builder<GetVMDeployOrderRequest, Builder> {
        private String organizationId; 
        private Long pipelineId; 
        private Long deployOrderId; 

        private Builder() {
            super();
        } 

        private Builder(GetVMDeployOrderRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.pipelineId = request.pipelineId;
            this.deployOrderId = request.deployOrderId;
        } 

        /**
         * 企业标识，也称企业id，字符串形式，可在云效访问链接中获取，如https://devops.aliyun.com/organization/【OrganizationId】
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * 12222
         */
        public Builder pipelineId(Long pipelineId) {
            this.putPathParameter("pipelineId", pipelineId);
            this.pipelineId = pipelineId;
            return this;
        }

        /**
         * 部署单ID
         */
        public Builder deployOrderId(Long deployOrderId) {
            this.putPathParameter("deployOrderId", deployOrderId);
            this.deployOrderId = deployOrderId;
            return this;
        }

        @Override
        public GetVMDeployOrderRequest build() {
            return new GetVMDeployOrderRequest(this);
        } 

    } 

}
