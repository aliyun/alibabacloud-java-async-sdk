// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220302.models;

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
 * {@link ManualModerationResultRequest} extends {@link RequestModel}
 *
 * <p>ManualModerationResultRequest</p>
 */
public class ManualModerationResultRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceParameters")
    private String serviceParameters;

    private ManualModerationResultRequest(Builder builder) {
        super(builder);
        this.serviceParameters = builder.serviceParameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ManualModerationResultRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return serviceParameters
     */
    public String getServiceParameters() {
        return this.serviceParameters;
    }

    public static final class Builder extends Request.Builder<ManualModerationResultRequest, Builder> {
        private String serviceParameters; 

        private Builder() {
            super();
        } 

        private Builder(ManualModerationResultRequest request) {
            super(request);
            this.serviceParameters = request.serviceParameters;
        } 

        /**
         * ServiceParameters.
         */
        public Builder serviceParameters(String serviceParameters) {
            this.putBodyParameter("ServiceParameters", serviceParameters);
            this.serviceParameters = serviceParameters;
            return this;
        }

        @Override
        public ManualModerationResultRequest build() {
            return new ManualModerationResultRequest(this);
        } 

    } 

}
