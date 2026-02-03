// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link CacheCluster} extends {@link TeaModel}
 *
 * <p>CacheCluster</p>
 */
public class CacheCluster extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("clusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("createdAt")
    private Long createdAt;

    @com.aliyun.core.annotation.NameInMap("createdBy")
    private String createdBy;

    @com.aliyun.core.annotation.NameInMap("deployInstanceVersion")
    private String deployInstanceVersion;

    @com.aliyun.core.annotation.NameInMap("deployOptionsVersion")
    private Long deployOptionsVersion;

    @com.aliyun.core.annotation.NameInMap("instanceVersion")
    private String instanceVersion;

    @com.aliyun.core.annotation.NameInMap("options")
    private java.util.Map<String, String> options;

    @com.aliyun.core.annotation.NameInMap("optionsVersion")
    private Long optionsVersion;

    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("updatedAt")
    private Long updatedAt;

    @com.aliyun.core.annotation.NameInMap("updatedBy")
    private String updatedBy;

    @com.aliyun.core.annotation.NameInMap("vSwitches")
    private java.util.List<VSwitches> vSwitches;

    @com.aliyun.core.annotation.NameInMap("vpcId")
    private String vpcId;

    private CacheCluster(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.createdAt = builder.createdAt;
        this.createdBy = builder.createdBy;
        this.deployInstanceVersion = builder.deployInstanceVersion;
        this.deployOptionsVersion = builder.deployOptionsVersion;
        this.instanceVersion = builder.instanceVersion;
        this.options = builder.options;
        this.optionsVersion = builder.optionsVersion;
        this.status = builder.status;
        this.updatedAt = builder.updatedAt;
        this.updatedBy = builder.updatedBy;
        this.vSwitches = builder.vSwitches;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CacheCluster create() {
        return builder().build();
    }

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
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return createdAt
     */
    public Long getCreatedAt() {
        return this.createdAt;
    }

    /**
     * @return createdBy
     */
    public String getCreatedBy() {
        return this.createdBy;
    }

    /**
     * @return deployInstanceVersion
     */
    public String getDeployInstanceVersion() {
        return this.deployInstanceVersion;
    }

    /**
     * @return deployOptionsVersion
     */
    public Long getDeployOptionsVersion() {
        return this.deployOptionsVersion;
    }

    /**
     * @return instanceVersion
     */
    public String getInstanceVersion() {
        return this.instanceVersion;
    }

    /**
     * @return options
     */
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    /**
     * @return optionsVersion
     */
    public Long getOptionsVersion() {
        return this.optionsVersion;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return updatedAt
     */
    public Long getUpdatedAt() {
        return this.updatedAt;
    }

    /**
     * @return updatedBy
     */
    public String getUpdatedBy() {
        return this.updatedBy;
    }

    /**
     * @return vSwitches
     */
    public java.util.List<VSwitches> getVSwitches() {
        return this.vSwitches;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder {
        private String clusterId; 
        private String clusterName; 
        private Long createdAt; 
        private String createdBy; 
        private String deployInstanceVersion; 
        private Long deployOptionsVersion; 
        private String instanceVersion; 
        private java.util.Map<String, String> options; 
        private Long optionsVersion; 
        private String status; 
        private Long updatedAt; 
        private String updatedBy; 
        private java.util.List<VSwitches> vSwitches; 
        private String vpcId; 

        private Builder() {
        } 

        private Builder(CacheCluster model) {
            this.clusterId = model.clusterId;
            this.clusterName = model.clusterName;
            this.createdAt = model.createdAt;
            this.createdBy = model.createdBy;
            this.deployInstanceVersion = model.deployInstanceVersion;
            this.deployOptionsVersion = model.deployOptionsVersion;
            this.instanceVersion = model.instanceVersion;
            this.options = model.options;
            this.optionsVersion = model.optionsVersion;
            this.status = model.status;
            this.updatedAt = model.updatedAt;
            this.updatedBy = model.updatedBy;
            this.vSwitches = model.vSwitches;
            this.vpcId = model.vpcId;
        } 

        /**
         * clusterId.
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * clusterName.
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * createdAt.
         */
        public Builder createdAt(Long createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        /**
         * createdBy.
         */
        public Builder createdBy(String createdBy) {
            this.createdBy = createdBy;
            return this;
        }

        /**
         * deployInstanceVersion.
         */
        public Builder deployInstanceVersion(String deployInstanceVersion) {
            this.deployInstanceVersion = deployInstanceVersion;
            return this;
        }

        /**
         * deployOptionsVersion.
         */
        public Builder deployOptionsVersion(Long deployOptionsVersion) {
            this.deployOptionsVersion = deployOptionsVersion;
            return this;
        }

        /**
         * instanceVersion.
         */
        public Builder instanceVersion(String instanceVersion) {
            this.instanceVersion = instanceVersion;
            return this;
        }

        /**
         * options.
         */
        public Builder options(java.util.Map<String, String> options) {
            this.options = options;
            return this;
        }

        /**
         * optionsVersion.
         */
        public Builder optionsVersion(Long optionsVersion) {
            this.optionsVersion = optionsVersion;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * updatedAt.
         */
        public Builder updatedAt(Long updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        /**
         * updatedBy.
         */
        public Builder updatedBy(String updatedBy) {
            this.updatedBy = updatedBy;
            return this;
        }

        /**
         * vSwitches.
         */
        public Builder vSwitches(java.util.List<VSwitches> vSwitches) {
            this.vSwitches = vSwitches;
            return this;
        }

        /**
         * vpcId.
         */
        public Builder vpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }

        public CacheCluster build() {
            return new CacheCluster(this);
        } 

    } 

    /**
     * 
     * {@link CacheCluster} extends {@link TeaModel}
     *
     * <p>CacheCluster</p>
     */
    public static class VSwitches extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("vSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("zone")
        private String zone;

        private VSwitches(Builder builder) {
            this.vSwitchId = builder.vSwitchId;
            this.zone = builder.zone;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VSwitches create() {
            return builder().build();
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return zone
         */
        public String getZone() {
            return this.zone;
        }

        public static final class Builder {
            private String vSwitchId; 
            private String zone; 

            private Builder() {
            } 

            private Builder(VSwitches model) {
                this.vSwitchId = model.vSwitchId;
                this.zone = model.zone;
            } 

            /**
             * vSwitchId.
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * zone.
             */
            public Builder zone(String zone) {
                this.zone = zone;
                return this;
            }

            public VSwitches build() {
                return new VSwitches(this);
            } 

        } 

    }
}
