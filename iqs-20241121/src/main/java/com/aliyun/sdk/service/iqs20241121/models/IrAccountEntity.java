// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iqs20241121.models;

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
 * {@link IrAccountEntity} extends {@link TeaModel}
 *
 * <p>IrAccountEntity</p>
 */
public class IrAccountEntity extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("accountName")
    private String accountName;

    @com.aliyun.core.annotation.NameInMap("accountStatus")
    private String accountStatus;

    @com.aliyun.core.annotation.NameInMap("adjustedNormalQps")
    private Integer adjustedNormalQps;

    @com.aliyun.core.annotation.NameInMap("configuration")
    private String configuration;

    @com.aliyun.core.annotation.NameInMap("createTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("isDeleted")
    private Integer isDeleted;

    @com.aliyun.core.annotation.NameInMap("modifiedTime")
    private String modifiedTime;

    @com.aliyun.core.annotation.NameInMap("quarkKey")
    private String quarkKey;

    @com.aliyun.core.annotation.NameInMap("quarkOsr")
    private String quarkOsr;

    @com.aliyun.core.annotation.NameInMap("quarkUsername")
    private String quarkUsername;

    @com.aliyun.core.annotation.NameInMap("searchType")
    private String searchType;

    @com.aliyun.core.annotation.NameInMap("testQps")
    private Integer testQps;

    @com.aliyun.core.annotation.NameInMap("testQueryPerDay")
    private Integer testQueryPerDay;

    @com.aliyun.core.annotation.NameInMap("testStartTime")
    private String testStartTime;

    private IrAccountEntity(Builder builder) {
        this.accountId = builder.accountId;
        this.accountName = builder.accountName;
        this.accountStatus = builder.accountStatus;
        this.adjustedNormalQps = builder.adjustedNormalQps;
        this.configuration = builder.configuration;
        this.createTime = builder.createTime;
        this.id = builder.id;
        this.isDeleted = builder.isDeleted;
        this.modifiedTime = builder.modifiedTime;
        this.quarkKey = builder.quarkKey;
        this.quarkOsr = builder.quarkOsr;
        this.quarkUsername = builder.quarkUsername;
        this.searchType = builder.searchType;
        this.testQps = builder.testQps;
        this.testQueryPerDay = builder.testQueryPerDay;
        this.testStartTime = builder.testStartTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IrAccountEntity create() {
        return builder().build();
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return accountName
     */
    public String getAccountName() {
        return this.accountName;
    }

    /**
     * @return accountStatus
     */
    public String getAccountStatus() {
        return this.accountStatus;
    }

    /**
     * @return adjustedNormalQps
     */
    public Integer getAdjustedNormalQps() {
        return this.adjustedNormalQps;
    }

    /**
     * @return configuration
     */
    public String getConfiguration() {
        return this.configuration;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return isDeleted
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * @return modifiedTime
     */
    public String getModifiedTime() {
        return this.modifiedTime;
    }

    /**
     * @return quarkKey
     */
    public String getQuarkKey() {
        return this.quarkKey;
    }

    /**
     * @return quarkOsr
     */
    public String getQuarkOsr() {
        return this.quarkOsr;
    }

    /**
     * @return quarkUsername
     */
    public String getQuarkUsername() {
        return this.quarkUsername;
    }

    /**
     * @return searchType
     */
    public String getSearchType() {
        return this.searchType;
    }

    /**
     * @return testQps
     */
    public Integer getTestQps() {
        return this.testQps;
    }

    /**
     * @return testQueryPerDay
     */
    public Integer getTestQueryPerDay() {
        return this.testQueryPerDay;
    }

    /**
     * @return testStartTime
     */
    public String getTestStartTime() {
        return this.testStartTime;
    }

    public static final class Builder {
        private String accountId; 
        private String accountName; 
        private String accountStatus; 
        private Integer adjustedNormalQps; 
        private String configuration; 
        private String createTime; 
        private Long id; 
        private Integer isDeleted; 
        private String modifiedTime; 
        private String quarkKey; 
        private String quarkOsr; 
        private String quarkUsername; 
        private String searchType; 
        private Integer testQps; 
        private Integer testQueryPerDay; 
        private String testStartTime; 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * accountName.
         */
        public Builder accountName(String accountName) {
            this.accountName = accountName;
            return this;
        }

        /**
         * accountStatus.
         */
        public Builder accountStatus(String accountStatus) {
            this.accountStatus = accountStatus;
            return this;
        }

        /**
         * adjustedNormalQps.
         */
        public Builder adjustedNormalQps(Integer adjustedNormalQps) {
            this.adjustedNormalQps = adjustedNormalQps;
            return this;
        }

        /**
         * configuration.
         */
        public Builder configuration(String configuration) {
            this.configuration = configuration;
            return this;
        }

        /**
         * createTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * isDeleted.
         */
        public Builder isDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * modifiedTime.
         */
        public Builder modifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }

        /**
         * quarkKey.
         */
        public Builder quarkKey(String quarkKey) {
            this.quarkKey = quarkKey;
            return this;
        }

        /**
         * quarkOsr.
         */
        public Builder quarkOsr(String quarkOsr) {
            this.quarkOsr = quarkOsr;
            return this;
        }

        /**
         * quarkUsername.
         */
        public Builder quarkUsername(String quarkUsername) {
            this.quarkUsername = quarkUsername;
            return this;
        }

        /**
         * searchType.
         */
        public Builder searchType(String searchType) {
            this.searchType = searchType;
            return this;
        }

        /**
         * testQps.
         */
        public Builder testQps(Integer testQps) {
            this.testQps = testQps;
            return this;
        }

        /**
         * testQueryPerDay.
         */
        public Builder testQueryPerDay(Integer testQueryPerDay) {
            this.testQueryPerDay = testQueryPerDay;
            return this;
        }

        /**
         * testStartTime.
         */
        public Builder testStartTime(String testStartTime) {
            this.testStartTime = testStartTime;
            return this;
        }

        public IrAccountEntity build() {
            return new IrAccountEntity(this);
        } 

    } 

}
