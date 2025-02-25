// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostISRetrieveRouterRequest} extends {@link RequestModel}
 *
 * <p>PostISRetrieveRouterRequest</p>
 */
public class PostISRetrieveRouterRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Algorithm")
    private String algorithm;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Debug")
    private Boolean debug;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private java.util.Map < String, ? > input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Model")
    private String model;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    private PostISRetrieveRouterRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.debug = builder.debug;
        this.input = builder.input;
        this.model = builder.model;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostISRetrieveRouterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return algorithm
     */
    public String getAlgorithm() {
        return this.algorithm;
    }

    /**
     * @return debug
     */
    public Boolean getDebug() {
        return this.debug;
    }

    /**
     * @return input
     */
    public java.util.Map < String, ? > getInput() {
        return this.input;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<PostISRetrieveRouterRequest, Builder> {
        private String algorithm; 
        private Boolean debug; 
        private java.util.Map < String, ? > input; 
        private String model; 
        private java.util.Map < String, ? > parameters; 

        private Builder() {
            super();
        } 

        private Builder(PostISRetrieveRouterRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.debug = request.debug;
            this.input = request.input;
            this.model = request.model;
            this.parameters = request.parameters;
        } 

        /**
         * Algorithm.
         */
        public Builder algorithm(String algorithm) {
            this.putBodyParameter("Algorithm", algorithm);
            this.algorithm = algorithm;
            return this;
        }

        /**
         * Debug.
         */
        public Builder debug(Boolean debug) {
            this.putQueryParameter("Debug", debug);
            this.debug = debug;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(java.util.Map < String, ? > input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.putBodyParameter("Model", model);
            this.model = model;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        @Override
        public PostISRetrieveRouterRequest build() {
            return new PostISRetrieveRouterRequest(this);
        } 

    } 

}
