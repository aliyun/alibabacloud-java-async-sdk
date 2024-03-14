// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeStorageBundlesRequest} extends {@link RequestModel}
 *
 * <p>DescribeStorageBundlesRequest</p>
 */
public class DescribeStorageBundlesRequest extends Request {
    @Query
    @NameInMap("BackendBucketRegionId")
    @Validation(required = true)
    private String backendBucketRegionId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeStorageBundlesRequest(Builder builder) {
        super(builder);
        this.backendBucketRegionId = builder.backendBucketRegionId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeStorageBundlesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return backendBucketRegionId
     */
    public String getBackendBucketRegionId() {
        return this.backendBucketRegionId;
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
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeStorageBundlesRequest, Builder> {
        private String backendBucketRegionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeStorageBundlesRequest request) {
            super(request);
            this.backendBucketRegionId = request.backendBucketRegionId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
        } 

        /**
         * BackendBucketRegionId.
         */
        public Builder backendBucketRegionId(String backendBucketRegionId) {
            this.putQueryParameter("BackendBucketRegionId", backendBucketRegionId);
            this.backendBucketRegionId = backendBucketRegionId;
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
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        @Override
        public DescribeStorageBundlesRequest build() {
            return new DescribeStorageBundlesRequest(this);
        } 

    } 

}
