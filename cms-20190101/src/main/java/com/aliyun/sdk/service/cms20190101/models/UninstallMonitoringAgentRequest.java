// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallMonitoringAgentRequest} extends {@link RequestModel}
 *
 * <p>UninstallMonitoringAgentRequest</p>
 */
public class UninstallMonitoringAgentRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private UninstallMonitoringAgentRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallMonitoringAgentRequest create() {
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

    public static final class Builder extends Request.Builder<UninstallMonitoringAgentRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(UninstallMonitoringAgentRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * The ID of the host.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public UninstallMonitoringAgentRequest build() {
            return new UninstallMonitoringAgentRequest(this);
        } 

    } 

}
