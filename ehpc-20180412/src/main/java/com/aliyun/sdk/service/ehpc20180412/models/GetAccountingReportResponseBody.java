// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountingReportResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountingReportResponseBody</p>
 */
public class GetAccountingReportResponseBody extends TeaModel {
    @NameInMap("Data")
    private Data data;

    @NameInMap("Metrics")
    private String metrics;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCoreTime")
    private Integer totalCoreTime;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private GetAccountingReportResponseBody(Builder builder) {
        this.data = builder.data;
        this.metrics = builder.metrics;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCoreTime = builder.totalCoreTime;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountingReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return metrics
     */
    public String getMetrics() {
        return this.metrics;
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
     * @return totalCoreTime
     */
    public Integer getTotalCoreTime() {
        return this.totalCoreTime;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Data data; 
        private String metrics; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCoreTime; 
        private Integer totalCount; 

        /**
         * The list serialized in the JSON format. The list contains multiple records.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The list serialized in the JSON format. The list contains the column names of each record in the Data.
         */
        public Builder metrics(String metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
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
         * The total number of CPU cores in the queried cluster.
         */
        public Builder totalCoreTime(Integer totalCoreTime) {
            this.totalCoreTime = totalCoreTime;
            return this;
        }

        /**
         * The total number of entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public GetAccountingReportResponseBody build() {
            return new GetAccountingReportResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Data")
        private java.util.List < String > data;

        private Data(Builder builder) {
            this.data = builder.data;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List < String > getData() {
            return this.data;
        }

        public static final class Builder {
            private java.util.List < String > data; 

            /**
             * The list serialized in the JSON format. The list contains multiple records.
             */
            public Builder data(java.util.List < String > data) {
                this.data = data;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
