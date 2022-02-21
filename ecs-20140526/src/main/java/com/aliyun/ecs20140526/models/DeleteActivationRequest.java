// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

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
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ActivationId")
    private String activationId;

    private DeleteActivationRequest(Builder builder) {
        super(builder);
        this.sourceRegionId = builder.sourceRegionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.regionId = builder.regionId;
        this.activationId = builder.activationId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return activationId
     */
    public String getActivationId() {
        return this.activationId;
    }

    public static final class Builder extends Request.Builder<DeleteActivationRequest, Builder> {
        private String sourceRegionId; 
        private Long resourceOwnerId; 
        private String regionId; 
        private String activationId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteActivationRequest response) {
            super(response);
            this.sourceRegionId = response.sourceRegionId;
            this.resourceOwnerId = response.resourceOwnerId;
            this.regionId = response.regionId;
            this.activationId = response.activationId;
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
         * The ID of the region. Supported regions: China (Qingdao), China (Beijing), China (Zhangjiakou), China (Hohhot), China (Hangzhou), and China (Shanghai) china (Shenzhen), China (Heyuan), and China (Hong Kong).
         * <p>
         * 
         * You can call [DescribeRegions](~~ 25609 ~~) to view the region ID and other information.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * Not use activation code ID.
         */
        public Builder activationId(String activationId) {
            this.putQueryParameter("ActivationId", activationId);
            this.activationId = activationId;
            return this;
        }

        @Override
        public DeleteActivationRequest build() {
            return new DeleteActivationRequest(this);
        } 

    } 

}
