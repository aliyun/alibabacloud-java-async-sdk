// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryRelationListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryRelationListResponseBody</p>
 */
public class QueryRelationListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private QueryRelationListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryRelationListResponseBody create() {
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryRelationListResponseBody build() {
            return new QueryRelationListResponseBody(this);
        } 

    } 

    public static class FinancialRelationInfoList extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("AccountName")
        private String accountName;

        @NameInMap("AccountNickName")
        private String accountNickName;

        @NameInMap("AccountType")
        private String accountType;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("RelationId")
        private Long relationId;

        @NameInMap("RelationType")
        private String relationType;

        @NameInMap("SetupTime")
        private String setupTime;

        @NameInMap("StartTime")
        private String startTime;

        @NameInMap("State")
        private String state;

        private FinancialRelationInfoList(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.accountNickName = builder.accountNickName;
            this.accountType = builder.accountType;
            this.endTime = builder.endTime;
            this.relationId = builder.relationId;
            this.relationType = builder.relationType;
            this.setupTime = builder.setupTime;
            this.startTime = builder.startTime;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FinancialRelationInfoList create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return accountNickName
         */
        public String getAccountNickName() {
            return this.accountNickName;
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return relationId
         */
        public Long getRelationId() {
            return this.relationId;
        }

        /**
         * @return relationType
         */
        public String getRelationType() {
            return this.relationType;
        }

        /**
         * @return setupTime
         */
        public String getSetupTime() {
            return this.setupTime;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        public static final class Builder {
            private Long accountId; 
            private String accountName; 
            private String accountNickName; 
            private String accountType; 
            private String endTime; 
            private Long relationId; 
            private String relationType; 
            private String setupTime; 
            private String startTime; 
            private String state; 

            /**
             * AccountId.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * AccountName.
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * AccountNickName.
             */
            public Builder accountNickName(String accountNickName) {
                this.accountNickName = accountNickName;
                return this;
            }

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * RelationId.
             */
            public Builder relationId(Long relationId) {
                this.relationId = relationId;
                return this;
            }

            /**
             * RelationType.
             */
            public Builder relationType(String relationType) {
                this.relationType = relationType;
                return this;
            }

            /**
             * SetupTime.
             */
            public Builder setupTime(String setupTime) {
                this.setupTime = setupTime;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            public FinancialRelationInfoList build() {
                return new FinancialRelationInfoList(this);
            } 

        } 

    }
    public static class Data extends TeaModel {
        @NameInMap("FinancialRelationInfoList")
        private java.util.List < FinancialRelationInfoList> financialRelationInfoList;

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.financialRelationInfoList = builder.financialRelationInfoList;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return financialRelationInfoList
         */
        public java.util.List < FinancialRelationInfoList> getFinancialRelationInfoList() {
            return this.financialRelationInfoList;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < FinancialRelationInfoList> financialRelationInfoList; 
            private Integer pageNum; 
            private Integer pageSize; 
            private Integer totalCount; 

            /**
             * FinancialRelationInfoList.
             */
            public Builder financialRelationInfoList(java.util.List < FinancialRelationInfoList> financialRelationInfoList) {
                this.financialRelationInfoList = financialRelationInfoList;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
