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
 * {@link CatalogPbcRoleCreateCmd} extends {@link TeaModel}
 *
 * <p>CatalogPbcRoleCreateCmd</p>
 */
public class CatalogPbcRoleCreateCmd extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("companyId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("marketId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long marketId;

    @com.aliyun.core.annotation.NameInMap("marketResource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String marketResource;

    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("pbcResource")
    @com.aliyun.core.annotation.Validation(required = true)
    private String pbcResource;

    private CatalogPbcRoleCreateCmd(Builder builder) {
        this.companyId = builder.companyId;
        this.marketId = builder.marketId;
        this.marketResource = builder.marketResource;
        this.name = builder.name;
        this.pbcResource = builder.pbcResource;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CatalogPbcRoleCreateCmd create() {
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
     * @return marketResource
     */
    public String getMarketResource() {
        return this.marketResource;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return pbcResource
     */
    public String getPbcResource() {
        return this.pbcResource;
    }

    public static final class Builder {
        private Long companyId; 
        private Long marketId; 
        private String marketResource; 
        private String name; 
        private String pbcResource; 

        private Builder() {
        } 

        private Builder(CatalogPbcRoleCreateCmd model) {
            this.companyId = model.companyId;
            this.marketId = model.marketId;
            this.marketResource = model.marketResource;
            this.name = model.name;
            this.pbcResource = model.pbcResource;
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
         * <p>neuron:catalog:market</p>
         */
        public Builder marketResource(String marketResource) {
            this.marketResource = marketResource;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>neuron:catalog:company</p>
         */
        public Builder pbcResource(String pbcResource) {
            this.pbcResource = pbcResource;
            return this;
        }

        public CatalogPbcRoleCreateCmd build() {
            return new CatalogPbcRoleCreateCmd(this);
        } 

    } 

}
