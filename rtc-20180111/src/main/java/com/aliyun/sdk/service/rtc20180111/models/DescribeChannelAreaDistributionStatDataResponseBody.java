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
 * {@link DescribeChannelAreaDistributionStatDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelAreaDistributionStatDataResponseBody</p>
 */
public class DescribeChannelAreaDistributionStatDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AreaStatList")
    private java.util.List<AreaStatList> areaStatList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeChannelAreaDistributionStatDataResponseBody(Builder builder) {
        this.areaStatList = builder.areaStatList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelAreaDistributionStatDataResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return areaStatList
     */
    public java.util.List<AreaStatList> getAreaStatList() {
        return this.areaStatList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AreaStatList> areaStatList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeChannelAreaDistributionStatDataResponseBody model) {
            this.areaStatList = model.areaStatList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The regional statistics list.</p>
         */
        public Builder areaStatList(java.util.List<AreaStatList> areaStatList) {
            this.areaStatList = areaStatList;
            return this;
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

        public DescribeChannelAreaDistributionStatDataResponseBody build() {
            return new DescribeChannelAreaDistributionStatDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChannelAreaDistributionStatDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelAreaDistributionStatDataResponseBody</p>
     */
    public static class AreaStatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AreaName")
        private String areaName;

        @com.aliyun.core.annotation.NameInMap("CallUserCount")
        private Integer callUserCount;

        @com.aliyun.core.annotation.NameInMap("HighQualityTransmissionRate")
        private String highQualityTransmissionRate;

        @com.aliyun.core.annotation.NameInMap("PubUserCount")
        private Integer pubUserCount;

        @com.aliyun.core.annotation.NameInMap("SubUserCount")
        private Integer subUserCount;

        private AreaStatList(Builder builder) {
            this.areaName = builder.areaName;
            this.callUserCount = builder.callUserCount;
            this.highQualityTransmissionRate = builder.highQualityTransmissionRate;
            this.pubUserCount = builder.pubUserCount;
            this.subUserCount = builder.subUserCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AreaStatList create() {
            return builder().build();
        }

        /**
         * @return areaName
         */
        public String getAreaName() {
            return this.areaName;
        }

        /**
         * @return callUserCount
         */
        public Integer getCallUserCount() {
            return this.callUserCount;
        }

        /**
         * @return highQualityTransmissionRate
         */
        public String getHighQualityTransmissionRate() {
            return this.highQualityTransmissionRate;
        }

        /**
         * @return pubUserCount
         */
        public Integer getPubUserCount() {
            return this.pubUserCount;
        }

        /**
         * @return subUserCount
         */
        public Integer getSubUserCount() {
            return this.subUserCount;
        }

        public static final class Builder {
            private String areaName; 
            private Integer callUserCount; 
            private String highQualityTransmissionRate; 
            private Integer pubUserCount; 
            private Integer subUserCount; 

            private Builder() {
            } 

            private Builder(AreaStatList model) {
                this.areaName = model.areaName;
                this.callUserCount = model.callUserCount;
                this.highQualityTransmissionRate = model.highQualityTransmissionRate;
                this.pubUserCount = model.pubUserCount;
                this.subUserCount = model.subUserCount;
            } 

            /**
             * <p>The region name, such as China_Zhejiang Province_Hangzhou.</p>
             * 
             * <strong>example:</strong>
             * <p>China_Zhejiang Province_Hangzhou</p>
             */
            public Builder areaName(String areaName) {
                this.areaName = areaName;
                return this;
            }

            /**
             * <p>The number of communicating users.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder callUserCount(Integer callUserCount) {
                this.callUserCount = callUserCount;
                return this;
            }

            /**
             * <p>The high-quality transmission rate, represented as a decimal. For example, 0.9999 indicates a high-quality transmission rate of 99.99%.</p>
             * 
             * <strong>example:</strong>
             * <p>0.9999</p>
             */
            public Builder highQualityTransmissionRate(String highQualityTransmissionRate) {
                this.highQualityTransmissionRate = highQualityTransmissionRate;
                return this;
            }

            /**
             * <p>The number of publishers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pubUserCount(Integer pubUserCount) {
                this.pubUserCount = pubUserCount;
                return this;
            }

            /**
             * <p>The number of subscribers.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder subUserCount(Integer subUserCount) {
                this.subUserCount = subUserCount;
                return this;
            }

            public AreaStatList build() {
                return new AreaStatList(this);
            } 

        } 

    }
}
