// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetDedicatedBlockStorageClusterDiskThroughputRequest} extends {@link RequestModel}
 *
 * <p>SetDedicatedBlockStorageClusterDiskThroughputRequest</p>
 */
public class SetDedicatedBlockStorageClusterDiskThroughputRequest extends Request {
    @Body
    @NameInMap("Bps")
    @Validation(required = true)
    private Integer bps;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Body
    @NameInMap("DiskId")
    @Validation(required = true)
    private String diskId;

    @Body
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private SetDedicatedBlockStorageClusterDiskThroughputRequest(Builder builder) {
        super(builder);
        this.bps = builder.bps;
        this.clientToken = builder.clientToken;
        this.diskId = builder.diskId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDedicatedBlockStorageClusterDiskThroughputRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bps
     */
    public Integer getBps() {
        return this.bps;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return diskId
     */
    public String getDiskId() {
        return this.diskId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<SetDedicatedBlockStorageClusterDiskThroughputRequest, Builder> {
        private Integer bps; 
        private String clientToken; 
        private String diskId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(SetDedicatedBlockStorageClusterDiskThroughputRequest request) {
            super(request);
            this.bps = request.bps;
            this.clientToken = request.clientToken;
            this.diskId = request.diskId;
            this.regionId = request.regionId;
        } 

        /**
         * Target throughput.
         */
        public Builder bps(Integer bps) {
            this.putBodyParameter("Bps", bps);
            this.bps = bps;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The ID of the disk.
         */
        public Builder diskId(String diskId) {
            this.putBodyParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * The region ID of disk.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public SetDedicatedBlockStorageClusterDiskThroughputRequest build() {
            return new SetDedicatedBlockStorageClusterDiskThroughputRequest(this);
        } 

    } 

}
