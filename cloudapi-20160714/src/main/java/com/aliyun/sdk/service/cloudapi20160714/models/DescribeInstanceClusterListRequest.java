// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceClusterListRequest} extends {@link RequestModel}
 *
 * <p>DescribeInstanceClusterListRequest</p>
 */
public class DescribeInstanceClusterListRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceClusterId")
    private String instanceClusterId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceClusterName")
    private String instanceClusterName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SecurityToken")
    private String securityToken;

    private DescribeInstanceClusterListRequest(Builder builder) {
        super(builder);
        this.instanceClusterId = builder.instanceClusterId;
        this.instanceClusterName = builder.instanceClusterName;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceClusterListRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceClusterId
     */
    public String getInstanceClusterId() {
        return this.instanceClusterId;
    }

    /**
     * @return instanceClusterName
     */
    public String getInstanceClusterName() {
        return this.instanceClusterName;
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

    public static final class Builder extends Request.Builder<DescribeInstanceClusterListRequest, Builder> {
        private String instanceClusterId; 
        private String instanceClusterName; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeInstanceClusterListRequest request) {
            super(request);
            this.instanceClusterId = request.instanceClusterId;
            this.instanceClusterName = request.instanceClusterName;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
        } 

        /**
         * InstanceClusterId.
         */
        public Builder instanceClusterId(String instanceClusterId) {
            this.putQueryParameter("InstanceClusterId", instanceClusterId);
            this.instanceClusterId = instanceClusterId;
            return this;
        }

        /**
         * InstanceClusterName.
         */
        public Builder instanceClusterName(String instanceClusterName) {
            this.putQueryParameter("InstanceClusterName", instanceClusterName);
            this.instanceClusterName = instanceClusterName;
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
        public DescribeInstanceClusterListRequest build() {
            return new DescribeInstanceClusterListRequest(this);
        } 

    } 

}
