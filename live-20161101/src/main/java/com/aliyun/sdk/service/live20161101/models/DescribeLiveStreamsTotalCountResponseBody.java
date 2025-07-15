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
 * {@link DescribeLiveStreamsTotalCountResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLiveStreamsTotalCountResponseBody</p>
 */
public class DescribeLiveStreamsTotalCountResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StreamCountList")
    private StreamCountList streamCountList;

    private DescribeLiveStreamsTotalCountResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.streamCountList = builder.streamCountList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamsTotalCountResponseBody create() {
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
     * @return streamCountList
     */
    public StreamCountList getStreamCountList() {
        return this.streamCountList;
    }

    public static final class Builder {
        private String requestId; 
        private StreamCountList streamCountList; 

        private Builder() {
        } 

        private Builder(DescribeLiveStreamsTotalCountResponseBody model) {
            this.requestId = model.requestId;
            this.streamCountList = model.streamCountList;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>String	FCFFE4A4-F34F-4EEF-B401-36A01689AFBC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The statistics about the live streams.</p>
         */
        public Builder streamCountList(StreamCountList streamCountList) {
            this.streamCountList = streamCountList;
            return this;
        }

        public DescribeLiveStreamsTotalCountResponseBody build() {
            return new DescribeLiveStreamsTotalCountResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeLiveStreamsTotalCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamsTotalCountResponseBody</p>
     */
    public static class StreamCountInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        private StreamCountInfos(Builder builder) {
            this.count = builder.count;
            this.timestamp = builder.timestamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamCountInfos create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        public static final class Builder {
            private Integer count; 
            private String timestamp; 

            private Builder() {
            } 

            private Builder(StreamCountInfos model) {
                this.count = model.count;
                this.timestamp = model.timestamp;
            } 

            /**
             * <p>The total number of live streams.</p>
             * 
             * <strong>example:</strong>
             * <p>934</p>
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>2023-07-24T16:00:00Z</p>
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            public StreamCountInfos build() {
                return new StreamCountInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeLiveStreamsTotalCountResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeLiveStreamsTotalCountResponseBody</p>
     */
    public static class StreamCountList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StreamCountInfos")
        private java.util.List<StreamCountInfos> streamCountInfos;

        private StreamCountList(Builder builder) {
            this.streamCountInfos = builder.streamCountInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamCountList create() {
            return builder().build();
        }

        /**
         * @return streamCountInfos
         */
        public java.util.List<StreamCountInfos> getStreamCountInfos() {
            return this.streamCountInfos;
        }

        public static final class Builder {
            private java.util.List<StreamCountInfos> streamCountInfos; 

            private Builder() {
            } 

            private Builder(StreamCountList model) {
                this.streamCountInfos = model.streamCountInfos;
            } 

            /**
             * StreamCountInfos.
             */
            public Builder streamCountInfos(java.util.List<StreamCountInfos> streamCountInfos) {
                this.streamCountInfos = streamCountInfos;
                return this;
            }

            public StreamCountList build() {
                return new StreamCountList(this);
            } 

        } 

    }
}
