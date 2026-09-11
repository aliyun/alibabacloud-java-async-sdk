// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dts20200101.models;

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
 * {@link ConfigureMigrationJobAlertRequest} extends {@link RequestModel}
 *
 * <p>ConfigureMigrationJobAlertRequest</p>
 */
public class ConfigureMigrationJobAlertRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelayAlertPhone")
    private String delayAlertPhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelayAlertStatus")
    private String delayAlertStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DelayOverSeconds")
    private String delayOverSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ErrorAlertPhone")
    private String errorAlertPhone;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ErrorAlertStatus")
    private String errorAlertStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MigrationJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String migrationJobId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private ConfigureMigrationJobAlertRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.delayAlertPhone = builder.delayAlertPhone;
        this.delayAlertStatus = builder.delayAlertStatus;
        this.delayOverSeconds = builder.delayOverSeconds;
        this.errorAlertPhone = builder.errorAlertPhone;
        this.errorAlertStatus = builder.errorAlertStatus;
        this.migrationJobId = builder.migrationJobId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureMigrationJobAlertRequest create() {
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
     * @return delayAlertPhone
     */
    public String getDelayAlertPhone() {
        return this.delayAlertPhone;
    }

    /**
     * @return delayAlertStatus
     */
    public String getDelayAlertStatus() {
        return this.delayAlertStatus;
    }

    /**
     * @return delayOverSeconds
     */
    public String getDelayOverSeconds() {
        return this.delayOverSeconds;
    }

    /**
     * @return errorAlertPhone
     */
    public String getErrorAlertPhone() {
        return this.errorAlertPhone;
    }

    /**
     * @return errorAlertStatus
     */
    public String getErrorAlertStatus() {
        return this.errorAlertStatus;
    }

    /**
     * @return migrationJobId
     */
    public String getMigrationJobId() {
        return this.migrationJobId;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<ConfigureMigrationJobAlertRequest, Builder> {
        private String accountId; 
        private String delayAlertPhone; 
        private String delayAlertStatus; 
        private String delayOverSeconds; 
        private String errorAlertPhone; 
        private String errorAlertStatus; 
        private String migrationJobId; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureMigrationJobAlertRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.delayAlertPhone = request.delayAlertPhone;
            this.delayAlertStatus = request.delayAlertStatus;
            this.delayOverSeconds = request.delayOverSeconds;
            this.errorAlertPhone = request.errorAlertPhone;
            this.errorAlertStatus = request.errorAlertStatus;
            this.migrationJobId = request.migrationJobId;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter. This parameter will be deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>12323344****</p>
         */
        public Builder accountId(String accountId) {
            this.putQueryParameter("AccountId", accountId);
            this.accountId = accountId;
            return this;
        }

        /**
         * <p>The mobile phone numbers of contacts for latency alerts. Separate multiple mobile phone numbers with commas (,).</p>
         * <p>This parameter is supported only on the China site (aliyun.com) and supports only Chinese mainland mobile phone numbers. You can specify up to 10 mobile phone numbers.
         * The China site does not support phone alerts. You can configure alert rules for DTS tasks only in the CloudMonitor console.</p>
         * 
         * <strong>example:</strong>
         * <p>1361234****,1371234****</p>
         */
        public Builder delayAlertPhone(String delayAlertPhone) {
            this.putQueryParameter("DelayAlertPhone", delayAlertPhone);
            this.delayAlertPhone = delayAlertPhone;
            return this;
        }

        /**
         * <p>Specifies whether to monitor the latency status. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: yes.</li>
         * <li><strong>disable</strong>: no.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Default value: <strong>enable</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>You must specify at least one of this parameter and the <strong>ErrorAlertStatus</strong> parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder delayAlertStatus(String delayAlertStatus) {
            this.putQueryParameter("DelayAlertStatus", delayAlertStatus);
            this.delayAlertStatus = delayAlertStatus;
            return this;
        }

        /**
         * <p>The threshold for triggering a latency alert. Unit: seconds. The value must be an integer. Set the threshold based on your business requirements. To avoid latency fluctuations caused by network conditions or database loads, set the threshold to 10 seconds or more.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>DelayAlertStatus</strong> is set to <strong>enable</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder delayOverSeconds(String delayOverSeconds) {
            this.putQueryParameter("DelayOverSeconds", delayOverSeconds);
            this.delayOverSeconds = delayOverSeconds;
            return this;
        }

        /**
         * <p>The mobile phone numbers of contacts for exception alerts. Separate multiple mobile phone numbers with commas (,).</p>
         * <p>This parameter is supported only on the China site (aliyun.com) and supports only Chinese mainland mobile phone numbers. You can specify up to 10 mobile phone numbers.
         * The international site does not support phone alerts. You can configure alert rules for DTS tasks only in the CloudMonitor console.</p>
         * 
         * <strong>example:</strong>
         * <p>1361234****,1371234****</p>
         */
        public Builder errorAlertPhone(String errorAlertPhone) {
            this.putQueryParameter("ErrorAlertPhone", errorAlertPhone);
            this.errorAlertPhone = errorAlertPhone;
            return this;
        }

        /**
         * <p>Specifies whether to monitor the exception status. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: yes.</li>
         * <li><strong>disable</strong>: no.</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Default value: <strong>enable</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>You must specify at least one of this parameter and the <strong>DelayAlertStatus</strong> parameter.</li>
         * <li>After you enable the exception status monitoring feature, an alert is triggered when an exception is detected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enable</p>
         */
        public Builder errorAlertStatus(String errorAlertStatus) {
            this.putQueryParameter("ErrorAlertStatus", errorAlertStatus);
            this.errorAlertStatus = errorAlertStatus;
            return this;
        }

        /**
         * <p>Instance ID of the data migration instance. You can call the <strong>DescribeMigrationJobs</strong> operation to query instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dtslb9113qq11n****</p>
         */
        public Builder migrationJobId(String migrationJobId) {
            this.putQueryParameter("MigrationJobId", migrationJobId);
            this.migrationJobId = migrationJobId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The ID of the region where the data migration instance resides. For more information, see the supported region list.</p>
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
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public ConfigureMigrationJobAlertRequest build() {
            return new ConfigureMigrationJobAlertRequest(this);
        } 

    } 

}
