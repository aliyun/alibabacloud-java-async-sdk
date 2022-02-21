// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveShiftConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveShiftConfigsResponseBody</p>
 */
public class DescribeLiveShiftConfigsResponseBody extends TeaModel {
    @NameInMap("Content")
    private Content content;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeLiveShiftConfigsResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveShiftConfigsResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Content content; 
        private String requestId; 

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveShiftConfigsResponseBody build() {
            return new DescribeLiveShiftConfigsResponseBody(this);
        } 

    } 

    public static class Config extends TeaModel {
        @NameInMap("AppName")
        private String appName;

        @NameInMap("DomainName")
        private String domainName;

        @NameInMap("IgnoreTranscode")
        private Boolean ignoreTranscode;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("Vision")
        private Integer vision;

        private Config(Builder builder) {
            this.appName = builder.appName;
            this.domainName = builder.domainName;
            this.ignoreTranscode = builder.ignoreTranscode;
            this.streamName = builder.streamName;
            this.vision = builder.vision;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return domainName
         */
        public String getDomainName() {
            return this.domainName;
        }

        /**
         * @return ignoreTranscode
         */
        public Boolean getIgnoreTranscode() {
            return this.ignoreTranscode;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return vision
         */
        public Integer getVision() {
            return this.vision;
        }

        public static final class Builder {
            private String appName; 
            private String domainName; 
            private Boolean ignoreTranscode; 
            private String streamName; 
            private Integer vision; 

            /**
             * AppName.
             */
            public Builder appName(String appName) {
                this.appName = appName;
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
             * IgnoreTranscode.
             */
            public Builder ignoreTranscode(Boolean ignoreTranscode) {
                this.ignoreTranscode = ignoreTranscode;
                return this;
            }

            /**
             * StreamName.
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * Vision.
             */
            public Builder vision(Integer vision) {
                this.vision = vision;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class Content extends TeaModel {
        @NameInMap("Config")
        private java.util.List < Config> config;

        private Content(Builder builder) {
            this.config = builder.config;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public java.util.List < Config> getConfig() {
            return this.config;
        }

        public static final class Builder {
            private java.util.List < Config> config; 

            /**
             * Config.
             */
            public Builder config(java.util.List < Config> config) {
                this.config = config;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
