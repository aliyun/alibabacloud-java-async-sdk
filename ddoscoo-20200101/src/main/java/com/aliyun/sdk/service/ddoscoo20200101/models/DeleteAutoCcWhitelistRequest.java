// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAutoCcWhitelistRequest} extends {@link RequestModel}
 *
 * <p>DeleteAutoCcWhitelistRequest</p>
 */
public class DeleteAutoCcWhitelistRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Whitelist")
    @Validation(required = true)
    private String whitelist;

    private DeleteAutoCcWhitelistRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.whitelist = builder.whitelist;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAutoCcWhitelistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return whitelist
     */
    public String getWhitelist() {
        return this.whitelist;
    }

    public static final class Builder extends Request.Builder<DeleteAutoCcWhitelistRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String whitelist; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAutoCcWhitelistRequest response) {
            super(response);
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
            this.whitelist = response.whitelist;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
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

        /**
         * Whitelist.
         */
        public Builder whitelist(String whitelist) {
            this.putQueryParameter("Whitelist", whitelist);
            this.whitelist = whitelist;
            return this;
        }

        @Override
        public DeleteAutoCcWhitelistRequest build() {
            return new DeleteAutoCcWhitelistRequest(this);
        } 

    } 

}
