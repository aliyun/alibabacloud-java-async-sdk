// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionTaskRequest} extends {@link RequestModel}
 *
 * <p>GetFunctionTaskRequest</p>
 */
public class GetFunctionTaskRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Path
    @NameInMap("instanceName")
    @Validation(required = true)
    private String instanceName;

    @Path
    @NameInMap("generation")
    @Validation(required = true)
    private String generation;

    private GetFunctionTaskRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.functionName = builder.functionName;
        this.instanceName = builder.instanceName;
        this.generation = builder.generation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionTaskRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appGroupIdentity
     */
    public String getAppGroupIdentity() {
        return this.appGroupIdentity;
    }

    /**
     * @return functionName
     */
    public String getFunctionName() {
        return this.functionName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return generation
     */
    public String getGeneration() {
        return this.generation;
    }

    public static final class Builder extends Request.Builder<GetFunctionTaskRequest, Builder> {
        private String appGroupIdentity; 
        private String functionName; 
        private String instanceName; 
        private String generation; 

        private Builder() {
            super();
        } 

        private Builder(GetFunctionTaskRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.functionName = request.functionName;
            this.instanceName = request.instanceName;
            this.generation = request.generation;
        } 

        /**
         * The name of the application.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * The name of the feature.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * The name of the instance.
         */
        public Builder instanceName(String instanceName) {
            this.putPathParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * The number of iterations.
         */
        public Builder generation(String generation) {
            this.putPathParameter("generation", generation);
            this.generation = generation;
            return this;
        }

        @Override
        public GetFunctionTaskRequest build() {
            return new GetFunctionTaskRequest(this);
        } 

    } 

}
