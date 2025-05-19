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
 * {@link SyncFeatureConsistencyCheckJobReplayLogRequest} extends {@link RequestModel}
 *
 * <p>SyncFeatureConsistencyCheckJobReplayLogRequest</p>
 */
public class SyncFeatureConsistencyCheckJobReplayLogRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ContextFeatures")
    @com.aliyun.core.annotation.Validation(required = true)
    private String contextFeatures;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FeatureConsistencyCheckJobConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String featureConsistencyCheckJobConfigId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GeneratedFeatures")
    @com.aliyun.core.annotation.Validation(required = true)
    private String generatedFeatures;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

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
    @com.aliyun.core.annotation.NameInMap("RawFeatures")
    @com.aliyun.core.annotation.Validation(required = true)
    private String rawFeatures;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SceneName")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Value&quot;:{&quot;FloatFeature&quot;:0.1}}]</p>
         */
        public Builder contextFeatures(String contextFeatures) {
            this.putBodyParameter("ContextFeatures", contextFeatures);
            this.contextFeatures = contextFeatures;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder featureConsistencyCheckJobConfigId(String featureConsistencyCheckJobConfigId) {
            this.putBodyParameter("FeatureConsistencyCheckJobConfigId", featureConsistencyCheckJobConfigId);
            this.featureConsistencyCheckJobConfigId = featureConsistencyCheckJobConfigId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>week_day:1 | userid:3 | itemid:9001 | cate:cat1 | click_5_seq__cate:cat1</p>
         */
        public Builder generatedFeatures(String generatedFeatures) {
            this.putBodyParameter("GeneratedFeatures", generatedFeatures);
            this.generatedFeatures = generatedFeatures;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pairec-cn-********</p>
         */
        public Builder instanceId(String instanceId) {
            this.putBodyParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9010</p>
         */
        public Builder logItemId(String logItemId) {
            this.putBodyParameter("LogItemId", logItemId);
            this.logItemId = logItemId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>728C5E01-ABF6-5AA8-B9FC-B3BA05DECC77</p>
         */
        public Builder logRequestId(String logRequestId) {
            this.putBodyParameter("LogRequestId", logRequestId);
            this.logRequestId = logRequestId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1693900981465</p>
         */
        public Builder logRequestTime(Long logRequestTime) {
            this.putBodyParameter("LogRequestTime", logRequestTime);
            this.logRequestTime = logRequestTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1010</p>
         */
        public Builder logUserId(String logUserId) {
            this.putBodyParameter("LogUserId", logUserId);
            this.logUserId = logUserId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder rawFeatures(String rawFeatures) {
            this.putBodyParameter("RawFeatures", rawFeatures);
            this.rawFeatures = rawFeatures;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>video-feed</p>
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
