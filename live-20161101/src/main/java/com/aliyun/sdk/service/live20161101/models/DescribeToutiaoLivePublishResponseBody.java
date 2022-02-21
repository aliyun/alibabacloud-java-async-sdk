// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeToutiaoLivePublishResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeToutiaoLivePublishResponseBody</p>
 */
public class DescribeToutiaoLivePublishResponseBody extends TeaModel {
    @NameInMap("Content")
    private java.util.List < Content> content;

    @NameInMap("Description")
    private String description;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeToutiaoLivePublishResponseBody(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeToutiaoLivePublishResponseBody create() {
        return builder().build();
    }

    /**
     * @return content
     */
    public java.util.List < Content> getContent() {
        return this.content;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Content> content; 
        private String description; 
        private String requestId; 

        /**
         * Content.
         */
        public Builder content(java.util.List < Content> content) {
            this.content = content;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeToutiaoLivePublishResponseBody build() {
            return new DescribeToutiaoLivePublishResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("App")
        private String app;

        @NameInMap("Bitrate")
        private Float bitrate;

        @NameInMap("BwDiff")
        private Float bwDiff;

        @NameInMap("CdnName")
        private String cdnName;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("Flr")
        private Float flr;

        @NameInMap("Fps")
        private Float fps;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("Timestamp")
        private Long timestamp;

        private Content(Builder builder) {
            this.app = builder.app;
            this.bitrate = builder.bitrate;
            this.bwDiff = builder.bwDiff;
            this.cdnName = builder.cdnName;
            this.domain = builder.domain;
            this.flr = builder.flr;
            this.fps = builder.fps;
            this.streamName = builder.streamName;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return app
         */
        public String getApp() {
            return this.app;
        }

        /**
         * @return bitrate
         */
        public Float getBitrate() {
            return this.bitrate;
        }

        /**
         * @return bwDiff
         */
        public Float getBwDiff() {
            return this.bwDiff;
        }

        /**
         * @return cdnName
         */
        public String getCdnName() {
            return this.cdnName;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return flr
         */
        public Float getFlr() {
            return this.flr;
        }

        /**
         * @return fps
         */
        public Float getFps() {
            return this.fps;
        }

        /**
         * @return streamName
         */
        public String getStreamName() {
            return this.streamName;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private String app; 
            private Float bitrate; 
            private Float bwDiff; 
            private String cdnName; 
            private String domain; 
            private Float flr; 
            private Float fps; 
            private String streamName; 
            private Long timestamp; 

            /**
             * App.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * Bitrate.
             */
            public Builder bitrate(Float bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * BwDiff.
             */
            public Builder bwDiff(Float bwDiff) {
                this.bwDiff = bwDiff;
                return this;
            }

            /**
             * CdnName.
             */
            public Builder cdnName(String cdnName) {
                this.cdnName = cdnName;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * Flr.
             */
            public Builder flr(Float flr) {
                this.flr = flr;
                return this;
            }

            /**
             * Fps.
             */
            public Builder fps(Float fps) {
                this.fps = fps;
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
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
