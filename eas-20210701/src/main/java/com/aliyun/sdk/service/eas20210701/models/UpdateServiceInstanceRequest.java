// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateServiceInstanceRequest} extends {@link RequestModel}
 *
 * <p>UpdateServiceInstanceRequest</p>
 */
public class UpdateServiceInstanceRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Isolate")
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
         * <p>The region ID of the service.</p>
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
         * <p>The service name. For more information about how to query the service name, see <a href="~~412109~~">ListServices</a>.</p>
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
         * <p>The instance name. For more information about how to query the instance name, see <a href="~~412108~~">ListServiceInstances</a>.</p>
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
         * <p>Specifies whether to isolate the service instance. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
