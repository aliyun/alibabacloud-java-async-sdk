// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaApplicationTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaApplicationTemplatesRequest</p>
 */
public class ListQuotaApplicationTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List < Dimensions> dimensions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
    private String quotaActionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaCategory")
    private String quotaCategory;

    private ListQuotaApplicationTemplatesRequest(Builder builder) {
        super(builder);
        this.dimensions = builder.dimensions;
        this.id = builder.id;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
        this.quotaActionCode = builder.quotaActionCode;
        this.quotaCategory = builder.quotaCategory;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaApplicationTemplatesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dimensions
     */
    public java.util.List < Dimensions> getDimensions() {
        return this.dimensions;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return productCode
     */
    public String getProductCode() {
        return this.productCode;
    }

    /**
     * @return quotaActionCode
     */
    public String getQuotaActionCode() {
        return this.quotaActionCode;
    }

    /**
     * @return quotaCategory
     */
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    public static final class Builder extends Request.Builder<ListQuotaApplicationTemplatesRequest, Builder> {
        private java.util.List < Dimensions> dimensions; 
        private String id; 
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private String quotaActionCode; 
        private String quotaCategory; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotaApplicationTemplatesRequest request) {
            super(request);
            this.dimensions = request.dimensions;
            this.id = request.id;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.quotaActionCode = request.quotaActionCode;
            this.quotaCategory = request.quotaCategory;
        } 

        /**
         * The quota dimensions.
         */
        public Builder dimensions(java.util.List < Dimensions> dimensions) {
            this.putBodyParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * The ID of the quota item.
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The maximum number of records that can be returned for the query. Valid values: 1 to 100. Default value: 30.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the position from which you want to start the query.
         * <p>
         * 
         * > If you leave this parameter empty, the query starts from the beginning.
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The abbreviation of the Alibaba Cloud service name.
         * <p>
         * 
         * >  To query the abbreviation of an Alibaba Cloud service name, call the [ListProducts](~~440555~~) operation and check the value of `ProductCode` in the response.
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * The ID of the quota.
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        /**
         * The type of the quota. Valid values:
         * <p>
         * 
         * *   CommonQuota: general quota
         * *   WhiteListLabel: privilege
         * *   FlowControl: API rate limit
         */
        public Builder quotaCategory(String quotaCategory) {
            this.putBodyParameter("QuotaCategory", quotaCategory);
            this.quotaCategory = quotaCategory;
            return this;
        }

        @Override
        public ListQuotaApplicationTemplatesRequest build() {
            return new ListQuotaApplicationTemplatesRequest(this);
        } 

    } 

    public static class Dimensions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Dimensions(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Dimensions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * The key of the dimension.
             * <p>
             * 
             * > 
             * 
             * *   The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
             * 
             * *   You must specify both Key and Value for each quota dimension.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the dimension.
             * <p>
             * 
             * > 
             * 
             * *   The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
             * 
             * *   You must specify both Key and Value for each quota dimension.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Dimensions build() {
                return new Dimensions(this);
            } 

        } 

    }
}
