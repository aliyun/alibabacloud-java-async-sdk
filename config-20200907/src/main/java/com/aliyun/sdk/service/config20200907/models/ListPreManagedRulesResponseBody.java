// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link ListPreManagedRulesResponseBody} extends {@link TeaModel}
 *
 * <p>ListPreManagedRulesResponseBody</p>
 */
public class ListPreManagedRulesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ManagedRules")
    private java.util.List<ManagedRules> managedRules;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Long pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Long pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListPreManagedRulesResponseBody(Builder builder) {
        this.managedRules = builder.managedRules;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListPreManagedRulesResponseBody create() {
        return builder().build();
    }

    /**
     * @return managedRules
     */
    public java.util.List<ManagedRules> getManagedRules() {
        return this.managedRules;
    }

    /**
     * @return pageNumber
     */
    public Long getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Long getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<ManagedRules> managedRules; 
        private Long pageNumber; 
        private Long pageSize; 
        private String requestId; 

        /**
         * <p>The evaluation rules.</p>
         */
        public Builder managedRules(java.util.List<ManagedRules> managedRules) {
            this.managedRules = managedRules;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>A2A9F1BE-0712-1B26-9899-D82F7DA8476C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListPreManagedRulesResponseBody build() {
            return new ListPreManagedRulesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListPreManagedRulesResponseBody} extends {@link TeaModel}
     *
     * <p>ListPreManagedRulesResponseBody</p>
     */
    public static class ManagedRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CompulsoryInputParameterDetails")
        private java.util.Map<String, ?> compulsoryInputParameterDetails;

        @com.aliyun.core.annotation.NameInMap("ConfigRuleName")
        private String configRuleName;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("HelpUrls")
        private String helpUrls;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("OptionalInputParameterDetails")
        private java.util.Map<String, ?> optionalInputParameterDetails;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private ManagedRules(Builder builder) {
            this.compulsoryInputParameterDetails = builder.compulsoryInputParameterDetails;
            this.configRuleName = builder.configRuleName;
            this.description = builder.description;
            this.helpUrls = builder.helpUrls;
            this.identifier = builder.identifier;
            this.optionalInputParameterDetails = builder.optionalInputParameterDetails;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ManagedRules create() {
            return builder().build();
        }

        /**
         * @return compulsoryInputParameterDetails
         */
        public java.util.Map<String, ?> getCompulsoryInputParameterDetails() {
            return this.compulsoryInputParameterDetails;
        }

        /**
         * @return configRuleName
         */
        public String getConfigRuleName() {
            return this.configRuleName;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return helpUrls
         */
        public String getHelpUrls() {
            return this.helpUrls;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return optionalInputParameterDetails
         */
        public java.util.Map<String, ?> getOptionalInputParameterDetails() {
            return this.optionalInputParameterDetails;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private java.util.Map<String, ?> compulsoryInputParameterDetails; 
            private String configRuleName; 
            private String description; 
            private String helpUrls; 
            private String identifier; 
            private java.util.Map<String, ?> optionalInputParameterDetails; 
            private String resourceType; 

            /**
             * <p>The details of the required input parameters of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder compulsoryInputParameterDetails(java.util.Map<String, ?> compulsoryInputParameterDetails) {
                this.compulsoryInputParameterDetails = compulsoryInputParameterDetails;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ram-user-ak-used-expired-check</p>
             */
            public Builder configRuleName(String configRuleName) {
                this.configRuleName = configRuleName;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>Example description</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The URL of the topic that describes how the evaluation rule remediates the incompliant configurations.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.aliyundoc.com">https://example.aliyundoc.com</a></p>
             */
            public Builder helpUrls(String helpUrls) {
                this.helpUrls = helpUrls;
                return this;
            }

            /**
             * <p>The identifier of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ecs-instance-deletion-protection-enabled</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The details of the optional input parameters of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder optionalInputParameterDetails(java.util.Map<String, ?> optionalInputParameterDetails) {
                this.optionalInputParameterDetails = optionalInputParameterDetails;
                return this;
            }

            /**
             * <p>The type of resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ACS::ECS::Instance</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public ManagedRules build() {
                return new ManagedRules(this);
            } 

        } 

    }
}
