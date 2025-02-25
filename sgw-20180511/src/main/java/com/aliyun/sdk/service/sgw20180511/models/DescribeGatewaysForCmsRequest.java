// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGatewaysForCmsRequest} extends {@link RequestModel}
 *
 * <p>DescribeGatewaysForCmsRequest</p>
 */
public class DescribeGatewaysForCmsRequest extends Request {
    @Query
    @NameInMap("GatewayRegionId")
    @Validation(required = true)
    private String gatewayRegionId;

    @Query
    @NameInMap("PageNumber")
    private Integer pageNumber;

    @Query
    @NameInMap("PageSize")
    private Integer pageSize;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeGatewaysForCmsRequest(Builder builder) {
        super(builder);
        this.gatewayRegionId = builder.gatewayRegionId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGatewaysForCmsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayRegionId
     */
    public String getGatewayRegionId() {
        return this.gatewayRegionId;
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

    public static final class Builder extends Request.Builder<DescribeGatewaysForCmsRequest, Builder> {
        private String gatewayRegionId; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGatewaysForCmsRequest request) {
            super(request);
            this.gatewayRegionId = request.gatewayRegionId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.securityToken = request.securityToken;
        } 

        /**
         * GatewayRegionId.
         */
        public Builder gatewayRegionId(String gatewayRegionId) {
            this.putQueryParameter("GatewayRegionId", gatewayRegionId);
            this.gatewayRegionId = gatewayRegionId;
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
        public DescribeGatewaysForCmsRequest build() {
            return new DescribeGatewaysForCmsRequest(this);
        } 

    } 

}
