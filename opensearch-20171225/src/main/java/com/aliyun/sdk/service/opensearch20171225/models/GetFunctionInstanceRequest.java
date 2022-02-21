// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionInstanceRequest} extends {@link RequestModel}
 *
 * <p>GetFunctionInstanceRequest</p>
 */
public class GetFunctionInstanceRequest extends Request {
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

    @Query
    @NameInMap("output")
    private String output;

    private GetFunctionInstanceRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.functionName = builder.functionName;
        this.instanceName = builder.instanceName;
        this.output = builder.output;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFunctionInstanceRequest create() {
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
     * @return output
     */
    public String getOutput() {
        return this.output;
    }

    public static final class Builder extends Request.Builder<GetFunctionInstanceRequest, Builder> {
        private String appGroupIdentity; 
        private String functionName; 
        private String instanceName; 
        private String output; 

        private Builder() {
            super();
        } 

        private Builder(GetFunctionInstanceRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.functionName = response.functionName;
            this.instanceName = response.instanceName;
            this.output = response.output;
        } 

        /**
         * appGroupIdentity.
         */
        public Builder appGroupIdentity(String appGroupIdentity) {
            this.putPathParameter("appGroupIdentity", appGroupIdentity);
            this.appGroupIdentity = appGroupIdentity;
            return this;
        }

        /**
         * functionName.
         */
        public Builder functionName(String functionName) {
            this.putPathParameter("functionName", functionName);
            this.functionName = functionName;
            return this;
        }

        /**
         * instanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putPathParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * output.
         */
        public Builder output(String output) {
            this.putQueryParameter("output", output);
            this.output = output;
            return this;
        }

        @Override
        public GetFunctionInstanceRequest build() {
            return new GetFunctionInstanceRequest(this);
        } 

    } 

}
