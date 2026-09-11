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
 * {@link CreateSubscriptionInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateSubscriptionInstanceRequest</p>
 */
public class CreateSubscriptionInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceEndpoint")
    private SourceEndpoint sourceEndpoint;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccountId")
    private String accountId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Region")
    @com.aliyun.core.annotation.Validation(required = true)
    private String region;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Integer usedTime;

    private CreateSubscriptionInstanceRequest(Builder builder) {
        super(builder);
        this.sourceEndpoint = builder.sourceEndpoint;
        this.accountId = builder.accountId;
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.region = builder.region;
        this.regionId = builder.regionId;
        this.resourceGroupId = builder.resourceGroupId;
        this.usedTime = builder.usedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateSubscriptionInstanceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceEndpoint
     */
    public SourceEndpoint getSourceEndpoint() {
        return this.sourceEndpoint;
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return payType
     */
    public String getPayType() {
        return this.payType;
    }

    /**
     * @return period
     */
    public String getPeriod() {
        return this.period;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
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
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public static final class Builder extends Request.Builder<CreateSubscriptionInstanceRequest, Builder> {
        private SourceEndpoint sourceEndpoint; 
        private String accountId; 
        private String clientToken; 
        private String ownerId; 
        private String payType; 
        private String period; 
        private String region; 
        private String regionId; 
        private String resourceGroupId; 
        private Integer usedTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateSubscriptionInstanceRequest request) {
            super(request);
            this.sourceEndpoint = request.sourceEndpoint;
            this.accountId = request.accountId;
            this.clientToken = request.clientToken;
            this.ownerId = request.ownerId;
            this.payType = request.payType;
            this.period = request.period;
            this.region = request.region;
            this.regionId = request.regionId;
            this.resourceGroupId = request.resourceGroupId;
            this.usedTime = request.usedTime;
        } 

        /**
         * SourceEndpoint.
         */
        public Builder sourceEndpoint(SourceEndpoint sourceEndpoint) {
            this.putQueryParameter("SourceEndpoint", sourceEndpoint);
            this.sourceEndpoint = sourceEndpoint;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account. You do not need to specify this parameter. This parameter will be discontinued.</p>
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
         * <p>The client token that is used to ensure the idempotence of the request. Generate a value from your client to make sure that the value is unique among different requests. <strong>ClientToken</strong> supports only ASCII characters and cannot exceed 64 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>0c593ea1-3bea-11e9-b96b-88e9fe63****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
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
         * <p>The billing method.</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go. This is the default value.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Prepaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The billing method of the subscription instance. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong>: annual subscription.</li>
         * <li><strong>Month</strong>: monthly subscription.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid and required only when PayType is set to <strong>Prepaid</strong> (subscription).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Month</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The region ID. Set this parameter to the region where the subscription object resides. For more information, see <a href="https://help.aliyun.com/document_detail/141033.html">Supported regions</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
            return this;
        }

        /**
         * <p>The region to which the change tracking instance belongs. You do not need to specify this parameter. This parameter will be discontinued.</p>
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

        /**
         * <p>The purchase duration of the subscription instance.</p>
         * <ul>
         * <li>If the billing method is set to <strong>Year</strong> (annual subscription), the valid values are <strong>1 to 5</strong>.</li>
         * <li>If the billing method is set to <strong>Month</strong> (monthly subscription), the valid values are <strong>1 to 60</strong>.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid and required only when PayType is set to <strong>Prepaid</strong> (subscription).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        @Override
        public CreateSubscriptionInstanceRequest build() {
            return new CreateSubscriptionInstanceRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateSubscriptionInstanceRequest} extends {@link TeaModel}
     *
     * <p>CreateSubscriptionInstanceRequest</p>
     */
    public static class SourceEndpoint extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InstanceType")
        private String instanceType;

        private SourceEndpoint(Builder builder) {
            this.instanceType = builder.instanceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SourceEndpoint create() {
            return builder().build();
        }

        /**
         * @return instanceType
         */
        public String getInstanceType() {
            return this.instanceType;
        }

        public static final class Builder {
            private String instanceType; 

            private Builder() {
            } 

            private Builder(SourceEndpoint model) {
                this.instanceType = model.instanceType;
            } 

            /**
             * <p>数据订阅的实例类型，取值为：<strong>MySQL</strong>、<strong>PolarDB</strong>、<strong>DRDS</strong>、<strong>Oracle</strong>。</p>
             * <blockquote>
             * <p>默认取值为：<strong>MySQL</strong>。</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder instanceType(String instanceType) {
                this.instanceType = instanceType;
                return this;
            }

            public SourceEndpoint build() {
                return new SourceEndpoint(this);
            } 

        } 

    }
}
