// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisassociatePrincipalFromPortfolioRequest} extends {@link RequestModel}
 *
 * <p>DisassociatePrincipalFromPortfolioRequest</p>
 */
public class DisassociatePrincipalFromPortfolioRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PortfolioId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String portfolioId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrincipalId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String principalId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PrincipalType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String principalType;

    private DisassociatePrincipalFromPortfolioRequest(Builder builder) {
        super(builder);
        this.portfolioId = builder.portfolioId;
        this.principalId = builder.principalId;
        this.principalType = builder.principalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisassociatePrincipalFromPortfolioRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return portfolioId
     */
    public String getPortfolioId() {
        return this.portfolioId;
    }

    /**
     * @return principalId
     */
    public String getPrincipalId() {
        return this.principalId;
    }

    /**
     * @return principalType
     */
    public String getPrincipalType() {
        return this.principalType;
    }

    public static final class Builder extends Request.Builder<DisassociatePrincipalFromPortfolioRequest, Builder> {
        private String portfolioId; 
        private String principalId; 
        private String principalType; 

        private Builder() {
            super();
        } 

        private Builder(DisassociatePrincipalFromPortfolioRequest request) {
            super(request);
            this.portfolioId = request.portfolioId;
            this.principalId = request.principalId;
            this.principalType = request.principalType;
        } 

        /**
         * <p>The ID of the product portfolio.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>port-bp1yt7582g****</p>
         */
        public Builder portfolioId(String portfolioId) {
            this.putBodyParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * <p>The ID of the RAM entity.</p>
         * <p>For more information about how to obtain the ID of a RAM user, see <a href="https://help.aliyun.com/document_detail/28681.html">GetUser</a>.</p>
         * <p>For more information about how to obtain the ID of a RAM role, see <a href="https://help.aliyun.com/document_detail/28711.html">GetRole</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24477111603637****</p>
         */
        public Builder principalId(String principalId) {
            this.putBodyParameter("PrincipalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * <p>The type of the Resource Access Management (RAM) entity. Valid values:</p>
         * <ul>
         * <li>RamUser: a RAM user</li>
         * <li>RamRole: a RAM role</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>RamUser</p>
         */
        public Builder principalType(String principalType) {
            this.putBodyParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        @Override
        public DisassociatePrincipalFromPortfolioRequest build() {
            return new DisassociatePrincipalFromPortfolioRequest(this);
        } 

    } 

}
