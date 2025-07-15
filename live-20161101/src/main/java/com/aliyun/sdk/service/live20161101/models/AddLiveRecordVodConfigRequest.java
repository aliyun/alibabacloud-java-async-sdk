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
 * {@link AddLiveRecordVodConfigRequest} extends {@link RequestModel}
 *
 * <p>AddLiveRecordVodConfigRequest</p>
 */
public class AddLiveRecordVodConfigRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("StorageLocation")
    private String storageLocation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VodTranscodeGroupId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vodTranscodeGroupId;

    private AddLiveRecordVodConfigRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.autoCompose = builder.autoCompose;
        this.composeVodTranscodeGroupId = builder.composeVodTranscodeGroupId;
        this.cycleDuration = builder.cycleDuration;
        this.domainName = builder.domainName;
        this.onDemand = builder.onDemand;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.storageLocation = builder.storageLocation;
        this.streamName = builder.streamName;
        this.vodTranscodeGroupId = builder.vodTranscodeGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLiveRecordVodConfigRequest create() {
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
     * @return storageLocation
     */
    public String getStorageLocation() {
        return this.storageLocation;
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

    public static final class Builder extends Request.Builder<AddLiveRecordVodConfigRequest, Builder> {
        private String appName; 
        private String autoCompose; 
        private String composeVodTranscodeGroupId; 
        private Integer cycleDuration; 
        private String domainName; 
        private Integer onDemand; 
        private Long ownerId; 
        private String regionId; 
        private String storageLocation; 
        private String streamName; 
        private String vodTranscodeGroupId; 

        private Builder() {
            super();
        } 

        private Builder(AddLiveRecordVodConfigRequest request) {
            super(request);
            this.appName = request.appName;
            this.autoCompose = request.autoCompose;
            this.composeVodTranscodeGroupId = request.composeVodTranscodeGroupId;
            this.cycleDuration = request.cycleDuration;
            this.domainName = request.domainName;
            this.onDemand = request.onDemand;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.storageLocation = request.storageLocation;
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
         * <p>Specifies whether to enable automatic merging. If you set the value to <strong>ON</strong>, automatic merging is enabled and the ComposeVodTranscodeGroupId parameter is required. If you do not specify this parameter, automatic merging is disabled.</p>
         * <blockquote>
         * <p> If you enable automatic merging, the VOD files that are created from live streams are automatically merged by using the editing and production feature of ApsaraVideo VOD. For information about the billing of the feature, see <a href="https://help.aliyun.com/document_detail/188310.html">Billing of value-added services</a>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ON</p>
         */
        public Builder autoCompose(String autoCompose) {
            this.putQueryParameter("AutoCompose", autoCompose);
            this.autoCompose = autoCompose;
            return this;
        }

        /**
         * <p>The ID of the transcoding template group in ApsaraVideo VOD that is used to transcode the video file. The video file is generated by merging the VOD files created from live streams.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>This parameter is required if you set the AutoCompose parameter to ON.</p>
         * </li>
         * <li><p>For more information about automatic merging and transcoding, see <a href="https://help.aliyun.com/document_detail/99726.html">FAQ about Live-to-VOD</a>.</p>
         * </li>
         * <li><p>For information about the billing of transcoding in ApsaraVideo VOD, see <a href="https://help.aliyun.com/document_detail/188308.html">Billing of basic services</a>.</p>
         * </li>
         * </ul>
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
         * <blockquote>
         * <p> Make sure that ApsaraVideo VOD is activated in the same region as the live center of the streaming domain.</p>
         * </blockquote>
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
         * <li><strong>1</strong>: enables on-demand recording.</li>
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
         * <p>The storage location.</p>
         * 
         * <strong>example:</strong>
         * <p>****-tjptr2vatm.oss-cn-shanghai.aliyuncs.com</p>
         */
        public Builder storageLocation(String storageLocation) {
            this.putQueryParameter("StorageLocation", storageLocation);
            this.storageLocation = storageLocation;
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
        public AddLiveRecordVodConfigRequest build() {
            return new AddLiveRecordVodConfigRequest(this);
        } 

    } 

}
