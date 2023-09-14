// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SyncFeatureConsistencyCheckJobReplayLogRequest} extends {@link RequestModel}
 *
 * <p>SyncFeatureConsistencyCheckJobReplayLogRequest</p>
 */
public class SyncFeatureConsistencyCheckJobReplayLogRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("ContextFeatures")
    @Validation(required = true)
    private String contextFeatures;

    @Body
    @NameInMap("FeatureConsistencyCheckJobConfigId")
    @Validation(required = true)
    private String featureConsistencyCheckJobConfigId;

    @Body
    @NameInMap("GeneratedFeatures")
    @Validation(required = true)
    private String generatedFeatures;

    @Body
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("LogItemId")
    @Validation(required = true)
    private String logItemId;

    @Body
    @NameInMap("LogRequestId")
    @Validation(required = true)
    private String logRequestId;

    @Body
    @NameInMap("LogRequestTime")
    @Validation(required = true)
    private Long logRequestTime;

    @Body
    @NameInMap("LogUserId")
    @Validation(required = true)
    private String logUserId;

    @Body
    @NameInMap("RawFeatures")
    @Validation(required = true)
    private String rawFeatures;

    @Body
    @NameInMap("SceneName")
    @Validation(required = true)
    private String sceneName;

    private SyncFeatureConsistencyCheckJobReplayLogRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contextFeatures = builder.contextFeatures;
        this.featureConsistencyCheckJobConfigId = builder.featureConsistencyCheckJobConfigId;
        this.generatedFeatures = builder.generatedFeatures;
        this.instanceId = builder.instanceId;
        this.logItemId = builder.logItemId;
        this.logRequestId = builder.logRequestId;
        this.logRequestTime = builder.logRequestTime;
        this.logUserId = builder.logUserId;
        this.rawFeatures = builder.rawFeatures;
        this.sceneName = builder.sceneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SyncFeatureConsistencyCheckJobReplayLogRequest create() {
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
     * @return contextFeatures
     */
    public String getContextFeatures() {
        return this.contextFeatures;
    }

    /**
     * @return featureConsistencyCheckJobConfigId
     */
    public String getFeatureConsistencyCheckJobConfigId() {
        return this.featureConsistencyCheckJobConfigId;
    }

    /**
     * @return generatedFeatures
     */
    public String getGeneratedFeatures() {
        return this.generatedFeatures;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
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
     * @return rawFeatures
     */
    public String getRawFeatures() {
        return this.rawFeatures;
    }

    /**
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    public static final class Builder extends Request.Builder<SyncFeatureConsistencyCheckJobReplayLogRequest, Builder> {
        private String regionId; 
        private String contextFeatures; 
        private String featureConsistencyCheckJobConfigId; 
        private String generatedFeatures; 
        private String instanceId; 
        private String logItemId; 
        private String logRequestId; 
        private Long logRequestTime; 
        private String logUserId; 
        private String rawFeatures; 
        private String sceneName; 

        private Builder() {
            super();
        } 

        private Builder(SyncFeatureConsistencyCheckJobReplayLogRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contextFeatures = request.contextFeatures;
            this.featureConsistencyCheckJobConfigId = request.featureConsistencyCheckJobConfigId;
            this.generatedFeatures = request.generatedFeatures;
            this.instanceId = request.instanceId;
            this.logItemId = request.logItemId;
            this.logRequestId = request.logRequestId;
            this.logRequestTime = request.logRequestTime;
            this.logUserId = request.logUserId;
            this.rawFeatures = request.rawFeatures;
            this.sceneName = request.sceneName;
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
         * ContextFeatures.
         */
        public Builder contextFeatures(String contextFeatures) {
            this.putBodyParameter("ContextFeatures", contextFeatures);
            this.contextFeatures = contextFeatures;
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
         * GeneratedFeatures.
         */
        public Builder generatedFeatures(String generatedFeatures) {
            this.putBodyParameter("GeneratedFeatures", generatedFeatures);
            this.generatedFeatures = generatedFeatures;
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
         * RawFeatures.
         */
        public Builder rawFeatures(String rawFeatures) {
            this.putBodyParameter("RawFeatures", rawFeatures);
            this.rawFeatures = rawFeatures;
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

        @Override
        public SyncFeatureConsistencyCheckJobReplayLogRequest build() {
            return new SyncFeatureConsistencyCheckJobReplayLogRequest(this);
        } 

    } 

}
