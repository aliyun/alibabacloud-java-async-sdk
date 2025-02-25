// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

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
 * {@link ReleaseInstanceRequest} extends {@link RequestModel}
 *
 * <p>ReleaseInstanceRequest</p>
 */
public class ReleaseInstanceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ForceDeleteInstance")
    private Boolean forceDeleteInstance;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private ReleaseInstanceRequest(Builder builder) {
        super(builder);
        this.forceDeleteInstance = builder.forceDeleteInstance;
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ReleaseInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return forceDeleteInstance
     */
    public Boolean getForceDeleteInstance() {
        return this.forceDeleteInstance;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ReleaseInstanceRequest, Builder> {
        private Boolean forceDeleteInstance; 
        private String instanceId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ReleaseInstanceRequest request) {
            super(request);
            this.forceDeleteInstance = request.forceDeleteInstance;
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
        } 

        /**
         * <p>Specifies whether to immediately release the physical resources of the instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The physical resources of the instance are immediately released.</li>
         * <li><strong>false</strong>: The physical resources of the instance are retained for a period of time before they are released.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder forceDeleteInstance(Boolean forceDeleteInstance) {
            this.putQueryParameter("ForceDeleteInstance", forceDeleteInstance);
            this.forceDeleteInstance = forceDeleteInstance;
            return this;
        }

        /**
         * <p>The ID of the instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_post-cn-mp919o4v****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the instance.</p>
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
        public ReleaseInstanceRequest build() {
            return new ReleaseInstanceRequest(this);
        } 

    } 

}
