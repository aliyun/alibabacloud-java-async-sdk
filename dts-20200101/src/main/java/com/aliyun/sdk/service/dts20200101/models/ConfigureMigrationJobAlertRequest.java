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
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter because this parameter will be removed in the future.</p>
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
         * <p>The mobile phone numbers that receive latency-related alerts. Separate mobile phone numbers with commas (,).</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>This parameter is available only for China site (aliyun.com) users. Only mobile phone numbers in the Chinese mainland are supported. Up to 10 mobile phone numbers can be specified.</li>
         * <li>International site (alibabacloud.com) users cannot receive alerts by using mobile phones, but can <a href="https://help.aliyun.com/document_detail/175876.html">set alert rules for DTS tasks in the Cloud Monitor console</a>.</li>
         * </ul>
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
         * <p>Specifies whether to monitor task latency. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: yes</li>
         * <li><strong>disable</strong>: no</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>The default value is <strong>enable</strong>.</li>
         * <li>You must specify at least one of the DelayAlertStatus and <strong>ErrorAlertStatus</strong> parameters.</li>
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
         * <p>The threshold for triggering latency alerts. The unit is seconds and the value must be an integer. You can set the threshold based on your business needs. To avoid delay fluctuations caused by network and database loads, we recommend that you set the threshold to more than 10 seconds.</p>
         * <blockquote>
         * <p> If the <strong>DelayAlertStatus</strong> parameter is set to <strong>enable</strong>, this parameter must be specified.</p>
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
         * <p>The mobile phone numbers that receive status-related alerts. Separate mobile phone numbers with commas (,).</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>This parameter is available only for China site (aliyun.com) users. Only mobile phone numbers in the Chinese mainland are supported. Up to 10 mobile phone numbers can be specified.</li>
         * <li>International site (alibabacloud.com) users cannot receive alerts by using mobile phones, but can <a href="https://help.aliyun.com/document_detail/175876.html">set alert rules for DTS tasks in the Cloud Monitor console</a>.</li>
         * </ul>
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
         * <p>Specifies whether to monitor task status. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: yes</li>
         * <li><strong>disable</strong>: no</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li>The default value is <strong>enable</strong>.</li>
         * <li>You must specify at least one of the <strong>DelayAlertStatus</strong> and ErrorAlertStatus parameters.</li>
         * <li>If the task that you monitor enters an abnormal state, an alert is triggered.</li>
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
         * <p>The ID of the data migration instance. You can call the <strong>DescribeMigrationJobs</strong> operation to query the instance ID.</p>
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
         * <p>The ID of the region where the data migration instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">List of supported regions</a>.</p>
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
         * <p>Resource group ID.</p>
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
