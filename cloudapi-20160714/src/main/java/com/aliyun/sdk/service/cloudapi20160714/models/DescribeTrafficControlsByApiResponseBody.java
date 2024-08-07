// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTrafficControlsByApiResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTrafficControlsByApiResponseBody</p>
 */
public class DescribeTrafficControlsByApiResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficControlItems")
    private TrafficControlItems trafficControlItems;

    private DescribeTrafficControlsByApiResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficControlItems = builder.trafficControlItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTrafficControlsByApiResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficControlItems
     */
    public TrafficControlItems getTrafficControlItems() {
        return this.trafficControlItems;
    }

    public static final class Builder {
        private String requestId; 
        private TrafficControlItems trafficControlItems; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The returned throttling policy information. It is an array consisting of TrafficControlItem data.
         */
        public Builder trafficControlItems(TrafficControlItems trafficControlItems) {
            this.trafficControlItems = trafficControlItems;
            return this;
        }

        public DescribeTrafficControlsByApiResponseBody build() {
            return new DescribeTrafficControlsByApiResponseBody(this);
        } 

    } 

    public static class TrafficControlItem extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BoundTime")
        private String boundTime;

        @com.aliyun.core.annotation.NameInMap("TrafficControlItemId")
        private String trafficControlItemId;

        @com.aliyun.core.annotation.NameInMap("TrafficControlItemName")
        private String trafficControlItemName;

        private TrafficControlItem(Builder builder) {
            this.boundTime = builder.boundTime;
            this.trafficControlItemId = builder.trafficControlItemId;
            this.trafficControlItemName = builder.trafficControlItemName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficControlItem create() {
            return builder().build();
        }

        /**
         * @return boundTime
         */
        public String getBoundTime() {
            return this.boundTime;
        }

        /**
         * @return trafficControlItemId
         */
        public String getTrafficControlItemId() {
            return this.trafficControlItemId;
        }

        /**
         * @return trafficControlItemName
         */
        public String getTrafficControlItemName() {
            return this.trafficControlItemName;
        }

        public static final class Builder {
            private String boundTime; 
            private String trafficControlItemId; 
            private String trafficControlItemName; 

            /**
             * The binding time of the policy.
             */
            public Builder boundTime(String boundTime) {
                this.boundTime = boundTime;
                return this;
            }

            /**
             * The ID of the throttling policy.
             */
            public Builder trafficControlItemId(String trafficControlItemId) {
                this.trafficControlItemId = trafficControlItemId;
                return this;
            }

            /**
             * The name of the throttling policy.
             */
            public Builder trafficControlItemName(String trafficControlItemName) {
                this.trafficControlItemName = trafficControlItemName;
                return this;
            }

            public TrafficControlItem build() {
                return new TrafficControlItem(this);
            } 

        } 

    }
    public static class TrafficControlItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TrafficControlItem")
        private java.util.List < TrafficControlItem> trafficControlItem;

        private TrafficControlItems(Builder builder) {
            this.trafficControlItem = builder.trafficControlItem;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficControlItems create() {
            return builder().build();
        }

        /**
         * @return trafficControlItem
         */
        public java.util.List < TrafficControlItem> getTrafficControlItem() {
            return this.trafficControlItem;
        }

        public static final class Builder {
            private java.util.List < TrafficControlItem> trafficControlItem; 

            /**
             * TrafficControlItem.
             */
            public Builder trafficControlItem(java.util.List < TrafficControlItem> trafficControlItem) {
                this.trafficControlItem = trafficControlItem;
                return this;
            }

            public TrafficControlItems build() {
                return new TrafficControlItems(this);
            } 

        } 

    }
}
