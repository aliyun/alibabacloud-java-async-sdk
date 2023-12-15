// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSmartContractJobsByNameResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSmartContractJobsByNameResponseBody</p>
 */
public class DescribeSmartContractJobsByNameResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private Integer errorCode;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("Success")
    private Boolean success;

    private DescribeSmartContractJobsByNameResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSmartContractJobsByNameResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public Integer getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer errorCode; 
        private String requestId; 
        private Result result; 
        private Boolean success; 

        /**
         * ErrorCode.
         */
        public Builder errorCode(Integer errorCode) {
            this.errorCode = errorCode;
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeSmartContractJobsByNameResponseBody build() {
            return new DescribeSmartContractJobsByNameResponseBody(this);
        } 

    } 

    public static class Content extends TeaModel {
        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("FinishedTime")
        private Long finishedTime;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Name")
        private String name;

        @NameInMap("SourceType")
        private String sourceType;

        @NameInMap("Status")
        private String status;

        @NameInMap("UserBid")
        private String userBid;

        @NameInMap("UserId")
        private String userId;

        private Content(Builder builder) {
            this.createTime = builder.createTime;
            this.finishedTime = builder.finishedTime;
            this.jobId = builder.jobId;
            this.name = builder.name;
            this.sourceType = builder.sourceType;
            this.status = builder.status;
            this.userBid = builder.userBid;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return finishedTime
         */
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userBid
         */
        public String getUserBid() {
            return this.userBid;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private Long createTime; 
            private Long finishedTime; 
            private String jobId; 
            private String name; 
            private String sourceType; 
            private String status; 
            private String userBid; 
            private String userId; 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * FinishedTime.
             */
            public Builder finishedTime(Long finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * UserBid.
             */
            public Builder userBid(String userBid) {
                this.userBid = userBid;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("Content")
        private java.util.List < Content> content;

        @NameInMap("First")
        private Boolean first;

        @NameInMap("Last")
        private Boolean last;

        @NameInMap("NumberOfElements")
        private Integer numberOfElements;

        @NameInMap("Size")
        private Integer size;

        @NameInMap("TotalElements")
        private Integer totalElements;

        @NameInMap("TotalPages")
        private Integer totalPages;

        private Result(Builder builder) {
            this.content = builder.content;
            this.first = builder.first;
            this.last = builder.last;
            this.numberOfElements = builder.numberOfElements;
            this.size = builder.size;
            this.totalElements = builder.totalElements;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List < Content> getContent() {
            return this.content;
        }

        /**
         * @return first
         */
        public Boolean getFirst() {
            return this.first;
        }

        /**
         * @return last
         */
        public Boolean getLast() {
            return this.last;
        }

        /**
         * @return numberOfElements
         */
        public Integer getNumberOfElements() {
            return this.numberOfElements;
        }

        /**
         * @return size
         */
        public Integer getSize() {
            return this.size;
        }

        /**
         * @return totalElements
         */
        public Integer getTotalElements() {
            return this.totalElements;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List < Content> content; 
            private Boolean first; 
            private Boolean last; 
            private Integer numberOfElements; 
            private Integer size; 
            private Integer totalElements; 
            private Integer totalPages; 

            /**
             * Content.
             */
            public Builder content(java.util.List < Content> content) {
                this.content = content;
                return this;
            }

            /**
             * First.
             */
            public Builder first(Boolean first) {
                this.first = first;
                return this;
            }

            /**
             * Last.
             */
            public Builder last(Boolean last) {
                this.last = last;
                return this;
            }

            /**
             * NumberOfElements.
             */
            public Builder numberOfElements(Integer numberOfElements) {
                this.numberOfElements = numberOfElements;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Integer size) {
                this.size = size;
                return this;
            }

            /**
             * TotalElements.
             */
            public Builder totalElements(Integer totalElements) {
                this.totalElements = totalElements;
                return this;
            }

            /**
             * TotalPages.
             */
            public Builder totalPages(Integer totalPages) {
                this.totalPages = totalPages;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
