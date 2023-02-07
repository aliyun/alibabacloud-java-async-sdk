// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMcuLvsIpRequest} extends {@link RequestModel}
 *
 * <p>GetMcuLvsIpRequest</p>
 */
public class GetMcuLvsIpRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private GetMcuLvsIpRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMcuLvsIpRequest create() {
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

    public static final class Builder extends Request.Builder<GetMcuLvsIpRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetMcuLvsIpRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * 实例ID
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetMcuLvsIpRequest build() {
            return new GetMcuLvsIpRequest(this);
        } 

    } 

}
