// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUpstreamAppKeyRelationRequest} extends {@link RequestModel}
 *
 * <p>CreateUpstreamAppKeyRelationRequest</p>
 */
public class CreateUpstreamAppKeyRelationRequest extends Request {
    @Query
    @NameInMap("AppKey")
    @Validation(required = true)
    private String appKey;

    @Query
    @NameInMap("PAppKey")
    @Validation(required = true)
    private String PAppKey;

    @Query
    @NameInMap("ProjectId")
    @Validation(required = true)
    private String projectId;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private CreateUpstreamAppKeyRelationRequest(Builder builder) {
        super(builder);
        this.appKey = builder.appKey;
        this.PAppKey = builder.PAppKey;
        this.projectId = builder.projectId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateUpstreamAppKeyRelationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appKey
     */
    public String getAppKey() {
        return this.appKey;
    }

    /**
     * @return PAppKey
     */
    public String getPAppKey() {
        return this.PAppKey;
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

    public static final class Builder extends Request.Builder<CreateUpstreamAppKeyRelationRequest, Builder> {
        private String appKey; 
        private String PAppKey; 
        private String projectId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(CreateUpstreamAppKeyRelationRequest response) {
            super(response);
            this.appKey = response.appKey;
            this.PAppKey = response.PAppKey;
            this.projectId = response.projectId;
            this.regionId = response.regionId;
        } 

        /**
         * AppKey.
         */
        public Builder appKey(String appKey) {
            this.putQueryParameter("AppKey", appKey);
            this.appKey = appKey;
            return this;
        }

        /**
         * PAppKey.
         */
        public Builder PAppKey(String PAppKey) {
            this.putQueryParameter("PAppKey", PAppKey);
            this.PAppKey = PAppKey;
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
        public CreateUpstreamAppKeyRelationRequest build() {
            return new CreateUpstreamAppKeyRelationRequest(this);
        } 

    } 

}
