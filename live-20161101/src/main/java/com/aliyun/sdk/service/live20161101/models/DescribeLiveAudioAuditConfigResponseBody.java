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
 * {@link DescribeLiveAudioAuditConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveAudioAuditConfigResponseBody</p>
 */
public class DescribeLiveAudioAuditConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("LiveAudioAuditConfigList")
    private LiveAudioAuditConfigList liveAudioAuditConfigList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeLiveAudioAuditConfigResponseBody(Builder builder) {
        this.liveAudioAuditConfigList = builder.liveAudioAuditConfigList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveAudioAuditConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveAudioAuditConfigList
     */
    public LiveAudioAuditConfigList getLiveAudioAuditConfigList() {
        return this.liveAudioAuditConfigList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private LiveAudioAuditConfigList liveAudioAuditConfigList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeLiveAudioAuditConfigResponseBody model) {
            this.liveAudioAuditConfigList = model.liveAudioAuditConfigList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of audio moderation configurations.</p>
         */
        public Builder liveAudioAuditConfigList(LiveAudioAuditConfigList liveAudioAuditConfigList) {
            this.liveAudioAuditConfigList = liveAudioAuditConfigList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7BF95F2A-3B24-4CDE-9346-7F6FA86697A1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveAudioAuditConfigResponseBody build() {
            return new DescribeLiveAudioAuditConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveAudioAuditConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAudioAuditConfigResponseBody</p>
     */
    public static class Scenes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("scene")
        private java.util.List<String> scene;

        private Scenes(Builder builder) {
            this.scene = builder.scene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenes create() {
            return builder().build();
        }

        /**
         * @return scene
         */
        public java.util.List<String> getScene() {
            return this.scene;
        }

        public static final class Builder {
            private java.util.List<String> scene; 

            private Builder() {
            } 

            private Builder(Scenes model) {
                this.scene = model.scene;
            } 

            /**
             * scene.
             */
            public Builder scene(java.util.List<String> scene) {
                this.scene = scene;
                return this;
            }

            public Scenes build() {
                return new Scenes(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveAudioAuditConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAudioAuditConfigResponseBody</p>
     */
    public static class LiveAudioAuditConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("Scenes")
        private Scenes scenes;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        private LiveAudioAuditConfig(Builder builder) {
            this.appName = builder.appName;
            this.bizType = builder.bizType;
            this.domainName = builder.domainName;
            this.scenes = builder.scenes;
            this.streamName = builder.streamName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveAudioAuditConfig create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return scenes
         */
        public Scenes getScenes() {
            return this.scenes;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        public static final class Builder {
            private String appName; 
            private String bizType; 
            private String domainName; 
            private Scenes scenes; 
            private String streamName; 

            private Builder() {
            } 

            private Builder(LiveAudioAuditConfig model) {
                this.appName = model.appName;
                this.bizType = model.bizType;
                this.domainName = model.domainName;
                this.scenes = model.scenes;
                this.streamName = model.streamName;
            } 

            /**
             * <p>The name of the application to which the live stream belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The business type. You can specify a model. The default value is the domain name.</p>
             * 
             * <strong>example:</strong>
             * <p>example.edu</p>
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * <p>The main streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>The moderation scenarios.</p>
             */
            public Builder scenes(Scenes scenes) {
                this.scenes = scenes;
                return this;
            }

            /**
             * <p>The name of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>liveStream****</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            public LiveAudioAuditConfig build() {
                return new LiveAudioAuditConfig(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveAudioAuditConfigResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveAudioAuditConfigResponseBody</p>
     */
    public static class LiveAudioAuditConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LiveAudioAuditConfig")
        private java.util.List<LiveAudioAuditConfig> liveAudioAuditConfig;

        private LiveAudioAuditConfigList(Builder builder) {
            this.liveAudioAuditConfig = builder.liveAudioAuditConfig;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LiveAudioAuditConfigList create() {
            return builder().build();
        }

        /**
         * @return liveAudioAuditConfig
         */
        public java.util.List<LiveAudioAuditConfig> getLiveAudioAuditConfig() {
            return this.liveAudioAuditConfig;
        }

        public static final class Builder {
            private java.util.List<LiveAudioAuditConfig> liveAudioAuditConfig; 

            private Builder() {
            } 

            private Builder(LiveAudioAuditConfigList model) {
                this.liveAudioAuditConfig = model.liveAudioAuditConfig;
            } 

            /**
             * LiveAudioAuditConfig.
             */
            public Builder liveAudioAuditConfig(java.util.List<LiveAudioAuditConfig> liveAudioAuditConfig) {
                this.liveAudioAuditConfig = liveAudioAuditConfig;
                return this;
            }

            public LiveAudioAuditConfigList build() {
                return new LiveAudioAuditConfigList(this);
            } 

        } 

    }
}
