// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

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
 * {@link CooperationShop} extends {@link TeaModel}
 *
 * <p>CooperationShop</p>
 */
public class CooperationShop extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cooperationCompanyId")
    private String cooperationCompanyId;

    @com.aliyun.core.annotation.NameInMap("cooperationShopId")
    private String cooperationShopId;

    @com.aliyun.core.annotation.NameInMap("shopId")
    private String shopId;

    private CooperationShop(Builder builder) {
        this.cooperationCompanyId = builder.cooperationCompanyId;
        this.cooperationShopId = builder.cooperationShopId;
        this.shopId = builder.shopId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CooperationShop create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cooperationCompanyId
     */
    public String getCooperationCompanyId() {
        return this.cooperationCompanyId;
    }

    /**
     * @return cooperationShopId
     */
    public String getCooperationShopId() {
        return this.cooperationShopId;
    }

    /**
     * @return shopId
     */
    public String getShopId() {
        return this.shopId;
    }

    public static final class Builder {
        private String cooperationCompanyId; 
        private String cooperationShopId; 
        private String shopId; 

        private Builder() {
        } 

        private Builder(CooperationShop model) {
            this.cooperationCompanyId = model.cooperationCompanyId;
            this.cooperationShopId = model.cooperationShopId;
            this.shopId = model.shopId;
        } 

        /**
         * <p>The partner enterprise ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11200003</p>
         */
        public Builder cooperationCompanyId(String cooperationCompanyId) {
            this.cooperationCompanyId = cooperationCompanyId;
            return this;
        }

        /**
         * <p>The partner store ID.</p>
         * 
         * <strong>example:</strong>
         * <p>21000026</p>
         */
        public Builder cooperationShopId(String cooperationShopId) {
            this.cooperationShopId = cooperationShopId;
            return this;
        }

        /**
         * <p>The store ID.</p>
         * 
         * <strong>example:</strong>
         * <p>22000019</p>
         */
        public Builder shopId(String shopId) {
            this.shopId = shopId;
            return this;
        }

        public CooperationShop build() {
            return new CooperationShop(this);
        } 

    } 

}
