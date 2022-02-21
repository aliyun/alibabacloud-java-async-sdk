// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUpstreamAppKeyRelationsRequest} extends {@link RequestModel}
 *
 * <p>CreateUpstreamAppKeyRelationsRequest</p>
 */
public class CreateUpstreamAppKeyRelationsRequest extends Request {
    @Query
    @NameInMap("AppKeys")
    @Validation(required = true)
    private String appKeys;

    @Query
    @NameInMap("AppServerId")
    @Validation(required = true)
    private String appServerId;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateUpstreamAppKeyRelationsRequest(Builder builder) {
        super(builder);
        this.appKeys = builder.appKeys;
        this.appServerId = builder.appServerId;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUpstreamAppKeyRelationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKeys
     */
    public String getAppKeys() {
        return this.appKeys;
    }

    /**
     * @return appServerId
     */
    public String getAppServerId() {
        return this.appServerId;
    }

    /**
     * @return projectId
     */
    public String getProjectId() {
        return this.projectId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<CreateUpstreamAppKeyRelationsRequest, Builder> {
        private String appKeys; 
        private String appServerId; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateUpstreamAppKeyRelationsRequest response) {
            super(response);
            this.appKeys = response.appKeys;
            this.appServerId = response.appServerId;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * AppKeys.
         */
        public Builder appKeys(String appKeys) {
            this.putQueryParameter("AppKeys", appKeys);
            this.appKeys = appKeys;
            return this;
        }

        /**
         * AppServerId.
         */
        public Builder appServerId(String appServerId) {
            this.putQueryParameter("AppServerId", appServerId);
            this.appServerId = appServerId;
            return this;
        }

        /**
         * ProjectId.
         */
        public Builder projectId(String projectId) {
            this.putQueryParameter("ProjectId", projectId);
            this.projectId = projectId;
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

        @Override
        public CreateUpstreamAppKeyRelationsRequest build() {
            return new CreateUpstreamAppKeyRelationsRequest(this);
        } 

    } 

}
