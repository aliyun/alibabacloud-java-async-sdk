// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link SmartCluster} extends {@link TeaModel}
 *
 * <p>SmartCluster</p>
 */
public class SmartCluster extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterType")
    private String clusterType;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("ObjectId")
    private String objectId;

    @com.aliyun.core.annotation.NameInMap("ObjectStatus")
    private String objectStatus;

    @com.aliyun.core.annotation.NameInMap("ObjectType")
    private String objectType;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("ProjectName")
    private String projectName;

    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.NameInMap("Rule")
    private SmartClusterRule rule;

    @com.aliyun.core.annotation.NameInMap("Rules")
    private java.util.List<SmartClusterRule> rules;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    private SmartCluster(Builder builder) {
        this.clusterType = builder.clusterType;
        this.createTime = builder.createTime;
        this.datasetName = builder.datasetName;
        this.description = builder.description;
        this.name = builder.name;
        this.objectId = builder.objectId;
        this.objectStatus = builder.objectStatus;
        this.objectType = builder.objectType;
        this.ownerId = builder.ownerId;
        this.projectName = builder.projectName;
        this.reason = builder.reason;
        this.rule = builder.rule;
        this.rules = builder.rules;
        this.updateTime = builder.updateTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartCluster create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return objectId
     */
    public String getObjectId() {
        return this.objectId;
    }

    /**
     * @return objectStatus
     */
    public String getObjectStatus() {
        return this.objectStatus;
    }

    /**
     * @return objectType
     */
    public String getObjectType() {
        return this.objectType;
    }

    /**
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return rule
     */
    public SmartClusterRule getRule() {
        return this.rule;
    }

    /**
     * @return rules
     */
    public java.util.List<SmartClusterRule> getRules() {
        return this.rules;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    public static final class Builder {
        private String clusterType; 
        private String createTime; 
        private String datasetName; 
        private String description; 
        private String name; 
        private String objectId; 
        private String objectStatus; 
        private String objectType; 
        private String ownerId; 
        private String projectName; 
        private String reason; 
        private SmartClusterRule rule; 
        private java.util.List<SmartClusterRule> rules; 
        private String updateTime; 

        private Builder() {
        } 

        private Builder(SmartCluster model) {
            this.clusterType = model.clusterType;
            this.createTime = model.createTime;
            this.datasetName = model.datasetName;
            this.description = model.description;
            this.name = model.name;
            this.objectId = model.objectId;
            this.objectStatus = model.objectStatus;
            this.objectType = model.objectType;
            this.ownerId = model.ownerId;
            this.projectName = model.projectName;
            this.reason = model.reason;
            this.rule = model.rule;
            this.rules = model.rules;
            this.updateTime = model.updateTime;
        } 

        /**
         * <p>The category of the grouping.</p>
         * 
         * <strong>example:</strong>
         * <p>figure</p>
         */
        public Builder clusterType(String clusterType) {
            this.clusterType = clusterType;
            return this;
        }

        /**
         * <p>The time when the grouping was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-14T10:17:18.102700407+08:00</p>
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * <p>The dataset name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyDataset</p>
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * <p>The description of the grouping.</p>
         * 
         * <strong>example:</strong>
         * <p>这是一个智能分组的描述示例，它用于展示记录的格式。</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The grouping name.</p>
         * 
         * <strong>example:</strong>
         * <p>MySmartCluster1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The intelligent grouping ID.</p>
         * 
         * <strong>example:</strong>
         * <p>SmartCluster-12cd1645-deae-4b5e-9434-613747b75f6d</p>
         */
        public Builder objectId(String objectId) {
            this.objectId = objectId;
            return this;
        }

        /**
         * <p>The status of the grouping.</p>
         * 
         * <strong>example:</strong>
         * <p>Succeeded</p>
         */
        public Builder objectStatus(String objectStatus) {
            this.objectStatus = objectStatus;
            return this;
        }

        /**
         * <p>The grouping type.</p>
         * 
         * <strong>example:</strong>
         * <p>smart-cluster</p>
         */
        public Builder objectType(String objectType) {
            this.objectType = objectType;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1023210024677934</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The project name.</p>
         * 
         * <strong>example:</strong>
         * <p>MyProject</p>
         */
        public Builder projectName(String projectName) {
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The reason why the grouping failed.</p>
         * 
         * <strong>example:</strong>
         * <p>[InvalidArgument.BaseURIs] Each BaseURI must contain exactly one figure</p>
         */
        public Builder reason(String reason) {
            this.reason = reason;
            return this;
        }

        /**
         * <p>The grouping rule. This parameter is deprecated. Use the Rules parameter instead.</p>
         */
        public Builder rule(SmartClusterRule rule) {
            this.rule = rule;
            return this;
        }

        /**
         * <p>The list of grouping rules.</p>
         */
        public Builder rules(java.util.List<SmartClusterRule> rules) {
            this.rules = rules;
            return this;
        }

        /**
         * <p>The time when the grouping was last updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-14T10:17:18.102700407+08:00</p>
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        public SmartCluster build() {
            return new SmartCluster(this);
        } 

    } 

}
