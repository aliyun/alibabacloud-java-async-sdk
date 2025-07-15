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
 * {@link DescribeToutiaoLivePublishResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeToutiaoLivePublishResponseBody</p>
 */
public class DescribeToutiaoLivePublishResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List<Content> content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public java.util.List<Content> getContent() {
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
        private java.util.List<Content> content; 
        private String description; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeToutiaoLivePublishResponseBody model) {
            this.content = model.content;
            this.description = model.description;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The stream ingest details.</p>
         */
        public Builder content(java.util.List<Content> content) {
            this.content = content;
            return this;
        }

        /**
         * <p>The description of the response status.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16A96B9A-F203-4EC5-8E43-CB92E68F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeToutiaoLivePublishResponseBody build() {
            return new DescribeToutiaoLivePublishResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeToutiaoLivePublishResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeToutiaoLivePublishResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
        private String app;

        @com.aliyun.core.annotation.NameInMap("Bitrate")
        private Float bitrate;

        @com.aliyun.core.annotation.NameInMap("BwDiff")
        private Float bwDiff;

        @com.aliyun.core.annotation.NameInMap("CdnName")
        private String cdnName;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("Flr")
        private Float flr;

        @com.aliyun.core.annotation.NameInMap("Fps")
        private Float fps;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
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

            private Builder() {
            } 

            private Builder(Content model) {
                this.app = model.app;
                this.bitrate = model.bitrate;
                this.bwDiff = model.bwDiff;
                this.cdnName = model.cdnName;
                this.domain = model.domain;
                this.flr = model.flr;
                this.fps = model.fps;
                this.streamName = model.streamName;
                this.timestamp = model.timestamp;
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
             * <p>The bitrate. Unit: bit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>261587</p>
             */
            public Builder bitrate(Float bitrate) {
                this.bitrate = bitrate;
                return this;
            }

            /**
             * <p>The bitrate difference.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder bwDiff(Float bwDiff) {
                this.bwDiff = bwDiff;
                return this;
            }

            /**
             * <p>The name of the content delivery network (CDN) service.</p>
             * 
             * <strong>example:</strong>
             * <p>ali</p>
             */
            public Builder cdnName(String cdnName) {
                this.cdnName = cdnName;
                return this;
            }

            /**
             * <p>The ingest domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The number of dropped frames.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder flr(Float flr) {
                this.flr = flr;
                return this;
            }

            /**
             * <p>The frame rate.</p>
             * 
             * <strong>example:</strong>
             * <p>74.4</p>
             */
            public Builder fps(Float fps) {
                this.fps = fps;
                return this;
            }

            /**
             * <p>The name of the ingested stream.</p>
             * 
             * <strong>example:</strong>
             * <p>liveStream****</p>
             */
            public Builder streamName(String streamName) {
                this.streamName = streamName;
                return this;
            }

            /**
             * <p>The timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1624358970</p>
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
