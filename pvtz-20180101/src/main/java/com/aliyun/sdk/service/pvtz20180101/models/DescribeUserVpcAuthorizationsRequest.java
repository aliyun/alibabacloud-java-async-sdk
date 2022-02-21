// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pvtz20180101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeUserVpcAuthorizationsRequest} extends {@link RequestModel}
 *
 * <p>DescribeUserVpcAuthorizationsRequest</p>
 */
public class DescribeUserVpcAuthorizationsRequest extends Request {
    @Query
    @NameInMap("AuthType")
    private String authType;

    @Query
    @NameInMap("AuthorizedUserId")
    private Long authorizedUserId;

    @Query
    @NameInMap("PageNumber")
    @Validation(maximum = 9999999)
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100)
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

        private Builder(DescribeUserVpcAuthorizationsRequest response) {
            super(response);
            this.authType = response.authType;
            this.authorizedUserId = response.authorizedUserId;
            this.pageNumber = response.pageNumber;
            this.pageSize = response.pageSize;
        } 

        /**
         * AuthType.
         */
        public Builder authType(String authType) {
            this.putQueryParameter("AuthType", authType);
            this.authType = authType;
            return this;
        }

        /**
         * AuthorizedUserId.
         */
        public Builder authorizedUserId(Long authorizedUserId) {
            this.putQueryParameter("AuthorizedUserId", authorizedUserId);
            this.authorizedUserId = authorizedUserId;
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

        @Override
        public DescribeUserVpcAuthorizationsRequest build() {
            return new DescribeUserVpcAuthorizationsRequest(this);
        } 

    } 

}
