// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHotlineRecordsResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotlineRecordsResponseBody</p>
 */
public class ListHotlineRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ResultData")
    private ResultData resultData;

    @NameInMap("Success")
    private Boolean success;

    private ListHotlineRecordsResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.resultData = builder.resultData;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHotlineRecordsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultData
     */
    public ResultData getResultData() {
        return this.resultData;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private ResultData resultData; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ResultData.
         */
        public Builder resultData(ResultData resultData) {
            this.resultData = resultData;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListHotlineRecordsResponseBody build() {
            return new ListHotlineRecordsResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("OssUrl")
        private String ossUrl;

        @NameInMap("ServicerName")
        private String servicerName;

        @NameInMap("StartTime")
        private Long startTime;

        private Data(Builder builder) {
            this.endTime = builder.endTime;
            this.ossUrl = builder.ossUrl;
            this.servicerName = builder.servicerName;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        /**
         * @return servicerName
         */
        public String getServicerName() {
            return this.servicerName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private Long endTime; 
            private String ossUrl; 
            private String servicerName; 
            private Long startTime; 

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * OssUrl.
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * ServicerName.
             */
            public Builder servicerName(String servicerName) {
                this.servicerName = servicerName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    public static class ResultData extends TeaModel {
        @NameInMap("CurrentPage")
        private Long currentPage;

        @NameInMap("Data")
        private java.util.List < Data> data;

        @NameInMap("OnePageSize")
        private Long onePageSize;

        @NameInMap("TotalPage")
        private Long totalPage;

        @NameInMap("TotalResults")
        private Long totalResults;

        private ResultData(Builder builder) {
            this.currentPage = builder.currentPage;
            this.data = builder.data;
            this.onePageSize = builder.onePageSize;
            this.totalPage = builder.totalPage;
            this.totalResults = builder.totalResults;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultData create() {
            return builder().build();
        }

        /**
         * @return currentPage
         */
        public Long getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return data
         */
        public java.util.List < Data> getData() {
            return this.data;
        }

        /**
         * @return onePageSize
         */
        public Long getOnePageSize() {
            return this.onePageSize;
        }

        /**
         * @return totalPage
         */
        public Long getTotalPage() {
            return this.totalPage;
        }

        /**
         * @return totalResults
         */
        public Long getTotalResults() {
            return this.totalResults;
        }

        public static final class Builder {
            private Long currentPage; 
            private java.util.List < Data> data; 
            private Long onePageSize; 
            private Long totalPage; 
            private Long totalResults; 

            /**
             * CurrentPage.
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(java.util.List < Data> data) {
                this.data = data;
                return this;
            }

            /**
             * OnePageSize.
             */
            public Builder onePageSize(Long onePageSize) {
                this.onePageSize = onePageSize;
                return this;
            }

            /**
             * TotalPage.
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            /**
             * TotalResults.
             */
            public Builder totalResults(Long totalResults) {
                this.totalResults = totalResults;
                return this;
            }

            public ResultData build() {
                return new ResultData(this);
            } 

        } 

    }
}
