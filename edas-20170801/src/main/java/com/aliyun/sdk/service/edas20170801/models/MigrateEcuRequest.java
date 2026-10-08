// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link MigrateEcuRequest} extends {@link RequestModel}
 *
 * <p>MigrateEcuRequest</p>
 */
public class MigrateEcuRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogicalRegionId")
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
         * <p>The IDs of the instances. To specify multiple instances, separate the IDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>i-2zej4i2jdf3ntwhj****</p>
         */
        public Builder instanceIds(String instanceIds) {
            this.putQueryParameter("InstanceIds", instanceIds);
            this.instanceIds = instanceIds;
            return this;
        }

        /**
         * <p>The ID of the namespace.</p>
         * <ul>
         * <li><p>A custom namespace ID is in the format <code>Region ID:Namespace identifier</code>. Example: cn-beijing:tdy218.</p>
         * </li>
         * <li><p>A default namespace ID is the same as its region ID. Example: cn-beijing.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou:test_region</p>
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
