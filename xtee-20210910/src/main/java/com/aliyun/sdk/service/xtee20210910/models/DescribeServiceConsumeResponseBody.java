// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeServiceConsumeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceConsumeResponseBody</p>
 */
public class DescribeServiceConsumeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("consumeRecords")
    private java.util.List < ConsumeRecords> consumeRecords;

    @com.aliyun.core.annotation.NameInMap("currentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("totalItem")
    private Integer totalItem;

    @com.aliyun.core.annotation.NameInMap("totalPage")
    private Integer totalPage;

    private DescribeServiceConsumeResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.consumeRecords = builder.consumeRecords;
        this.currentPage = builder.currentPage;
        this.pageSize = builder.pageSize;
        this.totalItem = builder.totalItem;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceConsumeResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return consumeRecords
     */
    public java.util.List < ConsumeRecords> getConsumeRecords() {
        return this.consumeRecords;
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return totalItem
     */
    public Integer getTotalItem() {
        return this.totalItem;
    }

    /**
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ConsumeRecords> consumeRecords; 
        private Integer currentPage; 
        private Integer pageSize; 
        private Integer totalItem; 
        private Integer totalPage; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * consumeRecords.
         */
        public Builder consumeRecords(java.util.List < ConsumeRecords> consumeRecords) {
            this.consumeRecords = consumeRecords;
            return this;
        }

        /**
         * currentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * totalItem.
         */
        public Builder totalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }

        /**
         * totalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public DescribeServiceConsumeResponseBody build() {
            return new DescribeServiceConsumeResponseBody(this);
        } 

    } 

    public static class Records extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("count")
        private Integer count;

        @com.aliyun.core.annotation.NameInMap("serviceCode")
        private String serviceCode;

        private Records(Builder builder) {
            this.count = builder.count;
            this.serviceCode = builder.serviceCode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Records create() {
            return builder().build();
        }

        /**
         * @return count
         */
        public Integer getCount() {
            return this.count;
        }

        /**
         * @return serviceCode
         */
        public String getServiceCode() {
            return this.serviceCode;
        }

        public static final class Builder {
            private Integer count; 
            private String serviceCode; 

            /**
             * count.
             */
            public Builder count(Integer count) {
                this.count = count;
                return this;
            }

            /**
             * serviceCode.
             */
            public Builder serviceCode(String serviceCode) {
                this.serviceCode = serviceCode;
                return this;
            }

            public Records build() {
                return new Records(this);
            } 

        } 

    }
    public static class ConsumeRecords extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("records")
        private java.util.List < Records> records;

        private ConsumeRecords(Builder builder) {
            this.date = builder.date;
            this.records = builder.records;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsumeRecords create() {
            return builder().build();
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return records
         */
        public java.util.List < Records> getRecords() {
            return this.records;
        }

        public static final class Builder {
            private String date; 
            private java.util.List < Records> records; 

            /**
             * date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * records.
             */
            public Builder records(java.util.List < Records> records) {
                this.records = records;
                return this;
            }

            public ConsumeRecords build() {
                return new ConsumeRecords(this);
            } 

        } 

    }
}
