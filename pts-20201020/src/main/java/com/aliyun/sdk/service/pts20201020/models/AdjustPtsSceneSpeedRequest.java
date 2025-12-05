// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

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
 * {@link AdjustPtsSceneSpeedRequest} extends {@link RequestModel}
 *
 * <p>AdjustPtsSceneSpeedRequest</p>
 */
public class AdjustPtsSceneSpeedRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiSpeedList")
    private java.util.List<ApiSpeedList> apiSpeedList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SceneId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sceneId;

    private AdjustPtsSceneSpeedRequest(Builder builder) {
        super(builder);
        this.apiSpeedList = builder.apiSpeedList;
        this.sceneId = builder.sceneId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AdjustPtsSceneSpeedRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiSpeedList
     */
    public java.util.List<ApiSpeedList> getApiSpeedList() {
        return this.apiSpeedList;
    }

    /**
     * @return sceneId
     */
    public String getSceneId() {
        return this.sceneId;
    }

    public static final class Builder extends Request.Builder<AdjustPtsSceneSpeedRequest, Builder> {
        private java.util.List<ApiSpeedList> apiSpeedList; 
        private String sceneId; 

        private Builder() {
            super();
        } 

        private Builder(AdjustPtsSceneSpeedRequest request) {
            super(request);
            this.apiSpeedList = request.apiSpeedList;
            this.sceneId = request.sceneId;
        } 

        /**
         * <p>The stress testing speed in the PTS scenario.</p>
         */
        public Builder apiSpeedList(java.util.List<ApiSpeedList> apiSpeedList) {
            String apiSpeedListShrink = shrink(apiSpeedList, "ApiSpeedList", "json");
            this.putQueryParameter("ApiSpeedList", apiSpeedListShrink);
            this.apiSpeedList = apiSpeedList;
            return this;
        }

        /**
         * <p>The scenario ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DYXXX12H</p>
         */
        public Builder sceneId(String sceneId) {
            this.putQueryParameter("SceneId", sceneId);
            this.sceneId = sceneId;
            return this;
        }

        @Override
        public AdjustPtsSceneSpeedRequest build() {
            return new AdjustPtsSceneSpeedRequest(this);
        } 

    } 

    /**
     * 
     * {@link AdjustPtsSceneSpeedRequest} extends {@link TeaModel}
     *
     * <p>AdjustPtsSceneSpeedRequest</p>
     */
    public static class ApiSpeedList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiId")
        private String apiId;

        @com.aliyun.core.annotation.NameInMap("Speed")
        private Long speed;

        private ApiSpeedList(Builder builder) {
            this.apiId = builder.apiId;
            this.speed = builder.speed;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApiSpeedList create() {
            return builder().build();
        }

        /**
         * @return apiId
         */
        public String getApiId() {
            return this.apiId;
        }

        /**
         * @return speed
         */
        public Long getSpeed() {
            return this.speed;
        }

        public static final class Builder {
            private String apiId; 
            private Long speed; 

            private Builder() {
            } 

            private Builder(ApiSpeedList model) {
                this.apiId = model.apiId;
                this.speed = model.speed;
            } 

            /**
             * <p>The API ID. You can find the information of the API corresponding to the ID in the Relation response parameter of the GetPtsSceneRunningData operation based on the ID.</p>
             * 
             * <strong>example:</strong>
             * <p>DYXXX12H</p>
             */
            public Builder apiId(String apiId) {
                this.apiId = apiId;
                return this;
            }

            /**
             * <p>The new stress. In concurrency mode, the new stress is the concurrency. In RPS mode, the new stress is the RPS.</p>
             * 
             * <strong>example:</strong>
             * <p>30</p>
             */
            public Builder speed(Long speed) {
                this.speed = speed;
                return this;
            }

            public ApiSpeedList build() {
                return new ApiSpeedList(this);
            } 

        } 

    }
}
