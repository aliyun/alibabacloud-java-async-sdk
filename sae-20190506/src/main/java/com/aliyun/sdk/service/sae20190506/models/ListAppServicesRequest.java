// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link ListAppServicesRequest} extends {@link RequestModel}
 *
 * <p>ListAppServicesRequest</p>
 */
public class ListAppServicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NacosInstanceId")
    private String nacosInstanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NacosNamespaceId")
    private String nacosNamespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NamespaceId")
    private String namespaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegistryType")
    private String registryType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ServiceType")
    private String serviceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VpcId")
    private String vpcId;

    private ListAppServicesRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.nacosInstanceId = builder.nacosInstanceId;
        this.nacosNamespaceId = builder.nacosNamespaceId;
        this.namespaceId = builder.namespaceId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.registryType = builder.registryType;
        this.serviceType = builder.serviceType;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAppServicesRequest create() {
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
     * @return namespaceId
     */
    public String getNamespaceId() {
        return this.namespaceId;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return registryType
     */
    public String getRegistryType() {
        return this.registryType;
    }

    /**
     * @return serviceType
     */
    public String getServiceType() {
        return this.serviceType;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<ListAppServicesRequest, Builder> {
        private String appId; 
        private String nacosInstanceId; 
        private String nacosNamespaceId; 
        private String namespaceId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String registryType; 
        private String serviceType; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(ListAppServicesRequest request) {
            super(request);
            this.appId = request.appId;
            this.nacosInstanceId = request.nacosInstanceId;
            this.nacosNamespaceId = request.nacosNamespaceId;
            this.namespaceId = request.namespaceId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.registryType = request.registryType;
            this.serviceType = request.serviceType;
            this.vpcId = request.vpcId;
        } 

        /**
         * <p>The ID of the application. You must specify only one of the following parameters: vpcId, namespace ID, and application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>017f39b8-dfa4-4e16-a84b-1dcee4b1****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The ID of the MSE Nacos instance. This parameter is required when the registry type is set to MSE Nacos.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-cn-sco3r0u****</p>
         */
        public Builder nacosInstanceId(String nacosInstanceId) {
            this.putQueryParameter("NacosInstanceId", nacosInstanceId);
            this.nacosInstanceId = nacosInstanceId;
            return this;
        }

        /**
         * <p>The ID of the MSE Nacos namespace. This parameter is required when the registry type is set to MSE Nacos.</p>
         * 
         * <strong>example:</strong>
         * <p>mse-test</p>
         */
        public Builder nacosNamespaceId(String nacosNamespaceId) {
            this.putQueryParameter("NacosNamespaceId", nacosNamespaceId);
            this.nacosNamespaceId = nacosNamespaceId;
            return this;
        }

        /**
         * <p>The ID of the namespace. You must specify only one of the following parameters: VPC ID, namespace ID, and application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-beijing:test</p>
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * <p>The page number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The registry type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: SAE Nacos</li>
         * <li><strong>1</strong>: SAE built-in Nacos</li>
         * <li><strong>2</strong> :MSE Nacos</li>
         * <li><strong>9</strong>: SAE Kubernetes service</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder registryType(String registryType) {
            this.putQueryParameter("RegistryType", registryType);
            this.registryType = registryType;
            return this;
        }

        /**
         * <p>The service type. Valid values:</p>
         * <ul>
         * <li><strong>dubbo</strong></li>
         * <li><strong>springCloud</strong></li>
         * <li><strong>hsf</strong></li>
         * <li><strong>k8sService</strong></li>
         * </ul>
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
         * <p>The unique identifier of the VPC. You must specify only one of the following parameters: VPC ID, namespace ID, and application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2ze0i263cnn311nvj****</p>
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public ListAppServicesRequest build() {
            return new ListAppServicesRequest(this);
        } 

    } 

}
