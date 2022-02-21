// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamCountResponseBody</p>
 */
public class DescribeLiveStreamCountResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("StreamCountInfos")
    private StreamCountInfos streamCountInfos;

    private DescribeLiveStreamCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.streamCountInfos = builder.streamCountInfos;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamCountResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return streamCountInfos
     */
    public StreamCountInfos getStreamCountInfos() {
        return this.streamCountInfos;
    }

    public static final class Builder {
        private String requestId; 
        private StreamCountInfos streamCountInfos; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StreamCountInfos.
         */
        public Builder streamCountInfos(StreamCountInfos streamCountInfos) {
            this.streamCountInfos = streamCountInfos;
            return this;
        }

        public DescribeLiveStreamCountResponseBody build() {
            return new DescribeLiveStreamCountResponseBody(this);
        } 

    } 

    public static class StreamCountDetail extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Format")
        private String format;

        @NameInMap("VideoDataRate")
        private Long videoDataRate;

        private StreamCountDetail(Builder builder) {
            this.count = builder.count;
            this.format = builder.format;
            this.videoDataRate = builder.videoDataRate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamCountDetail create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return videoDataRate
         */
        public Long getVideoDataRate() {
            return this.videoDataRate;
        }

        public static final class Builder {
            private Long count; 
            private String format; 
            private Long videoDataRate; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * VideoDataRate.
             */
            public Builder videoDataRate(Long videoDataRate) {
                this.videoDataRate = videoDataRate;
                return this;
            }

            public StreamCountDetail build() {
                return new StreamCountDetail(this);
            } 

        } 

    }
    public static class StreamCountDetails extends TeaModel {
        @NameInMap("StreamCountDetail")
        private java.util.List < StreamCountDetail> streamCountDetail;

        private StreamCountDetails(Builder builder) {
            this.streamCountDetail = builder.streamCountDetail;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamCountDetails create() {
            return builder().build();
        }

        /**
         * @return streamCountDetail
         */
        public java.util.List < StreamCountDetail> getStreamCountDetail() {
            return this.streamCountDetail;
        }

        public static final class Builder {
            private java.util.List < StreamCountDetail> streamCountDetail; 

            /**
             * StreamCountDetail.
             */
            public Builder streamCountDetail(java.util.List < StreamCountDetail> streamCountDetail) {
                this.streamCountDetail = streamCountDetail;
                return this;
            }

            public StreamCountDetails build() {
                return new StreamCountDetails(this);
            } 

        } 

    }
    public static class StreamCountInfo extends TeaModel {
        @NameInMap("Count")
        private Long count;

        @NameInMap("Limit")
        private Long limit;

        @NameInMap("StreamCountDetails")
        private StreamCountDetails streamCountDetails;

        @NameInMap("Type")
        private String type;

        private StreamCountInfo(Builder builder) {
            this.count = builder.count;
            this.limit = builder.limit;
            this.streamCountDetails = builder.streamCountDetails;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamCountInfo create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return limit
         */
        public Long getLimit() {
            return this.limit;
        }

        /**
         * @return streamCountDetails
         */
        public StreamCountDetails getStreamCountDetails() {
            return this.streamCountDetails;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long count; 
            private Long limit; 
            private StreamCountDetails streamCountDetails; 
            private String type; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Limit.
             */
            public Builder limit(Long limit) {
                this.limit = limit;
                return this;
            }

            /**
             * StreamCountDetails.
             */
            public Builder streamCountDetails(StreamCountDetails streamCountDetails) {
                this.streamCountDetails = streamCountDetails;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public StreamCountInfo build() {
                return new StreamCountInfo(this);
            } 

        } 

    }
    public static class StreamCountInfos extends TeaModel {
        @NameInMap("StreamCountInfo")
        private java.util.List < StreamCountInfo> streamCountInfo;

        private StreamCountInfos(Builder builder) {
            this.streamCountInfo = builder.streamCountInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamCountInfos create() {
            return builder().build();
        }

        /**
         * @return streamCountInfo
         */
        public java.util.List < StreamCountInfo> getStreamCountInfo() {
            return this.streamCountInfo;
        }

        public static final class Builder {
            private java.util.List < StreamCountInfo> streamCountInfo; 

            /**
             * StreamCountInfo.
             */
            public Builder streamCountInfo(java.util.List < StreamCountInfo> streamCountInfo) {
                this.streamCountInfo = streamCountInfo;
                return this;
            }

            public StreamCountInfos build() {
                return new StreamCountInfos(this);
            } 

        } 

    }
}
