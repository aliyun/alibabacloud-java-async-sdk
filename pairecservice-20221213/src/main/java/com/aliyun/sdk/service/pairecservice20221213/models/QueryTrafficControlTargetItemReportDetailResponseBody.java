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
 * {@link QueryTrafficControlTargetItemReportDetailResponseBody} extends {@link TeaModel}
 *
 * <p>QueryTrafficControlTargetItemReportDetailResponseBody</p>
 */
public class QueryTrafficControlTargetItemReportDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TrafficControlTargetItemReportDetail")
    private TrafficControlTargetItemReportDetail trafficControlTargetItemReportDetail;

    private QueryTrafficControlTargetItemReportDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.trafficControlTargetItemReportDetail = builder.trafficControlTargetItemReportDetail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryTrafficControlTargetItemReportDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return trafficControlTargetItemReportDetail
     */
    public TrafficControlTargetItemReportDetail getTrafficControlTargetItemReportDetail() {
        return this.trafficControlTargetItemReportDetail;
    }

    public static final class Builder {
        private String requestId; 
        private TrafficControlTargetItemReportDetail trafficControlTargetItemReportDetail; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TrafficControlTargetItemReportDetail.
         */
        public Builder trafficControlTargetItemReportDetail(TrafficControlTargetItemReportDetail trafficControlTargetItemReportDetail) {
            this.trafficControlTargetItemReportDetail = trafficControlTargetItemReportDetail;
            return this;
        }

        public QueryTrafficControlTargetItemReportDetailResponseBody build() {
            return new QueryTrafficControlTargetItemReportDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryTrafficControlTargetItemReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTrafficControlTargetItemReportDetailResponseBody</p>
     */
    public static class ItemControlTailReportDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.Map<String, ?> features;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("TargetProgress")
        private String targetProgress;

        @com.aliyun.core.annotation.NameInMap("TargetTraffic")
        private Long targetTraffic;

        private ItemControlTailReportDetails(Builder builder) {
            this.features = builder.features;
            this.itemId = builder.itemId;
            this.targetProgress = builder.targetProgress;
            this.targetTraffic = builder.targetTraffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemControlTailReportDetails create() {
            return builder().build();
        }

        /**
         * @return features
         */
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return targetProgress
         */
        public String getTargetProgress() {
            return this.targetProgress;
        }

        /**
         * @return targetTraffic
         */
        public Long getTargetTraffic() {
            return this.targetTraffic;
        }

        public static final class Builder {
            private java.util.Map<String, ?> features; 
            private String itemId; 
            private String targetProgress; 
            private Long targetTraffic; 

            /**
             * Features.
             */
            public Builder features(java.util.Map<String, ?> features) {
                this.features = features;
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
             * TargetProgress.
             */
            public Builder targetProgress(String targetProgress) {
                this.targetProgress = targetProgress;
                return this;
            }

            /**
             * TargetTraffic.
             */
            public Builder targetTraffic(Long targetTraffic) {
                this.targetTraffic = targetTraffic;
                return this;
            }

            public ItemControlTailReportDetails build() {
                return new ItemControlTailReportDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTrafficControlTargetItemReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTrafficControlTargetItemReportDetailResponseBody</p>
     */
    public static class ItemControlTopReportDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Features")
        private java.util.Map<String, ?> features;

        @com.aliyun.core.annotation.NameInMap("ItemId")
        private String itemId;

        @com.aliyun.core.annotation.NameInMap("TargetProgress")
        private String targetProgress;

        @com.aliyun.core.annotation.NameInMap("TargetTraffic")
        private Long targetTraffic;

        private ItemControlTopReportDetails(Builder builder) {
            this.features = builder.features;
            this.itemId = builder.itemId;
            this.targetProgress = builder.targetProgress;
            this.targetTraffic = builder.targetTraffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ItemControlTopReportDetails create() {
            return builder().build();
        }

        /**
         * @return features
         */
        public java.util.Map<String, ?> getFeatures() {
            return this.features;
        }

        /**
         * @return itemId
         */
        public String getItemId() {
            return this.itemId;
        }

        /**
         * @return targetProgress
         */
        public String getTargetProgress() {
            return this.targetProgress;
        }

        /**
         * @return targetTraffic
         */
        public Long getTargetTraffic() {
            return this.targetTraffic;
        }

        public static final class Builder {
            private java.util.Map<String, ?> features; 
            private String itemId; 
            private String targetProgress; 
            private Long targetTraffic; 

            /**
             * Features.
             */
            public Builder features(java.util.Map<String, ?> features) {
                this.features = features;
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
             * TargetProgress.
             */
            public Builder targetProgress(String targetProgress) {
                this.targetProgress = targetProgress;
                return this;
            }

            /**
             * TargetTraffic.
             */
            public Builder targetTraffic(Long targetTraffic) {
                this.targetTraffic = targetTraffic;
                return this;
            }

            public ItemControlTopReportDetails build() {
                return new ItemControlTopReportDetails(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryTrafficControlTargetItemReportDetailResponseBody} extends {@link TeaModel}
     *
     * <p>QueryTrafficControlTargetItemReportDetailResponseBody</p>
     */
    public static class TrafficControlTargetItemReportDetail extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ItemControlTailReportDetails")
        private java.util.List<ItemControlTailReportDetails> itemControlTailReportDetails;

        @com.aliyun.core.annotation.NameInMap("ItemControlTopReportDetails")
        private java.util.List<ItemControlTopReportDetails> itemControlTopReportDetails;

        private TrafficControlTargetItemReportDetail(Builder builder) {
            this.itemControlTailReportDetails = builder.itemControlTailReportDetails;
            this.itemControlTopReportDetails = builder.itemControlTopReportDetails;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TrafficControlTargetItemReportDetail create() {
            return builder().build();
        }

        /**
         * @return itemControlTailReportDetails
         */
        public java.util.List<ItemControlTailReportDetails> getItemControlTailReportDetails() {
            return this.itemControlTailReportDetails;
        }

        /**
         * @return itemControlTopReportDetails
         */
        public java.util.List<ItemControlTopReportDetails> getItemControlTopReportDetails() {
            return this.itemControlTopReportDetails;
        }

        public static final class Builder {
            private java.util.List<ItemControlTailReportDetails> itemControlTailReportDetails; 
            private java.util.List<ItemControlTopReportDetails> itemControlTopReportDetails; 

            /**
             * ItemControlTailReportDetails.
             */
            public Builder itemControlTailReportDetails(java.util.List<ItemControlTailReportDetails> itemControlTailReportDetails) {
                this.itemControlTailReportDetails = itemControlTailReportDetails;
                return this;
            }

            /**
             * ItemControlTopReportDetails.
             */
            public Builder itemControlTopReportDetails(java.util.List<ItemControlTopReportDetails> itemControlTopReportDetails) {
                this.itemControlTopReportDetails = itemControlTopReportDetails;
                return this;
            }

            public TrafficControlTargetItemReportDetail build() {
                return new TrafficControlTargetItemReportDetail(this);
            } 

        } 

    }
}
