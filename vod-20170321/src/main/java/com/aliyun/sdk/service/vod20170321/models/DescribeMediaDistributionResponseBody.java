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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(DescribeMediaDistributionResponseBody model) {
            this.mediaDistributionList = model.mediaDistributionList;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The distribution list of media assets. The data is displayed based on the statistical cycle of the natural hour, day, week, or month of the start and end time.</p>
         */
        public Builder mediaDistributionList(java.util.List<MediaDistributionList> mediaDistributionList) {
            this.mediaDistributionList = mediaDistributionList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of media assets returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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

            private Builder() {
            } 

            private Builder(MediaDistributionList model) {
                this.count = model.count;
                this.endTime = model.endTime;
                this.startTime = model.startTime;
            } 

            /**
             * <p>The number of media assets that are queried during the specified time range.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * <p>The end of the time range during which data is queried (exclusive). The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-14T00:00:00Z</p>
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The start of the time range during which data is queried (inclusive). The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2017-11-13T00:00:00Z</p>
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
