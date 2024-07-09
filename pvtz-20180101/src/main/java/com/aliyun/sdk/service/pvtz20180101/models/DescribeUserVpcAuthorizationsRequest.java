// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * The authorization scope. Valid values:
         * <p>
         * 
         * *   NORMAL: general authorization.
         * *   CLOUD_PRODUCT: cloud service-related authorization
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account.
         */
        public Builder authorizedUserId(Long authorizedUserId) {
            this.putQueryParameter("AuthorizedUserId", authorizedUserId);
            this.authorizedUserId = authorizedUserId;
            return this;
        }

        /**
         * The page number. Default value: 1.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page. Default value: 20. Maximum value: 100.
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
