// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCdnDomainRequest} extends {@link RequestModel}
 *
 * <p>DescribeCdnDomainRequest</p>
 */
public class DescribeCdnDomainRequest extends Request {
    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    @Body
    @NameInMap("TenantId")
    private String tenantId;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private DescribeCdnDomainRequest(Builder builder) {
        super(builder);
        this.spaceId = builder.spaceId;
        this.tenantId = builder.tenantId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDomainRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return tenantId
     */
    public String getTenantId() {
        return this.tenantId;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<DescribeCdnDomainRequest, Builder> {
        private String spaceId; 
        private String tenantId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(DescribeCdnDomainRequest request) {
            super(request);
            this.spaceId = request.spaceId;
            this.tenantId = request.tenantId;
            this.type = request.type;
        } 

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        /**
         * TenantId.
         */
        public Builder tenantId(String tenantId) {
            this.putBodyParameter("TenantId", tenantId);
            this.tenantId = tenantId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public DescribeCdnDomainRequest build() {
            return new DescribeCdnDomainRequest(this);
        } 

    } 

}
