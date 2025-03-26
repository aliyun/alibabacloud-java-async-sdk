// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyDBInstancePayTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstancePayTypeRequest</p>
 */
public class ModifyDBInstancePayTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DBInstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String DBInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true)
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Integer usedTime;

    private ModifyDBInstancePayTypeRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.payType = builder.payType;
        this.period = builder.period;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.usedTime = builder.usedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDBInstancePayTypeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceId
     */
    public String getDBInstanceId() {
        return this.DBInstanceId;
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
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstancePayTypeRequest, Builder> {
        private String DBInstanceId; 
        private String payType; 
        private String period; 
        private Long resourceOwnerId; 
        private Integer usedTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstancePayTypeRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.payType = request.payType;
            this.period = request.period;
            this.resourceOwnerId = request.resourceOwnerId;
            this.usedTime = request.usedTime;
        } 

        /**
         * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp1842vmucoa5w874</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The billing method of the instance. The value is fixed as <strong>Prepaid</strong>, which indicates the subscription billing method.</p>
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
         * <p>The renewal cycle of the instance.</p>
         * <ul>
         * <li><strong>Year</strong></li>
         * <li><strong>Month</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * <p>The subscription duration of the instance. Valid values:</p>
         * <ul>
         * <li>If you set the <strong>Period</strong> parameter to <strong>Year</strong>, the value of the <strong>UsedTime</strong> parameter ranges from 1 to 5.</li>
         * <li>If you set the <strong>Period</strong> parameter to <strong>Month</strong>, the value of the <strong>UsedTime</strong> parameter ranges from 1 to 11.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder usedTime(Integer usedTime) {
            this.putQueryParameter("UsedTime", usedTime);
            this.usedTime = usedTime;
            return this;
        }

        @Override
        public ModifyDBInstancePayTypeRequest build() {
            return new ModifyDBInstancePayTypeRequest(this);
        } 

    } 

}
