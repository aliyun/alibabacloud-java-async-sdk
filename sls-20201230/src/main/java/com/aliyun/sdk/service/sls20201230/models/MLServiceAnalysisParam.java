// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link MLServiceAnalysisParam} extends {@link TeaModel}
 *
 * <p>MLServiceAnalysisParam</p>
 */
public class MLServiceAnalysisParam extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("input")
    private java.util.List<java.util.Map<String, String>> input;

    @com.aliyun.core.annotation.NameInMap("parameter")
    private java.util.Map<String, String> parameter;

    private MLServiceAnalysisParam(Builder builder) {
        this.input = builder.input;
        this.parameter = builder.parameter;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MLServiceAnalysisParam create() {
        return builder().build();
    }

    /**
     * @return input
     */
    public java.util.List<java.util.Map<String, String>> getInput() {
        return this.input;
    }

    /**
     * @return parameter
     */
    public java.util.Map<String, String> getParameter() {
        return this.parameter;
    }

    public static final class Builder {
        private java.util.List<java.util.Map<String, String>> input; 
        private java.util.Map<String, String> parameter; 

        /**
         * input.
         */
        public Builder input(java.util.List<java.util.Map<String, String>> input) {
            this.input = input;
            return this;
        }

        /**
         * parameter.
         */
        public Builder parameter(java.util.Map<String, String> parameter) {
            this.parameter = parameter;
            return this;
        }

        public MLServiceAnalysisParam build() {
            return new MLServiceAnalysisParam(this);
        } 

    } 

}
