// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GetIntegratedServiceStatusRequest} extends {@link RequestModel}
 *
 * <p>GetIntegratedServiceStatusRequest</p>
 */
public class GetIntegratedServiceStatusRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceCode;

    private GetIntegratedServiceStatusRequest(Builder builder) {
        super(builder);
        this.serviceCode = builder.serviceCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIntegratedServiceStatusRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceCode
     */
    public String getServiceCode() {
        return this.serviceCode;
    }

    public static final class Builder extends Request.Builder<GetIntegratedServiceStatusRequest, Builder> {
        private String serviceCode; 

        private Builder() {
            super();
        } 

        private Builder(GetIntegratedServiceStatusRequest request) {
            super(request);
            this.serviceCode = request.serviceCode;
        } 

        /**
         * <p>The identity of the cloud service that is integrated with Cloud Config. Valid values:</p>
         * <ul>
         * <li>eventbridge: EventBridge</li>
         * <li>cms: CloudMonitor</li>
         * <li>bpstudio: Cloud Architect Design Tools (CADT)</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cadt</p>
         */
        public Builder serviceCode(String serviceCode) {
            this.putBodyParameter("ServiceCode", serviceCode);
            this.serviceCode = serviceCode;
            return this;
        }

        @Override
        public GetIntegratedServiceStatusRequest build() {
            return new GetIntegratedServiceStatusRequest(this);
        } 

    } 

}
