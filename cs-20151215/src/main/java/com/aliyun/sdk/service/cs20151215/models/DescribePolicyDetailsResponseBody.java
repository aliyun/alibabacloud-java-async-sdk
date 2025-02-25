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

        /**
         * <p>The action of the policy. Valid values:</p>
         * <ul>
         * <li><code>enforce</code>: blocks deployments that match the policy.</li>
         * <li><code>inform</code>: generates alerts for deployments that match the policy.</li>
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
         * <p>The type of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-general</p>
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * <p>The description of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>Requires container images to begin with a repo string from a specified list</p>
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * <p>Indicates whether the policy is deleted. Valid values:</p>
         * <ul>
         * <li>0: The policy is not deleted.</li>
         * <li>1: The policy is deleted.</li>
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
         * <p>The name of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>ACKAllowedRepos</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>Indicates whether parameters are required. Valid values:</p>
         * <ul>
         * <li>0: Parameters are required.</li>
         * <li>1: Parameters are optional.</li>
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
         * <p>The severity level of the policy. Valid values:</p>
         * <ul>
         * <li><code>high</code></li>
         * <li><code>medium</code></li>
         * <li><code>low</code></li>
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
         * <p>The content of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>For more information, see sample requests.</p>
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
