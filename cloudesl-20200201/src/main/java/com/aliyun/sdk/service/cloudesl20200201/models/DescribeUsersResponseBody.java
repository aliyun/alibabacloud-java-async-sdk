// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20200201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUsersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeUsersResponseBody</p>
 */
public class DescribeUsersResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DynamicCode")
    private String dynamicCode;

    @NameInMap("DynamicMessage")
    private String dynamicMessage;

    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Integer totalCount;

    @NameInMap("Users")
    private java.util.List < Users> users;

    private DescribeUsersResponseBody(Builder builder) {
        this.code = builder.code;
        this.dynamicCode = builder.dynamicCode;
        this.dynamicMessage = builder.dynamicMessage;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.users = builder.users;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return dynamicCode
     */
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    /**
     * @return dynamicMessage
     */
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    /**
     * @return users
     */
    public java.util.List < Users> getUsers() {
        return this.users;
    }

    public static final class Builder {
        private String code; 
        private String dynamicCode; 
        private String dynamicMessage; 
        private String errorCode; 
        private String errorMessage; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private java.util.List < Users> users; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DynamicCode.
         */
        public Builder dynamicCode(String dynamicCode) {
            this.dynamicCode = dynamicCode;
            return this;
        }

        /**
         * DynamicMessage.
         */
        public Builder dynamicMessage(String dynamicMessage) {
            this.dynamicMessage = dynamicMessage;
            return this;
        }

        /**
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        /**
         * Users.
         */
        public Builder users(java.util.List < Users> users) {
            this.users = users;
            return this;
        }

        public DescribeUsersResponseBody build() {
            return new DescribeUsersResponseBody(this);
        } 

    } 

    public static class DingTalkInfos extends TeaModel {
        @NameInMap("DingTalkCompanyId")
        private String dingTalkCompanyId;

        @NameInMap("DingTalkUserId")
        private String dingTalkUserId;

        private DingTalkInfos(Builder builder) {
            this.dingTalkCompanyId = builder.dingTalkCompanyId;
            this.dingTalkUserId = builder.dingTalkUserId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DingTalkInfos create() {
            return builder().build();
        }

        /**
         * @return dingTalkCompanyId
         */
        public String getDingTalkCompanyId() {
            return this.dingTalkCompanyId;
        }

        /**
         * @return dingTalkUserId
         */
        public String getDingTalkUserId() {
            return this.dingTalkUserId;
        }

        public static final class Builder {
            private String dingTalkCompanyId; 
            private String dingTalkUserId; 

            /**
             * DingTalkCompanyId.
             */
            public Builder dingTalkCompanyId(String dingTalkCompanyId) {
                this.dingTalkCompanyId = dingTalkCompanyId;
                return this;
            }

            /**
             * DingTalkUserId.
             */
            public Builder dingTalkUserId(String dingTalkUserId) {
                this.dingTalkUserId = dingTalkUserId;
                return this;
            }

            public DingTalkInfos build() {
                return new DingTalkInfos(this);
            } 

        } 

    }
    public static class Users extends TeaModel {
        @NameInMap("Bid")
        private String bid;

        @NameInMap("DingTalkInfos")
        private java.util.List < DingTalkInfos> dingTalkInfos;

        @NameInMap("OwnerId")
        private String ownerId;

        @NameInMap("Stores")
        private String stores;

        @NameInMap("UserId")
        private String userId;

        @NameInMap("UserName")
        private String userName;

        @NameInMap("UserType")
        private String userType;

        private Users(Builder builder) {
            this.bid = builder.bid;
            this.dingTalkInfos = builder.dingTalkInfos;
            this.ownerId = builder.ownerId;
            this.stores = builder.stores;
            this.userId = builder.userId;
            this.userName = builder.userName;
            this.userType = builder.userType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Users create() {
            return builder().build();
        }

        /**
         * @return bid
         */
        public String getBid() {
            return this.bid;
        }

        /**
         * @return dingTalkInfos
         */
        public java.util.List < DingTalkInfos> getDingTalkInfos() {
            return this.dingTalkInfos;
        }

        /**
         * @return ownerId
         */
        public String getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return stores
         */
        public String getStores() {
            return this.stores;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        /**
         * @return userType
         */
        public String getUserType() {
            return this.userType;
        }

        public static final class Builder {
            private String bid; 
            private java.util.List < DingTalkInfos> dingTalkInfos; 
            private String ownerId; 
            private String stores; 
            private String userId; 
            private String userName; 
            private String userType; 

            /**
             * Bid.
             */
            public Builder bid(String bid) {
                this.bid = bid;
                return this;
            }

            /**
             * DingTalkInfos.
             */
            public Builder dingTalkInfos(java.util.List < DingTalkInfos> dingTalkInfos) {
                this.dingTalkInfos = dingTalkInfos;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(String ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * Stores.
             */
            public Builder stores(String stores) {
                this.stores = stores;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * UserName.
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            /**
             * UserType.
             */
            public Builder userType(String userType) {
                this.userType = userType;
                return this;
            }

            public Users build() {
                return new Users(this);
            } 

        } 

    }
}
