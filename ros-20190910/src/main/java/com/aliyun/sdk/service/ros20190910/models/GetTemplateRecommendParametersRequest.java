// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTemplateRecommendParametersRequest} extends {@link RequestModel}
 *
 * <p>GetTemplateRecommendParametersRequest</p>
 */
public class GetTemplateRecommendParametersRequest extends Request {
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

    private GetTemplateRecommendParametersRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.parameters = builder.parameters;
        this.regionId = builder.regionId;
        this.templateBody = builder.templateBody;
        this.templateId = builder.templateId;
        this.templateURL = builder.templateURL;
        this.templateVersion = builder.templateVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetTemplateRecommendParametersRequest create() {
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

    public static final class Builder extends Request.Builder<GetTemplateRecommendParametersRequest, Builder> {
        private String clientToken; 
        private java.util.List < Parameters> parameters; 
        private String regionId; 
        private String templateBody; 
        private String templateId; 
        private String templateURL; 
        private String templateVersion; 

        private Builder() {
            super();
        } 

        private Builder(GetTemplateRecommendParametersRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.parameters = request.parameters;
            this.regionId = request.regionId;
            this.templateBody = request.templateBody;
            this.templateId = request.templateId;
            this.templateURL = request.templateURL;
            this.templateVersion = request.templateVersion;
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
         * Parameters.
         */
        public Builder parameters(java.util.List < Parameters> parameters) {
            this.putQueryParameter("Parameters", parameters);
            this.parameters = parameters;
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
         * TemplateId.
         */
        public Builder templateId(String templateId) {
            this.putQueryParameter("TemplateId", templateId);
            this.templateId = templateId;
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
         * TemplateVersion.
         */
        public Builder templateVersion(String templateVersion) {
            this.putQueryParameter("TemplateVersion", templateVersion);
            this.templateVersion = templateVersion;
            return this;
        }

        @Override
        public GetTemplateRecommendParametersRequest build() {
            return new GetTemplateRecommendParametersRequest(this);
        } 

    } 

    public static class Parameters extends TeaModel {
        @NameInMap("ParameterCandidateValues")
        private java.util.List < String > parameterCandidateValues;

        @NameInMap("ParameterKey")
        private String parameterKey;

        @NameInMap("ParameterValue")
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterCandidateValues = builder.parameterCandidateValues;
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
         * @return parameterCandidateValues
         */
        public java.util.List < String > getParameterCandidateValues() {
            return this.parameterCandidateValues;
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
            private java.util.List < String > parameterCandidateValues; 
            private String parameterKey; 
            private String parameterValue; 

            /**
             * ParameterCandidateValues.
             */
            public Builder parameterCandidateValues(java.util.List < String > parameterCandidateValues) {
                this.parameterCandidateValues = parameterCandidateValues;
                return this;
            }

            /**
             * ParameterKey.
             */
            public Builder parameterKey(String parameterKey) {
                this.parameterKey = parameterKey;
                return this;
            }

            /**
             * ParameterValue.
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
