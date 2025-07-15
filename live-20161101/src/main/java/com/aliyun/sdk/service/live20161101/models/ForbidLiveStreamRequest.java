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
 * {@link ForbidLiveStreamRequest} extends {@link RequestModel}
 *
 * <p>ForbidLiveStreamRequest</p>
 */
public class ForbidLiveStreamRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LiveStreamType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String liveStreamType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Oneshot")
    private String oneshot;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResumeTime")
    private String resumeTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    private ForbidLiveStreamRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.liveStreamType = builder.liveStreamType;
        this.oneshot = builder.oneshot;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.resumeTime = builder.resumeTime;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ForbidLiveStreamRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return liveStreamType
     */
    public String getLiveStreamType() {
        return this.liveStreamType;
    }

    /**
     * @return oneshot
     */
    public String getOneshot() {
        return this.oneshot;
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
     * @return resumeTime
     */
    public String getResumeTime() {
        return this.resumeTime;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<ForbidLiveStreamRequest, Builder> {
        private String appName; 
        private String domainName; 
        private String liveStreamType; 
        private String oneshot; 
        private Long ownerId; 
        private String regionId; 
        private String resumeTime; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(ForbidLiveStreamRequest request) {
            super(request);
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.liveStreamType = request.liveStreamType;
            this.oneshot = request.oneshot;
            this.ownerId = request.ownerId;
            this.regionId = request.regionId;
            this.resumeTime = request.resumeTime;
            this.streamName = request.streamName;
        } 

        /**
         * <p>The name of the application to which the live stream belongs. You can view the application name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The ingest domain.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo.aliyundoc.com</p>
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * <p>Specifies whether the live stream is ingested by a streamer or played by a viewer. Set the value to <strong>publisher</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>publisher</p>
         */
        public Builder liveStreamType(String liveStreamType) {
            this.putQueryParameter("LiveStreamType", liveStreamType);
            this.liveStreamType = liveStreamType;
            return this;
        }

        /**
         * <p>Specifies whether to only interrupt the live stream without adding the ingest URL of the live stream to the blacklist. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: interrupts the live stream but does not add the ingest URL of the live stream to the blacklist. This value is available only when the live stream is ingested or played in the upstream.</li>
         * <li><strong>no</strong>: disables the live stream and adds the ingest URL of the live stream to the blacklist.</li>
         * </ul>
         * <blockquote>
         * <p> If you do not specify this parameter, the default value no is used.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        public Builder oneshot(String oneshot) {
            this.putQueryParameter("Oneshot", oneshot);
            this.oneshot = oneshot;
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
         * <p>The time when the live stream is resumed. Specify the time in the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time must be in UTC.</p>
         * <blockquote>
         * </blockquote>
         * <ul>
         * <li><p>If you set the <strong>Oneshot</strong> parameter to <strong>no</strong> and do not specify this parameter, the live stream is disabled for six months by default.</p>
         * </li>
         * <li><p>If you specify this parameter, the live stream is resumed at the specified point in time.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2015-12-01T10:37:00Z</p>
         */
        public Builder resumeTime(String resumeTime) {
            this.putQueryParameter("ResumeTime", resumeTime);
            this.resumeTime = resumeTime;
            return this;
        }

        /**
         * <p>The name of the ingested stream. You can view the stream name on the <a href="https://help.aliyun.com/document_detail/197397.html">Stream Management</a> page of the ApsaraVideo Live console.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>liveStream****</p>
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        @Override
        public ForbidLiveStreamRequest build() {
            return new ForbidLiveStreamRequest(this);
        } 

    } 

}
