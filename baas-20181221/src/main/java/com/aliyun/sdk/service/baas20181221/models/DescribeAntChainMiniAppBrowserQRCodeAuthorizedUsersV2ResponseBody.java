// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody</p>
 */
public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody extends TeaModel {
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

    private DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody(Builder builder) {
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

    public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody create() {
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

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody build() {
            return new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersV2ResponseBody(this);
        } 

    } 

    public static class AuthorizedUserList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("GmtAuthorized")
        private String gmtAuthorized;

        @com.aliyun.core.annotation.NameInMap("Phone")
        private String phone;

        private AuthorizedUserList(Builder builder) {
            this.gmtAuthorized = builder.gmtAuthorized;
            this.phone = builder.phone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizedUserList create() {
            return builder().build();
        }

        /**
         * @return gmtAuthorized
         */
        public String getGmtAuthorized() {
            return this.gmtAuthorized;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        public static final class Builder {
            private String gmtAuthorized; 
            private String phone; 

            /**
             * GmtAuthorized.
             */
            public Builder gmtAuthorized(String gmtAuthorized) {
                this.gmtAuthorized = gmtAuthorized;
                return this;
            }

            /**
             * Phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            public AuthorizedUserList build() {
                return new AuthorizedUserList(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
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
        @com.aliyun.core.annotation.NameInMap("AntChainId")
        private String antChainId;

        @com.aliyun.core.annotation.NameInMap("AuthorizationType")
        private String authorizationType;

        @com.aliyun.core.annotation.NameInMap("AuthorizedUserList")
        private java.util.List < AuthorizedUserList> authorizedUserList;

        @com.aliyun.core.annotation.NameInMap("Pagination")
        private Pagination pagination;

        @com.aliyun.core.annotation.NameInMap("QRCodeType")
        private String QRCodeType;

        private Result(Builder builder) {
            this.antChainId = builder.antChainId;
            this.authorizationType = builder.authorizationType;
            this.authorizedUserList = builder.authorizedUserList;
            this.pagination = builder.pagination;
            this.QRCodeType = builder.QRCodeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return antChainId
         */
        public String getAntChainId() {
            return this.antChainId;
        }

        /**
         * @return authorizationType
         */
        public String getAuthorizationType() {
            return this.authorizationType;
        }

        /**
         * @return authorizedUserList
         */
        public java.util.List < AuthorizedUserList> getAuthorizedUserList() {
            return this.authorizedUserList;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        /**
         * @return QRCodeType
         */
        public String getQRCodeType() {
            return this.QRCodeType;
        }

        public static final class Builder {
            private String antChainId; 
            private String authorizationType; 
            private java.util.List < AuthorizedUserList> authorizedUserList; 
            private Pagination pagination; 
            private String QRCodeType; 

            /**
             * AntChainId.
             */
            public Builder antChainId(String antChainId) {
                this.antChainId = antChainId;
                return this;
            }

            /**
             * AuthorizationType.
             */
            public Builder authorizationType(String authorizationType) {
                this.authorizationType = authorizationType;
                return this;
            }

            /**
             * AuthorizedUserList.
             */
            public Builder authorizedUserList(java.util.List < AuthorizedUserList> authorizedUserList) {
                this.authorizedUserList = authorizedUserList;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            /**
             * QRCodeType.
             */
            public Builder QRCodeType(String QRCodeType) {
                this.QRCodeType = QRCodeType;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
}
