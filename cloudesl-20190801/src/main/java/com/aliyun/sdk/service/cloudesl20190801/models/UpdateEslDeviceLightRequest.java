// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudesl20190801.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateEslDeviceLightRequest} extends {@link RequestModel}
 *
 * <p>UpdateEslDeviceLightRequest</p>
 */
public class UpdateEslDeviceLightRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EslBarCode")
    private String eslBarCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Frequency")
    @com.aliyun.core.annotation.Validation(required = true)
    private String frequency;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemBarCode")
    private String itemBarCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LedColor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ledColor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LightUpTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer lightUpTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StoreId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String storeId;

    private UpdateEslDeviceLightRequest(Builder builder) {
        super(builder);
        this.eslBarCode = builder.eslBarCode;
        this.frequency = builder.frequency;
        this.itemBarCode = builder.itemBarCode;
        this.ledColor = builder.ledColor;
        this.lightUpTime = builder.lightUpTime;
        this.storeId = builder.storeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateEslDeviceLightRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eslBarCode
     */
    public String getEslBarCode() {
        return this.eslBarCode;
    }

    /**
     * @return frequency
     */
    public String getFrequency() {
        return this.frequency;
    }

    /**
     * @return itemBarCode
     */
    public String getItemBarCode() {
        return this.itemBarCode;
    }

    /**
     * @return ledColor
     */
    public String getLedColor() {
        return this.ledColor;
    }

    /**
     * @return lightUpTime
     */
    public Integer getLightUpTime() {
        return this.lightUpTime;
    }

    /**
     * @return storeId
     */
    public String getStoreId() {
        return this.storeId;
    }

    public static final class Builder extends Request.Builder<UpdateEslDeviceLightRequest, Builder> {
        private String eslBarCode; 
        private String frequency; 
        private String itemBarCode; 
        private String ledColor; 
        private Integer lightUpTime; 
        private String storeId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateEslDeviceLightRequest request) {
            super(request);
            this.eslBarCode = request.eslBarCode;
            this.frequency = request.frequency;
            this.itemBarCode = request.itemBarCode;
            this.ledColor = request.ledColor;
            this.lightUpTime = request.lightUpTime;
            this.storeId = request.storeId;
        } 

        /**
         * EslBarCode.
         */
        public Builder eslBarCode(String eslBarCode) {
            this.putBodyParameter("EslBarCode", eslBarCode);
            this.eslBarCode = eslBarCode;
            return this;
        }

        /**
         * Frequency.
         */
        public Builder frequency(String frequency) {
            this.putBodyParameter("Frequency", frequency);
            this.frequency = frequency;
            return this;
        }

        /**
         * ItemBarCode.
         */
        public Builder itemBarCode(String itemBarCode) {
            this.putBodyParameter("ItemBarCode", itemBarCode);
            this.itemBarCode = itemBarCode;
            return this;
        }

        /**
         * LedColor.
         */
        public Builder ledColor(String ledColor) {
            this.putBodyParameter("LedColor", ledColor);
            this.ledColor = ledColor;
            return this;
        }

        /**
         * LightUpTime.
         */
        public Builder lightUpTime(Integer lightUpTime) {
            this.putBodyParameter("LightUpTime", lightUpTime);
            this.lightUpTime = lightUpTime;
            return this;
        }

        /**
         * StoreId.
         */
        public Builder storeId(String storeId) {
            this.putBodyParameter("StoreId", storeId);
            this.storeId = storeId;
            return this;
        }

        @Override
        public UpdateEslDeviceLightRequest build() {
            return new UpdateEslDeviceLightRequest(this);
        } 

    } 

}
