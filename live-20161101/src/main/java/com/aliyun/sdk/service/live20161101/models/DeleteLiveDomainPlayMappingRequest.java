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
    @Host
    @NameInMap("RegionId")
    private String regionId;

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

    private DeleteLiveDomainPlayMappingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.ownerId = builder.ownerId;
        this.playDomain = builder.playDomain;
        this.pullDomain = builder.pullDomain;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DeleteLiveDomainPlayMappingRequest, Builder> {
        private String regionId; 
        private Long ownerId; 
        private String playDomain; 
        private String pullDomain; 

        private Builder() {
            super();
        } 

        private Builder(DeleteLiveDomainPlayMappingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.ownerId = request.ownerId;
            this.playDomain = request.playDomain;
            this.pullDomain = request.pullDomain;
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

        @Override
        public DeleteLiveDomainPlayMappingRequest build() {
            return new DeleteLiveDomainPlayMappingRequest(this);
        } 

    } 

}
