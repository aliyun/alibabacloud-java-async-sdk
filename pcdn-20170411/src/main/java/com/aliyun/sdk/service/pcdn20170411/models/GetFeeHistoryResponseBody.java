// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFeeHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>GetFeeHistoryResponseBody</p>
 */
public class GetFeeHistoryResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("FeeList")
    private FeeList feeList;

    @NameInMap("Pager")
    private Pager pager;

    @NameInMap("RequestId")
    private String requestId;

    private GetFeeHistoryResponseBody(Builder builder) {
        this.code = builder.code;
        this.feeList = builder.feeList;
        this.pager = builder.pager;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFeeHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return feeList
     */
    public FeeList getFeeList() {
        return this.feeList;
    }

    /**
     * @return pager
     */
    public Pager getPager() {
        return this.pager;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integer code; 
        private FeeList feeList; 
        private Pager pager; 
        private String requestId; 

        /**
         * Code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * FeeList.
         */
        public Builder feeList(FeeList feeList) {
            this.feeList = feeList;
            return this;
        }

        /**
         * Pager.
         */
        public Builder pager(Pager pager) {
            this.pager = pager;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetFeeHistoryResponseBody build() {
            return new GetFeeHistoryResponseBody(this);
        } 

    } 

    public static class Fee extends TeaModel {
        @NameInMap("BusinessType")
        private String businessType;

        @NameInMap("Date")
        private String date;

        @NameInMap("EndDate")
        private String endDate;

        @NameInMap("FlowOut")
        private Integer flowOut;

        @NameInMap("LevelThreeBandwidth")
        private Integer levelThreeBandwidth;

        @NameInMap("LevelThreeTraffic")
        private Integer levelThreeTraffic;

        @NameInMap("LevelTwoBandwidth")
        private Integer levelTwoBandwidth;

        @NameInMap("LevelTwoTraffic")
        private Integer levelTwoTraffic;

        @NameInMap("Mode")
        private String mode;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("StartDate")
        private String startDate;

        @NameInMap("TimeSpan")
        private String timeSpan;

        @NameInMap("TotalBandwidth")
        private Integer totalBandwidth;

        @NameInMap("TotalTraffic")
        private Integer totalTraffic;

        private Fee(Builder builder) {
            this.businessType = builder.businessType;
            this.date = builder.date;
            this.endDate = builder.endDate;
            this.flowOut = builder.flowOut;
            this.levelThreeBandwidth = builder.levelThreeBandwidth;
            this.levelThreeTraffic = builder.levelThreeTraffic;
            this.levelTwoBandwidth = builder.levelTwoBandwidth;
            this.levelTwoTraffic = builder.levelTwoTraffic;
            this.mode = builder.mode;
            this.resourceId = builder.resourceId;
            this.startDate = builder.startDate;
            this.timeSpan = builder.timeSpan;
            this.totalBandwidth = builder.totalBandwidth;
            this.totalTraffic = builder.totalTraffic;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fee create() {
            return builder().build();
        }

        /**
         * @return businessType
         */
        public String getBusinessType() {
            return this.businessType;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return endDate
         */
        public String getEndDate() {
            return this.endDate;
        }

        /**
         * @return flowOut
         */
        public Integer getFlowOut() {
            return this.flowOut;
        }

        /**
         * @return levelThreeBandwidth
         */
        public Integer getLevelThreeBandwidth() {
            return this.levelThreeBandwidth;
        }

        /**
         * @return levelThreeTraffic
         */
        public Integer getLevelThreeTraffic() {
            return this.levelThreeTraffic;
        }

        /**
         * @return levelTwoBandwidth
         */
        public Integer getLevelTwoBandwidth() {
            return this.levelTwoBandwidth;
        }

        /**
         * @return levelTwoTraffic
         */
        public Integer getLevelTwoTraffic() {
            return this.levelTwoTraffic;
        }

        /**
         * @return mode
         */
        public String getMode() {
            return this.mode;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return startDate
         */
        public String getStartDate() {
            return this.startDate;
        }

        /**
         * @return timeSpan
         */
        public String getTimeSpan() {
            return this.timeSpan;
        }

        /**
         * @return totalBandwidth
         */
        public Integer getTotalBandwidth() {
            return this.totalBandwidth;
        }

        /**
         * @return totalTraffic
         */
        public Integer getTotalTraffic() {
            return this.totalTraffic;
        }

        public static final class Builder {
            private String businessType; 
            private String date; 
            private String endDate; 
            private Integer flowOut; 
            private Integer levelThreeBandwidth; 
            private Integer levelThreeTraffic; 
            private Integer levelTwoBandwidth; 
            private Integer levelTwoTraffic; 
            private String mode; 
            private String resourceId; 
            private String startDate; 
            private String timeSpan; 
            private Integer totalBandwidth; 
            private Integer totalTraffic; 

            /**
             * BusinessType.
             */
            public Builder businessType(String businessType) {
                this.businessType = businessType;
                return this;
            }

            /**
             * Date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * EndDate.
             */
            public Builder endDate(String endDate) {
                this.endDate = endDate;
                return this;
            }

            /**
             * FlowOut.
             */
            public Builder flowOut(Integer flowOut) {
                this.flowOut = flowOut;
                return this;
            }

            /**
             * LevelThreeBandwidth.
             */
            public Builder levelThreeBandwidth(Integer levelThreeBandwidth) {
                this.levelThreeBandwidth = levelThreeBandwidth;
                return this;
            }

            /**
             * LevelThreeTraffic.
             */
            public Builder levelThreeTraffic(Integer levelThreeTraffic) {
                this.levelThreeTraffic = levelThreeTraffic;
                return this;
            }

            /**
             * LevelTwoBandwidth.
             */
            public Builder levelTwoBandwidth(Integer levelTwoBandwidth) {
                this.levelTwoBandwidth = levelTwoBandwidth;
                return this;
            }

            /**
             * LevelTwoTraffic.
             */
            public Builder levelTwoTraffic(Integer levelTwoTraffic) {
                this.levelTwoTraffic = levelTwoTraffic;
                return this;
            }

            /**
             * Mode.
             */
            public Builder mode(String mode) {
                this.mode = mode;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * StartDate.
             */
            public Builder startDate(String startDate) {
                this.startDate = startDate;
                return this;
            }

            /**
             * TimeSpan.
             */
            public Builder timeSpan(String timeSpan) {
                this.timeSpan = timeSpan;
                return this;
            }

            /**
             * TotalBandwidth.
             */
            public Builder totalBandwidth(Integer totalBandwidth) {
                this.totalBandwidth = totalBandwidth;
                return this;
            }

            /**
             * TotalTraffic.
             */
            public Builder totalTraffic(Integer totalTraffic) {
                this.totalTraffic = totalTraffic;
                return this;
            }

            public Fee build() {
                return new Fee(this);
            } 

        } 

    }
    public static class FeeList extends TeaModel {
        @NameInMap("Fee")
        private java.util.List < Fee> fee;

        private FeeList(Builder builder) {
            this.fee = builder.fee;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FeeList create() {
            return builder().build();
        }

        /**
         * @return fee
         */
        public java.util.List < Fee> getFee() {
            return this.fee;
        }

        public static final class Builder {
            private java.util.List < Fee> fee; 

            /**
             * Fee.
             */
            public Builder fee(java.util.List < Fee> fee) {
                this.fee = fee;
                return this;
            }

            public FeeList build() {
                return new FeeList(this);
            } 

        } 

    }
    public static class Pager extends TeaModel {
        @NameInMap("Page")
        private Integer page;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Pager(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pager create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public Pager build() {
                return new Pager(this);
            } 

        } 

    }
}
