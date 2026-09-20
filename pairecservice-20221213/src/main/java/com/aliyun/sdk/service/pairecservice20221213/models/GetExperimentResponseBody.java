// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetExperimentResponseBody model) {
            this.aliasExperimentId = model.aliasExperimentId;
            this.buckets = model.buckets;
            this.config = model.config;
            this.debugCrowdId = model.debugCrowdId;
            this.debugUsers = model.debugUsers;
            this.description = model.description;
            this.experimentGroupId = model.experimentGroupId;
            this.flowPercent = model.flowPercent;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.laboratoryId = model.laboratoryId;
            this.layerId = model.layerId;
            this.name = model.name;
            this.requestId = model.requestId;
            this.sceneId = model.sceneId;
            this.status = model.status;
            this.type = model.type;
        } 

        /**
         * <p>The alias of the experiment.</p>
         * 
         * <strong>example:</strong>
         * <p>L1#EG1#E1</p>
         */
        public Builder aliasExperimentId(String aliasExperimentId) {
            this.aliasExperimentId = aliasExperimentId;
            return this;
        }

        /**
         * <p>A comma-separated list of bucket numbers.</p>
         * 
         * <strong>example:</strong>
         * <p>1,2,3</p>
         */
        public Builder buckets(String buckets) {
            this.buckets = buckets;
            return this;
        }

        /**
         * <p>The experiment configuration, in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;RankBy&quot;: &quot;Score&quot;}</p>
         */
        public Builder config(String config) {
            this.config = config;
            return this;
        }

        /**
         * <p>The debug crowd ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder debugCrowdId(String debugCrowdId) {
            this.debugCrowdId = debugCrowdId;
            return this;
        }

        /**
         * <p>The UIDs of debug users, which can be the UIDs of an Alibaba Cloud main account or a RAM user. Separate multiple UIDs with a comma (,).</p>
         * 
         * <strong>example:</strong>
         * <p>1124512470******,1124512471******,1124512472******</p>
         */
        public Builder debugUsers(String debugUsers) {
            this.debugUsers = debugUsers;
            return this;
        }

        /**
         * <p>The experiment description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is a test.</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The experiment group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder experimentGroupId(String experimentGroupId) {
            this.experimentGroupId = experimentGroupId;
            return this;
        }

        /**
         * <p>The traffic percentage.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder flowPercent(Integer flowPercent) {
            this.flowPercent = flowPercent;
            return this;
        }

        /**
         * <p>The creation time, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The modification time, in ISO 8601 format.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-15T23:24:33.132+08:00</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The laboratory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder laboratoryId(String laboratoryId) {
            this.laboratoryId = laboratoryId;
            return this;
        }

        /**
         * <p>The layer ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder layerId(String layerId) {
            this.layerId = layerId;
            return this;
        }

        /**
         * <p>The experiment name.</p>
         * 
         * <strong>example:</strong>
         * <p>experiment_test1</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>74D958EF-3598-56FA-8296-FF1575CE43DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The scene ID.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder sceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }

        /**
         * <p>The status of the experiment. Valid values:<br>● Offline<br>● Online<br><br></p>
         * 
         * <strong>example:</strong>
         * <p>Offline</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The type of the experiment. Valid values:<br>● Baseline: a baseline experiment.<br>● Normal: a normal experiment.<br><br></p>
         * 
         * <strong>example:</strong>
         * <p>Baseline</p>
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
