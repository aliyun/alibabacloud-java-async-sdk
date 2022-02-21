// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.clickhouse20191111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLorneLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeLorneLogResponseBody</p>
 */
public class DescribeLorneLogResponseBody extends TeaModel {
    @NameInMap("Data")
    private java.util.List < Data> data;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeLorneLogResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLorneLogResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
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

    public static final class Builder {
        private java.util.List < Data> data; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Data.
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
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

        public DescribeLorneLogResponseBody build() {
            return new DescribeLorneLogResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("Count")
        private String count;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("Message")
        private String message;

        @NameInMap("StartTime")
        private String startTime;

        private Data(Builder builder) {
            this.code = builder.code;
            this.count = builder.count;
            this.endTime = builder.endTime;
            this.message = builder.message;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return count
         */
        public String getCount() {
            return this.count;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String code; 
            private String count; 
            private String endTime; 
            private String message; 
            private String startTime; 

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(String count) {
                this.count = count;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
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
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
