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
 * {@link DescribeUsageOsSdkVersionDistributionStatDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsageOsSdkVersionDistributionStatDataResponseBody</p>
 */
public class DescribeUsageOsSdkVersionDistributionStatDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsageOsSdkVersionStatList")
    private java.util.List<UsageOsSdkVersionStatList> usageOsSdkVersionStatList;

    private DescribeUsageOsSdkVersionDistributionStatDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.usageOsSdkVersionStatList = builder.usageOsSdkVersionStatList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsageOsSdkVersionDistributionStatDataResponseBody create() {
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
     * @return usageOsSdkVersionStatList
     */
    public java.util.List<UsageOsSdkVersionStatList> getUsageOsSdkVersionStatList() {
        return this.usageOsSdkVersionStatList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<UsageOsSdkVersionStatList> usageOsSdkVersionStatList; 

        private Builder() {
        } 

        private Builder(DescribeUsageOsSdkVersionDistributionStatDataResponseBody model) {
            this.requestId = model.requestId;
            this.usageOsSdkVersionStatList = model.usageOsSdkVersionStatList;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>List of SDK version data in usage statistics.</p>
         */
        public Builder usageOsSdkVersionStatList(java.util.List<UsageOsSdkVersionStatList> usageOsSdkVersionStatList) {
            this.usageOsSdkVersionStatList = usageOsSdkVersionStatList;
            return this;
        }

        public DescribeUsageOsSdkVersionDistributionStatDataResponseBody build() {
            return new DescribeUsageOsSdkVersionDistributionStatDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUsageOsSdkVersionDistributionStatDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsageOsSdkVersionDistributionStatDataResponseBody</p>
     */
    public static class UsageOsSdkVersionStatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioCallDuration")
        private Long audioCallDuration;

        @com.aliyun.core.annotation.NameInMap("CallDurationRatio")
        private String callDurationRatio;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("TotalCallDuration")
        private Long totalCallDuration;

        @com.aliyun.core.annotation.NameInMap("VideoCallDuration")
        private Long videoCallDuration;

        private UsageOsSdkVersionStatList(Builder builder) {
            this.audioCallDuration = builder.audioCallDuration;
            this.callDurationRatio = builder.callDurationRatio;
            this.name = builder.name;
            this.os = builder.os;
            this.totalCallDuration = builder.totalCallDuration;
            this.videoCallDuration = builder.videoCallDuration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageOsSdkVersionStatList create() {
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
         * @return os
         */
        public String getOs() {
            return this.os;
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
            private String os; 
            private Long totalCallDuration; 
            private Long videoCallDuration; 

            private Builder() {
            } 

            private Builder(UsageOsSdkVersionStatList model) {
                this.audioCallDuration = model.audioCallDuration;
                this.callDurationRatio = model.callDurationRatio;
                this.name = model.name;
                this.os = model.os;
                this.totalCallDuration = model.totalCallDuration;
                this.videoCallDuration = model.videoCallDuration;
            } 

            /**
             * <p>Audio call duration, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder audioCallDuration(Long audioCallDuration) {
                this.audioCallDuration = audioCallDuration;
                return this;
            }

            /**
             * <p>Call duration ratio, represented as a four-decimal number, such as 0.0984.</p>
             * 
             * <strong>example:</strong>
             * <p>0.0984</p>
             */
            public Builder callDurationRatio(String callDurationRatio) {
                this.callDurationRatio = callDurationRatio;
                return this;
            }

            /**
             * <p>SDK version name, such as 1.0.0 or 1.1.1.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Operating system, such as iOS or Android.</p>
             * 
             * <strong>example:</strong>
             * <p>macOS</p>
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * <p>Total call duration, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>476</p>
             */
            public Builder totalCallDuration(Long totalCallDuration) {
                this.totalCallDuration = totalCallDuration;
                return this;
            }

            /**
             * <p>Video call duration, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>473</p>
             */
            public Builder videoCallDuration(Long videoCallDuration) {
                this.videoCallDuration = videoCallDuration;
                return this;
            }

            public UsageOsSdkVersionStatList build() {
                return new UsageOsSdkVersionStatList(this);
            } 

        } 

    }
}
