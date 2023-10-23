// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ots20160620.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UnbindInstance2VpcRequest} extends {@link RequestModel}
 *
 * <p>UnbindInstance2VpcRequest</p>
 */
public class UnbindInstance2VpcRequest extends Request {
    @Query
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Query
    @NameInMap("InstanceVpcName")
    @Validation(required = true)
    private String instanceVpcName;

    @Query
    @NameInMap("RegionNo")
    private String regionNo;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    private UnbindInstance2VpcRequest(Builder builder) {
        super(builder);
        this.instanceName = builder.instanceName;
        this.instanceVpcName = builder.instanceVpcName;
        this.regionNo = builder.regionNo;
        this.resourceOwnerId = builder.resourceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UnbindInstance2VpcRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return instanceVpcName
     */
    public String getInstanceVpcName() {
        return this.instanceVpcName;
    }

    /**
     * @return regionNo
     */
    public String getRegionNo() {
        return this.regionNo;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static final class Builder extends Request.Builder<UnbindInstance2VpcRequest, Builder> {
        private String instanceName; 
        private String instanceVpcName; 
        private String regionNo; 
        private Long resourceOwnerId; 

        private Builder() {
            super();
        } 

        private Builder(UnbindInstance2VpcRequest request) {
            super(request);
            this.instanceName = request.instanceName;
            this.instanceVpcName = request.instanceVpcName;
            this.regionNo = request.regionNo;
            this.resourceOwnerId = request.resourceOwnerId;
        } 

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putQueryParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * InstanceVpcName.
         */
        public Builder instanceVpcName(String instanceVpcName) {
            this.putQueryParameter("InstanceVpcName", instanceVpcName);
            this.instanceVpcName = instanceVpcName;
            return this;
        }

        /**
         * RegionNo.
         */
        public Builder regionNo(String regionNo) {
            this.putQueryParameter("RegionNo", regionNo);
            this.regionNo = regionNo;
            return this;
        }

        /**
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        @Override
        public UnbindInstance2VpcRequest build() {
            return new UnbindInstance2VpcRequest(this);
        } 

    } 

}
