// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeLiveStreamAuthCheckingRequest} extends {@link RequestModel}
 *
 * <p>DescribeLiveStreamAuthCheckingRequest</p>
 */
public class DescribeLiveStreamAuthCheckingRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    private DescribeLiveStreamAuthCheckingRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.domainName = builder.domainName;
        this.ownerId = builder.ownerId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeLiveStreamAuthCheckingRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<DescribeLiveStreamAuthCheckingRequest, Builder> {
        private String regionId; 
        private String domainName; 
        private Long ownerId; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(DescribeLiveStreamAuthCheckingRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.domainName = request.domainName;
            this.ownerId = request.ownerId;
            this.url = request.url;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
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
         * Url.
         */
        public Builder url(String url) {
            this.putQueryParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public DescribeLiveStreamAuthCheckingRequest build() {
            return new DescribeLiveStreamAuthCheckingRequest(this);
        } 

    } 

}
