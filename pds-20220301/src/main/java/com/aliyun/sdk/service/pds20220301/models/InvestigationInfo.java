// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pds20220301.models;

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
 * {@link InvestigationInfo} extends {@link TeaModel}
 *
 * <p>InvestigationInfo</p>
 */
public class InvestigationInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("status")
    private Long status;

    @com.aliyun.core.annotation.NameInMap("suggestion")
    private String suggestion;

    @com.aliyun.core.annotation.NameInMap("video_detail")
    private VideoDetail videoDetail;

    private InvestigationInfo(Builder builder) {
        this.status = builder.status;
        this.suggestion = builder.suggestion;
        this.videoDetail = builder.videoDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InvestigationInfo create() {
        return builder().build();
    }

    /**
     * @return status
     */
    public Long getStatus() {
        return this.status;
    }

    /**
     * @return suggestion
     */
    public String getSuggestion() {
        return this.suggestion;
    }

    /**
     * @return videoDetail
     */
    public VideoDetail getVideoDetail() {
        return this.videoDetail;
    }

    public static final class Builder {
        private Long status; 
        private String suggestion; 
        private VideoDetail videoDetail; 

        /**
         * status.
         */
        public Builder status(Long status) {
            this.status = status;
            return this;
        }

        /**
         * suggestion.
         */
        public Builder suggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }

        /**
         * video_detail.
         */
        public Builder videoDetail(VideoDetail videoDetail) {
            this.videoDetail = videoDetail;
            return this;
        }

        public InvestigationInfo build() {
            return new InvestigationInfo(this);
        } 

    } 

    /**
     * 
     * {@link InvestigationInfo} extends {@link TeaModel}
     *
     * <p>InvestigationInfo</p>
     */
    public static class BlockFrames extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("offset")
        private Long offset;

        @com.aliyun.core.annotation.NameInMap("rate")
        private Double rate;

        private BlockFrames(Builder builder) {
            this.label = builder.label;
            this.offset = builder.offset;
            this.rate = builder.rate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BlockFrames create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return offset
         */
        public Long getOffset() {
            return this.offset;
        }

        /**
         * @return rate
         */
        public Double getRate() {
            return this.rate;
        }

        public static final class Builder {
            private String label; 
            private Long offset; 
            private Double rate; 

            /**
             * label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * offset.
             */
            public Builder offset(Long offset) {
                this.offset = offset;
                return this;
            }

            /**
             * rate.
             */
            public Builder rate(Double rate) {
                this.rate = rate;
                return this;
            }

            public BlockFrames build() {
                return new BlockFrames(this);
            } 

        } 

    }
    /**
     * 
     * {@link InvestigationInfo} extends {@link TeaModel}
     *
     * <p>InvestigationInfo</p>
     */
    public static class VideoDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("block_frames")
        private java.util.List<BlockFrames> blockFrames;

        private VideoDetail(Builder builder) {
            this.blockFrames = builder.blockFrames;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VideoDetail create() {
            return builder().build();
        }

        /**
         * @return blockFrames
         */
        public java.util.List<BlockFrames> getBlockFrames() {
            return this.blockFrames;
        }

        public static final class Builder {
            private java.util.List<BlockFrames> blockFrames; 

            /**
             * block_frames.
             */
            public Builder blockFrames(java.util.List<BlockFrames> blockFrames) {
                this.blockFrames = blockFrames;
                return this;
            }

            public VideoDetail build() {
                return new VideoDetail(this);
            } 

        } 

    }
}
