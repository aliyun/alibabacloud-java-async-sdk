// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cs20151215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribePolicyDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribePolicyDetailsResponseBody</p>
 */
public class DescribePolicyDetailsResponseBody extends TeaModel {
    @NameInMap("name")
    private String name;

    @NameInMap("category")
    private String category;

    @NameInMap("description")
    private String description;

    @NameInMap("action")
    private String action;

    @NameInMap("severity")
    private String severity;

    @NameInMap("template")
    private String template;

    @NameInMap("no_config")
    private Integer noConfig;

    @NameInMap("is_deleted")
    private Integer isDeleted;

    private DescribePolicyDetailsResponseBody(Builder builder) {
        this.name = builder.name;
        this.category = builder.category;
        this.description = builder.description;
        this.action = builder.action;
        this.severity = builder.severity;
        this.template = builder.template;
        this.noConfig = builder.noConfig;
        this.isDeleted = builder.isDeleted;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return action
     */
    public String getAction() {
        return this.action;
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

    /**
     * @return noConfig
     */
    public Integer getNoConfig() {
        return this.noConfig;
    }

    /**
     * @return isDeleted
     */
    public Integer getIsDeleted() {
        return this.isDeleted;
    }

    public static final class Builder {
        private String name; 
        private String category; 
        private String description; 
        private String action; 
        private String severity; 
        private String template; 
        private Integer noConfig; 
        private Integer isDeleted; 

        /**
         * Policy Governance rule name
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Rule Template type
         */
        public Builder category(String category) {
            this.category = category;
            return this;
        }

        /**
         * Rule template description
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The rule governance action. Valid values:
         * <p>
         * -"enforce": intercepts illegal deployment.
         * -"inform": Alerts
         */
        public Builder action(String action) {
            this.action = action;
            return this;
        }

        /**
         * Rule governance level
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        /**
         * Rule template details
         */
        public Builder template(String template) {
            this.template = template;
            return this;
        }

        /**
         * Specifies whether to configure a policy. Valid values:
         * <p>
         * -0: parameter configuration is required.
         * -1: no parameter configuration is required.
         */
        public Builder noConfig(Integer noConfig) {
            this.noConfig = noConfig;
            return this;
        }

        /**
         * Specifies whether to delete the flag. Valid values:
         * <p>
         * -0: indicates that the instance has not been deleted.
         * -1: indicates deletion.
         */
        public Builder isDeleted(Integer isDeleted) {
            this.isDeleted = isDeleted;
            return this;
        }

        public DescribePolicyDetailsResponseBody build() {
            return new DescribePolicyDetailsResponseBody(this);
        } 

    } 

}
