// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskReplicaPairRequest} extends {@link RequestModel}
 *
 * <p>ModifyDiskReplicaPairRequest</p>
 */
public class ModifyDiskReplicaPairRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("PairName")
    private String pairName;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicaPairId")
    @Validation(required = true)
    private String replicaPairId;

    private ModifyDiskReplicaPairRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.pairName = builder.pairName;
        this.regionId = builder.regionId;
        this.replicaPairId = builder.replicaPairId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyDiskReplicaPairRequest create() {
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
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return pairName
     */
    public String getPairName() {
        return this.pairName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return replicaPairId
     */
    public String getReplicaPairId() {
        return this.replicaPairId;
    }

    public static final class Builder extends Request.Builder<ModifyDiskReplicaPairRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String pairName; 
        private String regionId; 
        private String replicaPairId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyDiskReplicaPairRequest response) {
            super(response);
            this.clientToken = response.clientToken;
            this.description = response.description;
            this.pairName = response.pairName;
            this.regionId = response.regionId;
            this.replicaPairId = response.replicaPairId;
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
         * Description.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * PairName.
         */
        public Builder pairName(String pairName) {
            this.putQueryParameter("PairName", pairName);
            this.pairName = pairName;
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

        /**
         * ReplicaPairId.
         */
        public Builder replicaPairId(String replicaPairId) {
            this.putQueryParameter("ReplicaPairId", replicaPairId);
            this.replicaPairId = replicaPairId;
            return this;
        }

        @Override
        public ModifyDiskReplicaPairRequest build() {
            return new ModifyDiskReplicaPairRequest(this);
        } 

    } 

}
