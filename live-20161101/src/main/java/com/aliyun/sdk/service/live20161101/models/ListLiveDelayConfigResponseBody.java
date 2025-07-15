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
 * {@link ListLiveDelayConfigResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveDelayConfigResponseBody</p>
 */
public class ListLiveDelayConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DelayConfigList")
    private DelayConfigList delayConfigList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Integer total;

    private ListLiveDelayConfigResponseBody(Builder builder) {
        this.delayConfigList = builder.delayConfigList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveDelayConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return delayConfigList
     */
    public DelayConfigList getDelayConfigList() {
        return this.delayConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private DelayConfigList delayConfigList; 
        private String requestId; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListLiveDelayConfigResponseBody model) {
            this.delayConfigList = model.delayConfigList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The stream delay configurations.</p>
         */
        public Builder delayConfigList(DelayConfigList delayConfigList) {
            this.delayConfigList = delayConfigList;
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
         * <p>The number of stream delay configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListLiveDelayConfigResponseBody build() {
            return new ListLiveDelayConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLiveDelayConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveDelayConfigResponseBody</p>
     */
    public static class DelayConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
        private String app;

        @com.aliyun.core.annotation.NameInMap("DelayTime")
        private String delayTime;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Stream")
        private String stream;

        @com.aliyun.core.annotation.NameInMap("TaskTriggerMode")
        private String taskTriggerMode;

        private DelayConfig(Builder builder) {
            this.app = builder.app;
            this.delayTime = builder.delayTime;
            this.domain = builder.domain;
            this.stream = builder.stream;
            this.taskTriggerMode = builder.taskTriggerMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelayConfig create() {
            return builder().build();
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
            private String stream; 
            private String taskTriggerMode; 

            private Builder() {
            } 

            private Builder(DelayConfig model) {
                this.app = model.app;
                this.delayTime = model.delayTime;
                this.domain = model.domain;
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
             * <p>The duration for which the playback of the live stream is delayed. Unit: seconds.</p>
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

            public DelayConfig build() {
                return new DelayConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListLiveDelayConfigResponseBody} extends {@link TeaModel}
     *
     * <p>ListLiveDelayConfigResponseBody</p>
     */
    public static class DelayConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DelayConfig")
        private java.util.List<DelayConfig> delayConfig;

        private DelayConfigList(Builder builder) {
            this.delayConfig = builder.delayConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelayConfigList create() {
            return builder().build();
        }

        /**
         * @return delayConfig
         */
        public java.util.List<DelayConfig> getDelayConfig() {
            return this.delayConfig;
        }

        public static final class Builder {
            private java.util.List<DelayConfig> delayConfig; 

            private Builder() {
            } 

            private Builder(DelayConfigList model) {
                this.delayConfig = model.delayConfig;
            } 

            /**
             * DelayConfig.
             */
            public Builder delayConfig(java.util.List<DelayConfig> delayConfig) {
                this.delayConfig = delayConfig;
                return this;
            }

            public DelayConfigList build() {
                return new DelayConfigList(this);
            } 

        } 

    }
}
