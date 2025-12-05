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
 * {@link ListOpenJMeterScenesResponseBody} extends {@link TeaModel}
 *
 * <p>ListOpenJMeterScenesResponseBody</p>
 */
public class ListOpenJMeterScenesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("JMeterScene")
    private java.util.List<JMeterScene> jMeterScene;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListOpenJMeterScenesResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.jMeterScene = builder.jMeterScene;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListOpenJMeterScenesResponseBody create() {
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
     * @return jMeterScene
     */
    public java.util.List<JMeterScene> getJMeterScene() {
        return this.jMeterScene;
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
        private Integer httpStatusCode; 
        private java.util.List<JMeterScene> jMeterScene; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListOpenJMeterScenesResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.jMeterScene = model.jMeterScene;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The system status code. If the request was successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The HTTP status code. If the request was successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The scenarios.</p>
         */
        public Builder jMeterScene(java.util.List<JMeterScene> jMeterScene) {
            this.jMeterScene = jMeterScene;
            return this;
        }

        /**
         * <p>The returned message. If the request was successful, this parameter is left empty.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of returned scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A8E16480-15C1-555A-922F-B736A005E52D</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of returned scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListOpenJMeterScenesResponseBody build() {
            return new ListOpenJMeterScenesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListOpenJMeterScenesResponseBody} extends {@link TeaModel}
     *
     * <p>ListOpenJMeterScenesResponseBody</p>
     */
    public static class JMeterScene extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DurationStr")
        private String durationStr;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private JMeterScene(Builder builder) {
            this.durationStr = builder.durationStr;
            this.sceneId = builder.sceneId;
            this.sceneName = builder.sceneName;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static JMeterScene create() {
            return builder().build();
        }

        /**
         * @return durationStr
         */
        public String getDurationStr() {
            return this.durationStr;
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
            private String durationStr; 
            private String sceneId; 
            private String sceneName; 
            private String status; 

            private Builder() {
            } 

            private Builder(JMeterScene model) {
                this.durationStr = model.durationStr;
                this.sceneId = model.sceneId;
                this.sceneName = model.sceneName;
                this.status = model.status;
            } 

            /**
             * <p>The stress testing duration.</p>
             * 
             * <strong>example:</strong>
             * <p>10分钟</p>
             */
            public Builder durationStr(String durationStr) {
                this.durationStr = durationStr;
                return this;
            }

            /**
             * <p>The scenario ID.</p>
             * 
             * <strong>example:</strong>
             * <p>DYYPZIH</p>
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>The scenario name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The status of the scenario. Valid values:</p>
             * <ul>
             * <li>PREPARING: The scenario is being prepared.</li>
             * <li>PREPARED: The scenario has been prepared.</li>
             * <li>STARTING: The scenario is starting.</li>
             * <li>RUNNING: The scenario is running.</li>
             * <li>STOPPING: The scenario is being stopped.</li>
             * <li>STOPPED: The scenario waits for startup</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>STOPPED</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public JMeterScene build() {
                return new JMeterScene(this);
            } 

        } 

    }
}
