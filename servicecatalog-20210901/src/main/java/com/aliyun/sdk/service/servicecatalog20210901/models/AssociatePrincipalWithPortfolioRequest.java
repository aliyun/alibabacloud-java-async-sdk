// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicecatalog20210901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AssociatePrincipalWithPortfolioRequest} extends {@link RequestModel}
 *
 * <p>AssociatePrincipalWithPortfolioRequest</p>
 */
public class AssociatePrincipalWithPortfolioRequest extends Request {
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

    private AssociatePrincipalWithPortfolioRequest(Builder builder) {
        super(builder);
        this.portfolioId = builder.portfolioId;
        this.principalId = builder.principalId;
        this.principalType = builder.principalType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AssociatePrincipalWithPortfolioRequest create() {
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

    public static final class Builder extends Request.Builder<AssociatePrincipalWithPortfolioRequest, Builder> {
        private String portfolioId; 
        private String principalId; 
        private String principalType; 

        private Builder() {
            super();
        } 

        private Builder(AssociatePrincipalWithPortfolioRequest request) {
            super(request);
            this.portfolioId = request.portfolioId;
            this.principalId = request.principalId;
            this.principalType = request.principalType;
        } 

        /**
         * PortfolioId.
         */
        public Builder portfolioId(String portfolioId) {
            this.putBodyParameter("PortfolioId", portfolioId);
            this.portfolioId = portfolioId;
            return this;
        }

        /**
         * PrincipalId.
         */
        public Builder principalId(String principalId) {
            this.putBodyParameter("PrincipalId", principalId);
            this.principalId = principalId;
            return this;
        }

        /**
         * PrincipalType.
         */
        public Builder principalType(String principalType) {
            this.putBodyParameter("PrincipalType", principalType);
            this.principalType = principalType;
            return this;
        }

        @Override
        public AssociatePrincipalWithPortfolioRequest build() {
            return new AssociatePrincipalWithPortfolioRequest(this);
        } 

    } 

}
