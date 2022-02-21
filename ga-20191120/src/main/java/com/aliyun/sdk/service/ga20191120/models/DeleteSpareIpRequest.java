// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSpareIpRequest} extends {@link RequestModel}
 *
 * <p>DeleteSpareIpRequest</p>
 */
public class DeleteSpareIpRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("SpareIps")
    @Validation(required = true)
    private java.util.List < String > spareIps;

    private DeleteSpareIpRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.regionId = builder.regionId;
        this.spareIps = builder.spareIps;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteSpareIpRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return spareIps
     */
    public java.util.List < String > getSpareIps() {
        return this.spareIps;
    }

    public static final class Builder extends Request.Builder<DeleteSpareIpRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private Boolean dryRun; 
        private String regionId; 
        private java.util.List < String > spareIps; 

        private Builder() {
            super();
        } 

        private Builder(DeleteSpareIpRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.regionId = response.regionId;
            this.spareIps = response.spareIps;
        } 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
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
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SpareIps.
         */
        public Builder spareIps(java.util.List < String > spareIps) {
            this.putQueryParameter("SpareIps", spareIps);
            this.spareIps = spareIps;
            return this;
        }

        @Override
        public DeleteSpareIpRequest build() {
            return new DeleteSpareIpRequest(this);
        } 

    } 

}
