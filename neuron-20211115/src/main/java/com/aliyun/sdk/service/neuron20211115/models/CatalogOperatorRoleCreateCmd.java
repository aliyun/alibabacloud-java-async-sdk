// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link CatalogOperatorRoleCreateCmd} extends {@link TeaModel}
 *
 * <p>CatalogOperatorRoleCreateCmd</p>
 */
public class CatalogOperatorRoleCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("marketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("marketType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String marketType;

    private CatalogOperatorRoleCreateCmd(Builder builder) {
        this.companyId = builder.companyId;
        this.marketId = builder.marketId;
        this.marketType = builder.marketType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CatalogOperatorRoleCreateCmd create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return marketId
     */
    public Long getMarketId() {
        return this.marketId;
    }

    /**
     * @return marketType
     */
    public String getMarketType() {
        return this.marketType;
    }

    public static final class Builder {
        private Long companyId; 
        private Long marketId; 
        private String marketType; 

        private Builder() {
        } 

        private Builder(CatalogOperatorRoleCreateCmd model) {
            this.companyId = model.companyId;
            this.marketId = model.marketId;
            this.marketType = model.marketType;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder marketId(Long marketId) {
            this.marketId = marketId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>inner</p>
         */
        public Builder marketType(String marketType) {
            this.marketType = marketType;
            return this;
        }

        public CatalogOperatorRoleCreateCmd build() {
            return new CatalogOperatorRoleCreateCmd(this);
        } 

    } 

}
