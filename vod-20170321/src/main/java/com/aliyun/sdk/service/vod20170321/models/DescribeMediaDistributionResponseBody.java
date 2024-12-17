// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link DescribeMediaDistributionResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMediaDistributionResponseBody</p>
 */
public class DescribeMediaDistributionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("MediaDistributionList")
    private java.util.List<MediaDistributionList> mediaDistributionList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
    private Long total;

    private DescribeMediaDistributionResponseBody(Builder builder) {
        this.mediaDistributionList = builder.mediaDistributionList;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMediaDistributionResponseBody create() {
        return builder().build();
    }

    /**
     * @return mediaDistributionList
     */
    public java.util.List<MediaDistributionList> getMediaDistributionList() {
        return this.mediaDistributionList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private java.util.List<MediaDistributionList> mediaDistributionList; 
        private String requestId; 
        private Long total; 

        /**
         * MediaDistributionList.
         */
        public Builder mediaDistributionList(java.util.List<MediaDistributionList> mediaDistributionList) {
            this.mediaDistributionList = mediaDistributionList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public DescribeMediaDistributionResponseBody build() {
            return new DescribeMediaDistributionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMediaDistributionResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMediaDistributionResponseBody</p>
     */
    public static class MediaDistributionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private String endTime;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private String startTime;

        private MediaDistributionList(Builder builder) {
            this.count = builder.count;
            this.endTime = builder.endTime;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaDistributionList create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long count; 
            private String endTime; 
            private String startTime; 

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public MediaDistributionList build() {
                return new MediaDistributionList(this);
            } 

        } 

    }
}
