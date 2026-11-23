// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.appstream_center20210218.models;

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
 * {@link CreateThirdAppAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>CreateThirdAppAccessTokenRequest</p>
 */
public class CreateThirdAppAccessTokenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthorizerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Expiration")
    @com.aliyun.core.annotation.Validation(maximum = 15552000, minimum = 1)
    private Integer expiration;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Resource")
    private Resource resource;

    private CreateThirdAppAccessTokenRequest(Builder builder) {
        super(builder);
        this.authorizerId = builder.authorizerId;
        this.businessChannel = builder.businessChannel;
        this.expiration = builder.expiration;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateThirdAppAccessTokenRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authorizerId
     */
    public String getAuthorizerId() {
        return this.authorizerId;
    }

    /**
     * @return businessChannel
     */
    public String getBusinessChannel() {
        return this.businessChannel;
    }

    /**
     * @return expiration
     */
    public Integer getExpiration() {
        return this.expiration;
    }

    /**
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    public static final class Builder extends Request.Builder<CreateThirdAppAccessTokenRequest, Builder> {
        private String authorizerId; 
        private String businessChannel; 
        private Integer expiration; 
        private Resource resource; 

        private Builder() {
            super();
        } 

        private Builder(CreateThirdAppAccessTokenRequest request) {
            super(request);
            this.authorizerId = request.authorizerId;
            this.businessChannel = request.businessChannel;
            this.expiration = request.expiration;
            this.resource = request.resource;
        } 

        /**
         * <p>The WyId of the authorized user. The user must belong to the current calling account. This parameter is not the username.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>f1e2d3c4b5a6****</p>
         */
        public Builder authorizerId(String authorizerId) {
            this.putBodyParameter("AuthorizerId", authorizerId);
            this.authorizerId = authorizerId;
            return this;
        }

        /**
         * <p>The business channel. Valid values: Enterprise and Business. The value is case-insensitive. If omitted, the default value is Enterprise. If an empty string or other values are explicitly passed, a parameter error is returned. This parameter does not replace user identity verification.</p>
         * 
         * <strong>example:</strong>
         * <p>Enterprise</p>
         */
        public Builder businessChannel(String businessChannel) {
            this.putBodyParameter("BusinessChannel", businessChannel);
            this.businessChannel = businessChannel;
            return this;
        }

        /**
         * <p>The validity period of the token, in seconds. Valid values: 1 to 15552000. If omitted, the default value is 15552000, which equals 180 days. Permanent validity is not supported, and 0 cannot be passed.</p>
         * 
         * <strong>example:</strong>
         * <p>900</p>
         */
        public Builder expiration(Integer expiration) {
            this.putBodyParameter("Expiration", expiration);
            this.expiration = expiration;
            return this;
        }

        /**
         * <p>The target single cloud desktop resource. You must provide this object along with ResourceType and ResourceId when you call this operation. Pass this parameter as a JSON object and specify only one cloud desktop. Wildcards or authorization for all cloud desktops are not supported.</p>
         */
        public Builder resource(Resource resource) {
            String resourceShrink = shrink(resource, "Resource", "json");
            this.putBodyParameter("Resource", resourceShrink);
            this.resource = resource;
            return this;
        }

        @Override
        public CreateThirdAppAccessTokenRequest build() {
            return new CreateThirdAppAccessTokenRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateThirdAppAccessTokenRequest} extends {@link TeaModel}
     *
     * <p>CreateThirdAppAccessTokenRequest</p>
     */
    public static class Resource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        private Resource(Builder builder) {
            this.resourceId = builder.resourceId;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Resource create() {
            return builder().build();
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String resourceId; 
            private String resourceType; 

            private Builder() {
            } 

            private Builder(Resource model) {
                this.resourceId = model.resourceId;
                this.resourceType = model.resourceType;
            } 

            /**
             * <p>The ID of the target cloud desktop. You must provide a non-empty value when you call this operation. Asterisks (*) are not allowed. The cloud desktop must be authorized to the user specified by AuthorizerId.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-7a8b9c0d****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type. This parameter is required when you call this operation. Set the value to DESKTOP, which indicates a cloud desktop. The value is case-insensitive.</p>
             * 
             * <strong>example:</strong>
             * <p>DESKTOP</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public Resource build() {
                return new Resource(this);
            } 

        } 

    }
}
