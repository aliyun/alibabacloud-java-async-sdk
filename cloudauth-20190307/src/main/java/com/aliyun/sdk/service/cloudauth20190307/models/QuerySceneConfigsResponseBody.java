// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link QuerySceneConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySceneConfigsResponseBody</p>
 */
public class QuerySceneConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("sceneConfigs")
    private java.util.List<SceneConfigs> sceneConfigs;

    private QuerySceneConfigsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sceneConfigs = builder.sceneConfigs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySceneConfigsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sceneConfigs
     */
    public java.util.List<SceneConfigs> getSceneConfigs() {
        return this.sceneConfigs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SceneConfigs> sceneConfigs; 

        private Builder() {
        } 

        private Builder(QuerySceneConfigsResponseBody model) {
            this.requestId = model.requestId;
            this.sceneConfigs = model.sceneConfigs;
        } 

        /**
         * <p>ID of this request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Willingness configuration list.</p>
         */
        public Builder sceneConfigs(java.util.List<SceneConfigs> sceneConfigs) {
            this.sceneConfigs = sceneConfigs;
            return this;
        }

        public QuerySceneConfigsResponseBody build() {
            return new QuerySceneConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QuerySceneConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>QuerySceneConfigsResponseBody</p>
     */
    public static class SceneConfigs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("config")
        private String config;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("gmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("sceneId")
        private Long sceneId;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("version")
        private Long version;

        private SceneConfigs(Builder builder) {
            this.config = builder.config;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.sceneId = builder.sceneId;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneConfigs create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public String getConfig() {
            return this.config;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return sceneId
         */
        public Long getSceneId() {
            return this.sceneId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String config; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private Long sceneId; 
            private String type; 
            private Long version; 

            private Builder() {
            } 

            private Builder(SceneConfigs model) {
                this.config = model.config;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.sceneId = model.sceneId;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * <p>Specific configuration content, in JSON string format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;faceCompareMode&quot;:&quot;CUSTOM&quot;,&quot;certConfigs&quot;:[{&quot;index&quot;:0,&quot;openVoiceCompare&quot;:false,&quot;openCustomizedContent&quot;:true,&quot;model&quot;:&quot;QA&quot;}],&quot;screenEvidence&quot;:true}</p>
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * <p>Creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>1760782820000</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>Modification time.</p>
             * 
             * <strong>example:</strong>
             * <p>1760782820000</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>Configuration ID.</p>
             * 
             * <strong>example:</strong>
             * <p>607</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Scene ID.</p>
             * 
             * <strong>example:</strong>
             * <p>1000009045</p>
             */
            public Builder sceneId(Long sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            /**
             * <p>Configuration type.</p>
             * 
             * <strong>example:</strong>
             * <p>VOLUNTARY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>Scene configuration version number.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public SceneConfigs build() {
                return new SceneConfigs(this);
            } 

        } 

    }
}
