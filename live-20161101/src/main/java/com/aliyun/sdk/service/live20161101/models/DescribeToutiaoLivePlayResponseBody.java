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
 * {@link DescribeToutiaoLivePlayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeToutiaoLivePlayResponseBody</p>
 */
public class DescribeToutiaoLivePlayResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private java.util.List<Content> content;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeToutiaoLivePlayResponseBody(Builder builder) {
        this.content = builder.content;
        this.description = builder.description;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeToutiaoLivePlayResponseBody create() {
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

        private Builder(DescribeToutiaoLivePlayResponseBody model) {
            this.content = model.content;
            this.description = model.description;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the live stream.</p>
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

        public DescribeToutiaoLivePlayResponseBody build() {
            return new DescribeToutiaoLivePlayResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeToutiaoLivePlayResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeToutiaoLivePlayResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("App")
        private String app;

        @com.aliyun.core.annotation.NameInMap("Bandwidth")
        private Float bandwidth;

        @com.aliyun.core.annotation.NameInMap("CdnName")
        private String cdnName;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("PlayNum")
        private Long playNum;

        @com.aliyun.core.annotation.NameInMap("StreamName")
        private String streamName;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        private Content(Builder builder) {
            this.app = builder.app;
            this.bandwidth = builder.bandwidth;
            this.cdnName = builder.cdnName;
            this.domain = builder.domain;
            this.playNum = builder.playNum;
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
         * @return bandwidth
         */
        public Float getBandwidth() {
            return this.bandwidth;
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
         * @return playNum
         */
        public Long getPlayNum() {
            return this.playNum;
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
            private Float bandwidth; 
            private String cdnName; 
            private String domain; 
            private Long playNum; 
            private String streamName; 
            private Long timestamp; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.app = model.app;
                this.bandwidth = model.bandwidth;
                this.cdnName = model.cdnName;
                this.domain = model.domain;
                this.playNum = model.playNum;
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
             * <p>The bandwidth. Unit: Mbit/s.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0801239013671875</p>
             */
            public Builder bandwidth(Float bandwidth) {
                this.bandwidth = bandwidth;
                return this;
            }

            /**
             * <p>The Content Delivery Network (CDN) name.</p>
             * 
             * <strong>example:</strong>
             * <p>ali</p>
             */
            public Builder cdnName(String cdnName) {
                this.cdnName = cdnName;
                return this;
            }

            /**
             * <p>The streaming domain.</p>
             * 
             * <strong>example:</strong>
             * <p>example.com</p>
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * <p>The number of viewers.</p>
             * 
             * <strong>example:</strong>
             * <p>452</p>
             */
            public Builder playNum(Long playNum) {
                this.playNum = playNum;
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

            /**
             * <p>The timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1625484600</p>
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
