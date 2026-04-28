// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link ModifyModelServiceRequest} extends {@link RequestModel}
 *
 * <p>ModifyModelServiceRequest</p>
 */
public class ModifyModelServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseUrl")
    private String baseUrl;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("GwClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gwClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InputCostPointsPerMillion")
    private String inputCostPointsPerMillion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelCategory")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelServiceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelServiceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OutputCostPointsPerMillion")
    private String outputCostPointsPerMillion;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Protocol")
    @com.aliyun.core.annotation.Validation(required = true)
    private String protocol;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RequestCostPoints")
    private String requestCostPoints;

    private ModifyModelServiceRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.baseUrl = builder.baseUrl;
        this.gwClusterId = builder.gwClusterId;
        this.inputCostPointsPerMillion = builder.inputCostPointsPerMillion;
        this.modelCategory = builder.modelCategory;
        this.modelServiceId = builder.modelServiceId;
        this.name = builder.name;
        this.outputCostPointsPerMillion = builder.outputCostPointsPerMillion;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.requestCostPoints = builder.requestCostPoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyModelServiceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiKey
     */
    public String getApiKey() {
        return this.apiKey;
    }

    /**
     * @return baseUrl
     */
    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * @return gwClusterId
     */
    public String getGwClusterId() {
        return this.gwClusterId;
    }

    /**
     * @return inputCostPointsPerMillion
     */
    public String getInputCostPointsPerMillion() {
        return this.inputCostPointsPerMillion;
    }

    /**
     * @return modelCategory
     */
    public String getModelCategory() {
        return this.modelCategory;
    }

    /**
     * @return modelServiceId
     */
    public String getModelServiceId() {
        return this.modelServiceId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return outputCostPointsPerMillion
     */
    public String getOutputCostPointsPerMillion() {
        return this.outputCostPointsPerMillion;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return requestCostPoints
     */
    public String getRequestCostPoints() {
        return this.requestCostPoints;
    }

    public static final class Builder extends Request.Builder<ModifyModelServiceRequest, Builder> {
        private String apiKey; 
        private String baseUrl; 
        private String gwClusterId; 
        private String inputCostPointsPerMillion; 
        private String modelCategory; 
        private String modelServiceId; 
        private String name; 
        private String outputCostPointsPerMillion; 
        private String protocol; 
        private String regionId; 
        private String requestCostPoints; 

        private Builder() {
            super();
        } 

        private Builder(ModifyModelServiceRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.baseUrl = request.baseUrl;
            this.gwClusterId = request.gwClusterId;
            this.inputCostPointsPerMillion = request.inputCostPointsPerMillion;
            this.modelCategory = request.modelCategory;
            this.modelServiceId = request.modelServiceId;
            this.name = request.name;
            this.outputCostPointsPerMillion = request.outputCostPointsPerMillion;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.requestCostPoints = request.requestCostPoints;
        } 

        /**
         * ApiKey.
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * BaseUrl.
         */
        public Builder baseUrl(String baseUrl) {
            this.putQueryParameter("BaseUrl", baseUrl);
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pg-xxxxxxxxxx</p>
         */
        public Builder gwClusterId(String gwClusterId) {
            this.putQueryParameter("GwClusterId", gwClusterId);
            this.gwClusterId = gwClusterId;
            return this;
        }

        /**
         * InputCostPointsPerMillion.
         */
        public Builder inputCostPointsPerMillion(String inputCostPointsPerMillion) {
            this.putQueryParameter("InputCostPointsPerMillion", inputCostPointsPerMillion);
            this.inputCostPointsPerMillion = inputCostPointsPerMillion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder modelCategory(String modelCategory) {
            this.putQueryParameter("ModelCategory", modelCategory);
            this.modelCategory = modelCategory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ms-xxxxxx</p>
         */
        public Builder modelServiceId(String modelServiceId) {
            this.putQueryParameter("ModelServiceId", modelServiceId);
            this.modelServiceId = modelServiceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testName</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * OutputCostPointsPerMillion.
         */
        public Builder outputCostPointsPerMillion(String outputCostPointsPerMillion) {
            this.putQueryParameter("OutputCostPointsPerMillion", outputCostPointsPerMillion);
            this.outputCostPointsPerMillion = outputCostPointsPerMillion;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>openai</p>
         */
        public Builder protocol(String protocol) {
            this.putQueryParameter("Protocol", protocol);
            this.protocol = protocol;
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
         * RequestCostPoints.
         */
        public Builder requestCostPoints(String requestCostPoints) {
            this.putQueryParameter("RequestCostPoints", requestCostPoints);
            this.requestCostPoints = requestCostPoints;
            return this;
        }

        @Override
        public ModifyModelServiceRequest build() {
            return new ModifyModelServiceRequest(this);
        } 

    } 

}
