// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imarketing20220704.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMainPartPageResponseBody} extends {@link TeaModel}
 *
 * <p>GetMainPartPageResponseBody</p>
 */
public class GetMainPartPageResponseBody extends TeaModel {
    @NameInMap("Code")
    private Long code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetMainPartPageResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMainPartPageResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Long getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Long code; 
        private Data data; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(Long code) {
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

        public GetMainPartPageResponseBody build() {
            return new GetMainPartPageResponseBody(this);
        } 

    } 

    public static class AccountTypeList extends TeaModel {
        @NameInMap("AccountType")
        private String accountType;

        @NameInMap("AccountTypeDesc")
        private String accountTypeDesc;

        private AccountTypeList(Builder builder) {
            this.accountType = builder.accountType;
            this.accountTypeDesc = builder.accountTypeDesc;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountTypeList create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return accountTypeDesc
         */
        public String getAccountTypeDesc() {
            return this.accountTypeDesc;
        }

        public static final class Builder {
            private String accountType; 
            private String accountTypeDesc; 

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * AccountTypeDesc.
             */
            public Builder accountTypeDesc(String accountTypeDesc) {
                this.accountTypeDesc = accountTypeDesc;
                return this;
            }

            public AccountTypeList build() {
                return new AccountTypeList(this);
            } 

        } 

    }
    public static class List extends TeaModel {
        @NameInMap("AccountTypeList")
        private java.util.List < AccountTypeList> accountTypeList;

        @NameInMap("Company")
        private String company;

        @NameInMap("MainId")
        private Long mainId;

        @NameInMap("MainName")
        private String mainName;

        private List(Builder builder) {
            this.accountTypeList = builder.accountTypeList;
            this.company = builder.company;
            this.mainId = builder.mainId;
            this.mainName = builder.mainName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return accountTypeList
         */
        public java.util.List < AccountTypeList> getAccountTypeList() {
            return this.accountTypeList;
        }

        /**
         * @return company
         */
        public String getCompany() {
            return this.company;
        }

        /**
         * @return mainId
         */
        public Long getMainId() {
            return this.mainId;
        }

        /**
         * @return mainName
         */
        public String getMainName() {
            return this.mainName;
        }

        public static final class Builder {
            private java.util.List < AccountTypeList> accountTypeList; 
            private String company; 
            private Long mainId; 
            private String mainName; 

            /**
             * AccountTypeList.
             */
            public Builder accountTypeList(java.util.List < AccountTypeList> accountTypeList) {
                this.accountTypeList = accountTypeList;
                return this;
            }

            /**
             * Company.
             */
            public Builder company(String company) {
                this.company = company;
                return this;
            }

            /**
             * MainId.
             */
            public Builder mainId(Long mainId) {
                this.mainId = mainId;
                return this;
            }

            /**
             * MainName.
             */
            public Builder mainName(String mainName) {
                this.mainName = mainName;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class PageInfo extends TeaModel {
        @NameInMap("Page")
        private Integer page;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalNumber")
        private Integer totalNumber;

        private PageInfo(Builder builder) {
            this.page = builder.page;
            this.pageSize = builder.pageSize;
            this.totalNumber = builder.totalNumber;
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
         * @return totalNumber
         */
        public Integer getTotalNumber() {
            return this.totalNumber;
        }

        public static final class Builder {
            private Integer page; 
            private Integer pageSize; 
            private Integer totalNumber; 

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
             * TotalNumber.
             */
            public Builder totalNumber(Integer totalNumber) {
                this.totalNumber = totalNumber;
                return this;
            }

            public PageInfo build() {
                return new PageInfo(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("PageInfo")
        private PageInfo pageInfo;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageInfo = builder.pageInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pageInfo
         */
        public PageInfo getPageInfo() {
            return this.pageInfo;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private PageInfo pageInfo; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * PageInfo.
             */
            public Builder pageInfo(PageInfo pageInfo) {
                this.pageInfo = pageInfo;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
