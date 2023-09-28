// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisassociatePrincipalFromPortfolioRequest} extends {@link RequestModel}
 *
 * <p>DisassociatePrincipalFromPortfolioRequest</p>
 */
public class DisassociatePrincipalFromPortfolioRequest extends Request {
    @Body
    @NameInMap("PortfolioId")
    @Validation(required = true)
    private String portfolioId;

    @Body
    @NameInMap("PrincipalId")
    @Validation(required = true)
    private String principalId;

    @Body
    @NameInMap("PrincipalType")
    @Validation(required = true)
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
         * The ID of the product portfolio.
         */
        public Builder portfolioId(String portfolioId) {
            this.putBodyParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * The ID of the RAM entity.
         * <p>
         * 
         * For more information about how to obtain the ID of a RAM user, see [GetUser](~~28681~~).
         * 
         * For more information about how to obtain the ID of a RAM role, see [GetRole](~~28711~~).
         */
        public Builder principalId(String principalId) {
            this.putBodyParameter("PrincipalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * The type of the Resource Access Management (RAM) entity. Valid values:
         * <p>
         * 
         * *   RamUser: a RAM user
         * *   RamRole: a RAM role
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
