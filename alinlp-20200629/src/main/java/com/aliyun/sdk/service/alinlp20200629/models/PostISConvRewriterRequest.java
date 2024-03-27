// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostISConvRewriterRequest} extends {@link RequestModel}
 *
 * <p>PostISConvRewriterRequest</p>
 */
public class PostISConvRewriterRequest extends Request {
    @Body
    @NameInMap("Algorithm")
    private String algorithm;

    @Body
    @NameInMap("Debug")
    private Boolean debug;

    @Body
    @NameInMap("Input")
    private java.util.Map < String, ? > input;

    @Body
    @NameInMap("Parameters")
    private java.util.Map < String, ? > parameters;

    @Body
    @NameInMap("Version")
    private String version;

    private PostISConvRewriterRequest(Builder builder) {
        super(builder);
        this.algorithm = builder.algorithm;
        this.debug = builder.debug;
        this.input = builder.input;
        this.parameters = builder.parameters;
        this.version = builder.version;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostISConvRewriterRequest create() {
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
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    /**
     * @return version
     */
    public String getVersion() {
        return this.version;
    }

    public static final class Builder extends Request.Builder<PostISConvRewriterRequest, Builder> {
        private String algorithm; 
        private Boolean debug; 
        private java.util.Map < String, ? > input; 
        private java.util.Map < String, ? > parameters; 
        private String version; 

        private Builder() {
            super();
        } 

        private Builder(PostISConvRewriterRequest request) {
            super(request);
            this.algorithm = request.algorithm;
            this.debug = request.debug;
            this.input = request.input;
            this.parameters = request.parameters;
            this.version = request.version;
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
            this.putBodyParameter("Debug", debug);
            this.debug = debug;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(java.util.Map < String, ? > input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putBodyParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putBodyParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        /**
         * Version.
         */
        public Builder version(String version) {
            this.putBodyParameter("Version", version);
            this.version = version;
            return this;
        }

        @Override
        public PostISConvRewriterRequest build() {
            return new PostISConvRewriterRequest(this);
        } 

    } 

}
