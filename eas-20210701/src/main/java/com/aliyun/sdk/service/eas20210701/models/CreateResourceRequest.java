// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceRequest} extends {@link RequestModel}
 *
 * <p>CreateResourceRequest</p>
 */
public class CreateResourceRequest extends Request {
    @Body
    @NameInMap("AutoRenewal")
    private Boolean autoRenewal;

    @Body
    @NameInMap("ChargeType")
    @Validation(required = true)
    private String chargeType;

    @Body
    @NameInMap("EcsInstanceCount")
    @Validation(required = true)
    private Integer ecsInstanceCount;

    @Body
    @NameInMap("EcsInstanceType")
    @Validation(required = true)
    private String ecsInstanceType;

    @Body
    @NameInMap("SystemDiskSize")
    @Validation(maximum = 2000, minimum = 200)
    private Integer systemDiskSize;

    @Body
    @NameInMap("Zone")
    private String zone;

    private CreateResourceRequest(Builder builder) {
        super(builder);
        this.autoRenewal = builder.autoRenewal;
        this.chargeType = builder.chargeType;
        this.ecsInstanceCount = builder.ecsInstanceCount;
        this.ecsInstanceType = builder.ecsInstanceType;
        this.systemDiskSize = builder.systemDiskSize;
        this.zone = builder.zone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateResourceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoRenewal
     */
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return ecsInstanceCount
     */
    public Integer getEcsInstanceCount() {
        return this.ecsInstanceCount;
    }

    /**
     * @return ecsInstanceType
     */
    public String getEcsInstanceType() {
        return this.ecsInstanceType;
    }

    /**
     * @return systemDiskSize
     */
    public Integer getSystemDiskSize() {
        return this.systemDiskSize;
    }

    /**
     * @return zone
     */
    public String getZone() {
        return this.zone;
    }

    public static final class Builder extends Request.Builder<CreateResourceRequest, Builder> {
        private Boolean autoRenewal; 
        private String chargeType; 
        private Integer ecsInstanceCount; 
        private String ecsInstanceType; 
        private Integer systemDiskSize; 
        private String zone; 

        private Builder() {
            super();
        } 

        private Builder(CreateResourceRequest request) {
            super(request);
            this.autoRenewal = request.autoRenewal;
            this.chargeType = request.chargeType;
            this.ecsInstanceCount = request.ecsInstanceCount;
            this.ecsInstanceType = request.ecsInstanceType;
            this.systemDiskSize = request.systemDiskSize;
            this.zone = request.zone;
        } 

        /**
         * 是否自动续费
         */
        public Builder autoRenewal(Boolean autoRenewal) {
            this.putBodyParameter("AutoRenewal", autoRenewal);
            this.autoRenewal = autoRenewal;
            return this;
        }

        /**
         * 付费类型，预付费PrePaid，后付费PostPaid
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * 实例数量
         */
        public Builder ecsInstanceCount(Integer ecsInstanceCount) {
            this.putBodyParameter("EcsInstanceCount", ecsInstanceCount);
            this.ecsInstanceCount = ecsInstanceCount;
            return this;
        }

        /**
         * 实例机型，对应ecs机型
         */
        public Builder ecsInstanceType(String ecsInstanceType) {
            this.putBodyParameter("EcsInstanceType", ecsInstanceType);
            this.ecsInstanceType = ecsInstanceType;
            return this;
        }

        /**
         * 系统盘大小(200-2000GB)。不传默认为200。
         */
        public Builder systemDiskSize(Integer systemDiskSize) {
            this.putBodyParameter("SystemDiskSize", systemDiskSize);
            this.systemDiskSize = systemDiskSize;
            return this;
        }

        /**
         * Zone.
         */
        public Builder zone(String zone) {
            this.putBodyParameter("Zone", zone);
            this.zone = zone;
            return this;
        }

        @Override
        public CreateResourceRequest build() {
            return new CreateResourceRequest(this);
        } 

    } 

}
