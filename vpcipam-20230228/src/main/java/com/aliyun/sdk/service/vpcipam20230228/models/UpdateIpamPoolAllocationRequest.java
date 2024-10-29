// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpcipam20230228.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateIpamPoolAllocationRequest} extends {@link RequestModel}
 *
 * <p>UpdateIpamPoolAllocationRequest</p>
 */
public class UpdateIpamPoolAllocationRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationDescription")
    private String ipamPoolAllocationDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ipamPoolAllocationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IpamPoolAllocationName")
    private String ipamPoolAllocationName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateIpamPoolAllocationRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.ipamPoolAllocationDescription = builder.ipamPoolAllocationDescription;
        this.ipamPoolAllocationId = builder.ipamPoolAllocationId;
        this.ipamPoolAllocationName = builder.ipamPoolAllocationName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIpamPoolAllocationRequest create() {
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
     * @return ipamPoolAllocationDescription
     */
    public String getIpamPoolAllocationDescription() {
        return this.ipamPoolAllocationDescription;
    }

    /**
     * @return ipamPoolAllocationId
     */
    public String getIpamPoolAllocationId() {
        return this.ipamPoolAllocationId;
    }

    /**
     * @return ipamPoolAllocationName
     */
    public String getIpamPoolAllocationName() {
        return this.ipamPoolAllocationName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateIpamPoolAllocationRequest, Builder> {
        private String clientToken; 
        private Boolean dryRun; 
        private String ipamPoolAllocationDescription; 
        private String ipamPoolAllocationId; 
        private String ipamPoolAllocationName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIpamPoolAllocationRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.ipamPoolAllocationDescription = request.ipamPoolAllocationDescription;
            this.ipamPoolAllocationId = request.ipamPoolAllocationId;
            this.ipamPoolAllocationName = request.ipamPoolAllocationName;
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
         * IpamPoolAllocationDescription.
         */
        public Builder ipamPoolAllocationDescription(String ipamPoolAllocationDescription) {
            this.putQueryParameter("IpamPoolAllocationDescription", ipamPoolAllocationDescription);
            this.ipamPoolAllocationDescription = ipamPoolAllocationDescription;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ipam-pool-alloc-112za33e4****</p>
         */
        public Builder ipamPoolAllocationId(String ipamPoolAllocationId) {
            this.putQueryParameter("IpamPoolAllocationId", ipamPoolAllocationId);
            this.ipamPoolAllocationId = ipamPoolAllocationId;
            return this;
        }

        /**
         * IpamPoolAllocationName.
         */
        public Builder ipamPoolAllocationName(String ipamPoolAllocationName) {
            this.putQueryParameter("IpamPoolAllocationName", ipamPoolAllocationName);
            this.ipamPoolAllocationName = ipamPoolAllocationName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateIpamPoolAllocationRequest build() {
            return new UpdateIpamPoolAllocationRequest(this);
        } 

    } 

}
