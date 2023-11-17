// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20230630.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBindingAccountByDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>ListBindingAccountByDeviceResponseBody</p>
 */
public class ListBindingAccountByDeviceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private ListBindingAccountByDeviceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBindingAccountByDeviceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
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

        public ListBindingAccountByDeviceResponseBody build() {
            return new ListBindingAccountByDeviceResponseBody(this);
        } 

    } 

    public static class AccountList extends TeaModel {
        @NameInMap("BindTime")
        private Long bindTime;

        @NameInMap("IdentityAlias")
        private String identityAlias;

        @NameInMap("IdentityId")
        private String identityId;

        private AccountList(Builder builder) {
            this.bindTime = builder.bindTime;
            this.identityAlias = builder.identityAlias;
            this.identityId = builder.identityId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountList create() {
            return builder().build();
        }

        /**
         * @return bindTime
         */
        public Long getBindTime() {
            return this.bindTime;
        }

        /**
         * @return identityAlias
         */
        public String getIdentityAlias() {
            return this.identityAlias;
        }

        /**
         * @return identityId
         */
        public String getIdentityId() {
            return this.identityId;
        }

        public static final class Builder {
            private Long bindTime; 
            private String identityAlias; 
            private String identityId; 

            /**
             * BindTime.
             */
            public Builder bindTime(Long bindTime) {
                this.bindTime = bindTime;
                return this;
            }

            /**
             * IdentityAlias.
             */
            public Builder identityAlias(String identityAlias) {
                this.identityAlias = identityAlias;
                return this;
            }

            /**
             * IdentityId.
             */
            public Builder identityId(String identityId) {
                this.identityId = identityId;
                return this;
            }

            public AccountList build() {
                return new AccountList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("AccountList")
        private java.util.List < AccountList> accountList;

        @NameInMap("PageNo")
        private Integer pageNo;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("Total")
        private Integer total;

        private Data(Builder builder) {
            this.accountList = builder.accountList;
            this.pageNo = builder.pageNo;
            this.pageSize = builder.pageSize;
            this.total = builder.total;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return accountList
         */
        public java.util.List < AccountList> getAccountList() {
            return this.accountList;
        }

        /**
         * @return pageNo
         */
        public Integer getPageNo() {
            return this.pageNo;
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
            private java.util.List < AccountList> accountList; 
            private Integer pageNo; 
            private Integer pageSize; 
            private Integer total; 

            /**
             * AccountList.
             */
            public Builder accountList(java.util.List < AccountList> accountList) {
                this.accountList = accountList;
                return this;
            }

            /**
             * PageNo.
             */
            public Builder pageNo(Integer pageNo) {
                this.pageNo = pageNo;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
