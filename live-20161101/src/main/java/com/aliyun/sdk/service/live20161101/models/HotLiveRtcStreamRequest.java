// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link HotLiveRtcStreamRequest} extends {@link RequestModel}
 *
 * <p>HotLiveRtcStreamRequest</p>
 */
public class HotLiveRtcStreamRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("AudioMsid")
    @Validation(required = true)
    private String audioMsid;

    @Query
    @NameInMap("ConnectionTimeout")
    private String connectionTimeout;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("MediaTimeout")
    private String mediaTimeout;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RegionCode")
    @Validation(required = true)
    private String regionCode;

    @Query
    @NameInMap("StreamName")
    @Validation(required = true)
    private String streamName;

    @Query
    @NameInMap("VideoMsid")
    @Validation(required = true)
    private String videoMsid;

    private HotLiveRtcStreamRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.audioMsid = builder.audioMsid;
        this.connectionTimeout = builder.connectionTimeout;
        this.domainName = builder.domainName;
        this.mediaTimeout = builder.mediaTimeout;
        this.ownerId = builder.ownerId;
        this.regionCode = builder.regionCode;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String regionId; 
        private String appName; 
        private String audioMsid; 
        private String connectionTimeout; 
        private String domainName; 
        private String mediaTimeout; 
        private Long ownerId; 
        private String regionCode; 
        private String streamName; 
        private String videoMsid; 

        private Builder() {
            super();
        } 

        private Builder(HotLiveRtcStreamRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.audioMsid = request.audioMsid;
            this.connectionTimeout = request.connectionTimeout;
            this.domainName = request.domainName;
            this.mediaTimeout = request.mediaTimeout;
            this.ownerId = request.ownerId;
            this.regionCode = request.regionCode;
            this.streamName = request.streamName;
            this.videoMsid = request.videoMsid;
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
         * AppName.
         */
        public Builder appName(String appName) {
            this.putQueryParameter("AppName", appName);
            this.appName = appName;
            return this;
        }

        /**
         * AudioMsid.
         */
        public Builder audioMsid(String audioMsid) {
            this.putQueryParameter("AudioMsid", audioMsid);
            this.audioMsid = audioMsid;
            return this;
        }

        /**
         * ConnectionTimeout.
         */
        public Builder connectionTimeout(String connectionTimeout) {
            this.putQueryParameter("ConnectionTimeout", connectionTimeout);
            this.connectionTimeout = connectionTimeout;
            return this;
        }

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * MediaTimeout.
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
         * RegionCode.
         */
        public Builder regionCode(String regionCode) {
            this.putQueryParameter("RegionCode", regionCode);
            this.regionCode = regionCode;
            return this;
        }

        /**
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * VideoMsid.
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
