// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReplicaPairRequest} extends {@link RequestModel}
 *
 * <p>ModifyReplicaPairRequest</p>
 */
public class ModifyReplicaPairRequest extends Request {
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

    private ModifyReplicaPairRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.pairName = builder.pairName;
        this.regionId = builder.regionId;
        this.replicaPairId = builder.replicaPairId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyReplicaPairRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<ModifyReplicaPairRequest, Builder> {
        private String description; 
        private String pairName; 
        private String regionId; 
        private String replicaPairId; 

        private Builder() {
            super();
        } 

        private Builder(ModifyReplicaPairRequest response) {
            super(response);
            this.description = response.description;
            this.pairName = response.pairName;
            this.regionId = response.regionId;
            this.replicaPairId = response.replicaPairId;
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
        public ModifyReplicaPairRequest build() {
            return new ModifyReplicaPairRequest(this);
        } 

    } 

}
