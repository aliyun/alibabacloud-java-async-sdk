// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAvailableAdvicesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAvailableAdvicesResponseBody</p>
 */
public class DescribeAvailableAdvicesResponseBody extends TeaModel {
    @NameInMap("Items")
    private java.util.List < Items> items;

    @NameInMap("PageNumber")
    private Long pageNumber;

    @NameInMap("PageSize")
    private Long pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAvailableAdvicesResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAvailableAdvicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public java.util.List < Items> getItems() {
        return this.items;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
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
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Items> items; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * The queried suggestions.
         */
        public Builder items(java.util.List < Items> items) {
            this.items = items;
            return this;
        }

        /**
         * The page number of the returned page. The value must be an integer that is greater than 0. Default value: 1.
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page. Default value: 30. Valid values:
         * <p>
         * 
         * *   **30**
         * *   **50**
         * *   **100**
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned. The value must be an integer that is greater than or equal to 0. Default value: 0.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAvailableAdvicesResponseBody build() {
            return new DescribeAvailableAdvicesResponseBody(this);
        } 

    } 

    public static class Items extends TeaModel {
        @NameInMap("AdviceDate")
        private String adviceDate;

        @NameInMap("AdviceId")
        private String adviceId;

        @NameInMap("AdviceType")
        private String adviceType;

        @NameInMap("Benefit")
        private String benefit;

        @NameInMap("PageNumber")
        private Long pageNumber;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("SQL")
        private String SQL;

        @NameInMap("TotalCount")
        private Long totalCount;

        private Items(Builder builder) {
            this.adviceDate = builder.adviceDate;
            this.adviceId = builder.adviceId;
            this.adviceType = builder.adviceType;
            this.benefit = builder.benefit;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.reason = builder.reason;
            this.SQL = builder.SQL;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return adviceDate
         */
        public String getAdviceDate() {
            return this.adviceDate;
        }

        /**
         * @return adviceId
         */
        public String getAdviceId() {
            return this.adviceId;
        }

        /**
         * @return adviceType
         */
        public String getAdviceType() {
            return this.adviceType;
        }

        /**
         * @return benefit
         */
        public String getBenefit() {
            return this.benefit;
        }

        /**
         * @return pageNumber
         */
        public Long getPageNumber() {
            return this.pageNumber;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return SQL
         */
        public String getSQL() {
            return this.SQL;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private String adviceDate; 
            private String adviceId; 
            private String adviceType; 
            private String benefit; 
            private Long pageNumber; 
            private Long pageSize; 
            private String reason; 
            private String SQL; 
            private Long totalCount; 

            /**
             * The time when the suggestion was generated. The time follows the ISO 8601 standard in the yyyyMMdd format. The time is displayed in UTC.
             */
            public Builder adviceDate(String adviceDate) {
                this.adviceDate = adviceDate;
                return this;
            }

            /**
             * The suggestion ID.
             */
            public Builder adviceId(String adviceId) {
                this.adviceId = adviceId;
                return this;
            }

            /**
             * The type of the suggestion. Valid values:
             * <p>
             * 
             * *   **Index**: index optimization.
             * *   **Tiering**: hot and cold data optimization.
             */
            public Builder adviceType(String adviceType) {
                this.adviceType = adviceType;
                return this;
            }

            /**
             * The benefit of the suggestion.
             */
            public Builder benefit(String benefit) {
                this.benefit = benefit;
                return this;
            }

            /**
             * The page number. Pages start from 1. Default value: 1.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page. Valid values:
             * <p>
             * 
             * *   **30** (default)
             * *   **50**
             * *   **100**
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The reason why the suggestion was generated.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The SQL statement that is used to apply the suggestion.
             */
            public Builder SQL(String SQL) {
                this.SQL = SQL;
                return this;
            }

            /**
             * The total number of entries returned. Minimum value: 0. Default value: 0.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
