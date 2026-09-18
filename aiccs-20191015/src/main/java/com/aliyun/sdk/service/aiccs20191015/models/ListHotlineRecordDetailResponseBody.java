// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

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
 * {@link ListHotlineRecordDetailResponseBody} extends {@link TeaModel}
 *
 * <p>ListHotlineRecordDetailResponseBody</p>
 */
public class ListHotlineRecordDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ResultData")
    private ResultData resultData;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListHotlineRecordDetailResponseBody(Builder builder) {
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

    public static ListHotlineRecordDetailResponseBody create() {
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

        private Builder() {
        } 

        private Builder(ListHotlineRecordDetailResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.resultData = model.resultData;
            this.success = model.success;
        } 

        /**
         * <p>Status code. A return value of 200 indicates that the request succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE338D98-9BD3-4413-B165</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned data.</p>
         */
        public Builder resultData(ResultData resultData) {
            this.resultData = resultData;
            return this;
        }

        /**
         * <p>Indicates whether the API call succeeded.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListHotlineRecordDetailResponseBody build() {
            return new ListHotlineRecordDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListHotlineRecordDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotlineRecordDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("OssUrl")
        private String ossUrl;

        @com.aliyun.core.annotation.NameInMap("ServicerName")
        private String servicerName;

        @com.aliyun.core.annotation.NameInMap("StartTime")
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.endTime = model.endTime;
                this.ossUrl = model.ossUrl;
                this.servicerName = model.servicerName;
                this.startTime = model.startTime;
            } 

            /**
             * <p>Hotline End Time.</p>
             * 
             * <strong>example:</strong>
             * <p>1614578410000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>OSS URL of the hotline call recording.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxx.xxxxx/xx.wav">http://xxx.xxxxx/xx.wav</a></p>
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * <p>Servicer Account.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:123@123.com">123@123.com</a></p>
             */
            public Builder servicerName(String servicerName) {
                this.servicerName = servicerName;
                return this;
            }

            /**
             * <p>Start Time of the hotline call.</p>
             * 
             * <strong>example:</strong>
             * <p>1614578400000</p>
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
    /**
     * 
     * {@link ListHotlineRecordDetailResponseBody} extends {@link TeaModel}
     *
     * <p>ListHotlineRecordDetailResponseBody</p>
     */
    public static class ResultData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Long currentPage;

        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("OnePageSize")
        private Long onePageSize;

        @com.aliyun.core.annotation.NameInMap("TotalPage")
        private Long totalPage;

        @com.aliyun.core.annotation.NameInMap("TotalResults")
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
        public java.util.List<Data> getData() {
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
            private java.util.List<Data> data; 
            private Long onePageSize; 
            private Long totalPage; 
            private Long totalResults; 

            private Builder() {
            } 

            private Builder(ResultData model) {
                this.currentPage = model.currentPage;
                this.data = model.data;
                this.onePageSize = model.onePageSize;
                this.totalPage = model.totalPage;
                this.totalResults = model.totalResults;
            } 

            /**
             * <p>Current page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Long currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>Query result data.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Page size.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder onePageSize(Long onePageSize) {
                this.onePageSize = onePageSize;
                return this;
            }

            /**
             * <p>Total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalPage(Long totalPage) {
                this.totalPage = totalPage;
                return this;
            }

            /**
             * <p>Total number of records.</p>
             * 
             * <strong>example:</strong>
             * <p>945</p>
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
