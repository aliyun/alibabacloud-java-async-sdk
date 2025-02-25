// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFunctionInstanceRequest} extends {@link RequestModel}
 *
 * <p>DeleteFunctionInstanceRequest</p>
 */
public class DeleteFunctionInstanceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("appGroupIdentity")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appGroupIdentity;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("functionName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String functionName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("instanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    private DeleteFunctionInstanceRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.functionName = builder.functionName;
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFunctionInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteFunctionInstanceRequest, Builder> {
        private String appGroupIdentity; 
        private String functionName; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFunctionInstanceRequest request) {
            super(request);
            this.appGroupIdentity = request.appGroupIdentity;
            this.functionName = request.functionName;
            this.instanceName = request.instanceName;
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

        @Override
        public DeleteFunctionInstanceRequest build() {
            return new DeleteFunctionInstanceRequest(this);
        } 

    } 

}
