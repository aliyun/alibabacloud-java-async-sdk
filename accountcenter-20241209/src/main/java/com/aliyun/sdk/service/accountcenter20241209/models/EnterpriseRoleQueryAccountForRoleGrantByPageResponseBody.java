// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.accountcenter20241209.models;

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
 * {@link EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody} extends {@link TeaModel}
 *
 * <p>EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody</p>
 */
public class EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private java.util.List<Accounts> accounts;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNo")
    private Integer pageNo;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    @com.aliyun.core.annotation.NameInMap("TotalPage")
    private Integer totalPage;

    private EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.code = builder.code;
        this.maxResults = builder.maxResults;
        this.message = builder.message;
        this.nextToken = builder.nextToken;
        this.pageNo = builder.pageNo;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
        this.totalPage = builder.totalPage;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accounts
     */
    public java.util.List<Accounts> getAccounts() {
        return this.accounts;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
     * @return totalPage
     */
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static final class Builder {
        private java.util.List<Accounts> accounts; 
        private String code; 
        private Integer maxResults; 
        private String message; 
        private String nextToken; 
        private Integer pageNo; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Integer totalCount; 
        private Integer totalPage; 

        private Builder() {
        } 

        private Builder(EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody model) {
            this.accounts = model.accounts;
            this.code = model.code;
            this.maxResults = model.maxResults;
            this.message = model.message;
            this.nextToken = model.nextToken;
            this.pageNo = model.pageNo;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
            this.totalPage = model.totalPage;
        } 

        /**
         * Accounts.
         */
        public Builder accounts(java.util.List<Accounts> accounts) {
            this.accounts = accounts;
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
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
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
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
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
         * TotalPage.
         */
        public Builder totalPage(Integer totalPage) {
            this.totalPage = totalPage;
            return this;
        }

        public EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody build() {
            return new EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody} extends {@link TeaModel}
     *
     * <p>EnterpriseRoleQueryAccountForRoleGrantByPageResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("AliyunId")
        private String aliyunId;

        @com.aliyun.core.annotation.NameInMap("Granted")
        private Boolean granted;

        @com.aliyun.core.annotation.NameInMap("Pk")
        private String pk;

        private Accounts(Builder builder) {
            this.alias = builder.alias;
            this.aliyunId = builder.aliyunId;
            this.granted = builder.granted;
            this.pk = builder.pk;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return aliyunId
         */
        public String getAliyunId() {
            return this.aliyunId;
        }

        /**
         * @return granted
         */
        public Boolean getGranted() {
            return this.granted;
        }

        /**
         * @return pk
         */
        public String getPk() {
            return this.pk;
        }

        public static final class Builder {
            private String alias; 
            private String aliyunId; 
            private Boolean granted; 
            private String pk; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.alias = model.alias;
                this.aliyunId = model.aliyunId;
                this.granted = model.granted;
                this.pk = model.pk;
            } 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
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
             * Granted.
             */
            public Builder granted(Boolean granted) {
                this.granted = granted;
                return this;
            }

            /**
             * Pk.
             */
            public Builder pk(String pk) {
                this.pk = pk;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
