// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetScheduleWorkerRequest} extends {@link RequestModel}
 *
 * <p>GetScheduleWorkerRequest</p>
 */
public class GetScheduleWorkerRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("ScheduleWorkerId")
    @Validation(required = true)
    private String scheduleWorkerId;

    private GetScheduleWorkerRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.scheduleWorkerId = builder.scheduleWorkerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetScheduleWorkerRequest create() {
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

    /**
     * @return scheduleWorkerId
     */
    public String getScheduleWorkerId() {
        return this.scheduleWorkerId;
    }

    public static final class Builder extends Request.Builder<GetScheduleWorkerRequest, Builder> {
        private String instanceId; 
        private String scheduleWorkerId; 

        private Builder() {
            super();
        } 

        private Builder(GetScheduleWorkerRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.scheduleWorkerId = request.scheduleWorkerId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ScheduleWorkerId.
         */
        public Builder scheduleWorkerId(String scheduleWorkerId) {
            this.putQueryParameter("ScheduleWorkerId", scheduleWorkerId);
            this.scheduleWorkerId = scheduleWorkerId;
            return this;
        }

        @Override
        public GetScheduleWorkerRequest build() {
            return new GetScheduleWorkerRequest(this);
        } 

    } 

}
