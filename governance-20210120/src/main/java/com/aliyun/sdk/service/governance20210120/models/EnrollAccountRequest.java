// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnrollAccountRequest} extends {@link RequestModel}
 *
 * <p>EnrollAccountRequest</p>
 */
public class EnrollAccountRequest extends Request {
    @Query
    @NameInMap("AccountNamePrefix")
    private String accountNamePrefix;

    @Query
    @NameInMap("AccountUid")
    private Long accountUid;

    @Query
    @NameInMap("BaselineItems")
    private java.util.List < BaselineItems> baselineItems;

    @Query
    @NameInMap("DisplayName")
    private String displayName;

    @Query
    @NameInMap("FolderId")
    private String folderId;

    @Query
    @NameInMap("PayerAccountUid")
    private Long payerAccountUid;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private EnrollAccountRequest(Builder builder) {
        super(builder);
        this.accountNamePrefix = builder.accountNamePrefix;
        this.accountUid = builder.accountUid;
        this.baselineItems = builder.baselineItems;
        this.displayName = builder.displayName;
        this.folderId = builder.folderId;
        this.payerAccountUid = builder.payerAccountUid;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnrollAccountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountNamePrefix
     */
    public String getAccountNamePrefix() {
        return this.accountNamePrefix;
    }

    /**
     * @return accountUid
     */
    public Long getAccountUid() {
        return this.accountUid;
    }

    /**
     * @return baselineItems
     */
    public java.util.List < BaselineItems> getBaselineItems() {
        return this.baselineItems;
    }

    /**
     * @return displayName
     */
    public String getDisplayName() {
        return this.displayName;
    }

    /**
     * @return folderId
     */
    public String getFolderId() {
        return this.folderId;
    }

    /**
     * @return payerAccountUid
     */
    public Long getPayerAccountUid() {
        return this.payerAccountUid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<EnrollAccountRequest, Builder> {
        private String accountNamePrefix; 
        private Long accountUid; 
        private java.util.List < BaselineItems> baselineItems; 
        private String displayName; 
        private String folderId; 
        private Long payerAccountUid; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(EnrollAccountRequest request) {
            super(request);
            this.accountNamePrefix = request.accountNamePrefix;
            this.accountUid = request.accountUid;
            this.baselineItems = request.baselineItems;
            this.displayName = request.displayName;
            this.folderId = request.folderId;
            this.payerAccountUid = request.payerAccountUid;
            this.regionId = request.regionId;
        } 

        /**
         * 账号名称前缀
         */
        public Builder accountNamePrefix(String accountNamePrefix) {
            this.putQueryParameter("AccountNamePrefix", accountNamePrefix);
            this.accountNamePrefix = accountNamePrefix;
            return this;
        }

        /**
         * 注册账号ID
         */
        public Builder accountUid(Long accountUid) {
            this.putQueryParameter("AccountUid", accountUid);
            this.accountUid = accountUid;
            return this;
        }

        /**
         * 基线项配置数组
         */
        public Builder baselineItems(java.util.List < BaselineItems> baselineItems) {
            this.putQueryParameter("BaselineItems", baselineItems);
            this.baselineItems = baselineItems;
            return this;
        }

        /**
         * 账号显示名称
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * 父资源夹ID
         */
        public Builder folderId(String folderId) {
            this.putQueryParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * 结算账号ID
         */
        public Builder payerAccountUid(Long payerAccountUid) {
            this.putQueryParameter("PayerAccountUid", payerAccountUid);
            this.payerAccountUid = payerAccountUid;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public EnrollAccountRequest build() {
            return new EnrollAccountRequest(this);
        } 

    } 

    public static class BaselineItems extends TeaModel {
        @NameInMap("Config")
        private String config;

        @NameInMap("Name")
        private String name;

        @NameInMap("Skip")
        private Boolean skip;

        @NameInMap("Version")
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
             * 基线项配置
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * 基线项名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 是否跳过基线项
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * 基线项版本
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
