// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRealtimeInstanceStatesRequest} extends {@link RequestModel}
 *
 * <p>GetRealtimeInstanceStatesRequest</p>
 */
public class GetRealtimeInstanceStatesRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetRealtimeInstanceStatesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealtimeInstanceStatesRequest create() {
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

    public static final class Builder extends Request.Builder<GetRealtimeInstanceStatesRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetRealtimeInstanceStatesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetRealtimeInstanceStatesRequest build() {
            return new GetRealtimeInstanceStatesRequest(this);
        } 

    } 

}
