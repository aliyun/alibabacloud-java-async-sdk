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
 * {@link DsgSceneAddOrUpdateSceneRequest} extends {@link RequestModel}
 *
 * <p>DsgSceneAddOrUpdateSceneRequest</p>
 */
public class DsgSceneAddOrUpdateSceneRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("scenes")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Scenes> scenes;

    private DsgSceneAddOrUpdateSceneRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.scenes = builder.scenes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DsgSceneAddOrUpdateSceneRequest create() {
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
     * @return scenes
     */
    public java.util.List<Scenes> getScenes() {
        return this.scenes;
    }

    public static final class Builder extends Request.Builder<DsgSceneAddOrUpdateSceneRequest, Builder> {
        private String regionId; 
        private java.util.List<Scenes> scenes; 

        private Builder() {
            super();
        } 

        private Builder(DsgSceneAddOrUpdateSceneRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.scenes = request.scenes;
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
         * <p>The information about the level-2 data masking scenario.</p>
         * <p>This parameter is required.</p>
         */
        public Builder scenes(java.util.List<Scenes> scenes) {
            String scenesShrink = shrink(scenes, "scenes", "json");
            this.putQueryParameter("scenes", scenesShrink);
            this.scenes = scenes;
            return this;
        }

        @Override
        public DsgSceneAddOrUpdateSceneRequest build() {
            return new DsgSceneAddOrUpdateSceneRequest(this);
        } 

    } 

    /**
     * 
     * {@link DsgSceneAddOrUpdateSceneRequest} extends {@link TeaModel}
     *
     * <p>DsgSceneAddOrUpdateSceneRequest</p>
     */
    public static class Projects extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("clusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("dbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("projectName")
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

            /**
             * <p>If the data masking scenario takes effect for an E-MapReduce (EMR) compute engine, enter the ID of an EMR cluster. This parameter is required only when you use an EMR compute engine.</p>
             * 
             * <strong>example:</strong>
             * <p>c-1234</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The type of the compute engine for which the data masking scenario takes effect. Valid values:</p>
             * <ul>
             * <li>ODPS: ODPS.ODPS</li>
             * <li>HOLO: HOLO.POSTGRES</li>
             * <li>EMR: EMR</li>
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
             * <p>The name of the compute engine instance for which the data masking scenario takes effect.</p>
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
     * {@link DsgSceneAddOrUpdateSceneRequest} extends {@link TeaModel}
     *
     * <p>DsgSceneAddOrUpdateSceneRequest</p>
     */
    public static class Scenes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("desc")
        private String desc;

        @com.aliyun.core.annotation.NameInMap("id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("projects")
        private java.util.List<Projects> projects;

        @com.aliyun.core.annotation.NameInMap("sceneCode")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sceneCode;

        @com.aliyun.core.annotation.NameInMap("sceneName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String sceneName;

        @com.aliyun.core.annotation.NameInMap("userGroupIds")
        private java.util.List<Long> userGroupIds;

        private Scenes(Builder builder) {
            this.desc = builder.desc;
            this.id = builder.id;
            this.projects = builder.projects;
            this.sceneCode = builder.sceneCode;
            this.sceneName = builder.sceneName;
            this.userGroupIds = builder.userGroupIds;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenes create() {
            return builder().build();
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
        public String getId() {
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
         * @return sceneName
         */
        public String getSceneName() {
            return this.sceneName;
        }

        /**
         * @return userGroupIds
         */
        public java.util.List<Long> getUserGroupIds() {
            return this.userGroupIds;
        }

        public static final class Builder {
            private String desc; 
            private String id; 
            private java.util.List<Projects> projects; 
            private String sceneCode; 
            private String sceneName; 
            private java.util.List<Long> userGroupIds; 

            /**
             * <p>The description.</p>
             */
            public Builder desc(String desc) {
                this.desc = desc;
                return this;
            }

            /**
             * <p>The ID of the level-2 data masking scenario.</p>
             * <ul>
             * <li>If you do not configure this parameter, the current operation is to add a level-2 data masking scenario.</li>
             * <li>If you configure this parameter, the current operation is to modify a level-2 data masking scenario. You can call the <a href="https://help.aliyun.com/document_detail/2786322.html">DsgSceneQuerySceneListByName</a> operation to query the ID of the level-2 data masking scenario.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>123</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The information about the compute engine for which the data masking scenario takes effect.</p>
             */
            public Builder projects(java.util.List<Projects> projects) {
                this.projects = projects;
                return this;
            }

            /**
             * <p>The code of the level-1 data masking scenario to which the level-2 data masking scenario belongs. Valid values:</p>
             * <ul>
             * <li>dataworks_display_desense_code: masking of displayed data in DataStudio and Data Map</li>
             * <li>maxcompute_desense_code: data masking at the MaxCompute compute engine layer</li>
             * <li>maxcompute_new_desense_code: data masking at the MaxCompute compute engine layer (new)</li>
             * <li>dataworks_analysis_desense_code: masking of displayed data in DataAnalysis</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>dataworks_display_desense_code</p>
             */
            public Builder sceneCode(String sceneCode) {
                this.sceneCode = sceneCode;
                return this;
            }

            /**
             * <p>The name of the level-2 data masking scenario.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>dev_scene</p>
             */
            public Builder sceneName(String sceneName) {
                this.sceneName = sceneName;
                return this;
            }

            /**
             * <p>The information about the user group for which the data masking scenario takes effect.</p>
             */
            public Builder userGroupIds(java.util.List<Long> userGroupIds) {
                this.userGroupIds = userGroupIds;
                return this;
            }

            public Scenes build() {
                return new Scenes(this);
            } 

        } 

    }
}
