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
 * {@link UnmuteCallRequest} extends {@link RequestModel}
 *
 * <p>UnmuteCallRequest</p>
 */
public class UnmuteCallRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChannelId")
    private String channelId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeviceId")
    private String deviceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    private UnmuteCallRequest(Builder builder) {
        super(builder);
        this.channelId = builder.channelId;
        this.deviceId = builder.deviceId;
        this.instanceId = builder.instanceId;
        this.jobId = builder.jobId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnmuteCallRequest create() {
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

    public static final class Builder extends Request.Builder<UnmuteCallRequest, Builder> {
        private String channelId; 
        private String deviceId; 
        private String instanceId; 
        private String jobId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(UnmuteCallRequest request) {
            super(request);
            this.channelId = request.channelId;
            this.deviceId = request.deviceId;
            this.instanceId = request.instanceId;
            this.jobId = request.jobId;
            this.userId = request.userId;
        } 

        /**
         * <p>The channel ID to unmute. This parameter is optional and defaults to empty. If empty, the system unmutes the channel associated with the agent specified by UserId.</p>
         * 
         * <strong>example:</strong>
         * <p>ch:user:1390501****-&gt;8032****:1609138902226:job-6538214103685****</p>
         */
        public Builder channelId(String channelId) {
            this.putQueryParameter("ChannelId", channelId);
            this.channelId = channelId;
            return this;
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
         * <p>The call ID.</p>
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
         * <p>The agent ID to unmute. If not specified, defaults to the agent mapped to the current RAM account.</p>
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
        public UnmuteCallRequest build() {
            return new UnmuteCallRequest(this);
        } 

    } 

}
