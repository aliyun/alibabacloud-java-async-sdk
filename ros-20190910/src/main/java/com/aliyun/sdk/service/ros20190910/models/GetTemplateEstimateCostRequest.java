// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateEstimateCostRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateEstimateCostRequest</p>
 */
public class GetTemplateEstimateCostRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("Parameters")
    private java.util.List < Parameters> parameters;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("StackId")
    private String stackId;

    @Body
    @NameInMap("TemplateBody")
    private String templateBody;

    @Query
    @NameInMap("TemplateId")
    private String templateId;

    @Query
    @NameInMap("TemplateScratchId")
    private String templateScratchId;

    @Query
    @NameInMap("TemplateScratchRegionId")
    private String templateScratchRegionId;

    @Query
    @NameInMap("TemplateURL")
    private String templateURL;

    @Query
    @NameInMap("TemplateVersion")
    private String templateVersion;

    private GetTemplateEstimateCostRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.stackId = builder.stackId;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateScratchId = builder.templateScratchId;
        this.templateScratchRegionId = builder.templateScratchRegionId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateEstimateCostRequest create() {
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
     * @return templateScratchId
     */
    public String getTemplateScratchId() {
        return this.templateScratchId;
    }

    /**
     * @return templateScratchRegionId
     */
    public String getTemplateScratchRegionId() {
        return this.templateScratchRegionId;
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

    public static final class Builder extends Request.Builder<GetTemplateEstimateCostRequest, Builder> {
        private String clientToken; 
        private java.util.List < Parameters> parameters; 
        private String regionId; 
        private String stackId; 
        private String templateBody; 
        private String templateId; 
        private String templateScratchId; 
        private String templateScratchRegionId; 
        private String templateURL; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateEstimateCostRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.stackId = request.stackId;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateScratchId = request.templateScratchId;
            this.templateScratchRegionId = request.templateScratchRegionId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
        } 

        /**
         * The name of parameter N. If you do not specify the name and value of a parameter, ROS uses the default name and value that are specified in the template.
         * <p>
         * 
         * Maximum value of N: 200.
         * 
         * Examples:
         * 
         * *   Parameters.1.ParameterKey: `Name`
         * *   Parameters.2.ParameterKey: `Netmode`
         * 
         * >  The Parameters parameter is optional. If you want to specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The region ID of the scenario. The default value is the same as the value of the RegionId parameter.
         * <p>
         * 
         * You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        /**
         * The ID of the template. This parameter applies to shared and private templates.
         * <p>
         * 
         * >  You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * StackId.
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
         * The value of parameter N.
         * <p>
         * 
         * Maximum value of N: 200.
         * 
         * Examples:
         * 
         * *   Parameters.1.ParameterValue: `DemoEip`
         * *   Parameters.2.ParameterValue: `public`
         * 
         * >  The Parameters parameter is optional. If you want to specify Parameters, you must specify both Parameters.N.ParameterKey and Parameters.N.ParameterValue.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        /**
         * TemplateScratchId.
         */
        public Builder templateScratchId(String templateScratchId) {
            this.putQueryParameter("TemplateScratchId", templateScratchId);
            this.templateScratchId = templateScratchId;
            return this;
        }

        /**
         * TemplateScratchRegionId.
         */
        public Builder templateScratchRegionId(String templateScratchRegionId) {
            this.putQueryParameter("TemplateScratchRegionId", templateScratchRegionId);
            this.templateScratchRegionId = templateScratchRegionId;
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
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * The ID of the scenario.
         * <p>
         * 
         * For more information about how to query the IDs of scenarios, see [ListTemplateScratches](~~363050~~).
         * 
         * >  You must specify only one of the following parameters: TemplateBody, TemplateURL, TemplateId, and TemplateScratchId.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public GetTemplateEstimateCostRequest build() {
            return new GetTemplateEstimateCostRequest(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @NameInMap("ParameterKey")
        @Validation(required = true)
        private String parameterKey;

        @NameInMap("ParameterValue")
        @Validation(required = true)
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
             * The ID of the request.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * Details of the resource.
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
