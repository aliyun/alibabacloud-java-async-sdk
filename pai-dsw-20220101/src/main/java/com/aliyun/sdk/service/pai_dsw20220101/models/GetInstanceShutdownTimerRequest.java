// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link GetInstanceShutdownTimerRequest} extends {@link RequestModel}
 *
 * <p>GetInstanceShutdownTimerRequest</p>
 */
public class GetInstanceShutdownTimerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private GetInstanceShutdownTimerRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetInstanceShutdownTimerRequest create() {
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

    public static final class Builder extends Request.Builder<GetInstanceShutdownTimerRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(GetInstanceShutdownTimerRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dsw-730xxxxxxxxxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public GetInstanceShutdownTimerRequest build() {
            return new GetInstanceShutdownTimerRequest(this);
        } 

    } 

}
