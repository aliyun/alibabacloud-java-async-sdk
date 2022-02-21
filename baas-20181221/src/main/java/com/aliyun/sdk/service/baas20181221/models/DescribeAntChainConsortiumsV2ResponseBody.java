// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainConsortiumsV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainConsortiumsV2ResponseBody</p>
 */
public class DescribeAntChainConsortiumsV2ResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("HttpStatusCode")
    private String httpStatusCode;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Result")
    private Result result;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("ResultMessage")
    private String resultMessage;

    @NameInMap("Success")
    private Boolean success;

    private DescribeAntChainConsortiumsV2ResponseBody(Builder builder) {
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

    public static DescribeAntChainConsortiumsV2ResponseBody create() {
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

        public DescribeAntChainConsortiumsV2ResponseBody build() {
            return new DescribeAntChainConsortiumsV2ResponseBody(this);
        } 

    } 

    public static class AntConsortiums extends TeaModel {
        @NameInMap("ChainNum")
        private Long chainNum;

        @NameInMap("ConsortiumDescription")
        private String consortiumDescription;

        @NameInMap("ConsortiumId")
        private String consortiumId;

        @NameInMap("ConsortiumName")
        private String consortiumName;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("IsEmptyConsortium")
        private Boolean isEmptyConsortium;

        @NameInMap("MemberNum")
        private Long memberNum;

        @NameInMap("Role")
        private String role;

        @NameInMap("Status")
        private String status;

        private AntConsortiums(Builder builder) {
            this.chainNum = builder.chainNum;
            this.consortiumDescription = builder.consortiumDescription;
            this.consortiumId = builder.consortiumId;
            this.consortiumName = builder.consortiumName;
            this.createTime = builder.createTime;
            this.isEmptyConsortium = builder.isEmptyConsortium;
            this.memberNum = builder.memberNum;
            this.role = builder.role;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AntConsortiums create() {
            return builder().build();
        }

        /**
         * @return chainNum
         */
        public Long getChainNum() {
            return this.chainNum;
        }

        /**
         * @return consortiumDescription
         */
        public String getConsortiumDescription() {
            return this.consortiumDescription;
        }

        /**
         * @return consortiumId
         */
        public String getConsortiumId() {
            return this.consortiumId;
        }

        /**
         * @return consortiumName
         */
        public String getConsortiumName() {
            return this.consortiumName;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return isEmptyConsortium
         */
        public Boolean getIsEmptyConsortium() {
            return this.isEmptyConsortium;
        }

        /**
         * @return memberNum
         */
        public Long getMemberNum() {
            return this.memberNum;
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
            private Long chainNum; 
            private String consortiumDescription; 
            private String consortiumId; 
            private String consortiumName; 
            private Long createTime; 
            private Boolean isEmptyConsortium; 
            private Long memberNum; 
            private String role; 
            private String status; 

            /**
             * ChainNum.
             */
            public Builder chainNum(Long chainNum) {
                this.chainNum = chainNum;
                return this;
            }

            /**
             * ConsortiumDescription.
             */
            public Builder consortiumDescription(String consortiumDescription) {
                this.consortiumDescription = consortiumDescription;
                return this;
            }

            /**
             * ConsortiumId.
             */
            public Builder consortiumId(String consortiumId) {
                this.consortiumId = consortiumId;
                return this;
            }

            /**
             * ConsortiumName.
             */
            public Builder consortiumName(String consortiumName) {
                this.consortiumName = consortiumName;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IsEmptyConsortium.
             */
            public Builder isEmptyConsortium(Boolean isEmptyConsortium) {
                this.isEmptyConsortium = isEmptyConsortium;
                return this;
            }

            /**
             * MemberNum.
             */
            public Builder memberNum(Long memberNum) {
                this.memberNum = memberNum;
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

            public AntConsortiums build() {
                return new AntConsortiums(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @NameInMap("PageNumber")
        private Integer pageNumber;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

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
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class Result extends TeaModel {
        @NameInMap("AntConsortiums")
        private java.util.List < AntConsortiums> antConsortiums;

        @NameInMap("Pagination")
        private Pagination pagination;

        private Result(Builder builder) {
            this.antConsortiums = builder.antConsortiums;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return antConsortiums
         */
        public java.util.List < AntConsortiums> getAntConsortiums() {
            return this.antConsortiums;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < AntConsortiums> antConsortiums; 
            private Pagination pagination; 

            /**
             * AntConsortiums.
             */
            public Builder antConsortiums(java.util.List < AntConsortiums> antConsortiums) {
                this.antConsortiums = antConsortiums;
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
