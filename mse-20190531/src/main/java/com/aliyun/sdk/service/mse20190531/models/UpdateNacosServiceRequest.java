// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateNacosServiceRequest} extends {@link RequestModel}
 *
 * <p>UpdateNacosServiceRequest</p>
 */
public class UpdateNacosServiceRequest extends Request {
    @Query
    @NameInMap("AcceptLanguage")
    private String acceptLanguage;

    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("GroupName")
    private String groupName;

    @Query
    @NameInMap("InstanceId")
    private String instanceId;

    @Query
    @NameInMap("NamespaceId")
    private String namespaceId;

    @Query
    @NameInMap("ProtectThreshold")
    private String protectThreshold;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    private UpdateNacosServiceRequest(Builder builder) {
        super(builder);
        this.acceptLanguage = builder.acceptLanguage;
        this.clusterId = builder.clusterId;
        this.groupName = builder.groupName;
        this.instanceId = builder.instanceId;
        this.namespaceId = builder.namespaceId;
        this.protectThreshold = builder.protectThreshold;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNacosServiceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceptLanguage
     */
    public String getAcceptLanguage() {
        return this.acceptLanguage;
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return groupName
     */
    public String getGroupName() {
        return this.groupName;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return protectThreshold
     */
    public String getProtectThreshold() {
        return this.protectThreshold;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<UpdateNacosServiceRequest, Builder> {
        private String acceptLanguage; 
        private String clusterId; 
        private String groupName; 
        private String instanceId; 
        private String namespaceId; 
        private String protectThreshold; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNacosServiceRequest request) {
            super(request);
            this.acceptLanguage = request.acceptLanguage;
            this.clusterId = request.clusterId;
            this.groupName = request.groupName;
            this.instanceId = request.instanceId;
            this.namespaceId = request.namespaceId;
            this.protectThreshold = request.protectThreshold;
            this.serviceName = request.serviceName;
        } 

        /**
         * system error
         */
        public Builder acceptLanguage(String acceptLanguage) {
            this.putQueryParameter("AcceptLanguage", acceptLanguage);
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        /**
         * systemError
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * clusterNotFound
         */
        public Builder groupName(String groupName) {
            this.putQueryParameter("GroupName", groupName);
            this.groupName = groupName;
            return this;
        }

        /**
         * illegal request:%s
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * cluster not found
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * mse-100-001
         */
        public Builder protectThreshold(String protectThreshold) {
            this.putQueryParameter("ProtectThreshold", protectThreshold);
            this.protectThreshold = protectThreshold;
            return this;
        }

        /**
         * mse-200-021
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public UpdateNacosServiceRequest build() {
            return new UpdateNacosServiceRequest(this);
        } 

    } 

}
