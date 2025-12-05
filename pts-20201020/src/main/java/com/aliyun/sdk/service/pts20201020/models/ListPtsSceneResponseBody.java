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
 * {@link ListPtsSceneResponseBody} extends {@link TeaModel}
 *
 * <p>ListPtsSceneResponseBody</p>
 */
public class ListPtsSceneResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneViewList")
    private java.util.List<SceneViewList> sceneViewList;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListPtsSceneResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.sceneViewList = builder.sceneViewList;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPtsSceneResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return sceneViewList
     */
    public java.util.List<SceneViewList> getSceneViewList() {
        return this.sceneViewList;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private java.util.List<SceneViewList> sceneViewList; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListPtsSceneResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.sceneViewList = model.sceneViewList;
            this.success = model.success;
        } 

        /**
         * <p>The system status code. If the request was successful, no data is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>4001</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code. If the request was successful, no data is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, no data is returned.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>DD6F2ED8-E31B-497F-85AB-C4E358A5F667</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The returned scenarios.</p>
         */
        public Builder sceneViewList(java.util.List<SceneViewList> sceneViewList) {
            this.sceneViewList = sceneViewList;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListPtsSceneResponseBody build() {
            return new ListPtsSceneResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPtsSceneResponseBody} extends {@link TeaModel}
     *
     * <p>ListPtsSceneResponseBody</p>
     */
    public static class SceneViewList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private SceneViewList(Builder builder) {
            this.createTime = builder.createTime;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneViewList create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String createTime; 
            private String sceneId; 
            private String sceneName; 
            private String status; 

            private Builder() {
            } 

            private Builder(SceneViewList model) {
                this.createTime = model.createTime;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.status = model.status;
            } 

            /**
             * <p>The time when the PTS scenario was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-02-26 15:28:39</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The scenario ID.</p>
             * 
             * <strong>example:</strong>
             * <p>DFGVS3S</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The scenario name.</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The status of the PTS scenario. Valid values:</p>
             * 
             * <strong>example:</strong>
             * <p>Draft WaitStart Debugging Running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public SceneViewList build() {
                return new SceneViewList(this);
            } 

        } 

    }
}
