// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCardUsagesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCardUsagesResponseBody</p>
 */
public class ListCardUsagesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cards")
    private java.util.List < Cards> cards;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private String totalCount;

    private ListCardUsagesResponseBody(Builder builder) {
        this.cards = builder.cards;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCardUsagesResponseBody create() {
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

    /**
     * @return totalCount
     */
    public String getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Cards> cards; 
        private String requestId; 
        private String totalCount; 

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

        /**
         * TotalCount.
         */
        public Builder totalCount(String totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListCardUsagesResponseBody build() {
            return new ListCardUsagesResponseBody(this);
        } 

    } 

    public static class Cards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Iccid")
        private String iccid;

        @com.aliyun.core.annotation.NameInMap("UsageDataMonth")
        private Long usageDataMonth;

        private Cards(Builder builder) {
            this.iccid = builder.iccid;
            this.usageDataMonth = builder.usageDataMonth;
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
         * @return usageDataMonth
         */
        public Long getUsageDataMonth() {
            return this.usageDataMonth;
        }

        public static final class Builder {
            private String iccid; 
            private Long usageDataMonth; 

            /**
             * 代表资源一级ID的资源属性字段
             */
            public Builder iccid(String iccid) {
                this.iccid = iccid;
                return this;
            }

            /**
             * UsageDataMonth.
             */
            public Builder usageDataMonth(Long usageDataMonth) {
                this.usageDataMonth = usageDataMonth;
                return this;
            }

            public Cards build() {
                return new Cards(this);
            } 

        } 

    }
}
