// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20181111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRunnableScenesResponseBody} extends {@link TeaModel}
 *
 * <p>ListRunnableScenesResponseBody</p>
 */
public class ListRunnableScenesResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Scenes")
    private Scenes scenes;

    @NameInMap("Success")
    private Boolean success;

    @NameInMap("TotalCount")
    private Long totalCount;

    private ListRunnableScenesResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.scenes = builder.scenes;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRunnableScenesResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scenes
     */
    public Scenes getScenes() {
        return this.scenes;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Scenes scenes; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Scenes.
         */
        public Builder scenes(Scenes scenes) {
            this.scenes = scenes;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListRunnableScenesResponseBody build() {
            return new ListRunnableScenesResponseBody(this);
        } 

    } 

    public static class Scene extends TeaModel {
        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("SceneId")
        private Long sceneId;

        @NameInMap("SceneName")
        private String sceneName;

        private Scene(Builder builder) {
            this.duration = builder.duration;
            this.modifiedTime = builder.modifiedTime;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scene create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return sceneId
         */
        public Long getSceneId() {
            return this.sceneId;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        public static final class Builder {
            private Integer duration; 
            private Long modifiedTime; 
            private Long sceneId; 
            private String sceneName; 

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(Long sceneId) {
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

            public Scene build() {
                return new Scene(this);
            } 

        } 

    }
    public static class Scenes extends TeaModel {
        @NameInMap("Scene")
        private java.util.List < Scene> scene;

        private Scenes(Builder builder) {
            this.scene = builder.scene;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenes create() {
            return builder().build();
        }

        /**
         * @return scene
         */
        public java.util.List < Scene> getScene() {
            return this.scene;
        }

        public static final class Builder {
            private java.util.List < Scene> scene; 

            /**
             * Scene.
             */
            public Builder scene(java.util.List < Scene> scene) {
                this.scene = scene;
                return this;
            }

            public Scenes build() {
                return new Scenes(this);
            } 

        } 

    }
}
