// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link RegisterResourceTypeRequest} extends {@link RequestModel}
 *
 * <p>RegisterResourceTypeRequest</p>
 */
public class RegisterResourceTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EntityType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String entityType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String resourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    private String templateBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateURL")
    private String templateURL;

    private RegisterResourceTypeRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.description = builder.description;
        this.entityType = builder.entityType;
        this.resourceType = builder.resourceType;
        this.templateBody = builder.templateBody;
        this.templateURL = builder.templateURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RegisterResourceTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return entityType
     */
    public String getEntityType() {
        return this.entityType;
    }

    /**
     * @return resourceType
     */
    public String getResourceType() {
        return this.resourceType;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return templateURL
     */
    public String getTemplateURL() {
        return this.templateURL;
    }

    public static final class Builder extends Request.Builder<RegisterResourceTypeRequest, Builder> {
        private String clientToken; 
        private String description; 
        private String entityType; 
        private String resourceType; 
        private String templateBody; 
        private String templateURL; 

        private Builder() {
            super();
        } 

        private Builder(RegisterResourceTypeRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.description = request.description;
            this.entityType = request.entityType;
            this.resourceType = request.resourceType;
            this.templateBody = request.templateBody;
            this.templateURL = request.templateURL;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.<br>The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (_).<br>For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">Ensure idempotence</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>123e4567-e89b-12d3-a456-42665544****</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The description of the resource type. The description can be up to 512 characters in length.</p>
         * 
         * <strong>example:</strong>
         * <p>It is a demo.</p>
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The entity type. Set the value to Module.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Module</p>
         */
        public Builder entityType(String entityType) {
            this.putQueryParameter("EntityType", entityType);
            this.entityType = entityType;
            return this;
        }

        /**
         * <p>The resource type.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MODULE::MyOrganization::MyService::MyUsecase</p>
         */
        public Builder resourceType(String resourceType) {
            this.putQueryParameter("ResourceType", resourceType);
            this.resourceType = resourceType;
            return this;
        }

        /**
         * <p>The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. The template body is used as the module content. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter takes effect only when EntityType is set to Module.</li>
         * <li>You can specify only one of the TemplateBody and TemplateURL parameters.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>{&quot;ROSTemplateFormatVersion&quot;:&quot;2015-09-01&quot;}</p>
         */
        public Builder templateBody(String templateBody) {
            this.putBodyParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length. The template body is used as the module content.</p>
         * <blockquote>
         * <ul>
         * <li>If you do not specify the region ID of the OSS bucket, the value of RegionId is used.</li>
         * <li>This parameter takes effect only when EntityType is set to Module.</li>
         * <li>You can specify only one of the TemplateBody and TemplateURL parameters.</li>
         * </ul>
         * </blockquote>
         * <p>The URL can be up to 1,024 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://ros-template/demo</p>
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        @Override
        public RegisterResourceTypeRequest build() {
            return new RegisterResourceTypeRequest(this);
        } 

    } 

}
