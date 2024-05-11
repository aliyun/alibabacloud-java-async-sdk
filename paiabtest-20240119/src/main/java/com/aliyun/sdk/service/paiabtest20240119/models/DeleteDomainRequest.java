// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiabtest20240119.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteDomainRequest} extends {@link RequestModel}
 *
 * <p>DeleteDomainRequest</p>
 */
public class DeleteDomainRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("DomainId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainId;

    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteDomainRequest(Builder builder) {
        super(builder);
        this.domainId = builder.domainId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainId
     */
    public String getDomainId() {
        return this.domainId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteDomainRequest, Builder> {
        private String domainId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteDomainRequest request) {
            super(request);
            this.domainId = request.domainId;
            this.regionId = request.regionId;
        } 

        /**
         * DomainId.
         */
        public Builder domainId(String domainId) {
            this.putPathParameter("DomainId", domainId);
            this.domainId = domainId;
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
        public DeleteDomainRequest build() {
            return new DeleteDomainRequest(this);
        } 

    } 

}
