// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link MigrateEcuRequest} extends {@link RequestModel}
 *
 * <p>MigrateEcuRequest</p>
 */
public class MigrateEcuRequest extends Request {
    @Query
    @NameInMap("InstanceIds")
    @Validation(required = true)
    private String instanceIds;

    @Query
    @NameInMap("LogicalRegionId")
    private String logicalRegionId;

    private MigrateEcuRequest(Builder builder) {
        super(builder);
        this.instanceIds = builder.instanceIds;
        this.logicalRegionId = builder.logicalRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MigrateEcuRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceIds
     */
    public String getInstanceIds() {
        return this.instanceIds;
    }

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    public static final class Builder extends Request.Builder<MigrateEcuRequest, Builder> {
        private String instanceIds; 
        private String logicalRegionId; 

        private Builder() {
            super();
        } 

        private Builder(MigrateEcuRequest request) {
            super(request);
            this.instanceIds = request.instanceIds;
            this.logicalRegionId = request.logicalRegionId;
        } 

        /**
         * The ID of the ECS instance. Separate multiple IDs with commas (,).
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * The ID of the custom namespace.
         * <p>
         * 
         * *   The ID of a custom namespace is in the `region ID:custom namespace ID` format. Example: cn-beijing:tdy218.
         * *   The ID of the default namespace is in the `region ID` format. Example: cn-beijing.
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        @Override
        public MigrateEcuRequest build() {
            return new MigrateEcuRequest(this);
        } 

    } 

}
