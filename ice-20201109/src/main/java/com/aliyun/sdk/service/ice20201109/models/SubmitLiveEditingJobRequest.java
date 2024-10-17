// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link SubmitLiveEditingJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitLiveEditingJobRequest</p>
 */
public class SubmitLiveEditingJobRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Clips")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clips;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LiveStreamConfig")
    private String liveStreamConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaProduceConfig")
    private String mediaProduceConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputMediaConfig")
    private String outputMediaConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputMediaTarget")
    private String outputMediaTarget;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProjectId")
    private String projectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private SubmitLiveEditingJobRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clips = builder.clips;
        this.liveStreamConfig = builder.liveStreamConfig;
        this.mediaProduceConfig = builder.mediaProduceConfig;
        this.outputMediaConfig = builder.outputMediaConfig;
        this.outputMediaTarget = builder.outputMediaTarget;
        this.projectId = builder.projectId;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitLiveEditingJobRequest create() {
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
     * @return clips
     */
    public String getClips() {
        return this.clips;
    }

    /**
     * @return liveStreamConfig
     */
    public String getLiveStreamConfig() {
        return this.liveStreamConfig;
    }

    /**
     * @return mediaProduceConfig
     */
    public String getMediaProduceConfig() {
        return this.mediaProduceConfig;
    }

    /**
     * @return outputMediaConfig
     */
    public String getOutputMediaConfig() {
        return this.outputMediaConfig;
    }

    /**
     * @return outputMediaTarget
     */
    public String getOutputMediaTarget() {
        return this.outputMediaTarget;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder extends Request.Builder<SubmitLiveEditingJobRequest, Builder> {
        private String regionId; 
        private String clips; 
        private String liveStreamConfig; 
        private String mediaProduceConfig; 
        private String outputMediaConfig; 
        private String outputMediaTarget; 
        private String projectId; 
        private String userData; 

        private Builder() {
            super();
        } 

        private Builder(SubmitLiveEditingJobRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clips = request.clips;
            this.liveStreamConfig = request.liveStreamConfig;
            this.mediaProduceConfig = request.mediaProduceConfig;
            this.outputMediaConfig = request.outputMediaConfig;
            this.outputMediaTarget = request.outputMediaTarget;
            this.projectId = request.projectId;
            this.userData = request.userData;
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
         * <p>[{&quot;StartTime&quot;: &quot; 2021-06-21T08:01:00Z&quot;,  &quot;EndTime&quot;: &quot; 2021-06-21T08:03:00Z&quot; ,  &quot;AppName&quot;: &quot;app&quot;, &quot;DomainName&quot;: &quot;domain.com&quot;, &quot;StreamName&quot;: &quot;stream&quot;},  {&quot;StartTime&quot;: &quot; 2021-06-21T08:05:00Z&quot;,  &quot;EndTime&quot;: &quot; 2021-06-21T08:09:00Z&quot; }]</p>
         */
        public Builder clips(String clips) {
            this.putQueryParameter("Clips", clips);
            this.clips = clips;
            return this;
        }

        /**
         * LiveStreamConfig.
         */
        public Builder liveStreamConfig(String liveStreamConfig) {
            this.putQueryParameter("LiveStreamConfig", liveStreamConfig);
            this.liveStreamConfig = liveStreamConfig;
            return this;
        }

        /**
         * MediaProduceConfig.
         */
        public Builder mediaProduceConfig(String mediaProduceConfig) {
            this.putQueryParameter("MediaProduceConfig", mediaProduceConfig);
            this.mediaProduceConfig = mediaProduceConfig;
            return this;
        }

        /**
         * OutputMediaConfig.
         */
        public Builder outputMediaConfig(String outputMediaConfig) {
            this.putQueryParameter("OutputMediaConfig", outputMediaConfig);
            this.outputMediaConfig = outputMediaConfig;
            return this;
        }

        /**
         * OutputMediaTarget.
         */
        public Builder outputMediaTarget(String outputMediaTarget) {
            this.putQueryParameter("OutputMediaTarget", outputMediaTarget);
            this.outputMediaTarget = outputMediaTarget;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * UserData.
         */
        public Builder userData(String userData) {
            this.putQueryParameter("UserData", userData);
            this.userData = userData;
            return this;
        }

        @Override
        public SubmitLiveEditingJobRequest build() {
            return new SubmitLiveEditingJobRequest(this);
        } 

    } 

}
