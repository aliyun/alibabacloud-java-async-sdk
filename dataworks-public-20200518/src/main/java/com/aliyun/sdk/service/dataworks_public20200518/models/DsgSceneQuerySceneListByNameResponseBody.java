// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link DsgSceneQuerySceneListByNameResponseBody} extends {@link TeaModel}
 *
 * <p>DsgSceneQuerySceneListByNameResponseBody</p>
 */
public class DsgSceneQuerySceneListByNameResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DsgSceneQuerySceneListByNameResponseBody(Builder builder) {
        this.data = builder.data;
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.httpStatusCode = builder.httpStatusCode;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgSceneQuerySceneListByNameResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private java.util.List<Data> data; 
        private String errorCode; 
        private String errorMessage; 
        private Integer httpStatusCode; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DsgSceneQuerySceneListByNameResponseBody model) {
            this.data = model.data;
            this.errorCode = model.errorCode;
            this.errorMessage = model.errorMessage;
            this.httpStatusCode = model.httpStatusCode;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The list of data masking scenarios.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>1029030003</p>
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>param error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>400</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>The ID of the request. You can use this ID to troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>102400001</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li><p><code>true</code>: The request was successful.</p>
         * </li>
         * <li><p><code>false</code>: The request failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DsgSceneQuerySceneListByNameResponseBody build() {
            return new DsgSceneQuerySceneListByNameResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DsgSceneQuerySceneListByNameResponseBody} extends {@link TeaModel}
     *
     * <p>DsgSceneQuerySceneListByNameResponseBody</p>
     */
    public static class Projects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("ProjectName")
        private String projectName;

        private Projects(Builder builder) {
            this.clusterId = builder.clusterId;
            this.dbType = builder.dbType;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Projects create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private String clusterId; 
            private String dbType; 
            private String projectName; 

            private Builder() {
            } 

            private Builder(Projects model) {
                this.clusterId = model.clusterId;
                this.dbType = model.dbType;
                this.projectName = model.projectName;
            } 

            /**
             * <p>The ID of the E-MapReduce (EMR) cluster. This parameter is returned only if the <code>DbType</code> is <code>EMR</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>c-123456</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The engine type. Valid values:</p>
             * <ul>
             * <li><p>MaxCompute: <code>ODPS.ODPS</code></p>
             * </li>
             * <li><p>Hologres: <code>HOLO.POSTGRES</code></p>
             * </li>
             * <li><p>E-MapReduce (EMR): <code>EMR</code></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ODPS.ODPS</p>
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * <p>The name of the engine instance.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_project</p>
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public Projects build() {
                return new Projects(this);
            } 

        } 

    }
    /**
     * 
     * {@link DsgSceneQuerySceneListByNameResponseBody} extends {@link TeaModel}
     *
     * <p>DsgSceneQuerySceneListByNameResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Children")
        private java.util.List<?> children;

        @com.aliyun.core.annotation.NameInMap("Desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("Projects")
        private java.util.List<Projects> projects;

        @com.aliyun.core.annotation.NameInMap("SceneCode")
        private String sceneCode;

        @com.aliyun.core.annotation.NameInMap("SceneLevel")
        private Integer sceneLevel;

        @com.aliyun.core.annotation.NameInMap("SceneName")
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("UserGroups")
        private String userGroups;

        @com.aliyun.core.annotation.NameInMap("scenceDbType")
        private String scenceDbType;

        private Data(Builder builder) {
            this.children = builder.children;
            this.desc = builder.desc;
            this.id = builder.id;
            this.projects = builder.projects;
            this.sceneCode = builder.sceneCode;
            this.sceneLevel = builder.sceneLevel;
            this.sceneName = builder.sceneName;
            this.userGroups = builder.userGroups;
            this.scenceDbType = builder.scenceDbType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List<?> getChildren() {
            return this.children;
        }

        /**
         * @return desc
         */
        public String getDesc() {
            return this.desc;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return projects
         */
        public java.util.List<Projects> getProjects() {
            return this.projects;
        }

        /**
         * @return sceneCode
         */
        public String getSceneCode() {
            return this.sceneCode;
        }

        /**
         * @return sceneLevel
         */
        public Integer getSceneLevel() {
            return this.sceneLevel;
        }

        /**
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return userGroups
         */
        public String getUserGroups() {
            return this.userGroups;
        }

        /**
         * @return scenceDbType
         */
        public String getScenceDbType() {
            return this.scenceDbType;
        }

        public static final class Builder {
            private java.util.List<?> children; 
            private String desc; 
            private Long id; 
            private java.util.List<Projects> projects; 
            private String sceneCode; 
            private Integer sceneLevel; 
            private String sceneName; 
            private String userGroups; 
            private String scenceDbType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.children = model.children;
                this.desc = model.desc;
                this.id = model.id;
                this.projects = model.projects;
                this.sceneCode = model.sceneCode;
                this.sceneLevel = model.sceneLevel;
                this.sceneName = model.sceneName;
                this.userGroups = model.userGroups;
                this.scenceDbType = model.scenceDbType;
            } 

            /**
             * <p>The nested data masking scenarios.</p>
             */
            public Builder children(java.util.List<?> children) {
                this.children = children;
                return this;
            }

            /**
             * <p>The description of the data masking scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>Test scenarios</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The ID of the data masking scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The engine instances to which the data masking scenario applies.</p>
             */
            public Builder projects(java.util.List<Projects> projects) {
                this.projects = projects;
                return this;
            }

            /**
             * <p>The code for the level-1 scenario. Valid values:</p>
             * <ul>
             * <li><p>Data masking in Data Map and DataStudio: <code>dataworks_display_desense_code</code></p>
             * </li>
             * <li><p>Data masking at the MaxCompute engine layer: <code>maxcompute_desense_code</code></p>
             * </li>
             * <li><p>Data masking at the MaxCompute engine layer (new): <code>maxcompute_new_desense_code</code></p>
             * </li>
             * <li><p>Data masking at the Hologres engine layer: <code>hologres_display_desense_code</code></p>
             * </li>
             * <li><p>Static data masking in Data Integration: <code>dataworks_data_integration_desense_code</code></p>
             * </li>
             * <li><p>Data masking in Data Analysis: <code>dataworks_analysis_desense_code</code></p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dataworks_display_desense_code</p>
             */
            public Builder sceneCode(String sceneCode) {
                this.sceneCode = sceneCode;
                return this;
            }

            /**
             * <p>The level of the data masking scenario. Valid values:</p>
             * <ul>
             * <li><p><code>0</code>: level-1 scenario</p>
             * </li>
             * <li><p><code>1</code>: level-2 scenario</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder sceneLevel(Integer sceneLevel) {
                this.sceneLevel = sceneLevel;
                return this;
            }

            /**
             * <p>The name of the data masking scenario.</p>
             * 
             * <strong>example:</strong>
             * <p>test_scene</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The user groups to which the data masking scenario applies. Multiple user group names are separated by a comma (,).</p>
             * 
             * <strong>example:</strong>
             * <p>user1,user2</p>
             */
            public Builder userGroups(String userGroups) {
                this.userGroups = userGroups;
                return this;
            }

            /**
             * scenceDbType.
             */
            public Builder scenceDbType(String scenceDbType) {
                this.scenceDbType = scenceDbType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
