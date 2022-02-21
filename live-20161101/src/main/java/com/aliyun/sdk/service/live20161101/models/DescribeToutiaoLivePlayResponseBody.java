// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeToutiaoLivePlayResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeToutiaoLivePlayResponseBody</p>
 */
public class DescribeToutiaoLivePlayResponseBody extends TeaModel {
    @NameInMap("Content")
    private java.util.List < Content> content;

    @NameInMap("Description")
    private String description;

    @NameInMap("RequestId")
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

        public DescribeToutiaoLivePlayResponseBody build() {
            return new DescribeToutiaoLivePlayResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("App")
        private String app;

        @NameInMap("Bandwidth")
        private Float bandwidth;

        @NameInMap("CdnName")
        private String cdnName;

        @NameInMap("Domain")
        private String domain;

        @NameInMap("PlayNum")
        private Long playNum;

        @NameInMap("StreamName")
        private String streamName;

        @NameInMap("Timestamp")
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

            /**
             * App.
             */
            public Builder app(String app) {
                this.app = app;
                return this;
            }

            /**
             * Bandwidth.
             */
            public Builder bandwidth(Float bandwidth) {
                this.bandwidth = bandwidth;
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
             * PlayNum.
             */
            public Builder playNum(Long playNum) {
                this.playNum = playNum;
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
