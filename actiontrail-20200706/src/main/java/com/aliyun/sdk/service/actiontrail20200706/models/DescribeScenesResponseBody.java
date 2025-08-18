// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.actiontrail20200706.models;

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
 * {@link DescribeScenesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeScenesResponseBody</p>
 */
public class DescribeScenesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SceneList")
    private java.util.List<SceneList> sceneList;

    private DescribeScenesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.sceneList = builder.sceneList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeScenesResponseBody create() {
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
     * @return sceneList
     */
    public java.util.List<SceneList> getSceneList() {
        return this.sceneList;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<SceneList> sceneList; 

        private Builder() {
        } 

        private Builder(DescribeScenesResponseBody model) {
            this.requestId = model.requestId;
            this.sceneList = model.sceneList;
        } 

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

        public DescribeScenesResponseBody build() {
            return new DescribeScenesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeScenesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeScenesResponseBody</p>
     */
    public static class SceneList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        @com.aliyun.core.annotation.NameInMap("Token")
        private String token;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private SceneList(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.sceneId = builder.sceneId;
            this.token = builder.token;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SceneList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        /**
         * @return token
         */
        public String getToken() {
            return this.token;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String sceneId; 
            private String token; 
            private String type; 

            private Builder() {
            } 

            private Builder(SceneList model) {
                this.description = model.description;
                this.name = model.name;
                this.sceneId = model.sceneId;
                this.token = model.token;
                this.type = model.type;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
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
             * Token.
             */
            public Builder token(String token) {
                this.token = token;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public SceneList build() {
                return new SceneList(this);
            } 

        } 

    }
}
