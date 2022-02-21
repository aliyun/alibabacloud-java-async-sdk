// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ReprotectDiskReplicaPairRequest} extends {@link RequestModel}
 *
 * <p>ReprotectDiskReplicaPairRequest</p>
 */
public class ReprotectDiskReplicaPairRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ReplicaPairId")
    @Validation(required = true)
    private String replicaPairId;

    private ReprotectDiskReplicaPairRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.replicaPairId = builder.replicaPairId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReprotectDiskReplicaPairRequest create() {
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

    public static final class Builder extends Request.Builder<ReprotectDiskReplicaPairRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String replicaPairId; 

        private Builder() {
            super();
        } 

        private Builder(ReprotectDiskReplicaPairRequest response) {
            super(response);
            this.clientToken = response.clientToken;
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
        public ReprotectDiskReplicaPairRequest build() {
            return new ReprotectDiskReplicaPairRequest(this);
        } 

    } 

}
