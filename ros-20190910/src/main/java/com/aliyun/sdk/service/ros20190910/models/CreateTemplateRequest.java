// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateTemplateRequest</p>
 */
public class CreateTemplateRequest extends Request {
    @Query
    @NameInMap("Description")
    private String description;

    @Query
    @NameInMap("ResourceGroupId")
    private String resourceGroupId;

    @Query
    @NameInMap("Tags")
    private java.util.List < Tags> tags;

    @Query
    @NameInMap("TemplateBody")
    private String templateBody;

    @Query
    @NameInMap("TemplateName")
    @Validation(required = true)
    private String templateName;

    @Query
    @NameInMap("TemplateURL")
    private String templateURL;

    private CreateTemplateRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.resourceGroupId = builder.resourceGroupId;
        this.tags = builder.tags;
        this.templateBody = builder.templateBody;
        this.templateName = builder.templateName;
        this.templateURL = builder.templateURL;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateTemplateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return tags
     */
    public java.util.List < Tags> getTags() {
        return this.tags;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateURL
     */
    public String getTemplateURL() {
        return this.templateURL;
    }

    public static final class Builder extends Request.Builder<CreateTemplateRequest, Builder> {
        private String description; 
        private String resourceGroupId; 
        private java.util.List < Tags> tags; 
        private String templateBody; 
        private String templateName; 
        private String templateURL; 

        private Builder() {
            super();
        } 

        private Builder(CreateTemplateRequest request) {
            super(request);
            this.description = request.description;
            this.resourceGroupId = request.resourceGroupId;
            this.tags = request.tags;
            this.templateBody = request.templateBody;
            this.templateName = request.templateName;
            this.templateURL = request.templateURL;
        } 

        /**
         * The description of the template. The description can be up to 256 characters in length.
         */
        public Builder description(String description) {
            this.putQueryParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The ID of the resource group.
         * <p>
         * 
         * For more information about resource groups, see the "Resource Group" section of [What is Resource Management?](~~94475~~)
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("ResourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(java.util.List < Tags> tags) {
            this.putQueryParameter("Tags", tags);
            this.tags = tags;
            return this;
        }

        /**
         * The structure that contains the template body. The template body must be 1 to 524,288 bytes in length. If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.
         * <p>
         * 
         * >  You must specify the TemplateBody or TemplateURL parameter.
         * 
         * You can create a Terraform template based on your business requirements. The following sample code provides an example on how to create a Terraform template:
         * 
         * ```
         * 
         * {
         *   "ROSTemplateFormatVersion": "2015-09-01",
         *   "Transform": "Aliyun::Terraform-v1.0",
         *   "Workspace": {
         *     "main.tf": "variable  \"name\" {  default = \"auto_provisioning_group\"}"
         *   },
         *   "Outputs": {}
         * }
         * ```
         * 
         * For more information about Terraform templates, see [Structure of Terraform templates](~~184397~~).
         */
        public Builder templateBody(String templateBody) {
            this.putQueryParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * The name of the template.
         * <p>
         * 
         * The name can be up to 255 characters in length, and can contain digits, letters, hyphens (-), and underscores (\_). The name must start with a digit or letter.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo or oss://ros/stack-policy/demo?RegionId=cn-hangzhou.
         * <p>
         * 
         * The template body must be 1 to 1,024 bytes in length.
         * 
         * If you do not specify the region of the OSS bucket, the value of the RegionId parameter is used.
         * 
         * >  You must specify the TemplateBody or TemplateURL parameter.
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        @Override
        public CreateTemplateRequest build() {
            return new CreateTemplateRequest(this);
        } 

    } 

    public static class Tags extends TeaModel {
        @NameInMap("Key")
        @Validation(required = true)
        private String key;

        @NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of tag N that you want to add to the template.
             * <p>
             * 
             * >  The Tags parameter is optional. If you specify the Tags parameter, you must specify the Tags.N.Key parameter.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of tag N that you want to add to the template.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
