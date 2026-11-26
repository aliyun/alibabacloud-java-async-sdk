// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link AlertRuleTemplateBody} extends {@link TeaModel}
 *
 * <p>AlertRuleTemplateBody</p>
 */
public class AlertRuleTemplateBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("labels")
    private String labels;

    @com.aliyun.core.annotation.NameInMap("ruleConfigs")
    private String ruleConfigs;

    @com.aliyun.core.annotation.NameInMap("scenes")
    private String scenes;

    @com.aliyun.core.annotation.NameInMap("schemaVersion")
    private String schemaVersion;

    @com.aliyun.core.annotation.NameInMap("status")
    private Integer status;

    @com.aliyun.core.annotation.NameInMap("templateName")
    private String templateName;

    private AlertRuleTemplateBody(Builder builder) {
        this.description = builder.description;
        this.labels = builder.labels;
        this.ruleConfigs = builder.ruleConfigs;
        this.scenes = builder.scenes;
        this.schemaVersion = builder.schemaVersion;
        this.status = builder.status;
        this.templateName = builder.templateName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlertRuleTemplateBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return labels
     */
    public String getLabels() {
        return this.labels;
    }

    /**
     * @return ruleConfigs
     */
    public String getRuleConfigs() {
        return this.ruleConfigs;
    }

    /**
     * @return scenes
     */
    public String getScenes() {
        return this.scenes;
    }

    /**
     * @return schemaVersion
     */
    public String getSchemaVersion() {
        return this.schemaVersion;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    public static final class Builder {
        private String description; 
        private String labels; 
        private String ruleConfigs; 
        private String scenes; 
        private String schemaVersion; 
        private Integer status; 
        private String templateName; 

        private Builder() {
        } 

        private Builder(AlertRuleTemplateBody model) {
            this.description = model.description;
            this.labels = model.labels;
            this.ruleConfigs = model.ruleConfigs;
            this.scenes = model.scenes;
            this.schemaVersion = model.schemaVersion;
            this.status = model.status;
            this.templateName = model.templateName;
        } 

        /**
         * <p>The template description.</p>
         * 
         * <strong>example:</strong>
         * <p>Alert template for sustained CPU usage above 80%</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>The business-level key-value labels. This is a JSON object string, such as {&quot;env&quot;:&quot;prod&quot;}. The default value is an empty object. An empty string is equivalent to not passing this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;env&quot;:&quot;prod&quot;}</p>
         */
        public Builder labels(String labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The rule configurations. This is a v2 wire JSON object string, and the top level must include datasourceConfig.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;datasourceConfig&quot;:{&quot;type&quot;:&quot;PROMETHEUS&quot;,&quot;regionId&quot;:&quot;cn-hangzhou&quot;},&quot;queryConfig&quot;:{&quot;type&quot;:&quot;PROMQL_QUERY&quot;,&quot;expr&quot;:&quot;up == 0&quot;}}</p>
         */
        public Builder ruleConfigs(String ruleConfigs) {
            this.ruleConfigs = ruleConfigs;
            return this;
        }

        /**
         * <p>The scenario labels. This is a JSON array string, such as [&quot;Runbook&quot;]. The default value is an empty array. An empty string is equivalent to not passing this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;Runbook&quot;]</p>
         */
        public Builder scenes(String scenes) {
            this.scenes = scenes;
            return this;
        }

        /**
         * <p>The schema version of the template. The default value is v2. v1 is rejected by the backend.</p>
         * 
         * <strong>example:</strong>
         * <p>v2</p>
         */
        public Builder schemaVersion(String schemaVersion) {
            this.schemaVersion = schemaVersion;
            return this;
        }

        /**
         * <p>The enabling status of the template. Valid values: 1: Enabled. 0: Disabled. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>prod-cpu-high-template</p>
         */
        public Builder templateName(String templateName) {
            this.templateName = templateName;
            return this;
        }

        public AlertRuleTemplateBody build() {
            return new AlertRuleTemplateBody(this);
        } 

    } 

}
