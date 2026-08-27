// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ram20150501.models;

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
 * {@link GetServiceLinkedRoleTemplateRequest} extends {@link RequestModel}
 *
 * <p>GetServiceLinkedRoleTemplateRequest</p>
 */
public class GetServiceLinkedRoleTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    private GetServiceLinkedRoleTemplateRequest(Builder builder) {
        super(builder);
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetServiceLinkedRoleTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<GetServiceLinkedRoleTemplateRequest, Builder> {
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(GetServiceLinkedRoleTemplateRequest request) {
            super(request);
            this.serviceName = request.serviceName;
        } 

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public GetServiceLinkedRoleTemplateRequest build() {
            return new GetServiceLinkedRoleTemplateRequest(this);
        } 

    } 

}
