// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartPairDrillRequest} extends {@link RequestModel}
 *
 * <p>StartPairDrillRequest</p>
 */
public class StartPairDrillRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("PairId")
    @Validation(required = true)
    private String pairId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private StartPairDrillRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.pairId = builder.pairId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartPairDrillRequest create() {
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
     * @return pairId
     */
    public String getPairId() {
        return this.pairId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<StartPairDrillRequest, Builder> {
        private String clientToken; 
        private String pairId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(StartPairDrillRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.pairId = request.pairId;
            this.regionId = request.regionId;
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
         * PairId.
         */
        public Builder pairId(String pairId) {
            this.putQueryParameter("PairId", pairId);
            this.pairId = pairId;
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
        public StartPairDrillRequest build() {
            return new StartPairDrillRequest(this);
        } 

    } 

}
