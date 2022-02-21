// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReActivateAuditRequest} extends {@link RequestModel}
 *
 * <p>ReActivateAuditRequest</p>
 */
public class ReActivateAuditRequest extends Request {
    @Body
    @NameInMap("EnableAudit")
    private Boolean enableAudit;

    @Body
    @NameInMap("ServiceMeshId")
    @Validation(required = true)
    private String serviceMeshId;

    private ReActivateAuditRequest(Builder builder) {
        super(builder);
        this.enableAudit = builder.enableAudit;
        this.serviceMeshId = builder.serviceMeshId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReActivateAuditRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return enableAudit
     */
    public Boolean getEnableAudit() {
        return this.enableAudit;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    public static final class Builder extends Request.Builder<ReActivateAuditRequest, Builder> {
        private Boolean enableAudit; 
        private String serviceMeshId; 

        private Builder() {
            super();
        } 

        private Builder(ReActivateAuditRequest response) {
            super(response);
            this.enableAudit = response.enableAudit;
            this.serviceMeshId = response.serviceMeshId;
        } 

        /**
         * EnableAudit.
         */
        public Builder enableAudit(Boolean enableAudit) {
            this.putBodyParameter("EnableAudit", enableAudit);
            this.enableAudit = enableAudit;
            return this;
        }

        /**
         * ServiceMeshId.
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        @Override
        public ReActivateAuditRequest build() {
            return new ReActivateAuditRequest(this);
        } 

    } 

}
