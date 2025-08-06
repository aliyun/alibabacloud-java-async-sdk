// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link PreloadPlayDeviceAbilityRequest} extends {@link RequestModel}
 *
 * <p>PreloadPlayDeviceAbilityRequest</p>
 */
public class PreloadPlayDeviceAbilityRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Brand")
    private String brand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceRealOwnerId")
    private Long resourceRealOwnerId;

    private PreloadPlayDeviceAbilityRequest(Builder builder) {
        super(builder);
        this.brand = builder.brand;
        this.resourceRealOwnerId = builder.resourceRealOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PreloadPlayDeviceAbilityRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brand
     */
    public String getBrand() {
        return this.brand;
    }

    /**
     * @return resourceRealOwnerId
     */
    public Long getResourceRealOwnerId() {
        return this.resourceRealOwnerId;
    }

    public static final class Builder extends Request.Builder<PreloadPlayDeviceAbilityRequest, Builder> {
        private String brand; 
        private Long resourceRealOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(PreloadPlayDeviceAbilityRequest request) {
            super(request);
            this.brand = request.brand;
            this.resourceRealOwnerId = request.resourceRealOwnerId;
        } 

        /**
         * Brand.
         */
        public Builder brand(String brand) {
            this.putQueryParameter("Brand", brand);
            this.brand = brand;
            return this;
        }

        /**
         * ResourceRealOwnerId.
         */
        public Builder resourceRealOwnerId(Long resourceRealOwnerId) {
            this.putQueryParameter("ResourceRealOwnerId", resourceRealOwnerId);
            this.resourceRealOwnerId = resourceRealOwnerId;
            return this;
        }

        @Override
        public PreloadPlayDeviceAbilityRequest build() {
            return new PreloadPlayDeviceAbilityRequest(this);
        } 

    } 

}
