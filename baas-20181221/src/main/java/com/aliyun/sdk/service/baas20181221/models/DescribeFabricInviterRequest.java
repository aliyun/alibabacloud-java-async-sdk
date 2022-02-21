// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricInviterRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricInviterRequest</p>
 */
public class DescribeFabricInviterRequest extends Request {
    @Body
    @NameInMap("Code")
    @Validation(required = true)
    private String code;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeFabricInviterRequest(Builder builder) {
        super(builder);
        this.code = builder.code;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricInviterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricInviterRequest, Builder> {
        private String code; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricInviterRequest response) {
            super(response);
            this.code = response.code;
            this.regionId = response.regionId;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DescribeFabricInviterRequest build() {
            return new DescribeFabricInviterRequest(this);
        } 

    } 

}
