// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFeatureViewRelationshipsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeatureViewRelationshipsResponseBody</p>
 */
public class ListFeatureViewRelationshipsResponseBody extends TeaModel {
    @NameInMap("Relationships")
    private java.util.List < Relationships> relationships;

    @NameInMap("RequestId")
    private String requestId;

    private ListFeatureViewRelationshipsResponseBody(Builder builder) {
        this.relationships = builder.relationships;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureViewRelationshipsResponseBody create() {
        return builder().build();
    }

    /**
     * @return relationships
     */
    public java.util.List < Relationships> getRelationships() {
        return this.relationships;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < Relationships> relationships; 
        private String requestId; 

        /**
         * Relationships.
         */
        public Builder relationships(java.util.List < Relationships> relationships) {
            this.relationships = relationships;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListFeatureViewRelationshipsResponseBody build() {
            return new ListFeatureViewRelationshipsResponseBody(this);
        } 

    } 

    public static class Models extends TeaModel {
        @NameInMap("ModelId")
        private String modelId;

        @NameInMap("ModelName")
        private String modelName;

        private Models(Builder builder) {
            this.modelId = builder.modelId;
            this.modelName = builder.modelName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Models create() {
            return builder().build();
        }

        /**
         * @return modelId
         */
        public String getModelId() {
            return this.modelId;
        }

        /**
         * @return modelName
         */
        public String getModelName() {
            return this.modelName;
        }

        public static final class Builder {
            private String modelId; 
            private String modelName; 

            /**
             * ModelId.
             */
            public Builder modelId(String modelId) {
                this.modelId = modelId;
                return this;
            }

            /**
             * ModelName.
             */
            public Builder modelName(String modelName) {
                this.modelName = modelName;
                return this;
            }

            public Models build() {
                return new Models(this);
            } 

        } 

    }
    public static class Relationships extends TeaModel {
        @NameInMap("FeatureViewName")
        private String featureViewName;

        @NameInMap("Models")
        private java.util.List < Models> models;

        @NameInMap("ProjectName")
        private String projectName;

        private Relationships(Builder builder) {
            this.featureViewName = builder.featureViewName;
            this.models = builder.models;
            this.projectName = builder.projectName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Relationships create() {
            return builder().build();
        }

        /**
         * @return featureViewName
         */
        public String getFeatureViewName() {
            return this.featureViewName;
        }

        /**
         * @return models
         */
        public java.util.List < Models> getModels() {
            return this.models;
        }

        /**
         * @return projectName
         */
        public String getProjectName() {
            return this.projectName;
        }

        public static final class Builder {
            private String featureViewName; 
            private java.util.List < Models> models; 
            private String projectName; 

            /**
             * FeatureViewName.
             */
            public Builder featureViewName(String featureViewName) {
                this.featureViewName = featureViewName;
                return this;
            }

            /**
             * Models.
             */
            public Builder models(java.util.List < Models> models) {
                this.models = models;
                return this;
            }

            /**
             * ProjectName.
             */
            public Builder projectName(String projectName) {
                this.projectName = projectName;
                return this;
            }

            public Relationships build() {
                return new Relationships(this);
            } 

        } 

    }
}
