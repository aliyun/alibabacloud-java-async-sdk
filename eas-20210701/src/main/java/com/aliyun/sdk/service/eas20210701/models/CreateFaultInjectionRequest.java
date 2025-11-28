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
 * {@link CreateFaultInjectionRequest} extends {@link RequestModel}
 *
 * <p>CreateFaultInjectionRequest</p>
 */
public class CreateFaultInjectionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ClusterId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String clusterId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceName;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("InstanceName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaultArgs")
    private Object faultArgs;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FaultType")
    private String faultType;

    private CreateFaultInjectionRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.instanceName = builder.instanceName;
        this.faultArgs = builder.faultArgs;
        this.faultType = builder.faultType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateFaultInjectionRequest create() {
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
     * @return faultArgs
     */
    public Object getFaultArgs() {
        return this.faultArgs;
    }

    /**
     * @return faultType
     */
    public String getFaultType() {
        return this.faultType;
    }

    public static final class Builder extends Request.Builder<CreateFaultInjectionRequest, Builder> {
        private String clusterId; 
        private String serviceName; 
        private String instanceName; 
        private Object faultArgs; 
        private String faultType; 

        private Builder() {
            super();
        } 

        private Builder(CreateFaultInjectionRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.instanceName = request.instanceName;
            this.faultArgs = request.faultArgs;
            this.faultType = request.faultType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder clusterId(String clusterId) {
            this.putPathParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>foo</p>
         */
        public Builder serviceName(String serviceName) {
            this.putPathParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>foo-69xxxx4f4-5w9r9</p>
         */
        public Builder instanceName(String instanceName) {
            this.putPathParameter("InstanceName", instanceName);
            this.instanceName = instanceName;
            return this;
        }

        /**
         * FaultArgs.
         */
        public Builder faultArgs(Object faultArgs) {
            this.putBodyParameter("FaultArgs", faultArgs);
            this.faultArgs = faultArgs;
            return this;
        }

        /**
         * FaultType.
         */
        public Builder faultType(String faultType) {
            this.putBodyParameter("FaultType", faultType);
            this.faultType = faultType;
            return this;
        }

        @Override
        public CreateFaultInjectionRequest build() {
            return new CreateFaultInjectionRequest(this);
        } 

    } 

}
