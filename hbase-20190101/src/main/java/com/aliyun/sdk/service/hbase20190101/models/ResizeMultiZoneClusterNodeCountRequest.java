// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20190101.models;

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
 * {@link ResizeMultiZoneClusterNodeCountRequest} extends {@link RequestModel}
 *
 * <p>ResizeMultiZoneClusterNodeCountRequest</p>
 */
public class ResizeMultiZoneClusterNodeCountRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ArbiterVSwitchId")
    private String arbiterVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CoreNodeCount")
    @com.aliyun.core.annotation.Validation(maximum = 1000, minimum = 2)
    private Integer coreNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LogNodeCount")
    @com.aliyun.core.annotation.Validation(maximum = 500, minimum = 4)
    private Integer logNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryCoreNodeCount")
    @com.aliyun.core.annotation.Validation(maximum = 750, minimum = 1)
    private Integer primaryCoreNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PrimaryVSwitchId")
    private String primaryVSwitchId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyCoreNodeCount")
    @com.aliyun.core.annotation.Validation(maximum = 750, minimum = 1)
    private Integer standbyCoreNodeCount;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StandbyVSwitchId")
    private String standbyVSwitchId;

    private ResizeMultiZoneClusterNodeCountRequest(Builder builder) {
        super(builder);
        this.arbiterVSwitchId = builder.arbiterVSwitchId;
        this.clusterId = builder.clusterId;
        this.coreNodeCount = builder.coreNodeCount;
        this.logNodeCount = builder.logNodeCount;
        this.primaryCoreNodeCount = builder.primaryCoreNodeCount;
        this.primaryVSwitchId = builder.primaryVSwitchId;
        this.standbyCoreNodeCount = builder.standbyCoreNodeCount;
        this.standbyVSwitchId = builder.standbyVSwitchId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ResizeMultiZoneClusterNodeCountRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return arbiterVSwitchId
     */
    public String getArbiterVSwitchId() {
        return this.arbiterVSwitchId;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return coreNodeCount
     */
    public Integer getCoreNodeCount() {
        return this.coreNodeCount;
    }

    /**
     * @return logNodeCount
     */
    public Integer getLogNodeCount() {
        return this.logNodeCount;
    }

    /**
     * @return primaryCoreNodeCount
     */
    public Integer getPrimaryCoreNodeCount() {
        return this.primaryCoreNodeCount;
    }

    /**
     * @return primaryVSwitchId
     */
    public String getPrimaryVSwitchId() {
        return this.primaryVSwitchId;
    }

    /**
     * @return standbyCoreNodeCount
     */
    public Integer getStandbyCoreNodeCount() {
        return this.standbyCoreNodeCount;
    }

    /**
     * @return standbyVSwitchId
     */
    public String getStandbyVSwitchId() {
        return this.standbyVSwitchId;
    }

    public static final class Builder extends Request.Builder<ResizeMultiZoneClusterNodeCountRequest, Builder> {
        private String arbiterVSwitchId; 
        private String clusterId; 
        private Integer coreNodeCount; 
        private Integer logNodeCount; 
        private Integer primaryCoreNodeCount; 
        private String primaryVSwitchId; 
        private Integer standbyCoreNodeCount; 
        private String standbyVSwitchId; 

        private Builder() {
            super();
        } 

        private Builder(ResizeMultiZoneClusterNodeCountRequest request) {
            super(request);
            this.arbiterVSwitchId = request.arbiterVSwitchId;
            this.clusterId = request.clusterId;
            this.coreNodeCount = request.coreNodeCount;
            this.logNodeCount = request.logNodeCount;
            this.primaryCoreNodeCount = request.primaryCoreNodeCount;
            this.primaryVSwitchId = request.primaryVSwitchId;
            this.standbyCoreNodeCount = request.standbyCoreNodeCount;
            this.standbyVSwitchId = request.standbyVSwitchId;
        } 

        /**
         * ArbiterVSwitchId.
         */
        public Builder arbiterVSwitchId(String arbiterVSwitchId) {
            this.putQueryParameter("ArbiterVSwitchId", arbiterVSwitchId);
            this.arbiterVSwitchId = arbiterVSwitchId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ld-f5d8d6s4s2a1****</p>
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * CoreNodeCount.
         */
        public Builder coreNodeCount(Integer coreNodeCount) {
            this.putQueryParameter("CoreNodeCount", coreNodeCount);
            this.coreNodeCount = coreNodeCount;
            return this;
        }

        /**
         * LogNodeCount.
         */
        public Builder logNodeCount(Integer logNodeCount) {
            this.putQueryParameter("LogNodeCount", logNodeCount);
            this.logNodeCount = logNodeCount;
            return this;
        }

        /**
         * PrimaryCoreNodeCount.
         */
        public Builder primaryCoreNodeCount(Integer primaryCoreNodeCount) {
            this.putQueryParameter("PrimaryCoreNodeCount", primaryCoreNodeCount);
            this.primaryCoreNodeCount = primaryCoreNodeCount;
            return this;
        }

        /**
         * PrimaryVSwitchId.
         */
        public Builder primaryVSwitchId(String primaryVSwitchId) {
            this.putQueryParameter("PrimaryVSwitchId", primaryVSwitchId);
            this.primaryVSwitchId = primaryVSwitchId;
            return this;
        }

        /**
         * StandbyCoreNodeCount.
         */
        public Builder standbyCoreNodeCount(Integer standbyCoreNodeCount) {
            this.putQueryParameter("StandbyCoreNodeCount", standbyCoreNodeCount);
            this.standbyCoreNodeCount = standbyCoreNodeCount;
            return this;
        }

        /**
         * StandbyVSwitchId.
         */
        public Builder standbyVSwitchId(String standbyVSwitchId) {
            this.putQueryParameter("StandbyVSwitchId", standbyVSwitchId);
            this.standbyVSwitchId = standbyVSwitchId;
            return this;
        }

        @Override
        public ResizeMultiZoneClusterNodeCountRequest build() {
            return new ResizeMultiZoneClusterNodeCountRequest(this);
        } 

    } 

}
