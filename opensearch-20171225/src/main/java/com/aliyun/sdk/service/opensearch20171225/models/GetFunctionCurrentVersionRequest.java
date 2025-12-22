// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

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
         * <p>The name of the feature. Valid values:</p>
         * <ul>
         * <li>ctr: click-through rate (CTR) model</li>
         * <li>pop: popularity model</li>
         * <li>category: category model</li>
         * <li>hot: hotword model</li>
         * <li>hint: shading model</li>
         * <li>suggest: drop-down suggestion model</li>
         * <li>analyzer: word segmentation model</li>
         * <li>termweight: word weight model</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ctr</p>
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * <p>The category. By default, this parameter is left empty.</p>
         * 
         * <strong>example:</strong>
         * <p>general</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The industry. By default, this parameter is left empty, which indicates General-purpose Edition.</p>
         * 
         * <strong>example:</strong>
         * <p>ecommerce</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>The type of the feature. Valid values:</p>
         * <ul>
         * <li>PAAS. This is the default value.</li>
         * <li>SAAS.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAAS</p>
         */
        public Builder functionType(String functionType) {
            this.putQueryParameter("functionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * <p>The type of the model. The following features correspond to different model types:</p>
         * <ul>
         * <li>CTR model: tf_checkpoint</li>
         * <li>Popularity model: pop</li>
         * <li>Category model: offline_inference</li>
         * <li>Hotword model: offline_inference</li>
         * <li>Shading model: offline_inference</li>
         * <li>Drop-down suggestion model: offline_inference</li>
         * <li>Word segmentation model: text</li>
         * <li>Word weight model: tf_checkpoint</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>tf_checkpoint</p>
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
