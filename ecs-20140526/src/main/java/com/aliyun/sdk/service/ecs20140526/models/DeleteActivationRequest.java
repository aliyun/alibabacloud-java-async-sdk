// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteActivationRequest} extends {@link RequestModel}
 *
 * <p>DeleteActivationRequest</p>
 */
public class DeleteActivationRequest extends Request {
    @Host
    @NameInMap("SourceRegionId")
    private String sourceRegionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ActivationId")
    @Validation(required = true)
    private String activationId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DeleteActivationRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.activationId = builder.activationId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteActivationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceRegionId
     */
    public String getSourceRegionId() {
        return this.sourceRegionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return activationId
     */
    public String getActivationId() {
        return this.activationId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteActivationRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String activationId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteActivationRequest request) {
            super(request);
            this.sourceRegionId = request.sourceRegionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.activationId = request.activationId;
            this.regionId = request.regionId;
        } 

        /**
         * SourceRegionId.
         */
        public Builder sourceRegionId(String sourceRegionId) {
            this.putHostParameter("SourceRegionId", sourceRegionId);
            this.sourceRegionId = sourceRegionId;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * The ID of the unused activation code.
         */
        public Builder activationId(String activationId) {
            this.putQueryParameter("ActivationId", activationId);
            this.activationId = activationId;
            return this;
        }

        /**
         * The ID of the region. Supported regions: china (qingdao), china (beijing), china (zhangjiakou), china (hohhot), china (hangzhou), china (shanghai), china (shenzhen), china (heyuan), and china (hong kong).
         * <p>
         * 
         * You can call [DescribeRegions](~~ 25609 ~~) to view the region ID and other information.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteActivationRequest build() {
            return new DeleteActivationRequest(this);
        } 

    } 

}
