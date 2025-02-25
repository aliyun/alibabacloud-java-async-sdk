// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeFabricInvitationCodeRequest} extends {@link RequestModel}
 *
 * <p>DescribeFabricInvitationCodeRequest</p>
 */
public class DescribeFabricInvitationCodeRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConsortiumId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String consortiumId;

    private DescribeFabricInvitationCodeRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.consortiumId = builder.consortiumId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFabricInvitationCodeRequest create() {
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
     * @return consortiumId
     */
    public String getConsortiumId() {
        return this.consortiumId;
    }

    public static final class Builder extends Request.Builder<DescribeFabricInvitationCodeRequest, Builder> {
        private String regionId; 
        private String consortiumId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeFabricInvitationCodeRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.consortiumId = request.consortiumId;
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
         * ConsortiumId.
         */
        public Builder consortiumId(String consortiumId) {
            this.putBodyParameter("ConsortiumId", consortiumId);
            this.consortiumId = consortiumId;
            return this;
        }

        @Override
        public DescribeFabricInvitationCodeRequest build() {
            return new DescribeFabricInvitationCodeRequest(this);
        } 

    } 

}
