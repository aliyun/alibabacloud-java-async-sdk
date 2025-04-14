// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListServicesRequest} extends {@link RequestModel}
 *
 * <p>ListServicesRequest</p>
 */
public class ListServicesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("sourceTypes")
    private String sourceTypes;

    private ListServicesRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceGroupId = builder.resourceGroupId;
        this.sourceType = builder.sourceType;
        this.sourceTypes = builder.sourceTypes;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListServicesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
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
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return sourceTypes
     */
    public String getSourceTypes() {
        return this.sourceTypes;
    }

    public static final class Builder extends Request.Builder<ListServicesRequest, Builder> {
        private String gatewayId; 
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceGroupId; 
        private String sourceType; 
        private String sourceTypes; 

        private Builder() {
            super();
        } 

        private Builder(ListServicesRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceGroupId = request.resourceGroupId;
            this.sourceType = request.sourceType;
            this.sourceTypes = request.sourceTypes;
        } 

        /**
         * <p>The ID of the Cloud-native API Gateway instance.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-cpv4sqdl*****</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The service name.</p>
         * 
         * <strong>example:</strong>
         * <p>user-service</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The page number to return. Pages start from page 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The resource group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-acfmxxe5rc6cvla</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putQueryParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        /**
         * <p>The service source. Valid values:</p>
         * <ul>
         * <li>MSE_NACOS: a service in an MSE Nacos instance</li>
         * <li>K8S: a service in a Kubernetes (K8s) cluster in Container Service for Kubernetes (ACK)</li>
         * <li>FC3: a service in Function Compute</li>
         * <li>VIP: a fixed address</li>
         * <li>DNS: a domain name</li>
         * </ul>
         * <p>Enumerated values:</p>
         * <ul>
         * <li>K8S</li>
         * <li>FC3</li>
         * <li>DNS</li>
         * <li>VIP</li>
         * <li>MSE_NACOS</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MSE_NACOS</p>
         */
        public Builder sourceType(String sourceType) {
            this.putQueryParameter("sourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * sourceTypes.
         */
        public Builder sourceTypes(String sourceTypes) {
            this.putQueryParameter("sourceTypes", sourceTypes);
            this.sourceTypes = sourceTypes;
            return this;
        }

        @Override
        public ListServicesRequest build() {
            return new ListServicesRequest(this);
        } 

    } 

}
