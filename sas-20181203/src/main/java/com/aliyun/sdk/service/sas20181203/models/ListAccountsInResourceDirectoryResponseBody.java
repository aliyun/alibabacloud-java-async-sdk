// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
 * {@link ListAccountsInResourceDirectoryResponseBody} extends {@link TeaModel}
 *
 * <p>ListAccountsInResourceDirectoryResponseBody</p>
 */
public class ListAccountsInResourceDirectoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accounts")
    private java.util.List<Accounts> accounts;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListAccountsInResourceDirectoryResponseBody(Builder builder) {
        this.accounts = builder.accounts;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAccountsInResourceDirectoryResponseBody create() {
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Accounts> accounts; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListAccountsInResourceDirectoryResponseBody model) {
            this.accounts = model.accounts;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The members in the resource directory.</p>
         */
        public Builder accounts(java.util.List<Accounts> accounts) {
            this.accounts = accounts;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B7A839E8-70AE-591D-8D9E-C5419A2240DB</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAccountsInResourceDirectoryResponseBody build() {
            return new ListAccountsInResourceDirectoryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAccountsInResourceDirectoryResponseBody} extends {@link TeaModel}
     *
     * <p>ListAccountsInResourceDirectoryResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("BuySas")
        @Deprecated
        private Integer buySas;

        @com.aliyun.core.annotation.NameInMap("BuySasNew")
        private Boolean buySasNew;

        @com.aliyun.core.annotation.NameInMap("ChargeType")
        private Integer chargeType;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("FolderId")
        private String folderId;

        @com.aliyun.core.annotation.NameInMap("InstanceBuyType")
        private Integer instanceBuyType;

        @com.aliyun.core.annotation.NameInMap("IsMaAccount")
        private String isMaAccount;

        @com.aliyun.core.annotation.NameInMap("IsMarked")
        private String isMarked;

        @com.aliyun.core.annotation.NameInMap("IsSasDaAccount")
        private String isSasDaAccount;

        @com.aliyun.core.annotation.NameInMap("IsSiemControlAccount")
        private String isSiemControlAccount;

        @com.aliyun.core.annotation.NameInMap("IsSiemDaAccount")
        private String isSiemDaAccount;

        @com.aliyun.core.annotation.NameInMap("PostBasicService")
        private Integer postBasicService;

        @com.aliyun.core.annotation.NameInMap("PostPayModuleSwitch")
        private String postPayModuleSwitch;

        @com.aliyun.core.annotation.NameInMap("SaleInstance")
        private String saleInstance;

        @com.aliyun.core.annotation.NameInMap("SasVersion")
        private String sasVersion;

        private Accounts(Builder builder) {
            this.accountId = builder.accountId;
            this.buySas = builder.buySas;
            this.buySasNew = builder.buySasNew;
            this.chargeType = builder.chargeType;
            this.displayName = builder.displayName;
            this.folderId = builder.folderId;
            this.instanceBuyType = builder.instanceBuyType;
            this.isMaAccount = builder.isMaAccount;
            this.isMarked = builder.isMarked;
            this.isSasDaAccount = builder.isSasDaAccount;
            this.isSiemControlAccount = builder.isSiemControlAccount;
            this.isSiemDaAccount = builder.isSiemDaAccount;
            this.postBasicService = builder.postBasicService;
            this.postPayModuleSwitch = builder.postPayModuleSwitch;
            this.saleInstance = builder.saleInstance;
            this.sasVersion = builder.sasVersion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Accounts create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return buySas
         */
        public Integer getBuySas() {
            return this.buySas;
        }

        /**
         * @return buySasNew
         */
        public Boolean getBuySasNew() {
            return this.buySasNew;
        }

        /**
         * @return chargeType
         */
        public Integer getChargeType() {
            return this.chargeType;
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
         * @return instanceBuyType
         */
        public Integer getInstanceBuyType() {
            return this.instanceBuyType;
        }

        /**
         * @return isMaAccount
         */
        public String getIsMaAccount() {
            return this.isMaAccount;
        }

        /**
         * @return isMarked
         */
        public String getIsMarked() {
            return this.isMarked;
        }

        /**
         * @return isSasDaAccount
         */
        public String getIsSasDaAccount() {
            return this.isSasDaAccount;
        }

        /**
         * @return isSiemControlAccount
         */
        public String getIsSiemControlAccount() {
            return this.isSiemControlAccount;
        }

        /**
         * @return isSiemDaAccount
         */
        public String getIsSiemDaAccount() {
            return this.isSiemDaAccount;
        }

        /**
         * @return postBasicService
         */
        public Integer getPostBasicService() {
            return this.postBasicService;
        }

        /**
         * @return postPayModuleSwitch
         */
        public String getPostPayModuleSwitch() {
            return this.postPayModuleSwitch;
        }

        /**
         * @return saleInstance
         */
        public String getSaleInstance() {
            return this.saleInstance;
        }

        /**
         * @return sasVersion
         */
        public String getSasVersion() {
            return this.sasVersion;
        }

        public static final class Builder {
            private String accountId; 
            private Integer buySas; 
            private Boolean buySasNew; 
            private Integer chargeType; 
            private String displayName; 
            private String folderId; 
            private Integer instanceBuyType; 
            private String isMaAccount; 
            private String isMarked; 
            private String isSasDaAccount; 
            private String isSiemControlAccount; 
            private String isSiemDaAccount; 
            private Integer postBasicService; 
            private String postPayModuleSwitch; 
            private String saleInstance; 
            private String sasVersion; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.accountId = model.accountId;
                this.buySas = model.buySas;
                this.buySasNew = model.buySasNew;
                this.chargeType = model.chargeType;
                this.displayName = model.displayName;
                this.folderId = model.folderId;
                this.instanceBuyType = model.instanceBuyType;
                this.isMaAccount = model.isMaAccount;
                this.isMarked = model.isMarked;
                this.isSasDaAccount = model.isSasDaAccount;
                this.isSiemControlAccount = model.isSiemControlAccount;
                this.isSiemDaAccount = model.isSiemDaAccount;
                this.postBasicService = model.postBasicService;
                this.postPayModuleSwitch = model.postPayModuleSwitch;
                this.saleInstance = model.saleInstance;
                this.sasVersion = model.sasVersion;
            } 

            /**
             * <p>The Alibaba Cloud account ID of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>180803538814****</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>This parameter is deprecated and should be ignored.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder buySas(Integer buySas) {
                this.buySas = buySas;
                return this;
            }

            /**
             * <p>Whether a yearly or monthly subscription of Cloud Security Center is purchased. Values:</p>
             * <ul>
             * <li><strong>true</strong>: Yes</li>
             * <li><strong>false</strong>: No</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder buySasNew(Boolean buySasNew) {
                this.buySasNew = buySasNew;
                return this;
            }

            /**
             * <p>Subscription type. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Prepaid</li>
             * <li><strong>1</strong>: Pay-As-You-Go</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder chargeType(Integer chargeType) {
                this.chargeType = chargeType;
                return this;
            }

            /**
             * <p>The name of the member.</p>
             * 
             * <strong>example:</strong>
             * <p>abc**</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the folder in the resource directory.</p>
             * 
             * <strong>example:</strong>
             * <p>fd-cE2SQP****</p>
             */
            public Builder folderId(String folderId) {
                this.folderId = folderId;
                return this;
            }

            /**
             * <p>Instance purchase type. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Self-purchased</li>
             * <li><strong>1</strong>: Multi-account allocation</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder instanceBuyType(Integer instanceBuyType) {
                this.instanceBuyType = instanceBuyType;
                return this;
            }

            /**
             * <p>Indicates whether the member is an administrator account of the resource directory. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isMaAccount(String isMaAccount) {
                this.isMaAccount = isMaAccount;
                return this;
            }

            /**
             * <p>Indicates whether the member is marked as followed.</p>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isMarked(String isMarked) {
                this.isMarked = isMarked;
                return this;
            }

            /**
             * <p>Indicates whether the member is a delegated administrator account of Security Center. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isSasDaAccount(String isSasDaAccount) {
                this.isSasDaAccount = isSasDaAccount;
                return this;
            }

            /**
             * <p>Indicates whether the member is an account of the threat analysis and response feature. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isSiemControlAccount(String isSiemControlAccount) {
                this.isSiemControlAccount = isSiemControlAccount;
                return this;
            }

            /**
             * <p>Indicates whether the member is a delegated administrator account of the threat analysis and response feature. Valid values:</p>
             * <ul>
             * <li><strong>yes</strong></li>
             * <li><strong>no</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>no</p>
             */
            public Builder isSiemDaAccount(String isSiemDaAccount) {
                this.isSiemDaAccount = isSiemDaAccount;
                return this;
            }

            /**
             * <p>Post-paid module switch. Values:</p>
             * <ul>
             * <li><strong>0</strong>: Off</li>
             * <li><strong>1</strong>: On</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder postBasicService(Integer postBasicService) {
                this.postBasicService = postBasicService;
                return this;
            }

            /**
             * <p>The switch status of the pay-as-you-go module. The value is a JSON string. Valid values:</p>
             * <ul>
             * <li><p>Key:</p>
             * <ul>
             * <li><strong>VUL</strong>: vulnerability fixing module</li>
             * <li><strong>CSPM</strong>: cloud service configuration check module</li>
             * <li><strong>AGENTLESS</strong>: agentless detection module</li>
             * <li><strong>SERVERLESS</strong>: serverless asset module</li>
             * </ul>
             * </li>
             * <li><p>Value: A value of 0 specifies disabled. A value of 1 specifies enabled.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <p> If you do not specify a value for a module, the original value of the module is retained.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>{&quot;VUL&quot;:0}</p>
             */
            public Builder postPayModuleSwitch(String postPayModuleSwitch) {
                this.postPayModuleSwitch = postPayModuleSwitch;
                return this;
            }

            /**
             * <p>Cloud Security Center Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>postpay-sas-x5x3hy1ly***</p>
             */
            public Builder saleInstance(String saleInstance) {
                this.saleInstance = saleInstance;
                return this;
            }

            /**
             * <p>The edition of Security Center that you use. Valid value:</p>
             * <ul>
             * <li><strong>0</strong> or <strong>1</strong>: Basic</li>
             * <li><strong>2</strong> or <strong>3</strong>: Enterprise</li>
             * <li><strong>5</strong>: Advanced</li>
             * <li><strong>6</strong>: Anti-virus</li>
             * <li><strong>7</strong>: Ultimate</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder sasVersion(String sasVersion) {
                this.sasVersion = sasVersion;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
}
