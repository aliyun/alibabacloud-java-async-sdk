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
 * {@link ProductInfo} extends {@link TeaModel}
 *
 * <p>ProductInfo</p>
 */
public class ProductInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("accountId")
    private String accountId;

    @com.aliyun.core.annotation.NameInMap("companyId")
    private Long companyId;

    @com.aliyun.core.annotation.NameInMap("id")
    private Long id;

    @com.aliyun.core.annotation.NameInMap("isAuthorized")
    private Boolean isAuthorized;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    private ProductInfo(Builder builder) {
        this.accountId = builder.accountId;
        this.companyId = builder.companyId;
        this.id = builder.id;
        this.isAuthorized = builder.isAuthorized;
        this.name = builder.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ProductInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountId
     */
    public String getAccountId() {
        return this.accountId;
    }

    /**
     * @return companyId
     */
    public Long getCompanyId() {
        return this.companyId;
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
    }

    /**
     * @return isAuthorized
     */
    public Boolean getIsAuthorized() {
        return this.isAuthorized;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    public static final class Builder {
        private String accountId; 
        private Long companyId; 
        private Long id; 
        private Boolean isAuthorized; 
        private String name; 

        private Builder() {
        } 

        private Builder(ProductInfo model) {
            this.accountId = model.accountId;
            this.companyId = model.companyId;
            this.id = model.id;
            this.isAuthorized = model.isAuthorized;
            this.name = model.name;
        } 

        /**
         * accountId.
         */
        public Builder accountId(String accountId) {
            this.accountId = accountId;
            return this;
        }

        /**
         * companyId.
         */
        public Builder companyId(Long companyId) {
            this.companyId = companyId;
            return this;
        }

        /**
         * id.
         */
        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        /**
         * isAuthorized.
         */
        public Builder isAuthorized(Boolean isAuthorized) {
            this.isAuthorized = isAuthorized;
            return this;
        }

        /**
         * name.
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public ProductInfo build() {
            return new ProductInfo(this);
        } 

    } 

}
