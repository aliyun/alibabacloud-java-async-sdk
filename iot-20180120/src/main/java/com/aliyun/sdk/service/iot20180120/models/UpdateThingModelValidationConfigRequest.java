// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateThingModelValidationConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateThingModelValidationConfigRequest</p>
 */
public class UpdateThingModelValidationConfigRequest extends Request {
    @Query
    @NameInMap("IotInstanceId")
    private String iotInstanceId;

    @Query
    @NameInMap("ProductKey")
    @Validation(required = true)
    private String productKey;

    @Query
    @NameInMap("ValidateType")
    @Validation(required = true)
    private Integer validateType;

    private UpdateThingModelValidationConfigRequest(Builder builder) {
        super(builder);
        this.iotInstanceId = builder.iotInstanceId;
        this.productKey = builder.productKey;
        this.validateType = builder.validateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateThingModelValidationConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return iotInstanceId
     */
    public String getIotInstanceId() {
        return this.iotInstanceId;
    }

    /**
     * @return productKey
     */
    public String getProductKey() {
        return this.productKey;
    }

    /**
     * @return validateType
     */
    public Integer getValidateType() {
        return this.validateType;
    }

    public static final class Builder extends Request.Builder<UpdateThingModelValidationConfigRequest, Builder> {
        private String iotInstanceId; 
        private String productKey; 
        private Integer validateType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateThingModelValidationConfigRequest response) {
            super(response);
            this.iotInstanceId = response.iotInstanceId;
            this.productKey = response.productKey;
            this.validateType = response.validateType;
        } 

        /**
         * IotInstanceId.
         */
        public Builder iotInstanceId(String iotInstanceId) {
            this.putQueryParameter("IotInstanceId", iotInstanceId);
            this.iotInstanceId = iotInstanceId;
            return this;
        }

        /**
         * ProductKey.
         */
        public Builder productKey(String productKey) {
            this.putQueryParameter("ProductKey", productKey);
            this.productKey = productKey;
            return this;
        }

        /**
         * ValidateType.
         */
        public Builder validateType(Integer validateType) {
            this.putQueryParameter("ValidateType", validateType);
            this.validateType = validateType;
            return this;
        }

        @Override
        public UpdateThingModelValidationConfigRequest build() {
            return new UpdateThingModelValidationConfigRequest(this);
        } 

    } 

}
