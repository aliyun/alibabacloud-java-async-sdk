// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeExpressSyncSharesRequest} extends {@link RequestModel}
 *
 * <p>DescribeExpressSyncSharesRequest</p>
 */
public class DescribeExpressSyncSharesRequest extends Request {
    @Query
    @NameInMap("ExpressSyncIds")
    @Validation(required = true)
    private String expressSyncIds;

    @Query
    @NameInMap("IsExternal")
    private Boolean isExternal;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    private DescribeExpressSyncSharesRequest(Builder builder) {
        super(builder);
        this.expressSyncIds = builder.expressSyncIds;
        this.isExternal = builder.isExternal;
        this.securityToken = builder.securityToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeExpressSyncSharesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return expressSyncIds
     */
    public String getExpressSyncIds() {
        return this.expressSyncIds;
    }

    /**
     * @return isExternal
     */
    public Boolean getIsExternal() {
        return this.isExternal;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    public static final class Builder extends Request.Builder<DescribeExpressSyncSharesRequest, Builder> {
        private String expressSyncIds; 
        private Boolean isExternal; 
        private String securityToken; 

        private Builder() {
            super();
        } 

        private Builder(DescribeExpressSyncSharesRequest request) {
            super(request);
            this.expressSyncIds = request.expressSyncIds;
            this.isExternal = request.isExternal;
            this.securityToken = request.securityToken;
        } 

        /**
         * ExpressSyncIds.
         */
        public Builder expressSyncIds(String expressSyncIds) {
            this.putQueryParameter("ExpressSyncIds", expressSyncIds);
            this.expressSyncIds = expressSyncIds;
            return this;
        }

        /**
         * IsExternal.
         */
        public Builder isExternal(Boolean isExternal) {
            this.putQueryParameter("IsExternal", isExternal);
            this.isExternal = isExternal;
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
        public DescribeExpressSyncSharesRequest build() {
            return new DescribeExpressSyncSharesRequest(this);
        } 

    } 

}
