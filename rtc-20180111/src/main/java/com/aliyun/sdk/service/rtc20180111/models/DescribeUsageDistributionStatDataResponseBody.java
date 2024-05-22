// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsageDistributionStatDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsageDistributionStatDataResponseBody</p>
 */
public class DescribeUsageDistributionStatDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsageStatList")
    private java.util.List < UsageStatList> usageStatList;

    private DescribeUsageDistributionStatDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.usageStatList = builder.usageStatList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsageDistributionStatDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usageStatList
     */
    public java.util.List < UsageStatList> getUsageStatList() {
        return this.usageStatList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < UsageStatList> usageStatList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UsageStatList.
         */
        public Builder usageStatList(java.util.List < UsageStatList> usageStatList) {
            this.usageStatList = usageStatList;
            return this;
        }

        public DescribeUsageDistributionStatDataResponseBody build() {
            return new DescribeUsageDistributionStatDataResponseBody(this);
        } 

    } 

    public static class UsageStatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioCallDuration")
        private Long audioCallDuration;

        @com.aliyun.core.annotation.NameInMap("CallDurationRatio")
        private String callDurationRatio;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TotalCallDuration")
        private Long totalCallDuration;

        @com.aliyun.core.annotation.NameInMap("VideoCallDuration")
        private Long videoCallDuration;

        private UsageStatList(Builder builder) {
            this.audioCallDuration = builder.audioCallDuration;
            this.callDurationRatio = builder.callDurationRatio;
            this.name = builder.name;
            this.totalCallDuration = builder.totalCallDuration;
            this.videoCallDuration = builder.videoCallDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageStatList create() {
            return builder().build();
        }

        /**
         * @return audioCallDuration
         */
        public Long getAudioCallDuration() {
            return this.audioCallDuration;
        }

        /**
         * @return callDurationRatio
         */
        public String getCallDurationRatio() {
            return this.callDurationRatio;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return totalCallDuration
         */
        public Long getTotalCallDuration() {
            return this.totalCallDuration;
        }

        /**
         * @return videoCallDuration
         */
        public Long getVideoCallDuration() {
            return this.videoCallDuration;
        }

        public static final class Builder {
            private Long audioCallDuration; 
            private String callDurationRatio; 
            private String name; 
            private Long totalCallDuration; 
            private Long videoCallDuration; 

            /**
             * AudioCallDuration.
             */
            public Builder audioCallDuration(Long audioCallDuration) {
                this.audioCallDuration = audioCallDuration;
                return this;
            }

            /**
             * CallDurationRatio.
             */
            public Builder callDurationRatio(String callDurationRatio) {
                this.callDurationRatio = callDurationRatio;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * TotalCallDuration.
             */
            public Builder totalCallDuration(Long totalCallDuration) {
                this.totalCallDuration = totalCallDuration;
                return this;
            }

            /**
             * VideoCallDuration.
             */
            public Builder videoCallDuration(Long videoCallDuration) {
                this.videoCallDuration = videoCallDuration;
                return this;
            }

            public UsageStatList build() {
                return new UsageStatList(this);
            } 

        } 

    }
}
