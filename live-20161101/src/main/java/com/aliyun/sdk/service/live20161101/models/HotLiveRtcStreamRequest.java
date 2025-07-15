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
 * {@link HotLiveRtcStreamRequest} extends {@link RequestModel}
 *
 * <p>HotLiveRtcStreamRequest</p>
 */
public class HotLiveRtcStreamRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AudioMsid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String audioMsid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ConnectionTimeout")
    private String connectionTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DomainName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String domainName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MediaTimeout")
    private String mediaTimeout;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private Long ownerId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StreamName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String streamName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VideoMsid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String videoMsid;

    private HotLiveRtcStreamRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.audioMsid = builder.audioMsid;
        this.connectionTimeout = builder.connectionTimeout;
        this.domainName = builder.domainName;
        this.mediaTimeout = builder.mediaTimeout;
        this.ownerId = builder.ownerId;
        this.regionCode = builder.regionCode;
        this.regionId = builder.regionId;
        this.streamName = builder.streamName;
        this.videoMsid = builder.videoMsid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static HotLiveRtcStreamRequest create() {
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
     * @return audioMsid
     */
    public String getAudioMsid() {
        return this.audioMsid;
    }

    /**
     * @return connectionTimeout
     */
    public String getConnectionTimeout() {
        return this.connectionTimeout;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return mediaTimeout
     */
    public String getMediaTimeout() {
        return this.mediaTimeout;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return regionCode
     */
    public String getRegionCode() {
        return this.regionCode;
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
     * @return videoMsid
     */
    public String getVideoMsid() {
        return this.videoMsid;
    }

    public static final class Builder extends Request.Builder<HotLiveRtcStreamRequest, Builder> {
        private String appName; 
        private String audioMsid; 
        private String connectionTimeout; 
        private String domainName; 
        private String mediaTimeout; 
        private Long ownerId; 
        private String regionCode; 
        private String regionId; 
        private String streamName; 
        private String videoMsid; 

        private Builder() {
            super();
        } 

        private Builder(HotLiveRtcStreamRequest request) {
            super(request);
            this.appName = request.appName;
            this.audioMsid = request.audioMsid;
            this.connectionTimeout = request.connectionTimeout;
            this.domainName = request.domainName;
            this.mediaTimeout = request.mediaTimeout;
            this.ownerId = request.ownerId;
            this.regionCode = request.regionCode;
            this.regionId = request.regionId;
            this.streamName = request.streamName;
            this.videoMsid = request.videoMsid;
        } 

        /**
         * <p>The name of the application to which the live stream belongs.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>app</p>
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * <p>The audio MSID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rts audio</p>
         */
        public Builder audioMsid(String audioMsid) {
            this.putQueryParameter("AudioMsid", audioMsid);
            this.audioMsid = audioMsid;
            return this;
        }

        /**
         * <p>The duration for which the prefetch connection is maintained. Unit: milliseconds. Default value: 0, which specifies that the prefetch connection is always maintained.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder connectionTimeout(String connectionTimeout) {
            this.putQueryParameter("ConnectionTimeout", connectionTimeout);
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        /**
         * <p>The streaming domain.</p>
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
         * <p>The custom period after which a timeout event is triggered. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        public Builder mediaTimeout(String mediaTimeout) {
            this.putQueryParameter("MediaTimeout", mediaTimeout);
            this.mediaTimeout = mediaTimeout;
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
         * <p>The code of the region in which the live stream is prefetched. For more information, see the following tables that list available region codes.</p>
         * <blockquote>
         * <p> Region codes include provincial codes for China and country codes for all countries.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ZHJ</p>
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
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
         * <p>The name of the live stream that you want to prefetch.</p>
         * <p>This parameter is required.</p>
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
         * <p>The video MSID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rts video</p>
         */
        public Builder videoMsid(String videoMsid) {
            this.putQueryParameter("VideoMsid", videoMsid);
            this.videoMsid = videoMsid;
            return this;
        }

        @Override
        public HotLiveRtcStreamRequest build() {
            return new HotLiveRtcStreamRequest(this);
        } 

    } 

}
