// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckFabricConsortiumDomainRequest} extends {@link RequestModel}
 *
 * <p>CheckFabricConsortiumDomainRequest</p>
 */
public class CheckFabricConsortiumDomainRequest extends Request {
    @Body
    @NameInMap("DomainCode")
    @Validation(required = true)
    private String domainCode;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CheckFabricConsortiumDomainRequest(Builder builder) {
        super(builder);
        this.domainCode = builder.domainCode;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckFabricConsortiumDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainCode
     */
    public String getDomainCode() {
        return this.domainCode;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CheckFabricConsortiumDomainRequest, Builder> {
        private String domainCode; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CheckFabricConsortiumDomainRequest response) {
            super(response);
            this.domainCode = response.domainCode;
            this.regionId = response.regionId;
        } 

        /**
         * DomainCode.
         */
        public Builder domainCode(String domainCode) {
            this.putBodyParameter("DomainCode", domainCode);
            this.domainCode = domainCode;
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
        public CheckFabricConsortiumDomainRequest build() {
            return new CheckFabricConsortiumDomainRequest(this);
        } 

    } 

}
