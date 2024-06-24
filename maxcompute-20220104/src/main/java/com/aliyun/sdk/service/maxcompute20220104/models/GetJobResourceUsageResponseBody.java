// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobResourceUsageResponseBody</p>
 */
public class GetJobResourceUsageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("errorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("errorMsg")
    private String errorMsg;

    @com.aliyun.core.annotation.NameInMap("httpCode")
    private Integer httpCode;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    private GetJobResourceUsageResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.httpCode = builder.httpCode;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetJobResourceUsageResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
    }

    /**
     * @return httpCode
     */
    public Integer getHttpCode() {
        return this.httpCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String errorCode; 
        private String errorMsg; 
        private Integer httpCode; 
        private String requestId; 

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error code returned if the request failed.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * Indicates whether the request was successful. If this parameter was not empty and the value of this parameter was not 200, the request failed.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetJobResourceUsageResponseBody build() {
            return new GetJobResourceUsageResponseBody(this);
        } 

    } 

    public static class JobResourceUsageList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("cuUsage")
        private Long cuUsage;

        @com.aliyun.core.annotation.NameInMap("date")
        private String date;

        @com.aliyun.core.annotation.NameInMap("jobOwner")
        private String jobOwner;

        @com.aliyun.core.annotation.NameInMap("memoryUsage")
        private Long memoryUsage;

        @com.aliyun.core.annotation.NameInMap("quotaNickname")
        private String quotaNickname;

        private JobResourceUsageList(Builder builder) {
            this.cuUsage = builder.cuUsage;
            this.date = builder.date;
            this.jobOwner = builder.jobOwner;
            this.memoryUsage = builder.memoryUsage;
            this.quotaNickname = builder.quotaNickname;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JobResourceUsageList create() {
            return builder().build();
        }

        /**
         * @return cuUsage
         */
        public Long getCuUsage() {
            return this.cuUsage;
        }

        /**
         * @return date
         */
        public String getDate() {
            return this.date;
        }

        /**
         * @return jobOwner
         */
        public String getJobOwner() {
            return this.jobOwner;
        }

        /**
         * @return memoryUsage
         */
        public Long getMemoryUsage() {
            return this.memoryUsage;
        }

        /**
         * @return quotaNickname
         */
        public String getQuotaNickname() {
            return this.quotaNickname;
        }

        public static final class Builder {
            private Long cuUsage; 
            private String date; 
            private String jobOwner; 
            private Long memoryUsage; 
            private String quotaNickname; 

            /**
             * The total number of used compute units (CUs).
             */
            public Builder cuUsage(Long cuUsage) {
                this.cuUsage = cuUsage;
                return this;
            }

            /**
             * The start date of the query in the format of yyyy-MM-dd.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * The job executor.
             */
            public Builder jobOwner(String jobOwner) {
                this.jobOwner = jobOwner;
                return this;
            }

            /**
             * The total memory usage.
             */
            public Builder memoryUsage(Long memoryUsage) {
                this.memoryUsage = memoryUsage;
                return this;
            }

            /**
             * The quota nickname.
             */
            public Builder quotaNickname(String quotaNickname) {
                this.quotaNickname = quotaNickname;
                return this;
            }

            public JobResourceUsageList build() {
                return new JobResourceUsageList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("jobResourceUsageList")
        private java.util.List < JobResourceUsageList> jobResourceUsageList;

        @com.aliyun.core.annotation.NameInMap("pageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("pageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("totalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.jobResourceUsageList = builder.jobResourceUsageList;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return jobResourceUsageList
         */
        public java.util.List < JobResourceUsageList> getJobResourceUsageList() {
            return this.jobResourceUsageList;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < JobResourceUsageList> jobResourceUsageList; 
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * The data list returned.
             */
            public Builder jobResourceUsageList(java.util.List < JobResourceUsageList> jobResourceUsageList) {
                this.jobResourceUsageList = jobResourceUsageList;
                return this;
            }

            /**
             * The page number.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * The number of entries per page.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of returned entries.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
