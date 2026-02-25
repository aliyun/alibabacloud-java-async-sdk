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
 * {@link IsolateLeaderRequest} extends {@link RequestModel}
 *
 * <p>IsolateLeaderRequest</p>
 */
public class IsolateLeaderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsolateLeader")
    private Boolean isolateLeader;

    private IsolateLeaderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.instanceId = builder.instanceId;
        this.isolateLeader = builder.isolateLeader;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IsolateLeaderRequest create() {
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
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return isolateLeader
     */
    public Boolean getIsolateLeader() {
        return this.isolateLeader;
    }

    public static final class Builder extends Request.Builder<IsolateLeaderRequest, Builder> {
        private String regionId; 
        private String instanceId; 
        private Boolean isolateLeader; 

        private Builder() {
            super();
        } 

        private Builder(IsolateLeaderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.instanceId = request.instanceId;
            this.isolateLeader = request.isolateLeader;
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
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * IsolateLeader.
         */
        public Builder isolateLeader(Boolean isolateLeader) {
            this.putQueryParameter("IsolateLeader", isolateLeader);
            this.isolateLeader = isolateLeader;
            return this;
        }

        @Override
        public IsolateLeaderRequest build() {
            return new IsolateLeaderRequest(this);
        } 

    } 

}
