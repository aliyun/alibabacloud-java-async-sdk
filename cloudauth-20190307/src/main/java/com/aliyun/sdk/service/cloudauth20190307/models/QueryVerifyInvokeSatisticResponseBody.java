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
 * {@link QueryVerifyInvokeSatisticResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVerifyInvokeSatisticResponseBody</p>
 */
public class QueryVerifyInvokeSatisticResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Long currentPage;

    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Long totalPage;

    private QueryVerifyInvokeSatisticResponseBody(Builder builder) {
        this.code = builder.code;
        this.currentPage = builder.currentPage;
        this.items = builder.items;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVerifyInvokeSatisticResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return currentPage
     */
    public Long getCurrentPage() {
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
    public Long getPageSize() {
        return this.pageSize;
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

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return totalPage
     */
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private String code; 
        private Long currentPage; 
        private java.util.List<Items> items; 
        private Long pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 
        private Long totalPage; 

        private Builder() {
        } 

        private Builder(QueryVerifyInvokeSatisticResponseBody model) {
            this.code = model.code;
            this.currentPage = model.currentPage;
            this.items = model.items;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * <p>Response code, <strong>200</strong> indicates a successful response.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Long currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>List of returned data.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>Number of items per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>ID of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2FA2C773-47DB-4156-B1EE-5B047321A939</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Whether the response was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * <p>Total number of pages.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder totalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public QueryVerifyInvokeSatisticResponseBody build() {
            return new QueryVerifyInvokeSatisticResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryVerifyInvokeSatisticResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVerifyInvokeSatisticResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StatisticsCount")
        private String statisticsCount;

        @com.aliyun.core.annotation.NameInMap("StatisticsType")
        private String statisticsType;

        private Data(Builder builder) {
            this.statisticsCount = builder.statisticsCount;
            this.statisticsType = builder.statisticsType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return statisticsCount
         */
        public String getStatisticsCount() {
            return this.statisticsCount;
        }

        /**
         * @return statisticsType
         */
        public String getStatisticsType() {
            return this.statisticsType;
        }

        public static final class Builder {
            private String statisticsCount; 
            private String statisticsType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.statisticsCount = model.statisticsCount;
                this.statisticsType = model.statisticsType;
            } 

            /**
             * <p>Number of occurrences of the statistic.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder statisticsCount(String statisticsCount) {
                this.statisticsCount = statisticsCount;
                return this;
            }

            /**
             * <p>ProductCode。</p>
             * 
             * <strong>example:</strong>
             * <p>ID_PRO</p>
             */
            public Builder statisticsType(String statisticsType) {
                this.statisticsType = statisticsType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryVerifyInvokeSatisticResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVerifyInvokeSatisticResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("StatisticsDate")
        private String statisticsDate;

        private Items(Builder builder) {
            this.data = builder.data;
            this.statisticsDate = builder.statisticsDate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return statisticsDate
         */
        public String getStatisticsDate() {
            return this.statisticsDate;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private String statisticsDate; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.data = model.data;
                this.statisticsDate = model.statisticsDate;
            } 

            /**
             * <p>List of statistical data.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Statistics date.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-10-16</p>
             */
            public Builder statisticsDate(String statisticsDate) {
                this.statisticsDate = statisticsDate;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
