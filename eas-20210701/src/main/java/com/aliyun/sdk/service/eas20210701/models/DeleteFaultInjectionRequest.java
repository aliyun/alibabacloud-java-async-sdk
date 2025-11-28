// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

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
 * {@link DeleteFaultInjectionRequest} extends {@link RequestModel}
 *
 * <p>DeleteFaultInjectionRequest</p>
 */
public class DeleteFaultInjectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    private String instanceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("FaultType")
    private String faultType;

    private DeleteFaultInjectionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.instanceName = builder.instanceName;
        this.faultType = builder.faultType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteFaultInjectionRequest create() {
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
     * @return faultType
     */
    public String getFaultType() {
        return this.faultType;
    }

    public static final class Builder extends Request.Builder<DeleteFaultInjectionRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String instanceName; 
        private String faultType; 

        private Builder() {
            super();
        } 

        private Builder(DeleteFaultInjectionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.instanceName = request.instanceName;
            this.faultType = request.faultType;
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
         * FaultType.
         */
        public Builder faultType(String faultType) {
            this.putPathParameter("FaultType", faultType);
            this.faultType = faultType;
            return this;
        }

        @Override
        public DeleteFaultInjectionRequest build() {
            return new DeleteFaultInjectionRequest(this);
        } 

    } 

}
