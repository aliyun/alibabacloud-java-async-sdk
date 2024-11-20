// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListStackOperationRisksRequest} extends {@link RequestModel}
 *
 * <p>ListStackOperationRisksRequest</p>
 */
public class ListStackOperationRisksRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OperationType")
    private String operationType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RamRoleName")
    private String ramRoleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetainAllResources")
    private Boolean retainAllResources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RetainResources")
    private java.util.List < String > retainResources;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StackId")
    private String stackId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    private String templateBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    private String templateId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateURL")
    private String templateURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateVersion")
    private String templateVersion;

    private ListStackOperationRisksRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.operationType = builder.operationType;
        this.ramRoleName = builder.ramRoleName;
        this.regionId = builder.regionId;
        this.retainAllResources = builder.retainAllResources;
        this.retainResources = builder.retainResources;
        this.stackId = builder.stackId;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListStackOperationRisksRequest create() {
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
     * @return operationType
     */
    public String getOperationType() {
        return this.operationType;
    }

    /**
     * @return ramRoleName
     */
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return retainAllResources
     */
    public Boolean getRetainAllResources() {
        return this.retainAllResources;
    }

    /**
     * @return retainResources
     */
    public java.util.List < String > getRetainResources() {
        return this.retainResources;
    }

    /**
     * @return stackId
     */
    public String getStackId() {
        return this.stackId;
    }

    /**
     * @return templateBody
     */
    public String getTemplateBody() {
        return this.templateBody;
    }

    /**
     * @return templateId
     */
    public String getTemplateId() {
        return this.templateId;
    }

    /**
     * @return templateURL
     */
    public String getTemplateURL() {
        return this.templateURL;
    }

    /**
     * @return templateVersion
     */
    public String getTemplateVersion() {
        return this.templateVersion;
    }

    public static final class Builder extends Request.Builder<ListStackOperationRisksRequest, Builder> {
        private String clientToken; 
        private String operationType; 
        private String ramRoleName; 
        private String regionId; 
        private Boolean retainAllResources; 
        private java.util.List < String > retainResources; 
        private String stackId; 
        private String templateBody; 
        private String templateId; 
        private String templateURL; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(ListStackOperationRisksRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.operationType = request.operationType;
            this.ramRoleName = request.ramRoleName;
            this.regionId = request.regionId;
            this.retainAllResources = request.retainAllResources;
            this.retainResources = request.retainResources;
            this.stackId = request.stackId;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (_). For more information, see <a href="https://help.aliyun.com/document_detail/134212.html">How to ensure idempotence</a>.</p>
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
         * <p>The type of the operation of which you want to detect risks. Valid values:</p>
         * <ul>
         * <li>DeleteStack: detects high risks that may arise in resources when you delete a stack.</li>
         * <li>CreateStack: detects the missing permissions when you fail to create a stack.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DeleteStack</p>
         */
        public Builder operationType(String operationType) {
            this.putQueryParameter("OperationType", operationType);
            this.operationType = operationType;
            return this;
        }

        /**
         * <p>The name of the RAM role.</p>
         * <ul>
         * <li>If you specify a RAM role, ROS creates stacks based on the permissions that are granted to the RAM role and uses the credentials of the RAM role to call the API operations of Alibaba Cloud services.</li>
         * <li>If you do not specify a RAM role, ROS creates stacks based on the permissions of your Alibaba Cloud account.</li>
         * </ul>
         * <p>The name of the RAM role can be up to 64 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>test-role</p>
         */
        public Builder ramRoleName(String ramRoleName) {
            this.putQueryParameter("RamRoleName", ramRoleName);
            this.ramRoleName = ramRoleName;
            return this;
        }

        /**
         * <p>The region ID of the stack. You can call the <a href="https://help.aliyun.com/document_detail/131035.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>Specifies whether to retain all resources in the stack. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (default)</li>
         * </ul>
         * <blockquote>
         * <p>This parameter takes effect only if you set OperationType to DeleteStack.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder retainAllResources(Boolean retainAllResources) {
            this.putQueryParameter("RetainAllResources", retainAllResources);
            this.retainAllResources = retainAllResources;
            return this;
        }

        /**
         * <p>The list of resources to retain.</p>
         * <blockquote>
         * <p>This parameter takes effect only if you set OperationType to DeleteStack.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>WebServer</p>
         */
        public Builder retainResources(java.util.List < String > retainResources) {
            this.putQueryParameter("RetainResources", retainResources);
            this.retainResources = retainResources;
            return this;
        }

        /**
         * <p>The ID of the stack.</p>
         * 
         * <strong>example:</strong>
         * <p>4a6c9851-3b0f-4f5f-b4ca-a14bf691****</p>
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * TemplateBody.
         */
        public Builder templateBody(String templateBody) {
            this.putBodyParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * <p>The ID of the template. This parameter applies to shared and private templates.</p>
         * <blockquote>
         * <p>You must specify one of TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5ecd1e10-b0e9-4389-a565-e4c15efc****</p>
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * <p>The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Object Storage Service (OSS) bucket, such as oss://ros/stack-policy/demo and oss://ros/stack-policy/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length. If you do not specify RegionId in the URL, the region ID of the stack is used.</p>
         * <blockquote>
         * <p>You must specify one of TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>oss://ros-template/demo</p>
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * <p>The version of the template.</p>
         * <blockquote>
         * <p>This parameter takes effect only if you specify TemplateId.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>v1</p>
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public ListStackOperationRisksRequest build() {
            return new ListStackOperationRisksRequest(this);
        } 

    } 

}
