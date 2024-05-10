// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateTemplateRequest} extends {@link RequestModel}
 *
 * <p>ValidateTemplateRequest</p>
 */
public class ValidateTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateBody")
    private String templateBody;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateURL")
    private String templateURL;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UpdateInfoOptions")
    private java.util.List < String > updateInfoOptions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ValidationOption")
    private String validationOption;

    private ValidateTemplateRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.templateBody = builder.templateBody;
        this.templateURL = builder.templateURL;
        this.updateInfoOptions = builder.updateInfoOptions;
        this.validationOption = builder.validationOption;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ValidateTemplateRequest create() {
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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

    /**
     * @return updateInfoOptions
     */
    public java.util.List < String > getUpdateInfoOptions() {
        return this.updateInfoOptions;
    }

    /**
     * @return validationOption
     */
    public String getValidationOption() {
        return this.validationOption;
    }

    public static final class Builder extends Request.Builder<ValidateTemplateRequest, Builder> {
        private String clientToken; 
        private String regionId; 
        private String templateBody; 
        private String templateURL; 
        private java.util.List < String > updateInfoOptions; 
        private String validationOption; 

        private Builder() {
            super();
        } 

        private Builder(ValidateTemplateRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.regionId = request.regionId;
            this.templateBody = request.templateBody;
            this.templateURL = request.templateURL;
            this.updateInfoOptions = request.updateInfoOptions;
            this.validationOption = request.validationOption;
        } 

        /**
         * The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests.
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
         * The region ID of the template. You can call the [DescribeRegions](~~131035~~) operation to query the most recent region list.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
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
         * The URL of the file that contains the template body. The URL must point to a template that is located on an HTTP web server or in an Object Storage Service (OSS) bucket, such as oss://ros/template/demo or oss://ros/template/demo?RegionId=cn-hangzhou. The template body can be up to 524,288 bytes in length.
         * <p>
         * 
         * > If you do not specify the region ID of the OSS bucket, the value of RegionId is used.
         * 
         * You can specify one of TemplateBody and TemplateURL, but not both of them. The URL can be up to 1,024 bytes in length.\
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * The options that are used to control the generation of information about the stack update. You can specify up to two options.
         */
        public Builder updateInfoOptions(java.util.List < String > updateInfoOptions) {
            this.putQueryParameter("UpdateInfoOptions", updateInfoOptions);
            this.updateInfoOptions = updateInfoOptions;
            return this;
        }

        /**
         * Specifies whether to enable additional validation for the template. Valid values:
         * <p>
         * 
         * *   None (default): does not enable additional validation.
         * *   EnableTerraformValidation: runs the `terraform validate` command in the Terraform CLI to enable additional validation for a Terraform template.
         * *   EnableFastTerraformValidation: runs a command that is similar to the `terraform validate` command in the Terraform CLI to enable additional validation for a Terraform template.
         * 
         * > Compared with the EnableTerraformValidation method, the EnableFastTerraformValidation method validates a template at a faster speed but a lower integrity level.
         */
        public Builder validationOption(String validationOption) {
            this.putQueryParameter("ValidationOption", validationOption);
            this.validationOption = validationOption;
            return this;
        }

        @Override
        public ValidateTemplateRequest build() {
            return new ValidateTemplateRequest(this);
        } 

    } 

}
