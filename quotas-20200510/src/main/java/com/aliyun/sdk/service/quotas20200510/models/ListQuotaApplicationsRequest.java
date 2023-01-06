// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListQuotaApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaApplicationsRequest</p>
 */
public class ListQuotaApplicationsRequest extends Request {
    @Body
    @NameInMap("Dimensions")
    private java.util.List < Dimensions> dimensions;

    @Body
    @NameInMap("KeyWord")
    private String keyWord;

    @Body
    @NameInMap("MaxResults")
    @Validation(maximum = 200)
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
    @NameInMap("Status")
    private String status;

    private ListQuotaApplicationsRequest(Builder builder) {
        super(builder);
        this.dimensions = builder.dimensions;
        this.keyWord = builder.keyWord;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
        this.quotaActionCode = builder.quotaActionCode;
        this.quotaCategory = builder.quotaCategory;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaApplicationsRequest create() {
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
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<ListQuotaApplicationsRequest, Builder> {
        private java.util.List < Dimensions> dimensions; 
        private String keyWord; 
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private String quotaActionCode; 
        private String quotaCategory; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotaApplicationsRequest request) {
            super(request);
            this.dimensions = request.dimensions;
            this.keyWord = request.keyWord;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.quotaActionCode = request.quotaActionCode;
            this.quotaCategory = request.quotaCategory;
            this.status = request.status;
        } 

        /**
         * Dimensions.
         */
        public Builder dimensions(java.util.List < Dimensions> dimensions) {
            this.putBodyParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * The keyword that you want to use to search for the application.
         */
        public Builder keyWord(String keyWord) {
            this.putBodyParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * The maximum number of records that you want to return for the query.
         * <p>
         * 
         * Valid values: 1 to 200. Default value: 30.
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * The token that marks the position from which you want to start the query. An empty value indicates that the query starts from the beginning.
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * The abbreviation of the cloud service name.
         * <p>
         * 
         * >  For more information, see [Alibaba Cloud services that support Quota Center](~~182368~~).
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
         * *   FlowControl: API rate limit
         * *   CommonQuota: general quota
         */
        public Builder quotaCategory(String quotaCategory) {
            this.putBodyParameter("QuotaCategory", quotaCategory);
            this.quotaCategory = quotaCategory;
            return this;
        }

        /**
         * The status of the application. Valid values:
         * <p>
         * 
         * *   Disagree: The application is rejected.
         * *   Agree: The application is approved.
         * *   Process: The application is pending approval.
         * *   Cancel: The application is closed.
         */
        public Builder status(String status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public ListQuotaApplicationsRequest build() {
            return new ListQuotaApplicationsRequest(this);
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
             * The dimension keys.
             * <p>
             * 
             * >  The value range of N varies based on the number of dimensions that are supported by the related cloud service.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * The dimension values.
             * <p>
             * 
             * >  The value range of N varies based on the number of dimensions that are supported by the related cloud service.
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
