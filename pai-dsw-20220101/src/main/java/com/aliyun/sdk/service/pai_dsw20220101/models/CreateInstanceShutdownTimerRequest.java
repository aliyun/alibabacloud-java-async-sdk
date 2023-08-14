// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceShutdownTimerRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceShutdownTimerRequest</p>
 */
public class CreateInstanceShutdownTimerRequest extends Request {
    @Path
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("DueTime")
    private String dueTime;

    @Body
    @NameInMap("RemainingTimeInMs")
    private Long remainingTimeInMs;

    private CreateInstanceShutdownTimerRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.dueTime = builder.dueTime;
        this.remainingTimeInMs = builder.remainingTimeInMs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceShutdownTimerRequest create() {
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
     * @return dueTime
     */
    public String getDueTime() {
        return this.dueTime;
    }

    /**
     * @return remainingTimeInMs
     */
    public Long getRemainingTimeInMs() {
        return this.remainingTimeInMs;
    }

    public static final class Builder extends Request.Builder<CreateInstanceShutdownTimerRequest, Builder> {
        private String instanceId; 
        private String dueTime; 
        private Long remainingTimeInMs; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceShutdownTimerRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.dueTime = request.dueTime;
            this.remainingTimeInMs = request.remainingTimeInMs;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putPathParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * DueTime.
         */
        public Builder dueTime(String dueTime) {
            this.putBodyParameter("DueTime", dueTime);
            this.dueTime = dueTime;
            return this;
        }

        /**
         * RemainingTimeInMs.
         */
        public Builder remainingTimeInMs(Long remainingTimeInMs) {
            this.putBodyParameter("RemainingTimeInMs", remainingTimeInMs);
            this.remainingTimeInMs = remainingTimeInMs;
            return this;
        }

        @Override
        public CreateInstanceShutdownTimerRequest build() {
            return new CreateInstanceShutdownTimerRequest(this);
        } 

    } 

}
