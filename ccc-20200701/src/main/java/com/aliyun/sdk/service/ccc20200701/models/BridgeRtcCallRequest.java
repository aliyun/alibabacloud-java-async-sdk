// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BridgeRtcCallRequest} extends {@link RequestModel}
 *
 * <p>BridgeRtcCallRequest</p>
 */
public class BridgeRtcCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Callee")
    @com.aliyun.core.annotation.Validation(required = true)
    private String callee;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Caller")
    private String caller;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceProvider")
    private String serviceProvider;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tags")
    private String tags;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeoutSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 300, minimum = 30)
    private Integer timeoutSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoEnabled")
    private Boolean videoEnabled;

    private BridgeRtcCallRequest(Builder builder) {
        super(builder);
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.serviceProvider = builder.serviceProvider;
        this.tags = builder.tags;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.userId = builder.userId;
        this.videoEnabled = builder.videoEnabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BridgeRtcCallRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callee
     */
    public String getCallee() {
        return this.callee;
    }

    /**
     * @return caller
     */
    public String getCaller() {
        return this.caller;
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
     * @return serviceProvider
     */
    public String getServiceProvider() {
        return this.serviceProvider;
    }

    /**
     * @return tags
     */
    public String getTags() {
        return this.tags;
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

    /**
     * @return videoEnabled
     */
    public Boolean getVideoEnabled() {
        return this.videoEnabled;
    }

    public static final class Builder extends Request.Builder<BridgeRtcCallRequest, Builder> {
        private String callee; 
        private String caller; 
        private String deviceId; 
        private String instanceId; 
        private String serviceProvider; 
        private String tags; 
        private Integer timeoutSeconds; 
        private String userId; 
        private Boolean videoEnabled; 

        private Builder() {
            super();
        } 

        private Builder(BridgeRtcCallRequest request) {
            super(request);
            this.callee = request.callee;
            this.caller = request.caller;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.serviceProvider = request.serviceProvider;
            this.tags = request.tags;
            this.timeoutSeconds = request.timeoutSeconds;
            this.userId = request.userId;
            this.videoEnabled = request.videoEnabled;
        } 

        /**
         * Callee.
         */
        public Builder callee(String callee) {
            this.putQueryParameter("Callee", callee);
            this.callee = callee;
            return this;
        }

        /**
         * Caller.
         */
        public Builder caller(String caller) {
            this.putQueryParameter("Caller", caller);
            this.caller = caller;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ServiceProvider.
         */
        public Builder serviceProvider(String serviceProvider) {
            this.putQueryParameter("ServiceProvider", serviceProvider);
            this.serviceProvider = serviceProvider;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(String tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
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

        /**
         * VideoEnabled.
         */
        public Builder videoEnabled(Boolean videoEnabled) {
            this.putQueryParameter("VideoEnabled", videoEnabled);
            this.videoEnabled = videoEnabled;
            return this;
        }

        @Override
        public BridgeRtcCallRequest build() {
            return new BridgeRtcCallRequest(this);
        } 

    } 

}
