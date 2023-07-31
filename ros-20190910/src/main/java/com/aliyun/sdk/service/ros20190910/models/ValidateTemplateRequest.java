// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ValidateTemplateRequest} extends {@link RequestModel}
 *
 * <p>ValidateTemplateRequest</p>
 */
public class ValidateTemplateRequest extends Request {
    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("TemplateBody")
    private String templateBody;

    @Query
    @NameInMap("TemplateURL")
    private String templateURL;

    @Query
    @NameInMap("UpdateInfoOptions")
    private java.util.List < String > updateInfoOptions;

    @Query
    @NameInMap("ValidationOption")
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
         * The regular resource types.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * The description of the output item.
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
         * The name of the output item.
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * UpdateInfoOptions.
         */
        public Builder updateInfoOptions(java.util.List < String > updateInfoOptions) {
            this.putQueryParameter("UpdateInfoOptions", updateInfoOptions);
            this.updateInfoOptions = updateInfoOptions;
            return this;
        }

        /**
         * The DataSource resource types.
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
