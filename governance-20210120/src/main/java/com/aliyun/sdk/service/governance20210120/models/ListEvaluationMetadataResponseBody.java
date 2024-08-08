// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListEvaluationMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>ListEvaluationMetadataResponseBody</p>
 */
public class ListEvaluationMetadataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EvaluationMetadata")
    private java.util.List < EvaluationMetadata> evaluationMetadata;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListEvaluationMetadataResponseBody(Builder builder) {
        this.evaluationMetadata = builder.evaluationMetadata;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListEvaluationMetadataResponseBody create() {
        return builder().build();
    }

    /**
     * @return evaluationMetadata
     */
    public java.util.List < EvaluationMetadata> getEvaluationMetadata() {
        return this.evaluationMetadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List < EvaluationMetadata> evaluationMetadata; 
        private String requestId; 

        /**
         * EvaluationMetadata.
         */
        public Builder evaluationMetadata(java.util.List < EvaluationMetadata> evaluationMetadata) {
            this.evaluationMetadata = evaluationMetadata;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEvaluationMetadataResponseBody build() {
            return new ListEvaluationMetadataResponseBody(this);
        } 

    } 

    public static class Guidance extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ButtonName")
        private String buttonName;

        @com.aliyun.core.annotation.NameInMap("ButtonRef")
        private String buttonRef;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Title")
        private String title;

        private Guidance(Builder builder) {
            this.buttonName = builder.buttonName;
            this.buttonRef = builder.buttonRef;
            this.content = builder.content;
            this.title = builder.title;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Guidance create() {
            return builder().build();
        }

        /**
         * @return buttonName
         */
        public String getButtonName() {
            return this.buttonName;
        }

        /**
         * @return buttonRef
         */
        public String getButtonRef() {
            return this.buttonRef;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        public static final class Builder {
            private String buttonName; 
            private String buttonRef; 
            private String content; 
            private String title; 

            /**
             * ButtonName.
             */
            public Builder buttonName(String buttonName) {
                this.buttonName = buttonName;
                return this;
            }

            /**
             * ButtonRef.
             */
            public Builder buttonRef(String buttonRef) {
                this.buttonRef = buttonRef;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            public Guidance build() {
                return new Guidance(this);
            } 

        } 

    }
    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Classification")
        private String classification;

        @com.aliyun.core.annotation.NameInMap("CostDescription")
        private String costDescription;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Guidance")
        private java.util.List < Guidance> guidance;

        @com.aliyun.core.annotation.NameInMap("Notice")
        private String notice;

        @com.aliyun.core.annotation.NameInMap("Suggestion")
        private String suggestion;

        private Actions(Builder builder) {
            this.classification = builder.classification;
            this.costDescription = builder.costDescription;
            this.description = builder.description;
            this.guidance = builder.guidance;
            this.notice = builder.notice;
            this.suggestion = builder.suggestion;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Actions create() {
            return builder().build();
        }

        /**
         * @return classification
         */
        public String getClassification() {
            return this.classification;
        }

        /**
         * @return costDescription
         */
        public String getCostDescription() {
            return this.costDescription;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return guidance
         */
        public java.util.List < Guidance> getGuidance() {
            return this.guidance;
        }

        /**
         * @return notice
         */
        public String getNotice() {
            return this.notice;
        }

        /**
         * @return suggestion
         */
        public String getSuggestion() {
            return this.suggestion;
        }

        public static final class Builder {
            private String classification; 
            private String costDescription; 
            private String description; 
            private java.util.List < Guidance> guidance; 
            private String notice; 
            private String suggestion; 

            /**
             * Classification.
             */
            public Builder classification(String classification) {
                this.classification = classification;
                return this;
            }

            /**
             * CostDescription.
             */
            public Builder costDescription(String costDescription) {
                this.costDescription = costDescription;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Guidance.
             */
            public Builder guidance(java.util.List < Guidance> guidance) {
                this.guidance = guidance;
                return this;
            }

            /**
             * Notice.
             */
            public Builder notice(String notice) {
                this.notice = notice;
                return this;
            }

            /**
             * Suggestion.
             */
            public Builder suggestion(String suggestion) {
                this.suggestion = suggestion;
                return this;
            }

            public Actions build() {
                return new Actions(this);
            } 

        } 

    }
    public static class Remediation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actions")
        private java.util.List < Actions> actions;

        @com.aliyun.core.annotation.NameInMap("RemediationType")
        private String remediationType;

        private Remediation(Builder builder) {
            this.actions = builder.actions;
            this.remediationType = builder.remediationType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Remediation create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public java.util.List < Actions> getActions() {
            return this.actions;
        }

        /**
         * @return remediationType
         */
        public String getRemediationType() {
            return this.remediationType;
        }

        public static final class Builder {
            private java.util.List < Actions> actions; 
            private String remediationType; 

            /**
             * Actions.
             */
            public Builder actions(java.util.List < Actions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * RemediationType.
             */
            public Builder remediationType(String remediationType) {
                this.remediationType = remediationType;
                return this;
            }

            public Remediation build() {
                return new Remediation(this);
            } 

        } 

    }
    public static class RemediationMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Remediation")
        private java.util.List < Remediation> remediation;

        private RemediationMetadata(Builder builder) {
            this.remediation = builder.remediation;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemediationMetadata create() {
            return builder().build();
        }

        /**
         * @return remediation
         */
        public java.util.List < Remediation> getRemediation() {
            return this.remediation;
        }

        public static final class Builder {
            private java.util.List < Remediation> remediation; 

            /**
             * Remediation.
             */
            public Builder remediation(java.util.List < Remediation> remediation) {
                this.remediation = remediation;
                return this;
            }

            public RemediationMetadata build() {
                return new RemediationMetadata(this);
            } 

        } 

    }
    public static class ResourcePropertyMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("PropertyName")
        private String propertyName;

        @com.aliyun.core.annotation.NameInMap("PropertyType")
        private String propertyType;

        private ResourcePropertyMetadata(Builder builder) {
            this.displayName = builder.displayName;
            this.propertyName = builder.propertyName;
            this.propertyType = builder.propertyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourcePropertyMetadata create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return propertyName
         */
        public String getPropertyName() {
            return this.propertyName;
        }

        /**
         * @return propertyType
         */
        public String getPropertyType() {
            return this.propertyType;
        }

        public static final class Builder {
            private String displayName; 
            private String propertyName; 
            private String propertyType; 

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * PropertyName.
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            /**
             * PropertyType.
             */
            public Builder propertyType(String propertyType) {
                this.propertyType = propertyType;
                return this;
            }

            public ResourcePropertyMetadata build() {
                return new ResourcePropertyMetadata(this);
            } 

        } 

    }
    public static class ResourceMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourcePropertyMetadata")
        private java.util.List < ResourcePropertyMetadata> resourcePropertyMetadata;

        private ResourceMetadata(Builder builder) {
            this.resourcePropertyMetadata = builder.resourcePropertyMetadata;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceMetadata create() {
            return builder().build();
        }

        /**
         * @return resourcePropertyMetadata
         */
        public java.util.List < ResourcePropertyMetadata> getResourcePropertyMetadata() {
            return this.resourcePropertyMetadata;
        }

        public static final class Builder {
            private java.util.List < ResourcePropertyMetadata> resourcePropertyMetadata; 

            /**
             * ResourcePropertyMetadata.
             */
            public Builder resourcePropertyMetadata(java.util.List < ResourcePropertyMetadata> resourcePropertyMetadata) {
                this.resourcePropertyMetadata = resourcePropertyMetadata;
                return this;
            }

            public ResourceMetadata build() {
                return new ResourceMetadata(this);
            } 

        } 

    }
    public static class Metadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DisplayName")
        private String displayName;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("RecommendationLevel")
        private String recommendationLevel;

        @com.aliyun.core.annotation.NameInMap("RemediationMetadata")
        private RemediationMetadata remediationMetadata;

        @com.aliyun.core.annotation.NameInMap("ResourceMetadata")
        private ResourceMetadata resourceMetadata;

        @com.aliyun.core.annotation.NameInMap("Scope")
        private String scope;

        @com.aliyun.core.annotation.NameInMap("Stage")
        private String stage;

        private Metadata(Builder builder) {
            this.category = builder.category;
            this.description = builder.description;
            this.displayName = builder.displayName;
            this.id = builder.id;
            this.recommendationLevel = builder.recommendationLevel;
            this.remediationMetadata = builder.remediationMetadata;
            this.resourceMetadata = builder.resourceMetadata;
            this.scope = builder.scope;
            this.stage = builder.stage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Metadata create() {
            return builder().build();
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return recommendationLevel
         */
        public String getRecommendationLevel() {
            return this.recommendationLevel;
        }

        /**
         * @return remediationMetadata
         */
        public RemediationMetadata getRemediationMetadata() {
            return this.remediationMetadata;
        }

        /**
         * @return resourceMetadata
         */
        public ResourceMetadata getResourceMetadata() {
            return this.resourceMetadata;
        }

        /**
         * @return scope
         */
        public String getScope() {
            return this.scope;
        }

        /**
         * @return stage
         */
        public String getStage() {
            return this.stage;
        }

        public static final class Builder {
            private String category; 
            private String description; 
            private String displayName; 
            private String id; 
            private String recommendationLevel; 
            private RemediationMetadata remediationMetadata; 
            private ResourceMetadata resourceMetadata; 
            private String scope; 
            private String stage; 

            /**
             * Category.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * DisplayName.
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * RecommendationLevel.
             */
            public Builder recommendationLevel(String recommendationLevel) {
                this.recommendationLevel = recommendationLevel;
                return this;
            }

            /**
             * RemediationMetadata.
             */
            public Builder remediationMetadata(RemediationMetadata remediationMetadata) {
                this.remediationMetadata = remediationMetadata;
                return this;
            }

            /**
             * ResourceMetadata.
             */
            public Builder resourceMetadata(ResourceMetadata resourceMetadata) {
                this.resourceMetadata = resourceMetadata;
                return this;
            }

            /**
             * Scope.
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * Stage.
             */
            public Builder stage(String stage) {
                this.stage = stage;
                return this;
            }

            public Metadata build() {
                return new Metadata(this);
            } 

        } 

    }
    public static class EvaluationMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.List < Metadata> metadata;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private EvaluationMetadata(Builder builder) {
            this.metadata = builder.metadata;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EvaluationMetadata create() {
            return builder().build();
        }

        /**
         * @return metadata
         */
        public java.util.List < Metadata> getMetadata() {
            return this.metadata;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List < Metadata> metadata; 
            private String type; 

            /**
             * Metadata.
             */
            public Builder metadata(java.util.List < Metadata> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EvaluationMetadata build() {
                return new EvaluationMetadata(this);
            } 

        } 

    }
}
