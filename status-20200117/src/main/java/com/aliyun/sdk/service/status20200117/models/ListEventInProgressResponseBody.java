// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.status20200117.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEventInProgressResponseBody} extends {@link TeaModel}
 *
 * <p>ListEventInProgressResponseBody</p>
 */
public class ListEventInProgressResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("RequestId")
    private String requestId;

    private ListEventInProgressResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEventInProgressResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
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

        public ListEventInProgressResponseBody build() {
            return new ListEventInProgressResponseBody(this);
        } 

    } 

    public static class EventUpdates extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("PublishTime")
        private Long publishTime;

        private EventUpdates(Builder builder) {
            this.content = builder.content;
            this.publishTime = builder.publishTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventUpdates create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return publishTime
         */
        public Long getPublishTime() {
            return this.publishTime;
        }

        public static final class Builder {
            private String content; 
            private Long publishTime; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * PublishTime.
             */
            public Builder publishTime(Long publishTime) {
                this.publishTime = publishTime;
                return this;
            }

            public EventUpdates build() {
                return new EventUpdates(this);
            } 

        } 

    }
    public static class Product extends TeaModel {
        @NameInMap("ProductId")
        private String productId;

        @NameInMap("ProductName")
        private String productName;

        private Product(Builder builder) {
            this.productId = builder.productId;
            this.productName = builder.productName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Product create() {
            return builder().build();
        }

        /**
         * @return productId
         */
        public String getProductId() {
            return this.productId;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        public static final class Builder {
            private String productId; 
            private String productName; 

            /**
             * ProductId.
             */
            public Builder productId(String productId) {
                this.productId = productId;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            public Product build() {
                return new Product(this);
            } 

        } 

    }
    public static class Region extends TeaModel {
        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("RegionName")
        private String regionName;

        private Region(Builder builder) {
            this.regionId = builder.regionId;
            this.regionName = builder.regionName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Region create() {
            return builder().build();
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        public static final class Builder {
            private String regionId; 
            private String regionName; 

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            public Region build() {
                return new Region(this);
            } 

        } 

    }
    public static class Impacts extends TeaModel {
        @NameInMap("Product")
        private Product product;

        @NameInMap("RecoveryTime")
        private Long recoveryTime;

        @NameInMap("Region")
        private Region region;

        @NameInMap("StartTime")
        private Long startTime;

        private Impacts(Builder builder) {
            this.product = builder.product;
            this.recoveryTime = builder.recoveryTime;
            this.region = builder.region;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Impacts create() {
            return builder().build();
        }

        /**
         * @return product
         */
        public Product getProduct() {
            return this.product;
        }

        /**
         * @return recoveryTime
         */
        public Long getRecoveryTime() {
            return this.recoveryTime;
        }

        /**
         * @return region
         */
        public Region getRegion() {
            return this.region;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Product product; 
            private Long recoveryTime; 
            private Region region; 
            private Long startTime; 

            /**
             * Product.
             */
            public Builder product(Product product) {
                this.product = product;
                return this;
            }

            /**
             * RecoveryTime.
             */
            public Builder recoveryTime(Long recoveryTime) {
                this.recoveryTime = recoveryTime;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(Region region) {
                this.region = region;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Impacts build() {
                return new Impacts(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("EventUpdates")
        private java.util.List < EventUpdates> eventUpdates;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Impacts")
        private java.util.List < Impacts> impacts;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Title")
        private String title;

        private Data(Builder builder) {
            this.eventUpdates = builder.eventUpdates;
            this.id = builder.id;
            this.impacts = builder.impacts;
            this.startTime = builder.startTime;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventUpdates
         */
        public java.util.List < EventUpdates> getEventUpdates() {
            return this.eventUpdates;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return impacts
         */
        public java.util.List < Impacts> getImpacts() {
            return this.impacts;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private java.util.List < EventUpdates> eventUpdates; 
            private Long id; 
            private java.util.List < Impacts> impacts; 
            private Long startTime; 
            private String title; 

            /**
             * EventUpdates.
             */
            public Builder eventUpdates(java.util.List < EventUpdates> eventUpdates) {
                this.eventUpdates = eventUpdates;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Impacts.
             */
            public Builder impacts(java.util.List < Impacts> impacts) {
                this.impacts = impacts;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
