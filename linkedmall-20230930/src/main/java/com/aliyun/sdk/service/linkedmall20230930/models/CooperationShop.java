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

        /**
         * cooperationCompanyId.
         */
        public Builder cooperationCompanyId(String cooperationCompanyId) {
            this.cooperationCompanyId = cooperationCompanyId;
            return this;
        }

        /**
         * cooperationShopId.
         */
        public Builder cooperationShopId(String cooperationShopId) {
            this.cooperationShopId = cooperationShopId;
            return this;
        }

        /**
         * shopId.
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
