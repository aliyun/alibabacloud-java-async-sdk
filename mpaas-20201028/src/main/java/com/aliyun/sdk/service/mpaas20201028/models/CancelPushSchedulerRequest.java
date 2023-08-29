// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelPushSchedulerRequest} extends {@link RequestModel}
 *
 * <p>CancelPushSchedulerRequest</p>
 */
public class CancelPushSchedulerRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Body
    @NameInMap("Type")
    private Integer type;

    @Body
    @NameInMap("UniqueIds")
    @Validation(required = true)
    private String uniqueIds;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private CancelPushSchedulerRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.appId = builder.appId;
        this.type = builder.type;
        this.uniqueIds = builder.uniqueIds;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelPushSchedulerRequest create() {
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
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return type
     */
    public Integer getType() {
        return this.type;
    }

    /**
     * @return uniqueIds
     */
    public String getUniqueIds() {
        return this.uniqueIds;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CancelPushSchedulerRequest, Builder> {
        private String regionId; 
        private String appId; 
        private Integer type; 
        private String uniqueIds; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CancelPushSchedulerRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.appId = request.appId;
            this.type = request.type;
            this.uniqueIds = request.uniqueIds;
            this.workspaceId = request.workspaceId;
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
         * AppId.
         */
        public Builder appId(String appId) {
            this.putBodyParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(Integer type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        /**
         * UniqueIds.
         */
        public Builder uniqueIds(String uniqueIds) {
            this.putBodyParameter("UniqueIds", uniqueIds);
            this.uniqueIds = uniqueIds;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CancelPushSchedulerRequest build() {
            return new CancelPushSchedulerRequest(this);
        } 

    } 

}
