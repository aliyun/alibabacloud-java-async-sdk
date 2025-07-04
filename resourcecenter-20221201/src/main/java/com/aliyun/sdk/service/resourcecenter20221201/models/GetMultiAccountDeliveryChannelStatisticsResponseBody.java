// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

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
 * {@link GetMultiAccountDeliveryChannelStatisticsResponseBody} extends {@link TeaModel}
 *
 * <p>GetMultiAccountDeliveryChannelStatisticsResponseBody</p>
 */
public class GetMultiAccountDeliveryChannelStatisticsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeliveryChannelStatistics")
    private DeliveryChannelStatistics deliveryChannelStatistics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMultiAccountDeliveryChannelStatisticsResponseBody(Builder builder) {
        this.deliveryChannelStatistics = builder.deliveryChannelStatistics;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultiAccountDeliveryChannelStatisticsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deliveryChannelStatistics
     */
    public DeliveryChannelStatistics getDeliveryChannelStatistics() {
        return this.deliveryChannelStatistics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private DeliveryChannelStatistics deliveryChannelStatistics; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMultiAccountDeliveryChannelStatisticsResponseBody model) {
            this.deliveryChannelStatistics = model.deliveryChannelStatistics;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The statistics on the delivery channel.</p>
         */
        public Builder deliveryChannelStatistics(DeliveryChannelStatistics deliveryChannelStatistics) {
            this.deliveryChannelStatistics = deliveryChannelStatistics;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>80DF0610-504C-56D7-BDCF-7C92FD687***</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMultiAccountDeliveryChannelStatisticsResponseBody build() {
            return new GetMultiAccountDeliveryChannelStatisticsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMultiAccountDeliveryChannelStatisticsResponseBody} extends {@link TeaModel}
     *
     * <p>GetMultiAccountDeliveryChannelStatisticsResponseBody</p>
     */
    public static class DeliveryChannelStatistics extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeliveryChannelId")
        private String deliveryChannelId;

        @com.aliyun.core.annotation.NameInMap("DeliveryChannelName")
        private String deliveryChannelName;

        @com.aliyun.core.annotation.NameInMap("LatestChangeDeliveryTime")
        private String latestChangeDeliveryTime;

        @com.aliyun.core.annotation.NameInMap("LatestSnapshotDeliveryTime")
        private String latestSnapshotDeliveryTime;

        private DeliveryChannelStatistics(Builder builder) {
            this.deliveryChannelId = builder.deliveryChannelId;
            this.deliveryChannelName = builder.deliveryChannelName;
            this.latestChangeDeliveryTime = builder.latestChangeDeliveryTime;
            this.latestSnapshotDeliveryTime = builder.latestSnapshotDeliveryTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliveryChannelStatistics create() {
            return builder().build();
        }

        /**
         * @return deliveryChannelId
         */
        public String getDeliveryChannelId() {
            return this.deliveryChannelId;
        }

        /**
         * @return deliveryChannelName
         */
        public String getDeliveryChannelName() {
            return this.deliveryChannelName;
        }

        /**
         * @return latestChangeDeliveryTime
         */
        public String getLatestChangeDeliveryTime() {
            return this.latestChangeDeliveryTime;
        }

        /**
         * @return latestSnapshotDeliveryTime
         */
        public String getLatestSnapshotDeliveryTime() {
            return this.latestSnapshotDeliveryTime;
        }

        public static final class Builder {
            private String deliveryChannelId; 
            private String deliveryChannelName; 
            private String latestChangeDeliveryTime; 
            private String latestSnapshotDeliveryTime; 

            private Builder() {
            } 

            private Builder(DeliveryChannelStatistics model) {
                this.deliveryChannelId = model.deliveryChannelId;
                this.deliveryChannelName = model.deliveryChannelName;
                this.latestChangeDeliveryTime = model.latestChangeDeliveryTime;
                this.latestSnapshotDeliveryTime = model.latestSnapshotDeliveryTime;
            } 

            /**
             * <p>The ID of the delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>dc-6q79dm4o9***</p>
             */
            public Builder deliveryChannelId(String deliveryChannelId) {
                this.deliveryChannelId = deliveryChannelId;
                return this;
            }

            /**
             * <p>The name of the delivery channel.</p>
             * 
             * <strong>example:</strong>
             * <p>test-multi-account-delivery</p>
             */
            public Builder deliveryChannelName(String deliveryChannelName) {
                this.deliveryChannelName = deliveryChannelName;
                return this;
            }

            /**
             * <p>The last delivery time of resource configuration change events.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-03T16:05:15Z</p>
             */
            public Builder latestChangeDeliveryTime(String latestChangeDeliveryTime) {
                this.latestChangeDeliveryTime = latestChangeDeliveryTime;
                return this;
            }

            /**
             * <p>The last delivery time of scheduled resource snapshots.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-06-03T16:00:00Z</p>
             */
            public Builder latestSnapshotDeliveryTime(String latestSnapshotDeliveryTime) {
                this.latestSnapshotDeliveryTime = latestSnapshotDeliveryTime;
                return this;
            }

            public DeliveryChannelStatistics build() {
                return new DeliveryChannelStatistics(this);
            } 

        } 

    }
}
