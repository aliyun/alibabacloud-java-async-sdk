// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InitializeAutoShowListTaskRequest} extends {@link RequestModel}
 *
 * <p>InitializeAutoShowListTaskRequest</p>
 */
public class InitializeAutoShowListTaskRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CallBackUrl")
    private String callBackUrl;

    @Query
    @NameInMap("CasterConfig")
    @Validation(required = true)
    private String casterConfig;

    @Query
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Query
    @NameInMap("EndTime")
    @Validation(required = true)
    private Long endTime;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("ResourceIds")
    @Validation(required = true)
    private String resourceIds;

    @Query
    @NameInMap("StartTime")
    @Validation(required = true)
    private Long startTime;

    private InitializeAutoShowListTaskRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.callBackUrl = builder.callBackUrl;
        this.casterConfig = builder.casterConfig;
        this.domainName = builder.domainName;
        this.endTime = builder.endTime;
        this.ownerId = builder.ownerId;
        this.resourceIds = builder.resourceIds;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitializeAutoShowListTaskRequest create() {
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
     * @return callBackUrl
     */
    public String getCallBackUrl() {
        return this.callBackUrl;
    }

    /**
     * @return casterConfig
     */
    public String getCasterConfig() {
        return this.casterConfig;
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
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return resourceIds
     */
    public String getResourceIds() {
        return this.resourceIds;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<InitializeAutoShowListTaskRequest, Builder> {
        private String regionId; 
        private String callBackUrl; 
        private String casterConfig; 
        private String domainName; 
        private Long endTime; 
        private Long ownerId; 
        private String resourceIds; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(InitializeAutoShowListTaskRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.callBackUrl = request.callBackUrl;
            this.casterConfig = request.casterConfig;
            this.domainName = request.domainName;
            this.endTime = request.endTime;
            this.ownerId = request.ownerId;
            this.resourceIds = request.resourceIds;
            this.startTime = request.startTime;
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
         * CallBackUrl.
         */
        public Builder callBackUrl(String callBackUrl) {
            this.putQueryParameter("CallBackUrl", callBackUrl);
            this.callBackUrl = callBackUrl;
            return this;
        }

        /**
         * CasterConfig.
         */
        public Builder casterConfig(String casterConfig) {
            this.putQueryParameter("CasterConfig", casterConfig);
            this.casterConfig = casterConfig;
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
        public Builder endTime(Long endTime) {
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
         * ResourceIds.
         */
        public Builder resourceIds(String resourceIds) {
            this.putQueryParameter("ResourceIds", resourceIds);
            this.resourceIds = resourceIds;
            return this;
        }

        /**
         * StartTime.
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public InitializeAutoShowListTaskRequest build() {
            return new InitializeAutoShowListTaskRequest(this);
        } 

    } 

}
