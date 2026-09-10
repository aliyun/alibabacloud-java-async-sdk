// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iacservice20210806.models;

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
 * {@link UpdateParameterSetAttributeRequest} extends {@link RequestModel}
 *
 * <p>UpdateParameterSetAttributeRequest</p>
 */
public class UpdateParameterSetAttributeRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("parameterSetId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String parameterSetId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.List<Parameters> parameters;

    private UpdateParameterSetAttributeRequest(Builder builder) {
        super(builder);
        this.parameterSetId = builder.parameterSetId;
        this.description = builder.description;
        this.name = builder.name;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateParameterSetAttributeRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return parameterSetId
     */
    public String getParameterSetId() {
        return this.parameterSetId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return parameters
     */
    public java.util.List<Parameters> getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<UpdateParameterSetAttributeRequest, Builder> {
        private String parameterSetId; 
        private String description; 
        private String name; 
        private java.util.List<Parameters> parameters; 

        private Builder() {
            super();
        } 

        private Builder(UpdateParameterSetAttributeRequest request) {
            super(request);
            this.parameterSetId = request.parameterSetId;
            this.description = request.description;
            this.name = request.name;
            this.parameters = request.parameters;
        } 

        /**
         * <p>The parameter set ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pts-433aead7560571fc2556dc33a4a</p>
         */
        public Builder parameterSetId(String parameterSetId) {
            this.putPathParameter("parameterSetId", parameterSetId);
            this.parameterSetId = parameterSetId;
            return this;
        }

        /**
         * <p>The description of the parameter set. Maximum length: 1024 characters.</p>
         * 
         * <strong>example:</strong>
         * <p>This is parameterSet</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the parameter set. Maximum length: 128 characters.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The parameter list.</p>
         */
        public Builder parameters(java.util.List<Parameters> parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        @Override
        public UpdateParameterSetAttributeRequest build() {
            return new UpdateParameterSetAttributeRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateParameterSetAttributeRequest} extends {@link TeaModel}
     *
     * <p>UpdateParameterSetAttributeRequest</p>
     */
    public static class Parameters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("secret")
        private Boolean secret;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private Parameters(Builder builder) {
            this.name = builder.name;
            this.secret = builder.secret;
            this.status = builder.status;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parameters create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return secret
         */
        public Boolean getSecret() {
            return this.secret;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private Boolean secret; 
            private String status; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(Parameters model) {
                this.name = model.name;
                this.secret = model.secret;
                this.status = model.status;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * <p>The parameter name.</p>
             * 
             * <strong>example:</strong>
             * <p>region</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Specifies whether the parameter is a secret parameter. Secret parameters are hidden in API responses and console displays, and are stored with encryption.</p>
             */
            public Builder secret(Boolean secret) {
                this.secret = secret;
                return this;
            }

            /**
             * <p>The parameter set status. Valid values: </p>
             * <p>HAS_VALUE (default): Defines a specific value. </p>
             * <p>EXPLICIT_NULL: Explicitly set to null.</p>
             * 
             * <strong>example:</strong>
             * <p>HAS_VALUE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The parameter type (string/number/bool/map(string)/list(string)).</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The parameter value. Use JSON for complex types.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-zhangjiakou</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Parameters build() {
                return new Parameters(this);
            } 

        } 

    }
}
