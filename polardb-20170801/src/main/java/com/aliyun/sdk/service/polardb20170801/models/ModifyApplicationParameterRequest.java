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
 * {@link ModifyApplicationParameterRequest} extends {@link RequestModel}
 *
 * <p>ModifyApplicationParameterRequest</p>
 */
public class ModifyApplicationParameterRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterName")
    private String parameterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ParameterValue")
    private String parameterValue;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Parameters")
    private java.util.List<Parameters> parameters;

    private ModifyApplicationParameterRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.parameterName = builder.parameterName;
        this.parameterValue = builder.parameterValue;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyApplicationParameterRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return parameterName
     */
    public String getParameterName() {
        return this.parameterName;
    }

    /**
     * @return parameterValue
     */
    public String getParameterValue() {
        return this.parameterValue;
    }

    /**
     * @return parameters
     */
    public java.util.List<Parameters> getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<ModifyApplicationParameterRequest, Builder> {
        private String applicationId; 
        private String parameterName; 
        private String parameterValue; 
        private java.util.List<Parameters> parameters; 

        private Builder() {
            super();
        } 

        private Builder(ModifyApplicationParameterRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.parameterName = request.parameterName;
            this.parameterValue = request.parameterValue;
            this.parameters = request.parameters;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-**************</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * ParameterName.
         */
        public Builder parameterName(String parameterName) {
            this.putQueryParameter("ParameterName", parameterName);
            this.parameterName = parameterName;
            return this;
        }

        /**
         * ParameterValue.
         */
        public Builder parameterValue(String parameterValue) {
            this.putQueryParameter("ParameterValue", parameterValue);
            this.parameterValue = parameterValue;
            return this;
        }

        /**
         * Parameters.
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            String parametersShrink = shrink(parameters, "Parameters", "json");
            this.putQueryParameter("Parameters", parametersShrink);
            this.parameters = parameters;
            return this;
        }

        @Override
        public ModifyApplicationParameterRequest build() {
            return new ModifyApplicationParameterRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyApplicationParameterRequest} extends {@link TeaModel}
     *
     * <p>ModifyApplicationParameterRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ParameterName")
        private String parameterName;

        @com.aliyun.core.annotation.NameInMap("ParameterValue")
        private String parameterValue;

        private Parameters(Builder builder) {
            this.parameterName = builder.parameterName;
            this.parameterValue = builder.parameterValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return parameterName
         */
        public String getParameterName() {
            return this.parameterName;
        }

        /**
         * @return parameterValue
         */
        public String getParameterValue() {
            return this.parameterValue;
        }

        public static final class Builder {
            private String parameterName; 
            private String parameterValue; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.parameterName = model.parameterName;
                this.parameterValue = model.parameterValue;
            } 

            /**
             * ParameterName.
             */
            public Builder parameterName(String parameterName) {
                this.parameterName = parameterName;
                return this;
            }

            /**
             * ParameterValue.
             */
            public Builder parameterValue(String parameterValue) {
                this.parameterValue = parameterValue;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
