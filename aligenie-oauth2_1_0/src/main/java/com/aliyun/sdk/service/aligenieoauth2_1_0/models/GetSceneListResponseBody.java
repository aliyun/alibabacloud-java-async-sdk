// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieoauth2_1_0.models;

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
 * {@link GetSceneListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSceneListResponseBody</p>
 */
public class GetSceneListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneList")
    private java.util.List<SceneList> sceneList;

    private GetSceneListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sceneList = builder.sceneList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSceneListResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneList
     */
    public java.util.List<SceneList> getSceneList() {
        return this.sceneList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SceneList> sceneList; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SceneList.
         */
        public Builder sceneList(java.util.List<SceneList> sceneList) {
            this.sceneList = sceneList;
            return this;
        }

        public GetSceneListResponseBody build() {
            return new GetSceneListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSceneListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSceneListResponseBody</p>
     */
    public static class SceneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        private SceneList(Builder builder) {
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneList create() {
            return builder().build();
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        public static final class Builder {
            private String sceneId; 
            private String sceneName; 

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * SceneName.
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            public SceneList build() {
                return new SceneList(this);
            } 

        } 

    }
}
