// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ClusterSummary} extends {@link TeaModel}
 *
 * <p>ClusterSummary</p>
 */
public class ClusterSummary extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.NameInMap("ClusterName")
    private String clusterName;

    @com.aliyun.core.annotation.NameInMap("ClusterState")
    private String clusterState;

    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private Long createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("EmrDefaultRole")
    private String emrDefaultRole;

    @com.aliyun.core.annotation.NameInMap("EndTime")
    private Long endTime;

    @com.aliyun.core.annotation.NameInMap("ExpireTime")
    private Long expireTime;

    @com.aliyun.core.annotation.NameInMap("PaymentType")
    private String paymentType;

    @com.aliyun.core.annotation.NameInMap("ReadyTime")
    private Long readyTime;

    @com.aliyun.core.annotation.NameInMap("ReleaseVersion")
    private String releaseVersion;

    @com.aliyun.core.annotation.NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.NameInMap("StateChangeReason")
    private ClusterStateChangeReason stateChangeReason;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private java.util.List < Tag > tags;

    private ClusterSummary(Builder builder) {
        this.clusterId = builder.clusterId;
        this.clusterName = builder.clusterName;
        this.clusterState = builder.clusterState;
        this.clusterType = builder.clusterType;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.emrDefaultRole = builder.emrDefaultRole;
        this.endTime = builder.endTime;
        this.expireTime = builder.expireTime;
        this.paymentType = builder.paymentType;
        this.readyTime = builder.readyTime;
        this.releaseVersion = builder.releaseVersion;
        this.resourceGroupId = builder.resourceGroupId;
        this.stateChangeReason = builder.stateChangeReason;
        this.tags = builder.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ClusterSummary create() {
        return builder().build();
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
     * @return clusterState
     */
    public String getClusterState() {
        return this.clusterState;
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return createTime
     */
    public Long getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return emrDefaultRole
     */
    public String getEmrDefaultRole() {
        return this.emrDefaultRole;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return expireTime
     */
    public Long getExpireTime() {
        return this.expireTime;
    }

    /**
     * @return paymentType
     */
    public String getPaymentType() {
        return this.paymentType;
    }

    /**
     * @return readyTime
     */
    public Long getReadyTime() {
        return this.readyTime;
    }

    /**
     * @return releaseVersion
     */
    public String getReleaseVersion() {
        return this.releaseVersion;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return stateChangeReason
     */
    public ClusterStateChangeReason getStateChangeReason() {
        return this.stateChangeReason;
    }

    /**
     * @return tags
     */
    public java.util.List < Tag > getTags() {
        return this.tags;
    }

    public static final class Builder {
        private String clusterId; 
        private String clusterName; 
        private String clusterState; 
        private String clusterType; 
        private Long createTime; 
        private String description; 
        private String emrDefaultRole; 
        private Long endTime; 
        private Long expireTime; 
        private String paymentType; 
        private Long readyTime; 
        private String releaseVersion; 
        private String resourceGroupId; 
        private ClusterStateChangeReason stateChangeReason; 
        private java.util.List < Tag > tags; 

        /**
         * <p>集群ID。</p>
         * 
         * <strong>example:</strong>
         * <p>c-b933c5aac8fe****</p>
         */
        public Builder clusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>集群名称。</p>
         * 
         * <strong>example:</strong>
         * <p>emrtest</p>
         */
        public Builder clusterName(String clusterName) {
            this.clusterName = clusterName;
            return this;
        }

        /**
         * <p>集群状态。取值范围：</p>
         * <ul>
         * <li>STARTING：启动中。</li>
         * <li>START_FAILED：启动失败。</li>
         * <li>BOOTSTRAPPING：引导操作初始化。</li>
         * <li>RUNNING：运行中。</li>
         * <li>TERMINATING：终止中。</li>
         * <li>TERMINATED：已终止。</li>
         * <li>TERMINATED_WITH_ERRORS：发生异常导致终止。</li>
         * <li>TERMINATE_FAILED：终止失败。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        public Builder clusterState(String clusterState) {
            this.clusterState = clusterState;
            return this;
        }

        /**
         * <p>集群类型。取值范围：</p>
         * <ul>
         * <li>DATALAKE：新版数据湖。</li>
         * <li>OLAP：数据分析。</li>
         * <li>DATAFLOW：实时数据流。</li>
         * <li>DATASERVING：数据服务。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATALAKE</p>
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>创建时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1592837465784</p>
         */
        public Builder createTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>EMR服务角色。</p>
         */
        public Builder emrDefaultRole(String emrDefaultRole) {
            this.emrDefaultRole = emrDefaultRole;
            return this;
        }

        /**
         * <p>删除时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1592837465784</p>
         */
        public Builder endTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>过期时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1592837465784</p>
         */
        public Builder expireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }

        /**
         * <p>付费类型。取值范围：</p>
         * <ul>
         * <li>PayAsYouGo：后付费。</li>
         * <li>Subscription：预付费。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PayAsYouGo</p>
         */
        public Builder paymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }

        /**
         * <p>可用时间。</p>
         * 
         * <strong>example:</strong>
         * <p>1592837465784</p>
         */
        public Builder readyTime(Long readyTime) {
            this.readyTime = readyTime;
            return this;
        }

        /**
         * <p>EMR发行版。</p>
         * 
         * <strong>example:</strong>
         * <p>EMR-5.8.0</p>
         */
        public Builder releaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }

        /**
         * <p>资源组ID。</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmzabjyop****</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>失败原因。</p>
         */
        public Builder stateChangeReason(ClusterStateChangeReason stateChangeReason) {
            this.stateChangeReason = stateChangeReason;
            return this;
        }

        /**
         * <p>标签列表。</p>
         */
        public Builder tags(java.util.List < Tag > tags) {
            this.tags = tags;
            return this;
        }

        public ClusterSummary build() {
            return new ClusterSummary(this);
        } 

    } 

}
