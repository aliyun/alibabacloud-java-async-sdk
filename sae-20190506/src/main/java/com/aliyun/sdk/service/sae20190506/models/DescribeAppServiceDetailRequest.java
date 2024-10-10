// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeAppServiceDetailRequest} extends {@link RequestModel}
 *
 * <p>DescribeAppServiceDetailRequest</p>
 */
public class DescribeAppServiceDetailRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NacosInstanceId")
    private String nacosInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NacosNamespaceId")
    private String nacosNamespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceGroup")
    private String serviceGroup;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceName")
    private String serviceName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceVersion")
    private String serviceVersion;

    private DescribeAppServiceDetailRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.nacosInstanceId = builder.nacosInstanceId;
        this.nacosNamespaceId = builder.nacosNamespaceId;
        this.serviceGroup = builder.serviceGroup;
        this.serviceName = builder.serviceName;
        this.serviceType = builder.serviceType;
        this.serviceVersion = builder.serviceVersion;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAppServiceDetailRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return nacosInstanceId
     */
    public String getNacosInstanceId() {
        return this.nacosInstanceId;
    }

    /**
     * @return nacosNamespaceId
     */
    public String getNacosNamespaceId() {
        return this.nacosNamespaceId;
    }

    /**
     * @return serviceGroup
     */
    public String getServiceGroup() {
        return this.serviceGroup;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return serviceVersion
     */
    public String getServiceVersion() {
        return this.serviceVersion;
    }

    public static final class Builder extends Request.Builder<DescribeAppServiceDetailRequest, Builder> {
        private String appId; 
        private String nacosInstanceId; 
        private String nacosNamespaceId; 
        private String serviceGroup; 
        private String serviceName; 
        private String serviceType; 
        private String serviceVersion; 

        private Builder() {
            super();
        } 

        private Builder(DescribeAppServiceDetailRequest request) {
            super(request);
            this.appId = request.appId;
            this.nacosInstanceId = request.nacosInstanceId;
            this.nacosNamespaceId = request.nacosNamespaceId;
            this.serviceGroup = request.serviceGroup;
            this.serviceName = request.serviceName;
            this.serviceType = request.serviceType;
            this.serviceVersion = request.serviceVersion;
        } 

        /**
         * <p>6dcc8c9e-d3da-478a-a066-86dcf820****</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6dcc8c9e-d3da-478a-a066-86dcf820****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * NacosInstanceId.
         */
        public Builder nacosInstanceId(String nacosInstanceId) {
            this.putQueryParameter("NacosInstanceId", nacosInstanceId);
            this.nacosInstanceId = nacosInstanceId;
            return this;
        }

        /**
         * NacosNamespaceId.
         */
        public Builder nacosNamespaceId(String nacosNamespaceId) {
            this.putQueryParameter("NacosNamespaceId", nacosNamespaceId);
            this.nacosNamespaceId = nacosNamespaceId;
            return this;
        }

        /**
         * <p>springCloud</p>
         * 
         * <strong>example:</strong>
         * <p>springCloud</p>
         */
        public Builder serviceGroup(String serviceGroup) {
            this.putQueryParameter("ServiceGroup", serviceGroup);
            this.serviceGroup = serviceGroup;
            return this;
        }

        /**
         * <p>edas.service.provider</p>
         * 
         * <strong>example:</strong>
         * <p>edas.service.provider</p>
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        /**
         * <p>springCloud</p>
         * 
         * <strong>example:</strong>
         * <p>springCloud</p>
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * <p>1.0.0</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        public Builder serviceVersion(String serviceVersion) {
            this.putQueryParameter("ServiceVersion", serviceVersion);
            this.serviceVersion = serviceVersion;
            return this;
        }

        @Override
        public DescribeAppServiceDetailRequest build() {
            return new DescribeAppServiceDetailRequest(this);
        } 

    } 

}
