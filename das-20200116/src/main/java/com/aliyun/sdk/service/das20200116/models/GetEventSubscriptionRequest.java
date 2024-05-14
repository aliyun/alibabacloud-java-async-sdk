// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEventSubscriptionRequest} extends {@link RequestModel}
 *
 * <p>GetEventSubscriptionRequest</p>
 */
public class GetEventSubscriptionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetEventSubscriptionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetEventSubscriptionRequest create() {
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

    public static final class Builder extends Request.Builder<GetEventSubscriptionRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetEventSubscriptionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * The instance ID.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetEventSubscriptionRequest build() {
            return new GetEventSubscriptionRequest(this);
        } 

    } 

}
