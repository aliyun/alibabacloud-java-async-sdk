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

    @Query
    @NameInMap("TemplateBody")
    private String templateBody;

    @Query
    @NameInMap("TemplateURL")
    private String templateURL;

    @Query
    @NameInMap("ValidationOption")
    private String validationOption;

    private ValidateTemplateRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.regionId = builder.regionId;
        this.templateBody = builder.templateBody;
        this.templateURL = builder.templateURL;
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
            this.validationOption = request.validationOption;
        } 

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * RegionId.
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
            this.putQueryParameter("TemplateBody", templateBody);
            this.templateBody = templateBody;
            return this;
        }

        /**
         * TemplateURL.
         */
        public Builder templateURL(String templateURL) {
            this.putQueryParameter("TemplateURL", templateURL);
            this.templateURL = templateURL;
            return this;
        }

        /**
         * ValidationOption.
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
