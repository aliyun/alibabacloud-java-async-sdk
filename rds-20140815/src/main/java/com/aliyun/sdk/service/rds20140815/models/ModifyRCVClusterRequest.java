// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link ModifyRCVClusterRequest} extends {@link RequestModel}
 *
 * <p>ModifyRCVClusterRequest</p>
 */
public class ModifyRCVClusterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportDiskPerformanceLevel")
    private java.util.List<String> supportDiskPerformanceLevel;

    private ModifyRCVClusterRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.regionId = builder.regionId;
        this.supportDiskPerformanceLevel = builder.supportDiskPerformanceLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyRCVClusterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return supportDiskPerformanceLevel
     */
    public java.util.List<String> getSupportDiskPerformanceLevel() {
        return this.supportDiskPerformanceLevel;
    }

    public static final class Builder extends Request.Builder<ModifyRCVClusterRequest, Builder> {
        private String clusterId; 
        private String regionId; 
        private java.util.List<String> supportDiskPerformanceLevel; 

        private Builder() {
            super();
        } 

        private Builder(ModifyRCVClusterRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.regionId = request.regionId;
            this.supportDiskPerformanceLevel = request.supportDiskPerformanceLevel;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cd21387ea640145bab79a78276c1a****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
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

        /**
         * SupportDiskPerformanceLevel.
         */
        public Builder supportDiskPerformanceLevel(java.util.List<String> supportDiskPerformanceLevel) {
            String supportDiskPerformanceLevelShrink = shrink(supportDiskPerformanceLevel, "SupportDiskPerformanceLevel", "json");
            this.putQueryParameter("SupportDiskPerformanceLevel", supportDiskPerformanceLevelShrink);
            this.supportDiskPerformanceLevel = supportDiskPerformanceLevel;
            return this;
        }

        @Override
        public ModifyRCVClusterRequest build() {
            return new ModifyRCVClusterRequest(this);
        } 

    } 

}
