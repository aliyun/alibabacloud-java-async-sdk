// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListTrafficControlTargetTrafficHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListTrafficControlTargetTrafficHistoryResponseBody</p>
 */
public class ListTrafficControlTargetTrafficHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    @com.aliyun.core.annotation.NameInMap("TrafficControlTaskTrafficHistories")
    private java.util.List<TrafficControlTaskTrafficHistories> trafficControlTaskTrafficHistories;

    private ListTrafficControlTargetTrafficHistoryResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.trafficControlTaskTrafficHistories = builder.trafficControlTaskTrafficHistories;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTrafficControlTargetTrafficHistoryResponseBody create() {
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
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return trafficControlTaskTrafficHistories
     */
    public java.util.List<TrafficControlTaskTrafficHistories> getTrafficControlTaskTrafficHistories() {
        return this.trafficControlTaskTrafficHistories;
    }

    public static final class Builder {
        private String requestId; 
        private String totalCount; 
        private java.util.List<TrafficControlTaskTrafficHistories> trafficControlTaskTrafficHistories; 

        private Builder() {
        } 

        private Builder(ListTrafficControlTargetTrafficHistoryResponseBody model) {
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.trafficControlTaskTrafficHistories = model.trafficControlTaskTrafficHistories;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TrafficControlTaskTrafficHistories.
         */
        public Builder trafficControlTaskTrafficHistories(java.util.List<TrafficControlTaskTrafficHistories> trafficControlTaskTrafficHistories) {
            this.trafficControlTaskTrafficHistories = trafficControlTaskTrafficHistories;
            return this;
        }

        public ListTrafficControlTargetTrafficHistoryResponseBody build() {
            return new ListTrafficControlTargetTrafficHistoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTrafficControlTargetTrafficHistoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListTrafficControlTargetTrafficHistoryResponseBody</p>
     */
    public static class TrafficControlTaskTrafficHistories extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExperimentId")
        private String experimentId;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("RecordTime")
        private String recordTime;

        @com.aliyun.core.annotation.NameInMap("TrafficControlTargetAimTraffic")
        private Double trafficControlTargetAimTraffic;

        @com.aliyun.core.annotation.NameInMap("TrafficControlTargetTraffic")
        private Double trafficControlTargetTraffic;

        @com.aliyun.core.annotation.NameInMap("TrafficControlTaskTraffic")
        private Double trafficControlTaskTraffic;

        private TrafficControlTaskTrafficHistories(Builder builder) {
            this.experimentId = builder.experimentId;
            this.itemId = builder.itemId;
            this.recordTime = builder.recordTime;
            this.trafficControlTargetAimTraffic = builder.trafficControlTargetAimTraffic;
            this.trafficControlTargetTraffic = builder.trafficControlTargetTraffic;
            this.trafficControlTaskTraffic = builder.trafficControlTaskTraffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficControlTaskTrafficHistories create() {
            return builder().build();
        }

        /**
         * @return experimentId
         */
        public String getExperimentId() {
            return this.experimentId;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return recordTime
         */
        public String getRecordTime() {
            return this.recordTime;
        }

        /**
         * @return trafficControlTargetAimTraffic
         */
        public Double getTrafficControlTargetAimTraffic() {
            return this.trafficControlTargetAimTraffic;
        }

        /**
         * @return trafficControlTargetTraffic
         */
        public Double getTrafficControlTargetTraffic() {
            return this.trafficControlTargetTraffic;
        }

        /**
         * @return trafficControlTaskTraffic
         */
        public Double getTrafficControlTaskTraffic() {
            return this.trafficControlTaskTraffic;
        }

        public static final class Builder {
            private String experimentId; 
            private String itemId; 
            private String recordTime; 
            private Double trafficControlTargetAimTraffic; 
            private Double trafficControlTargetTraffic; 
            private Double trafficControlTaskTraffic; 

            private Builder() {
            } 

            private Builder(TrafficControlTaskTrafficHistories model) {
                this.experimentId = model.experimentId;
                this.itemId = model.itemId;
                this.recordTime = model.recordTime;
                this.trafficControlTargetAimTraffic = model.trafficControlTargetAimTraffic;
                this.trafficControlTargetTraffic = model.trafficControlTargetTraffic;
                this.trafficControlTaskTraffic = model.trafficControlTaskTraffic;
            } 

            /**
             * ExperimentId.
             */
            public Builder experimentId(String experimentId) {
                this.experimentId = experimentId;
                return this;
            }

            /**
             * ItemId.
             */
            public Builder itemId(String itemId) {
                this.itemId = itemId;
                return this;
            }

            /**
             * RecordTime.
             */
            public Builder recordTime(String recordTime) {
                this.recordTime = recordTime;
                return this;
            }

            /**
             * TrafficControlTargetAimTraffic.
             */
            public Builder trafficControlTargetAimTraffic(Double trafficControlTargetAimTraffic) {
                this.trafficControlTargetAimTraffic = trafficControlTargetAimTraffic;
                return this;
            }

            /**
             * TrafficControlTargetTraffic.
             */
            public Builder trafficControlTargetTraffic(Double trafficControlTargetTraffic) {
                this.trafficControlTargetTraffic = trafficControlTargetTraffic;
                return this;
            }

            /**
             * TrafficControlTaskTraffic.
             */
            public Builder trafficControlTaskTraffic(Double trafficControlTaskTraffic) {
                this.trafficControlTaskTraffic = trafficControlTaskTraffic;
                return this;
            }

            public TrafficControlTaskTrafficHistories build() {
                return new TrafficControlTaskTrafficHistories(this);
            } 

        } 

    }
}
