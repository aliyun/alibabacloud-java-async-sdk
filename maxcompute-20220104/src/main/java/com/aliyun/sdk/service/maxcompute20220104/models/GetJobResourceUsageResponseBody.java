// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetJobResourceUsageResponseBody} extends {@link TeaModel}
 *
 * <p>GetJobResourceUsageResponseBody</p>
 */
public class GetJobResourceUsageResponseBody extends TeaModel {
    @NameInMap("data")
    private Data data;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("httpCode")
    private Integer httpCode;

    @NameInMap("requestId")
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
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * errorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * errorMsg.
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * httpCode.
         */
        public Builder httpCode(Integer httpCode) {
            this.httpCode = httpCode;
            return this;
        }

        /**
         * requestId.
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
        @NameInMap("cuUsage")
        private Long cuUsage;

        @NameInMap("date")
        private String date;

        @NameInMap("jobOwner")
        private String jobOwner;

        @NameInMap("memoryUsage")
        private Long memoryUsage;

        @NameInMap("quotaNickname")
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
             * cuUsage.
             */
            public Builder cuUsage(Long cuUsage) {
                this.cuUsage = cuUsage;
                return this;
            }

            /**
             * date.
             */
            public Builder date(String date) {
                this.date = date;
                return this;
            }

            /**
             * jobOwner.
             */
            public Builder jobOwner(String jobOwner) {
                this.jobOwner = jobOwner;
                return this;
            }

            /**
             * memoryUsage.
             */
            public Builder memoryUsage(Long memoryUsage) {
                this.memoryUsage = memoryUsage;
                return this;
            }

            /**
             * quotaNickname.
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
        @NameInMap("jobResourceUsageList")
        private java.util.List < JobResourceUsageList> jobResourceUsageList;

        @NameInMap("pageNumber")
        private Long pageNumber;

        @NameInMap("pageSize")
        private Long pageSize;

        @NameInMap("totalCount")
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
             * jobResourceUsageList.
             */
            public Builder jobResourceUsageList(java.util.List < JobResourceUsageList> jobResourceUsageList) {
                this.jobResourceUsageList = jobResourceUsageList;
                return this;
            }

            /**
             * pageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * pageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * totalCount.
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
