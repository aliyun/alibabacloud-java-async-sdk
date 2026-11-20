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

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsReplica")
    private Boolean isReplica;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Detach")
    private Boolean detach;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Hibernate")
    private Boolean hibernate;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Isolate")
    private Boolean isolate;

    private UpdateServiceInstanceRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.serviceName = builder.serviceName;
        this.instanceName = builder.instanceName;
        this.isReplica = builder.isReplica;
        this.detach = builder.detach;
        this.hibernate = builder.hibernate;
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
     * @return isReplica
     */
    public Boolean getIsReplica() {
        return this.isReplica;
    }

    /**
     * @return detach
     */
    public Boolean getDetach() {
        return this.detach;
    }

    /**
     * @return hibernate
     */
    public Boolean getHibernate() {
        return this.hibernate;
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
        private Boolean isReplica; 
        private Boolean detach; 
        private Boolean hibernate; 
        private Boolean isolate; 

        private Builder() {
            super();
        } 

        private Builder(UpdateServiceInstanceRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.serviceName = request.serviceName;
            this.instanceName = request.instanceName;
            this.isReplica = request.isReplica;
            this.detach = request.detach;
            this.hibernate = request.hibernate;
            this.isolate = request.isolate;
        } 

        /**
         * <p>The region where the service is deployed.</p>
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
         * <p>The name of the service. For more information about how to view the service name, see <a href="https://help.aliyun.com/document_detail/412109.html">ListServices</a>.</p>
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
         * <p>The name of the service instance. For more information about how to view the instance name, see <a href="https://help.aliyun.com/document_detail/412108.html">ListServiceInstances</a>.</p>
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
         * <p>Specifies whether the current instance is an instance unit.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder isReplica(Boolean isReplica) {
            this.putQueryParameter("IsReplica", isReplica);
            this.isReplica = isReplica;
            return this;
        }

        /**
         * <p>Specifies whether to isolate the service instance. After an instance is isolated, it is no longer managed by the controller, and a new instance is created. The isolated instance is used to preserve the state or for debugging. Note: An isolated instance cannot be unisolated. Valid values:</p>
         * <ul>
         * <li>true: The instance is isolated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder detach(Boolean detach) {
            this.putBodyParameter("Detach", detach);
            this.detach = detach;
            return this;
        }

        /**
         * <blockquote>
         * <p>This parameter is in invitational preview and is not supported.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder hibernate(Boolean hibernate) {
            this.putBodyParameter("Hibernate", hibernate);
            this.hibernate = hibernate;
            return this;
        }

        /**
         * <p>Specifies whether the instance receives traffic. Valid values:</p>
         * <ul>
         * <li>true: The instance receives traffic.</li>
         * <li>false: The instance does not receive traffic.</li>
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
