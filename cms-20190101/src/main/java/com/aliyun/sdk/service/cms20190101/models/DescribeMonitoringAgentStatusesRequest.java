// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMonitoringAgentStatusesRequest} extends {@link RequestModel}
 *
 * <p>DescribeMonitoringAgentStatusesRequest</p>
 */
public class DescribeMonitoringAgentStatusesRequest extends Request {
    @Query
    @NameInMap("HostAvailabilityTaskId")
    private String hostAvailabilityTaskId;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    private DescribeMonitoringAgentStatusesRequest(Builder builder) {
        super(builder);
        this.hostAvailabilityTaskId = builder.hostAvailabilityTaskId;
        this.instanceIds = builder.instanceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMonitoringAgentStatusesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return hostAvailabilityTaskId
     */
    public String getHostAvailabilityTaskId() {
        return this.hostAvailabilityTaskId;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public static final class Builder extends Request.Builder<DescribeMonitoringAgentStatusesRequest, Builder> {
        private String hostAvailabilityTaskId; 
        private String instanceIds; 

        private Builder() {
            super();
        } 

        private Builder(DescribeMonitoringAgentStatusesRequest request) {
            super(request);
            this.hostAvailabilityTaskId = request.hostAvailabilityTaskId;
            this.instanceIds = request.instanceIds;
        } 

        /**
         * The ID of the availability monitoring task.
         */
        public Builder hostAvailabilityTaskId(String hostAvailabilityTaskId) {
            this.putQueryParameter("HostAvailabilityTaskId", hostAvailabilityTaskId);
            this.hostAvailabilityTaskId = hostAvailabilityTaskId;
            return this;
        }

        /**
         * The instance IDs. Separate multiple instance IDs with commas (,).
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        @Override
        public DescribeMonitoringAgentStatusesRequest build() {
            return new DescribeMonitoringAgentStatusesRequest(this);
        } 

    } 

}
