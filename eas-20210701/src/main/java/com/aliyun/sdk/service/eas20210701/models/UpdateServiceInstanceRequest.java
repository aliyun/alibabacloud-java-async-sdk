// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateServiceInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceInstanceRequest</p>
 */
public class UpdateServiceInstanceRequest extends Request {
    @Path
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Path
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    @Path
    @NameInMap("InstanceName")
    @Validation(required = true)
    private String instanceName;

    @Body
    @NameInMap("Isolate")
    private Boolean isolate;

    private UpdateServiceInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.instanceName = builder.instanceName;
        this.isolate = builder.isolate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateServiceInstanceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return instanceName
     */
    public String getInstanceName() {
        return this.instanceName;
    }

    /**
     * @return isolate
     */
    public Boolean getIsolate() {
        return this.isolate;
    }

    public static final class Builder extends Request.Builder<UpdateServiceInstanceRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String instanceName; 
        private Boolean isolate; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.instanceName = request.instanceName;
            this.isolate = request.isolate;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * InstanceName.
         */
        public Builder instanceName(String instanceName) {
            this.putPathParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * Isolate.
         */
        public Builder isolate(Boolean isolate) {
            this.putBodyParameter("Isolate", isolate);
            this.isolate = isolate;
            return this;
        }

        @Override
        public UpdateServiceInstanceRequest build() {
            return new UpdateServiceInstanceRequest(this);
        } 

    } 

}
