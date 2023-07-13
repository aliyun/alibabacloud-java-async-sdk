// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringAgentProcessesRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitoringAgentProcessesRequest</p>
 */
public class DescribeMonitoringAgentProcessesRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DescribeMonitoringAgentProcessesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitoringAgentProcessesRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeMonitoringAgentProcessesRequest, Builder> {
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitoringAgentProcessesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
        } 

        /**
         * The returned message.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DescribeMonitoringAgentProcessesRequest build() {
            return new DescribeMonitoringAgentProcessesRequest(this);
        } 

    } 

}
