// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateFunctionDefaultInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateFunctionDefaultInstanceRequest</p>
 */
public class UpdateFunctionDefaultInstanceRequest extends Request {
    @Path
    @NameInMap("appGroupIdentity")
    @Validation(required = true)
    private String appGroupIdentity;

    @Path
    @NameInMap("functionName")
    @Validation(required = true)
    private String functionName;

    @Body
    @NameInMap("instanceName")
    @Validation(required = true)
    private String instanceName;

    private UpdateFunctionDefaultInstanceRequest(Builder builder) {
        super(builder);
        this.appGroupIdentity = builder.appGroupIdentity;
        this.functionName = builder.functionName;
        this.instanceName = builder.instanceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateFunctionDefaultInstanceRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateFunctionDefaultInstanceRequest, Builder> {
        private String appGroupIdentity; 
        private String functionName; 
        private String instanceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateFunctionDefaultInstanceRequest response) {
            super(response);
            this.appGroupIdentity = response.appGroupIdentity;
            this.functionName = response.functionName;
            this.instanceName = response.instanceName;
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
         * 实例名称
         */
        public Builder instanceName(String instanceName) {
            this.putBodyParameter("instanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        @Override
        public UpdateFunctionDefaultInstanceRequest build() {
            return new UpdateFunctionDefaultInstanceRequest(this);
        } 

    } 

}
