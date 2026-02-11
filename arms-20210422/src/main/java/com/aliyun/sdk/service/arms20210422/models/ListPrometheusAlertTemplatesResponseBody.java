// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

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
 * {@link ListPrometheusAlertTemplatesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPrometheusAlertTemplatesResponseBody</p>
 */
public class ListPrometheusAlertTemplatesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("PrometheusAlertTemplates")
    private java.util.List<PrometheusAlertTemplates> prometheusAlertTemplates;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPrometheusAlertTemplatesResponseBody(Builder builder) {
        this.prometheusAlertTemplates = builder.prometheusAlertTemplates;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPrometheusAlertTemplatesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return prometheusAlertTemplates
     */
    public java.util.List<PrometheusAlertTemplates> getPrometheusAlertTemplates() {
        return this.prometheusAlertTemplates;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<PrometheusAlertTemplates> prometheusAlertTemplates; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListPrometheusAlertTemplatesResponseBody model) {
            this.prometheusAlertTemplates = model.prometheusAlertTemplates;
            this.requestId = model.requestId;
        } 

        /**
         * PrometheusAlertTemplates.
         */
        public Builder prometheusAlertTemplates(java.util.List<PrometheusAlertTemplates> prometheusAlertTemplates) {
            this.prometheusAlertTemplates = prometheusAlertTemplates;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPrometheusAlertTemplatesResponseBody build() {
            return new ListPrometheusAlertTemplatesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPrometheusAlertTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusAlertTemplatesResponseBody</p>
     */
    public static class Annotations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Annotations(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Annotations create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Annotations model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Annotations build() {
                return new Annotations(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPrometheusAlertTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusAlertTemplatesResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Labels(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListPrometheusAlertTemplatesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPrometheusAlertTemplatesResponseBody</p>
     */
    public static class PrometheusAlertTemplates extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertName")
        private String alertName;

        @com.aliyun.core.annotation.NameInMap("Annotations")
        private java.util.List<Annotations> annotations;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private PrometheusAlertTemplates(Builder builder) {
            this.alertName = builder.alertName;
            this.annotations = builder.annotations;
            this.description = builder.description;
            this.duration = builder.duration;
            this.expression = builder.expression;
            this.labels = builder.labels;
            this.type = builder.type;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PrometheusAlertTemplates create() {
            return builder().build();
        }

        /**
         * @return alertName
         */
        public String getAlertName() {
            return this.alertName;
        }

        /**
         * @return annotations
         */
        public java.util.List<Annotations> getAnnotations() {
            return this.annotations;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
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
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String alertName; 
            private java.util.List<Annotations> annotations; 
            private String description; 
            private String duration; 
            private String expression; 
            private java.util.List<Labels> labels; 
            private String type; 
            private String version; 

            private Builder() {
            } 

            private Builder(PrometheusAlertTemplates model) {
                this.alertName = model.alertName;
                this.annotations = model.annotations;
                this.description = model.description;
                this.duration = model.duration;
                this.expression = model.expression;
                this.labels = model.labels;
                this.type = model.type;
                this.version = model.version;
            } 

            /**
             * AlertName.
             */
            public Builder alertName(String alertName) {
                this.alertName = alertName;
                return this;
            }

            /**
             * Annotations.
             */
            public Builder annotations(java.util.List<Annotations> annotations) {
                this.annotations = annotations;
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
             * Duration.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
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
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public PrometheusAlertTemplates build() {
                return new PrometheusAlertTemplates(this);
            } 

        } 

    }
}
