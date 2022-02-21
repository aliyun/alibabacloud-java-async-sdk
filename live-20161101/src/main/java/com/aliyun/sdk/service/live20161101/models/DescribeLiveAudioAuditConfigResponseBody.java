// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveAudioAuditConfigResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveAudioAuditConfigResponseBody</p>
 */
public class DescribeLiveAudioAuditConfigResponseBody extends TeaModel {
    @NameInMap("LiveAudioAuditConfigList")
    private LiveAudioAuditConfigList liveAudioAuditConfigList;

    @NameInMap("RequestId")
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

        /**
         * LiveAudioAuditConfigList.
         */
        public Builder liveAudioAuditConfigList(LiveAudioAuditConfigList liveAudioAuditConfigList) {
            this.liveAudioAuditConfigList = liveAudioAuditConfigList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveAudioAuditConfigResponseBody build() {
            return new DescribeLiveAudioAuditConfigResponseBody(this);
        } 

    } 

    public static class Scenes extends TeaModel {
        @NameInMap("scene")
        private java.util.List < String > scene;

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
        public java.util.List < String > getScene() {
            return this.scene;
        }

        public static final class Builder {
            private java.util.List < String > scene; 

            /**
             * scene.
             */
            public Builder scene(java.util.List < String > scene) {
                this.scene = scene;
                return this;
            }

            public Scenes build() {
                return new Scenes(this);
            } 

        } 

    }
    public static class LiveAudioAuditConfig extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("BizType")
        private String bizType;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("Scenes")
        private Scenes scenes;

        @NameInMap("StreamName")
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

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
                return this;
            }

            /**
             * DomainName.
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * Scenes.
             */
            public Builder scenes(Scenes scenes) {
                this.scenes = scenes;
                return this;
            }

            /**
             * StreamName.
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
    public static class LiveAudioAuditConfigList extends TeaModel {
        @NameInMap("LiveAudioAuditConfig")
        private java.util.List < LiveAudioAuditConfig> liveAudioAuditConfig;

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
        public java.util.List < LiveAudioAuditConfig> getLiveAudioAuditConfig() {
            return this.liveAudioAuditConfig;
        }

        public static final class Builder {
            private java.util.List < LiveAudioAuditConfig> liveAudioAuditConfig; 

            /**
             * LiveAudioAuditConfig.
             */
            public Builder liveAudioAuditConfig(java.util.List < LiveAudioAuditConfig> liveAudioAuditConfig) {
                this.liveAudioAuditConfig = liveAudioAuditConfig;
                return this;
            }

            public LiveAudioAuditConfigList build() {
                return new LiveAudioAuditConfigList(this);
            } 

        } 

    }
}
