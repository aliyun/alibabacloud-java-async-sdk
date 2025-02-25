// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExperimentResponseBody} extends {@link TeaModel}
 *
 * <p>GetExperimentResponseBody</p>
 */
public class GetExperimentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AliasExperimentId")
    private String aliasExperimentId;

    @com.aliyun.core.annotation.NameInMap("Buckets")
    private String buckets;

    @com.aliyun.core.annotation.NameInMap("Config")
    private String config;

    @com.aliyun.core.annotation.NameInMap("DebugCrowdId")
    private String debugCrowdId;

    @com.aliyun.core.annotation.NameInMap("DebugUsers")
    private String debugUsers;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("ExperimentGroupId")
    private String experimentGroupId;

    @com.aliyun.core.annotation.NameInMap("FlowPercent")
    private Integer flowPercent;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("LaboratoryId")
    private String laboratoryId;

    @com.aliyun.core.annotation.NameInMap("LayerId")
    private String layerId;

    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneId")
    private String sceneId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    private GetExperimentResponseBody(Builder builder) {
        this.aliasExperimentId = builder.aliasExperimentId;
        this.buckets = builder.buckets;
        this.config = builder.config;
        this.debugCrowdId = builder.debugCrowdId;
        this.debugUsers = builder.debugUsers;
        this.description = builder.description;
        this.experimentGroupId = builder.experimentGroupId;
        this.flowPercent = builder.flowPercent;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.laboratoryId = builder.laboratoryId;
        this.layerId = builder.layerId;
        this.name = builder.name;
        this.requestId = builder.requestId;
        this.sceneId = builder.sceneId;
        this.status = builder.status;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetExperimentResponseBody create() {
        return builder().build();
    }

    /**
     * @return aliasExperimentId
     */
    public String getAliasExperimentId() {
        return this.aliasExperimentId;
    }

    /**
     * @return buckets
     */
    public String getBuckets() {
        return this.buckets;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return debugCrowdId
     */
    public String getDebugCrowdId() {
        return this.debugCrowdId;
    }

    /**
     * @return debugUsers
     */
    public String getDebugUsers() {
        return this.debugUsers;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return experimentGroupId
     */
    public String getExperimentGroupId() {
        return this.experimentGroupId;
    }

    /**
     * @return flowPercent
     */
    public Integer getFlowPercent() {
        return this.flowPercent;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return laboratoryId
     */
    public String getLaboratoryId() {
        return this.laboratoryId;
    }

    /**
     * @return layerId
     */
    public String getLayerId() {
        return this.layerId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder {
        private String aliasExperimentId; 
        private String buckets; 
        private String config; 
        private String debugCrowdId; 
        private String debugUsers; 
        private String description; 
        private String experimentGroupId; 
        private Integer flowPercent; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private String laboratoryId; 
        private String layerId; 
        private String name; 
        private String requestId; 
        private String sceneId; 
        private String status; 
        private String type; 

        /**
         * AliasExperimentId.
         */
        public Builder aliasExperimentId(String aliasExperimentId) {
            this.aliasExperimentId = aliasExperimentId;
            return this;
        }

        /**
         * Buckets.
         */
        public Builder buckets(String buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * DebugCrowdId.
         */
        public Builder debugCrowdId(String debugCrowdId) {
            this.debugCrowdId = debugCrowdId;
            return this;
        }

        /**
         * DebugUsers.
         */
        public Builder debugUsers(String debugUsers) {
            this.debugUsers = debugUsers;
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
         * ExperimentGroupId.
         */
        public Builder experimentGroupId(String experimentGroupId) {
            this.experimentGroupId = experimentGroupId;
            return this;
        }

        /**
         * FlowPercent.
         */
        public Builder flowPercent(Integer flowPercent) {
            this.flowPercent = flowPercent;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * LaboratoryId.
         */
        public Builder laboratoryId(String laboratoryId) {
            this.laboratoryId = laboratoryId;
            return this;
        }

        /**
         * LayerId.
         */
        public Builder layerId(String layerId) {
            this.layerId = layerId;
            return this;
        }

        /**
         * Name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SceneId.
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        public GetExperimentResponseBody build() {
            return new GetExperimentResponseBody(this);
        } 

    } 

}
