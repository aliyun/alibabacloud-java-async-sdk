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
 * {@link MonitorCallRequest} extends {@link RequestModel}
 *
 * <p>MonitorCallRequest</p>
 */
public class MonitorCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitoredUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String monitoredUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    private Integer timeoutSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private MonitorCallRequest(Builder builder) {
        super(builder);
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.monitoredUserId = builder.monitoredUserId;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorCallRequest create() {
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
     * @return monitoredUserId
     */
    public String getMonitoredUserId() {
        return this.monitoredUserId;
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

    public static final class Builder extends Request.Builder<MonitorCallRequest, Builder> {
        private String deviceId; 
        private String instanceId; 
        private String monitoredUserId; 
        private Integer timeoutSeconds; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(MonitorCallRequest request) {
            super(request);
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.monitoredUserId = request.monitoredUserId;
            this.timeoutSeconds = request.timeoutSeconds;
            this.userId = request.userId;
        } 

        /**
         * <p>Device ID. This parameter is meaningless and can be filled with any value.</p>
         * 
         * <strong>example:</strong>
         * <p>device</p>
         */
        public Builder deviceId(String deviceId) {
            this.putQueryParameter("DeviceId", deviceId);
            this.deviceId = deviceId;
            return this;
        }

        /**
         * <p>Instance ID.</p>
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
         * <p>The ID of the agent being monitored.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>agent2@ccc-test</p>
         */
        public Builder monitoredUserId(String monitoredUserId) {
            this.putQueryParameter("MonitoredUserId", monitoredUserId);
            this.monitoredUserId = monitoredUserId;
            return this;
        }

        /**
         * <p>The timeout period for the listening operation, in seconds. If the listening operation does not succeed within the specified time, it is canceled. Normally, the listening operation succeeds immediately. The timeout setting is provided to handle abnormal scenarios. This field is optional and defaults to 30 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder timeoutSeconds(Integer timeoutSeconds) {
            this.putQueryParameter("TimeoutSeconds", timeoutSeconds);
            this.timeoutSeconds = timeoutSeconds;
            return this;
        }

        /**
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        public Builder userId(String userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public MonitorCallRequest build() {
            return new MonitorCallRequest(this);
        } 

    } 

}
