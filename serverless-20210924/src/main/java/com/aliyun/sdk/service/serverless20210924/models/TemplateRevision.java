// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TemplateRevision} extends {@link TeaModel}
 *
 * <p>TemplateRevision</p>
 */
public class TemplateRevision extends TeaModel {
    @NameInMap("createdTime")
    private String createdTime;

    @NameInMap("kind")
    private String kind;

    @NameInMap("spec")
    @Validation(required = true)
    private TemplateSpec spec;

    @NameInMap("status")
    private TemplateStatus status;

    @NameInMap("templateGeneration")
    private Integer templateGeneration;

    @NameInMap("templateName")
    private String templateName;

    @NameInMap("templateVersion")
    private Integer templateVersion;

    @NameInMap("uid")
    private String uid;

    private TemplateRevision(Builder builder) {
        this.createdTime = builder.createdTime;
        this.kind = builder.kind;
        this.spec = builder.spec;
        this.status = builder.status;
        this.templateGeneration = builder.templateGeneration;
        this.templateName = builder.templateName;
        this.templateVersion = builder.templateVersion;
        this.uid = builder.uid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TemplateRevision create() {
        return builder().build();
    }

    /**
     * @return createdTime
     */
    public String getCreatedTime() {
        return this.createdTime;
    }

    /**
     * @return kind
     */
    public String getKind() {
        return this.kind;
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
    public TemplateStatus getStatus() {
        return this.status;
    }

    /**
     * @return templateGeneration
     */
    public Integer getTemplateGeneration() {
        return this.templateGeneration;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateVersion
     */
    public Integer getTemplateVersion() {
        return this.templateVersion;
    }

    /**
     * @return uid
     */
    public String getUid() {
        return this.uid;
    }

    public static final class Builder {
        private String createdTime; 
        private String kind; 
        private TemplateSpec spec; 
        private TemplateStatus status; 
        private Integer templateGeneration; 
        private String templateName; 
        private Integer templateVersion; 
        private String uid; 

        /**
         * A time representing the server time when this object was created. Clients may not set this value. Populated by the system. Read-only.
         */
        public Builder createdTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }

        /**
         * The kind of the resource.
         */
        public Builder kind(String kind) {
            this.kind = kind;
            return this;
        }

        /**
         * Specification of the desired behavior of the Template.
         */
        public Builder spec(TemplateSpec spec) {
            this.spec = spec;
            return this;
        }

        /**
         * Most recently observed status of the Template. This data may not be up-to-date. Populated by the system. Read-only.
         */
        public Builder status(TemplateStatus status) {
            this.status = status;
            return this;
        }

        /**
         * The generation of the template.
         */
        public Builder templateGeneration(Integer templateGeneration) {
            this.templateGeneration = templateGeneration;
            return this;
        }

        /**
         * The name of a template.
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        /**
         * The version of a template.
         */
        public Builder templateVersion(Integer templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }

        /**
         * Main user ID of an Aliyun account.
         */
        public Builder uid(String uid) {
            this.uid = uid;
            return this;
        }

        public TemplateRevision build() {
            return new TemplateRevision(this);
        } 

    } 

}
