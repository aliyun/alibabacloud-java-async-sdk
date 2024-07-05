// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchResumeVsStreamResponseBody} extends {@link TeaModel}
 *
 * <p>BatchResumeVsStreamResponseBody</p>
 */
public class BatchResumeVsStreamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResumeResult")
    private ResumeResult resumeResult;

    private BatchResumeVsStreamResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resumeResult = builder.resumeResult;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchResumeVsStreamResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resumeResult
     */
    public ResumeResult getResumeResult() {
        return this.resumeResult;
    }

    public static final class Builder {
        private String requestId; 
        private ResumeResult resumeResult; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResumeResult.
         */
        public Builder resumeResult(ResumeResult resumeResult) {
            this.resumeResult = resumeResult;
            return this;
        }

        public BatchResumeVsStreamResponseBody build() {
            return new BatchResumeVsStreamResponseBody(this);
        } 

    } 

    public static class Channels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private java.util.List < String > channel;

        private Channels(Builder builder) {
            this.channel = builder.channel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Channels create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public java.util.List < String > getChannel() {
            return this.channel;
        }

        public static final class Builder {
            private java.util.List < String > channel; 

            /**
             * Channel.
             */
            public Builder channel(java.util.List < String > channel) {
                this.channel = channel;
                return this;
            }

            public Channels build() {
                return new Channels(this);
            } 

        } 

    }
    public static class ResumeResultInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channels")
        private Channels channels;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Detail")
        private String detail;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        private ResumeResultInfo(Builder builder) {
            this.channels = builder.channels;
            this.count = builder.count;
            this.detail = builder.detail;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResumeResultInfo create() {
            return builder().build();
        }

        /**
         * @return channels
         */
        public Channels getChannels() {
            return this.channels;
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return detail
         */
        public String getDetail() {
            return this.detail;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        public static final class Builder {
            private Channels channels; 
            private Integer count; 
            private String detail; 
            private String result; 

            /**
             * Channels.
             */
            public Builder channels(Channels channels) {
                this.channels = channels;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * Detail.
             */
            public Builder detail(String detail) {
                this.detail = detail;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            public ResumeResultInfo build() {
                return new ResumeResultInfo(this);
            } 

        } 

    }
    public static class ResumeResult extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResumeResultInfo")
        private java.util.List < ResumeResultInfo> resumeResultInfo;

        private ResumeResult(Builder builder) {
            this.resumeResultInfo = builder.resumeResultInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResumeResult create() {
            return builder().build();
        }

        /**
         * @return resumeResultInfo
         */
        public java.util.List < ResumeResultInfo> getResumeResultInfo() {
            return this.resumeResultInfo;
        }

        public static final class Builder {
            private java.util.List < ResumeResultInfo> resumeResultInfo; 

            /**
             * ResumeResultInfo.
             */
            public Builder resumeResultInfo(java.util.List < ResumeResultInfo> resumeResultInfo) {
                this.resumeResultInfo = resumeResultInfo;
                return this;
            }

            public ResumeResult build() {
                return new ResumeResult(this);
            } 

        } 

    }
}
