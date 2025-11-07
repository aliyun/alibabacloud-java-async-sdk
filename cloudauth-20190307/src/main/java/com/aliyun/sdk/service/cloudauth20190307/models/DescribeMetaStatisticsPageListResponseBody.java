// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeMetaStatisticsPageListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeMetaStatisticsPageListResponseBody</p>
 */
public class DescribeMetaStatisticsPageListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private DescribeMetaStatisticsPageListResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeMetaStatisticsPageListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
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
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List<Items> items; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(DescribeMetaStatisticsPageListResponseBody model) {
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeMetaStatisticsPageListResponseBody build() {
            return new DescribeMetaStatisticsPageListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeMetaStatisticsPageListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeMetaStatisticsPageListResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Api")
        private String api;

        @com.aliyun.core.annotation.NameInMap("ApiName")
        private String apiName;

        @com.aliyun.core.annotation.NameInMap("BillCount")
        private Long billCount;

        @com.aliyun.core.annotation.NameInMap("BillRate")
        private String billRate;

        @com.aliyun.core.annotation.NameInMap("ChargeCount")
        private Long chargeCount;

        @com.aliyun.core.annotation.NameInMap("Date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("IspName")
        private String ispName;

        @com.aliyun.core.annotation.NameInMap("NoRecordCount")
        private Long noRecordCount;

        @com.aliyun.core.annotation.NameInMap("PassedCount")
        private Long passedCount;

        @com.aliyun.core.annotation.NameInMap("PassedRate")
        private String passedRate;

        @com.aliyun.core.annotation.NameInMap("SuccessCount")
        private Long successCount;

        @com.aliyun.core.annotation.NameInMap("SuccessRate")
        private String successRate;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        @com.aliyun.core.annotation.NameInMap("UnpassedCount")
        private Long unpassedCount;

        private Items(Builder builder) {
            this.api = builder.api;
            this.apiName = builder.apiName;
            this.billCount = builder.billCount;
            this.billRate = builder.billRate;
            this.chargeCount = builder.chargeCount;
            this.date = builder.date;
            this.ispName = builder.ispName;
            this.noRecordCount = builder.noRecordCount;
            this.passedCount = builder.passedCount;
            this.passedRate = builder.passedRate;
            this.successCount = builder.successCount;
            this.successRate = builder.successRate;
            this.totalCount = builder.totalCount;
            this.unpassedCount = builder.unpassedCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return api
         */
        public String getApi() {
            return this.api;
        }

        /**
         * @return apiName
         */
        public String getApiName() {
            return this.apiName;
        }

        /**
         * @return billCount
         */
        public Long getBillCount() {
            return this.billCount;
        }

        /**
         * @return billRate
         */
        public String getBillRate() {
            return this.billRate;
        }

        /**
         * @return chargeCount
         */
        public Long getChargeCount() {
            return this.chargeCount;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return ispName
         */
        public String getIspName() {
            return this.ispName;
        }

        /**
         * @return noRecordCount
         */
        public Long getNoRecordCount() {
            return this.noRecordCount;
        }

        /**
         * @return passedCount
         */
        public Long getPassedCount() {
            return this.passedCount;
        }

        /**
         * @return passedRate
         */
        public String getPassedRate() {
            return this.passedRate;
        }

        /**
         * @return successCount
         */
        public Long getSuccessCount() {
            return this.successCount;
        }

        /**
         * @return successRate
         */
        public String getSuccessRate() {
            return this.successRate;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return unpassedCount
         */
        public Long getUnpassedCount() {
            return this.unpassedCount;
        }

        public static final class Builder {
            private String api; 
            private String apiName; 
            private Long billCount; 
            private String billRate; 
            private Long chargeCount; 
            private String date; 
            private String ispName; 
            private Long noRecordCount; 
            private Long passedCount; 
            private String passedRate; 
            private Long successCount; 
            private String successRate; 
            private Long totalCount; 
            private Long unpassedCount; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.api = model.api;
                this.apiName = model.apiName;
                this.billCount = model.billCount;
                this.billRate = model.billRate;
                this.chargeCount = model.chargeCount;
                this.date = model.date;
                this.ispName = model.ispName;
                this.noRecordCount = model.noRecordCount;
                this.passedCount = model.passedCount;
                this.passedRate = model.passedRate;
                this.successCount = model.successCount;
                this.successRate = model.successRate;
                this.totalCount = model.totalCount;
                this.unpassedCount = model.unpassedCount;
            } 

            /**
             * <p>Api。</p>
             * 
             * <strong>example:</strong>
             * <p>ID_PERIOD</p>
             */
            public Builder api(String api) {
                this.api = api;
                return this;
            }

            /**
             * ApiName.
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * BillCount.
             */
            public Builder billCount(Long billCount) {
                this.billCount = billCount;
                return this;
            }

            /**
             * BillRate.
             */
            public Builder billRate(String billRate) {
                this.billRate = billRate;
                return this;
            }

            /**
             * ChargeCount.
             */
            public Builder chargeCount(Long chargeCount) {
                this.chargeCount = chargeCount;
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
             * IspName.
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * NoRecordCount.
             */
            public Builder noRecordCount(Long noRecordCount) {
                this.noRecordCount = noRecordCount;
                return this;
            }

            /**
             * PassedCount.
             */
            public Builder passedCount(Long passedCount) {
                this.passedCount = passedCount;
                return this;
            }

            /**
             * PassedRate.
             */
            public Builder passedRate(String passedRate) {
                this.passedRate = passedRate;
                return this;
            }

            /**
             * SuccessCount.
             */
            public Builder successCount(Long successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * SuccessRate.
             */
            public Builder successRate(String successRate) {
                this.successRate = successRate;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * UnpassedCount.
             */
            public Builder unpassedCount(Long unpassedCount) {
                this.unpassedCount = unpassedCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
