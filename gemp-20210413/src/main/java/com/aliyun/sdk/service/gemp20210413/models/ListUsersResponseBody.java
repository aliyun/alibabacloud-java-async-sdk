// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListUsersResponseBody} extends {@link TeaModel}
 *
 * <p>ListUsersResponseBody</p>
 */
public class ListUsersResponseBody extends TeaModel {
    @NameInMap("data")
    private java.util.List < Data> data;

    @NameInMap("pageNumber")
    private Long pageNumber;

    @NameInMap("pageSize")
    private Long pageSize;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("totalCount")
    private Long totalCount;

    private ListUsersResponseBody(Builder builder) {
        this.data = builder.data;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListUsersResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public java.util.List < Data> getData() {
        return this.data;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < Data> data; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 
        private Long totalCount; 

        /**
         * data
         */
        public Builder data(java.util.List < Data> data) {
            this.data = data;
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
         * id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * totalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListUsersResponseBody build() {
            return new ListUsersResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("accountType")
        private Long accountType;

        @NameInMap("appAccount")
        private String appAccount;

        @NameInMap("email")
        private String email;

        @NameInMap("isEditableUser")
        private Long isEditableUser;

        @NameInMap("isOperation")
        private Integer isOperation;

        @NameInMap("isRam")
        private Integer isRam;

        @NameInMap("isRelated")
        private String isRelated;

        @NameInMap("phone")
        private String phone;

        @NameInMap("ramId")
        private Long ramId;

        @NameInMap("roleIdList")
        private java.util.List < Long > roleIdList;

        @NameInMap("roleNameList")
        private java.util.List < String > roleNameList;

        @NameInMap("synergyChannel")
        private String synergyChannel;

        @NameInMap("userId")
        private Long userId;

        @NameInMap("username")
        private String username;

        private Data(Builder builder) {
            this.accountType = builder.accountType;
            this.appAccount = builder.appAccount;
            this.email = builder.email;
            this.isEditableUser = builder.isEditableUser;
            this.isOperation = builder.isOperation;
            this.isRam = builder.isRam;
            this.isRelated = builder.isRelated;
            this.phone = builder.phone;
            this.ramId = builder.ramId;
            this.roleIdList = builder.roleIdList;
            this.roleNameList = builder.roleNameList;
            this.synergyChannel = builder.synergyChannel;
            this.userId = builder.userId;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public Long getAccountType() {
            return this.accountType;
        }

        /**
         * @return appAccount
         */
        public String getAppAccount() {
            return this.appAccount;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return isEditableUser
         */
        public Long getIsEditableUser() {
            return this.isEditableUser;
        }

        /**
         * @return isOperation
         */
        public Integer getIsOperation() {
            return this.isOperation;
        }

        /**
         * @return isRam
         */
        public Integer getIsRam() {
            return this.isRam;
        }

        /**
         * @return isRelated
         */
        public String getIsRelated() {
            return this.isRelated;
        }

        /**
         * @return phone
         */
        public String getPhone() {
            return this.phone;
        }

        /**
         * @return ramId
         */
        public Long getRamId() {
            return this.ramId;
        }

        /**
         * @return roleIdList
         */
        public java.util.List < Long > getRoleIdList() {
            return this.roleIdList;
        }

        /**
         * @return roleNameList
         */
        public java.util.List < String > getRoleNameList() {
            return this.roleNameList;
        }

        /**
         * @return synergyChannel
         */
        public String getSynergyChannel() {
            return this.synergyChannel;
        }

        /**
         * @return userId
         */
        public Long getUserId() {
            return this.userId;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private Long accountType; 
            private String appAccount; 
            private String email; 
            private Long isEditableUser; 
            private Integer isOperation; 
            private Integer isRam; 
            private String isRelated; 
            private String phone; 
            private Long ramId; 
            private java.util.List < Long > roleIdList; 
            private java.util.List < String > roleNameList; 
            private String synergyChannel; 
            private Long userId; 
            private String username; 

            /**
             * accountType.
             */
            public Builder accountType(Long accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * appAccount.
             */
            public Builder appAccount(String appAccount) {
                this.appAccount = appAccount;
                return this;
            }

            /**
             * email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * isEditableUser.
             */
            public Builder isEditableUser(Long isEditableUser) {
                this.isEditableUser = isEditableUser;
                return this;
            }

            /**
             * isOperation.
             */
            public Builder isOperation(Integer isOperation) {
                this.isOperation = isOperation;
                return this;
            }

            /**
             * isRam.
             */
            public Builder isRam(Integer isRam) {
                this.isRam = isRam;
                return this;
            }

            /**
             * isRelated.
             */
            public Builder isRelated(String isRelated) {
                this.isRelated = isRelated;
                return this;
            }

            /**
             * phone.
             */
            public Builder phone(String phone) {
                this.phone = phone;
                return this;
            }

            /**
             * ramId.
             */
            public Builder ramId(Long ramId) {
                this.ramId = ramId;
                return this;
            }

            /**
             * roleIdList.
             */
            public Builder roleIdList(java.util.List < Long > roleIdList) {
                this.roleIdList = roleIdList;
                return this;
            }

            /**
             * roleNameList.
             */
            public Builder roleNameList(java.util.List < String > roleNameList) {
                this.roleNameList = roleNameList;
                return this;
            }

            /**
             * synergyChannel.
             */
            public Builder synergyChannel(String synergyChannel) {
                this.synergyChannel = synergyChannel;
                return this;
            }

            /**
             * userId.
             */
            public Builder userId(Long userId) {
                this.userId = userId;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
