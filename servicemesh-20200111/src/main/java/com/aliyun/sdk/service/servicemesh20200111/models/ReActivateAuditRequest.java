// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link ReActivateAuditRequest} extends {@link RequestModel}
 *
 * <p>ReActivateAuditRequest</p>
 */
public class ReActivateAuditRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EnableAudit")
    private Boolean enableAudit;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(ReActivateAuditRequest request) {
            super(request);
            this.enableAudit = request.enableAudit;
            this.serviceMeshId = request.serviceMeshId;
        } 

        /**
         * <p>Specifies whether to recreate a project that is used to store audit logs. Valid values:</p>
         * <ul>
         * <li>true: recreates a project.</li>
         * <li>false: does not recreate a project.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder enableAudit(Boolean enableAudit) {
            this.putBodyParameter("EnableAudit", enableAudit);
            this.enableAudit = enableAudit;
            return this;
        }

        /**
         * <p>The ID of the Service Mesh (ASM) instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c5bf9eb05c4424b89985d6536a809****</p>
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
