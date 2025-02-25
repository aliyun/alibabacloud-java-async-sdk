// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20181221.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckFabricConsortiumDomainRequest} extends {@link RequestModel}
 *
 * <p>CheckFabricConsortiumDomainRequest</p>
 */
public class CheckFabricConsortiumDomainRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainCode;

    private CheckFabricConsortiumDomainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainCode = builder.domainCode;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return domainCode
     */
    public String getDomainCode() {
        return this.domainCode;
    }

    public static final class Builder extends Request.Builder<CheckFabricConsortiumDomainRequest, Builder> {
        private String regionId; 
        private String domainCode; 

        private Builder() {
            super();
        } 

        private Builder(CheckFabricConsortiumDomainRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainCode = request.domainCode;
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
         * DomainCode.
         */
        public Builder domainCode(String domainCode) {
            this.putBodyParameter("DomainCode", domainCode);
            this.domainCode = domainCode;
            return this;
        }

        @Override
        public CheckFabricConsortiumDomainRequest build() {
            return new CheckFabricConsortiumDomainRequest(this);
        } 

    } 

}
