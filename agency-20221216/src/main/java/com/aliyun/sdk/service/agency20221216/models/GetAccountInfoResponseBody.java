// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agency20221216.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccountInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAccountInfoResponseBody</p>
 */
public class GetAccountInfoResponseBody extends TeaModel {
    @NameInMap("AccountInfoList")
    private AccountInfoList accountInfoList;

    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageInfo")
    private PageInfo pageInfo;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetAccountInfoResponseBody(Builder builder) {
        this.accountInfoList = builder.accountInfoList;
        this.code = builder.code;
        this.message = builder.message;
        this.pageInfo = builder.pageInfo;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAccountInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return accountInfoList
     */
    public AccountInfoList getAccountInfoList() {
        return this.accountInfoList;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return this.pageInfo;
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

    public static final class Builder {
        private AccountInfoList accountInfoList; 
        private String code; 
        private String message; 
        private PageInfo pageInfo; 
        private String requestId; 
        private Boolean success; 

        /**
         * AccountInfoList.
         */
        public Builder accountInfoList(AccountInfoList accountInfoList) {
            this.accountInfoList = accountInfoList;
            return this;
        }

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * message
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageInfo.
         */
        public Builder pageInfo(PageInfo pageInfo) {
            this.pageInfo = pageInfo;
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

        public GetAccountInfoResponseBody build() {
            return new GetAccountInfoResponseBody(this);
        } 

    } 

    public static class AccountInfo extends TeaModel {
        @NameInMap("AccountNickname")
        private String accountNickname;

        @NameInMap("AliyunId")
        private String aliyunId;

        @NameInMap("AssociationSuccessTime")
        private String associationSuccessTime;

        @NameInMap("Cid")
        private Long cid;

        @NameInMap("Email")
        private String email;

        @NameInMap("Mobile")
        private String mobile;

        @NameInMap("Remark")
        private String remark;

        @NameInMap("SubAccountType")
        private Integer subAccountType;

        @NameInMap("Uid")
        private Long uid;

        private AccountInfo(Builder builder) {
            this.accountNickname = builder.accountNickname;
            this.aliyunId = builder.aliyunId;
            this.associationSuccessTime = builder.associationSuccessTime;
            this.cid = builder.cid;
            this.email = builder.email;
            this.mobile = builder.mobile;
            this.remark = builder.remark;
            this.subAccountType = builder.subAccountType;
            this.uid = builder.uid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountInfo create() {
            return builder().build();
        }

        /**
         * @return accountNickname
         */
        public String getAccountNickname() {
            return this.accountNickname;
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return associationSuccessTime
         */
        public String getAssociationSuccessTime() {
            return this.associationSuccessTime;
        }

        /**
         * @return cid
         */
        public Long getCid() {
            return this.cid;
        }

        /**
         * @return email
         */
        public String getEmail() {
            return this.email;
        }

        /**
         * @return mobile
         */
        public String getMobile() {
            return this.mobile;
        }

        /**
         * @return remark
         */
        public String getRemark() {
            return this.remark;
        }

        /**
         * @return subAccountType
         */
        public Integer getSubAccountType() {
            return this.subAccountType;
        }

        /**
         * @return uid
         */
        public Long getUid() {
            return this.uid;
        }

        public static final class Builder {
            private String accountNickname; 
            private String aliyunId; 
            private String associationSuccessTime; 
            private Long cid; 
            private String email; 
            private String mobile; 
            private String remark; 
            private Integer subAccountType; 
            private Long uid; 

            /**
             * AccountNickname.
             */
            public Builder accountNickname(String accountNickname) {
                this.accountNickname = accountNickname;
                return this;
            }

            /**
             * AliyunId.
             */
            public Builder aliyunId(String aliyunId) {
                this.aliyunId = aliyunId;
                return this;
            }

            /**
             * AssociationSuccessTime.
             */
            public Builder associationSuccessTime(String associationSuccessTime) {
                this.associationSuccessTime = associationSuccessTime;
                return this;
            }

            /**
             * Cid.
             */
            public Builder cid(Long cid) {
                this.cid = cid;
                return this;
            }

            /**
             * Email.
             */
            public Builder email(String email) {
                this.email = email;
                return this;
            }

            /**
             * Mobile.
             */
            public Builder mobile(String mobile) {
                this.mobile = mobile;
                return this;
            }

            /**
             * Remark.
             */
            public Builder remark(String remark) {
                this.remark = remark;
                return this;
            }

            /**
             * SubAccountType.
             */
            public Builder subAccountType(Integer subAccountType) {
                this.subAccountType = subAccountType;
                return this;
            }

            /**
             * Uid.
             */
            public Builder uid(Long uid) {
                this.uid = uid;
                return this;
            }

            public AccountInfo build() {
                return new AccountInfo(this);
            } 

        } 

    }
    public static class AccountInfoList extends TeaModel {
        @NameInMap("AccountInfo")
        private java.util.List < AccountInfo> accountInfo;

        private AccountInfoList(Builder builder) {
            this.accountInfo = builder.accountInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountInfoList create() {
            return builder().build();
        }

        /**
         * @return accountInfo
         */
        public java.util.List < AccountInfo> getAccountInfo() {
            return this.accountInfo;
        }

        public static final class Builder {
            private java.util.List < AccountInfo> accountInfo; 

            /**
             * AccountInfo.
             */
            public Builder accountInfo(java.util.List < AccountInfo> accountInfo) {
                this.accountInfo = accountInfo;
                return this;
            }

            public AccountInfoList build() {
                return new AccountInfoList(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Page")
        private Integer page;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private PageInfo(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PageInfo create() {
            return builder().build();
        }

        /**
         * @return page
         */
        public Integer getPage() {
            return this.page;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return total
         */
        public Integer getTotal() {
            return this.total;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * Page.
             */
            public Builder page(Integer page) {
                this.page = page;
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
             * Total.
             */
            public Builder total(Integer total) {
                this.total = total;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
}
