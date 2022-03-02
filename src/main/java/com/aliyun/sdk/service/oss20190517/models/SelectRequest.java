// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link SelectRequest} extends {@link RequestModel}
 *
 * <p>SelectRequest</p>
 */
public class SelectRequest extends Request {
    @NameInMap("Expression")
    private String expression;

    @NameInMap("InputSerialization")
    private InputSerialization inputSerialization;

    @NameInMap("Options")
    private SelectRequestOptions options;

    @NameInMap("OutputSerialization")
    private OutputSerialization outputSerialization;

    private SelectRequest(Builder builder) {
        super(builder);
        this.expression = builder.expression;
        this.inputSerialization = builder.inputSerialization;
        this.options = builder.options;
        this.outputSerialization = builder.outputSerialization;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SelectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expression
     */
    public String getExpression() {
        return this.expression;
    }

    /**
     * @return inputSerialization
     */
    public InputSerialization getInputSerialization() {
        return this.inputSerialization;
    }

    /**
     * @return options
     */
    public SelectRequestOptions getOptions() {
        return this.options;
    }

    /**
     * @return outputSerialization
     */
    public OutputSerialization getOutputSerialization() {
        return this.outputSerialization;
    }

    public static final class Builder extends Request.Builder<SelectRequest, Builder> {
        private String expression; 
        private InputSerialization inputSerialization; 
        private SelectRequestOptions options; 
        private OutputSerialization outputSerialization; 

        private Builder() {
            super();
        } 

        private Builder(SelectRequest request) {
            super(request);
            this.expression = request.expression;
            this.inputSerialization = request.inputSerialization;
            this.options = request.options;
            this.outputSerialization = request.outputSerialization;
        } 

        /**
         * description
         */
        public Builder expression(String expression) {
            this.expression = expression;
            return this;
        }

        /**
         * InputSerialization.
         */
        public Builder inputSerialization(InputSerialization inputSerialization) {
            this.inputSerialization = inputSerialization;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(SelectRequestOptions options) {
            this.options = options;
            return this;
        }

        /**
         * OutputSerialization.
         */
        public Builder outputSerialization(OutputSerialization outputSerialization) {
            this.outputSerialization = outputSerialization;
            return this;
        }

        @Override
        public SelectRequest build() {
            return new SelectRequest(this);
        } 

    } 

}
