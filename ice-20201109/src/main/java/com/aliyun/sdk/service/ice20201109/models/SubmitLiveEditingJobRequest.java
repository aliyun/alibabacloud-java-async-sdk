// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
         * <p>The list of clip segments. The output is produced by concatenating the segments in the list in order. JSON Array.</p>
         * <p>Each segment contains a start time and an end time. If no live stream parameters are specified, the outer-level live stream configuration is used. Both start and end timestamps are in UTC. For parameter details, see the Clip data structure below.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;StartTime\&quot;: \&quot; 2021-06-21T08:01:00Z\&quot;,  \&quot;EndTime\&quot;: \&quot; 2021-06-21T08:03:00Z\&quot; ,  &quot;AppName&quot;: &quot;app&quot;, &quot;DomainName&quot;: &quot;domain.com&quot;, &quot;StreamName&quot;: &quot;stream&quot;},  {\&quot;StartTime\&quot;: \&quot; 2021-06-21T08:05:00Z\&quot;,  \&quot;EndTime\&quot;: \&quot; 2021-06-21T08:09:00Z\&quot; }]</p>
         */
        public Builder clips(String clips) {
            this.putQueryParameter("Clips", clips);
            this.clips = clips;
            return this;
        }

        /**
         * <p>The live stream configuration. JSON Object. The following configuration items are required:</p>
         * <ul>
         * <li><p>AppName: the name of the application to which the stream belongs. </p>
         * </li>
         * <li><p>DomainName: the domain name.</p>
         * </li>
         * <li><p>StreamName: the name of the live stream.</p>
         * </li>
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
         * <p>The composition configuration for generating segments, in JSON format. Mode specifies the editing mode. Valid values:</p>
         * <ul>
         * <li><strong>AccurateFast</strong> (default): fast accurate editing. This mode is faster than the Accurate mode. The output file resolution is the same as the source stream resolution. Custom output width and height are not supported.</li>
         * <li><strong>Accurate</strong>: accurate editing. You can specify the output width and height.</li>
         * <li><strong>Rough</strong>: rough editing. The minimum precision is one TS segment. The output contains all segments within the specified start and end time. You can specify the output width and height.</li>
         * <li><strong>RoughFast</strong>: fast rough editing. This mode is faster than the Accurate mode. The minimum precision is one TS segment. The output contains all segments within the specified start and end time. The output file resolution is the same as the source stream resolution. Custom output width and height are not supported.</li>
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
         * <p>The destination configuration for the output. JSON Object. You can specify the URL of the output on OSS or the storage location in a VOD bucket.</p>
         * <ul>
         * <li>When outputting to OSS, the MediaURL of the output destination is required.</li>
         * <li>When outputting to VOD, the StorageLocation and FileName parameters are required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;MediaURL&quot;: &quot;<a href="https://ice-auto-test.oss-cn-shanghai.aliyuncs.com/testfile.mp4">https://ice-auto-test.oss-cn-shanghai.aliyuncs.com/testfile.mp4</a>&quot; }, or { &quot;StorageLocation&quot;: &quot;bucket.oss-cn-shanghai.aliyuncs.com&quot;, &quot;FileName&quot;: &quot;output.mp4&quot; }</p>
         */
        public Builder outputMediaConfig(String outputMediaConfig) {
            this.putQueryParameter("OutputMediaConfig", outputMediaConfig);
            this.outputMediaConfig = outputMediaConfig;
            return this;
        }

        /**
         * <p>The target type of the output. Valid values:</p>
         * <ul>
         * <li>oss-object: an OSS object in an Alibaba Cloud OSS bucket.</li>
         * <li>vod-media: a media asset in Alibaba Cloud VOD.</li>
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
         * <p>The ID of the live editing project. If this parameter is not empty, the storage configuration associated with the project is used. If this parameter is empty, the storage configuration specified in the request parameters is used.</p>
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
         * <p>The custom settings. JSON Object. Maximum length: 512 bytes.</p>
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
