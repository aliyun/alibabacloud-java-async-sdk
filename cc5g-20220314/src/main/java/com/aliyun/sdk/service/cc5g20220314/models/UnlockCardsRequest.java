// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cc5g20220314.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnlockCardsRequest} extends {@link RequestModel}
 *
 * <p>UnlockCardsRequest</p>
 */
public class UnlockCardsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Iccids")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > iccids;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private UnlockCardsRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.iccids = builder.iccids;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnlockCardsRequest create() {
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
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return iccids
     */
    public java.util.List < String > getIccids() {
        return this.iccids;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UnlockCardsRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private java.util.List < String > iccids; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UnlockCardsRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.iccids = request.iccids;
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
         * DryRun.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * Iccids.
         */
        public Builder iccids(java.util.List < String > iccids) {
            this.putQueryParameter("Iccids", iccids);
            this.iccids = iccids;
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
        public UnlockCardsRequest build() {
            return new UnlockCardsRequest(this);
        } 

    } 

}
