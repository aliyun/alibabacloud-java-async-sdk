// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbs20190306.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeCidrListRequest} extends {@link RequestModel}
 *
 * <p>DescribeNodeCidrListRequest</p>
 */
public class DescribeNodeCidrListRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("OwnerId")
    private String ownerId;

    @Query
    @NameInMap("Region")
    @Validation(required = true)
    private String region;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DescribeNodeCidrListRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.ownerId = builder.ownerId;
        this.region = builder.region;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeCidrListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return region
     */
    public String getRegion() {
        return this.region;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DescribeNodeCidrListRequest, Builder> {
        private String clientToken; 
        private String ownerId; 
        private String region; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNodeCidrListRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.ownerId = response.ownerId;
            this.region = response.region;
            this.regionId = response.regionId;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Region.
         */
        public Builder region(String region) {
            this.putQueryParameter("Region", region);
            this.region = region;
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
        public DescribeNodeCidrListRequest build() {
            return new DescribeNodeCidrListRequest(this);
        } 

    } 

}
