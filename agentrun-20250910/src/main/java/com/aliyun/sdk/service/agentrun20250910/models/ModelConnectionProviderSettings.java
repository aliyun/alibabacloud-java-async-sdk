// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentrun20250910.models;

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
 * {@link ModelConnectionProviderSettings} extends {@link TeaModel}
 *
 * <p>ModelConnectionProviderSettings</p>
 */
public class ModelConnectionProviderSettings extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("baseUrl")
    private String baseUrl;

    @com.aliyun.core.annotation.NameInMap("modelNames")
    private java.util.List<String> modelNames;

    private ModelConnectionProviderSettings(Builder builder) {
        this.baseUrl = builder.baseUrl;
        this.modelNames = builder.modelNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelConnectionProviderSettings create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseUrl
     */
    public String getBaseUrl() {
        return this.baseUrl;
    }

    /**
     * @return modelNames
     */
    public java.util.List<String> getModelNames() {
        return this.modelNames;
    }

    public static final class Builder {
        private String baseUrl; 
        private java.util.List<String> modelNames; 

        private Builder() {
        } 

        private Builder(ModelConnectionProviderSettings model) {
            this.baseUrl = model.baseUrl;
            this.modelNames = model.modelNames;
        } 

        /**
         * <p>模型提供商的默认API基础地址</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://api.openai.com/v1">https://api.openai.com/v1</a></p>
         */
        public Builder baseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        /**
         * <p>该连接支持的模型名称列表</p>
         */
        public Builder modelNames(java.util.List<String> modelNames) {
            this.modelNames = modelNames;
            return this;
        }

        public ModelConnectionProviderSettings build() {
            return new ModelConnectionProviderSettings(this);
        } 

    } 

}
