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
 * {@link DescribeUsageAreaDistributionStatDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsageAreaDistributionStatDataResponseBody</p>
 */
public class DescribeUsageAreaDistributionStatDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UsageAreaStatList")
    private java.util.List<UsageAreaStatList> usageAreaStatList;

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
     * @return usageAreaStatList
     */
    public java.util.List<UsageAreaStatList> getUsageAreaStatList() {
        return this.usageAreaStatList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<UsageAreaStatList> usageAreaStatList; 

        private Builder() {
        } 

        private Builder(DescribeUsageAreaDistributionStatDataResponseBody model) {
            this.requestId = model.requestId;
            this.usageAreaStatList = model.usageAreaStatList;
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
         * <p>The regional distribution data of usage statistics.</p>
         */
        public Builder usageAreaStatList(java.util.List<UsageAreaStatList> usageAreaStatList) {
            this.usageAreaStatList = usageAreaStatList;
            return this;
        }

        public DescribeUsageAreaDistributionStatDataResponseBody build() {
            return new DescribeUsageAreaDistributionStatDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeUsageAreaDistributionStatDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeUsageAreaDistributionStatDataResponseBody</p>
     */
    public static class UsageAreaStatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AudioCallDuration")
        private Integer audioCallDuration;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("TotalCallDuration")
        private Integer totalCallDuration;

        @com.aliyun.core.annotation.NameInMap("VideoCallDuration")
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

            private Builder() {
            } 

            private Builder(UsageAreaStatList model) {
                this.audioCallDuration = model.audioCallDuration;
                this.name = model.name;
                this.totalCallDuration = model.totalCallDuration;
                this.videoCallDuration = model.videoCallDuration;
            } 

            /**
             * <p>Audio call duration, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>45</p>
             */
            public Builder audioCallDuration(Integer audioCallDuration) {
                this.audioCallDuration = audioCallDuration;
                return this;
            }

            /**
             * <p>Region name, such as China.</p>
             * 
             * <strong>example:</strong>
             * <p>中国_浙江省</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Total call duration, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>4821</p>
             */
            public Builder totalCallDuration(Integer totalCallDuration) {
                this.totalCallDuration = totalCallDuration;
                return this;
            }

            /**
             * <p>Video call duration, in minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>4776</p>
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
