// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.baas20180731.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckConsortiumDomainRequest} extends {@link RequestModel}
 *
 * <p>CheckConsortiumDomainRequest</p>
 */
public class CheckConsortiumDomainRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DomainCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainCode;

    private CheckConsortiumDomainRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainCode = builder.domainCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckConsortiumDomainRequest create() {
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

    public static final class Builder extends Request.Builder<CheckConsortiumDomainRequest, Builder> {
        private String regionId; 
        private String domainCode; 

        private Builder() {
            super();
        } 

        private Builder(CheckConsortiumDomainRequest request) {
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
        public CheckConsortiumDomainRequest build() {
            return new CheckConsortiumDomainRequest(this);
        } 

    } 

}
