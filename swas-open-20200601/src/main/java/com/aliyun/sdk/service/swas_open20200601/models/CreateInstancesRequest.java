// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.swas_open20200601.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CreateInstancesRequest} extends {@link RequestModel}
 *
 * <p>CreateInstancesRequest</p>
 */
public class CreateInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Amount")
    @com.aliyun.core.annotation.Validation(maximum = 200, minimum = 1)
    private Integer amount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenew")
    private Boolean autoRenew;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoRenewPeriod")
    @com.aliyun.core.annotation.Validation(maximum = 36, minimum = 1)
    private Integer autoRenewPeriod;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ChargeType")
    private String chargeType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DataDiskSize")
    @com.aliyun.core.annotation.Validation(maximum = 16380)
    private Long dataDiskSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ImageId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String imageId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Period")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 36, minimum = 1)
    private Integer period;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlanId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String planId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private CreateInstancesRequest(Builder builder) {
        super(builder);
        this.amount = builder.amount;
        this.autoRenew = builder.autoRenew;
        this.autoRenewPeriod = builder.autoRenewPeriod;
        this.chargeType = builder.chargeType;
        this.clientToken = builder.clientToken;
        this.dataDiskSize = builder.dataDiskSize;
        this.imageId = builder.imageId;
        this.period = builder.period;
        this.planId = builder.planId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return amount
     */
    public Integer getAmount() {
        return this.amount;
    }

    /**
     * @return autoRenew
     */
    public Boolean getAutoRenew() {
        return this.autoRenew;
    }

    /**
     * @return autoRenewPeriod
     */
    public Integer getAutoRenewPeriod() {
        return this.autoRenewPeriod;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dataDiskSize
     */
    public Long getDataDiskSize() {
        return this.dataDiskSize;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return period
     */
    public Integer getPeriod() {
        return this.period;
    }

    /**
     * @return planId
     */
    public String getPlanId() {
        return this.planId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateInstancesRequest, Builder> {
        private Integer amount; 
        private Boolean autoRenew; 
        private Integer autoRenewPeriod; 
        private String chargeType; 
        private String clientToken; 
        private Long dataDiskSize; 
        private String imageId; 
        private Integer period; 
        private String planId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstancesRequest request) {
            super(request);
            this.amount = request.amount;
            this.autoRenew = request.autoRenew;
            this.autoRenewPeriod = request.autoRenewPeriod;
            this.chargeType = request.chargeType;
            this.clientToken = request.clientToken;
            this.dataDiskSize = request.dataDiskSize;
            this.imageId = request.imageId;
            this.period = request.period;
            this.planId = request.planId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The number of simple application servers that you want to create. Valid values: 1 to 20.</p>
         * <p>Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder amount(Integer amount) {
            this.putQueryParameter("Amount", amount);
            this.amount = amount;
            return this;
        }

        /**
         * <p>Specifies whether to enable auto-renewal. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * <p>Default value: false.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder autoRenew(Boolean autoRenew) {
            this.putQueryParameter("AutoRenew", autoRenew);
            this.autoRenew = autoRenew;
            return this;
        }

        /**
         * <p>The auto-renewal period. This parameter is required only when you set <code>AutoRenew</code> to true. Unit: months. Valid values: 1, 3, 6, 12, 24, and 36.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder autoRenewPeriod(Integer autoRenewPeriod) {
            this.putQueryParameter("AutoRenewPeriod", autoRenewPeriod);
            this.autoRenewPeriod = autoRenewPeriod;
            return this;
        }

        /**
         * <p>The billing method of the simple application servers. Set the value to PrePaid, which indicates the subscription billing method.</p>
         * <p>Default value: PrePaid.</p>
         * 
         * <strong>example:</strong>
         * <p>PrePaid</p>
         */
        public Builder chargeType(String chargeType) {
            this.putQueryParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The value of <strong>ClientToken</strong> can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-426655440000</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The size of the data disk that is attached to the server. Unit: GB. Valid values: 0 to 16380. The value must be an integral multiple of 20.</p>
         * <ul>
         * <li>A value of 0 indicates that no data disk is attached.</li>
         * <li>If the disk included in the specified plan is a standard SSD, the data disk must be 20 GB or larger in size.</li>
         * </ul>
         * <p>Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder dataDiskSize(Long dataDiskSize) {
            this.putQueryParameter("DataDiskSize", dataDiskSize);
            this.dataDiskSize = dataDiskSize;
            return this;
        }

        /**
         * <p>The image ID. You can call the <a href="https://help.aliyun.com/document_detail/189313.html">ListImages</a> operation to query the available images in the specified region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e2c9c365024a44369c9b955a998a****</p>
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * <p>The subscription period of the servers. Unit: months. Valid values: 1, 3, 6, 12, 24, and 36.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder period(Integer period) {
            this.putQueryParameter("Period", period);
            this.period = period;
            return this;
        }

        /**
         * <p>The plan ID. You can call the <a href="https://help.aliyun.com/document_detail/189314.html">ListPlans</a> operation to query all plans provided by Simple Application Server in the specified region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>swas.s1.c1m1s40b3t05</p>
         */
        public Builder planId(String planId) {
            this.putQueryParameter("PlanId", planId);
            this.planId = planId;
            return this;
        }

        /**
         * <p>The region ID of the simple application servers. You can call the <a href="https://help.aliyun.com/document_detail/189315.html">ListRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateInstancesRequest build() {
            return new CreateInstancesRequest(this);
        } 

    } 

}
