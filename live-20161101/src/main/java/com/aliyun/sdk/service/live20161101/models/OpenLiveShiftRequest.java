// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenLiveShiftRequest} extends {@link RequestModel}
 *
 * <p>OpenLiveShiftRequest</p>
 */
public class OpenLiveShiftRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    private String appName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("Duration")
    private Integer duration;

    @Query
    @NameInMap("IgnoreTranscode")
    private Boolean ignoreTranscode;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StreamName")
    private String streamName;

    @Query
    @NameInMap("Vision")
    private Integer vision;

    private OpenLiveShiftRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.duration = builder.duration;
        this.ignoreTranscode = builder.ignoreTranscode;
        this.ownerId = builder.ownerId;
        this.streamName = builder.streamName;
        this.vision = builder.vision;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenLiveShiftRequest create() {
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
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return duration
     */
    public Integer getDuration() {
        return this.duration;
    }

    /**
     * @return ignoreTranscode
     */
    public Boolean getIgnoreTranscode() {
        return this.ignoreTranscode;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    /**
     * @return vision
     */
    public Integer getVision() {
        return this.vision;
    }

    public static final class Builder extends Request.Builder<OpenLiveShiftRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String domainName; 
        private Integer duration; 
        private Boolean ignoreTranscode; 
        private Long ownerId; 
        private String streamName; 
        private Integer vision; 

        private Builder() {
            super();
        } 

        private Builder(OpenLiveShiftRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.duration = request.duration;
            this.ignoreTranscode = request.ignoreTranscode;
            this.ownerId = request.ownerId;
            this.streamName = request.streamName;
            this.vision = request.vision;
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
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putQueryParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * Duration.
         */
        public Builder duration(Integer duration) {
            this.putQueryParameter("Duration", duration);
            this.duration = duration;
            return this;
        }

        /**
         * IgnoreTranscode.
         */
        public Builder ignoreTranscode(Boolean ignoreTranscode) {
            this.putQueryParameter("IgnoreTranscode", ignoreTranscode);
            this.ignoreTranscode = ignoreTranscode;
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
         * StreamName.
         */
        public Builder streamName(String streamName) {
            this.putQueryParameter("StreamName", streamName);
            this.streamName = streamName;
            return this;
        }

        /**
         * Vision.
         */
        public Builder vision(Integer vision) {
            this.putQueryParameter("Vision", vision);
            this.vision = vision;
            return this;
        }

        @Override
        public OpenLiveShiftRequest build() {
            return new OpenLiveShiftRequest(this);
        } 

    } 

}
