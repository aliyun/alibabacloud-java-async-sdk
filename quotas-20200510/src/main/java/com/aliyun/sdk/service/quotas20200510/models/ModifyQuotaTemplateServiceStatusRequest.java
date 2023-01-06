// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyQuotaTemplateServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>ModifyQuotaTemplateServiceStatusRequest</p>
 */
public class ModifyQuotaTemplateServiceStatusRequest extends Request {
    @Body
    @NameInMap("ServiceStatus")
    @Validation(required = true)
    private Integer serviceStatus;

    private ModifyQuotaTemplateServiceStatusRequest(Builder builder) {
        super(builder);
        this.serviceStatus = builder.serviceStatus;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyQuotaTemplateServiceStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceStatus
     */
    public Integer getServiceStatus() {
        return this.serviceStatus;
    }

    public static final class Builder extends Request.Builder<ModifyQuotaTemplateServiceStatusRequest, Builder> {
        private Integer serviceStatus; 

        private Builder() {
            super();
        } 

        private Builder(ModifyQuotaTemplateServiceStatusRequest request) {
            super(request);
            this.serviceStatus = request.serviceStatus;
        } 

        /**
         * The status of the quota template. Valid values:
         * <p>
         * 
         * *   \-1: disabled
         * *   1: enabled
         */
        public Builder serviceStatus(Integer serviceStatus) {
            this.putBodyParameter("ServiceStatus", serviceStatus);
            this.serviceStatus = serviceStatus;
            return this;
        }

        @Override
        public ModifyQuotaTemplateServiceStatusRequest build() {
            return new ModifyQuotaTemplateServiceStatusRequest(this);
        } 

    } 

}
