// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody</p>
 */
public class DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    private DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody create() {
        return builder().build();
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

    public static final class Builder {
        private String requestId; 
        private Result result; 

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

        public DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody build() {
            return new DescribeAntChainMiniAppBrowserQRCodeAuthorizedUsersResponseBody(this);
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
