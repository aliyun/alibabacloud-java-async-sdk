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
 * {@link GetSmartHomeSceneListResponseBody} extends {@link TeaModel}
 *
 * <p>GetSmartHomeSceneListResponseBody</p>
 */
public class GetSmartHomeSceneListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FamilySceneList")
    private java.util.List<FamilySceneList> familySceneList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetSmartHomeSceneListResponseBody(Builder builder) {
        this.familySceneList = builder.familySceneList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSmartHomeSceneListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return familySceneList
     */
    public java.util.List<FamilySceneList> getFamilySceneList() {
        return this.familySceneList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<FamilySceneList> familySceneList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetSmartHomeSceneListResponseBody model) {
            this.familySceneList = model.familySceneList;
            this.requestId = model.requestId;
        } 

        /**
         * FamilySceneList.
         */
        public Builder familySceneList(java.util.List<FamilySceneList> familySceneList) {
            this.familySceneList = familySceneList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetSmartHomeSceneListResponseBody build() {
            return new GetSmartHomeSceneListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetSmartHomeSceneListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmartHomeSceneListResponseBody</p>
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

            private Builder() {
            } 

            private Builder(SceneList model) {
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
            } 

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
    /**
     * 
     * {@link GetSmartHomeSceneListResponseBody} extends {@link TeaModel}
     *
     * <p>GetSmartHomeSceneListResponseBody</p>
     */
    public static class FamilySceneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("familyId")
        private String familyId;

        @com.aliyun.core.annotation.NameInMap("familyName")
        private String familyName;

        @com.aliyun.core.annotation.NameInMap("sceneList")
        private java.util.List<SceneList> sceneList;

        private FamilySceneList(Builder builder) {
            this.familyId = builder.familyId;
            this.familyName = builder.familyName;
            this.sceneList = builder.sceneList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static FamilySceneList create() {
            return builder().build();
        }

        /**
         * @return familyId
         */
        public String getFamilyId() {
            return this.familyId;
        }

        /**
         * @return familyName
         */
        public String getFamilyName() {
            return this.familyName;
        }

        /**
         * @return sceneList
         */
        public java.util.List<SceneList> getSceneList() {
            return this.sceneList;
        }

        public static final class Builder {
            private String familyId; 
            private String familyName; 
            private java.util.List<SceneList> sceneList; 

            private Builder() {
            } 

            private Builder(FamilySceneList model) {
                this.familyId = model.familyId;
                this.familyName = model.familyName;
                this.sceneList = model.sceneList;
            } 

            /**
             * familyId.
             */
            public Builder familyId(String familyId) {
                this.familyId = familyId;
                return this;
            }

            /**
             * familyName.
             */
            public Builder familyName(String familyName) {
                this.familyName = familyName;
                return this;
            }

            /**
             * sceneList.
             */
            public Builder sceneList(java.util.List<SceneList> sceneList) {
                this.sceneList = sceneList;
                return this;
            }

            public FamilySceneList build() {
                return new FamilySceneList(this);
            } 

        } 

    }
}
