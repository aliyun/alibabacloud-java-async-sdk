// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainSubnetMemberListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainSubnetMemberListResponseBody</p>
 */
public class DescribeAntChainSubnetMemberListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("ResultMessage")
    private String resultMessage;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeAntChainSubnetMemberListResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.resultCode = builder.resultCode;
        this.resultMessage = builder.resultMessage;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainSubnetMemberListResponseBody create() {
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
    public String getHttpStatusCode() {
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
     * @return result
     */
    public Result getResult() {
        return this.result;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return resultMessage
     */
    public String getResultMessage() {
        return this.resultMessage;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private String httpStatusCode; 
        private String message; 
        private String requestId; 
        private Result result; 
        private String resultCode; 
        private String resultMessage; 
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
        public Builder httpStatusCode(String httpStatusCode) {
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
         * Result.
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * ResultMessage.
         */
        public Builder resultMessage(String resultMessage) {
            this.resultMessage = resultMessage;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeAntChainSubnetMemberListResponseBody build() {
            return new DescribeAntChainSubnetMemberListResponseBody(this);
        } 

    } 

    public static class ConsortiumMemberInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("JoinTime")
        private Long joinTime;

        @com.aliyun.core.annotation.NameInMap("MemberId")
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("MemberName")
        private String memberName;

        @com.aliyun.core.annotation.NameInMap("Role")
        private String role;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private ConsortiumMemberInfoList(Builder builder) {
            this.joinTime = builder.joinTime;
            this.memberId = builder.memberId;
            this.memberName = builder.memberName;
            this.role = builder.role;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConsortiumMemberInfoList create() {
            return builder().build();
        }

        /**
         * @return joinTime
         */
        public Long getJoinTime() {
            return this.joinTime;
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberName
         */
        public String getMemberName() {
            return this.memberName;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long joinTime; 
            private String memberId; 
            private String memberName; 
            private String role; 
            private String status; 

            /**
             * JoinTime.
             */
            public Builder joinTime(Long joinTime) {
                this.joinTime = joinTime;
                return this;
            }

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * MemberName.
             */
            public Builder memberName(String memberName) {
                this.memberName = memberName;
                return this;
            }

            /**
             * Role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public ConsortiumMemberInfoList build() {
                return new ConsortiumMemberInfoList(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Long pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Long pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Pagination(Builder builder) {
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
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
            private Long pageNumber; 
            private Long pageSize; 
            private Long totalCount; 

            /**
             * PageNumber.
             */
            public Builder pageNumber(Long pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConsortiumAdmin")
        private Boolean consortiumAdmin;

        @com.aliyun.core.annotation.NameInMap("ConsortiumMemberInfoList")
        private java.util.List < ConsortiumMemberInfoList> consortiumMemberInfoList;

        @com.aliyun.core.annotation.NameInMap("Pagination")
        private Pagination pagination;

        private Result(Builder builder) {
            this.consortiumAdmin = builder.consortiumAdmin;
            this.consortiumMemberInfoList = builder.consortiumMemberInfoList;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return consortiumAdmin
         */
        public Boolean getConsortiumAdmin() {
            return this.consortiumAdmin;
        }

        /**
         * @return consortiumMemberInfoList
         */
        public java.util.List < ConsortiumMemberInfoList> getConsortiumMemberInfoList() {
            return this.consortiumMemberInfoList;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private Boolean consortiumAdmin; 
            private java.util.List < ConsortiumMemberInfoList> consortiumMemberInfoList; 
            private Pagination pagination; 

            /**
             * ConsortiumAdmin.
             */
            public Builder consortiumAdmin(Boolean consortiumAdmin) {
                this.consortiumAdmin = consortiumAdmin;
                return this;
            }

            /**
             * ConsortiumMemberInfoList.
             */
            public Builder consortiumMemberInfoList(java.util.List < ConsortiumMemberInfoList> consortiumMemberInfoList) {
                this.consortiumMemberInfoList = consortiumMemberInfoList;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
