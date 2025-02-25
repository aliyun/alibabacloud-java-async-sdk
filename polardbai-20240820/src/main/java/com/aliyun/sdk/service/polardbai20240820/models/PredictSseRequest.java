// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardbai20240820.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PredictSseRequest} extends {@link RequestModel}
 *
 * <p>PredictSseRequest</p>
 */
public class PredictSseRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dbName")
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("input")
    private String input;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("instanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("modelClass")
    private String modelClass;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("parameters")
    private java.util.Map < String, ? > parameters;

    private PredictSseRequest(Builder builder) {
        super(builder);
        this.dbName = builder.dbName;
        this.input = builder.input;
        this.instanceName = builder.instanceName;
        this.modelClass = builder.modelClass;
        this.parameters = builder.parameters;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PredictSseRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return input
     */
    public String getInput() {
        return this.input;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return modelClass
     */
    public String getModelClass() {
        return this.modelClass;
    }

    /**
     * @return parameters
     */
    public java.util.Map < String, ? > getParameters() {
        return this.parameters;
    }

    public static final class Builder extends Request.Builder<PredictSseRequest, Builder> {
        private String dbName; 
        private String input; 
        private String instanceName; 
        private String modelClass; 
        private java.util.Map < String, ? > parameters; 

        private Builder() {
            super();
        } 

        private Builder(PredictSseRequest request) {
            super(request);
            this.dbName = request.dbName;
            this.input = request.input;
            this.instanceName = request.instanceName;
            this.modelClass = request.modelClass;
            this.parameters = request.parameters;
        } 

        /**
         * dbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("dbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * input.
         */
        public Builder input(String input) {
            this.putBodyParameter("input", input);
            this.input = input;
            return this;
        }

        /**
         * instanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * modelClass.
         */
        public Builder modelClass(String modelClass) {
            this.putBodyParameter("modelClass", modelClass);
            this.modelClass = modelClass;
            return this;
        }

        /**
         * parameters.
         */
        public Builder parameters(java.util.Map < String, ? > parameters) {
            this.putBodyParameter("parameters", parameters);
            this.parameters = parameters;
            return this;
        }

        @Override
        public PredictSseRequest build() {
            return new PredictSseRequest(this);
        } 

    } 

}
