// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

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
 * {@link DescribeUsageDistributionStatDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsageDistributionStatDataResponseBody</p>
 */
public class DescribeUsageDistributionStatDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsageStatList")
    private java.util.List<UsageStatList> usageStatList;

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
     * @return usageStatList
     */
    public java.util.List<UsageStatList> getUsageStatList() {
        return this.usageStatList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<UsageStatList> usageStatList; 

        private Builder() {
        } 

        private Builder(DescribeUsageDistributionStatDataResponseBody model) {
            this.requestId = model.requestId;
            this.usageStatList = model.usageStatList;
        } 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The list of usage statistics.</p>
         */
        public Builder usageStatList(java.util.List<UsageStatList> usageStatList) {
            this.usageStatList = usageStatList;
            return this;
        }

        public DescribeUsageDistributionStatDataResponseBody build() {
            return new DescribeUsageDistributionStatDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUsageDistributionStatDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsageDistributionStatDataResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(UsageStatList model) {
                this.audioCallDuration = model.audioCallDuration;
                this.callDurationRatio = model.callDurationRatio;
                this.name = model.name;
                this.totalCallDuration = model.totalCallDuration;
                this.videoCallDuration = model.videoCallDuration;
            } 

            /**
             * <p>The duration of audio calls, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>51</p>
             */
            public Builder audioCallDuration(Long audioCallDuration) {
                this.audioCallDuration = audioCallDuration;
                return this;
            }

            /**
             * <p>The ratio of the call duration, represented by four decimal places, such as 0.9782.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9782</p>
             */
            public Builder callDurationRatio(String callDurationRatio) {
                this.callDurationRatio = callDurationRatio;
                return this;
            }

            /**
             * <p>The statistical dimension. Valid values:</p>
             * <ul>
             * <li>When StatDim is set to CHANNEL_ONLINE, valid values are <strong>ONE_TO_FIVE</strong> (1 to 5 users), <strong>SIX_TO_TEN</strong> (6 to 10 users), <strong>ELEVEN_TO_TWENTY</strong> (11 to 20 users), <strong>TWENTY_ONE_TO_FIFTY</strong> (21 to 50 users), and <strong>ABOVE_FIFTY</strong> (more than 50 users).  </li>
             * <li>When StatDim is set to NETWORK, valid values are <strong>WiFi</strong>, <strong>4G</strong>, and others.  </li>
             * <li>When StatDim is set to OS, valid values are <strong>iOS</strong>, <strong>Android</strong>, and others.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ONE_TO_FIVE</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The total duration of calls, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10636</p>
             */
            public Builder totalCallDuration(Long totalCallDuration) {
                this.totalCallDuration = totalCallDuration;
                return this;
            }

            /**
             * <p>The duration of video calls, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>10585</p>
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
