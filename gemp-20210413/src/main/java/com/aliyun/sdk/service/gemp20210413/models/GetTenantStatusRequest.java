// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTenantStatusRequest} extends {@link RequestModel}
 *
 * <p>GetTenantStatusRequest</p>
 */
public class GetTenantStatusRequest extends Request {
    @Body
    @NameInMap("tenantRamId")
    @Validation(required = true)
    private Long tenantRamId;

    private GetTenantStatusRequest(Builder builder) {
        super(builder);
        this.tenantRamId = builder.tenantRamId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTenantStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return tenantRamId
     */
    public Long getTenantRamId() {
        return this.tenantRamId;
    }

    public static final class Builder extends Request.Builder<GetTenantStatusRequest, Builder> {
        private Long tenantRamId; 

        private Builder() {
            super();
        } 

        private Builder(GetTenantStatusRequest request) {
            super(request);
            this.tenantRamId = request.tenantRamId;
        } 

        /**
         * tenantRamId.
         */
        public Builder tenantRamId(Long tenantRamId) {
            this.putBodyParameter("tenantRamId", tenantRamId);
            this.tenantRamId = tenantRamId;
            return this;
        }

        @Override
        public GetTenantStatusRequest build() {
            return new GetTenantStatusRequest(this);
        } 

    } 

}
