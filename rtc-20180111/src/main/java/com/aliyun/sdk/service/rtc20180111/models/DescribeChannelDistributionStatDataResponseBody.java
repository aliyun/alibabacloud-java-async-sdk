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
 * {@link DescribeChannelDistributionStatDataResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeChannelDistributionStatDataResponseBody</p>
 */
public class DescribeChannelDistributionStatDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatList")
    private java.util.List<StatList> statList;

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
     * @return statList
     */
    public java.util.List<StatList> getStatList() {
        return this.statList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<StatList> statList; 

        private Builder() {
        } 

        private Builder(DescribeChannelDistributionStatDataResponseBody model) {
            this.requestId = model.requestId;
            this.statList = model.statList;
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
         * <p>The channel distribution statistics list.</p>
         */
        public Builder statList(java.util.List<StatList> statList) {
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

            private Builder() {
            } 

            private Builder(StatList model) {
                this.callUserCount = model.callUserCount;
                this.callUserRatio = model.callUserRatio;
                this.name = model.name;
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
             * <p>The proportion of communicating users, represented as a decimal. For example, 1.0000 indicates that the proportion is 100%.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0000</p>
             */
            public Builder callUserRatio(String callUserRatio) {
                this.callUserRatio = callUserRatio;
                return this;
            }

            /**
             * <p>The statistical dimension.</p>
             * 
             * <strong>example:</strong>
             * <p>OS</p>
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
