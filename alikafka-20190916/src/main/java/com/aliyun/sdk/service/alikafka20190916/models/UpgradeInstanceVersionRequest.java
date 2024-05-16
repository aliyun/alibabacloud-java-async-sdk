// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alikafka20190916.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpgradeInstanceVersionRequest} extends {@link RequestModel}
 *
 * <p>UpgradeInstanceVersionRequest</p>
 */
public class UpgradeInstanceVersionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetVersion")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetVersion;

    private UpgradeInstanceVersionRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.targetVersion = builder.targetVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpgradeInstanceVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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

    /**
     * @return targetVersion
     */
    public String getTargetVersion() {
        return this.targetVersion;
    }

    public static final class Builder extends Request.Builder<UpgradeInstanceVersionRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String targetVersion; 

        private Builder() {
            super();
        } 

        private Builder(UpgradeInstanceVersionRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.targetVersion = request.targetVersion;
        } 

        /**
         * The ID of the instance.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * The ID of the region where the instance resides.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The major version to be upgraded to. Valid values:
         * <p>
         * 
         * *   **0.10.2**
         * *   **2.2.0**
         * 
         * If you set this parameter to the current major version, the system upgrades the instance to the latest minor version.
         */
        public Builder targetVersion(String targetVersion) {
            this.putQueryParameter("TargetVersion", targetVersion);
            this.targetVersion = targetVersion;
            return this;
        }

        @Override
        public UpgradeInstanceVersionRequest build() {
            return new UpgradeInstanceVersionRequest(this);
        } 

    } 

}
