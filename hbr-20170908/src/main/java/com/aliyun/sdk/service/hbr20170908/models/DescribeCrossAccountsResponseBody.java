// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

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
 * {@link DescribeCrossAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrossAccountsResponseBody</p>
 */
public class DescribeCrossAccountsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CrossAccounts")
    private CrossAccounts crossAccounts;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeCrossAccountsResponseBody(Builder builder) {
        this.code = builder.code;
        this.crossAccounts = builder.crossAccounts;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCrossAccountsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return crossAccounts
     */
    public CrossAccounts getCrossAccounts() {
        return this.crossAccounts;
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private CrossAccounts crossAccounts; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeCrossAccountsResponseBody model) {
            this.code = model.code;
            this.crossAccounts = model.crossAccounts;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The return code. A value of 200 indicates success.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CrossAccounts.
         */
        public Builder crossAccounts(CrossAccounts crossAccounts) {
            this.crossAccounts = crossAccounts;
            return this;
        }

        /**
         * <p>A description of the response. Successful requests return &quot;successful&quot;. Failed requests return an error message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number for paging. Pages start from 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Minimum value: 1. Maximum value: 99. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded.</p>
         * <ul>
         * <li><p>true: succeeded</p>
         * </li>
         * <li><p>false: failed</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCrossAccountsResponseBody build() {
            return new DescribeCrossAccountsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCrossAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossAccountsResponseBody</p>
     */
    public static class CrossAccount extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Alias")
        private String alias;

        @com.aliyun.core.annotation.NameInMap("CreatedTime")
        private Long createdTime;

        @com.aliyun.core.annotation.NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @com.aliyun.core.annotation.NameInMap("CrossAccountType")
        private String crossAccountType;

        @com.aliyun.core.annotation.NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("OwnerId")
        private Long ownerId;

        @com.aliyun.core.annotation.NameInMap("UpdatedTime")
        private Long updatedTime;

        private CrossAccount(Builder builder) {
            this.alias = builder.alias;
            this.createdTime = builder.createdTime;
            this.crossAccountRoleName = builder.crossAccountRoleName;
            this.crossAccountType = builder.crossAccountType;
            this.crossAccountUserId = builder.crossAccountUserId;
            this.id = builder.id;
            this.ownerId = builder.ownerId;
            this.updatedTime = builder.updatedTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossAccount create() {
            return builder().build();
        }

        /**
         * @return alias
         */
        public String getAlias() {
            return this.alias;
        }

        /**
         * @return createdTime
         */
        public Long getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return crossAccountRoleName
         */
        public String getCrossAccountRoleName() {
            return this.crossAccountRoleName;
        }

        /**
         * @return crossAccountType
         */
        public String getCrossAccountType() {
            return this.crossAccountType;
        }

        /**
         * @return crossAccountUserId
         */
        public Long getCrossAccountUserId() {
            return this.crossAccountUserId;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return ownerId
         */
        public Long getOwnerId() {
            return this.ownerId;
        }

        /**
         * @return updatedTime
         */
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

        public static final class Builder {
            private String alias; 
            private Long createdTime; 
            private String crossAccountRoleName; 
            private String crossAccountType; 
            private Long crossAccountUserId; 
            private Long id; 
            private Long ownerId; 
            private Long updatedTime; 

            private Builder() {
            } 

            private Builder(CrossAccount model) {
                this.alias = model.alias;
                this.createdTime = model.createdTime;
                this.crossAccountRoleName = model.crossAccountRoleName;
                this.crossAccountType = model.crossAccountType;
                this.crossAccountUserId = model.crossAccountUserId;
                this.id = model.id;
                this.ownerId = model.ownerId;
                this.updatedTime = model.updatedTime;
            } 

            /**
             * Alias.
             */
            public Builder alias(String alias) {
                this.alias = alias;
                return this;
            }

            /**
             * CreatedTime.
             */
            public Builder createdTime(Long createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * CrossAccountRoleName.
             */
            public Builder crossAccountRoleName(String crossAccountRoleName) {
                this.crossAccountRoleName = crossAccountRoleName;
                return this;
            }

            /**
             * CrossAccountType.
             */
            public Builder crossAccountType(String crossAccountType) {
                this.crossAccountType = crossAccountType;
                return this;
            }

            /**
             * CrossAccountUserId.
             */
            public Builder crossAccountUserId(Long crossAccountUserId) {
                this.crossAccountUserId = crossAccountUserId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * OwnerId.
             */
            public Builder ownerId(Long ownerId) {
                this.ownerId = ownerId;
                return this;
            }

            /**
             * UpdatedTime.
             */
            public Builder updatedTime(Long updatedTime) {
                this.updatedTime = updatedTime;
                return this;
            }

            public CrossAccount build() {
                return new CrossAccount(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCrossAccountsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCrossAccountsResponseBody</p>
     */
    public static class CrossAccounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CrossAccount")
        private java.util.List<CrossAccount> crossAccount;

        private CrossAccounts(Builder builder) {
            this.crossAccount = builder.crossAccount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CrossAccounts create() {
            return builder().build();
        }

        /**
         * @return crossAccount
         */
        public java.util.List<CrossAccount> getCrossAccount() {
            return this.crossAccount;
        }

        public static final class Builder {
            private java.util.List<CrossAccount> crossAccount; 

            private Builder() {
            } 

            private Builder(CrossAccounts model) {
                this.crossAccount = model.crossAccount;
            } 

            /**
             * CrossAccount.
             */
            public Builder crossAccount(java.util.List<CrossAccount> crossAccount) {
                this.crossAccount = crossAccount;
                return this;
            }

            public CrossAccounts build() {
                return new CrossAccounts(this);
            } 

        } 

    }
}
