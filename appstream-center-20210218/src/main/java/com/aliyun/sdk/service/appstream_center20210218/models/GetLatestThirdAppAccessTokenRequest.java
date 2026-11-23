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
 * {@link GetLatestThirdAppAccessTokenRequest} extends {@link RequestModel}
 *
 * <p>GetLatestThirdAppAccessTokenRequest</p>
 */
public class GetLatestThirdAppAccessTokenRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AuthorizerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String authorizerId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BusinessChannel")
    private String businessChannel;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Resource")
    private Resource resource;

    private GetLatestThirdAppAccessTokenRequest(Builder builder) {
        super(builder);
        this.authorizerId = builder.authorizerId;
        this.businessChannel = builder.businessChannel;
        this.resource = builder.resource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLatestThirdAppAccessTokenRequest create() {
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
     * @return resource
     */
    public Resource getResource() {
        return this.resource;
    }

    public static final class Builder extends Request.Builder<GetLatestThirdAppAccessTokenRequest, Builder> {
        private String authorizerId; 
        private String businessChannel; 
        private Resource resource; 

        private Builder() {
            super();
        } 

        private Builder(GetLatestThirdAppAccessTokenRequest request) {
            super(request);
            this.authorizerId = request.authorizerId;
            this.businessChannel = request.businessChannel;
            this.resource = request.resource;
        } 

        /**
         * <p>The WyId of the user used when the token was created. It must correspond to the current account and the target cloud desktop, and cannot be replaced by a username.</p>
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
         * <p>The business channel. Valid values: Enterprise and Business. The value is case-insensitive. If omitted, the default value is Enterprise. If an empty string or other value is explicitly passed, a parameter error is returned. This parameter does not replace user identity verification.</p>
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
         * <p>The target single cloud desktop resource. You must provide this object along with ResourceType and ResourceId when calling this operation. Pass it as a JSON object to specify only one cloud desktop. Wildcards or authorization for all cloud desktops are not supported.</p>
         */
        public Builder resource(Resource resource) {
            String resourceShrink = shrink(resource, "Resource", "json");
            this.putBodyParameter("Resource", resourceShrink);
            this.resource = resource;
            return this;
        }

        @Override
        public GetLatestThirdAppAccessTokenRequest build() {
            return new GetLatestThirdAppAccessTokenRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetLatestThirdAppAccessTokenRequest} extends {@link TeaModel}
     *
     * <p>GetLatestThirdAppAccessTokenRequest</p>
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
             * <p>The ID of the cloud desktop specified when the token was created. You must provide a non-empty value that is consistent with the value used during creation. Asterisks (*) are not allowed.</p>
             * 
             * <strong>example:</strong>
             * <p>ecd-7a8b9c0d****</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The resource type. This parameter is required. Valid value: DESKTOP, which indicates a cloud desktop. The value is case-insensitive.</p>
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
