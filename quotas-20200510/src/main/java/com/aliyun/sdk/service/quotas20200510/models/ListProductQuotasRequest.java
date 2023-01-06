// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProductQuotasRequest} extends {@link RequestModel}
 *
 * <p>ListProductQuotasRequest</p>
 */
public class ListProductQuotasRequest extends Request {
    @Body
    @NameInMap("Dimensions")
    private java.util.List < Dimensions> dimensions;

    @Body
    @NameInMap("GroupCode")
    private String groupCode;

    @Body
    @NameInMap("KeyWord")
    private String keyWord;

    @Body
    @NameInMap("MaxResults")
    private Integer maxResults;

    @Body
    @NameInMap("NextToken")
    private String nextToken;

    @Body
    @NameInMap("ProductCode")
    @Validation(required = true)
    private String productCode;

    @Body
    @NameInMap("QuotaActionCode")
    private String quotaActionCode;

    @Body
    @NameInMap("QuotaCategory")
    private String quotaCategory;

    @Body
    @NameInMap("SortField")
    private String sortField;

    @Body
    @NameInMap("SortOrder")
    private String sortOrder;

    private ListProductQuotasRequest(Builder builder) {
        super(builder);
        this.dimensions = builder.dimensions;
        this.groupCode = builder.groupCode;
        this.keyWord = builder.keyWord;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
        this.quotaActionCode = builder.quotaActionCode;
        this.quotaCategory = builder.quotaCategory;
        this.sortField = builder.sortField;
        this.sortOrder = builder.sortOrder;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListProductQuotasRequest create() {
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
     * @return groupCode
     */
    public String getGroupCode() {
        return this.groupCode;
    }

    /**
     * @return keyWord
     */
    public String getKeyWord() {
        return this.keyWord;
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

    /**
     * @return sortField
     */
    public String getSortField() {
        return this.sortField;
    }

    /**
     * @return sortOrder
     */
    public String getSortOrder() {
        return this.sortOrder;
    }

    public static final class Builder extends Request.Builder<ListProductQuotasRequest, Builder> {
        private java.util.List < Dimensions> dimensions; 
        private String groupCode; 
        private String keyWord; 
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private String quotaActionCode; 
        private String quotaCategory; 
        private String sortField; 
        private String sortOrder; 

        private Builder() {
            super();
        } 

        private Builder(ListProductQuotasRequest request) {
            super(request);
            this.dimensions = request.dimensions;
            this.groupCode = request.groupCode;
            this.keyWord = request.keyWord;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.quotaActionCode = request.quotaActionCode;
            this.quotaCategory = request.quotaCategory;
            this.sortField = request.sortField;
            this.sortOrder = request.sortOrder;
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
         * The code of the dimension group.
         */
        public Builder groupCode(String groupCode) {
            this.putBodyParameter("GroupCode", groupCode);
            this.groupCode = groupCode;
            return this;
        }

        /**
         * The keyword that you want to use to search for the quotas.
         */
        public Builder keyWord(String keyWord) {
            this.putBodyParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * The maximum number of records that can be returned for the query.
         * <p>
         * 
         * Valid values: 1 to 100. Default value: 30.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the position from which you want to start the query. If you leave this parameter empty, the query starts from the beginning.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The abbreviation of the Alibaba Cloud service name.
         * <p>
         * 
         * > For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
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
         * *   FlowControl: API rate limit
         * *   WhiteListLabel: whitelist quota
         */
        public Builder quotaCategory(String quotaCategory) {
            this.putBodyParameter("QuotaCategory", quotaCategory);
            this.quotaCategory = quotaCategory;
            return this;
        }

        /**
         * The field based on which you want to sort the returned records. This parameter is available only for quotas that belong to ECS Quotas by Instance Type. Valid values:
         * <p>
         * 
         * *   TIME: The returned records are sorted by the last update time.
         * *   TOTAL: The returned records are sorted by the usage of the total quota.
         * *   RESERVED: The returned records are sorted by the usage of the reserved quota.
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * The order in which you want to sort the returned records. This parameter is available only for quotas that belong to ECS Quotas by Instance Type. Valid values:
         * <p>
         * 
         * *   Ascending: ascending order
         * *   Descending: descending order
         */
        public Builder sortOrder(String sortOrder) {
            this.putBodyParameter("SortOrder", sortOrder);
            this.sortOrder = sortOrder;
            return this;
        }

        @Override
        public ListProductQuotasRequest build() {
            return new ListProductQuotasRequest(this);
        } 

    } 

    public static class Dimensions extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
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
             * > The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The value of the dimension.
             * <p>
             * 
             * > The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.
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
