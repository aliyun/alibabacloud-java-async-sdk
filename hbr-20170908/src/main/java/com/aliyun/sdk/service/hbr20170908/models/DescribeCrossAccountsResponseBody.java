// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCrossAccountsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCrossAccountsResponseBody</p>
 */
public class DescribeCrossAccountsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("CrossAccounts")
    private CrossAccounts crossAccounts;

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

        /**
         * Code.
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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCrossAccountsResponseBody build() {
            return new DescribeCrossAccountsResponseBody(this);
        } 

    } 

    public static class CrossAccount extends TeaModel {
        @NameInMap("Alias")
        private String alias;

        @NameInMap("CreatedTime")
        private Long createdTime;

        @NameInMap("CrossAccountRoleName")
        private String crossAccountRoleName;

        @NameInMap("CrossAccountUserId")
        private Long crossAccountUserId;

        @NameInMap("Id")
        private Long id;

        @NameInMap("OwnerId")
        private Long ownerId;

        @NameInMap("UpdatedTime")
        private Long updatedTime;

        private CrossAccount(Builder builder) {
            this.alias = builder.alias;
            this.createdTime = builder.createdTime;
            this.crossAccountRoleName = builder.crossAccountRoleName;
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
            private Long crossAccountUserId; 
            private Long id; 
            private Long ownerId; 
            private Long updatedTime; 

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
    public static class CrossAccounts extends TeaModel {
        @NameInMap("CrossAccount")
        private java.util.List < CrossAccount> crossAccount;

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
        public java.util.List < CrossAccount> getCrossAccount() {
            return this.crossAccount;
        }

        public static final class Builder {
            private java.util.List < CrossAccount> crossAccount; 

            /**
             * CrossAccount.
             */
            public Builder crossAccount(java.util.List < CrossAccount> crossAccount) {
                this.crossAccount = crossAccount;
                return this;
            }

            public CrossAccounts build() {
                return new CrossAccounts(this);
            } 

        } 

    }
}
