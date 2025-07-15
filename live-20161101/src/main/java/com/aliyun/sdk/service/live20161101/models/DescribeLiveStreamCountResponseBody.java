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
 * {@link DescribeLiveStreamCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamCountResponseBody</p>
 */
public class DescribeLiveStreamCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamCountInfos")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeLiveStreamCountResponseBody model) {
            this.requestId = model.requestId;
            this.streamCountInfos = model.streamCountInfos;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>FCFFE4A4-F34F-4EEF-B401-36A01689AFBC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics of the live streams.</p>
         */
        public Builder streamCountInfos(StreamCountInfos streamCountInfos) {
            this.streamCountInfos = streamCountInfos;
            return this;
        }

        public DescribeLiveStreamCountResponseBody build() {
            return new DescribeLiveStreamCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamCountResponseBody</p>
     */
    public static class StreamCountDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("VideoDataRate")
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

            private Builder() {
            } 

            private Builder(StreamCountDetail model) {
                this.count = model.count;
                this.format = model.format;
                this.videoDataRate = model.videoDataRate;
            } 

            /**
             * <p>The number of online streams.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The video codec. Valid values:</p>
             * <ul>
             * <li><strong>h264</strong></li>
             * <li><strong>h265</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>h264</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The video bitrate. This parameter is returned only for transcoded streams.</p>
             * 
             * <strong>example:</strong>
             * <p>390</p>
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
    /**
     * 
     * {@link DescribeLiveStreamCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamCountResponseBody</p>
     */
    public static class StreamCountDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StreamCountDetail")
        private java.util.List<StreamCountDetail> streamCountDetail;

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
        public java.util.List<StreamCountDetail> getStreamCountDetail() {
            return this.streamCountDetail;
        }

        public static final class Builder {
            private java.util.List<StreamCountDetail> streamCountDetail; 

            private Builder() {
            } 

            private Builder(StreamCountDetails model) {
                this.streamCountDetail = model.streamCountDetail;
            } 

            /**
             * StreamCountDetail.
             */
            public Builder streamCountDetail(java.util.List<StreamCountDetail> streamCountDetail) {
                this.streamCountDetail = streamCountDetail;
                return this;
            }

            public StreamCountDetails build() {
                return new StreamCountDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamCountResponseBody</p>
     */
    public static class StreamCountInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Limit")
        private Long limit;

        @com.aliyun.core.annotation.NameInMap("StreamCountDetails")
        private StreamCountDetails streamCountDetails;

        @com.aliyun.core.annotation.NameInMap("Type")
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

            private Builder() {
            } 

            private Builder(StreamCountInfo model) {
                this.count = model.count;
                this.limit = model.limit;
                this.streamCountDetails = model.streamCountDetails;
                this.type = model.type;
            } 

            /**
             * <p>The number of online streams.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The maximum allowed number of concurrently ingested streams. This parameter is available only to users in the whitelist.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder limit(Long limit) {
                this.limit = limit;
                return this;
            }

            /**
             * <p>The information about the live streams.</p>
             */
            public Builder streamCountDetails(StreamCountDetails streamCountDetails) {
                this.streamCountDetails = streamCountDetails;
                return this;
            }

            /**
             * <p>The type of the live stream. Valid values:</p>
             * <ul>
             * <li><strong>raw</strong>: source streams</li>
             * <li><strong>trans</strong>: transcoded streams</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>raw</p>
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
    /**
     * 
     * {@link DescribeLiveStreamCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamCountResponseBody</p>
     */
    public static class StreamCountInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StreamCountInfo")
        private java.util.List<StreamCountInfo> streamCountInfo;

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
        public java.util.List<StreamCountInfo> getStreamCountInfo() {
            return this.streamCountInfo;
        }

        public static final class Builder {
            private java.util.List<StreamCountInfo> streamCountInfo; 

            private Builder() {
            } 

            private Builder(StreamCountInfos model) {
                this.streamCountInfo = model.streamCountInfo;
            } 

            /**
             * StreamCountInfo.
             */
            public Builder streamCountInfo(java.util.List<StreamCountInfo> streamCountInfo) {
                this.streamCountInfo = streamCountInfo;
                return this;
            }

            public StreamCountInfos build() {
                return new StreamCountInfos(this);
            } 

        } 

    }
}
