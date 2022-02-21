// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceRequest} extends {@link RequestModel}
 *
 * <p>CreateInstanceRequest</p>
 */
public class CreateInstanceRequest extends Request {
    @Body
    @NameInMap("ChargeType")
    @Validation(required = true)
    private String chargeType;

    @Body
    @NameInMap("Component")
    @Validation(required = true)
    private String component;

    @Body
    @NameInMap("InstanceType")
    @Validation(required = true)
    private String instanceType;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    private CreateInstanceRequest(Builder builder) {
        super(builder);
        this.chargeType = builder.chargeType;
        this.component = builder.component;
        this.instanceType = builder.instanceType;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return chargeType
     */
    public String getChargeType() {
        return this.chargeType;
    }

    /**
     * @return component
     */
    public String getComponent() {
        return this.component;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateInstanceRequest, Builder> {
        private String chargeType; 
        private String component; 
        private String instanceType; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateInstanceRequest response) {
            super(response);
            this.chargeType = response.chargeType;
            this.component = response.component;
            this.instanceType = response.instanceType;
            this.regionId = response.regionId;
        } 

        /**
         * ChargeType.
         */
        public Builder chargeType(String chargeType) {
            this.putBodyParameter("ChargeType", chargeType);
            this.chargeType = chargeType;
            return this;
        }

        /**
         * Component.
         */
        public Builder component(String component) {
            this.putBodyParameter("Component", component);
            this.component = component;
            return this;
        }

        /**
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putBodyParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateInstanceRequest build() {
            return new CreateInstanceRequest(this);
        } 

    } 

}
