// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20241212.models;

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
 * {@link GetDataStorageResponseBody} extends {@link TeaModel}
 *
 * <p>GetDataStorageResponseBody</p>
 */
public class GetDataStorageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetDataStorageResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDataStorageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetDataStorageResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The detailed information returned.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;DataStorageRegionId&quot;:&quot;cn-shanghai&quot;,&quot;DataStorageTotalCapacity&quot;:1000,&quot;DataStorageUsedCapacity&quot;:41.2,&quot;LogProject&quot;:&quot;aliyun-cloudsiem-data-1234567890123456-cn-shanghai&quot;,&quot;SasLogStores&quot;:[{&quot;LogName&quot;:&quot;Client events&quot;,&quot;LogStoreName&quot;:&quot;aegis-log-client&quot;,&quot;LogDeliveryStatus&quot;:&quot;enable&quot;,&quot;LogStoreTtl&quot;:180,&quot;LogDeliveryUpdateTime&quot;:&quot;2026-10-19T14:00:00&quot;,&quot;LogDeliveryPermission&quot;:&quot;allow&quot;,&quot;LogDeliveryGroup&quot;:&quot;host&quot;,&quot;LogSearchConditions&quot;:&quot;[{\&quot;<strong>topic</strong>\&quot;:\&quot;aegis-log-client\&quot;}]&quot;,&quot;LogCode&quot;:&quot;aegis-log-client&quot;,&quot;LogStoreExisted&quot;:true,&quot;UsedCapacity&quot;:10.3,&quot;AccountDeliveries&quot;:[{&quot;AccountId&quot;:1234567890123456,&quot;AccountName&quot;:&quot;1234567890123456&quot;,&quot;LogDeliveryStatus&quot;:&quot;enable&quot;,&quot;LogDeliveryUpdateTime&quot;:&quot;2026-10-19T14:00:00Z&quot;,&quot;IsDaAccount&quot;:true}]}],&quot;NormalizationLogStores&quot;:[{&quot;LogStoreName&quot;:&quot;host-activity&quot;,&quot;LogStoreTtl&quot;:180,&quot;UsedCapacity&quot;:10.3}],&quot;UnusedLogStores&quot;:[{&quot;LogStoreName&quot;:&quot;cloud-siem&quot;,&quot;LogStoreTtl&quot;:180,&quot;UsedCapacity&quot;:10.3}],&quot;RecordLogStores&quot;:[{&quot;LogStoreName&quot;:&quot;alert-record&quot;,&quot;LogStoreTtl&quot;:180,&quot;UsedCapacity&quot;:10.3}],&quot;NormalizationLogViews&quot;:[{&quot;CategoryName&quot;:&quot;Endpoint security&quot;,&quot;ActivityName&quot;:&quot;Host activity&quot;,&quot;LogViewName&quot;:&quot;host_activity&quot;,&quot;LogStoreName&quot;:&quot;host-activity&quot;,&quot;DetectionRuleReferenceCount&quot;:1,&quot;DetectionRuleReferenceProductIds&quot;:[&quot;sas&quot;],&quot;LogSearchConditions&quot;:&quot;[{\&quot;SCHEMA\&quot;:\&quot;host-activity\&quot;}]&quot;,&quot;LogViewExisted&quot;:true}],&quot;ColdStorageUsedCapacity&quot;:0.0,&quot;DataStorageUsedCapacityDetail&quot;:&quot;{\&quot;purchasedHotStorageCapacity\&quot;:1000,\&quot;usedHotStorageCapacity\&quot;:41.2,\&quot;usedColdStorageCapacity\&quot;:0.0,\&quot;usedHotStorageCapacityDetail\&quot;:{\&quot;cn-shanghai\&quot;:41.2},\&quot;usedColdStorageCapacityDetail\&quot;:{\&quot;cn-shanghai\&quot;:0.0}}&quot;,&quot;DataStorageRegionPermission&quot;:&quot;allow&quot;,&quot;LogServiceDisabled&quot;:false,&quot;LogProjectStateChangeAllowed&quot;:true,&quot;LogProjectState&quot;:&quot;ACTIVE&quot;,&quot;DeliverySettings&quot;:{&quot;PrerequisiteEnabled&quot;:true,&quot;CanConfigure&quot;:true,&quot;Enabled&quot;:true,&quot;Initialized&quot;:true,&quot;DaAccountId&quot;:&quot;1234567890123456&quot;,&quot;TargetProject&quot;:&quot;aliyun-cloudsiem-data-1234567890123456-cn-shanghai&quot;,&quot;TargetRegion&quot;:&quot;cn-shanghai&quot;,&quot;ConfigurationVersion&quot;:1,&quot;Accounts&quot;:[{&quot;AccountId&quot;:&quot;1234567890123456&quot;,&quot;AccountName&quot;:&quot;1234567890123456&quot;,&quot;DaAccount&quot;:true,&quot;Authorized&quot;:true}],&quot;Types&quot;:[{&quot;LogCode&quot;:&quot;aegis-log-client&quot;,&quot;SelectedAccountIds&quot;:[&quot;1234567890123456&quot;],&quot;AutoIncludeNewAccounts&quot;:true,&quot;Executions&quot;:[]}]}}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>81FB0DEA-52C1-55A0-8631-8E1B9A9D****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetDataStorageResponseBody build() {
            return new GetDataStorageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class Accounts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("Authorized")
        private Boolean authorized;

        @com.aliyun.core.annotation.NameInMap("DaAccount")
        private Boolean daAccount;

