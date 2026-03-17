// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetAppRecommendedCommoditiesRequest} extends {@link RequestModel}
 *
 * <p>GetAppRecommendedCommoditiesRequest</p>
 */
public class GetAppRecommendedCommoditiesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BizId")
    private String bizId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceConditions")
    private String resourceConditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Scene")
    private String scene;

    private GetAppRecommendedCommoditiesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.bizId = builder.bizId;
        this.resourceConditions = builder.resourceConditions;
        this.scene = builder.scene;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppRecommendedCommoditiesRequest create() {
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
     * @return bizId
     */
    public String getBizId() {
        return this.bizId;
    }

    /**
     * @return resourceConditions
     */
    public String getResourceConditions() {
        return this.resourceConditions;
    }

    /**
     * @return scene
     */
    public String getScene() {
        return this.scene;
    }

    public static final class Builder extends Request.Builder<GetAppRecommendedCommoditiesRequest, Builder> {
        private String regionId; 
        private String bizId; 
        private String resourceConditions; 
        private String scene; 

        private Builder() {
            super();
        } 

        private Builder(GetAppRecommendedCommoditiesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.bizId = request.bizId;
            this.resourceConditions = request.resourceConditions;
            this.scene = request.scene;
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
         * BizId.
         */
        public Builder bizId(String bizId) {
            this.putQueryParameter("BizId", bizId);
            this.bizId = bizId;
            return this;
        }

        /**
         * ResourceConditions.
         */
        public Builder resourceConditions(String resourceConditions) {
            this.putQueryParameter("ResourceConditions", resourceConditions);
            this.resourceConditions = resourceConditions;
            return this;
        }

        /**
         * Scene.
         */
        public Builder scene(String scene) {
            this.putQueryParameter("Scene", scene);
            this.scene = scene;
            return this;
        }

        @Override
        public GetAppRecommendedCommoditiesRequest build() {
            return new GetAppRecommendedCommoditiesRequest(this);
        } 

    } 

}
