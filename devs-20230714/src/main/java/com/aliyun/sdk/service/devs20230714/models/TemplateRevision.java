// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link TemplateRevision} extends {@link TeaModel}
 *
 * <p>TemplateRevision</p>
 */
public class TemplateRevision extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("createdTime")
    private String createdTime;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("kind")
    private String kind;

    @com.aliyun.core.annotation.NameInMap("labels")
    private java.util.Map<String, String> labels;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("spec")
    private TemplateSpec spec;

    @com.aliyun.core.annotation.NameInMap("status")
    private Status status;

    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    @com.aliyun.core.annotation.NameInMap("uid")
    private String uid;

    private TemplateRevision(Builder builder) {
        this.createdTime = builder.createdTime;
        this.description = builder.description;
        this.kind = builder.kind;
        this.labels = builder.labels;
        this.name = builder.name;
        this.spec = builder.spec;
        this.status = builder.status;
        this.templateName = builder.templateName;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateRevision create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
    }

    /**
     * @return labels
     */
    public java.util.Map<String, String> getLabels() {
        return this.labels;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return spec
     */
    public TemplateSpec getSpec() {
        return this.spec;
    }

    /**
     * @return status
     */
    public Status getStatus() {
        return this.status;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private String createdTime; 
        private String description; 
        private String kind; 
        private java.util.Map<String, String> labels; 
        private String name; 
        private TemplateSpec spec; 
        private Status status; 
        private String templateName; 
        private String uid; 

        private Builder() {
        } 

        private Builder(TemplateRevision model) {
            this.createdTime = model.createdTime;
            this.description = model.description;
            this.kind = model.kind;
            this.labels = model.labels;
            this.name = model.name;
            this.spec = model.spec;
            this.status = model.status;
            this.templateName = model.templateName;
            this.uid = model.uid;
        } 

        /**
         * createdTime.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * kind.
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * labels.
         */
        public Builder labels(java.util.Map<String, String> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * spec.
         */
        public Builder spec(TemplateSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * status.
         */
        public Builder status(Status status) {
            this.status = status;
            return this;
        }

        /**
         * templateName.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * uid.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public TemplateRevision build() {
            return new TemplateRevision(this);
        } 

    } 

    /**
     * 
     * {@link TemplateRevision} extends {@link TeaModel}
     *
     * <p>TemplateRevision</p>
     */
    public static class Status extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("packageUrl")
        private String packageUrl;

        @com.aliyun.core.annotation.NameInMap("phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("pipelineName")
        private String pipelineName;

        @com.aliyun.core.annotation.NameInMap("templateUrl")
        private String templateUrl;

        private Status(Builder builder) {
            this.packageUrl = builder.packageUrl;
            this.phase = builder.phase;
            this.pipelineName = builder.pipelineName;
            this.templateUrl = builder.templateUrl;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Status create() {
            return builder().build();
        }

        /**
         * @return packageUrl
         */
        public String getPackageUrl() {
            return this.packageUrl;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return pipelineName
         */
        public String getPipelineName() {
            return this.pipelineName;
        }

        /**
         * @return templateUrl
         */
        public String getTemplateUrl() {
            return this.templateUrl;
        }

        public static final class Builder {
            private String packageUrl; 
            private String phase; 
            private String pipelineName; 
            private String templateUrl; 

            private Builder() {
            } 

            private Builder(Status model) {
                this.packageUrl = model.packageUrl;
                this.phase = model.phase;
                this.pipelineName = model.pipelineName;
                this.templateUrl = model.templateUrl;
            } 

            /**
             * packageUrl.
             */
            public Builder packageUrl(String packageUrl) {
                this.packageUrl = packageUrl;
                return this;
            }

            /**
             * phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * pipelineName.
             */
            public Builder pipelineName(String pipelineName) {
                this.pipelineName = pipelineName;
                return this;
            }

            /**
             * templateUrl.
             */
            public Builder templateUrl(String templateUrl) {
                this.templateUrl = templateUrl;
                return this;
            }

            public Status build() {
                return new Status(this);
            } 

        } 

    }
}
