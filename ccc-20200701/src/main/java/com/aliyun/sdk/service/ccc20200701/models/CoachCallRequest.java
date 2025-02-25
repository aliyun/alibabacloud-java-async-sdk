// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link CoachCallRequest} extends {@link RequestModel}
 *
 * <p>CoachCallRequest</p>
 */
public class CoachCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoachedUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String coachedUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 3600)
    private Integer timeoutSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private CoachCallRequest(Builder builder) {
        super(builder);
        this.coachedUserId = builder.coachedUserId;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CoachCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return coachedUserId
     */
    public String getCoachedUserId() {
        return this.coachedUserId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return this.timeoutSeconds;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CoachCallRequest, Builder> {
        private String coachedUserId; 
        private String deviceId; 
        private String instanceId; 
        private String jobId; 
        private Integer timeoutSeconds; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CoachCallRequest request) {
            super(request);
            this.coachedUserId = request.coachedUserId;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.timeoutSeconds = request.timeoutSeconds;
            this.userId = request.userId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>coached-agent@ccc-test</p>
         */
        public Builder coachedUserId(String coachedUserId) {
            this.putQueryParameter("CoachedUserId", coachedUserId);
            this.coachedUserId = coachedUserId;
            return this;
        }

        /**
         * DeviceId.
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-65382141036853491</p>
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
            return this;
        }

        /**
         * TimeoutSeconds.
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CoachCallRequest build() {
            return new CoachCallRequest(this);
        } 

    } 

}
