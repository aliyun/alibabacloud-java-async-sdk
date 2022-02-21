// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteAutoCcBlacklistRequest} extends {@link RequestModel}
 *
 * <p>DeleteAutoCcBlacklistRequest</p>
 */
public class DeleteAutoCcBlacklistRequest extends Request {
    @Query
    @NameInMap("Blacklist")
    @Validation(required = true)
    private String blacklist;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private DeleteAutoCcBlacklistRequest(Builder builder) {
        super(builder);
        this.blacklist = builder.blacklist;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAutoCcBlacklistRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blacklist
     */
    public String getBlacklist() {
        return this.blacklist;
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

    public static final class Builder extends Request.Builder<DeleteAutoCcBlacklistRequest, Builder> {
        private String blacklist; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAutoCcBlacklistRequest response) {
            super(response);
            this.blacklist = response.blacklist;
            this.instanceId = response.instanceId;
            this.regionId = response.regionId;
        } 

        /**
         * Blacklist.
         */
        public Builder blacklist(String blacklist) {
            this.putQueryParameter("Blacklist", blacklist);
            this.blacklist = blacklist;
            return this;
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

        @Override
        public DeleteAutoCcBlacklistRequest build() {
            return new DeleteAutoCcBlacklistRequest(this);
        } 

    } 

}
