// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link CreateServiceLinkedRoleRequest} extends {@link RequestModel}
 *
 * <p>CreateServiceLinkedRoleRequest</p>
 */
public class CreateServiceLinkedRoleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    @com.aliyun.core.annotation.Validation(maxLength = 64)
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceLinkedRole")
    private String serviceLinkedRole;

    private CreateServiceLinkedRoleRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.serviceLinkedRole = builder.serviceLinkedRole;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateServiceLinkedRoleRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return serviceLinkedRole
     */
    public String getServiceLinkedRole() {
        return this.serviceLinkedRole;
    }

    public static final class Builder extends Request.Builder<CreateServiceLinkedRoleRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String serviceLinkedRole; 

        private Builder() {
            super();
        } 

        private Builder(CreateServiceLinkedRoleRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.serviceLinkedRole = request.serviceLinkedRole;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. Different requests must use different tokens. The token can contain only ASCII characters and cannot exceed 64 characters in length.</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run. Valid values:</p>
         * <ul>
         * <li>true: performs only a dry run without executing the actual operation.</li>
         * <li>false: performs the actual operation.</li>
         * </ul>
         * <p>Default value: false.</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The service-linked role. Default value: <strong>AliyunServiceRoleForSas</strong>. Valid values:</p>
         * <ul>
         * <li><strong>AliyunServiceRoleForSas</strong>: The service-linked role for Security Center (SAS). Security Center uses this role to access your resources in other Alibaba Cloud services.</li>
         * <li><strong>AliyunServiceRoleForSasCspm</strong>: The service-linked role for Security Center - Cloud Security Posture Management (CSPM) (sas-cspm). sas-cspm uses this role to access your resources in other Alibaba Cloud services.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AliyunServiceRoleForSas</p>
         */
        public Builder serviceLinkedRole(String serviceLinkedRole) {
            this.putQueryParameter("ServiceLinkedRole", serviceLinkedRole);
            this.serviceLinkedRole = serviceLinkedRole;
            return this;
        }

        @Override
        public CreateServiceLinkedRoleRequest build() {
            return new CreateServiceLinkedRoleRequest(this);
        } 

    } 

}
