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
 * {@link DescribeLiveShiftConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveShiftConfigsResponseBody</p>
 */
public class DescribeLiveShiftConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveShiftConfigsResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The time shifting configurations.</p>
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>B49E6DDA-F413-422B-B58E-2FA23F286726</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeLiveShiftConfigsResponseBody build() {
            return new DescribeLiveShiftConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveShiftConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveShiftConfigsResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("DomainName")
        private String domainName;

        @com.aliyun.core.annotation.NameInMap("IgnoreTranscode")
        private Boolean ignoreTranscode;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("Vision")
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

            private Builder() {
            } 

            private Builder(Config model) {
                this.appName = model.appName;
                this.domainName = model.domainName;
                this.ignoreTranscode = model.ignoreTranscode;
                this.streamName = model.streamName;
                this.vision = model.vision;
            } 

            /**
             * <p>The application for which you configure time shifting.</p>
             * 
             * <strong>example:</strong>
             * <p>liveApp****</p>
             */
            public Builder appName(String appName) {
                this.appName = appName;
                return this;
            }

            /**
             * <p>The domain name for which you configure time shifting.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domainName(String domainName) {
                this.domainName = domainName;
                return this;
            }

            /**
             * <p>Whether to ignore time shift generation for the transcode stream.</p>
             * <ul>
             * <li>true: Ignore time shifting generation.</li>
             * <li>false: Generate time shifting.</li>
             * </ul>
             * <p>The default value is true.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder ignoreTranscode(Boolean ignoreTranscode) {
                this.ignoreTranscode = ignoreTranscode;
                return this;
            }

            /**
             * <p>The name of the live stream for which you configure time shifting.</p>
             * 
             * <strong>example:</strong>
             * <p>liveStream****</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The number of days for which the time shifting configurations are retained.</p>
             * 
             * <strong>example:</strong>
             * <p>7</p>
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
    /**
     * 
     * {@link DescribeLiveShiftConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveShiftConfigsResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private java.util.List<Config> config;

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
        public java.util.List<Config> getConfig() {
            return this.config;
        }

        public static final class Builder {
            private java.util.List<Config> config; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.config = model.config;
            } 

            /**
             * Config.
             */
            public Builder config(java.util.List<Config> config) {
                this.config = config;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
