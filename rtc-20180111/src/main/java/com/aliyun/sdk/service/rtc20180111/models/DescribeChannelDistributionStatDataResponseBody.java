// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeChannelDistributionStatDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelDistributionStatDataResponseBody</p>
 */
public class DescribeChannelDistributionStatDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatList")
    private java.util.List < StatList> statList;

    private DescribeChannelDistributionStatDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statList = builder.statList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeChannelDistributionStatDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statList
     */
    public java.util.List < StatList> getStatList() {
        return this.statList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < StatList> statList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatList.
         */
        public Builder statList(java.util.List < StatList> statList) {
            this.statList = statList;
            return this;
        }

        public DescribeChannelDistributionStatDataResponseBody build() {
            return new DescribeChannelDistributionStatDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeChannelDistributionStatDataResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeChannelDistributionStatDataResponseBody</p>
     */
    public static class StatList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CallUserCount")
        private Integer callUserCount;

        @com.aliyun.core.annotation.NameInMap("CallUserRatio")
        private String callUserRatio;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private StatList(Builder builder) {
            this.callUserCount = builder.callUserCount;
            this.callUserRatio = builder.callUserRatio;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StatList create() {
            return builder().build();
        }

        /**
         * @return callUserCount
         */
        public Integer getCallUserCount() {
            return this.callUserCount;
        }

        /**
         * @return callUserRatio
         */
        public String getCallUserRatio() {
            return this.callUserRatio;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Integer callUserCount; 
            private String callUserRatio; 
            private String name; 

            /**
             * CallUserCount.
             */
            public Builder callUserCount(Integer callUserCount) {
                this.callUserCount = callUserCount;
                return this;
            }

            /**
             * CallUserRatio.
             */
            public Builder callUserRatio(String callUserRatio) {
                this.callUserRatio = callUserRatio;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public StatList build() {
                return new StatList(this);
            } 

        } 

    }
}
