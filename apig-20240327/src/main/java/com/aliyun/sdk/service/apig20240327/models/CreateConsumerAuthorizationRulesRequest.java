// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateConsumerAuthorizationRulesRequest} extends {@link RequestModel}
 *
 * <p>CreateConsumerAuthorizationRulesRequest</p>
 */
public class CreateConsumerAuthorizationRulesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("authorizationRules")
    private java.util.List<AuthorizationRules> authorizationRules;

    private CreateConsumerAuthorizationRulesRequest(Builder builder) {
        super(builder);
        this.authorizationRules = builder.authorizationRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateConsumerAuthorizationRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizationRules
     */
    public java.util.List<AuthorizationRules> getAuthorizationRules() {
        return this.authorizationRules;
    }

    public static final class Builder extends Request.Builder<CreateConsumerAuthorizationRulesRequest, Builder> {
        private java.util.List<AuthorizationRules> authorizationRules; 

        private Builder() {
            super();
        } 

        private Builder(CreateConsumerAuthorizationRulesRequest request) {
            super(request);
            this.authorizationRules = request.authorizationRules;
        } 

        /**
         * <p>The consumer authentication rules to be created.</p>
         */
        public Builder authorizationRules(java.util.List<AuthorizationRules> authorizationRules) {
            this.putBodyParameter("authorizationRules", authorizationRules);
            this.authorizationRules = authorizationRules;
            return this;
        }

        @Override
        public CreateConsumerAuthorizationRulesRequest build() {
            return new CreateConsumerAuthorizationRulesRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateConsumerAuthorizationRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateConsumerAuthorizationRulesRequest</p>
     */
    public static class ResourceIdentifier extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("environmentId")
        private String environmentId;

        @com.aliyun.core.annotation.NameInMap("parentResourceId")
        private String parentResourceId;

        @com.aliyun.core.annotation.NameInMap("resourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("resources")
        private java.util.List<String> resources;

        private ResourceIdentifier(Builder builder) {
            this.environmentId = builder.environmentId;
            this.parentResourceId = builder.parentResourceId;
            this.resourceId = builder.resourceId;
            this.resources = builder.resources;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceIdentifier create() {
            return builder().build();
        }

        /**
         * @return environmentId
         */
        public String getEnvironmentId() {
            return this.environmentId;
        }

        /**
         * @return parentResourceId
         */
        public String getParentResourceId() {
            return this.parentResourceId;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resources
         */
        public java.util.List<String> getResources() {
            return this.resources;
        }

        public static final class Builder {
            private String environmentId; 
            private String parentResourceId; 
            private String resourceId; 
            private java.util.List<String> resources; 

            private Builder() {
            } 

            private Builder(ResourceIdentifier model) {
                this.environmentId = model.environmentId;
                this.parentResourceId = model.parentResourceId;
                this.resourceId = model.resourceId;
                this.resources = model.resources;
            } 

            /**
             * <p>The environment ID.</p>
             * 
             * <strong>example:</strong>
             * <p>env-cti17hem1hktoruj98ug</p>
             */
            public Builder environmentId(String environmentId) {
                this.environmentId = environmentId;
                return this;
            }

            /**
             * <p>Parent resource ID</p>
             * 
             * <strong>example:</strong>
             * <p>api-******</p>
             */
            public Builder parentResourceId(String parentResourceId) {
                this.parentResourceId = parentResourceId;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ha-cn-li942gy8p03</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>List of resources</p>
             */
            public Builder resources(java.util.List<String> resources) {
                this.resources = resources;
                return this;
            }

            public ResourceIdentifier build() {
                return new ResourceIdentifier(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreateConsumerAuthorizationRulesRequest} extends {@link TeaModel}
     *
     * <p>CreateConsumerAuthorizationRulesRequest</p>
     */
    public static class AuthorizationRules extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("consumerId")
        private String consumerId;

        @com.aliyun.core.annotation.NameInMap("expireMode")
        private String expireMode;

        @com.aliyun.core.annotation.NameInMap("expireTimestamp")
        private Long expireTimestamp;

        @com.aliyun.core.annotation.NameInMap("resourceIdentifier")
        private ResourceIdentifier resourceIdentifier;

        @com.aliyun.core.annotation.NameInMap("resourceType")
        private String resourceType;

        private AuthorizationRules(Builder builder) {
            this.consumerId = builder.consumerId;
            this.expireMode = builder.expireMode;
            this.expireTimestamp = builder.expireTimestamp;
            this.resourceIdentifier = builder.resourceIdentifier;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AuthorizationRules create() {
            return builder().build();
        }

        /**
         * @return consumerId
         */
        public String getConsumerId() {
            return this.consumerId;
        }

        /**
         * @return expireMode
         */
        public String getExpireMode() {
            return this.expireMode;
        }

        /**
         * @return expireTimestamp
         */
        public Long getExpireTimestamp() {
            return this.expireTimestamp;
        }

        /**
         * @return resourceIdentifier
         */
        public ResourceIdentifier getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String consumerId; 
            private String expireMode; 
            private Long expireTimestamp; 
            private ResourceIdentifier resourceIdentifier; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(AuthorizationRules model) {
                this.consumerId = model.consumerId;
                this.expireMode = model.expireMode;
                this.expireTimestamp = model.expireTimestamp;
                this.resourceIdentifier = model.resourceIdentifier;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The consumer ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cs-cu08olem1hkokaut34i0</p>
             */
            public Builder consumerId(String consumerId) {
                this.consumerId = consumerId;
                return this;
            }

            /**
             * <p>The expiration mode. Valid values: LongTerm and ShortTerm.</p>
             * 
             * <strong>example:</strong>
             * <p>LongTerm</p>
             */
            public Builder expireMode(String expireMode) {
                this.expireMode = expireMode;
                return this;
            }

            /**
             * <p>The expiration timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>174116222x</p>
             */
            public Builder expireTimestamp(Long expireTimestamp) {
                this.expireTimestamp = expireTimestamp;
                return this;
            }

            /**
             * <p>The resource identifier, which is provided to non-standard code sources for space reuse.</p>
             */
            public Builder resourceIdentifier(ResourceIdentifier resourceIdentifier) {
                this.resourceIdentifier = resourceIdentifier;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>HttpApiRoute</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public AuthorizationRules build() {
                return new AuthorizationRules(this);
            } 

        } 

    }
}
