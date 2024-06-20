// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricInviterRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricInviterRequest</p>
 */
public class DescribeFabricInviterRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Code")
    @com.aliyun.core.annotation.Validation(required = true)
    private String code;

    private DescribeFabricInviterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.code = builder.code;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    public static final class Builder extends Request.Builder<DescribeFabricInviterRequest, Builder> {
        private String regionId; 
        private String code; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricInviterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.code = request.code;
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
         * Code.
         */
        public Builder code(String code) {
            this.putBodyParameter("Code", code);
            this.code = code;
            return this;
        }

        @Override
        public DescribeFabricInviterRequest build() {
            return new DescribeFabricInviterRequest(this);
        } 

    } 

}
