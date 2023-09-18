// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkedmall20230930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CooperationShop} extends {@link TeaModel}
 *
 * <p>CooperationShop</p>
 */
public class CooperationShop extends TeaModel {
    @NameInMap("cooperationCompanyId")
    private String cooperationCompanyId;

    @NameInMap("cooperationShopId")
    private String cooperationShopId;

    @NameInMap("shopId")
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
