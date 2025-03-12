// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paifeaturestore20230621.models;

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
 * {@link ListFeatureViewFieldRelationshipsResponseBody} extends {@link TeaModel}
 *
 * <p>ListFeatureViewFieldRelationshipsResponseBody</p>
 */
public class ListFeatureViewFieldRelationshipsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Relationships")
    private java.util.List<Relationships> relationships;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListFeatureViewFieldRelationshipsResponseBody(Builder builder) {
        this.relationships = builder.relationships;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListFeatureViewFieldRelationshipsResponseBody create() {
        return builder().build();
    }

    /**
     * @return relationships
     */
    public java.util.List<Relationships> getRelationships() {
        return this.relationships;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Relationships> relationships; 
        private String requestId; 

        /**
         * Relationships.
         */
        public Builder relationships(java.util.List<Relationships> relationships) {
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

        public ListFeatureViewFieldRelationshipsResponseBody build() {
            return new ListFeatureViewFieldRelationshipsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListFeatureViewFieldRelationshipsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFeatureViewFieldRelationshipsResponseBody</p>
     */
    public static class Models extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureAliasName")
        private String featureAliasName;

        @com.aliyun.core.annotation.NameInMap("ModelId")
        private String modelId;

        @com.aliyun.core.annotation.NameInMap("ModelName")
        private String modelName;

        private Models(Builder builder) {
            this.featureAliasName = builder.featureAliasName;
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
         * @return featureAliasName
         */
        public String getFeatureAliasName() {
            return this.featureAliasName;
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
            private String featureAliasName; 
            private String modelId; 
            private String modelName; 

            /**
             * FeatureAliasName.
             */
            public Builder featureAliasName(String featureAliasName) {
                this.featureAliasName = featureAliasName;
                return this;
            }

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
    /**
     * 
     * {@link ListFeatureViewFieldRelationshipsResponseBody} extends {@link TeaModel}
     *
     * <p>ListFeatureViewFieldRelationshipsResponseBody</p>
     */
    public static class Relationships extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FeatureName")
        private String featureName;

        @com.aliyun.core.annotation.NameInMap("Models")
        private java.util.List<Models> models;

        @com.aliyun.core.annotation.NameInMap("OfflineTableName")
        private String offlineTableName;

        @com.aliyun.core.annotation.NameInMap("OnlineTableName")
        private String onlineTableName;

        private Relationships(Builder builder) {
            this.featureName = builder.featureName;
            this.models = builder.models;
            this.offlineTableName = builder.offlineTableName;
            this.onlineTableName = builder.onlineTableName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Relationships create() {
            return builder().build();
        }

        /**
         * @return featureName
         */
        public String getFeatureName() {
            return this.featureName;
        }

        /**
         * @return models
         */
        public java.util.List<Models> getModels() {
            return this.models;
        }

        /**
         * @return offlineTableName
         */
        public String getOfflineTableName() {
            return this.offlineTableName;
        }

        /**
         * @return onlineTableName
         */
        public String getOnlineTableName() {
            return this.onlineTableName;
        }

        public static final class Builder {
            private String featureName; 
            private java.util.List<Models> models; 
            private String offlineTableName; 
            private String onlineTableName; 

            /**
             * FeatureName.
             */
            public Builder featureName(String featureName) {
                this.featureName = featureName;
                return this;
            }

            /**
             * Models.
             */
            public Builder models(java.util.List<Models> models) {
                this.models = models;
                return this;
            }

            /**
             * OfflineTableName.
             */
            public Builder offlineTableName(String offlineTableName) {
                this.offlineTableName = offlineTableName;
                return this;
            }

            /**
             * OnlineTableName.
             */
            public Builder onlineTableName(String onlineTableName) {
                this.onlineTableName = onlineTableName;
                return this;
            }

            public Relationships build() {
                return new Relationships(this);
            } 

        } 

    }
}
