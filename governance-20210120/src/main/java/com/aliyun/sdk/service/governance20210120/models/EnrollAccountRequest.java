// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link EnrollAccountRequest} extends {@link RequestModel}
 *
 * <p>EnrollAccountRequest</p>
 */
public class EnrollAccountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountNamePrefix")
    private String accountNamePrefix;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountUid")
    private Long accountUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineId")
    private String baselineId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaselineItems")
    private java.util.List < BaselineItems> baselineItems;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DisplayName")
    private String displayName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FolderId")
    private String folderId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayerAccountUid")
    private Long payerAccountUid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResellAccountType")
    private String resellAccountType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List < Tag> tag;

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
        this.tag = builder.tag;
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

    /**
     * @return tag
     */
    public java.util.List < Tag> getTag() {
        return this.tag;
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
        private java.util.List < Tag> tag; 

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
            this.tag = request.tag;
        } 

        /**
         * <p>The prefix for the account name of the member.</p>
         * <ul>
         * <li>If the account baseline is applied to an account that is newly created, you must configure this parameter.</li>
         * <li>If the account baseline is applied to an existing account, you do not need to configure this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test-account</p>
         */
        public Builder accountNamePrefix(String accountNamePrefix) {
            this.putQueryParameter("AccountNamePrefix", accountNamePrefix);
            this.accountNamePrefix = accountNamePrefix;
            return this;
        }

        /**
         * <p>The account ID.</p>
         * <ul>
         * <li>If the account baseline is applied to an account that is newly created, you do not need to configure this parameter.</li>
         * <li>If the account baseline is applied to an existing account, you must configure this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12868156179****</p>
         */
        public Builder accountUid(Long accountUid) {
            this.putQueryParameter("AccountUid", accountUid);
            this.accountUid = accountUid;
            return this;
        }

        /**
         * <p>The baseline ID.</p>
         * <p>If this parameter is left empty, the default baseline is used.</p>
         * 
         * <strong>example:</strong>
         * <p>afb-bp1durvn3lgqe28v****</p>
         */
        public Builder baselineId(String baselineId) {
            this.putQueryParameter("BaselineId", baselineId);
            this.baselineId = baselineId;
            return this;
        }

        /**
         * <p>An array that contains baseline items.</p>
         * <p>If this parameter is specified, the configurations of the baseline items are merged with the baseline of the specified account. The configurations of the same baseline items are subject to the configuration of this parameter. We recommend that you leave this parameter empty and configure the <code>BaselineId</code> parameter to specify an account baseline and apply the configuration of the account baseline to the account.</p>
         */
        public Builder baselineItems(java.util.List < BaselineItems> baselineItems) {
            this.putQueryParameter("BaselineItems", baselineItems);
            this.baselineItems = baselineItems;
            return this;
        }

        /**
         * <p>The display name of the account.</p>
         * <ul>
         * <li>If the account baseline is applied to an account that is newly created, you must configure this parameter.</li>
         * <li>If the account baseline is applied to an existing account, you do not need to configure this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>test-account</p>
         */
        public Builder displayName(String displayName) {
            this.putQueryParameter("DisplayName", displayName);
            this.displayName = displayName;
            return this;
        }

        /**
         * <p>The ID of the parent folder.</p>
         * <ul>
         * <li>If the account baseline is applied to an account that is newly created, you need to specify a parent folder. If you do not configure this parameter, the account is created in the Root folder.</li>
         * <li>If the account baseline is applied to an existing account, you do not need to configure this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fd-5ESoku****</p>
         */
        public Builder folderId(String folderId) {
            this.putQueryParameter("FolderId", folderId);
            this.folderId = folderId;
            return this;
        }

        /**
         * <p>The ID of the billing account.</p>
         * <ul>
         * <li>If the account baseline is applied to an account that is newly created, you need to specify a billing account. If you do not configure this parameter, the self-pay settlement method is used for the account.</li>
         * <li>If the account baseline is applied to an existing account, you do not need to configure this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>19534534552****</p>
         */
        public Builder payerAccountUid(Long payerAccountUid) {
            this.putQueryParameter("PayerAccountUid", payerAccountUid);
            this.payerAccountUid = payerAccountUid;
            return this;
        }

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The identity type of the member. Valid values:</p>
         * <ul>
         * <li>resell (default): The member is an account for a reseller. A relationship is automatically established between the member and the reseller. The management account of the resource directory must be used as the billing account of the member.</li>
         * <li>non_resell: The member is not an account for a reseller. The member is an account that is not associated with a reseller. You can directly use the account to purchase Alibaba Cloud resources. The member is used as its own billing account.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is available only for resellers at the international site (alibabacloud.com).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>resell</p>
         */
        public Builder resellAccountType(String resellAccountType) {
            this.putQueryParameter("ResellAccountType", resellAccountType);
            this.resellAccountType = resellAccountType;
            return this;
        }

        /**
         * <p>The tags. You can specify up to 20 tags.</p>
         */
        public Builder tag(java.util.List < Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putQueryParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        @Override
        public EnrollAccountRequest build() {
            return new EnrollAccountRequest(this);
        } 

    } 

    /**
     * 
     * {@link EnrollAccountRequest} extends {@link TeaModel}
     *
     * <p>EnrollAccountRequest</p>
     */
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
             * <p>The configurations of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;Notifications&quot;:[{&quot;GroupKey&quot;:&quot;account_msg&quot;,&quot;Contacts&quot;:[{&quot;Name&quot;:&quot;aa&quot;}],&quot;PmsgStatus&quot;:1,&quot;EmailStatus&quot;:1,&quot;SmsStatus&quot;:1}]}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The name of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS-BP_ACCOUNT_FACTORY_VPC</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether to skip the baseline item. Valid values:</p>
             * <ul>
             * <li>false: The baseline item is not skipped.</li>
             * <li>true: The baseline item is skipped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder skip(Boolean skip) {
                this.skip = skip;
                return this;
            }

            /**
             * <p>The version of the baseline item.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0</p>
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
    /**
     * 
     * {@link EnrollAccountRequest} extends {@link TeaModel}
     *
     * <p>EnrollAccountRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>tagKey</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>tagValue</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
