// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyTagValueNameRequest} extends {@link RequestModel}
 *
 * <p>ModifyTagValueNameRequest</p>
 */
public class ModifyTagValueNameRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Key")
    @com.aliyun.core.annotation.Validation(required = true)
    private String key;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NewValue")
    @com.aliyun.core.annotation.Validation(required = true)
    private String newValue;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Value")
    @com.aliyun.core.annotation.Validation(required = true)
    private String value;

    private ModifyTagValueNameRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.key = builder.key;
        this.newValue = builder.newValue;
        this.value = builder.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyTagValueNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return key
     */
    public String getKey() {
        return this.key;
    }

    /**
     * @return newValue
     */
    public String getNewValue() {
        return this.newValue;
    }

    /**
     * @return value
     */
    public String getValue() {
        return this.value;
    }

    public static final class Builder extends Request.Builder<ModifyTagValueNameRequest, Builder> {
        private String regionId; 
        private String key; 
        private String newValue; 
        private String value; 

        private Builder() {
            super();
        } 

        private Builder(ModifyTagValueNameRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.key = request.key;
            this.newValue = request.newValue;
            this.value = request.value;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the tag group.
         */
        public Builder key(String key) {
            this.putBodyParameter("Key", key);
            this.key = key;
            return this;
        }

        /**
         * The new name of the tag.
         */
        public Builder newValue(String newValue) {
            this.putBodyParameter("NewValue", newValue);
            this.newValue = newValue;
            return this;
        }

        /**
         * The name of the tag.
         */
        public Builder value(String value) {
            this.putBodyParameter("Value", value);
            this.value = value;
            return this;
        }

        @Override
        public ModifyTagValueNameRequest build() {
            return new ModifyTagValueNameRequest(this);
        } 

    } 

}
