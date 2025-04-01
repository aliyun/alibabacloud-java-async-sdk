// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.advisor20180120.models;

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
 * {@link RefreshAdvisorCheckRequest} extends {@link RequestModel}
 *
 * <p>RefreshAdvisorCheckRequest</p>
 */
public class RefreshAdvisorCheckRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssumeAliyunId")
    private Long assumeAliyunId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckId")
    private String checkId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckPlanId")
    private Long checkPlanId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    private String product;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ResourceDimensionList")
    private java.util.List<ResourceDimensionList> resourceDimensionList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ResourceId")
    private String resourceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Token")
    private String token;

    private RefreshAdvisorCheckRequest(Builder builder) {
        super(builder);
        this.assumeAliyunId = builder.assumeAliyunId;
        this.checkId = builder.checkId;
        this.checkPlanId = builder.checkPlanId;
        this.language = builder.language;
        this.product = builder.product;
        this.resourceDimensionList = builder.resourceDimensionList;
        this.resourceId = builder.resourceId;
        this.token = builder.token;
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
     * @return assumeAliyunId
     */
    public Long getAssumeAliyunId() {
        return this.assumeAliyunId;
    }

    /**
     * @return checkId
     */
    public String getCheckId() {
        return this.checkId;
    }

    /**
     * @return checkPlanId
     */
    public Long getCheckPlanId() {
        return this.checkPlanId;
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
     * @return resourceDimensionList
     */
    public java.util.List<ResourceDimensionList> getResourceDimensionList() {
        return this.resourceDimensionList;
    }

    /**
     * @return resourceId
     */
    public String getResourceId() {
        return this.resourceId;
    }

    /**
     * @return token
     */
    public String getToken() {
        return this.token;
    }

    public static final class Builder extends Request.Builder<RefreshAdvisorCheckRequest, Builder> {
        private Long assumeAliyunId; 
        private String checkId; 
        private Long checkPlanId; 
        private String language; 
        private String product; 
        private java.util.List<ResourceDimensionList> resourceDimensionList; 
        private String resourceId; 
        private String token; 

        private Builder() {
            super();
        } 

        private Builder(RefreshAdvisorCheckRequest request) {
            super(request);
            this.assumeAliyunId = request.assumeAliyunId;
            this.checkId = request.checkId;
            this.checkPlanId = request.checkPlanId;
            this.language = request.language;
            this.product = request.product;
            this.resourceDimensionList = request.resourceDimensionList;
            this.resourceId = request.resourceId;
            this.token = request.token;
        } 

        /**
         * AssumeAliyunId.
         */
        public Builder assumeAliyunId(Long assumeAliyunId) {
            this.putQueryParameter("AssumeAliyunId", assumeAliyunId);
            this.assumeAliyunId = assumeAliyunId;
            return this;
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
         * CheckPlanId.
         */
        public Builder checkPlanId(Long checkPlanId) {
            this.putQueryParameter("CheckPlanId", checkPlanId);
            this.checkPlanId = checkPlanId;
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
         * ResourceDimensionList.
         */
        public Builder resourceDimensionList(java.util.List<ResourceDimensionList> resourceDimensionList) {
            String resourceDimensionListShrink = shrink(resourceDimensionList, "ResourceDimensionList", "json");
            this.putBodyParameter("ResourceDimensionList", resourceDimensionListShrink);
            this.resourceDimensionList = resourceDimensionList;
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

        /**
         * Token.
         */
        public Builder token(String token) {
            this.putQueryParameter("Token", token);
            this.token = token;
            return this;
        }

        @Override
        public RefreshAdvisorCheckRequest build() {
            return new RefreshAdvisorCheckRequest(this);
        } 

    } 

    /**
     * 
     * {@link RefreshAdvisorCheckRequest} extends {@link TeaModel}
     *
     * <p>RefreshAdvisorCheckRequest</p>
     */
    public static class ResourceDimensionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cost")
        private Boolean cost;

        @com.aliyun.core.annotation.NameInMap("Performance")
        private Boolean performance;

        @com.aliyun.core.annotation.NameInMap("Product")
        private String product;

        @com.aliyun.core.annotation.NameInMap("ProductName")
        private String productName;

        @com.aliyun.core.annotation.NameInMap("Reliablility")
        private Boolean reliablility;

        @com.aliyun.core.annotation.NameInMap("Security")
        private Boolean security;

        @com.aliyun.core.annotation.NameInMap("Service")
        private Boolean service;

        private ResourceDimensionList(Builder builder) {
            this.cost = builder.cost;
            this.performance = builder.performance;
            this.product = builder.product;
            this.productName = builder.productName;
            this.reliablility = builder.reliablility;
            this.security = builder.security;
            this.service = builder.service;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceDimensionList create() {
            return builder().build();
        }

        /**
         * @return cost
         */
        public Boolean getCost() {
            return this.cost;
        }

        /**
         * @return performance
         */
        public Boolean getPerformance() {
            return this.performance;
        }

        /**
         * @return product
         */
        public String getProduct() {
            return this.product;
        }

        /**
         * @return productName
         */
        public String getProductName() {
            return this.productName;
        }

        /**
         * @return reliablility
         */
        public Boolean getReliablility() {
            return this.reliablility;
        }

        /**
         * @return security
         */
        public Boolean getSecurity() {
            return this.security;
        }

        /**
         * @return service
         */
        public Boolean getService() {
            return this.service;
        }

        public static final class Builder {
            private Boolean cost; 
            private Boolean performance; 
            private String product; 
            private String productName; 
            private Boolean reliablility; 
            private Boolean security; 
            private Boolean service; 

            private Builder() {
            } 

            private Builder(ResourceDimensionList model) {
                this.cost = model.cost;
                this.performance = model.performance;
                this.product = model.product;
                this.productName = model.productName;
                this.reliablility = model.reliablility;
                this.security = model.security;
                this.service = model.service;
            } 

            /**
             * Cost.
             */
            public Builder cost(Boolean cost) {
                this.cost = cost;
                return this;
            }

            /**
             * Performance.
             */
            public Builder performance(Boolean performance) {
                this.performance = performance;
                return this;
            }

            /**
             * Product.
             */
            public Builder product(String product) {
                this.product = product;
                return this;
            }

            /**
             * ProductName.
             */
            public Builder productName(String productName) {
                this.productName = productName;
                return this;
            }

            /**
             * Reliablility.
             */
            public Builder reliablility(Boolean reliablility) {
                this.reliablility = reliablility;
                return this;
            }

            /**
             * Security.
             */
            public Builder security(Boolean security) {
                this.security = security;
                return this;
            }

            /**
             * Service.
             */
            public Builder service(Boolean service) {
                this.service = service;
                return this;
            }

            public ResourceDimensionList build() {
                return new ResourceDimensionList(this);
            } 

        } 

    }
}
