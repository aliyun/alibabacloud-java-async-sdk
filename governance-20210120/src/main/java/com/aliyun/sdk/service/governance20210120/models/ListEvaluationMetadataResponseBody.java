// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.governance20210120.models;

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
 * {@link ListEvaluationMetadataResponseBody} extends {@link TeaModel}
 *
 * <p>ListEvaluationMetadataResponseBody</p>
 */
public class ListEvaluationMetadataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EvaluationMetadata")
    private java.util.List<EvaluationMetadata> evaluationMetadata;

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

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return evaluationMetadata
     */
    public java.util.List<EvaluationMetadata> getEvaluationMetadata() {
        return this.evaluationMetadata;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<EvaluationMetadata> evaluationMetadata; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListEvaluationMetadataResponseBody model) {
            this.evaluationMetadata = model.evaluationMetadata;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The metadata of a governance maturity check.</p>
         */
        public Builder evaluationMetadata(java.util.List<EvaluationMetadata> evaluationMetadata) {
            this.evaluationMetadata = evaluationMetadata;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>16B208DD-86BD-5E7D-AC93-FFD44B6FBDF1</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListEvaluationMetadataResponseBody build() {
            return new ListEvaluationMetadataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListEvaluationMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationMetadataResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Guidance model) {
                this.buttonName = model.buttonName;
                this.buttonRef = model.buttonRef;
                this.content = model.content;
                this.title = model.title;
            } 

            /**
             * <p>The display name of the fixing button.</p>
             * 
             * <strong>example:</strong>
             * <p>Manual fixing</p>
             */
            public Builder buttonName(String buttonName) {
                this.buttonName = buttonName;
                return this;
            }

            /**
             * <p>The navigation URL of the fixing button.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://ram.console.aliyun.com/users">https://ram.console.aliyun.com/users</a></p>
             */
            public Builder buttonRef(String buttonRef) {
                this.buttonRef = buttonRef;
                return this;
            }

            /**
             * <p>The fixing procedure.</p>
             * 
             * <strong>example:</strong>
             * <p>You must replace the AccessKey pair of your Alibaba Cloud account. To do so, perform the following steps:</br>1. Log on to the RAM console. In the left-side navigation pane, choose Identities &gt; Users. On the Users page, click Create User.</br>2. On the Create User page, enter a logon name and select OpenAPI Access for the Access Mode parameter.</br>3. After the RAM user is created, save the AccessKey pair. Then, find the user that you created on the Users page and click Add Permissions in the Actions column. In the Grant Permission panel, find the AdministratorAccess policy and attach it to the RAM user.</br>4. In a program, replace the AccessKey pair of the Alibaba Cloud account with the AccessKey pair of the RAM user created in the previous step and check whether the program runs as expected in the test environment.</br>5. If the program runs as expected, publish the program to the production environment and disable the previous AccessKey pair of your Alibaba Cloud account. Then, check whether the program runs as expected.</br>6. If the program runs as expected, delete the disabled AccessKey pair after the specified period of time, such as 90 days.</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The title of the fixing procedure.</p>
             * 
             * <strong>example:</strong>
             * <p>Scenario 3: AccessKey pair that is used within the last 90 days</p>
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
    /**
     * 
     * {@link ListEvaluationMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationMetadataResponseBody</p>
     */
    public static class Actions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Classification")
        private String classification;

        @com.aliyun.core.annotation.NameInMap("CostDescription")
        private String costDescription;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Guidance")
        private java.util.List<Guidance> guidance;

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
        public java.util.List<Guidance> getGuidance() {
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
            private java.util.List<Guidance> guidance; 
            private String notice; 
            private String suggestion; 

            private Builder() {
            } 

            private Builder(Actions model) {
                this.classification = model.classification;
                this.costDescription = model.costDescription;
                this.description = model.description;
                this.guidance = model.guidance;
                this.notice = model.notice;
                this.suggestion = model.suggestion;
            } 

            /**
             * <p>The fixing method.</p>
             * <blockquote>
             * <p> This parameter is returned only if the value of <code>RemediationType</code> is <code>Analysis</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>UnusedAccessKeyInRamUser</p>
             */
            public Builder classification(String classification) {
                this.classification = classification;
                return this;
            }

            /**
             * <p>The fixing cost.</p>
             * 
             * <strong>example:</strong>
             * <p>You are not charged for this operation.</p>
             */
            public Builder costDescription(String costDescription) {
                this.costDescription = costDescription;
                return this;
            }

            /**
             * <p>The description of the fixing item.</p>
             * <blockquote>
             * <p> This parameter is returned only if the value of <code>RemediationType</code> is <code>Analysis</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Console logon is enabled for the RAM user. The RAM user owns an AccessKey pair that is never used.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The content of the fixing items.</p>
             */
            public Builder guidance(java.util.List<Guidance> guidance) {
                this.guidance = guidance;
                return this;
            }

            /**
             * <p>The usage notes of the fixing item.</p>
             * 
             * <strong>example:</strong>
             * <p>The BestPracticesForIdentityAndPermissions compliance package is enabled in Cloud Config to check the settings and usage of the AccessKey pair, Alibaba Cloud account, and RAM users.</p>
             */
            public Builder notice(String notice) {
                this.notice = notice;
                return this;
            }

            /**
             * <p>The fixing suggestion.</p>
             * <blockquote>
             * <p> This parameter is returned only if the value of <code>RemediationType</code> is <code>Analysis</code>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Console logon is enabled for the RAM user and the RAM user owns an AccessKey pair, while the AccessKey pair has never been used by the RAM user. We recommend that you disable the AccessKey pair for 90 days. If no related issue occurs during this period, you can delete the AccessKey pair.</p>
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
    /**
     * 
     * {@link ListEvaluationMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationMetadataResponseBody</p>
     */
    public static class Remediation extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actions")
        private java.util.List<Actions> actions;

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
        public java.util.List<Actions> getActions() {
            return this.actions;
        }

        /**
         * @return remediationType
         */
        public String getRemediationType() {
            return this.remediationType;
        }

        public static final class Builder {
            private java.util.List<Actions> actions; 
            private String remediationType; 

            private Builder() {
            } 

            private Builder(Remediation model) {
                this.actions = model.actions;
                this.remediationType = model.remediationType;
            } 

            /**
             * <p>The fixing operations.</p>
             */
            public Builder actions(java.util.List<Actions> actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>The type of the fixing method. Valid values:</p>
             * <ul>
             * <li>Manual: manual fixing</li>
             * <li>QuickFix: quick fixing</li>
             * <li>Analysis: auxiliary decision-making</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Manual</p>
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
    /**
     * 
     * {@link ListEvaluationMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationMetadataResponseBody</p>
     */
    public static class RemediationMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Remediation")
        private java.util.List<Remediation> remediation;

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
        public java.util.List<Remediation> getRemediation() {
            return this.remediation;
        }

        public static final class Builder {
            private java.util.List<Remediation> remediation; 

            private Builder() {
            } 

            private Builder(RemediationMetadata model) {
                this.remediation = model.remediation;
            } 

            /**
             * <p>The fixing items.</p>
             */
            public Builder remediation(java.util.List<Remediation> remediation) {
                this.remediation = remediation;
                return this;
            }

            public RemediationMetadata build() {
                return new RemediationMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEvaluationMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationMetadataResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(ResourcePropertyMetadata model) {
                this.displayName = model.displayName;
                this.propertyName = model.propertyName;
                this.propertyType = model.propertyType;
            } 

            /**
             * <p>The display name of the resource property.</p>
             * 
             * <strong>example:</strong>
             * <p>AccessKey Pair Last Used At</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The name of the resource property.</p>
             * 
             * <strong>example:</strong>
             * <p>AkLastUsedTime</p>
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            /**
             * <p>The type of the resource property.</p>
             * 
             * <strong>example:</strong>
             * <p>String</p>
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
    /**
     * 
     * {@link ListEvaluationMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationMetadataResponseBody</p>
     */
    public static class ResourceMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourcePropertyMetadata")
        private java.util.List<ResourcePropertyMetadata> resourcePropertyMetadata;

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
        public java.util.List<ResourcePropertyMetadata> getResourcePropertyMetadata() {
            return this.resourcePropertyMetadata;
        }

        public static final class Builder {
            private java.util.List<ResourcePropertyMetadata> resourcePropertyMetadata; 

            private Builder() {
            } 

            private Builder(ResourceMetadata model) {
                this.resourcePropertyMetadata = model.resourcePropertyMetadata;
            } 

            /**
             * <p>The metadata of the resource properties.</p>
             */
            public Builder resourcePropertyMetadata(java.util.List<ResourcePropertyMetadata> resourcePropertyMetadata) {
                this.resourcePropertyMetadata = resourcePropertyMetadata;
                return this;
            }

            public ResourceMetadata build() {
                return new ResourceMetadata(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListEvaluationMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationMetadataResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Metadata model) {
                this.category = model.category;
                this.description = model.description;
                this.displayName = model.displayName;
                this.id = model.id;
                this.recommendationLevel = model.recommendationLevel;
                this.remediationMetadata = model.remediationMetadata;
                this.resourceMetadata = model.resourceMetadata;
                this.scope = model.scope;
                this.stage = model.stage;
            } 

            /**
             * <p>The category of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>Security</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The description of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>If you use an AccessKey pair of an Alibaba Cloud account, you have full permissions on the resources of the account. You cannot set limits on the account, such as setting limits on source IP addresses or access duration. If the AccessKey pair is leaked, resources within the account are exposed to high security risks. If your Alibaba Cloud account has an existing AccessKey pair, the check result is Non-compliant.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The display name of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>An AccessKey pair is enabled for the Alibaba Cloud account.</p>
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * <p>The ID of the metadata.</p>
             * 
             * <strong>example:</strong>
             * <p>pxgtda****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The governance level of the check item.</p>
             * 
             * <strong>example:</strong>
             * <p>High</p>
             */
            public Builder recommendationLevel(String recommendationLevel) {
                this.recommendationLevel = recommendationLevel;
                return this;
            }

            /**
             * <p>The metadata of the fixing task.</p>
             */
            public Builder remediationMetadata(RemediationMetadata remediationMetadata) {
                this.remediationMetadata = remediationMetadata;
                return this;
            }

            /**
             * <p>The metadata of the checked resources.</p>
             */
            public Builder resourceMetadata(ResourceMetadata resourceMetadata) {
                this.resourceMetadata = resourceMetadata;
                return this;
            }

            /**
             * <p>The scope of the check item. Valid values:</p>
             * <ul>
             * <li>Account: the check item in a single-account governance maturity check</li>
             * <li>ResourceDirectory: the check item in a multi-account governance maturity check</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Account</p>
             */
            public Builder scope(String scope) {
                this.scope = scope;
                return this;
            }

            /**
             * <p>The status of the check item. Valid values:</p>
             * <ul>
             * <li>Released: The check item is released.</li>
             * <li>Beta: The check item is pre-released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Released</p>
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
    /**
     * 
     * {@link ListEvaluationMetadataResponseBody} extends {@link TeaModel}
     *
     * <p>ListEvaluationMetadataResponseBody</p>
     */
    public static class EvaluationMetadata extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Metadata")
        private java.util.List<Metadata> metadata;

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
        public java.util.List<Metadata> getMetadata() {
            return this.metadata;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private java.util.List<Metadata> metadata; 
            private String type; 

            private Builder() {
            } 

            private Builder(EvaluationMetadata model) {
                this.metadata = model.metadata;
                this.type = model.type;
            } 

            /**
             * <p>The metadata objects of a specific metadata type.</p>
             */
            public Builder metadata(java.util.List<Metadata> metadata) {
                this.metadata = metadata;
                return this;
            }

            /**
             * <p>The type of the metadata. Valid values:</p>
             * <ul>
             * <li>Metric: the check item</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Metric</p>
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
