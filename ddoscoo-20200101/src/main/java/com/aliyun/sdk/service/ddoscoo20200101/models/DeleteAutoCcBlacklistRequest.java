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
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("Blacklist")
    @Validation(required = true)
    private String blacklist;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    private DeleteAutoCcBlacklistRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.blacklist = builder.blacklist;
        this.instanceId = builder.instanceId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    public static final class Builder extends Request.Builder<DeleteAutoCcBlacklistRequest, Builder> {
        private String regionId; 
        private String blacklist; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAutoCcBlacklistRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.blacklist = request.blacklist;
            this.instanceId = request.instanceId;
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
         * The IP addresses that you want to manage. This parameter is a JSON string. The string contains the following fields:
         * <p>
         * 
         * *   **src**: the IP address. This field is required and must be of the STRING type.
         */
        public Builder blacklist(String blacklist) {
            this.putQueryParameter("Blacklist", blacklist);
            this.blacklist = blacklist;
            return this;
        }

        /**
         * The ID of the instance.
         * <p>
         * 
         * > You can call the [DescribeInstanceIds](~~157459~~) operation to query the IDs of all instances.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public DeleteAutoCcBlacklistRequest build() {
            return new DeleteAutoCcBlacklistRequest(this);
        } 

    } 

}
