// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InterceptCallRequest} extends {@link RequestModel}
 *
 * <p>InterceptCallRequest</p>
 */
public class InterceptCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InterceptedUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String interceptedUserId;

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

    private InterceptCallRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.interceptedUserId = builder.interceptedUserId;
        this.jobId = builder.jobId;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InterceptCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return interceptedUserId
     */
    public String getInterceptedUserId() {
        return this.interceptedUserId;
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

    public static final class Builder extends Request.Builder<InterceptCallRequest, Builder> {
        private String deviceId; 
        private String instanceId; 
        private String interceptedUserId; 
        private String jobId; 
        private Integer timeoutSeconds; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(InterceptCallRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.interceptedUserId = request.interceptedUserId;
            this.jobId = request.jobId;
            this.timeoutSeconds = request.timeoutSeconds;
            this.userId = request.userId;
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
         * <p>agent2@ccc-test</p>
         */
        public Builder interceptedUserId(String interceptedUserId) {
            this.putQueryParameter("InterceptedUserId", interceptedUserId);
            this.interceptedUserId = interceptedUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>job-6538214103685****</p>
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
        public InterceptCallRequest build() {
            return new InterceptCallRequest(this);
        } 

    } 

}
