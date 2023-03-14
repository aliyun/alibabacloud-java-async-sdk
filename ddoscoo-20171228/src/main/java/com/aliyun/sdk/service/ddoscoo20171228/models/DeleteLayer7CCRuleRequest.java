// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20171228.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLayer7CCRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteLayer7CCRuleRequest</p>
 */
public class DeleteLayer7CCRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Domain")
    @Validation(required = true)
    private String domain;

    @Query
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    private DeleteLayer7CCRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domain = builder.domain;
        this.name = builder.name;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLayer7CCRuleRequest create() {
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
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<DeleteLayer7CCRuleRequest, Builder> {
        private String regionId; 
        private String domain; 
        private String name; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLayer7CCRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domain = request.domain;
            this.name = request.name;
            this.resourceGroupId = request.resourceGroupId;
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
         * Domain.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * ResourceGroupId.
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public DeleteLayer7CCRuleRequest build() {
            return new DeleteLayer7CCRuleRequest(this);
        } 

    } 

}
