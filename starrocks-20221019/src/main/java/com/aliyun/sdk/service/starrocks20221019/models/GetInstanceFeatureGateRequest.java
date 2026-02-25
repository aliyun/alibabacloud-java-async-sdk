// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link GetInstanceFeatureGateRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceFeatureGateRequest</p>
 */
public class GetInstanceFeatureGateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetInstanceFeatureGateRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceFeatureGateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<GetInstanceFeatureGateRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceFeatureGateRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetInstanceFeatureGateRequest build() {
            return new GetInstanceFeatureGateRequest(this);
        } 

    } 

}
