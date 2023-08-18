// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshAdvisorCheckRequest} extends {@link RequestModel}
 *
 * <p>RefreshAdvisorCheckRequest</p>
 */
public class RefreshAdvisorCheckRequest extends Request {
    @Query
    @NameInMap("CheckId")
    private String checkId;

    @Query
    @NameInMap("Language")
    private String language;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("ResourceId")
    private String resourceId;

    private RefreshAdvisorCheckRequest(Builder builder) {
        super(builder);
        this.checkId = builder.checkId;
        this.language = builder.language;
        this.product = builder.product;
        this.resourceId = builder.resourceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshAdvisorCheckRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    public static final class Builder extends Request.Builder<RefreshAdvisorCheckRequest, Builder> {
        private String checkId; 
        private String language; 
        private String product; 
        private String resourceId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshAdvisorCheckRequest request) {
            super(request);
            this.checkId = request.checkId;
            this.language = request.language;
            this.product = request.product;
            this.resourceId = request.resourceId;
        } 

        /**
         * CheckId.
         */
        public Builder checkId(String checkId) {
            this.putQueryParameter("CheckId", checkId);
            this.checkId = checkId;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * ResourceId.
         */
        public Builder resourceId(String resourceId) {
            this.putQueryParameter("ResourceId", resourceId);
            this.resourceId = resourceId;
            return this;
        }

        @Override
        public RefreshAdvisorCheckRequest build() {
            return new RefreshAdvisorCheckRequest(this);
        } 

    } 

}
