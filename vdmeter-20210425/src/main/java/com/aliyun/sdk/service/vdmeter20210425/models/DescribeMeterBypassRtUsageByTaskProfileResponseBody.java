// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdmeter20210425.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeMeterBypassRtUsageByTaskProfileResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMeterBypassRtUsageByTaskProfileResponseBody</p>
 */
public class DescribeMeterBypassRtUsageByTaskProfileResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeMeterBypassRtUsageByTaskProfileResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMeterBypassRtUsageByTaskProfileResponseBody create() {
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

        public DescribeMeterBypassRtUsageByTaskProfileResponseBody build() {
            return new DescribeMeterBypassRtUsageByTaskProfileResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Duration")
        private Long duration;

        @NameInMap("Ratio")
        private String ratio;

        @NameInMap("ServiceArea")
        private String serviceArea;

        @NameInMap("TaskProfile")
        private String taskProfile;

        @NameInMap("Timestamp")
        private Long timestamp;

        @NameInMap("Type")
        private String type;

        private Data(Builder builder) {
            this.duration = builder.duration;
            this.ratio = builder.ratio;
            this.serviceArea = builder.serviceArea;
            this.taskProfile = builder.taskProfile;
            this.timestamp = builder.timestamp;
            this.type = builder.type;
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
         * @return ratio
         */
        public String getRatio() {
            return this.ratio;
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
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private Long duration; 
            private String ratio; 
            private String serviceArea; 
            private String taskProfile; 
            private Long timestamp; 
            private String type; 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Ratio.
             */
            public Builder ratio(String ratio) {
                this.ratio = ratio;
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
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
