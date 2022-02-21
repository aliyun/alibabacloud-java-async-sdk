// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchForbidVsStreamResponseBody} extends {@link TeaModel}
 *
 * <p>BatchForbidVsStreamResponseBody</p>
 */
public class BatchForbidVsStreamResponseBody extends TeaModel {
    @NameInMap("ForbidResult")
    private ForbidResult forbidResult;

    @NameInMap("RequestId")
    private String requestId;

    private BatchForbidVsStreamResponseBody(Builder builder) {
        this.forbidResult = builder.forbidResult;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchForbidVsStreamResponseBody create() {
        return builder().build();
    }

    /**
     * @return forbidResult
     */
    public ForbidResult getForbidResult() {
        return this.forbidResult;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ForbidResult forbidResult; 
        private String requestId; 

        /**
         * ForbidResult.
         */
        public Builder forbidResult(ForbidResult forbidResult) {
            this.forbidResult = forbidResult;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public BatchForbidVsStreamResponseBody build() {
            return new BatchForbidVsStreamResponseBody(this);
        } 

    } 

    public static class Channels extends TeaModel {
        @NameInMap("Channel")
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
    public static class ForbidResultInfo extends TeaModel {
        @NameInMap("Channels")
        private Channels channels;

        @NameInMap("Count")
        private Integer count;

        @NameInMap("Detail")
        private String detail;

        @NameInMap("Result")
        private String result;

        private ForbidResultInfo(Builder builder) {
            this.channels = builder.channels;
            this.count = builder.count;
            this.detail = builder.detail;
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForbidResultInfo create() {
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

            public ForbidResultInfo build() {
                return new ForbidResultInfo(this);
            } 

        } 

    }
    public static class ForbidResult extends TeaModel {
        @NameInMap("ForbidResultInfo")
        private java.util.List < ForbidResultInfo> forbidResultInfo;

        private ForbidResult(Builder builder) {
            this.forbidResultInfo = builder.forbidResultInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ForbidResult create() {
            return builder().build();
        }

        /**
         * @return forbidResultInfo
         */
        public java.util.List < ForbidResultInfo> getForbidResultInfo() {
            return this.forbidResultInfo;
        }

        public static final class Builder {
            private java.util.List < ForbidResultInfo> forbidResultInfo; 

            /**
             * ForbidResultInfo.
             */
            public Builder forbidResultInfo(java.util.List < ForbidResultInfo> forbidResultInfo) {
                this.forbidResultInfo = forbidResultInfo;
                return this;
            }

            public ForbidResult build() {
                return new ForbidResult(this);
            } 

        } 

    }
}
