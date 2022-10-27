// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeEHPCRequest} extends {@link RequestModel}
 *
 * <p>InitializeEHPCRequest</p>
 */
public class InitializeEHPCRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    private InitializeEHPCRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeEHPCRequest create() {
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

    public static final class Builder extends Request.Builder<InitializeEHPCRequest, Builder> {
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(InitializeEHPCRequest request) {
            super(request);
            this.regionId = request.regionId;
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
        public InitializeEHPCRequest build() {
            return new InitializeEHPCRequest(this);
        } 

    } 

}
