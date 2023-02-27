// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MakeCallRequest} extends {@link RequestModel}
 *
 * <p>MakeCallRequest</p>
 */
public class MakeCallRequest extends Request {
    @Query
    @NameInMap("Callee")
    @Validation(required = true)
    private String callee;

    @Query
    @NameInMap("Caller")
    private String caller;

    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("MaskedCallee")
    private String maskedCallee;

    @Query
    @NameInMap("Tags")
    private String tags;

    @Query
    @NameInMap("TimeoutSeconds")
    @Validation(maximum = 300, minimum = 30)
    private Integer timeoutSeconds;

    @Query
    @NameInMap("UserId")
    private String userId;

    private MakeCallRequest(Builder builder) {
        super(builder);
        this.callee = builder.callee;
        this.caller = builder.caller;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.maskedCallee = builder.maskedCallee;
        this.tags = builder.tags;
        this.timeoutSeconds = builder.timeoutSeconds;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MakeCallRequest create() {
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
     * @return maskedCallee
     */
    public String getMaskedCallee() {
        return this.maskedCallee;
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

    public static final class Builder extends Request.Builder<MakeCallRequest, Builder> {
        private String callee; 
        private String caller; 
        private String deviceId; 
        private String instanceId; 
        private String maskedCallee; 
        private String tags; 
        private Integer timeoutSeconds; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(MakeCallRequest request) {
            super(request);
            this.callee = request.callee;
            this.caller = request.caller;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.maskedCallee = request.maskedCallee;
            this.tags = request.tags;
            this.timeoutSeconds = request.timeoutSeconds;
            this.userId = request.userId;
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
         * MaskedCallee.
         */
        public Builder maskedCallee(String maskedCallee) {
            this.putQueryParameter("MaskedCallee", maskedCallee);
            this.maskedCallee = maskedCallee;
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

        @Override
        public MakeCallRequest build() {
            return new MakeCallRequest(this);
        } 

    } 

}
