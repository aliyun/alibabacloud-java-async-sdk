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
         * AppId.
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
         * NamespaceId.
         */
        public Builder namespaceId(String namespaceId) {
            this.putQueryParameter("NamespaceId", namespaceId);
            this.namespaceId = namespaceId;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegistryType.
         */
        public Builder registryType(String registryType) {
            this.putQueryParameter("RegistryType", registryType);
            this.registryType = registryType;
            return this;
        }

        /**
         * ServiceType.
         */
        public Builder serviceType(String serviceType) {
            this.putQueryParameter("ServiceType", serviceType);
            this.serviceType = serviceType;
            return this;
        }

        /**
         * VpcId.
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
