// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.starrocks20221019.models;

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
 * {@link ModifyCuRequest} extends {@link RequestModel}
 *
 * <p>ModifyCuRequest</p>
 */
public class ModifyCuRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FastMode")
    private Boolean fastMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Target")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 64, minimum = 4)
    private Integer target;

    private ModifyCuRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fastMode = builder.fastMode;
        this.instanceId = builder.instanceId;
        this.nodeGroupId = builder.nodeGroupId;
        this.target = builder.target;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCuRequest create() {
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
     * @return fastMode
     */
    public Boolean getFastMode() {
        return this.fastMode;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return nodeGroupId
     */
    public String getNodeGroupId() {
        return this.nodeGroupId;
    }

    /**
     * @return target
     */
    public Integer getTarget() {
        return this.target;
    }

    public static final class Builder extends Request.Builder<ModifyCuRequest, Builder> {
        private String regionId; 
        private Boolean fastMode; 
        private String instanceId; 
        private String nodeGroupId; 
        private Integer target; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCuRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fastMode = request.fastMode;
            this.instanceId = request.instanceId;
            this.nodeGroupId = request.nodeGroupId;
            this.target = request.target;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * FastMode.
         */
        public Builder fastMode(Boolean fastMode) {
            this.putQueryParameter("FastMode", fastMode);
            this.fastMode = fastMode;
            return this;
        }

        /**
         * <p>The instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c-b25e21e24388****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The warehouse ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ng-3d5ce6454354****</p>
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        /**
         * <p>The number of CUs to which you want to change.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>4</li>
         * <li>8</li>
         * <li>16</li>
         * <li>32</li>
         * <li>64</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        public Builder target(Integer target) {
            this.putQueryParameter("Target", target);
            this.target = target;
            return this;
        }

        @Override
        public ModifyCuRequest build() {
            return new ModifyCuRequest(this);
        } 

    } 

}
