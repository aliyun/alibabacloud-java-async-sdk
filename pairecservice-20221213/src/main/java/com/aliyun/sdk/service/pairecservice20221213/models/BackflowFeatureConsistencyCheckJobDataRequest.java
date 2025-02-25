// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BackflowFeatureConsistencyCheckJobDataRequest} extends {@link RequestModel}
 *
 * <p>BackflowFeatureConsistencyCheckJobDataRequest</p>
 */
public class BackflowFeatureConsistencyCheckJobDataRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureConsistencyCheckJobConfigId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ItemFeatures")
    @com.aliyun.core.annotation.Validation(required = true)
    private String itemFeatures;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogItemId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logItemId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogRequestId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logRequestId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogRequestTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long logRequestTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogUserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String logUserId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Scores")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scores;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UserFeatures")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userFeatures;

    private BackflowFeatureConsistencyCheckJobDataRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.featureConsistencyCheckJobConfigId = builder.featureConsistencyCheckJobConfigId;
        this.instanceId = builder.instanceId;
        this.itemFeatures = builder.itemFeatures;
        this.logItemId = builder.logItemId;
        this.logRequestId = builder.logRequestId;
        this.logRequestTime = builder.logRequestTime;
        this.logUserId = builder.logUserId;
        this.sceneName = builder.sceneName;
        this.scores = builder.scores;
        this.userFeatures = builder.userFeatures;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BackflowFeatureConsistencyCheckJobDataRequest create() {
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
     * @return featureConsistencyCheckJobConfigId
     */
    public String getFeatureConsistencyCheckJobConfigId() {
        return this.featureConsistencyCheckJobConfigId;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return itemFeatures
     */
    public String getItemFeatures() {
        return this.itemFeatures;
    }

    /**
     * @return logItemId
     */
    public String getLogItemId() {
        return this.logItemId;
    }

    /**
     * @return logRequestId
     */
    public String getLogRequestId() {
        return this.logRequestId;
    }

    /**
     * @return logRequestTime
     */
    public Long getLogRequestTime() {
        return this.logRequestTime;
    }

    /**
     * @return logUserId
     */
    public String getLogUserId() {
        return this.logUserId;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    /**
     * @return scores
     */
    public String getScores() {
        return this.scores;
    }

    /**
     * @return userFeatures
     */
    public String getUserFeatures() {
        return this.userFeatures;
    }

    public static final class Builder extends Request.Builder<BackflowFeatureConsistencyCheckJobDataRequest, Builder> {
        private String regionId; 
        private String featureConsistencyCheckJobConfigId; 
        private String instanceId; 
        private String itemFeatures; 
        private String logItemId; 
        private String logRequestId; 
        private Long logRequestTime; 
        private String logUserId; 
        private String sceneName; 
        private String scores; 
        private String userFeatures; 

        private Builder() {
            super();
        } 

        private Builder(BackflowFeatureConsistencyCheckJobDataRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.featureConsistencyCheckJobConfigId = request.featureConsistencyCheckJobConfigId;
            this.instanceId = request.instanceId;
            this.itemFeatures = request.itemFeatures;
            this.logItemId = request.logItemId;
            this.logRequestId = request.logRequestId;
            this.logRequestTime = request.logRequestTime;
            this.logUserId = request.logUserId;
            this.sceneName = request.sceneName;
            this.scores = request.scores;
            this.userFeatures = request.userFeatures;
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
         * FeatureConsistencyCheckJobConfigId.
         */
        public Builder featureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
            this.putBodyParameter("FeatureConsistencyCheckJobConfigId", featureConsistencyCheckJobConfigId);
            this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * ItemFeatures.
         */
        public Builder itemFeatures(String itemFeatures) {
            this.putBodyParameter("ItemFeatures", itemFeatures);
            this.itemFeatures = itemFeatures;
            return this;
        }

        /**
         * LogItemId.
         */
        public Builder logItemId(String logItemId) {
            this.putBodyParameter("LogItemId", logItemId);
            this.logItemId = logItemId;
            return this;
        }

        /**
         * LogRequestId.
         */
        public Builder logRequestId(String logRequestId) {
            this.putBodyParameter("LogRequestId", logRequestId);
            this.logRequestId = logRequestId;
            return this;
        }

        /**
         * LogRequestTime.
         */
        public Builder logRequestTime(Long logRequestTime) {
            this.putBodyParameter("LogRequestTime", logRequestTime);
            this.logRequestTime = logRequestTime;
            return this;
        }

        /**
         * LogUserId.
         */
        public Builder logUserId(String logUserId) {
            this.putBodyParameter("LogUserId", logUserId);
            this.logUserId = logUserId;
            return this;
        }

        /**
         * SceneName.
         */
        public Builder sceneName(String sceneName) {
            this.putBodyParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        /**
         * Scores.
         */
        public Builder scores(String scores) {
            this.putBodyParameter("Scores", scores);
            this.scores = scores;
            return this;
        }

        /**
         * UserFeatures.
         */
        public Builder userFeatures(String userFeatures) {
            this.putBodyParameter("UserFeatures", userFeatures);
            this.userFeatures = userFeatures;
            return this;
        }

        @Override
        public BackflowFeatureConsistencyCheckJobDataRequest build() {
            return new BackflowFeatureConsistencyCheckJobDataRequest(this);
        } 

    } 

}
