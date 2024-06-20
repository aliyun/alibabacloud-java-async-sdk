// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetServiceTemplateRequest</p>
 */
public class GetServiceTemplateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceTemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceTemplateId;

    private GetServiceTemplateRequest(Builder builder) {
        super(builder);
        this.serviceTemplateId = builder.serviceTemplateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceTemplateId
     */
    public String getServiceTemplateId() {
        return this.serviceTemplateId;
    }

    public static final class Builder extends Request.Builder<GetServiceTemplateRequest, Builder> {
        private String serviceTemplateId; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceTemplateRequest request) {
            super(request);
            this.serviceTemplateId = request.serviceTemplateId;
        } 

        /**
         * ServiceTemplateId.
         */
        public Builder serviceTemplateId(String serviceTemplateId) {
            this.putPathParameter("ServiceTemplateId", serviceTemplateId);
            this.serviceTemplateId = serviceTemplateId;
            return this;
        }

        @Override
        public GetServiceTemplateRequest build() {
            return new GetServiceTemplateRequest(this);
        } 

    } 

}
