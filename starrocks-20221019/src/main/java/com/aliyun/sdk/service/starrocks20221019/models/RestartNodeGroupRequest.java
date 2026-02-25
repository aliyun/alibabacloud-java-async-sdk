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
 * {@link RestartNodeGroupRequest} extends {@link RequestModel}
 *
 * <p>RestartNodeGroupRequest</p>
 */
public class RestartNodeGroupRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FastMode")
    private Boolean fastMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NodeGroupId")
    private String nodeGroupId;

    private RestartNodeGroupRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.fastMode = builder.fastMode;
        this.instanceId = builder.instanceId;
        this.nodeGroupId = builder.nodeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartNodeGroupRequest create() {
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

    public static final class Builder extends Request.Builder<RestartNodeGroupRequest, Builder> {
        private String regionId; 
        private Boolean fastMode; 
        private String instanceId; 
        private String nodeGroupId; 

        private Builder() {
            super();
        } 

        private Builder(RestartNodeGroupRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.fastMode = request.fastMode;
            this.instanceId = request.instanceId;
            this.nodeGroupId = request.nodeGroupId;
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
         * FastMode.
         */
        public Builder fastMode(Boolean fastMode) {
            this.putQueryParameter("FastMode", fastMode);
            this.fastMode = fastMode;
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
         * NodeGroupId.
         */
        public Builder nodeGroupId(String nodeGroupId) {
            this.putQueryParameter("NodeGroupId", nodeGroupId);
            this.nodeGroupId = nodeGroupId;
            return this;
        }

        @Override
        public RestartNodeGroupRequest build() {
            return new RestartNodeGroupRequest(this);
        } 

    } 

}
