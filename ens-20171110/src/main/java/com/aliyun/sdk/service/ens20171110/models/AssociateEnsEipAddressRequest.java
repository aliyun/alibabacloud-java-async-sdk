// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociateEnsEipAddressRequest} extends {@link RequestModel}
 *
 * <p>AssociateEnsEipAddressRequest</p>
 */
public class AssociateEnsEipAddressRequest extends Request {
    @Query
    @NameInMap("AllocationId")
    @Validation(required = true)
    private String allocationId;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("InstanceType")
    private String instanceType;

    @Query
    @NameInMap("Standby")
    private Boolean standby;

    private AssociateEnsEipAddressRequest(Builder builder) {
        super(builder);
        this.allocationId = builder.allocationId;
        this.instanceId = builder.instanceId;
        this.instanceType = builder.instanceType;
        this.standby = builder.standby;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociateEnsEipAddressRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allocationId
     */
    public String getAllocationId() {
        return this.allocationId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return standby
     */
    public Boolean getStandby() {
        return this.standby;
    }

    public static final class Builder extends Request.Builder<AssociateEnsEipAddressRequest, Builder> {
        private String allocationId; 
        private String instanceId; 
        private String instanceType; 
        private Boolean standby; 

        private Builder() {
            super();
        } 

        private Builder(AssociateEnsEipAddressRequest request) {
            super(request);
            this.allocationId = request.allocationId;
            this.instanceId = request.instanceId;
            this.instanceType = request.instanceType;
            this.standby = request.standby;
        } 

        /**
         * AllocationId.
         */
        public Builder allocationId(String allocationId) {
            this.putQueryParameter("AllocationId", allocationId);
            this.allocationId = allocationId;
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
         * InstanceType.
         */
        public Builder instanceType(String instanceType) {
            this.putQueryParameter("InstanceType", instanceType);
            this.instanceType = instanceType;
            return this;
        }

        /**
         * Standby.
         */
        public Builder standby(Boolean standby) {
            this.putQueryParameter("Standby", standby);
            this.standby = standby;
            return this;
        }

        @Override
        public AssociateEnsEipAddressRequest build() {
            return new AssociateEnsEipAddressRequest(this);
        } 

    } 

}
