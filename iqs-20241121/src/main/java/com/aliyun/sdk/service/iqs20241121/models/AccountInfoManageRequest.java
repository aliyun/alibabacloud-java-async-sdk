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
 * {@link AccountInfoManageRequest} extends {@link RequestModel}
 *
 * <p>AccountInfoManageRequest</p>
 */
public class AccountInfoManageRequest extends Request {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("quarkKey")
    private String quarkKey;

    @com.aliyun.core.annotation.NameInMap("quarkName")
    private String quarkName;

    @com.aliyun.core.annotation.NameInMap("testQps")
    private Integer testQps;

    @com.aliyun.core.annotation.NameInMap("testQueryPerDay")
    private Integer testQueryPerDay;

    private AccountInfoManageRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.name = builder.name;
        this.quarkKey = builder.quarkKey;
        this.quarkName = builder.quarkName;
        this.testQps = builder.testQps;
        this.testQueryPerDay = builder.testQueryPerDay;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AccountInfoManageRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return quarkKey
     */
    public String getQuarkKey() {
        return this.quarkKey;
    }

    /**
     * @return quarkName
     */
    public String getQuarkName() {
        return this.quarkName;
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

    public static final class Builder extends Request.Builder<AccountInfoManageRequest, Builder> {
        private String accountId; 
        private String name; 
        private String quarkKey; 
        private String quarkName; 
        private Integer testQps; 
        private Integer testQueryPerDay; 

        private Builder() {
            super();
        } 

        private Builder(AccountInfoManageRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.name = request.name;
            this.quarkKey = request.quarkKey;
            this.quarkName = request.quarkName;
            this.testQps = request.testQps;
            this.testQueryPerDay = request.testQueryPerDay;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
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
         * quarkName.
         */
        public Builder quarkName(String quarkName) {
            this.quarkName = quarkName;
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

        @Override
        public AccountInfoManageRequest build() {
            return new AccountInfoManageRequest(this);
        } 

    } 

}
