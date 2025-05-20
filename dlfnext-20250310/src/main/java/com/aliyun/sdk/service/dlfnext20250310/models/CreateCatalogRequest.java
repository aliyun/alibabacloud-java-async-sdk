// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dlfnext20250310.models;

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
 * {@link CreateCatalogRequest} extends {@link RequestModel}
 *
 * <p>CreateCatalogRequest</p>
 */
public class CreateCatalogRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("optimizationConfig")
    private java.util.Map<String, String> optimizationConfig;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("options")
    private java.util.Map<String, String> options;

    private CreateCatalogRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.optimizationConfig = builder.optimizationConfig;
        this.options = builder.options;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateCatalogRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return optimizationConfig
     */
    public java.util.Map<String, String> getOptimizationConfig() {
        return this.optimizationConfig;
    }

    /**
     * @return options
     */
    public java.util.Map<String, String> getOptions() {
        return this.options;
    }

    public static final class Builder extends Request.Builder<CreateCatalogRequest, Builder> {
        private String name; 
        private java.util.Map<String, String> optimizationConfig; 
        private java.util.Map<String, String> options; 

        private Builder() {
            super();
        } 

        private Builder(CreateCatalogRequest request) {
            super(request);
            this.name = request.name;
            this.optimizationConfig = request.optimizationConfig;
            this.options = request.options;
        } 

        /**
         * name.
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * optimizationConfig.
         */
        public Builder optimizationConfig(java.util.Map<String, String> optimizationConfig) {
            this.putBodyParameter("optimizationConfig", optimizationConfig);
            this.optimizationConfig = optimizationConfig;
            return this;
        }

        /**
         * options.
         */
        public Builder options(java.util.Map<String, String> options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        @Override
        public CreateCatalogRequest build() {
            return new CreateCatalogRequest(this);
        } 

    } 

}
