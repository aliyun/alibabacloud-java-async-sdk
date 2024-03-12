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
    @NameInMap("BaselineId")
    private String baselineId;

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

    @Query
    @NameInMap("ResellAccountType")
    private String resellAccountType;

    private EnrollAccountRequest(Builder builder) {
        super(builder);
        this.accountNamePrefix = builder.accountNamePrefix;
        this.accountUid = builder.accountUid;
        this.baselineId = builder.baselineId;
        this.baselineItems = builder.baselineItems;
        this.displayName = builder.displayName;
        this.folderId = builder.folderId;
        this.payerAccountUid = builder.payerAccountUid;
        this.regionId = builder.regionId;
        this.resellAccountType = builder.resellAccountType;
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

    /**
     * @return resellAccountType
     */
    public String getResellAccountType() {
        return this.resellAccountType;
    }

    public static final class Builder extends Request.Builder<EnrollAccountRequest, Builder> {
        private String accountNamePrefix; 
        private Long accountUid; 
        private String baselineId; 
        private java.util.List < BaselineItems> baselineItems; 
        private String displayName; 
        private String folderId; 
        private Long payerAccountUid; 
        private String regionId; 
        private String resellAccountType; 

        private Builder() {
            super();
        } 

        private Builder(EnrollAccountRequest request) {
            super(request);
            this.accountNamePrefix = request.accountNamePrefix;
            this.accountUid = request.accountUid;
            this.baselineId = request.baselineId;
            this.baselineItems = request.baselineItems;
            this.displayName = request.displayName;
            this.folderId = request.folderId;
            this.payerAccountUid = request.payerAccountUid;
            this.regionId = request.regionId;
            this.resellAccountType = request.resellAccountType;
        } 

        /**
         * The prefix for the account name of the member.
         * <p>
         * 
         * *   If the account baseline is applied to an account that is newly created, you must configure this parameter.
         * *   If the account baseline is applied to an existing account, you do not need to configure this parameter.
         */
        public Builder accountNamePrefix(String accountNamePrefix) {
            this.putQueryParameter("AccountNamePrefix", accountNamePrefix);
            this.accountNamePrefix = accountNamePrefix;
            return this;
        }

        /**
         * The account ID.
         * <p>
         * 
         * *   If the account baseline is applied to an account that is newly created, you do not need to configure this parameter.
         * *   If the account baseline is applied to an existing account, you must configure this parameter.
         */
        public Builder accountUid(Long accountUid) {
            this.putQueryParameter("AccountUid", accountUid);
            this.accountUid = accountUid;
            return this;
        }

        /**
         * The baseline ID.
         * <p>
         * 
         * If this parameter is left empty, the default baseline is used.
         */
        public Builder baselineId(String baselineId) {
            this.putQueryParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * An array that contains baseline items.
         * <p>
         * 
         * If this parameter is specified, the configurations of the baseline items are merged with the baseline of the specified account. The configurations of the same baseline items are subject to the configuration of this parameter. We recommend that you leave this parameter empty and configure the `BaselineId` parameter to specify an account baseline and apply the configuration of the account baseline to the account.
         */
        public Builder baselineItems(java.util.List < BaselineItems> baselineItems) {
            this.putQueryParameter("BaselineItems", baselineItems);
            this.baselineItems = baselineItems;
            return this;
        }

        /**
         * The display name of the account.
         * <p>
         * 
         * *   If the account baseline is applied to an account that is newly created, you must configure this parameter.
         * *   If the account baseline is applied to an existing account, you do not need to configure this parameter.
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * The ID of the parent folder.
         * <p>
         * 
         * *   If the account baseline is applied to an account that is newly created, you need to specify a parent folder. If you do not configure this parameter, the account is created in the Root folder.
         * *   If the account baseline is applied to an existing account, you do not need to configure this parameter.
         */
        public Builder folderId(String folderId) {
            this.putQueryParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * The ID of the billing account.
         * <p>
         * 
         * *   If the account baseline is applied to an account that is newly created, you need to specify a billing account. If you do not configure this parameter, the self-pay settlement method is used for the account.
         * *   If the account baseline is applied to an existing account, you do not need to configure this parameter.
         */
        public Builder payerAccountUid(Long payerAccountUid) {
            this.putQueryParameter("PayerAccountUid", payerAccountUid);
            this.payerAccountUid = payerAccountUid;
            return this;
        }

        /**
         * The region ID.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The identity type of the member. Valid values:
         * <p>
         * 
         * *   resell (default): The member is an account for a reseller. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.
         * *   non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.
         * 
         * > This parameter is available only for resellers at the international site (alibabacloud.com).
         */
        public Builder resellAccountType(String resellAccountType) {
            this.putQueryParameter("ResellAccountType", resellAccountType);
            this.resellAccountType = resellAccountType;
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
             * The configurations of the baseline item.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * The name of the baseline item.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Specifies whether to skip the baseline item. Valid values:
             * <p>
             * 
             * *   false: The baseline item is not skipped.
             * *   true: The baseline item is skipped.
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * The version of the baseline item.
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
