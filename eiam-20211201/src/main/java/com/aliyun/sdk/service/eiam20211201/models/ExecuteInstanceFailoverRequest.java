// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ExecuteInstanceFailoverRequest} extends {@link RequestModel}
 *
 * <p>ExecuteInstanceFailoverRequest</p>
 */
public class ExecuteInstanceFailoverRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceFailoverStatus")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceFailoverStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    private ExecuteInstanceFailoverRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceFailoverStatus = builder.instanceFailoverStatus;
        this.instanceId = builder.instanceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteInstanceFailoverRequest create() {
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
     * @return instanceFailoverStatus
     */
    public String getInstanceFailoverStatus() {
        return this.instanceFailoverStatus;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    public static final class Builder extends Request.Builder<ExecuteInstanceFailoverRequest, Builder> {
        private String regionId; 
        private String instanceFailoverStatus; 
        private String instanceId; 

        private Builder() {
            super();
        } 

        private Builder(ExecuteInstanceFailoverRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceFailoverStatus = request.instanceFailoverStatus;
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
         * <p>故障转移状态</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>active</p>
         */
        public Builder instanceFailoverStatus(String instanceFailoverStatus) {
            this.putQueryParameter("InstanceFailoverStatus", instanceFailoverStatus);
            this.instanceFailoverStatus = instanceFailoverStatus;
            return this;
        }

        /**
         * <p>IDaaS 的副本实例 ID</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_xxx</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        @Override
        public ExecuteInstanceFailoverRequest build() {
            return new ExecuteInstanceFailoverRequest(this);
        } 

    } 

}
