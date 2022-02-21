// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrderForRdsRequest} extends {@link RequestModel}
 *
 * <p>CreateOrderForRdsRequest</p>
 */
public class CreateOrderForRdsRequest extends Request {
    @Query
    @NameInMap("Params")
    @Validation(required = true)
    private String params;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private CreateOrderForRdsRequest(Builder builder) {
        super(builder);
        this.params = builder.params;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrderForRdsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateOrderForRdsRequest, Builder> {
        private String params; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrderForRdsRequest response) {
            super(response);
            this.params = response.params;
            this.regionId = response.regionId;
        } 

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public CreateOrderForRdsRequest build() {
            return new CreateOrderForRdsRequest(this);
        } 

    } 

}
