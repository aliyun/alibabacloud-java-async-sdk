// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteRCInstancesRequest} extends {@link RequestModel}
 *
 * <p>DeleteRCInstancesRequest</p>
 */
public class DeleteRCInstancesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Force")
    private Boolean force;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TerminateSubscription")
    private Boolean terminateSubscription;

    private DeleteRCInstancesRequest(Builder builder) {
        super(builder);
        this.dryRun = builder.dryRun;
        this.force = builder.force;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.terminateSubscription = builder.terminateSubscription;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteRCInstancesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return force
     */
    public Boolean getForce() {
        return this.force;
    }

    /**
     * @return instanceId
     */
    public java.util.List < String > getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return terminateSubscription
     */
    public Boolean getTerminateSubscription() {
        return this.terminateSubscription;
    }

    public static final class Builder extends Request.Builder<DeleteRCInstancesRequest, Builder> {
        private Boolean dryRun; 
        private Boolean force; 
        private java.util.List < String > instanceId; 
        private String regionId; 
        private Boolean terminateSubscription; 

        private Builder() {
            super();
        } 

        private Builder(DeleteRCInstancesRequest request) {
            super(request);
            this.dryRun = request.dryRun;
            this.force = request.force;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.terminateSubscription = request.terminateSubscription;
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
         * Force.
         */
        public Builder force(Boolean force) {
            this.putQueryParameter("Force", force);
            this.force = force;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(java.util.List < String > instanceId) {
            String instanceIdShrink = shrink(instanceId, "InstanceId", "json");
            this.putQueryParameter("InstanceId", instanceIdShrink);
            this.instanceId = instanceId;
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
         * TerminateSubscription.
         */
        public Builder terminateSubscription(Boolean terminateSubscription) {
            this.putQueryParameter("TerminateSubscription", terminateSubscription);
            this.terminateSubscription = terminateSubscription;
            return this;
        }

        @Override
        public DeleteRCInstancesRequest build() {
            return new DeleteRCInstancesRequest(this);
        } 

    } 

}
