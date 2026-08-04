// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.account_crm20160606.models;

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
 * {@link ModifyCustomerInfoRequest} extends {@link RequestModel}
 *
 * <p>ModifyCustomerInfoRequest</p>
 */
public class ModifyCustomerInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Biz")
    private String biz;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerCategory")
    private String customerCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomerSubCategory")
    private String customerSubCategory;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("UserId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long userId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Website")
    private String website;

    private ModifyCustomerInfoRequest(Builder builder) {
        super(builder);
        this.biz = builder.biz;
        this.customerCategory = builder.customerCategory;
        this.customerSubCategory = builder.customerSubCategory;
        this.userId = builder.userId;
        this.website = builder.website;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyCustomerInfoRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return biz
     */
    public String getBiz() {
        return this.biz;
    }

    /**
     * @return customerCategory
     */
    public String getCustomerCategory() {
        return this.customerCategory;
    }

    /**
     * @return customerSubCategory
     */
    public String getCustomerSubCategory() {
        return this.customerSubCategory;
    }

    /**
     * @return userId
     */
    public Long getUserId() {
        return this.userId;
    }

    /**
     * @return website
     */
    public String getWebsite() {
        return this.website;
    }

    public static final class Builder extends Request.Builder<ModifyCustomerInfoRequest, Builder> {
        private String biz; 
        private String customerCategory; 
        private String customerSubCategory; 
        private Long userId; 
        private String website; 

        private Builder() {
            super();
        } 

        private Builder(ModifyCustomerInfoRequest request) {
            super(request);
            this.biz = request.biz;
            this.customerCategory = request.customerCategory;
            this.customerSubCategory = request.customerSubCategory;
            this.userId = request.userId;
            this.website = request.website;
        } 

        /**
         * Biz.
         */
        public Builder biz(String biz) {
            this.putQueryParameter("Biz", biz);
            this.biz = biz;
            return this;
        }

        /**
         * CustomerCategory.
         */
        public Builder customerCategory(String customerCategory) {
            this.putQueryParameter("CustomerCategory", customerCategory);
            this.customerCategory = customerCategory;
            return this;
        }

        /**
         * CustomerSubCategory.
         */
        public Builder customerSubCategory(String customerSubCategory) {
            this.putQueryParameter("CustomerSubCategory", customerSubCategory);
            this.customerSubCategory = customerSubCategory;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder userId(Long userId) {
            this.putQueryParameter("UserId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * Website.
         */
        public Builder website(String website) {
            this.putQueryParameter("Website", website);
            this.website = website;
            return this;
        }

        @Override
        public ModifyCustomerInfoRequest build() {
            return new ModifyCustomerInfoRequest(this);
        } 

    } 

}
