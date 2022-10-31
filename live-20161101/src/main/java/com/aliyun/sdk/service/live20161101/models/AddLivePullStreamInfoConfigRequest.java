// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddLivePullStreamInfoConfigRequest} extends {@link RequestModel}
 *
 * <p>AddLivePullStreamInfoConfigRequest</p>
 */
public class AddLivePullStreamInfoConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private String endTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("SourceUrl")
    @Validation(required = true)
    private String sourceUrl;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private String startTime;

    @Query
    @NameInMap("StreamName")
    @Validation(required = true)
    private String streamName;

    private AddLivePullStreamInfoConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.sourceUrl = builder.sourceUrl;
        this.startTime = builder.startTime;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddLivePullStreamInfoConfigRequest create() {
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
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return sourceUrl
     */
    public String getSourceUrl() {
        return this.sourceUrl;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return streamName
     */
    public String getStreamName() {
        return this.streamName;
    }

    public static final class Builder extends Request.Builder<AddLivePullStreamInfoConfigRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String domainName; 
        private String endTime; 
        private Long ownerId; 
        private String sourceUrl; 
        private String startTime; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(AddLivePullStreamInfoConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.sourceUrl = request.sourceUrl;
            this.startTime = request.startTime;
            this.streamName = request.streamName;
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
         * EndTime.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
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
         * SourceUrl.
         */
        public Builder sourceUrl(String sourceUrl) {
            this.putQueryParameter("SourceUrl", sourceUrl);
            this.sourceUrl = sourceUrl;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
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

        @Override
        public AddLivePullStreamInfoConfigRequest build() {
            return new AddLivePullStreamInfoConfigRequest(this);
        } 

    } 

}
