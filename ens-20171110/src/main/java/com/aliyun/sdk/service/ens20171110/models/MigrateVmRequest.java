// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateVmRequest} extends {@link RequestModel}
 *
 * <p>MigrateVmRequest</p>
 */
public class MigrateVmRequest extends Request {
    @Query
    @NameInMap("GroupUuid")
    private String groupUuid;

    @Query
    @NameInMap("InstanceIds")
    private String instanceIds;

    @Body
    @NameInMap("Instances")
    private String instances;

    @Query
    @NameInMap("Tenant")
    @Validation(required = true)
    private String tenant;

    private MigrateVmRequest(Builder builder) {
        super(builder);
        this.groupUuid = builder.groupUuid;
        this.instanceIds = builder.instanceIds;
        this.instances = builder.instances;
        this.tenant = builder.tenant;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateVmRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return groupUuid
     */
    public String getGroupUuid() {
        return this.groupUuid;
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return instances
     */
    public String getInstances() {
        return this.instances;
    }

    /**
     * @return tenant
     */
    public String getTenant() {
        return this.tenant;
    }

    public static final class Builder extends Request.Builder<MigrateVmRequest, Builder> {
        private String groupUuid; 
        private String instanceIds; 
        private String instances; 
        private String tenant; 

        private Builder() {
            super();
        } 

        private Builder(MigrateVmRequest response) {
            super(response);
            this.groupUuid = response.groupUuid;
            this.instanceIds = response.instanceIds;
            this.instances = response.instances;
            this.tenant = response.tenant;
        } 

        /**
         * GroupUuid.
         */
        public Builder groupUuid(String groupUuid) {
            this.putQueryParameter("GroupUuid", groupUuid);
            this.groupUuid = groupUuid;
            return this;
        }

        /**
         * InstanceIds.
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * Instances.
         */
        public Builder instances(String instances) {
            this.putBodyParameter("Instances", instances);
            this.instances = instances;
            return this;
        }

        /**
         * Tenant.
         */
        public Builder tenant(String tenant) {
            this.putQueryParameter("Tenant", tenant);
            this.tenant = tenant;
            return this;
        }

        @Override
        public MigrateVmRequest build() {
            return new MigrateVmRequest(this);
        } 

    } 

}
