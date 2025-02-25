// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody</p>
 */
public class DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody build() {
            return new DescribeMeterMpuTranscodeRtUsageByTaskProfileResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Duration")
        private Long duration;

        @NameInMap("ServiceArea")
        private String serviceArea;

        @NameInMap("TaskProfile")
        private String taskProfile;

        @NameInMap("TimeStamp")
        private Long timeStamp;

        private Data(Builder builder) {
            this.duration = builder.duration;
            this.serviceArea = builder.serviceArea;
            this.taskProfile = builder.taskProfile;
            this.timeStamp = builder.timeStamp;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return serviceArea
         */
        public String getServiceArea() {
            return this.serviceArea;
        }

        /**
         * @return taskProfile
         */
        public String getTaskProfile() {
            return this.taskProfile;
        }

        /**
         * @return timeStamp
         */
        public Long getTimeStamp() {
            return this.timeStamp;
        }

        public static final class Builder {
            private Long duration; 
            private String serviceArea; 
            private String taskProfile; 
            private Long timeStamp; 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * ServiceArea.
             */
            public Builder serviceArea(String serviceArea) {
                this.serviceArea = serviceArea;
                return this;
            }

            /**
             * TaskProfile.
             */
            public Builder taskProfile(String taskProfile) {
                this.taskProfile = taskProfile;
                return this;
            }

            /**
             * TimeStamp.
             */
            public Builder timeStamp(Long timeStamp) {
                this.timeStamp = timeStamp;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
