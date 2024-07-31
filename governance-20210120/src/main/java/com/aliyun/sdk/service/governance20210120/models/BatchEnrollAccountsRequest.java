// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchEnrollAccountsRequest} extends {@link RequestModel}
 *
 * <p>BatchEnrollAccountsRequest</p>
 */
public class BatchEnrollAccountsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private java.util.List < Accounts> accounts;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineId")
    private String baselineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineItems")
    private java.util.List < BaselineItems> baselineItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private BatchEnrollAccountsRequest(Builder builder) {
        super(builder);
        this.accounts = builder.accounts;
        this.baselineId = builder.baselineId;
        this.baselineItems = builder.baselineItems;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchEnrollAccountsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accounts
     */
    public java.util.List < Accounts> getAccounts() {
        return this.accounts;
    }

    /**
     * @return baselineId
     */
    public String getBaselineId() {
        return this.baselineId;
    }

    /**
     * @return baselineItems
     */
    public java.util.List < BaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<BatchEnrollAccountsRequest, Builder> {
        private java.util.List < Accounts> accounts; 
        private String baselineId; 
        private java.util.List < BaselineItems> baselineItems; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(BatchEnrollAccountsRequest request) {
            super(request);
            this.accounts = request.accounts;
            this.baselineId = request.baselineId;
            this.baselineItems = request.baselineItems;
            this.regionId = request.regionId;
        } 

        /**
         * Accounts.
         */
        public Builder accounts(java.util.List < Accounts> accounts) {
            this.putQueryParameter("Accounts", accounts);
            this.accounts = accounts;
            return this;
        }

        /**
         * BaselineId.
         */
        public Builder baselineId(String baselineId) {
            this.putQueryParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * BaselineItems.
         */
        public Builder baselineItems(java.util.List < BaselineItems> baselineItems) {
            this.putQueryParameter("BaselineItems", baselineItems);
            this.baselineItems = baselineItems;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public BatchEnrollAccountsRequest build() {
            return new BatchEnrollAccountsRequest(this);
        } 

    } 

    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountUid")
        private Long accountUid;

        private Accounts(Builder builder) {
            this.accountUid = builder.accountUid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return accountUid
         */
        public Long getAccountUid() {
            return this.accountUid;
        }

        public static final class Builder {
            private Long accountUid; 

            /**
             * AccountUid.
             */
            public Builder accountUid(Long accountUid) {
                this.accountUid = accountUid;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
    public static class BaselineItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Skip")
        private Boolean skip;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private BaselineItems(Builder builder) {
            this.config = builder.config;
            this.name = builder.name;
            this.skip = builder.skip;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static BaselineItems create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return skip
         */
        public Boolean getSkip() {
            return this.skip;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String config; 
            private String name; 
            private Boolean skip; 
            private String version; 

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Skip.
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public BaselineItems build() {
                return new BaselineItems(this);
            } 

        } 

    }
}
