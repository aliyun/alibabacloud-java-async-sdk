// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySceneListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySceneListResponseBody</p>
 */
public class QuerySceneListResponseBody extends TeaModel {
    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
    private java.util.List < Results> results;

    @NameInMap("StatusCode")
    private Integer statusCode;

    private QuerySceneListResponseBody(Builder builder) {
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.statusCode = builder.statusCode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySceneListResponseBody create() {
        return builder().build();
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List < Results> getResults() {
        return this.results;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public static final class Builder {
        private String message; 
        private String requestId; 
        private java.util.List < Results> results; 
        private Integer statusCode; 

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Results.
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        public QuerySceneListResponseBody build() {
            return new QuerySceneListResponseBody(this);
        } 

    } 

    public static class TemplateInfoDTOList extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Id")
        private Long id;

        @NameInMap("Name")
        private String name;

        private TemplateInfoDTOList(Builder builder) {
            this.description = builder.description;
            this.id = builder.id;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TemplateInfoDTOList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String description; 
            private Long id; 
            private String name; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public TemplateInfoDTOList build() {
                return new TemplateInfoDTOList(this);
            } 

        } 

    }
    public static class Results extends TeaModel {
        @NameInMap("Icon")
        private String icon;

        @NameInMap("SceneId")
        private String sceneId;

        @NameInMap("SceneName")
        private String sceneName;

        @NameInMap("SceneSource")
        private String sceneSource;

        @NameInMap("SceneState")
        private Integer sceneState;

        @NameInMap("SceneType")
        private String sceneType;

        @NameInMap("TemplateInfoDTOList")
        private java.util.List < TemplateInfoDTOList> templateInfoDTOList;

        @NameInMap("UnavailableReason")
        private String unavailableReason;

        private Results(Builder builder) {
            this.icon = builder.icon;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.sceneSource = builder.sceneSource;
            this.sceneState = builder.sceneState;
            this.sceneType = builder.sceneType;
            this.templateInfoDTOList = builder.templateInfoDTOList;
            this.unavailableReason = builder.unavailableReason;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return icon
         */
        public String getIcon() {
            return this.icon;
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

        /**
         * @return sceneSource
         */
        public String getSceneSource() {
            return this.sceneSource;
        }

        /**
         * @return sceneState
         */
        public Integer getSceneState() {
            return this.sceneState;
        }

        /**
         * @return sceneType
         */
        public String getSceneType() {
            return this.sceneType;
        }

        /**
         * @return templateInfoDTOList
         */
        public java.util.List < TemplateInfoDTOList> getTemplateInfoDTOList() {
            return this.templateInfoDTOList;
        }

        /**
         * @return unavailableReason
         */
        public String getUnavailableReason() {
            return this.unavailableReason;
        }

        public static final class Builder {
            private String icon; 
            private String sceneId; 
            private String sceneName; 
            private String sceneSource; 
            private Integer sceneState; 
            private String sceneType; 
            private java.util.List < TemplateInfoDTOList> templateInfoDTOList; 
            private String unavailableReason; 

            /**
             * Icon.
             */
            public Builder icon(String icon) {
                this.icon = icon;
                return this;
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

            /**
             * SceneSource.
             */
            public Builder sceneSource(String sceneSource) {
                this.sceneSource = sceneSource;
                return this;
            }

            /**
             * SceneState.
             */
            public Builder sceneState(Integer sceneState) {
                this.sceneState = sceneState;
                return this;
            }

            /**
             * SceneType.
             */
            public Builder sceneType(String sceneType) {
                this.sceneType = sceneType;
                return this;
            }

            /**
             * TemplateInfoDTOList.
             */
            public Builder templateInfoDTOList(java.util.List < TemplateInfoDTOList> templateInfoDTOList) {
                this.templateInfoDTOList = templateInfoDTOList;
                return this;
            }

            /**
             * UnavailableReason.
             */
            public Builder unavailableReason(String unavailableReason) {
                this.unavailableReason = unavailableReason;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
