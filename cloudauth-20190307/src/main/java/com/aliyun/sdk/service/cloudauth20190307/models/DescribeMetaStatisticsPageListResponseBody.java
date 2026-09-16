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
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The paginated list data.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>C379C9E4-4DA0-5D0B-821B-25E2B8693D48</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>7</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>The total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
             * <p>The name corresponding to the API. Valid values:</p>
             * <ul>
             * <li><strong>ID_CARD_2_META</strong>: ID card two-element verification</li>
             * <li><strong>ID_PERIOD</strong>: ID card validity period verification</li>
             * <li><strong>MOBILE_ONLINE_LENGTH</strong>: mobile number online duration</li>
             * <li><strong>MOBILE_ONLINE_STATUS</strong>: mobile number online status</li>
             * <li><strong>MOBILE_3_META_SIMPLE</strong>: mobile number three-element verification (simple edition)</li>
             * <li><strong>MOBILE_3_META</strong>: mobile number three-element verification (detailed edition)</li>
             * <li><strong>MOBILE_2_META</strong>: mobile number two-element verification</li>
             * <li><strong>BANK_CARD_N_META</strong>: bank card verification (detailed edition)</li>
             * <li><strong>MOBILE_DETECT</strong>: phone number detection</li>
             * <li><strong>VEHICLE_N_META</strong>: vehicle element verification (enhanced edition)</li>
             * <li><strong>VEHICLE_PENTA_INFO</strong>: vehicle five-element information recognition</li>
             * <li><strong>VEHICLE_LICENSE_INFO</strong>: vehicle information recognition</li>
             * <li><strong>VEHICLE_INSURE_DATE</strong>: vehicle insurance date query</li>
             * <li><strong>VEHICLE_CHECK</strong>: vehicle element verification</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>车辆要素核验增强版</p>
             */
            public Builder apiName(String apiName) {
                this.apiName = apiName;
                return this;
            }

            /**
             * <p>The number of successful queries (billable).</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder billCount(Long billCount) {
                this.billCount = billCount;
                return this;
            }

            /**
             * <p>The query hit rate (%).</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder billRate(String billRate) {
                this.billRate = billRate;
                return this;
            }

            /**
             * <p>The number of successful phone number queries (exclusive to phone number detection).</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chargeCount(Long chargeCount) {
                this.chargeCount = chargeCount;
                return this;
            }

            /**
             * <p>The date. Format: M/d (month/day). For example, 11/8 indicates November 8.</p>
             * 
             * <strong>example:</strong>
             * <p>11/8</p>
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * <p>The carrier name. Valid values:</p>
             * <ul>
             * <li><strong>CMCC</strong>: China Mobile</li>
             * <li><strong>CUCC</strong>: China Unicom</li>
             * <li><strong>CTCC</strong>: China Telecom</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CMCC</p>
             */
            public Builder ispName(String ispName) {
                this.ispName = ispName;
                return this;
            }

            /**
             * <p>The number of calls with no education information found.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder noRecordCount(Long noRecordCount) {
                this.noRecordCount = noRecordCount;
                return this;
            }

            /**
             * <p>The number of authentication-passed transactions.</p>
             * 
             * <strong>example:</strong>
             * <p>21</p>
             */
            public Builder passedCount(Long passedCount) {
                this.passedCount = passedCount;
                return this;
            }

            /**
             * <p>The authentication pass rate (%).</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder passedRate(String passedRate) {
                this.passedRate = passedRate;
                return this;
            }

            /**
             * <p>The number of successful requests.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder successCount(Long successCount) {
                this.successCount = successCount;
                return this;
            }

            /**
             * <p>The call success rate (%).</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder successRate(String successRate) {
                this.successRate = successRate;
                return this;
            }

            /**
             * <p>The total number of entries.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * <p>The number of authentication-failed calls.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
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
