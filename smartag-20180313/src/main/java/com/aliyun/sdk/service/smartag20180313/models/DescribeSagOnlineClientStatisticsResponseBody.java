// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.smartag20180313.models;

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
 * {@link DescribeSagOnlineClientStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSagOnlineClientStatisticsResponseBody</p>
 */
public class DescribeSagOnlineClientStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SagStatistics")
    private SagStatistics sagStatistics;

    private DescribeSagOnlineClientStatisticsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sagStatistics = builder.sagStatistics;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSagOnlineClientStatisticsResponseBody create() {
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
     * @return sagStatistics
     */
    public SagStatistics getSagStatistics() {
        return this.sagStatistics;
    }

    public static final class Builder {
        private String requestId; 
        private SagStatistics sagStatistics; 

        private Builder() {
        } 

        private Builder(DescribeSagOnlineClientStatisticsResponseBody model) {
            this.requestId = model.requestId;
            this.sagStatistics = model.sagStatistics;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>9EC839B6-0EA5-4F19-A4B7-A9E465D057AE</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the clients that are connected to Alibaba Cloud.</p>
         */
        public Builder sagStatistics(SagStatistics sagStatistics) {
            this.sagStatistics = sagStatistics;
            return this;
        }

        public DescribeSagOnlineClientStatisticsResponseBody build() {
            return new DescribeSagOnlineClientStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSagOnlineClientStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagOnlineClientStatisticsResponseBody</p>
     */
    public static class Statistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OnlineCount")
        private String onlineCount;

        @com.aliyun.core.annotation.NameInMap("SmartAGId")
        private String smartAGId;

        private Statistics(Builder builder) {
            this.onlineCount = builder.onlineCount;
            this.smartAGId = builder.smartAGId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Statistics create() {
            return builder().build();
        }

        /**
         * @return onlineCount
         */
        public String getOnlineCount() {
            return this.onlineCount;
        }

        /**
         * @return smartAGId
         */
        public String getSmartAGId() {
            return this.smartAGId;
        }

        public static final class Builder {
            private String onlineCount; 
            private String smartAGId; 

            private Builder() {
            } 

            private Builder(Statistics model) {
                this.onlineCount = model.onlineCount;
                this.smartAGId = model.smartAGId;
            } 

            /**
             * <p>The number of clients that are connected to Alibaba Cloud through the specified SAG APP instance.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder onlineCount(String onlineCount) {
                this.onlineCount = onlineCount;
                return this;
            }

            /**
             * <p>The ID of the SAG app instance.</p>
             * 
             * <strong>example:</strong>
             * <p>sag-va03wf4l4idaj*****</p>
             */
            public Builder smartAGId(String smartAGId) {
                this.smartAGId = smartAGId;
                return this;
            }

            public Statistics build() {
                return new Statistics(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSagOnlineClientStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSagOnlineClientStatisticsResponseBody</p>
     */
    public static class SagStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Statistics")
        private java.util.List<Statistics> statistics;

        private SagStatistics(Builder builder) {
            this.statistics = builder.statistics;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SagStatistics create() {
            return builder().build();
        }

        /**
         * @return statistics
         */
        public java.util.List<Statistics> getStatistics() {
            return this.statistics;
        }

        public static final class Builder {
            private java.util.List<Statistics> statistics; 

            private Builder() {
            } 

            private Builder(SagStatistics model) {
                this.statistics = model.statistics;
            } 

            /**
             * Statistics.
             */
            public Builder statistics(java.util.List<Statistics> statistics) {
                this.statistics = statistics;
                return this;
            }

            public SagStatistics build() {
                return new SagStatistics(this);
            } 

        } 

    }
}
