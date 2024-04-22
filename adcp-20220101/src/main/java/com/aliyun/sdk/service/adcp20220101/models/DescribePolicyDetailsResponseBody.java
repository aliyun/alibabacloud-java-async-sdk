// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adcp20220101.models;

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
    @NameInMap("Policy")
    private Policy policy;

    @NameInMap("RequestId")
    private String requestId;

    private DescribePolicyDetailsResponseBody(Builder builder) {
        this.policy = builder.policy;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribePolicyDetailsResponseBody create() {
        return builder().build();
    }

    /**
     * @return policy
     */
    public Policy getPolicy() {
        return this.policy;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Policy policy; 
        private String requestId; 

        /**
         * The policies.
         */
        public Builder policy(Policy policy) {
            this.policy = policy;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribePolicyDetailsResponseBody build() {
            return new DescribePolicyDetailsResponseBody(this);
        } 

    } 

    public static class Policy extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("Category")
        private String category;

        @NameInMap("Created")
        private String created;

        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("NoConfig")
        private Integer noConfig;

        @NameInMap("Severity")
        private String severity;

        @NameInMap("Template")
        private String template;

        @NameInMap("Updated")
        private String updated;

        private Policy(Builder builder) {
            this.action = builder.action;
            this.category = builder.category;
            this.created = builder.created;
            this.description = builder.description;
            this.name = builder.name;
            this.noConfig = builder.noConfig;
            this.severity = builder.severity;
            this.template = builder.template;
            this.updated = builder.updated;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
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
         * @return created
         */
        public String getCreated() {
            return this.created;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
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

        /**
         * @return updated
         */
        public String getUpdated() {
            return this.updated;
        }

        public static final class Builder {
            private String action; 
            private String category; 
            private String created; 
            private String description; 
            private String name; 
            private Integer noConfig; 
            private String severity; 
            private String template; 
            private String updated; 

            /**
             * The action of the policy. Valid values:
             * <p>
             * 
             * *   enforce: blocks deployments that match the policy.
             * *   inform: generates alerts for deployments that match the policy.
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
             * The time when the policy was created.
             */
            public Builder created(String created) {
                this.created = created;
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
             * *   1: Parameters are not required.
             */
            public Builder noConfig(Integer noConfig) {
                this.noConfig = noConfig;
                return this;
            }

            /**
             * The severity level of the policy.
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

            /**
             * The time when the policy was last updated.
             */
            public Builder updated(String updated) {
                this.updated = updated;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
}
