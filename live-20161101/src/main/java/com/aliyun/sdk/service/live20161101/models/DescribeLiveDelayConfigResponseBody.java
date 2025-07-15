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
 * {@link DescribeLiveDelayConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveDelayConfigResponseBody</p>
 */
public class DescribeLiveDelayConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("App")
    private String app;

    @com.aliyun.core.annotation.NameInMap("DelayTime")
    private String delayTime;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Stream")
    private String stream;

    @com.aliyun.core.annotation.NameInMap("TaskTriggerMode")
    private String taskTriggerMode;

    private DescribeLiveDelayConfigResponseBody(Builder builder) {
        this.app = builder.app;
        this.delayTime = builder.delayTime;
        this.domain = builder.domain;
        this.requestId = builder.requestId;
        this.stream = builder.stream;
        this.taskTriggerMode = builder.taskTriggerMode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveDelayConfigResponseBody create() {
        return builder().build();
    }

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
    public String getDelayTime() {
        return this.delayTime;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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

    public static final class Builder {
        private String app; 
        private String delayTime; 
        private String domain; 
        private String requestId; 
        private String stream; 
        private String taskTriggerMode; 

        private Builder() {
        } 

        private Builder(DescribeLiveDelayConfigResponseBody model) {
            this.app = model.app;
            this.delayTime = model.delayTime;
            this.domain = model.domain;
            this.requestId = model.requestId;
            this.stream = model.stream;
            this.taskTriggerMode = model.taskTriggerMode;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder app(String app) {
            this.app = app;
            return this;
        }

        /**
         * <p>The duration for which the playback of the live stream is delayed.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        public Builder delayTime(String delayTime) {
            this.delayTime = delayTime;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A3136B58-5876-4168-83CA-B562781981A0</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The name of the live stream.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        public Builder stream(String stream) {
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
            this.taskTriggerMode = taskTriggerMode;
            return this;
        }

        public DescribeLiveDelayConfigResponseBody build() {
            return new DescribeLiveDelayConfigResponseBody(this);
        } 

    } 

}
