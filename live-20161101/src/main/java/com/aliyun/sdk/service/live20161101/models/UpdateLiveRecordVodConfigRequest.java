// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

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
 * {@link UpdateLiveRecordVodConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveRecordVodConfigRequest</p>
 */
public class UpdateLiveRecordVodConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AutoCompose")
    private String autoCompose;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ComposeVodTranscodeGroupId")
    private String composeVodTranscodeGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CycleDuration")
    @com.aliyun.core.annotation.Validation(maximum = 21600, minimum = 300)
    private Integer cycleDuration;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OnDemand")
    private Integer onDemand;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VodTranscodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vodTranscodeGroupId;

    private UpdateLiveRecordVodConfigRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.autoCompose = builder.autoCompose;
        this.composeVodTranscodeGroupId = builder.composeVodTranscodeGroupId;
        this.cycleDuration = builder.cycleDuration;
        this.domainName = builder.domainName;
        this.onDemand = builder.onDemand;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.streamName = builder.streamName;
        this.vodTranscodeGroupId = builder.vodTranscodeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveRecordVodConfigRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return autoCompose
     */
    public String getAutoCompose() {
        return this.autoCompose;
    }

    /**
     * @return composeVodTranscodeGroupId
     */
    public String getComposeVodTranscodeGroupId() {
        return this.composeVodTranscodeGroupId;
    }

    /**
     * @return cycleDuration
     */
    public Integer getCycleDuration() {
        return this.cycleDuration;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return onDemand
     */
    public Integer getOnDemand() {
        return this.onDemand;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return vodTranscodeGroupId
     */
    public String getVodTranscodeGroupId() {
        return this.vodTranscodeGroupId;
    }

    public static final class Builder extends Request.Builder<UpdateLiveRecordVodConfigRequest, Builder> {
        private String appName; 
        private String autoCompose; 
        private String composeVodTranscodeGroupId; 
        private Integer cycleDuration; 
        private String domainName; 
        private Integer onDemand; 
        private Long ownerId; 
        private String regionId; 
        private String streamName; 
        private String vodTranscodeGroupId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveRecordVodConfigRequest request) {
            super(request);
            this.appName = request.appName;
            this.autoCompose = request.autoCompose;
            this.composeVodTranscodeGroupId = request.composeVodTranscodeGroupId;
            this.cycleDuration = request.cycleDuration;
            this.domainName = request.domainName;
            this.onDemand = request.onDemand;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.streamName = request.streamName;
            this.vodTranscodeGroupId = request.vodTranscodeGroupId;
        } 

        /**
         * <p>The name of the application to which the live stream belongs. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>Specifies whether to enable automatic merging. Valid values:</p>
         * <ul>
         * <li><strong>ON</strong>: enables automatic merging. If you set this parameter to ON, you must also specify the ComposeVodTranscodeGroupId parameter.</li>
         * <li><strong>OFF</strong>: disables automatic merging.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OFF</p>
         */
        public Builder autoCompose(String autoCompose) {
            this.putQueryParameter("AutoCompose", autoCompose);
            this.autoCompose = autoCompose;
            return this;
        }

        /**
         * <p>The ID of the transcoding template group in ApsaraVideo VOD that is used to transcode the video file. The video file is generated by merging the VOD files created from live streams.</p>
         * <blockquote>
         * <p> To query transcoding template groups, call the <a href="https://help.aliyun.com/document_detail/454928.html">ListTranscodeTemplateGroup</a> operation.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <hr>
         */
        public Builder composeVodTranscodeGroupId(String composeVodTranscodeGroupId) {
            this.putQueryParameter("ComposeVodTranscodeGroupId", composeVodTranscodeGroupId);
            this.composeVodTranscodeGroupId = composeVodTranscodeGroupId;
            return this;
        }

        /**
         * <p>The recording cycle. Unit: seconds. Valid values: <strong>300 to 21600</strong>. Default value: <strong>3600</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        public Builder cycleDuration(Integer cycleDuration) {
            this.putQueryParameter("CycleDuration", cycleDuration);
            this.cycleDuration = cycleDuration;
            return this;
        }

        /**
         * <p>The main streaming domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Specifies whether to enable on-demand recording. Valid values:</p>
         * <ul>
         * <li><strong>0</strong> (default): disables on-demand recording.</li>
         * <li><strong>1</strong>: enables on-demand recording by using the HTTP callback method.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder onDemand(Integer onDemand) {
            this.putQueryParameter("OnDemand", onDemand);
            this.onDemand = onDemand;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The name of the live stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
         * 
         * <strong>example:</strong>
         * <p>stream</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * <p>The ID of the transcoding template group in ApsaraVideo VOD.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>e2d796d3bb5fd8049d32bff62f94****</p>
         */
        public Builder vodTranscodeGroupId(String vodTranscodeGroupId) {
            this.putQueryParameter("VodTranscodeGroupId", vodTranscodeGroupId);
            this.vodTranscodeGroupId = vodTranscodeGroupId;
            return this;
        }

        @Override
        public UpdateLiveRecordVodConfigRequest build() {
            return new UpdateLiveRecordVodConfigRequest(this);
        } 

    } 

}
