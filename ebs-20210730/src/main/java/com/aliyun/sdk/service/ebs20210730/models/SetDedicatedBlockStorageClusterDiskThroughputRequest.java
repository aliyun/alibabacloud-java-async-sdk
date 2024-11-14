// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SetDedicatedBlockStorageClusterDiskThroughputRequest} extends {@link RequestModel}
 *
 * <p>SetDedicatedBlockStorageClusterDiskThroughputRequest</p>
 */
public class SetDedicatedBlockStorageClusterDiskThroughputRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Bps")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer bps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DiskId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String diskId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>Target throughput.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder bps(Integer bps) {
            this.putBodyParameter("Bps", bps);
            this.bps = bps;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests. The ClientToken value can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see <a href="https://help.aliyun.com/document_detail/25693.html">How to ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The ID of the disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>d-bp67acfmxazb4p****</p>
         */
        public Builder diskId(String diskId) {
            this.putBodyParameter("DiskId", diskId);
            this.diskId = diskId;
            return this;
        }

        /**
         * <p>The region ID of disk.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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
