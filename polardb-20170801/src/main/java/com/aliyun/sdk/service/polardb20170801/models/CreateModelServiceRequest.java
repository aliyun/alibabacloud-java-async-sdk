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
 * {@link CreateModelServiceRequest} extends {@link RequestModel}
 *
 * <p>CreateModelServiceRequest</p>
 */
public class CreateModelServiceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApiKey")
    @com.aliyun.core.annotation.Validation(required = true)
    private String apiKey;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("BaseUrl")
    @com.aliyun.core.annotation.Validation(required = true)
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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Vendor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String vendor;

    private CreateModelServiceRequest(Builder builder) {
        super(builder);
        this.apiKey = builder.apiKey;
        this.baseUrl = builder.baseUrl;
        this.gwClusterId = builder.gwClusterId;
        this.inputCostPointsPerMillion = builder.inputCostPointsPerMillion;
        this.modelCategory = builder.modelCategory;
        this.name = builder.name;
        this.outputCostPointsPerMillion = builder.outputCostPointsPerMillion;
        this.protocol = builder.protocol;
        this.regionId = builder.regionId;
        this.requestCostPoints = builder.requestCostPoints;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelServiceRequest create() {
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

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder extends Request.Builder<CreateModelServiceRequest, Builder> {
        private String apiKey; 
        private String baseUrl; 
        private String gwClusterId; 
        private String inputCostPointsPerMillion; 
        private String modelCategory; 
        private String name; 
        private String outputCostPointsPerMillion; 
        private String protocol; 
        private String regionId; 
        private String requestCostPoints; 
        private String vendor; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelServiceRequest request) {
            super(request);
            this.apiKey = request.apiKey;
            this.baseUrl = request.baseUrl;
            this.gwClusterId = request.gwClusterId;
            this.inputCostPointsPerMillion = request.inputCostPointsPerMillion;
            this.modelCategory = request.modelCategory;
            this.name = request.name;
            this.outputCostPointsPerMillion = request.outputCostPointsPerMillion;
            this.protocol = request.protocol;
            this.regionId = request.regionId;
            this.requestCostPoints = request.requestCostPoints;
            this.vendor = request.vendor;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        public Builder apiKey(String apiKey) {
            this.putQueryParameter("ApiKey", apiKey);
            this.apiKey = apiKey;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
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
         * <p>test</p>
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

        /**
         * <p>This parameter is required.</p>
         */
        public Builder vendor(String vendor) {
            this.putQueryParameter("Vendor", vendor);
            this.vendor = vendor;
            return this;
        }

        @Override
        public CreateModelServiceRequest build() {
            return new CreateModelServiceRequest(this);
        } 

    } 

}
