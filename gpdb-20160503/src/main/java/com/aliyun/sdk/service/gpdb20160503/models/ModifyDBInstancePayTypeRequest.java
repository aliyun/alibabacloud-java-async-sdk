// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gpdb20160503.models;

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
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private Integer usedTime;

    private ModifyDBInstancePayTypeRequest(Builder builder) {
        super(builder);
        this.DBInstanceId = builder.DBInstanceId;
        this.payType = builder.payType;
        this.period = builder.period;
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
     * @return usedTime
     */
    public Integer getUsedTime() {
        return this.usedTime;
    }

    public static final class Builder extends Request.Builder<ModifyDBInstancePayTypeRequest, Builder> {
        private String DBInstanceId; 
        private String payType; 
        private String period; 
        private Integer usedTime; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDBInstancePayTypeRequest request) {
            super(request);
            this.DBInstanceId = request.DBInstanceId;
            this.payType = request.payType;
            this.period = request.period;
            this.usedTime = request.usedTime;
        } 

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>gp-bp***************</p>
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * <p>The billing method of the instance. Valid values:</p>
         * <ul>
         * <li>Postpaid: pay-as-you-go.</li>
         * <li>Prepaid: subscription.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Postpaid</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. Valid values:</p>
         * <ul>
         * <li>Month</li>
         * <li>Year</li>
         * </ul>
         * <p>This parameter must be specified only when PayType is set to Prepaid.</p>
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
         * <p>The subscription duration.</p>
         * <ul>
         * <li>Valid values when Period is set to Month: 1 to 9.</li>
         * <li>Valid values when Period is set to Year: 1 to 3.</li>
         * </ul>
         * <p>This parameter must be specified only when PayType is set to Prepaid.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
