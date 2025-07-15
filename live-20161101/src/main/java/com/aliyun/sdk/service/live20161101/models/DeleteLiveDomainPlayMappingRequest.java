// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteLiveDomainPlayMappingRequest} extends {@link RequestModel}
 *
 * <p>DeleteLiveDomainPlayMappingRequest</p>
 */
public class DeleteLiveDomainPlayMappingRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PlayDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String playDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PullDomain")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pullDomain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
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

        private Builder(DeleteLiveDomainPlayMappingRequest request) {
            super(request);
            this.ownerId = request.ownerId;
            this.playDomain = request.playDomain;
            this.pullDomain = request.pullDomain;
            this.regionId = request.regionId;
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
         * <p>The sub-streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.aliyundoc.com</p>
         */
        public Builder playDomain(String playDomain) {
            this.putQueryParameter("PlayDomain", playDomain);
            this.playDomain = playDomain;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
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
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteLiveDomainPlayMappingRequest build() {
            return new DeleteLiveDomainPlayMappingRequest(this);
        } 

    } 

}
