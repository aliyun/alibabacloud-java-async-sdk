// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20190315.models;

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
 * {@link ModifyDBClusterPayTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBClusterPayTypeRequest</p>
 */
public class ModifyDBClusterPayTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    @com.aliyun.core.annotation.Validation(maximum = 9, minimum = 1)
    private String usedTime;

    private ModifyDBClusterPayTypeRequest(Builder builder) {
        super(builder);
        this.dbClusterId = builder.dbClusterId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.usedTime = builder.usedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBClusterPayTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbClusterId
     */
    public String getDbClusterId() {
        return this.dbClusterId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return usedTime
     */
    public String getUsedTime() {
        return this.usedTime;
    }

    public static final class Builder extends Request.Builder<ModifyDBClusterPayTypeRequest, Builder> {
        private String dbClusterId; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String usedTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBClusterPayTypeRequest request) {
            super(request);
            this.dbClusterId = request.dbClusterId;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.usedTime = request.usedTime;
        } 

        /**
         * <p>The cluster ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>am-bp11q28kvl688****</p>
         */
        public Builder dbClusterId(String dbClusterId) {
            this.putQueryParameter("DbClusterId", dbClusterId);
            this.dbClusterId = dbClusterId;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
         * <li><strong>Prepaid</strong>: subscription.</li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * <p>The subscription type of the subscription cluster. Valid values:</p>
         * <ul>
         * <li><strong>Year</strong>: subscription on a yearly basis.</li>
         * <li><strong>Month</strong>: subscription on a monthly basis.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter must be specified when PayType is set to Prepaid.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Year</p>
         */
        public Builder period(String period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The region ID of the cluster.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/143074.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
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
         * <p>The subscription duration of the subscription cluster.</p>
         * <ul>
         * <li>Valid values when Period is set to Year: 1, 2, 3, and 5 (integer).</li>
         * <li>Valid values when Period is set to Month: 1 to 11 (integer).</li>
         * </ul>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter must be specified when PayType is set to Prepaid.</p>
         * </li>
         * <li><p>Longer subscription durations offer more savings. Purchasing a cluster for one year is more cost-effective than purchasing the cluster for 10 or 11 months.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder usedTime(String usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        @Override
        public ModifyDBClusterPayTypeRequest build() {
            return new ModifyDBClusterPayTypeRequest(this);
        } 

    } 

}
