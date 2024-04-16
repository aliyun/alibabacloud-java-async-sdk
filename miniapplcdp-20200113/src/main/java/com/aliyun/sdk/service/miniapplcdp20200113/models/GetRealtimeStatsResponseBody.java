// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.miniapplcdp20200113.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRealtimeStatsResponseBody} extends {@link TeaModel}
 *
 * <p>GetRealtimeStatsResponseBody</p>
 */
public class GetRealtimeStatsResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    private GetRealtimeStatsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRealtimeStatsResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
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

        public GetRealtimeStatsResponseBody build() {
            return new GetRealtimeStatsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("TodayPvCount")
        private java.util.Map < String, String > todayPvCount;

        @NameInMap("TodayUvCount")
        private java.util.Map < String, String > todayUvCount;

        @NameInMap("TotalPvCount")
        private java.util.Map < String, String > totalPvCount;

        @NameInMap("TotalUvCount")
        private java.util.Map < String, String > totalUvCount;

        private Data(Builder builder) {
            this.todayPvCount = builder.todayPvCount;
            this.todayUvCount = builder.todayUvCount;
            this.totalPvCount = builder.totalPvCount;
            this.totalUvCount = builder.totalUvCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return todayPvCount
         */
        public java.util.Map < String, String > getTodayPvCount() {
            return this.todayPvCount;
        }

        /**
         * @return todayUvCount
         */
        public java.util.Map < String, String > getTodayUvCount() {
            return this.todayUvCount;
        }

        /**
         * @return totalPvCount
         */
        public java.util.Map < String, String > getTotalPvCount() {
            return this.totalPvCount;
        }

        /**
         * @return totalUvCount
         */
        public java.util.Map < String, String > getTotalUvCount() {
            return this.totalUvCount;
        }

        public static final class Builder {
            private java.util.Map < String, String > todayPvCount; 
            private java.util.Map < String, String > todayUvCount; 
            private java.util.Map < String, String > totalPvCount; 
            private java.util.Map < String, String > totalUvCount; 

            /**
             * TodayPvCount.
             */
            public Builder todayPvCount(java.util.Map < String, String > todayPvCount) {
                this.todayPvCount = todayPvCount;
                return this;
            }

            /**
             * TodayUvCount.
             */
            public Builder todayUvCount(java.util.Map < String, String > todayUvCount) {
                this.todayUvCount = todayUvCount;
                return this;
            }

            /**
             * TotalPvCount.
             */
            public Builder totalPvCount(java.util.Map < String, String > totalPvCount) {
                this.totalPvCount = totalPvCount;
                return this;
            }

            /**
             * TotalUvCount.
             */
            public Builder totalUvCount(java.util.Map < String, String > totalUvCount) {
                this.totalUvCount = totalUvCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
