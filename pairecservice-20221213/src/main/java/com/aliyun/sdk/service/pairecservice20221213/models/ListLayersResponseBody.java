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
 * {@link ListLayersResponseBody} extends {@link TeaModel}
 *
 * <p>ListLayersResponseBody</p>
 */
public class ListLayersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Layers")
    private java.util.List<Layers> layers;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListLayersResponseBody(Builder builder) {
        this.layers = builder.layers;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLayersResponseBody create() {
        return builder().build();
    }

    /**
     * @return layers
     */
    public java.util.List<Layers> getLayers() {
        return this.layers;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Layers> layers; 
        private String requestId; 
        private Long totalCount; 

        /**
         * Layers.
         */
        public Builder layers(java.util.List<Layers> layers) {
            this.layers = layers;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>518C64F6-DFF7-11ED-85B0-00163E14B3D1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLayersResponseBody build() {
            return new ListLayersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListLayersResponseBody} extends {@link TeaModel}
     *
     * <p>ListLayersResponseBody</p>
     */
    public static class Layers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
        private String gmtCreateTime;

        @com.aliyun.core.annotation.NameInMap("LaboratoryId")
        private String laboratoryId;

        @com.aliyun.core.annotation.NameInMap("LayerId")
        private String layerId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ResidualFlow")
        private Long residualFlow;

        @com.aliyun.core.annotation.NameInMap("SceneId")
        private String sceneId;

        private Layers(Builder builder) {
            this.description = builder.description;
            this.gmtCreateTime = builder.gmtCreateTime;
            this.laboratoryId = builder.laboratoryId;
            this.layerId = builder.layerId;
            this.name = builder.name;
            this.residualFlow = builder.residualFlow;
            this.sceneId = builder.sceneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Layers create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return gmtCreateTime
         */
        public String getGmtCreateTime() {
            return this.gmtCreateTime;
        }

        /**
         * @return laboratoryId
         */
        public String getLaboratoryId() {
            return this.laboratoryId;
        }

        /**
         * @return layerId
         */
        public String getLayerId() {
            return this.layerId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return residualFlow
         */
        public Long getResidualFlow() {
            return this.residualFlow;
        }

        /**
         * @return sceneId
         */
        public String getSceneId() {
            return this.sceneId;
        }

        public static final class Builder {
            private String description; 
            private String gmtCreateTime; 
            private String laboratoryId; 
            private String layerId; 
            private String name; 
            private Long residualFlow; 
            private String sceneId; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * GmtCreateTime.
             */
            public Builder gmtCreateTime(String gmtCreateTime) {
                this.gmtCreateTime = gmtCreateTime;
                return this;
            }

            /**
             * LaboratoryId.
             */
            public Builder laboratoryId(String laboratoryId) {
                this.laboratoryId = laboratoryId;
                return this;
            }

            /**
             * LayerId.
             */
            public Builder layerId(String layerId) {
                this.layerId = layerId;
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
             * ResidualFlow.
             */
            public Builder residualFlow(Long residualFlow) {
                this.residualFlow = residualFlow;
                return this;
            }

            /**
             * SceneId.
             */
            public Builder sceneId(String sceneId) {
                this.sceneId = sceneId;
                return this;
            }

            public Layers build() {
                return new Layers(this);
            } 

        } 

    }
}
