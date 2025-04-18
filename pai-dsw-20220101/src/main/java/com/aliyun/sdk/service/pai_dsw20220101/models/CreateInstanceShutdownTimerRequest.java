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
 * {@link CreateInstanceShutdownTimerRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceShutdownTimerRequest</p>
 */
public class CreateInstanceShutdownTimerRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DueTime")
    private String dueTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RemainingTimeInMs")
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
         * <p>The instance ID. You can call <a href="https://help.aliyun.com/document_detail/470439.html">ListInstances</a> to obtain the instance ID.</p>
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

        /**
         * <p>The scheduled stop time.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-12T14:36:01Z</p>
         */
        public Builder dueTime(String dueTime) {
            this.putBodyParameter("DueTime", dueTime);
            this.dueTime = dueTime;
            return this;
        }

        /**
         * <p>The time duration before the instance is stopped. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600000</p>
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
