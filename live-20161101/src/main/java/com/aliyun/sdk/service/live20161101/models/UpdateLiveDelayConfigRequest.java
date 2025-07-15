// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link UpdateLiveDelayConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveDelayConfigRequest</p>
 */
public class UpdateLiveDelayConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("App")
    @com.aliyun.core.annotation.Validation(required = true)
    private String app;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelayTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer delayTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Stream")
    @com.aliyun.core.annotation.Validation(required = true)
    private String stream;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TaskTriggerMode")
    private String taskTriggerMode;

    private UpdateLiveDelayConfigRequest(Builder builder) {
        super(builder);
        this.app = builder.app;
        this.delayTime = builder.delayTime;
        this.domain = builder.domain;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.stream = builder.stream;
        this.taskTriggerMode = builder.taskTriggerMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveDelayConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return app
     */
    public String getApp() {
        return this.app;
    }

    /**
     * @return delayTime
     */
    public Integer getDelayTime() {
        return this.delayTime;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stream
     */
    public String getStream() {
        return this.stream;
    }

    /**
     * @return taskTriggerMode
     */
    public String getTaskTriggerMode() {
        return this.taskTriggerMode;
    }

    public static final class Builder extends Request.Builder<UpdateLiveDelayConfigRequest, Builder> {
        private String app; 
        private Integer delayTime; 
        private String domain; 
        private Long ownerId; 
        private String regionId; 
        private String stream; 
        private String taskTriggerMode; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveDelayConfigRequest request) {
            super(request);
            this.app = request.app;
            this.delayTime = request.delayTime;
            this.domain = request.domain;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.stream = request.stream;
            this.taskTriggerMode = request.taskTriggerMode;
        } 

        /**
         * <p>The name of the application to which the live stream belongs. You can specify an asterisk (*) as the value to match all applications that belong to the domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder app(String app) {
            this.putQueryParameter("App", app);
            this.app = app;
            return this;
        }

        /**
         * <p>The duration for which the playback of the live stream is delayed. The value must be an integer. Valid values: 16 to 3600. Unit: seconds.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder delayTime(Integer delayTime) {
            this.putQueryParameter("DelayTime", delayTime);
            this.delayTime = delayTime;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the live stream. You can use the wildcard (*) to specify all streams of the application.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        public Builder stream(String stream) {
            this.putQueryParameter("Stream", stream);
            this.stream = stream;
            return this;
        }

        /**
         * <p>The trigger mode. Valid values:</p>
         * <ul>
         * <li><strong>PUBLISH_ONLY</strong>: Stream delay can be triggered only by specifying the stream delay parameter in the ingest URL.</li>
         * <li><strong>CONFIG_ONLY</strong>: Stream delay can be triggered only by the stream delay configuration.</li>
         * <li><strong>PUBLISH_CONFIG</strong>: Stream delay can be triggered by the stream delay parameter in the ingest URL or the stream delay configuration. The stream delay parameter takes precedence over the stream delay configuration.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLISH_ONLY</p>
         */
        public Builder taskTriggerMode(String taskTriggerMode) {
            this.putQueryParameter("TaskTriggerMode", taskTriggerMode);
            this.taskTriggerMode = taskTriggerMode;
            return this;
        }

        @Override
        public UpdateLiveDelayConfigRequest build() {
            return new UpdateLiveDelayConfigRequest(this);
        } 

    } 

}
