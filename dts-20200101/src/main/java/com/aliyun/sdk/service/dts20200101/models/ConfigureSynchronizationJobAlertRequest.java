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
 * {@link ConfigureSynchronizationJobAlertRequest} extends {@link RequestModel}
 *
 * <p>ConfigureSynchronizationJobAlertRequest</p>
 */
public class ConfigureSynchronizationJobAlertRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationDirection")
    private String synchronizationDirection;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SynchronizationJobId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String synchronizationJobId;

    private ConfigureSynchronizationJobAlertRequest(Builder builder) {
        super(builder);
        this.accountId = builder.accountId;
        this.delayAlertPhone = builder.delayAlertPhone;
        this.delayAlertStatus = builder.delayAlertStatus;
        this.delayOverSeconds = builder.delayOverSeconds;
        this.errorAlertPhone = builder.errorAlertPhone;
        this.errorAlertStatus = builder.errorAlertStatus;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.synchronizationDirection = builder.synchronizationDirection;
        this.synchronizationJobId = builder.synchronizationJobId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigureSynchronizationJobAlertRequest create() {
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

    /**
     * @return synchronizationDirection
     */
    public String getSynchronizationDirection() {
        return this.synchronizationDirection;
    }

    /**
     * @return synchronizationJobId
     */
    public String getSynchronizationJobId() {
        return this.synchronizationJobId;
    }

    public static final class Builder extends Request.Builder<ConfigureSynchronizationJobAlertRequest, Builder> {
        private String accountId; 
        private String delayAlertPhone; 
        private String delayAlertStatus; 
        private String delayOverSeconds; 
        private String errorAlertPhone; 
        private String errorAlertStatus; 
        private String ownerId; 
        private String regionId; 
        private String resourceGroupId; 
        private String synchronizationDirection; 
        private String synchronizationJobId; 

        private Builder() {
            super();
        } 

        private Builder(ConfigureSynchronizationJobAlertRequest request) {
            super(request);
            this.accountId = request.accountId;
            this.delayAlertPhone = request.delayAlertPhone;
            this.delayAlertStatus = request.delayAlertStatus;
            this.delayOverSeconds = request.delayOverSeconds;
            this.errorAlertPhone = request.errorAlertPhone;
            this.errorAlertStatus = request.errorAlertStatus;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.synchronizationDirection = request.synchronizationDirection;
            this.synchronizationJobId = request.synchronizationJobId;
        } 

        /**
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter. This parameter will be deprecated soon.</p>
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
         * <p>The mobile phone numbers of the contacts to receive latency alerts. Separate multiple mobile phone numbers with commas (,).</p>
         * <p>Note
         * This parameter is currently only supported on the China site. Only mobile phone numbers in the Chinese mainland are supported, and you can specify up to 10 mobile phone numbers.
         * The international site does not support SMS alerts. You can only configure alert rules for DTS tasks by using CloudMonitor.</p>
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
         * <li><strong>enable</strong>: yes</li>
         * <li><strong>disable</strong>: no</li>
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
         * <p>The threshold for triggering a latency alert. Unit: seconds. The value must be an integer. You can set the threshold based on your business requirements. Set the threshold to 10 seconds or more to avoid latency fluctuations caused by network issues or database loads.</p>
         * <blockquote>
         * <p>This parameter is required when the <strong>DelayAlertStatus</strong> parameter is set to <strong>enable</strong>.</p>
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
         * <p>The mobile phone numbers of the contacts to receive abnormal status alerts. Separate multiple mobile phone numbers with commas (,).</p>
         * <p>Note
         * This parameter is currently only supported on the China site. Only mobile phone numbers in the Chinese mainland are supported, and you can specify up to 10 mobile phone numbers.
         * The international site does not support SMS alerts. You can only configure alert rules for DTS tasks by using CloudMonitor.</p>
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
         * <p>Specifies whether to monitor the abnormal status. Valid values:</p>
         * <ul>
         * <li><strong>enable</strong>: yes</li>
         * <li><strong>disable</strong>: no</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>Default value: <strong>enable</strong>.</li>
         * </ul>
         * </blockquote>
         * <ul>
         * <li>You must specify at least one of this parameter and the <strong>DelayAlertStatus</strong> parameter.</li>
         * <li>After the abnormal status monitoring feature is enabled, an alert is triggered if an exception is detected.</li>
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The region ID. Specify this parameter to indicate the region where the instance resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
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
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzawhxxc****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The synchronization direction. Valid values:</p>
         * <ul>
         * <li><strong>Forward</strong>: forward</li>
         * <li><strong>Reverse</strong>: reverse</li>
         * </ul>
         * <blockquote>
         * <p>Default value: <strong>Forward</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Forward</p>
         */
        public Builder synchronizationDirection(String synchronizationDirection) {
            this.putQueryParameter("SynchronizationDirection", synchronizationDirection);
            this.synchronizationDirection = synchronizationDirection;
            return this;
        }

        /**
         * <p>Instance ID of the data synchronization instance. You can query instance ID by calling the DescribeSynchronizationJobs operation.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dtskxz1170c10p****</p>
         */
        public Builder synchronizationJobId(String synchronizationJobId) {
            this.putQueryParameter("SynchronizationJobId", synchronizationJobId);
            this.synchronizationJobId = synchronizationJobId;
            return this;
        }

        @Override
        public ConfigureSynchronizationJobAlertRequest build() {
            return new ConfigureSynchronizationJobAlertRequest(this);
        } 

    } 

}
