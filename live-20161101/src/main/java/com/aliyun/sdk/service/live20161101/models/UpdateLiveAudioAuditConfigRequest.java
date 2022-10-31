// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateLiveAudioAuditConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateLiveAudioAuditConfigRequest</p>
 */
public class UpdateLiveAudioAuditConfigRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("AppName")
    @Validation(required = true)
    private String appName;

    @Query
    @NameInMap("BizType")
    private String bizType;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("OssBucket")
    private String ossBucket;

    @Query
    @NameInMap("OssEndpoint")
    private String ossEndpoint;

    @Query
    @NameInMap("OssObject")
    private String ossObject;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("StreamName")
    @Validation(required = true)
    private String streamName;

    private UpdateLiveAudioAuditConfigRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appName = builder.appName;
        this.bizType = builder.bizType;
        this.domainName = builder.domainName;
        this.ossBucket = builder.ossBucket;
        this.ossEndpoint = builder.ossEndpoint;
        this.ossObject = builder.ossObject;
        this.ownerId = builder.ownerId;
        this.streamName = builder.streamName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLiveAudioAuditConfigRequest create() {
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
     * @return bizType
     */
    public String getBizType() {
        return this.bizType;
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
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
     * @return ossObject
     */
    public String getOssObject() {
        return this.ossObject;
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

    public static final class Builder extends Request.Builder<UpdateLiveAudioAuditConfigRequest, Builder> {
        private String regionId; 
        private String appName; 
        private String bizType; 
        private String domainName; 
        private String ossBucket; 
        private String ossEndpoint; 
        private String ossObject; 
        private Long ownerId; 
        private String streamName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateLiveAudioAuditConfigRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appName = request.appName;
            this.bizType = request.bizType;
            this.domainName = request.domainName;
            this.ossBucket = request.ossBucket;
            this.ossEndpoint = request.ossEndpoint;
            this.ossObject = request.ossObject;
            this.ownerId = request.ownerId;
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
         * BizType.
         */
        public Builder bizType(String bizType) {
            this.putQueryParameter("BizType", bizType);
            this.bizType = bizType;
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
         * OssObject.
         */
        public Builder ossObject(String ossObject) {
            this.putQueryParameter("OssObject", ossObject);
            this.ossObject = ossObject;
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

        @Override
        public UpdateLiveAudioAuditConfigRequest build() {
            return new UpdateLiveAudioAuditConfigRequest(this);
        } 

    } 

}
