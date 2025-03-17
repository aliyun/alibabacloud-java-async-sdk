// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

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
 * {@link ListOrganizationRoleUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListOrganizationRoleUsersResponseBody</p>
 */
public class ListOrganizationRoleUsersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Result")
    private Result result;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListOrganizationRoleUsersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.result = builder.result;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOrganizationRoleUsersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
        private String requestId; 
        private Result result; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListOrganizationRoleUsersResponseBody model) {
            this.requestId = model.requestId;
            this.result = model.result;
            this.success = model.success;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BCE45E6D-****-4F94-86BB-****2B1615FF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returns the list of users under the organization role.</p>
         */
        public Builder result(Result result) {
            this.result = result;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Possible values:</p>
         * <ul>
         * <li>true: Request succeeded</li>
         * <li>false: Request failed</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListOrganizationRoleUsersResponseBody build() {
            return new ListOrganizationRoleUsersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOrganizationRoleUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrganizationRoleUsersResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("NickName")
        private String nickName;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        private Data(Builder builder) {
            this.nickName = builder.nickName;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return nickName
         */
        public String getNickName() {
            return this.nickName;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String nickName; 
            private String userId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.nickName = model.nickName;
                this.userId = model.userId;
            } 

            /**
             * <p>Nickname of the organization member.</p>
             * 
             * <strong>example:</strong>
             * <p>Test User</p>
             */
            public Builder nickName(String nickName) {
                this.nickName = nickName;
                return this;
            }

            /**
             * <p>UserID of the organization member in Quick BI.</p>
             * 
             * <strong>example:</strong>
             * <p>b5d8fd9348cc4327****afb604</p>
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListOrganizationRoleUsersResponseBody} extends {@link TeaModel}
     *
     * <p>ListOrganizationRoleUsersResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private java.util.List<Data> data;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalNum")
        private Integer totalNum;

        @com.aliyun.core.annotation.NameInMap("TotalPages")
        private Integer totalPages;

        private Result(Builder builder) {
            this.data = builder.data;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalNum = builder.totalNum;
            this.totalPages = builder.totalPages;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public java.util.List<Data> getData() {
            return this.data;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNum
         */
        public Integer getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return totalPages
         */
        public Integer getTotalPages() {
            return this.totalPages;
        }

        public static final class Builder {
            private java.util.List<Data> data; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalNum; 
            private Integer totalPages; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.pageNum = model.pageNum;
                this.pageSize = model.pageSize;
                this.totalNum = model.totalNum;
                this.totalPages = model.totalPages;
            } 

            /**
             * <p>User list.</p>
             */
            public Builder data(java.util.List<Data> data) {
                this.data = data;
                return this;
            }

            /**
             * <p>Page number.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>Number of items per page as set in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total number of items.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder totalNum(Integer totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * <p>Total number of pages.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
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
