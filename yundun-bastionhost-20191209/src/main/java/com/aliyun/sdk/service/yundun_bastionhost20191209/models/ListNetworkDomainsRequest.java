// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yundun_bastionhost20191209.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListNetworkDomainsRequest} extends {@link RequestModel}
 *
 * <p>ListNetworkDomainsRequest</p>
 */
public class ListNetworkDomainsRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("NetworkDomainName")
    private String networkDomainName;

    @Query
    @NameInMap("NetworkDomainType")
    private String networkDomainType;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    private ListNetworkDomainsRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.networkDomainName = builder.networkDomainName;
        this.networkDomainType = builder.networkDomainType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListNetworkDomainsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return networkDomainName
     */
    public String getNetworkDomainName() {
        return this.networkDomainName;
    }

    /**
     * @return networkDomainType
     */
    public String getNetworkDomainType() {
        return this.networkDomainType;
    }

    /**
     * @return pageNumber
     */
    public String getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public String getPageSize() {
        return this.pageSize;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<ListNetworkDomainsRequest, Builder> {
        private String instanceId; 
        private String networkDomainName; 
        private String networkDomainType; 
        private String pageNumber; 
        private String pageSize; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(ListNetworkDomainsRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.networkDomainName = request.networkDomainName;
            this.networkDomainType = request.networkDomainType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.regionId = request.regionId;
        } 

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * NetworkDomainName.
         */
        public Builder networkDomainName(String networkDomainName) {
            this.putQueryParameter("NetworkDomainName", networkDomainName);
            this.networkDomainName = networkDomainName;
            return this;
        }

        /**
         * NetworkDomainType.
         */
        public Builder networkDomainType(String networkDomainType) {
            this.putQueryParameter("NetworkDomainType", networkDomainType);
            this.networkDomainType = networkDomainType;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public ListNetworkDomainsRequest build() {
            return new ListNetworkDomainsRequest(this);
        } 

    } 

}
