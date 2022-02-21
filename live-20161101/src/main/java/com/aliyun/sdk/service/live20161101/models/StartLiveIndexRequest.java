// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartLiveIndexRequest} extends {@link RequestModel}
 *
 * <p>StartLiveIndexRequest</p>
 */
public class StartLiveIndexRequest extends Request {
    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("InputUrl")
    @Validation(required = true)
    private String inputUrl;

    @Query
    @NameInMap("Interval")
    private Integer interval;

    @Query
    @NameInMap("OssBucket")
    private String ossBucket;

    @Query
    @NameInMap("OssEndpoint")
    private String ossEndpoint;

    @Query
    @NameInMap("OssRamRole")
    private String ossRamRole;

    @Query
    @NameInMap("OssUserId")
    private String ossUserId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StreamName")
    @Validation(required = true)
    private String streamName;

    @Query
    @NameInMap("TokenId")
    @Validation(required = true)
    private String tokenId;

    private StartLiveIndexRequest(Builder builder) {
        super(builder);
        this.appName = builder.appName;
        this.domainName = builder.domainName;
        this.inputUrl = builder.inputUrl;
        this.interval = builder.interval;
        this.ossBucket = builder.ossBucket;
        this.ossEndpoint = builder.ossEndpoint;
        this.ossRamRole = builder.ossRamRole;
        this.ossUserId = builder.ossUserId;
        this.ownerId = builder.ownerId;
        this.regionId = builder.regionId;
        this.streamName = builder.streamName;
        this.tokenId = builder.tokenId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartLiveIndexRequest create() {
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
     * @return inputUrl
     */
    public String getInputUrl() {
        return this.inputUrl;
    }

    /**
     * @return interval
     */
    public Integer getInterval() {
        return this.interval;
    }

    /**
     * @return ossBucket
     */
    public String getOssBucket() {
        return this.ossBucket;
    }

    /**
     * @return ossEndpoint
     */
    public String getOssEndpoint() {
        return this.ossEndpoint;
    }

    /**
     * @return ossRamRole
     */
    public String getOssRamRole() {
        return this.ossRamRole;
    }

    /**
     * @return ossUserId
     */
    public String getOssUserId() {
        return this.ossUserId;
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
     * @return tokenId
     */
    public String getTokenId() {
        return this.tokenId;
    }

    public static final class Builder extends Request.Builder<StartLiveIndexRequest, Builder> {
        private String appName; 
        private String domainName; 
        private String inputUrl; 
        private Integer interval; 
        private String ossBucket; 
        private String ossEndpoint; 
        private String ossRamRole; 
        private String ossUserId; 
        private Long ownerId; 
        private String regionId; 
        private String streamName; 
        private String tokenId; 

        private Builder() {
            super();
        } 

        private Builder(StartLiveIndexRequest response) {
            super(response);
            this.appName = response.appName;
            this.domainName = response.domainName;
            this.inputUrl = response.inputUrl;
            this.interval = response.interval;
            this.ossBucket = response.ossBucket;
            this.ossEndpoint = response.ossEndpoint;
            this.ossRamRole = response.ossRamRole;
            this.ossUserId = response.ossUserId;
            this.ownerId = response.ownerId;
            this.regionId = response.regionId;
            this.streamName = response.streamName;
            this.tokenId = response.tokenId;
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
         * InputUrl.
         */
        public Builder inputUrl(String inputUrl) {
            this.putQueryParameter("InputUrl", inputUrl);
            this.inputUrl = inputUrl;
            return this;
        }

        /**
         * Interval.
         */
        public Builder interval(Integer interval) {
            this.putQueryParameter("Interval", interval);
            this.interval = interval;
            return this;
        }

        /**
         * OssBucket.
         */
        public Builder ossBucket(String ossBucket) {
            this.putQueryParameter("OssBucket", ossBucket);
            this.ossBucket = ossBucket;
            return this;
        }

        /**
         * OssEndpoint.
         */
        public Builder ossEndpoint(String ossEndpoint) {
            this.putQueryParameter("OssEndpoint", ossEndpoint);
            this.ossEndpoint = ossEndpoint;
            return this;
        }

        /**
         * OssRamRole.
         */
        public Builder ossRamRole(String ossRamRole) {
            this.putQueryParameter("OssRamRole", ossRamRole);
            this.ossRamRole = ossRamRole;
            return this;
        }

        /**
         * OssUserId.
         */
        public Builder ossUserId(String ossUserId) {
            this.putQueryParameter("OssUserId", ossUserId);
            this.ossUserId = ossUserId;
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
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * TokenId.
         */
        public Builder tokenId(String tokenId) {
            this.putQueryParameter("TokenId", tokenId);
            this.tokenId = tokenId;
            return this;
        }

        @Override
        public StartLiveIndexRequest build() {
            return new StartLiveIndexRequest(this);
        } 

    } 

}
