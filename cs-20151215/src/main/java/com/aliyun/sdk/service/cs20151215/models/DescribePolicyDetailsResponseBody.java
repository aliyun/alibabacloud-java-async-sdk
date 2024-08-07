// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The action of the policy. Valid values:
         * <p>
         * 
         * *   `enforce`: blocks deployments that match the policy.
         * *   `inform`: generates alerts for deployments that match the policy.
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * The type of the policy.
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * The description of the policy.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Indicates whether the policy is deleted. Valid values:
         * <p>
         * 
         * *   0: The policy is not deleted.
         * *   1: The policy is deleted.
         */
        public Builder isDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        /**
         * The name of the policy.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Indicates whether parameters are required. Valid values:
         * <p>
         * 
         * *   0: Parameters are required.
         * *   1: Parameters are optional.
         */
        public Builder noConfig(Integer noConfig) {
            this.noConfig = noConfig;
            return this;
        }

        /**
         * The severity level of the policy. Valid values:
         * <p>
         * 
         * *   `high`
         * *   `medium`
         * *   `low`
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * The content of the policy.
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
