// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

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
 * {@link DescribePolicyDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyDetailsResponseBody</p>
 */
public class DescribePolicyDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("action")
    private String action;

    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("is_deleted")
    private Integer isDeleted;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("no_config")
    private Integer noConfig;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    @com.aliyun.core.annotation.NameInMap("template")
    private String template;

    private DescribePolicyDetailsResponseBody(Builder builder) {
        this.action = builder.action;
        this.category = builder.category;
        this.description = builder.description;
        this.isDeleted = builder.isDeleted;
        this.name = builder.name;
        this.noConfig = builder.noConfig;
        this.severity = builder.severity;
        this.template = builder.template;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return action
     */
    public String getAction() {
        return this.action;
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
     * @return isDeleted
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return noConfig
     */
    public Integer getNoConfig() {
        return this.noConfig;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    /**
     * @return template
     */
    public String getTemplate() {
        return this.template;
    }

    public static final class Builder {
        private String action; 
        private String category; 
        private String description; 
        private Integer isDeleted; 
        private String name; 
        private Integer noConfig; 
        private String severity; 
        private String template; 

        private Builder() {
        } 

        private Builder(DescribePolicyDetailsResponseBody model) {
            this.action = model.action;
            this.category = model.category;
            this.description = model.description;
            this.isDeleted = model.isDeleted;
            this.name = model.name;
            this.noConfig = model.noConfig;
            this.severity = model.severity;
            this.template = model.template;
        } 

        /**
         * <p>The governance action of the rule. Valid values:</p>
         * <ul>
         * <li><code>enforce</code>: blocks non-compliant deployments.</li>
         * <li><code>inform</code>: generates alerts.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enforce</p>
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * <p>The templatetype of the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-general</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The description of the rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>Requires container images to begin with a repo string from a specified list</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the rule is deleted. Valid values:</p>
         * <ul>
         * <li>0: not deleted.</li>
         * <li>1: deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder isDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * <p>The name of the policy governance rule.</p>
         * 
         * <strong>example:</strong>
         * <p>ACKAllowedRepos</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Indicates whether the policy requires configuration. Valid values: </p>
         * <ul>
         * <li>0: parameter settings required.</li>
         * <li>1: no parameter settings required.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder noConfig(Integer noConfig) {
            this.noConfig = noConfig;
            return this;
        }

        /**
         * <p>The governance severity of the rule. Valid values:</p>
         * <ul>
         * <li><code>high</code>: high risk.</li>
         * <li><code>medium</code>: medium risk.</li>
         * <li><code>low</code>: low risk.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * <p>The details of the rule template.</p>
         * 
         * <strong>example:</strong>
         * <p>For more information, see the request example</p>
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }

        public DescribePolicyDetailsResponseBody build() {
            return new DescribePolicyDetailsResponseBody(this);
        } 

    } 

}
