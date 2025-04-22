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
 * {@link DescribeVodEditingUsageDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVodEditingUsageDataResponseBody</p>
 */
public class DescribeVodEditingUsageDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EditingData")
    private java.util.List<EditingData> editingData;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private String endTime;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StartTime")
    private String startTime;

    private DescribeVodEditingUsageDataResponseBody(Builder builder) {
        this.editingData = builder.editingData;
        this.endTime = builder.endTime;
        this.requestId = builder.requestId;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVodEditingUsageDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return editingData
     */
    public java.util.List<EditingData> getEditingData() {
        return this.editingData;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private java.util.List<EditingData> editingData; 
        private String endTime; 
        private String requestId; 
        private String startTime; 

        private Builder() {
        } 

        private Builder(DescribeVodEditingUsageDataResponseBody model) {
            this.editingData = model.editingData;
            this.endTime = model.endTime;
            this.requestId = model.requestId;
            this.startTime = model.startTime;
        } 

        /**
         * EditingData.
         */
        public Builder editingData(java.util.List<EditingData> editingData) {
            this.editingData = editingData;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.startTime = startTime;
            return this;
        }

        public DescribeVodEditingUsageDataResponseBody build() {
            return new DescribeVodEditingUsageDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVodEditingUsageDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVodEditingUsageDataResponseBody</p>
     */
    public static class EditingData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Specification")
        private String specification;

        @com.aliyun.core.annotation.NameInMap("TimeStamp")
        private String timeStamp;

        private EditingData(Builder builder) {
            this.duration = builder.duration;
            this.region = builder.region;
            this.specification = builder.specification;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EditingData create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return specification
         */
        public String getSpecification() {
            return this.specification;
        }

        /**
         * @return timeStamp
         */
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long duration; 
            private String region; 
            private String specification; 
            private String timeStamp; 

            private Builder() {
            } 

            private Builder(EditingData model) {
                this.duration = model.duration;
                this.region = model.region;
                this.specification = model.specification;
                this.timeStamp = model.timeStamp;
            } 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Specification.
             */
            public Builder specification(String specification) {
                this.specification = specification;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(String timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public EditingData build() {
                return new EditingData(this);
            } 

        } 

    }
}
