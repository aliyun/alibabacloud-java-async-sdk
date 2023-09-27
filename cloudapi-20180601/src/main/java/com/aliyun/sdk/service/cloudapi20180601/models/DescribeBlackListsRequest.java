// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeBlackListsRequest} extends {@link RequestModel}
 *
 * <p>DescribeBlackListsRequest</p>
 */
public class DescribeBlackListsRequest extends Request {
    @Query
    @NameInMap("BlackType")
    @Validation(required = true)
    private String blackType;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    @Validation(maximum = 100, minimum = 1)
    private Integer pageSize;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeBlackListsRequest(Builder builder) {
        super(builder);
        this.blackType = builder.blackType;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeBlackListsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return blackType
     */
    public String getBlackType() {
        return this.blackType;
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

    public static final class Builder extends Request.Builder<DescribeBlackListsRequest, Builder> {
        private String blackType; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeBlackListsRequest request) {
            super(request);
            this.blackType = request.blackType;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
        } 

        /**
         * BlackType.
         */
        public Builder blackType(String blackType) {
            this.putQueryParameter("BlackType", blackType);
            this.blackType = blackType;
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
        public DescribeBlackListsRequest build() {
            return new DescribeBlackListsRequest(this);
        } 

    } 

}
