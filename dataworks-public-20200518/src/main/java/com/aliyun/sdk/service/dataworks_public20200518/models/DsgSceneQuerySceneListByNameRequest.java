// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DsgSceneQuerySceneListByNameRequest} extends {@link RequestModel}
 *
 * <p>DsgSceneQuerySceneListByNameRequest</p>
 */
public class DsgSceneQuerySceneListByNameRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneName")
    private String sceneName;

    private DsgSceneQuerySceneListByNameRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.sceneName = builder.sceneName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgSceneQuerySceneListByNameRequest create() {
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
     * @return sceneName
     */
    public String getSceneName() {
        return this.sceneName;
    }

    public static final class Builder extends Request.Builder<DsgSceneQuerySceneListByNameRequest, Builder> {
        private String regionId; 
        private String sceneName; 

        private Builder() {
            super();
        } 

        private Builder(DsgSceneQuerySceneListByNameRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.sceneName = request.sceneName;
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
         * The name of the data masking scenario. A fuzzy match is performed in the platform based on a keyword to search for the data masking scenario.
         */
        public Builder sceneName(String sceneName) {
            this.putQueryParameter("SceneName", sceneName);
            this.sceneName = sceneName;
            return this;
        }

        @Override
        public DsgSceneQuerySceneListByNameRequest build() {
            return new DsgSceneQuerySceneListByNameRequest(this);
        } 

    } 

}
