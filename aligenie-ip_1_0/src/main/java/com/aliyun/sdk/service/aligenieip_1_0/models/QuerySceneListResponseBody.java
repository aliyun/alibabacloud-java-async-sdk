// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

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
 * {@link QuerySceneListResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySceneListResponseBody</p>
 */
public class QuerySceneListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List<Results> results;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<Results> getResults() {
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
        private java.util.List<Results> results; 
        private Integer statusCode; 

        private Builder() {
        } 

        private Builder(QuerySceneListResponseBody model) {
            this.message = model.message;
            this.requestId = model.requestId;
            this.results = model.results;
            this.statusCode = model.statusCode;
        } 

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
        public Builder results(java.util.List<Results> results) {
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

    /**
     * 
     * {@link QuerySceneListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySceneListResponseBody</p>
     */
    public static class TemplateInfoDTOList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Name")
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

            private Builder() {
            } 

            private Builder(TemplateInfoDTOList model) {
                this.description = model.description;
                this.id = model.id;
                this.name = model.name;
            } 

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
    /**
     * 
     * {@link QuerySceneListResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySceneListResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Icon")
        private String icon;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("SceneSource")
        private String sceneSource;

        @com.aliyun.core.annotation.NameInMap("SceneState")
        private Integer sceneState;

        @com.aliyun.core.annotation.NameInMap("SceneType")
        private String sceneType;

        @com.aliyun.core.annotation.NameInMap("TemplateInfoDTOList")
        private java.util.List<TemplateInfoDTOList> templateInfoDTOList;

        @com.aliyun.core.annotation.NameInMap("UnavailableReason")
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
        public java.util.List<TemplateInfoDTOList> getTemplateInfoDTOList() {
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
            private java.util.List<TemplateInfoDTOList> templateInfoDTOList; 
            private String unavailableReason; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.icon = model.icon;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.sceneSource = model.sceneSource;
                this.sceneState = model.sceneState;
                this.sceneType = model.sceneType;
                this.templateInfoDTOList = model.templateInfoDTOList;
                this.unavailableReason = model.unavailableReason;
            } 

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
            public Builder templateInfoDTOList(java.util.List<TemplateInfoDTOList> templateInfoDTOList) {
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
