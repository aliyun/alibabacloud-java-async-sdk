// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTenantRequest} extends {@link RequestModel}
 *
 * <p>GetTenantRequest</p>
 */
public class GetTenantRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("TenantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tenantId;

    private GetTenantRequest(Builder builder) {
        super(builder);
        this.tenantId = builder.tenantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTenantRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    public static final class Builder extends Request.Builder<GetTenantRequest, Builder> {
        private String tenantId; 

        private Builder() {
            super();
        } 

        private Builder(GetTenantRequest request) {
            super(request);
            this.tenantId = request.tenantId;
        } 

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putPathParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        @Override
        public GetTenantRequest build() {
            return new GetTenantRequest(this);
        } 

    } 

}