        private Accounts(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.authorized = builder.authorized;
            this.daAccount = builder.daAccount;
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
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return authorized
         */
        public Boolean getAuthorized() {
            return this.authorized;
        }

        /**
         * @return daAccount
         */
        public Boolean getDaAccount() {
            return this.daAccount;
        }

        public static final class Builder {
            private String accountId; 
            private String accountName; 
            private Boolean authorized; 
            private Boolean daAccount; 

            private Builder() {
            } 

            private Builder(Accounts model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.authorized = model.authorized;
                this.daAccount = model.daAccount;
            } 

            /**
             * <p>The UID of the source Alibaba Cloud account, which is a decimal string.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The display name of the account. If the name is missing, the UID string is returned.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>Specifies whether the account has the authorization required for log delivery. This parameter must be set to true when you add a selected member.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder authorized(Boolean authorized) {
                this.authorized = authorized;
                return this;
            }

            /**
             * <p>Specifies whether the account is the current management and delivery target account, which is the current account.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder daAccount(Boolean daAccount) {
                this.daAccount = daAccount;
                return this;
            }

            public Accounts build() {
                return new Accounts(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class Executions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private String accountId;

        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        private Executions(Builder builder) {
            this.accountId = builder.accountId;
            this.errorCode = builder.errorCode;
            this.status = builder.status;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Executions create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String accountId; 
            private String errorCode; 
            private String status; 
            private Long updateTime; 

            private Builder() {
            } 

            private Builder(Executions model) {
                this.accountId = model.accountId;
                this.errorCode = model.errorCode;
                this.status = model.status;
                this.updateTime = model.updateTime;
            } 

            /**
             * <p>The UID of the source account for this delivery record, which is a decimal string.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123457</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>A reserved compatibility field. The current implementation does not populate historical execution error codes, so this field is usually empty or not returned. If execution fails, read the error code returned by the corresponding write operation.</p>
             * 
             * <strong>example:</strong>
             * <p>null</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The recorded delivery status. RUNNING indicates that the status is recorded as enabled after the last successful operation. STOPPED indicates that the status is recorded as disabled. This field does not indicate real-time log arrival.</p>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The last update time of the delivery status, which is a UNIX timestamp in milliseconds. This field is empty or not returned if the record has no update time.</p>
             * 
             * <strong>example:</strong>
             * <p>1792399200000</p>
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public Executions build() {
                return new Executions(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class Types extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoIncludeNewAccounts")
        private Boolean autoIncludeNewAccounts;

        @com.aliyun.core.annotation.NameInMap("Executions")
        private java.util.List<Executions> executions;

        @com.aliyun.core.annotation.NameInMap("LogCode")
        private String logCode;

        @com.aliyun.core.annotation.NameInMap("SelectedAccountIds")
        private java.util.List<String> selectedAccountIds;

        private Types(Builder builder) {
            this.autoIncludeNewAccounts = builder.autoIncludeNewAccounts;
            this.executions = builder.executions;
            this.logCode = builder.logCode;
            this.selectedAccountIds = builder.selectedAccountIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Types create() {
            return builder().build();
        }

        /**
         * @return autoIncludeNewAccounts
         */
        public Boolean getAutoIncludeNewAccounts() {
            return this.autoIncludeNewAccounts;
        }

        /**
         * @return executions
         */
        public java.util.List<Executions> getExecutions() {
            return this.executions;
        }

        /**
         * @return logCode
         */
        public String getLogCode() {
            return this.logCode;
        }

        /**
         * @return selectedAccountIds
         */
        public java.util.List<String> getSelectedAccountIds() {
            return this.selectedAccountIds;
        }

        public static final class Builder {
            private Boolean autoIncludeNewAccounts; 
            private java.util.List<Executions> executions; 
            private String logCode; 
            private java.util.List<String> selectedAccountIds; 

            private Builder() {
            } 

            private Builder(Types model) {
                this.autoIncludeNewAccounts = model.autoIncludeNewAccounts;
                this.executions = model.executions;
                this.logCode = model.logCode;
                this.selectedAccountIds = model.selectedAccountIds;
            } 

            /**
             * <p>Specifies whether to automatically add subsequent new and available managed members to the selection scope of this log type.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoIncludeNewAccounts(Boolean autoIncludeNewAccounts) {
                this.autoIncludeNewAccounts = autoIncludeNewAccounts;
                return this;
            }

            /**
             * <p>The status list of existing source delivery records for this log type.</p>
             * 
             * <strong>example:</strong>
             * <p>[]</p>
             */
            public Builder executions(java.util.List<Executions> executions) {
                this.executions = executions;
                return this;
            }

            /**
             * <p>The unique identifier of the log type, which corresponds to UpdateDataStorageDelivery.LogCode.</p>
             * 
             * <strong>example:</strong>
             * <p>aegis-log-client</p>
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * <p>The array of UIDs of the selected source accounts for this log type, including the current account. The response is a JSON string array. When you write an array(simple) request, you must serialize it into comma-separated values.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;1234567890123456&quot;]</p>
             */
            public Builder selectedAccountIds(java.util.List<String> selectedAccountIds) {
                this.selectedAccountIds = selectedAccountIds;
                return this;
            }

            public Types build() {
                return new Types(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class DeliverySettings extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Accounts")
        private java.util.List<Accounts> accounts;

        @com.aliyun.core.annotation.NameInMap("CanConfigure")
        private Boolean canConfigure;

        @com.aliyun.core.annotation.NameInMap("ConfigurationVersion")
        private Long configurationVersion;

        @com.aliyun.core.annotation.NameInMap("DaAccountId")
        private String daAccountId;

        @com.aliyun.core.annotation.NameInMap("Enabled")
        private Boolean enabled;

        @com.aliyun.core.annotation.NameInMap("Initialized")
        private Boolean initialized;

        @com.aliyun.core.annotation.NameInMap("PrerequisiteEnabled")
        private Boolean prerequisiteEnabled;

        @com.aliyun.core.annotation.NameInMap("TargetProject")
        private String targetProject;

        @com.aliyun.core.annotation.NameInMap("TargetRegion")
        private String targetRegion;

        @com.aliyun.core.annotation.NameInMap("Types")
        private java.util.List<Types> types;

        @com.aliyun.core.annotation.NameInMap("UnavailableReason")
        private String unavailableReason;

        private DeliverySettings(Builder builder) {
            this.accounts = builder.accounts;
            this.canConfigure = builder.canConfigure;
            this.configurationVersion = builder.configurationVersion;
            this.daAccountId = builder.daAccountId;
            this.enabled = builder.enabled;
            this.initialized = builder.initialized;
            this.prerequisiteEnabled = builder.prerequisiteEnabled;
            this.targetProject = builder.targetProject;
            this.targetRegion = builder.targetRegion;
            this.types = builder.types;
            this.unavailableReason = builder.unavailableReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeliverySettings create() {
            return builder().build();
        }

        /**
         * @return accounts
         */
        public java.util.List<Accounts> getAccounts() {
            return this.accounts;
        }

        /**
         * @return canConfigure
         */
        public Boolean getCanConfigure() {
            return this.canConfigure;
        }

        /**
         * @return configurationVersion
         */
        public Long getConfigurationVersion() {
            return this.configurationVersion;
        }

        /**
         * @return daAccountId
         */
        public String getDaAccountId() {
            return this.daAccountId;
        }

        /**
         * @return enabled
         */
        public Boolean getEnabled() {
            return this.enabled;
        }

        /**
         * @return initialized
         */
        public Boolean getInitialized() {
            return this.initialized;
        }

        /**
         * @return prerequisiteEnabled
         */
        public Boolean getPrerequisiteEnabled() {
            return this.prerequisiteEnabled;
        }

        /**
         * @return targetProject
         */
        public String getTargetProject() {
            return this.targetProject;
        }

        /**
         * @return targetRegion
         */
        public String getTargetRegion() {
            return this.targetRegion;
        }

        /**
         * @return types
         */
        public java.util.List<Types> getTypes() {
            return this.types;
        }

        /**
         * @return unavailableReason
         */
        public String getUnavailableReason() {
            return this.unavailableReason;
        }

        public static final class Builder {
            private java.util.List<Accounts> accounts; 
            private Boolean canConfigure; 
            private Long configurationVersion; 
            private String daAccountId; 
            private Boolean enabled; 
            private Boolean initialized; 
            private Boolean prerequisiteEnabled; 
            private String targetProject; 
            private String targetRegion; 
            private java.util.List<Types> types; 
            private String unavailableReason; 

            private Builder() {
            } 

            private Builder(DeliverySettings model) {
                this.accounts = model.accounts;
                this.canConfigure = model.canConfigure;
                this.configurationVersion = model.configurationVersion;
                this.daAccountId = model.daAccountId;
                this.enabled = model.enabled;
                this.initialized = model.initialized;
                this.prerequisiteEnabled = model.prerequisiteEnabled;
                this.targetProject = model.targetProject;
                this.targetRegion = model.targetRegion;
                this.types = model.types;
                this.unavailableReason = model.unavailableReason;
            } 

            /**
             * <p>The account directory of the current account and managed member accounts.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;AccountId&quot;:&quot;1234567890123456&quot;,&quot;AccountName&quot;:&quot;1234567890123456&quot;,&quot;DaAccount&quot;:true,&quot;Authorized&quot;:true}]</p>
             */
            public Builder accounts(java.util.List<Accounts> accounts) {
                this.accounts = accounts;
                return this;
            }

            /**
             * <p>Specifies whether the current account meets the conditions for delivery setting operations. This is determined based on authorization, target project availability, capacity orders, and the current account identity. The PrerequisiteEnabled parameter must also be met.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder canConfigure(Boolean canConfigure) {
                this.canConfigure = canConfigure;
                return this;
            }

            /**
             * <p>The current version of the delivery settings. When you modify multi-account configurations or specify member delivery, pass this value back as ConfigurationVersion. You must query this value again after each modification and cannot use a fixed example value.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder configurationVersion(Long configurationVersion) {
                this.configurationVersion = configurationVersion;
                return this;
            }

            /**
             * <p>The UID of the current management and delivery target account, which is a decimal string. This is also the current account that is permanently retained in the account selection list.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder daAccountId(String daAccountId) {
                this.daAccountId = daAccountId;
                return this;
            }

            /**
             * <p>The master switch for the saved multi-account centralized delivery. A value of true indicates that the switch is turned on. A value of false indicates that the switch is turned off.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enabled(Boolean enabled) {
                this.enabled = enabled;
                return this;
            }

            /**
             * <p>Specifies whether the initialization of the account scope and automatic inclusion settings is completed when the feature is enabled for the first time.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder initialized(Boolean initialized) {
                this.initialized = initialized;
                return this;
            }

            /**
             * <p>Specifies whether the prerequisite of enabling multi-account security management in Security Center is met.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder prerequisiteEnabled(Boolean prerequisiteEnabled) {
                this.prerequisiteEnabled = prerequisiteEnabled;
                return this;
            }

            /**
             * <p>The name of the current Simple Log Service project for centralized delivery. When you modify multi-account settings or specify member delivery, pass this value back as the TargetProject request parameter.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-cloudsiem-data-1234567890123456-cn-shanghai</p>
             */
            public Builder targetProject(String targetProject) {
                this.targetProject = targetProject;
                return this;
            }

            /**
             * <p>The region ID of the current Simple Log Service project for centralized delivery.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder targetRegion(String targetRegion) {
                this.targetRegion = targetRegion;
                return this;
            }

            /**
             * <p>The account selection, automatic inclusion settings, and existing delivery status categorized by log type.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;LogCode&quot;:&quot;aegis-log-client&quot;,&quot;SelectedAccountIds&quot;:[&quot;1234567890123456&quot;],&quot;AutoIncludeNewAccounts&quot;:true,&quot;Executions&quot;:[]}]</p>
             */
            public Builder types(java.util.List<Types> types) {
                this.types = types;
                return this;
            }

            /**
             * <p>The reason code for being unconfigurable. Valid values: DA_UNAUTHORIZED (the management account is not authorized), TARGET_PROJECT_UNAVAILABLE (the target project is unavailable), LOG_CAPACITY_UNAVAILABLE (no valid capacity order exists), and NOT_CURRENT_ACCOUNT (the operation is not performed by the current account). This field is empty or not returned if the conditions are met.</p>
             * 
             * <strong>example:</strong>
             * <p>DA_UNAUTHORIZED</p>
             */
            public Builder unavailableReason(String unavailableReason) {
                this.unavailableReason = unavailableReason;
                return this;
            }

            public DeliverySettings build() {
                return new DeliverySettings(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class NormalizationLogStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("LogStoreTtl")
        private Integer logStoreTtl;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Double usedCapacity;

        private NormalizationLogStores(Builder builder) {
            this.logStoreName = builder.logStoreName;
            this.logStoreTtl = builder.logStoreTtl;
            this.usedCapacity = builder.usedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationLogStores create() {
            return builder().build();
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return logStoreTtl
         */
        public Integer getLogStoreTtl() {
            return this.logStoreTtl;
        }

        /**
         * @return usedCapacity
         */
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

        public static final class Builder {
            private String logStoreName; 
            private Integer logStoreTtl; 
            private Double usedCapacity; 

            private Builder() {
            } 

            private Builder(NormalizationLogStores model) {
                this.logStoreName = model.logStoreName;
                this.logStoreTtl = model.logStoreTtl;
                this.usedCapacity = model.usedCapacity;
            } 

            /**
             * <p>The name of the Logstore that stores normalized data.</p>
             * 
             * <strong>example:</strong>
             * <p>vulnerability-activity</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The storage duration of the normalized data.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder logStoreTtl(Integer logStoreTtl) {
                this.logStoreTtl = logStoreTtl;
                return this;
            }

            /**
             * <p>The amount of hot storage used.</p>
             * 
             * <strong>example:</strong>
             * <p>10.333</p>
             */
            public Builder usedCapacity(Double usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            public NormalizationLogStores build() {
                return new NormalizationLogStores(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class NormalizationLogViews extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActivityName")
        private String activityName;

        @com.aliyun.core.annotation.NameInMap("CategoryName")
        private String categoryName;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleReferenceCount")
        private Integer detectionRuleReferenceCount;

        @com.aliyun.core.annotation.NameInMap("DetectionRuleReferenceProductIds")
        private java.util.List<String> detectionRuleReferenceProductIds;

        @com.aliyun.core.annotation.NameInMap("LogSearchConditions")
        private String logSearchConditions;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("LogViewExisted")
        private Boolean logViewExisted;

        @com.aliyun.core.annotation.NameInMap("LogViewName")
        private String logViewName;

        private NormalizationLogViews(Builder builder) {
            this.activityName = builder.activityName;
            this.categoryName = builder.categoryName;
            this.detectionRuleReferenceCount = builder.detectionRuleReferenceCount;
            this.detectionRuleReferenceProductIds = builder.detectionRuleReferenceProductIds;
            this.logSearchConditions = builder.logSearchConditions;
            this.logStoreName = builder.logStoreName;
            this.logViewExisted = builder.logViewExisted;
            this.logViewName = builder.logViewName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NormalizationLogViews create() {
            return builder().build();
        }

        /**
         * @return activityName
         */
        public String getActivityName() {
            return this.activityName;
        }

        /**
         * @return categoryName
         */
        public String getCategoryName() {
            return this.categoryName;
        }

        /**
         * @return detectionRuleReferenceCount
         */
        public Integer getDetectionRuleReferenceCount() {
            return this.detectionRuleReferenceCount;
        }

        /**
         * @return detectionRuleReferenceProductIds
         */
        public java.util.List<String> getDetectionRuleReferenceProductIds() {
            return this.detectionRuleReferenceProductIds;
        }

        /**
         * @return logSearchConditions
         */
        public String getLogSearchConditions() {
            return this.logSearchConditions;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return logViewExisted
         */
        public Boolean getLogViewExisted() {
            return this.logViewExisted;
        }

        /**
         * @return logViewName
         */
        public String getLogViewName() {
            return this.logViewName;
        }

        public static final class Builder {
            private String activityName; 
            private String categoryName; 
            private Integer detectionRuleReferenceCount; 
            private java.util.List<String> detectionRuleReferenceProductIds; 
            private String logSearchConditions; 
            private String logStoreName; 
            private Boolean logViewExisted; 
            private String logViewName; 

            private Builder() {
            } 

            private Builder(NormalizationLogViews model) {
                this.activityName = model.activityName;
                this.categoryName = model.categoryName;
                this.detectionRuleReferenceCount = model.detectionRuleReferenceCount;
                this.detectionRuleReferenceProductIds = model.detectionRuleReferenceProductIds;
                this.logSearchConditions = model.logSearchConditions;
                this.logStoreName = model.logStoreName;
                this.logViewExisted = model.logViewExisted;
                this.logViewName = model.logViewName;
            } 

            /**
             * <p>The log type of the normalized logs.</p>
             * 
             * <strong>example:</strong>
             * <p>API security risk log</p>
             */
            public Builder activityName(String activityName) {
                this.activityName = activityName;
                return this;
            }

            /**
             * <p>The category of the normalized logs.</p>
             * 
             * <strong>example:</strong>
             * <p>Security Category</p>
             */
            public Builder categoryName(String categoryName) {
                this.categoryName = categoryName;
                return this;
            }

            /**
             * <p>The number of times this normalized dataset is referenced in Threat Analysis and Response.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder detectionRuleReferenceCount(Integer detectionRuleReferenceCount) {
                this.detectionRuleReferenceCount = detectionRuleReferenceCount;
                return this;
            }

            /**
             * <p>The list of products that reference this normalized dataset in Threat Analysis and Response.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;sas&quot;]</p>
             */
            public Builder detectionRuleReferenceProductIds(java.util.List<String> detectionRuleReferenceProductIds) {
                this.detectionRuleReferenceProductIds = detectionRuleReferenceProductIds;
                return this;
            }

            /**
             * <p>The query statement used to query log types in the normalized dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;SCHEMA\&quot;:\&quot;AZURE_ACTIVE_DIRECTORY_AUDIT_ACTIVITY\&quot;}]</p>
             */
            public Builder logSearchConditions(String logSearchConditions) {
                this.logSearchConditions = logSearchConditions;
                return this;
            }

            /**
             * <p>The Logstore where Threat Analysis and Response stores normalized logs.</p>
             * 
             * <strong>example:</strong>
             * <p>risk-activity</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>Specifies whether the normalized dataset exists. Valid values:</p>
             * <ul>
             * <li>true: The dataset exists.</li>
             * <li>false: The dataset does not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logViewExisted(Boolean logViewExisted) {
                this.logViewExisted = logViewExisted;
                return this;
            }

            /**
             * <p>The name of the normalized dataset.</p>
             * 
             * <strong>example:</strong>
             * <p>risk_activity</p>
             */
            public Builder logViewName(String logViewName) {
                this.logViewName = logViewName;
                return this;
            }

            public NormalizationLogViews build() {
                return new NormalizationLogViews(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class RecordLogStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("LogStoreTtl")
        private Integer logStoreTtl;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Double usedCapacity;

        private RecordLogStores(Builder builder) {
            this.logStoreName = builder.logStoreName;
            this.logStoreTtl = builder.logStoreTtl;
            this.usedCapacity = builder.usedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordLogStores create() {
            return builder().build();
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return logStoreTtl
         */
        public Integer getLogStoreTtl() {
            return this.logStoreTtl;
        }

        /**
         * @return usedCapacity
         */
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

        public static final class Builder {
            private String logStoreName; 
            private Integer logStoreTtl; 
            private Double usedCapacity; 

            private Builder() {
            } 

            private Builder(RecordLogStores model) {
                this.logStoreName = model.logStoreName;
                this.logStoreTtl = model.logStoreTtl;
                this.usedCapacity = model.usedCapacity;
            } 

            /**
             * <p>The name of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>alert-record</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The TTL of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>90</p>
             */
            public Builder logStoreTtl(Integer logStoreTtl) {
                this.logStoreTtl = logStoreTtl;
                return this;
            }

            /**
             * <p>The used capacity of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>11.111</p>
             */
            public Builder usedCapacity(Double usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            public RecordLogStores build() {
                return new RecordLogStores(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class AccountDeliveries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountId")
        private Long accountId;

        @com.aliyun.core.annotation.NameInMap("AccountName")
        private String accountName;

        @com.aliyun.core.annotation.NameInMap("IsDaAccount")
        private Boolean isDaAccount;

        @com.aliyun.core.annotation.NameInMap("LogDeliveryStatus")
        private String logDeliveryStatus;

        @com.aliyun.core.annotation.NameInMap("LogDeliveryUpdateTime")
        private String logDeliveryUpdateTime;

        private AccountDeliveries(Builder builder) {
            this.accountId = builder.accountId;
            this.accountName = builder.accountName;
            this.isDaAccount = builder.isDaAccount;
            this.logDeliveryStatus = builder.logDeliveryStatus;
            this.logDeliveryUpdateTime = builder.logDeliveryUpdateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountDeliveries create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return accountName
         */
        public String getAccountName() {
            return this.accountName;
        }

        /**
         * @return isDaAccount
         */
        public Boolean getIsDaAccount() {
            return this.isDaAccount;
        }

        /**
         * @return logDeliveryStatus
         */
        public String getLogDeliveryStatus() {
            return this.logDeliveryStatus;
        }

        /**
         * @return logDeliveryUpdateTime
         */
        public String getLogDeliveryUpdateTime() {
            return this.logDeliveryUpdateTime;
        }

        public static final class Builder {
            private Long accountId; 
            private String accountName; 
            private Boolean isDaAccount; 
            private String logDeliveryStatus; 
            private String logDeliveryUpdateTime; 

            private Builder() {
            } 

            private Builder(AccountDeliveries model) {
                this.accountId = model.accountId;
                this.accountName = model.accountName;
                this.isDaAccount = model.isDaAccount;
                this.logDeliveryStatus = model.logDeliveryStatus;
                this.logDeliveryUpdateTime = model.logDeliveryUpdateTime;
            } 

            /**
             * <p>The UID of the source cloud account. This field is an int64 number.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * <p>The display name of the source account. If the name is not obtained, the account UID string is used.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567890123456</p>
             */
            public Builder accountName(String accountName) {
                this.accountName = accountName;
                return this;
            }

            /**
             * <p>Indicates whether the account is the current management or target account (the current account). A value of true indicates the current account. A value of false indicates a member source account.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder isDaAccount(Boolean isDaAccount) {
                this.isDaAccount = isDaAccount;
                return this;
            }

            /**
             * <p>The recorded delivery status of the source account. Valid values:</p>
             * <ul>
             * <li>enable: Enabled.</li>
             * <li>disable: Disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder logDeliveryStatus(String logDeliveryStatus) {
                this.logDeliveryStatus = logDeliveryStatus;
                return this;
            }

            /**
             * <p>The last update time of the delivery status for the source account. If no record is generated, this field is empty or not returned.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2026-10-19T14:00:00Z</p>
             */
            public Builder logDeliveryUpdateTime(String logDeliveryUpdateTime) {
                this.logDeliveryUpdateTime = logDeliveryUpdateTime;
                return this;
            }

            public AccountDeliveries build() {
                return new AccountDeliveries(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class SasLogStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountDeliveries")
        private java.util.List<AccountDeliveries> accountDeliveries;

        @com.aliyun.core.annotation.NameInMap("LogCode")
        private String logCode;

        @com.aliyun.core.annotation.NameInMap("LogDeliveryGroup")
        private String logDeliveryGroup;

        @com.aliyun.core.annotation.NameInMap("LogDeliveryPermission")
        private String logDeliveryPermission;

        @com.aliyun.core.annotation.NameInMap("LogDeliveryStatus")
        private String logDeliveryStatus;

        @com.aliyun.core.annotation.NameInMap("LogDeliveryUpdateTime")
        private String logDeliveryUpdateTime;

        @com.aliyun.core.annotation.NameInMap("LogName")
        private String logName;

        @com.aliyun.core.annotation.NameInMap("LogSearchConditions")
        private String logSearchConditions;

        @com.aliyun.core.annotation.NameInMap("LogStoreExisted")
        private Boolean logStoreExisted;

        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("LogStoreTtl")
        private Integer logStoreTtl;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Double usedCapacity;

        private SasLogStores(Builder builder) {
            this.accountDeliveries = builder.accountDeliveries;
            this.logCode = builder.logCode;
            this.logDeliveryGroup = builder.logDeliveryGroup;
            this.logDeliveryPermission = builder.logDeliveryPermission;
            this.logDeliveryStatus = builder.logDeliveryStatus;
            this.logDeliveryUpdateTime = builder.logDeliveryUpdateTime;
            this.logName = builder.logName;
            this.logSearchConditions = builder.logSearchConditions;
            this.logStoreExisted = builder.logStoreExisted;
            this.logStoreName = builder.logStoreName;
            this.logStoreTtl = builder.logStoreTtl;
            this.usedCapacity = builder.usedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SasLogStores create() {
            return builder().build();
        }

        /**
         * @return accountDeliveries
         */
        public java.util.List<AccountDeliveries> getAccountDeliveries() {
            return this.accountDeliveries;
        }

        /**
         * @return logCode
         */
        public String getLogCode() {
            return this.logCode;
        }

        /**
         * @return logDeliveryGroup
         */
        public String getLogDeliveryGroup() {
            return this.logDeliveryGroup;
        }

        /**
         * @return logDeliveryPermission
         */
        public String getLogDeliveryPermission() {
            return this.logDeliveryPermission;
        }

        /**
         * @return logDeliveryStatus
         */
        public String getLogDeliveryStatus() {
            return this.logDeliveryStatus;
        }

        /**
         * @return logDeliveryUpdateTime
         */
        public String getLogDeliveryUpdateTime() {
            return this.logDeliveryUpdateTime;
        }

        /**
         * @return logName
         */
        public String getLogName() {
            return this.logName;
        }

        /**
         * @return logSearchConditions
         */
        public String getLogSearchConditions() {
            return this.logSearchConditions;
        }

        /**
         * @return logStoreExisted
         */
        public Boolean getLogStoreExisted() {
            return this.logStoreExisted;
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return logStoreTtl
         */
        public Integer getLogStoreTtl() {
            return this.logStoreTtl;
        }

        /**
         * @return usedCapacity
         */
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

        public static final class Builder {
            private java.util.List<AccountDeliveries> accountDeliveries; 
            private String logCode; 
            private String logDeliveryGroup; 
            private String logDeliveryPermission; 
            private String logDeliveryStatus; 
            private String logDeliveryUpdateTime; 
            private String logName; 
            private String logSearchConditions; 
            private Boolean logStoreExisted; 
            private String logStoreName; 
            private Integer logStoreTtl; 
            private Double usedCapacity; 

            private Builder() {
            } 

            private Builder(SasLogStores model) {
                this.accountDeliveries = model.accountDeliveries;
                this.logCode = model.logCode;
                this.logDeliveryGroup = model.logDeliveryGroup;
                this.logDeliveryPermission = model.logDeliveryPermission;
                this.logDeliveryStatus = model.logDeliveryStatus;
                this.logDeliveryUpdateTime = model.logDeliveryUpdateTime;
                this.logName = model.logName;
                this.logSearchConditions = model.logSearchConditions;
                this.logStoreExisted = model.logStoreExisted;
                this.logStoreName = model.logStoreName;
                this.logStoreTtl = model.logStoreTtl;
                this.usedCapacity = model.usedCapacity;
            } 

            /**
             * <p>The delivery records of this log type expanded by source account, including the current account and member accounts with existing records.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;AccountId&quot;:1234567890123456,&quot;AccountName&quot;:&quot;1234567890123456&quot;,&quot;LogDeliveryStatus&quot;:&quot;enable&quot;,&quot;LogDeliveryUpdateTime&quot;:&quot;2026-10-19T14:00:00Z&quot;,&quot;IsDaAccount&quot;:true}]</p>
             */
            public Builder accountDeliveries(java.util.List<AccountDeliveries> accountDeliveries) {
                this.accountDeliveries = accountDeliveries;
                return this;
            }

            /**
             * <p>The log code.</p>
             * 
             * <strong>example:</strong>
             * <p>sas-net-block</p>
             */
            public Builder logCode(String logCode) {
                this.logCode = logCode;
                return this;
            }

            /**
             * <p>The group to which the log belongs. Valid values:</p>
             * <ul>
             * <li>host: Host logs.</li>
             * <li>security: Security logs.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>host</p>
             */
            public Builder logDeliveryGroup(String logDeliveryGroup) {
                this.logDeliveryGroup = logDeliveryGroup;
                return this;
            }

            /**
             * <p>Specifies whether the log delivery switch can be operated. Log delivery is unavailable if the service is not purchased. Valid values:</p>
             * <ul>
             * <li>allow: Allowed.</li>
             * <li>deny: Not allowed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>deny</p>
             */
            public Builder logDeliveryPermission(String logDeliveryPermission) {
                this.logDeliveryPermission = logDeliveryPermission;
                return this;
            }

            /**
             * <p>The log delivery status. Valid values:</p>
             * <ul>
             * <li>enable: Log delivery is enabled.</li>
             * <li>disable: Log delivery is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>enable</p>
             */
            public Builder logDeliveryStatus(String logDeliveryStatus) {
                this.logDeliveryStatus = logDeliveryStatus;
                return this;
            }

            /**
             * <p>The time of the last log delivery operation. The format is YYYY-MM-DDTHH:mm:ss.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-07-16T15:10:29</p>
             */
            public Builder logDeliveryUpdateTime(String logDeliveryUpdateTime) {
                this.logDeliveryUpdateTime = logDeliveryUpdateTime;
                return this;
            }

            /**
             * <p>The log name.</p>
             * 
             * <strong>example:</strong>
             * <p>Process Snapshot</p>
             */
            public Builder logName(String logName) {
                this.logName = logName;
                return this;
            }

            /**
             * <p>The default query conditions for the log. When multiple logs are stored in a single Logstore, you must use query conditions to perform a log query for a specific log.</p>
             * 
             * <strong>example:</strong>
             * <p>[{\&quot;<strong>topic</strong>\&quot;:\&quot;sas-net-block\&quot;}]</p>
             */
            public Builder logSearchConditions(String logSearchConditions) {
                this.logSearchConditions = logSearchConditions;
                return this;
            }

            /**
             * <p>Indicates whether the Logstore where the log is stored exists. Valid values:</p>
             * <ul>
             * <li>true: Exists.</li>
             * <li>false: Does not exist.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logStoreExisted(Boolean logStoreExisted) {
                this.logStoreExisted = logStoreExisted;
                return this;
            }

            /**
             * <p>The name of the Logstore where the log is stored.</p>
             * 
             * <strong>example:</strong>
             * <p>sas-security-log</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The storage duration of the Logstore where the log is stored. The minimum storage duration is 30 days.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder logStoreTtl(Integer logStoreTtl) {
                this.logStoreTtl = logStoreTtl;
                return this;
            }

            /**
             * <p>The amount of hot storage used.</p>
             * 
             * <strong>example:</strong>
             * <p>10.333</p>
             */
            public Builder usedCapacity(Double usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            public SasLogStores build() {
                return new SasLogStores(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class UnusedLogStores extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("LogStoreName")
        private String logStoreName;

        @com.aliyun.core.annotation.NameInMap("LogStoreTtl")
        private Integer logStoreTtl;

        @com.aliyun.core.annotation.NameInMap("UsedCapacity")
        private Double usedCapacity;

        private UnusedLogStores(Builder builder) {
            this.logStoreName = builder.logStoreName;
            this.logStoreTtl = builder.logStoreTtl;
            this.usedCapacity = builder.usedCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UnusedLogStores create() {
            return builder().build();
        }

        /**
         * @return logStoreName
         */
        public String getLogStoreName() {
            return this.logStoreName;
        }

        /**
         * @return logStoreTtl
         */
        public Integer getLogStoreTtl() {
            return this.logStoreTtl;
        }

        /**
         * @return usedCapacity
         */
        public Double getUsedCapacity() {
            return this.usedCapacity;
        }

        public static final class Builder {
            private String logStoreName; 
            private Integer logStoreTtl; 
            private Double usedCapacity; 

            private Builder() {
            } 

            private Builder(UnusedLogStores model) {
                this.logStoreName = model.logStoreName;
                this.logStoreTtl = model.logStoreTtl;
                this.usedCapacity = model.usedCapacity;
            } 

            /**
             * <p>The name of the Logstore.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud-siem</p>
             */
            public Builder logStoreName(String logStoreName) {
                this.logStoreName = logStoreName;
                return this;
            }

            /**
             * <p>The data retention period.</p>
             * 
             * <strong>example:</strong>
             * <p>180</p>
             */
            public Builder logStoreTtl(Integer logStoreTtl) {
                this.logStoreTtl = logStoreTtl;
                return this;
            }

            /**
             * <p>The amount of hot storage used.</p>
             * 
             * <strong>example:</strong>
             * <p>10.333</p>
             */
            public Builder usedCapacity(Double usedCapacity) {
                this.usedCapacity = usedCapacity;
                return this;
            }

            public UnusedLogStores build() {
                return new UnusedLogStores(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDataStorageResponseBody} extends {@link TeaModel}
     *
     * <p>GetDataStorageResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColdStorageUsedCapacity")
        private Double coldStorageUsedCapacity;

        @com.aliyun.core.annotation.NameInMap("DataStorageRegionId")
        private String dataStorageRegionId;

        @com.aliyun.core.annotation.NameInMap("DataStorageRegionPermission")
        private String dataStorageRegionPermission;

        @com.aliyun.core.annotation.NameInMap("DataStorageTotalCapacity")
        private Long dataStorageTotalCapacity;

        @com.aliyun.core.annotation.NameInMap("DataStorageUsedCapacity")
        private Double dataStorageUsedCapacity;

        @com.aliyun.core.annotation.NameInMap("DataStorageUsedCapacityDetail")
        private String dataStorageUsedCapacityDetail;

        @com.aliyun.core.annotation.NameInMap("DeliverySettings")
        private DeliverySettings deliverySettings;

        @com.aliyun.core.annotation.NameInMap("DeliverySettingsError")
        private String deliverySettingsError;

        @com.aliyun.core.annotation.NameInMap("LogProject")
        private String logProject;

        @com.aliyun.core.annotation.NameInMap("LogProjectState")
        private String logProjectState;

        @com.aliyun.core.annotation.NameInMap("LogProjectStateChangeAllowed")
        private Boolean logProjectStateChangeAllowed;

        @com.aliyun.core.annotation.NameInMap("LogServiceDisabled")
        private Boolean logServiceDisabled;

        @com.aliyun.core.annotation.NameInMap("NormalizationLogStores")
        private java.util.List<NormalizationLogStores> normalizationLogStores;

        @com.aliyun.core.annotation.NameInMap("NormalizationLogViews")
        private java.util.List<NormalizationLogViews> normalizationLogViews;

        @com.aliyun.core.annotation.NameInMap("RecordLogStores")
        private java.util.List<RecordLogStores> recordLogStores;

        @com.aliyun.core.annotation.NameInMap("SasLogStores")
        private java.util.List<SasLogStores> sasLogStores;

        @com.aliyun.core.annotation.NameInMap("UnusedLogStores")
        private java.util.List<UnusedLogStores> unusedLogStores;

        private Data(Builder builder) {
            this.coldStorageUsedCapacity = builder.coldStorageUsedCapacity;
            this.dataStorageRegionId = builder.dataStorageRegionId;
            this.dataStorageRegionPermission = builder.dataStorageRegionPermission;
            this.dataStorageTotalCapacity = builder.dataStorageTotalCapacity;
            this.dataStorageUsedCapacity = builder.dataStorageUsedCapacity;
            this.dataStorageUsedCapacityDetail = builder.dataStorageUsedCapacityDetail;
            this.deliverySettings = builder.deliverySettings;
            this.deliverySettingsError = builder.deliverySettingsError;
            this.logProject = builder.logProject;
            this.logProjectState = builder.logProjectState;
            this.logProjectStateChangeAllowed = builder.logProjectStateChangeAllowed;
            this.logServiceDisabled = builder.logServiceDisabled;
            this.normalizationLogStores = builder.normalizationLogStores;
            this.normalizationLogViews = builder.normalizationLogViews;
            this.recordLogStores = builder.recordLogStores;
            this.sasLogStores = builder.sasLogStores;
            this.unusedLogStores = builder.unusedLogStores;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return coldStorageUsedCapacity
         */
        public Double getColdStorageUsedCapacity() {
            return this.coldStorageUsedCapacity;
        }

        /**
         * @return dataStorageRegionId
         */
        public String getDataStorageRegionId() {
            return this.dataStorageRegionId;
        }

        /**
         * @return dataStorageRegionPermission
         */
        public String getDataStorageRegionPermission() {
            return this.dataStorageRegionPermission;
        }

        /**
         * @return dataStorageTotalCapacity
         */
        public Long getDataStorageTotalCapacity() {
            return this.dataStorageTotalCapacity;
        }

        /**
         * @return dataStorageUsedCapacity
         */
        public Double getDataStorageUsedCapacity() {
            return this.dataStorageUsedCapacity;
        }

        /**
         * @return dataStorageUsedCapacityDetail
         */
        public String getDataStorageUsedCapacityDetail() {
            return this.dataStorageUsedCapacityDetail;
        }

        /**
         * @return deliverySettings
         */
        public DeliverySettings getDeliverySettings() {
            return this.deliverySettings;
        }

        /**
         * @return deliverySettingsError
         */
        public String getDeliverySettingsError() {
            return this.deliverySettingsError;
        }

        /**
         * @return logProject
         */
        public String getLogProject() {
            return this.logProject;
        }

        /**
         * @return logProjectState
         */
        public String getLogProjectState() {
            return this.logProjectState;
        }

        /**
         * @return logProjectStateChangeAllowed
         */
        public Boolean getLogProjectStateChangeAllowed() {
            return this.logProjectStateChangeAllowed;
        }

        /**
         * @return logServiceDisabled
         */
        public Boolean getLogServiceDisabled() {
            return this.logServiceDisabled;
        }

        /**
         * @return normalizationLogStores
         */
        public java.util.List<NormalizationLogStores> getNormalizationLogStores() {
            return this.normalizationLogStores;
        }

        /**
         * @return normalizationLogViews
         */
        public java.util.List<NormalizationLogViews> getNormalizationLogViews() {
            return this.normalizationLogViews;
        }

        /**
         * @return recordLogStores
         */
        public java.util.List<RecordLogStores> getRecordLogStores() {
            return this.recordLogStores;
        }

        /**
         * @return sasLogStores
         */
        public java.util.List<SasLogStores> getSasLogStores() {
            return this.sasLogStores;
        }

        /**
         * @return unusedLogStores
         */
        public java.util.List<UnusedLogStores> getUnusedLogStores() {
            return this.unusedLogStores;
        }

        public static final class Builder {
            private Double coldStorageUsedCapacity; 
            private String dataStorageRegionId; 
            private String dataStorageRegionPermission; 
            private Long dataStorageTotalCapacity; 
            private Double dataStorageUsedCapacity; 
            private String dataStorageUsedCapacityDetail; 
            private DeliverySettings deliverySettings; 
            private String deliverySettingsError; 
            private String logProject; 
            private String logProjectState; 
            private Boolean logProjectStateChangeAllowed; 
            private Boolean logServiceDisabled; 
            private java.util.List<NormalizationLogStores> normalizationLogStores; 
            private java.util.List<NormalizationLogViews> normalizationLogViews; 
            private java.util.List<RecordLogStores> recordLogStores; 
            private java.util.List<SasLogStores> sasLogStores; 
            private java.util.List<UnusedLogStores> unusedLogStores; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.coldStorageUsedCapacity = model.coldStorageUsedCapacity;
                this.dataStorageRegionId = model.dataStorageRegionId;
                this.dataStorageRegionPermission = model.dataStorageRegionPermission;
                this.dataStorageTotalCapacity = model.dataStorageTotalCapacity;
                this.dataStorageUsedCapacity = model.dataStorageUsedCapacity;
                this.dataStorageUsedCapacityDetail = model.dataStorageUsedCapacityDetail;
                this.deliverySettings = model.deliverySettings;
                this.deliverySettingsError = model.deliverySettingsError;
                this.logProject = model.logProject;
                this.logProjectState = model.logProjectState;
                this.logProjectStateChangeAllowed = model.logProjectStateChangeAllowed;
                this.logServiceDisabled = model.logServiceDisabled;
                this.normalizationLogStores = model.normalizationLogStores;
                this.normalizationLogViews = model.normalizationLogViews;
                this.recordLogStores = model.recordLogStores;
                this.sasLogStores = model.sasLogStores;
                this.unusedLogStores = model.unusedLogStores;
            } 

            /**
             * <p>The amount of cold storage used for user logs.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder coldStorageUsedCapacity(Double coldStorageUsedCapacity) {
                this.coldStorageUsedCapacity = coldStorageUsedCapacity;
                return this;
            }

            /**
             * <p>The storage region of user logs.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-shanghai</p>
             */
            public Builder dataStorageRegionId(String dataStorageRegionId) {
                this.dataStorageRegionId = dataStorageRegionId;
                return this;
            }

            /**
             * <p>Specifies whether the storage region can be modified. By default, the region cannot be modified. You can contact the product manager to reset the region, and the region can be reset only once. Valid values:</p>
             * <ul>
             * <li>allow: The region can be modified.</li>
             * <li>deny: The region cannot be modified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>deny</p>
             */
            public Builder dataStorageRegionPermission(String dataStorageRegionPermission) {
                this.dataStorageRegionPermission = dataStorageRegionPermission;
                return this;
            }

            /**
             * <p>The storage capacity purchased for subscription.</p>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder dataStorageTotalCapacity(Long dataStorageTotalCapacity) {
                this.dataStorageTotalCapacity = dataStorageTotalCapacity;
                return this;
            }

            /**
             * <p>The amount of storage used in user log management.</p>
             * 
             * <strong>example:</strong>
             * <p>100.0</p>
             */
            public Builder dataStorageUsedCapacity(Double dataStorageUsedCapacity) {
                this.dataStorageUsedCapacity = dataStorageUsedCapacity;
                return this;
            }

            /**
             * <p>The storage usage details of the log management user.</p>
             * 
             * <strong>example:</strong>
             * <p>{\&quot;purchasedHotStorageCapacity\&quot;:1000,\&quot;usedHotStorageCapacity\&quot;:4.2,\&quot;usedHotStorageCapacityDetail\&quot;:{\&quot;ap-southeast-1\&quot;:4.2,\&quot;cn-shenzhen\&quot;:0.0,\&quot;cn-shanghai\&quot;:0.0}}</p>
             */
            public Builder dataStorageUsedCapacityDetail(String dataStorageUsedCapacityDetail) {
                this.dataStorageUsedCapacityDetail = dataStorageUsedCapacityDetail;
                return this;
            }

            /**
             * <p>The multi-account delivery settings for the current storage resources. Returned when the query is successful. If the read operation fails, see DeliverySettingsError.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;PrerequisiteEnabled&quot;:true,&quot;CanConfigure&quot;:true,&quot;Enabled&quot;:true,&quot;Initialized&quot;:true,&quot;DaAccountId&quot;:&quot;1234567890123456&quot;,&quot;TargetProject&quot;:&quot;aliyun-cloudsiem-data-1234567890123456-cn-shanghai&quot;,&quot;TargetRegion&quot;:&quot;cn-shanghai&quot;,&quot;ConfigurationVersion&quot;:1,&quot;Accounts&quot;:[{&quot;AccountId&quot;:&quot;1234567890123456&quot;,&quot;AccountName&quot;:&quot;1234567890123456&quot;,&quot;DaAccount&quot;:true,&quot;Authorized&quot;:true}],&quot;Types&quot;:[{&quot;LogCode&quot;:&quot;aegis-log-client&quot;,&quot;SelectedAccountIds&quot;:[&quot;1234567890123456&quot;],&quot;AutoIncludeNewAccounts&quot;:true,&quot;Executions&quot;:[]}]}</p>
             */
            public Builder deliverySettings(DeliverySettings deliverySettings) {
                this.deliverySettings = deliverySettings;
                return this;
            }

            /**
             * <p>The read error code for the optional multi-account delivery settings. If the read operation fails, DELIVERY_SETTINGS_UNAVAILABLE is returned. If the read operation is successful, this field is empty or not returned, and does not affect other storage fields.</p>
             * 
             * <strong>example:</strong>
             * <p>DELIVERY_SETTINGS_UNAVAILABLE</p>
             */
            public Builder deliverySettingsError(String deliverySettingsError) {
                this.deliverySettingsError = deliverySettingsError;
                return this;
            }

            /**
             * <p>The name of the Simple Log Service project where user logs are stored.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyun-cloudsiem-data-171835723111****-cn-shanghai</p>
             */
            public Builder logProject(String logProject) {
                this.logProject = logProject;
                return this;
            }

            /**
             * <p>The status of the log project.</p>
             * 
             * <strong>example:</strong>
             * <p>ACTIVE</p>
             */
            public Builder logProjectState(String logProjectState) {
                this.logProjectState = logProjectState;
                return this;
            }

            /**
             * <p>Specifies whether the status of the log project can be changed.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder logProjectStateChangeAllowed(Boolean logProjectStateChangeAllowed) {
                this.logProjectStateChangeAllowed = logProjectStateChangeAllowed;
                return this;
            }

            /**
             * <p>Specifies whether Simple Log Service is disabled.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder logServiceDisabled(Boolean logServiceDisabled) {
                this.logServiceDisabled = logServiceDisabled;
                return this;
            }

            /**
             * <p>The details of the Logstores for normalized data.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;LogStoreName&quot;:&quot;host-activity&quot;,&quot;LogStoreTtl&quot;:180,&quot;UsedCapacity&quot;:10.3}]</p>
             */
            public Builder normalizationLogStores(java.util.List<NormalizationLogStores> normalizationLogStores) {
                this.normalizationLogStores = normalizationLogStores;
                return this;
            }

            /**
             * <p>The details of the normalized datasets.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;CategoryName&quot;:&quot;Endpoint security&quot;,&quot;ActivityName&quot;:&quot;Host activity&quot;,&quot;LogViewName&quot;:&quot;host_activity&quot;,&quot;LogStoreName&quot;:&quot;host-activity&quot;,&quot;DetectionRuleReferenceCount&quot;:1,&quot;DetectionRuleReferenceProductIds&quot;:[&quot;sas&quot;],&quot;LogSearchConditions&quot;:&quot;[{\&quot;SCHEMA\&quot;:\&quot;host-activity\&quot;}]&quot;,&quot;LogViewExisted&quot;:true}]</p>
             */
            public Builder normalizationLogViews(java.util.List<NormalizationLogViews> normalizationLogViews) {
                this.normalizationLogViews = normalizationLogViews;
                return this;
            }

            /**
             * <p>The list of Record Logstores.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;LogStoreName&quot;:&quot;alert-record&quot;,&quot;LogStoreTtl&quot;:180,&quot;UsedCapacity&quot;:10.3}]</p>
             */
            public Builder recordLogStores(java.util.List<RecordLogStores> recordLogStores) {
                this.recordLogStores = recordLogStores;
                return this;
            }

            /**
             * <p>The storage details of raw logs in Security Center.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;LogName&quot;:&quot;Client events&quot;,&quot;LogStoreName&quot;:&quot;aegis-log-client&quot;,&quot;LogDeliveryStatus&quot;:&quot;enable&quot;,&quot;LogStoreTtl&quot;:180,&quot;LogDeliveryUpdateTime&quot;:&quot;2026-10-19T14:00:00&quot;,&quot;LogDeliveryPermission&quot;:&quot;allow&quot;,&quot;LogDeliveryGroup&quot;:&quot;host&quot;,&quot;LogSearchConditions&quot;:&quot;[{\&quot;<strong>topic</strong>\&quot;:\&quot;aegis-log-client\&quot;}]&quot;,&quot;LogCode&quot;:&quot;aegis-log-client&quot;,&quot;LogStoreExisted&quot;:true,&quot;UsedCapacity&quot;:10.3,&quot;AccountDeliveries&quot;:[{&quot;AccountId&quot;:1234567890123456,&quot;AccountName&quot;:&quot;1234567890123456&quot;,&quot;LogDeliveryStatus&quot;:&quot;enable&quot;,&quot;LogDeliveryUpdateTime&quot;:&quot;2026-10-19T14:00:00Z&quot;,&quot;IsDaAccount&quot;:true}]}]</p>
             */
            public Builder sasLogStores(java.util.List<SasLogStores> sasLogStores) {
                this.sasLogStores = sasLogStores;
                return this;
            }

            /**
             * <p>The list of legacy Logstores in SIEM V1.</p>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;LogStoreName&quot;:&quot;cloud-siem&quot;,&quot;LogStoreTtl&quot;:180,&quot;UsedCapacity&quot;:10.3}]</p>
             */
            public Builder unusedLogStores(java.util.List<UnusedLogStores> unusedLogStores) {
                this.unusedLogStores = unusedLogStores;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
