// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

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
 * {@link ListBrandsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBrandsResponseBody</p>
 */
public class ListBrandsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Brands")
    private java.util.List<Brands> brands;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Long maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PreviousToken")
    private String previousToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private ListBrandsResponseBody(Builder builder) {
        this.brands = builder.brands;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.previousToken = builder.previousToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBrandsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return brands
     */
    public java.util.List<Brands> getBrands() {
        return this.brands;
    }

    /**
     * @return maxResults
     */
    public Long getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return previousToken
     */
    public String getPreviousToken() {
        return this.previousToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Brands> brands; 
        private Long maxResults; 
        private String nextToken; 
        private String previousToken; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(ListBrandsResponseBody model) {
            this.brands = model.brands;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.previousToken = model.previousToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Brands.
         */
        public Builder brands(java.util.List<Brands> brands) {
            this.brands = brands;
            return this;
        }

        /**
         * <p>分页查询时每页行数。</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Long maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于下一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>NTxxxexample</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>本次调用返回的查询凭证（Token）值，用于上一次翻页查询。</p>
         * 
         * <strong>example:</strong>
         * <p>PTxxxexample</p>
         */
        public Builder previousToken(String previousToken) {
            this.previousToken = previousToken;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListBrandsResponseBody build() {
            return new ListBrandsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListBrandsResponseBody} extends {@link TeaModel}
     *
     * <p>ListBrandsResponseBody</p>
     */
    public static class Brands extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BrandId")
        private String brandId;

        @com.aliyun.core.annotation.NameInMap("BrandName")
        private String brandName;

        @com.aliyun.core.annotation.NameInMap("BrandType")
        private String brandType;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Brands(Builder builder) {
            this.brandId = builder.brandId;
            this.brandName = builder.brandName;
            this.brandType = builder.brandType;
            this.instanceId = builder.instanceId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Brands create() {
            return builder().build();
        }

        /**
         * @return brandId
         */
        public String getBrandId() {
            return this.brandId;
        }

        /**
         * @return brandName
         */
        public String getBrandName() {
            return this.brandName;
        }

        /**
         * @return brandType
         */
        public String getBrandType() {
            return this.brandType;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String brandId; 
            private String brandName; 
            private String brandType; 
            private String instanceId; 
            private String status; 

            private Builder() {
            } 

            private Builder(Brands model) {
                this.brandId = model.brandId;
                this.brandName = model.brandName;
                this.brandType = model.brandType;
                this.instanceId = model.instanceId;
                this.status = model.status;
            } 

            /**
             * <p>品牌ID</p>
             * 
             * <strong>example:</strong>
             * <p>brand_xxxx</p>
             */
            public Builder brandId(String brandId) {
                this.brandId = brandId;
                return this;
            }

            /**
             * <p>品牌名称</p>
             * 
             * <strong>example:</strong>
             * <p>Custom Brand</p>
             */
            public Builder brandName(String brandName) {
                this.brandName = brandName;
                return this;
            }

            /**
             * <p>品牌类型</p>
             * 
             * <strong>example:</strong>
             * <p>user_custom</p>
             */
            public Builder brandType(String brandType) {
                this.brandType = brandType;
                return this;
            }

            /**
             * <p>实例ID。</p>
             * 
             * <strong>example:</strong>
             * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * <p>品牌状态</p>
             * 
             * <strong>example:</strong>
             * <p>enabled</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Brands build() {
                return new Brands(this);
            } 

        } 

    }
}
