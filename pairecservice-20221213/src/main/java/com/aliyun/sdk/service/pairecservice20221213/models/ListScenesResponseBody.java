// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pairecservice20221213.models;

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
 * {@link ListScenesResponseBody} extends {@link TeaModel}
 *
 * <p>ListScenesResponseBody</p>
 */
public class ListScenesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Scenes")
    private java.util.List<Scenes> scenes;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListScenesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scenes = builder.scenes;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScenesResponseBody create() {
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
     * @return scenes
     */
    public java.util.List<Scenes> getScenes() {
        return this.scenes;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<Scenes> scenes; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListScenesResponseBody model) {
            this.requestId = model.requestId;
            this.scenes = model.scenes;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>B8987BF7-6028-5B17-80E0-251B7BD67BBA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Scenes.
         */
        public Builder scenes(java.util.List<Scenes> scenes) {
            this.scenes = scenes;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListScenesResponseBody build() {
            return new ListScenesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListScenesResponseBody} extends {@link TeaModel}
     *
     * <p>ListScenesResponseBody</p>
     */
    public static class Flows extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FlowCode")
        private String flowCode;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        private Flows(Builder builder) {
            this.flowCode = builder.flowCode;
            this.flowName = builder.flowName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Flows create() {
            return builder().build();
        }

        /**
         * @return flowCode
         */
        public String getFlowCode() {
            return this.flowCode;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        public static final class Builder {
            private String flowCode; 
            private String flowName; 

            private Builder() {
            } 

            private Builder(Flows model) {
                this.flowCode = model.flowCode;
                this.flowName = model.flowName;
            } 

            /**
             * FlowCode.
             */
            public Builder flowCode(String flowCode) {
                this.flowCode = flowCode;
                return this;
            }

            /**
             * FlowName.
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            public Flows build() {
                return new Flows(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListScenesResponseBody} extends {@link TeaModel}
     *
     * <p>ListScenesResponseBody</p>
     */
    public static class Scenes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Flows")
        private java.util.List<Flows> flows;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        private Scenes(Builder builder) {
            this.description = builder.description;
            this.flows = builder.flows;
            this.name = builder.name;
            this.sceneId = builder.sceneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Scenes create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return flows
         */
        public java.util.List<Flows> getFlows() {
            return this.flows;
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

        public static final class Builder {
            private String description; 
            private java.util.List<Flows> flows; 
            private String name; 
            private String sceneId; 

            private Builder() {
            } 

            private Builder(Scenes model) {
                this.description = model.description;
                this.flows = model.flows;
                this.name = model.name;
                this.sceneId = model.sceneId;
            } 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Flows.
             */
            public Builder flows(java.util.List<Flows> flows) {
                this.flows = flows;
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

            public Scenes build() {
                return new Scenes(this);
            } 

        } 

    }
}
