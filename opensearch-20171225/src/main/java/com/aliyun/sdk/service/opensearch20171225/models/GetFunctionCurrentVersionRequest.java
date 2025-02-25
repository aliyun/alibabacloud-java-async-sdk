// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionCurrentVersionRequest} extends {@link RequestModel}
 *
 * <p>GetFunctionCurrentVersionRequest</p>
 */
public class GetFunctionCurrentVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("functionType")
    private String functionType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("modelType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelType;

    private GetFunctionCurrentVersionRequest(Builder builder) {
        super(builder);
        this.functionName = builder.functionName;
        this.category = builder.category;
        this.domain = builder.domain;
        this.functionType = builder.functionType;
        this.modelType = builder.modelType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionCurrentVersionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return functionType
     */
    public String getFunctionType() {
        return this.functionType;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    public static final class Builder extends Request.Builder<GetFunctionCurrentVersionRequest, Builder> {
        private String functionName; 
        private String category; 
        private String domain; 
        private String functionType; 
        private String modelType; 

        private Builder() {
            super();
        } 

        private Builder(GetFunctionCurrentVersionRequest request) {
            super(request);
            this.functionName = request.functionName;
            this.category = request.category;
            this.domain = request.domain;
            this.functionType = request.functionType;
            this.modelType = request.modelType;
        } 

        /**
         * The name of the feature. Valid values:
         * <p>
         * 
         * *   ctr: click-through rate (CTR) model
         * *   pop: popularity model
         * *   category: category model
         * *   hot: hotword model
         * *   hint: shading model
         * *   suggest: drop-down suggestion model
         * *   analyzer: word segmentation model
         * *   termweight: word weight model
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The category. By default, this parameter is left empty.
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * The industry. By default, this parameter is left empty, which indicates General-purpose Edition.
         */
        public Builder domain(String domain) {
            this.putQueryParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * The type of the feature. Valid values:
         * <p>
         * 
         * *   PAAS. This is the default value.
         * *   SAAS.
         */
        public Builder functionType(String functionType) {
            this.putQueryParameter("functionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * The type of the model. The following features correspond to different model types:
         * <p>
         * 
         * *   CTR model: tf_checkpoint
         * *   Popularity model: pop
         * *   Category model: offline_inference
         * *   Hotword model: offline_inference
         * *   Shading model: offline_inference
         * *   Drop-down suggestion model: offline_inference
         * *   Word segmentation model: text
         * *   Word weight model: tf_checkpoint
         */
        public Builder modelType(String modelType) {
            this.putQueryParameter("modelType", modelType);
            this.modelType = modelType;
            return this;
        }

        @Override
        public GetFunctionCurrentVersionRequest build() {
            return new GetFunctionCurrentVersionRequest(this);
        } 

    } 

}
