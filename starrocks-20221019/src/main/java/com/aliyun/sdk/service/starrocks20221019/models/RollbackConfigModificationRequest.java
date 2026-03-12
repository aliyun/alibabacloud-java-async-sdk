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
 * {@link RollbackConfigModificationRequest} extends {@link RequestModel}
 *
 * <p>RollbackConfigModificationRequest</p>
 */
public class RollbackConfigModificationRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConfigHistoryId")
    private Long configHistoryId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Restart")
    private Boolean restart;

    private RollbackConfigModificationRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.configHistoryId = builder.configHistoryId;
        this.instanceId = builder.instanceId;
        this.restart = builder.restart;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RollbackConfigModificationRequest create() {
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
     * @return configHistoryId
     */
    public Long getConfigHistoryId() {
        return this.configHistoryId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return restart
     */
    public Boolean getRestart() {
        return this.restart;
    }

    public static final class Builder extends Request.Builder<RollbackConfigModificationRequest, Builder> {
        private String regionId; 
        private Long configHistoryId; 
        private String instanceId; 
        private Boolean restart; 

        private Builder() {
            super();
        } 

        private Builder(RollbackConfigModificationRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.configHistoryId = request.configHistoryId;
            this.instanceId = request.instanceId;
            this.restart = request.restart;
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
         * ConfigHistoryId.
         */
        public Builder configHistoryId(Long configHistoryId) {
            this.putQueryParameter("ConfigHistoryId", configHistoryId);
            this.configHistoryId = configHistoryId;
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
         * Restart.
         */
        public Builder restart(Boolean restart) {
            this.putQueryParameter("Restart", restart);
            this.restart = restart;
            return this;
        }

        @Override
        public RollbackConfigModificationRequest build() {
            return new RollbackConfigModificationRequest(this);
        } 

    } 

}
