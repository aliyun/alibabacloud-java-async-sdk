// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dysms20170620.models;

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
 * {@link QueryDailyBillInfoLeafNewResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDailyBillInfoLeafNewResponseBody</p>
 */
public class QueryDailyBillInfoLeafNewResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("List")
    private List list;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryDailyBillInfoLeafNewResponseBody(Builder builder) {
        this.list = builder.list;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDailyBillInfoLeafNewResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return list
     */
    public List getList() {
        return this.list;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private List list; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryDailyBillInfoLeafNewResponseBody model) {
            this.list = model.list;
            this.requestId = model.requestId;
        } 

        /**
         * List.
         */
        public Builder list(List list) {
            this.list = list;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryDailyBillInfoLeafNewResponseBody build() {
            return new QueryDailyBillInfoLeafNewResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDailyBillInfoLeafNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDailyBillInfoLeafNewResponseBody</p>
     */
    public static class DailyBillDetailInfoDTO extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddCount")
        private Long addCount;

        @com.aliyun.core.annotation.NameInMap("AddDate")
        private String addDate;

        @com.aliyun.core.annotation.NameInMap("AddUnit")
        private String addUnit;

        @com.aliyun.core.annotation.NameInMap("BillAmount")
        private String billAmount;

        @com.aliyun.core.annotation.NameInMap("DetailItemName")
        private String detailItemName;

        @com.aliyun.core.annotation.NameInMap("SinglePrice")
        private String singlePrice;

        private DailyBillDetailInfoDTO(Builder builder) {
            this.addCount = builder.addCount;
            this.addDate = builder.addDate;
            this.addUnit = builder.addUnit;
            this.billAmount = builder.billAmount;
            this.detailItemName = builder.detailItemName;
            this.singlePrice = builder.singlePrice;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DailyBillDetailInfoDTO create() {
            return builder().build();
        }

        /**
         * @return addCount
         */
        public Long getAddCount() {
            return this.addCount;
        }

        /**
         * @return addDate
         */
        public String getAddDate() {
            return this.addDate;
        }

        /**
         * @return addUnit
         */
        public String getAddUnit() {
            return this.addUnit;
        }

        /**
         * @return billAmount
         */
        public String getBillAmount() {
            return this.billAmount;
        }

        /**
         * @return detailItemName
         */
        public String getDetailItemName() {
            return this.detailItemName;
        }

        /**
         * @return singlePrice
         */
        public String getSinglePrice() {
            return this.singlePrice;
        }

        public static final class Builder {
            private Long addCount; 
            private String addDate; 
            private String addUnit; 
            private String billAmount; 
            private String detailItemName; 
            private String singlePrice; 

            private Builder() {
            } 

            private Builder(DailyBillDetailInfoDTO model) {
                this.addCount = model.addCount;
                this.addDate = model.addDate;
                this.addUnit = model.addUnit;
                this.billAmount = model.billAmount;
                this.detailItemName = model.detailItemName;
                this.singlePrice = model.singlePrice;
            } 

            /**
             * AddCount.
             */
            public Builder addCount(Long addCount) {
                this.addCount = addCount;
                return this;
            }

            /**
             * AddDate.
             */
            public Builder addDate(String addDate) {
                this.addDate = addDate;
                return this;
            }

            /**
             * AddUnit.
             */
            public Builder addUnit(String addUnit) {
                this.addUnit = addUnit;
                return this;
            }

            /**
             * BillAmount.
             */
            public Builder billAmount(String billAmount) {
                this.billAmount = billAmount;
                return this;
            }

            /**
             * DetailItemName.
             */
            public Builder detailItemName(String detailItemName) {
                this.detailItemName = detailItemName;
                return this;
            }

            /**
             * SinglePrice.
             */
            public Builder singlePrice(String singlePrice) {
                this.singlePrice = singlePrice;
                return this;
            }

            public DailyBillDetailInfoDTO build() {
                return new DailyBillDetailInfoDTO(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDailyBillInfoLeafNewResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDailyBillInfoLeafNewResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DailyBillDetailInfoDTO")
        private java.util.List<DailyBillDetailInfoDTO> dailyBillDetailInfoDTO;

        private List(Builder builder) {
            this.dailyBillDetailInfoDTO = builder.dailyBillDetailInfoDTO;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return dailyBillDetailInfoDTO
         */
        public java.util.List<DailyBillDetailInfoDTO> getDailyBillDetailInfoDTO() {
            return this.dailyBillDetailInfoDTO;
        }

        public static final class Builder {
            private java.util.List<DailyBillDetailInfoDTO> dailyBillDetailInfoDTO; 

            private Builder() {
            } 

            private Builder(List model) {
                this.dailyBillDetailInfoDTO = model.dailyBillDetailInfoDTO;
            } 

            /**
             * DailyBillDetailInfoDTO.
             */
            public Builder dailyBillDetailInfoDTO(java.util.List<DailyBillDetailInfoDTO> dailyBillDetailInfoDTO) {
                this.dailyBillDetailInfoDTO = dailyBillDetailInfoDTO;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
}
