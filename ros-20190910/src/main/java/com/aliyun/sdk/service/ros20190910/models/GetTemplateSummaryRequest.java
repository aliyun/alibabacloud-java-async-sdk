// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateSummaryRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateSummaryRequest</p>
 */
public class GetTemplateSummaryRequest extends Request {
    @Query
    @NameInMap("ChangeSetId")
    private String changeSetId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("StackGroupName")
    private String stackGroupName;

    @Query
    @NameInMap("StackId")
    private String stackId;

    @Query
    @NameInMap("TemplateBody")
    private String templateBody;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("TemplateURL")
    private String templateURL;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private GetTemplateSummaryRequest(Builder builder) {
        super(builder);
        this.changeSetId = builder.changeSetId;
        this.clientToken = builder.clientToken;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.stackGroupName = builder.stackGroupName;
        this.stackId = builder.stackId;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateSummaryRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return changeSetId
     */
    public String getChangeSetId() {
        return this.changeSetId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return parameters
     */
    public java.util.List < Parameters> getParameters() {
        return this.parameters;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return stackGroupName
     */
    public String getStackGroupName() {
        return this.stackGroupName;
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

    public static final class Builder extends Request.Builder<GetTemplateSummaryRequest, Builder> {
        private String changeSetId; 
        private String clientToken; 
        private java.util.List < Parameters> parameters; 
        private String regionId; 
        private String stackGroupName; 
        private String stackId; 
        private String templateBody; 
        private String templateId; 
        private String templateURL; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateSummaryRequest request) {
            super(request);
            this.changeSetId = request.changeSetId;
            this.clientToken = request.clientToken;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.stackGroupName = request.stackGroupName;
            this.stackId = request.stackId;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * The ID of the change set.
         * <p>
         * 
         * You can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, StackId, ChangeSetId, and StackGroupName.
         */
        public Builder changeSetId(String changeSetId) {
            this.putQueryParameter("ChangeSetId", changeSetId);
            this.changeSetId = changeSetId;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the value, but you must make sure that the value is unique among different requests.
         * <p>
         * 
         * The token can be up to 64 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).
         * 
         * For more information, see [Ensure idempotence](~~134212~~).
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * test
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The ID of the region to which the stack or stack group in the template belongs. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         * <p>
         * 
         * This parameter takes effect only when you specify the StackId, ChangeSetId, or StackGroupName parameter.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The name of the stack group.
         * <p>
         * 
         * You can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, StackId, ChangeSetId, and StackGroupName.
         */
        public Builder stackGroupName(String stackGroupName) {
            this.putQueryParameter("StackGroupName", stackGroupName);
            this.stackGroupName = stackGroupName;
            return this;
        }

        /**
         * The ID of the stack.
         * <p>
         * 
         * You can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, StackId, ChangeSetId, and StackGroupName.
         */
        public Builder stackId(String stackId) {
            this.putQueryParameter("StackId", stackId);
            this.stackId = stackId;
            return this;
        }

        /**
         * The structure that contains the template body. The template body must be 1 to 524,288 bytes in length.
         * <p>
         * 
         * If the length of the template body exceeds the upper limit, we recommend that you add parameters to the HTTP POST request body to prevent request failures caused by excessively long URLs.
         * 
         * You can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, StackId, ChangeSetId, and StackGroupName.
         */
        public Builder templateBody(String templateBody) {
            this.putQueryParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * The ID of the template. This parameter applies to shared and private templates.
         * <p>
         * 
         * You can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, StackId, ChangeSetId, and StackGroupName.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP or HTTPS web server or in an Alibaba Cloud Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.
         * <p>
         * 
         * >  If you do not specify the region of the OSS bucket, the value of the RegionId parameter is used.
         * 
         * You can specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, StackId, ChangeSetId, and StackGroupName.
         * 
         * The URL can be up to 1,024 bytes in length.
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * The version of the template. This parameter takes effect when you specify the TemplateId parameter.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public GetTemplateSummaryRequest build() {
            return new GetTemplateSummaryRequest(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("ParameterValue")
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterKey = builder.parameterKey;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterKey
         */
        public String getParameterKey() {
            return this.parameterKey;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterKey; 
            private String parameterValue; 

            /**
             * The name of parameter N that is defined in the template. If you do not specify the name and value of a parameter, Resource Orchestration Service (ROS) uses the default name and value in the template.
             * <p>
             * 
             * Maximum value of N: 200.
             * 
             * >  The Parameters parameter is optional. If you need to specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * The value of parameter N that is defined in the template.
             * <p>
             * 
             * Maximum value of N: 200.
             * 
             * >  The Parameters parameter is optional. If you need to specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
