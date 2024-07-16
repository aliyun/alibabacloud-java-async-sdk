// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCardDayUsagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCardDayUsagesResponseBody</p>
 */
public class ListCardDayUsagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cards")
    private java.util.List < Cards> cards;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListCardDayUsagesResponseBody(Builder builder) {
        this.cards = builder.cards;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCardDayUsagesResponseBody create() {
        return builder().build();
    }

    /**
     * @return cards
     */
    public java.util.List < Cards> getCards() {
        return this.cards;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Cards> cards; 
        private String requestId; 

        /**
         * Cards.
         */
        public Builder cards(java.util.List < Cards> cards) {
            this.cards = cards;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListCardDayUsagesResponseBody build() {
            return new ListCardDayUsagesResponseBody(this);
        } 

    } 

    public static class CardDayUsages extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Day")
        private String day;

        @com.aliyun.core.annotation.NameInMap("UsageData")
        private String usageData;

        private CardDayUsages(Builder builder) {
            this.day = builder.day;
            this.usageData = builder.usageData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CardDayUsages create() {
            return builder().build();
        }

        /**
         * @return day
         */
        public String getDay() {
            return this.day;
        }

        /**
         * @return usageData
         */
        public String getUsageData() {
            return this.usageData;
        }

        public static final class Builder {
            private String day; 
            private String usageData; 

            /**
             * Day.
             */
            public Builder day(String day) {
                this.day = day;
                return this;
            }

            /**
             * UsageData.
             */
            public Builder usageData(String usageData) {
                this.usageData = usageData;
                return this;
            }

            public CardDayUsages build() {
                return new CardDayUsages(this);
            } 

        } 

    }
    public static class UsageDataMonths extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CardDayUsages")
        private java.util.List < CardDayUsages> cardDayUsages;

        @com.aliyun.core.annotation.NameInMap("Month")
        private String month;

        @com.aliyun.core.annotation.NameInMap("UsageDataMonth")
        private String usageDataMonth;

        private UsageDataMonths(Builder builder) {
            this.cardDayUsages = builder.cardDayUsages;
            this.month = builder.month;
            this.usageDataMonth = builder.usageDataMonth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UsageDataMonths create() {
            return builder().build();
        }

        /**
         * @return cardDayUsages
         */
        public java.util.List < CardDayUsages> getCardDayUsages() {
            return this.cardDayUsages;
        }

        /**
         * @return month
         */
        public String getMonth() {
            return this.month;
        }

        /**
         * @return usageDataMonth
         */
        public String getUsageDataMonth() {
            return this.usageDataMonth;
        }

        public static final class Builder {
            private java.util.List < CardDayUsages> cardDayUsages; 
            private String month; 
            private String usageDataMonth; 

            /**
             * CardDayUsages.
             */
            public Builder cardDayUsages(java.util.List < CardDayUsages> cardDayUsages) {
                this.cardDayUsages = cardDayUsages;
                return this;
            }

            /**
             * Month.
             */
            public Builder month(String month) {
                this.month = month;
                return this;
            }

            /**
             * UsageDataMonth.
             */
            public Builder usageDataMonth(String usageDataMonth) {
                this.usageDataMonth = usageDataMonth;
                return this;
            }

            public UsageDataMonths build() {
                return new UsageDataMonths(this);
            } 

        } 

    }
    public static class Cards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Iccid")
        private String iccid;

        @com.aliyun.core.annotation.NameInMap("UsageDataMonths")
        private java.util.List < UsageDataMonths> usageDataMonths;

        private Cards(Builder builder) {
            this.iccid = builder.iccid;
            this.usageDataMonths = builder.usageDataMonths;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cards create() {
            return builder().build();
        }

        /**
         * @return iccid
         */
        public String getIccid() {
            return this.iccid;
        }

        /**
         * @return usageDataMonths
         */
        public java.util.List < UsageDataMonths> getUsageDataMonths() {
            return this.usageDataMonths;
        }

        public static final class Builder {
            private String iccid; 
            private java.util.List < UsageDataMonths> usageDataMonths; 

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder iccid(String iccid) {
                this.iccid = iccid;
                return this;
            }

            /**
             * UsageDataMonths.
             */
            public Builder usageDataMonths(java.util.List < UsageDataMonths> usageDataMonths) {
                this.usageDataMonths = usageDataMonths;
                return this;
            }

            public Cards build() {
                return new Cards(this);
            } 

        } 

    }
}
