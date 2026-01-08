// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link GetMessageCampaignInsightsResponseBody} extends {@link TeaModel}
 *
 * <p>GetMessageCampaignInsightsResponseBody</p>
 */
public class GetMessageCampaignInsightsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetMessageCampaignInsightsResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMessageCampaignInsightsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetMessageCampaignInsightsResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetMessageCampaignInsightsResponseBody build() {
            return new GetMessageCampaignInsightsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMessageCampaignInsightsResponseBody} extends {@link TeaModel}
     *
     * <p>GetMessageCampaignInsightsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DateStart")
        private String dateStart;

        @com.aliyun.core.annotation.NameInMap("DateStop")
        private String dateStop;

        @com.aliyun.core.annotation.NameInMap("MarketingMessagesCostPerDelivered")
        private String marketingMessagesCostPerDelivered;

        @com.aliyun.core.annotation.NameInMap("MarketingMessagesCostPerLinkBtnClick")
        private String marketingMessagesCostPerLinkBtnClick;

        @com.aliyun.core.annotation.NameInMap("MarketingMessagesDelivered")
        private String marketingMessagesDelivered;

        @com.aliyun.core.annotation.NameInMap("MarketingMessagesDeliveryRate")
        private String marketingMessagesDeliveryRate;

        @com.aliyun.core.annotation.NameInMap("MarketingMessagesLinkBtnClick")
        private String marketingMessagesLinkBtnClick;

        @com.aliyun.core.annotation.NameInMap("MarketingMessagesLinkBtnClickRate")
        private String marketingMessagesLinkBtnClickRate;

        @com.aliyun.core.annotation.NameInMap("MarketingMessagesReadRate")
        private String marketingMessagesReadRate;

        @com.aliyun.core.annotation.NameInMap("MarketingMessagesSpend")
        private String marketingMessagesSpend;

        private Data(Builder builder) {
            this.dateStart = builder.dateStart;
            this.dateStop = builder.dateStop;
            this.marketingMessagesCostPerDelivered = builder.marketingMessagesCostPerDelivered;
            this.marketingMessagesCostPerLinkBtnClick = builder.marketingMessagesCostPerLinkBtnClick;
            this.marketingMessagesDelivered = builder.marketingMessagesDelivered;
            this.marketingMessagesDeliveryRate = builder.marketingMessagesDeliveryRate;
            this.marketingMessagesLinkBtnClick = builder.marketingMessagesLinkBtnClick;
            this.marketingMessagesLinkBtnClickRate = builder.marketingMessagesLinkBtnClickRate;
            this.marketingMessagesReadRate = builder.marketingMessagesReadRate;
            this.marketingMessagesSpend = builder.marketingMessagesSpend;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dateStart
         */
        public String getDateStart() {
            return this.dateStart;
        }

        /**
         * @return dateStop
         */
        public String getDateStop() {
            return this.dateStop;
        }

        /**
         * @return marketingMessagesCostPerDelivered
         */
        public String getMarketingMessagesCostPerDelivered() {
            return this.marketingMessagesCostPerDelivered;
        }

        /**
         * @return marketingMessagesCostPerLinkBtnClick
         */
        public String getMarketingMessagesCostPerLinkBtnClick() {
            return this.marketingMessagesCostPerLinkBtnClick;
        }

        /**
         * @return marketingMessagesDelivered
         */
        public String getMarketingMessagesDelivered() {
            return this.marketingMessagesDelivered;
        }

        /**
         * @return marketingMessagesDeliveryRate
         */
        public String getMarketingMessagesDeliveryRate() {
            return this.marketingMessagesDeliveryRate;
        }

        /**
         * @return marketingMessagesLinkBtnClick
         */
        public String getMarketingMessagesLinkBtnClick() {
            return this.marketingMessagesLinkBtnClick;
        }

        /**
         * @return marketingMessagesLinkBtnClickRate
         */
        public String getMarketingMessagesLinkBtnClickRate() {
            return this.marketingMessagesLinkBtnClickRate;
        }

        /**
         * @return marketingMessagesReadRate
         */
        public String getMarketingMessagesReadRate() {
            return this.marketingMessagesReadRate;
        }

        /**
         * @return marketingMessagesSpend
         */
        public String getMarketingMessagesSpend() {
            return this.marketingMessagesSpend;
        }

        public static final class Builder {
            private String dateStart; 
            private String dateStop; 
            private String marketingMessagesCostPerDelivered; 
            private String marketingMessagesCostPerLinkBtnClick; 
            private String marketingMessagesDelivered; 
            private String marketingMessagesDeliveryRate; 
            private String marketingMessagesLinkBtnClick; 
            private String marketingMessagesLinkBtnClickRate; 
            private String marketingMessagesReadRate; 
            private String marketingMessagesSpend; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dateStart = model.dateStart;
                this.dateStop = model.dateStop;
                this.marketingMessagesCostPerDelivered = model.marketingMessagesCostPerDelivered;
                this.marketingMessagesCostPerLinkBtnClick = model.marketingMessagesCostPerLinkBtnClick;
                this.marketingMessagesDelivered = model.marketingMessagesDelivered;
                this.marketingMessagesDeliveryRate = model.marketingMessagesDeliveryRate;
                this.marketingMessagesLinkBtnClick = model.marketingMessagesLinkBtnClick;
                this.marketingMessagesLinkBtnClickRate = model.marketingMessagesLinkBtnClickRate;
                this.marketingMessagesReadRate = model.marketingMessagesReadRate;
                this.marketingMessagesSpend = model.marketingMessagesSpend;
            } 

            /**
             * DateStart.
             */
            public Builder dateStart(String dateStart) {
                this.dateStart = dateStart;
                return this;
            }

            /**
             * DateStop.
             */
            public Builder dateStop(String dateStop) {
                this.dateStop = dateStop;
                return this;
            }

            /**
             * MarketingMessagesCostPerDelivered.
             */
            public Builder marketingMessagesCostPerDelivered(String marketingMessagesCostPerDelivered) {
                this.marketingMessagesCostPerDelivered = marketingMessagesCostPerDelivered;
                return this;
            }

            /**
             * MarketingMessagesCostPerLinkBtnClick.
             */
            public Builder marketingMessagesCostPerLinkBtnClick(String marketingMessagesCostPerLinkBtnClick) {
                this.marketingMessagesCostPerLinkBtnClick = marketingMessagesCostPerLinkBtnClick;
                return this;
            }

            /**
             * MarketingMessagesDelivered.
             */
            public Builder marketingMessagesDelivered(String marketingMessagesDelivered) {
                this.marketingMessagesDelivered = marketingMessagesDelivered;
                return this;
            }

            /**
             * MarketingMessagesDeliveryRate.
             */
            public Builder marketingMessagesDeliveryRate(String marketingMessagesDeliveryRate) {
                this.marketingMessagesDeliveryRate = marketingMessagesDeliveryRate;
                return this;
            }

            /**
             * MarketingMessagesLinkBtnClick.
             */
            public Builder marketingMessagesLinkBtnClick(String marketingMessagesLinkBtnClick) {
                this.marketingMessagesLinkBtnClick = marketingMessagesLinkBtnClick;
                return this;
            }

            /**
             * MarketingMessagesLinkBtnClickRate.
             */
            public Builder marketingMessagesLinkBtnClickRate(String marketingMessagesLinkBtnClickRate) {
                this.marketingMessagesLinkBtnClickRate = marketingMessagesLinkBtnClickRate;
                return this;
            }

            /**
             * MarketingMessagesReadRate.
             */
            public Builder marketingMessagesReadRate(String marketingMessagesReadRate) {
                this.marketingMessagesReadRate = marketingMessagesReadRate;
                return this;
            }

            /**
             * MarketingMessagesSpend.
             */
            public Builder marketingMessagesSpend(String marketingMessagesSpend) {
                this.marketingMessagesSpend = marketingMessagesSpend;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
