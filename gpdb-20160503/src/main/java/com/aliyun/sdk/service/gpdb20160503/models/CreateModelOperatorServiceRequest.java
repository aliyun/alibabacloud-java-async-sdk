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
 * {@link CreateModelOperatorServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateModelOperatorServiceRequest</p>
 */
public class CreateModelOperatorServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Cu")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Integer cu;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PayType")
    private String payType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    private String period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UsedTime")
    private String usedTime;

    private CreateModelOperatorServiceRequest(Builder builder) {
        super(builder);
        this.cu = builder.cu;
        this.payType = builder.payType;
        this.period = builder.period;
        this.regionId = builder.regionId;
        this.usedTime = builder.usedTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelOperatorServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cu
     */
    public Integer getCu() {
        return this.cu;
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

    public static final class Builder extends Request.Builder<CreateModelOperatorServiceRequest, Builder> {
        private Integer cu; 
        private String payType; 
        private String period; 
        private String regionId; 
        private String usedTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelOperatorServiceRequest request) {
            super(request);
            this.cu = request.cu;
            this.payType = request.payType;
            this.period = request.period;
            this.regionId = request.regionId;
            this.usedTime = request.usedTime;
        } 

        /**
         * <p>The number of compute resource CUs for the model creation operator sub-service. The value must be an integer greater than 0. The available specifications and prices are subject to the actual sales configurations in the target region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cu(Integer cu) {
            this.putQueryParameter("Cu", cu);
            this.cu = cu;
            return this;
        }

        /**
         * <p>The billing method. Valid values:</p>
         * <ul>
         * <li>PostPay: pay-as-you-go. This is the default value.</li>
         * <li>PrePay: subscription. If you set this parameter to PrePay, you must also specify UsedTime and Period.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PostPay</p>
         */
        public Builder payType(String payType) {
            this.putQueryParameter("PayType", payType);
            this.payType = payType;
            return this;
        }

        /**
         * <p>The unit of the subscription duration. This parameter is required when PayType is set to PrePay. Valid values: Month and Year. This parameter is used together with UsedTime. This parameter is not required for pay-as-you-go services.</p>
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
         * <p>The ID of the region where the service resides. This parameter is required and must be consistent with the request endpoint and the purchase region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The subscription duration. This parameter is required when PayType is set to PrePay. The value must be a string of a positive integer, and the unit is specified by Period. The actual available subscription duration is subject to the sales configurations. This parameter is not required for pay-as-you-go services.</p>
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
        public CreateModelOperatorServiceRequest build() {
            return new CreateModelOperatorServiceRequest(this);
        } 

    } 

}
