// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

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
 * {@link SpotBidPreviewItem} extends {@link TeaModel}
 *
 * <p>SpotBidPreviewItem</p>
 */
public class SpotBidPreviewItem extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("active")
    private Boolean active;

    @com.aliyun.core.annotation.NameInMap("allowCrossHpnZone")
    private Boolean allowCrossHpnZone;

    @com.aliyun.core.annotation.NameInMap("clusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("gcLevel")
    private String gcLevel;

    @com.aliyun.core.annotation.NameInMap("instanceType")
    private String instanceType;

    @com.aliyun.core.annotation.NameInMap("jobName")
    private String jobName;

    @com.aliyun.core.annotation.NameInMap("maxDiscount")
    private Double maxDiscount;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("phase")
    private String phase;

    @com.aliyun.core.annotation.NameInMap("replicas")
    private Integer replicas;

    private SpotBidPreviewItem(Builder builder) {
        this.active = builder.active;
        this.allowCrossHpnZone = builder.allowCrossHpnZone;
        this.clusterId = builder.clusterId;
        this.gcLevel = builder.gcLevel;
        this.instanceType = builder.instanceType;
        this.jobName = builder.jobName;
        this.maxDiscount = builder.maxDiscount;
        this.message = builder.message;
        this.name = builder.name;
        this.phase = builder.phase;
        this.replicas = builder.replicas;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SpotBidPreviewItem create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return active
     */
    public Boolean getActive() {
        return this.active;
    }

    /**
     * @return allowCrossHpnZone
     */
    public Boolean getAllowCrossHpnZone() {
        return this.allowCrossHpnZone;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return gcLevel
     */
    public String getGcLevel() {
        return this.gcLevel;
    }

    /**
     * @return instanceType
     */
    public String getInstanceType() {
        return this.instanceType;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return maxDiscount
     */
    public Double getMaxDiscount() {
        return this.maxDiscount;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return replicas
     */
    public Integer getReplicas() {
        return this.replicas;
    }

    public static final class Builder {
        private Boolean active; 
        private Boolean allowCrossHpnZone; 
        private String clusterId; 
        private String gcLevel; 
        private String instanceType; 
        private String jobName; 
        private Double maxDiscount; 
        private String message; 
        private String name; 
        private String phase; 
        private Integer replicas; 

        private Builder() {
        } 

        private Builder(SpotBidPreviewItem model) {
            this.active = model.active;
            this.allowCrossHpnZone = model.allowCrossHpnZone;
            this.clusterId = model.clusterId;
            this.gcLevel = model.gcLevel;
            this.instanceType = model.instanceType;
            this.jobName = model.jobName;
            this.maxDiscount = model.maxDiscount;
            this.message = model.message;
            this.name = model.name;
            this.phase = model.phase;
            this.replicas = model.replicas;
        } 

        /**
         * <p>Indicates whether the spot bid is active. If set to <code>false</code>, the bid is paused.</p>
         */
        public Builder active(Boolean active) {
            this.active = active;
            return this;
        }

        /**
         * <p>Determines whether instances can be deployed across different High-Performance Network (HPN) zones. Defaults to <code>false</code>.</p>
         */
        public Builder allowCrossHpnZone(Boolean allowCrossHpnZone) {
            this.allowCrossHpnZone = allowCrossHpnZone;
            return this;
        }

        /**
         * <p>The ID of the cluster where resources are provisioned.</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>The GC level for the spot instance.</p>
         */
        public Builder gcLevel(String gcLevel) {
            this.gcLevel = gcLevel;
            return this;
        }

        /**
         * <p>The type of compute instance.</p>
         */
        public Builder instanceType(String instanceType) {
            this.instanceType = instanceType;
            return this;
        }

        /**
         * <p>The name of the associated job.</p>
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The maximum discount percentage from the on-demand price.</p>
         */
        public Builder maxDiscount(Double maxDiscount) {
            this.maxDiscount = maxDiscount;
            return this;
        }

        /**
         * <p>A message that provides additional details about the current phase.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The name of the spot bid preview.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The current phase of the spot bid preview. Valid values are <code>Pending</code>, <code>Active</code>, and <code>Failed</code>.</p>
         */
        public Builder phase(String phase) {
            this.phase = phase;
            return this;
        }

        /**
         * <p>The number of instance replicas.</p>
         */
        public Builder replicas(Integer replicas) {
            this.replicas = replicas;
            return this;
        }

        public SpotBidPreviewItem build() {
            return new SpotBidPreviewItem(this);
        } 

    } 

}
