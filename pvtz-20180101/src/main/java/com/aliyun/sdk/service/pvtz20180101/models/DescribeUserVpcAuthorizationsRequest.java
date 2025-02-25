// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeUserVpcAuthorizationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserVpcAuthorizationsRequest</p>
 */
public class DescribeUserVpcAuthorizationsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthType")
    private String authType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AuthorizedUserId")
    private Long authorizedUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    @com.aliyun.core.annotation.Validation(maximum = 9999999)
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    @com.aliyun.core.annotation.Validation(maximum = 100)
    private Integer pageSize;

    private DescribeUserVpcAuthorizationsRequest(Builder builder) {
        super(builder);
        this.authType = builder.authType;
        this.authorizedUserId = builder.authorizedUserId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeUserVpcAuthorizationsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return authType
     */
    public String getAuthType() {
        return this.authType;
    }

    /**
     * @return authorizedUserId
     */
    public Long getAuthorizedUserId() {
        return this.authorizedUserId;
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

    public static final class Builder extends Request.Builder<DescribeUserVpcAuthorizationsRequest, Builder> {
        private String authType; 
        private Long authorizedUserId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(DescribeUserVpcAuthorizationsRequest request) {
            super(request);
            this.authType = request.authType;
            this.authorizedUserId = request.authorizedUserId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * <p>The authorization scope. Valid values:</p>
         * <ul>
         * <li>NORMAL: general authorization</li>
         * <li>CLOUD_PRODUCT: cloud service-related authorization</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account to which the permissions on the resources are granted.</p>
         * 
         * <strong>example:</strong>
         * <p>141339776561****</p>
         */
        public Builder authorizedUserId(Long authorizedUserId) {
            this.putQueryParameter("AuthorizedUserId", authorizedUserId);
            this.authorizedUserId = authorizedUserId;
            return this;
        }

        /**
         * <p>The page number. Pages start from page 1. Default value: 1.</p>
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
         * <p>The number of entries per page. Valid values: 1 to 100. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public DescribeUserVpcAuthorizationsRequest build() {
            return new DescribeUserVpcAuthorizationsRequest(this);
        } 

    } 

}
