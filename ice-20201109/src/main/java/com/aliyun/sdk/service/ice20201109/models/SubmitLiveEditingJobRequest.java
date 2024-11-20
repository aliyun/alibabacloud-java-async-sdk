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
         * <p>The clips in the JSON array format. The output video is created by merging these clips sequentially.</p>
         * <p>Each clip has a start time and an end time. If no live stream parameters are specified, the outer live stream configurations apply. The start and end timestamps are in UTC. For more information about the parameters, see the &quot;Clip&quot; section of this topic.</p>
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
         * <p>The live stream configurations, in the JSON format. The configurations must include the following parameters:</p>
         * <ul>
         * <li>AppName: the name of the application to which the live stream belongs.</li>
         * <li>DomainName: the domain name of the application.</li>
         * <li>StreamName: the name of the live stream.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;AppName&quot;: &quot;app&quot;, &quot;DomainName&quot;: &quot;domain.com&quot;, &quot;StreamName&quot;: &quot;stream&quot;  }</p>
         */
        public Builder liveStreamConfig(String liveStreamConfig) {
            this.putQueryParameter("LiveStreamConfig", liveStreamConfig);
            this.liveStreamConfig = liveStreamConfig;
            return this;
        }

        /**
         * <p>The production configurations, in the JSON format. Mode specifies the editing mode. Valid values:</p>
         * <ul>
         * <li><strong>AccurateFast</strong> (default): fast editing. It is faster than the Accurate mode. The resolution of the output file is the same as that of the source stream. You cannot specify the width and height of the output file.</li>
         * <li><strong>Accurate</strong>: accurate editing. In this mode, you can specify the width and height of the output file.</li>
         * <li><strong>Rough</strong>: rough editing. The minimum precision is one TS segment. The output file comprises all segments within the specified time range. You can specify the width and height of the output file.</li>
         * <li><strong>RoughFast</strong>: fast rough editing. It is faster than the Accurate mode. The minimum precision is one TS segment. The output file comprises all segments within the specified time range. The resolution of the output file is the same as that of the source stream. You cannot specify the width and height of the output file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;Mode&quot;: &quot;AccurateFast&quot;}</p>
         */
        public Builder mediaProduceConfig(String mediaProduceConfig) {
            this.putQueryParameter("MediaProduceConfig", mediaProduceConfig);
            this.mediaProduceConfig = mediaProduceConfig;
            return this;
        }

        /**
         * <p>The configurations of the output file, in the JSON format. You can specify an OSS URL or a storage location in a storage bucket of ApsaraVideo VOD.</p>
         * <ul>
         * <li>To store the output file in OSS, you must specify MediaURL.</li>
         * <li>To store the output file in ApsaraVideo VOD, you must specify StorageLocation and FileName.</li>
         * </ul>
         */
        public Builder outputMediaConfig(String outputMediaConfig) {
            this.putQueryParameter("OutputMediaConfig", outputMediaConfig);
            this.outputMediaConfig = outputMediaConfig;
            return this;
        }

        /**
         * <p>The type of the output file. Valid values:</p>
         * <ul>
         * <li>oss-object: OSS object in an OSS bucket.</li>
         * <li>vod-media: media asset in Alibaba Cloud VOD.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss-object</p>
         */
        public Builder outputMediaTarget(String outputMediaTarget) {
            this.putQueryParameter("OutputMediaTarget", outputMediaTarget);
            this.outputMediaTarget = outputMediaTarget;
            return this;
        }

        /**
         * <p>The ID of the live editing project. If this parameter is specified, the system reads the storage configurations of the project. If this parameter is not specified, the specified storage configurations take precedence.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
            return this;
        }

        /**
         * <p>The user-defined data in the JSON format, which can be up to 512 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;: &quot;value&quot;}</p>
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
