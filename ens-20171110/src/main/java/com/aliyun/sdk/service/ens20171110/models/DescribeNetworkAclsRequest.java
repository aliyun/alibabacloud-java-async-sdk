// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNetworkAclsRequest} extends {@link RequestModel}
 *
 * <p>DescribeNetworkAclsRequest</p>
 */
public class DescribeNetworkAclsRequest extends Request {
    @Query
    @NameInMap("NetworkAclId")
    private String networkAclId;

    @Query
    @NameInMap("NetworkAclName")
    private String networkAclName;

    @Query
    @NameInMap("PageNumber")
    private String pageNumber;

    @Query
    @NameInMap("PageSize")
    private String pageSize;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    private DescribeNetworkAclsRequest(Builder builder) {
        super(builder);
        this.networkAclId = builder.networkAclId;
        this.networkAclName = builder.networkAclName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNetworkAclsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkAclId
     */
    public String getNetworkAclId() {
        return this.networkAclId;
    }

    /**
     * @return networkAclName
     */
    public String getNetworkAclName() {
        return this.networkAclName;
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
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<DescribeNetworkAclsRequest, Builder> {
        private String networkAclId; 
        private String networkAclName; 
        private String pageNumber; 
        private String pageSize; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeNetworkAclsRequest request) {
            super(request);
            this.networkAclId = request.networkAclId;
            this.networkAclName = request.networkAclName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.resourceId = request.resourceId;
        } 

        /**
         * The ID of the network ACL.
         */
        public Builder networkAclId(String networkAclId) {
            this.putQueryParameter("NetworkAclId", networkAclId);
            this.networkAclId = networkAclId;
            return this;
        }

        /**
         * The name of the network ACL.
         * <p>
         * 
         * The name must be 1 to 128 characters in length. The name cannot start with \*\*http:// **or** https://\*\*.
         */
        public Builder networkAclName(String networkAclName) {
            this.putQueryParameter("NetworkAclName", networkAclName);
            this.networkAclName = networkAclName;
            return this;
        }

        /**
         * The page number. Pages start from page **1**. Default value: **1**.
         */
        public Builder pageNumber(String pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Maximum value: **50**. Default value: **10**.
         */
        public Builder pageSize(String pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the associated instance.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public DescribeNetworkAclsRequest build() {
            return new DescribeNetworkAclsRequest(this);
        } 

    } 

}
