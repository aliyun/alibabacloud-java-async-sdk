// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAlertTemplateResponseBody} extends {@link TeaModel}
 *
 * <p>CreateAlertTemplateResponseBody</p>
 */
public class CreateAlertTemplateResponseBody extends TeaModel {
    @NameInMap("AlertTemplate")
    private AlertTemplate alertTemplate;

    @NameInMap("RequestId")
    private String requestId;

    private CreateAlertTemplateResponseBody(Builder builder) {
        this.alertTemplate = builder.alertTemplate;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertTemplateResponseBody create() {
        return builder().build();
    }

    /**
     * @return alertTemplate
     */
    public AlertTemplate getAlertTemplate() {
        return this.alertTemplate;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AlertTemplate alertTemplate; 
        private String requestId; 

        /**
         * AlertTemplate.
         */
        public Builder alertTemplate(AlertTemplate alertTemplate) {
            this.alertTemplate = alertTemplate;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateAlertTemplateResponseBody build() {
            return new CreateAlertTemplateResponseBody(this);
        } 

    } 

    public static class LabelMatchExpressions extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
        private String value;

        private LabelMatchExpressions(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelMatchExpressions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public LabelMatchExpressions build() {
                return new LabelMatchExpressions(this);
            } 

        } 

    }
    public static class LabelMatchExpressionGroups extends TeaModel {
        @NameInMap("LabelMatchExpressions")
        private java.util.List < LabelMatchExpressions> labelMatchExpressions;

        private LabelMatchExpressionGroups(Builder builder) {
            this.labelMatchExpressions = builder.labelMatchExpressions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelMatchExpressionGroups create() {
            return builder().build();
        }

        /**
         * @return labelMatchExpressions
         */
        public java.util.List < LabelMatchExpressions> getLabelMatchExpressions() {
            return this.labelMatchExpressions;
        }

        public static final class Builder {
            private java.util.List < LabelMatchExpressions> labelMatchExpressions; 

            /**
             * LabelMatchExpressions.
             */
            public Builder labelMatchExpressions(java.util.List < LabelMatchExpressions> labelMatchExpressions) {
                this.labelMatchExpressions = labelMatchExpressions;
                return this;
            }

            public LabelMatchExpressionGroups build() {
                return new LabelMatchExpressionGroups(this);
            } 

        } 

    }
    public static class LabelMatchExpressionGrid extends TeaModel {
        @NameInMap("LabelMatchExpressionGroups")
        private java.util.List < LabelMatchExpressionGroups> labelMatchExpressionGroups;

        private LabelMatchExpressionGrid(Builder builder) {
            this.labelMatchExpressionGroups = builder.labelMatchExpressionGroups;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LabelMatchExpressionGrid create() {
            return builder().build();
        }

        /**
         * @return labelMatchExpressionGroups
         */
        public java.util.List < LabelMatchExpressionGroups> getLabelMatchExpressionGroups() {
            return this.labelMatchExpressionGroups;
        }

        public static final class Builder {
            private java.util.List < LabelMatchExpressionGroups> labelMatchExpressionGroups; 

            /**
             * LabelMatchExpressionGroups.
             */
            public Builder labelMatchExpressionGroups(java.util.List < LabelMatchExpressionGroups> labelMatchExpressionGroups) {
                this.labelMatchExpressionGroups = labelMatchExpressionGroups;
                return this;
            }

            public LabelMatchExpressionGrid build() {
                return new LabelMatchExpressionGrid(this);
            } 

        } 

    }
    public static class AlertTemplate extends TeaModel {
        @NameInMap("AlertProvider")
        private String alertProvider;

        @NameInMap("Annotations")
        private java.util.Map < String, ? > annotations;

        @NameInMap("Id")
        private Integer id;

        @NameInMap("LabelMatchExpressionGrid")
        private LabelMatchExpressionGrid labelMatchExpressionGrid;

        @NameInMap("Labels")
        private java.util.Map < String, ? > labels;

        @NameInMap("Message")
        private String message;

        @NameInMap("Name")
        private String name;

        @NameInMap("ParentId")
        private Integer parentId;

        @NameInMap("Public")
        private Boolean _public;

        @NameInMap("Rule")
        private String rule;

        @NameInMap("Status")
        private Boolean status;

        @NameInMap("TemplateProvider")
        private String templateProvider;

        @NameInMap("Type")
        private String type;

        @NameInMap("UserId")
        private String userId;

        private AlertTemplate(Builder builder) {
            this.alertProvider = builder.alertProvider;
            this.annotations = builder.annotations;
            this.id = builder.id;
            this.labelMatchExpressionGrid = builder.labelMatchExpressionGrid;
            this.labels = builder.labels;
            this.message = builder.message;
            this.name = builder.name;
            this.parentId = builder.parentId;
            this._public = builder._public;
            this.rule = builder.rule;
            this.status = builder.status;
            this.templateProvider = builder.templateProvider;
            this.type = builder.type;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlertTemplate create() {
            return builder().build();
        }

        /**
         * @return alertProvider
         */
        public String getAlertProvider() {
            return this.alertProvider;
        }

        /**
         * @return annotations
         */
        public java.util.Map < String, ? > getAnnotations() {
            return this.annotations;
        }

        /**
         * @return id
         */
        public Integer getId() {
            return this.id;
        }

        /**
         * @return labelMatchExpressionGrid
         */
        public LabelMatchExpressionGrid getLabelMatchExpressionGrid() {
            return this.labelMatchExpressionGrid;
        }

        /**
         * @return labels
         */
        public java.util.Map < String, ? > getLabels() {
            return this.labels;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public Integer getParentId() {
            return this.parentId;
        }

        /**
         * @return _public
         */
        public Boolean get_public() {
            return this._public;
        }

        /**
         * @return rule
         */
        public String getRule() {
            return this.rule;
        }

        /**
         * @return status
         */
        public Boolean getStatus() {
            return this.status;
        }

        /**
         * @return templateProvider
         */
        public String getTemplateProvider() {
            return this.templateProvider;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String alertProvider; 
            private java.util.Map < String, ? > annotations; 
            private Integer id; 
            private LabelMatchExpressionGrid labelMatchExpressionGrid; 
            private java.util.Map < String, ? > labels; 
            private String message; 
            private String name; 
            private Integer parentId; 
            private Boolean _public; 
            private String rule; 
            private Boolean status; 
            private String templateProvider; 
            private String type; 
            private String userId; 

            /**
             * AlertProvider.
             */
            public Builder alertProvider(String alertProvider) {
                this.alertProvider = alertProvider;
                return this;
            }

            /**
             * Annotations.
             */
            public Builder annotations(java.util.Map < String, ? > annotations) {
                this.annotations = annotations;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(Integer id) {
                this.id = id;
                return this;
            }

            /**
             * LabelMatchExpressionGrid.
             */
            public Builder labelMatchExpressionGrid(LabelMatchExpressionGrid labelMatchExpressionGrid) {
                this.labelMatchExpressionGrid = labelMatchExpressionGrid;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.Map < String, ? > labels) {
                this.labels = labels;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
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
             * ParentId.
             */
            public Builder parentId(Integer parentId) {
                this.parentId = parentId;
                return this;
            }

            /**
             * Public.
             */
            public Builder _public(Boolean _public) {
                this._public = _public;
                return this;
            }

            /**
             * Rule.
             */
            public Builder rule(String rule) {
                this.rule = rule;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Boolean status) {
                this.status = status;
                return this;
            }

            /**
             * TemplateProvider.
             */
            public Builder templateProvider(String templateProvider) {
                this.templateProvider = templateProvider;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public AlertTemplate build() {
                return new AlertTemplate(this);
            } 

        } 

    }
}
