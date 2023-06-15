// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDBInstancePayTypeRequest} extends {@link RequestModel}
 *
 * <p>ModifyDBInstancePayTypeRequest</p>
 */
public class ModifyDBInstancePayTypeRequest extends Request {
    @Query
    @NameInMap("DBInstanceId")
    @Validation(required = true)
    private String DBInstanceId;

    @Query
    @NameInMap("PayType")
    @Validation(required = true)
    private String payType;

    @Query
    @NameInMap("Period")
    @Validation(required = true)
    private String period;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("UsedTime")
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
         * The ID of the instance.
         */
        public Builder DBInstanceId(String DBInstanceId) {
            this.putQueryParameter("DBInstanceId", DBInstanceId);
            this.DBInstanceId = DBInstanceId;
            return this;
        }

        /**
         * The billing method of the instance. Valid values:
         * <p>
         * 
         * *   Postpaid: pay-as-you-go
         * *   Prepaid: subscription
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * The subscription method of the instance. This parameter must be specified when PayType is set to Prepaid.
         * <p>
         * 
         * *   Year
         * *   Month
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
         * Valid values when Period is set to Year: 1 to 9. Valid values when Period is set to Month: 1, 2, and 3.
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
