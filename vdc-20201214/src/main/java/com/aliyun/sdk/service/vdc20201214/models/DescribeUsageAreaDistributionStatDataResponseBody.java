// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vdc20201214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsageAreaDistributionStatDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsageAreaDistributionStatDataResponseBody</p>
 */
public class DescribeUsageAreaDistributionStatDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UsageAreaStatList")
    private java.util.List < UsageAreaStatList> usageAreaStatList;

    private DescribeUsageAreaDistributionStatDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.usageAreaStatList = builder.usageAreaStatList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsageAreaDistributionStatDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return usageAreaStatList
     */
    public java.util.List < UsageAreaStatList> getUsageAreaStatList() {
        return this.usageAreaStatList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < UsageAreaStatList> usageAreaStatList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UsageAreaStatList.
         */
        public Builder usageAreaStatList(java.util.List < UsageAreaStatList> usageAreaStatList) {
            this.usageAreaStatList = usageAreaStatList;
            return this;
        }

        public DescribeUsageAreaDistributionStatDataResponseBody build() {
            return new DescribeUsageAreaDistributionStatDataResponseBody(this);
        } 

    } 

    public static class UsageAreaStatList extends TeaModel {
        @NameInMap("AudioCallDuration")
        private Integer audioCallDuration;

        @NameInMap("Name")
        private String name;

        @NameInMap("TotalCallDuration")
        private Integer totalCallDuration;

        @NameInMap("VideoCallDuration")
        private Integer videoCallDuration;

        private UsageAreaStatList(Builder builder) {
            this.audioCallDuration = builder.audioCallDuration;
            this.name = builder.name;
            this.totalCallDuration = builder.totalCallDuration;
            this.videoCallDuration = builder.videoCallDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageAreaStatList create() {
            return builder().build();
        }

        /**
         * @return audioCallDuration
         */
        public Integer getAudioCallDuration() {
            return this.audioCallDuration;
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
        public Integer getTotalCallDuration() {
            return this.totalCallDuration;
        }

        /**
         * @return videoCallDuration
         */
        public Integer getVideoCallDuration() {
            return this.videoCallDuration;
        }

        public static final class Builder {
            private Integer audioCallDuration; 
            private String name; 
            private Integer totalCallDuration; 
            private Integer videoCallDuration; 

            /**
             * AudioCallDuration.
             */
            public Builder audioCallDuration(Integer audioCallDuration) {
                this.audioCallDuration = audioCallDuration;
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
            public Builder totalCallDuration(Integer totalCallDuration) {
                this.totalCallDuration = totalCallDuration;
                return this;
            }

            /**
             * VideoCallDuration.
             */
            public Builder videoCallDuration(Integer videoCallDuration) {
                this.videoCallDuration = videoCallDuration;
                return this;
            }

            public UsageAreaStatList build() {
                return new UsageAreaStatList(this);
            } 

        } 

    }
}
