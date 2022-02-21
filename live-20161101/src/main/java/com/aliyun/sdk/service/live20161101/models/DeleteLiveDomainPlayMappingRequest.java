// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteLiveDomainPlayMappingRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveDomainPlayMappingRequest</p>
 */
public class DeleteLiveDomainPlayMappingRequest extends Request {
    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("PlayDomain")
    @Validation(required = true)
    private String playDomain;

    @Query
    @NameInMap("PullDomain")
    @Validation(required = true)
    private String pullDomain;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteLiveDomainPlayMappingRequest(Builder builder) {
        super(builder);
        this.ownerId = builder.ownerId;
        this.playDomain = builder.playDomain;
        this.pullDomain = builder.pullDomain;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLiveDomainPlayMappingRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return playDomain
     */
    public String getPlayDomain() {
        return this.playDomain;
    }

    /**
     * @return pullDomain
     */
    public String getPullDomain() {
        return this.pullDomain;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteLiveDomainPlayMappingRequest, Builder> {
        private Long ownerId; 
        private String playDomain; 
        private String pullDomain; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveDomainPlayMappingRequest response) {
            super(response);
            this.ownerId = response.ownerId;
            this.playDomain = response.playDomain;
            this.pullDomain = response.pullDomain;
            this.regionId = response.regionId;
        } 

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * PlayDomain.
         */
        public Builder playDomain(String playDomain) {
            this.putQueryParameter("PlayDomain", playDomain);
            this.playDomain = playDomain;
            return this;
        }

        /**
         * PullDomain.
         */
        public Builder pullDomain(String pullDomain) {
            this.putQueryParameter("PullDomain", pullDomain);
            this.pullDomain = pullDomain;
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
        public DeleteLiveDomainPlayMappingRequest build() {
            return new DeleteLiveDomainPlayMappingRequest(this);
        } 

    } 

}
