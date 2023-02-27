// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SendDtmfSignalingRequest} extends {@link RequestModel}
 *
 * <p>SendDtmfSignalingRequest</p>
 */
public class SendDtmfSignalingRequest extends Request {
    @Query
    @NameInMap("ChannelId")
    @Validation(required = true)
    private String channelId;

    @Query
    @NameInMap("DeviceId")
    @Validation(required = true)
    private String deviceId;

    @Query
    @NameInMap("Dtmf")
    @Validation(required = true, maxLength = 1000000)
    private String dtmf;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("JobId")
    @Validation(required = true)
    private String jobId;

    @Query
    @NameInMap("UserId")
    private String userId;

    private SendDtmfSignalingRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.deviceId = builder.deviceId;
        this.dtmf = builder.dtmf;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SendDtmfSignalingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return channelId
     */
    public String getChannelId() {
        return this.channelId;
    }

    /**
     * @return deviceId
     */
    public String getDeviceId() {
        return this.deviceId;
    }

    /**
     * @return dtmf
     */
    public String getDtmf() {
        return this.dtmf;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<SendDtmfSignalingRequest, Builder> {
        private String channelId; 
        private String deviceId; 
        private String dtmf; 
        private String instanceId; 
        private String jobId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(SendDtmfSignalingRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.deviceId = request.deviceId;
            this.dtmf = request.dtmf;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.userId = request.userId;
        } 

        /**
         * ChannelId.
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
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
         * Dtmf.
         */
        public Builder dtmf(String dtmf) {
            this.putQueryParameter("Dtmf", dtmf);
            this.dtmf = dtmf;
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
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.putQueryParameter("JobId", jobId);
            this.jobId = jobId;
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
        public SendDtmfSignalingRequest build() {
            return new SendDtmfSignalingRequest(this);
        } 

    } 

}
