// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeVpcsRequest} extends {@link RequestModel}
 *
 * <p>DescribeVpcsRequest</p>
 */
public class DescribeVpcsRequest extends Request {
    @Query
    @NameInMap("Name")
    private String name;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("ResourceRegionId")
    private String resourceRegionId;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StorageBundleId")
    private String storageBundleId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private DescribeVpcsRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceRegionId = builder.resourceRegionId;
        this.securityToken = builder.securityToken;
        this.storageBundleId = builder.storageBundleId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVpcsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return resourceRegionId
     */
    public String getResourceRegionId() {
        return this.resourceRegionId;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return storageBundleId
     */
    public String getStorageBundleId() {
        return this.storageBundleId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<DescribeVpcsRequest, Builder> {
        private String name; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String resourceRegionId; 
        private String securityToken; 
        private String storageBundleId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeVpcsRequest request) {
            super(request);
            this.name = request.name;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceRegionId = request.resourceRegionId;
            this.securityToken = request.securityToken;
            this.storageBundleId = request.storageBundleId;
            this.vpcId = request.vpcId;
        } 

        /**
         * Name.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
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
         * ResourceRegionId.
         */
        public Builder resourceRegionId(String resourceRegionId) {
            this.putQueryParameter("ResourceRegionId", resourceRegionId);
            this.resourceRegionId = resourceRegionId;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StorageBundleId.
         */
        public Builder storageBundleId(String storageBundleId) {
            this.putQueryParameter("StorageBundleId", storageBundleId);
            this.storageBundleId = storageBundleId;
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
        public DescribeVpcsRequest build() {
            return new DescribeVpcsRequest(this);
        } 

    } 

}
