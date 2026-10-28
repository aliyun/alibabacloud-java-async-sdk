// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quotas20200510.models;

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
 * {@link ListQuotaApplicationsRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaApplicationsRequest</p>
 */
public class ListQuotaApplicationsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List<Dimensions> dimensions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    @com.aliyun.core.annotation.Validation(maximum = 200)
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
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

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
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
    public java.util.List<Dimensions> getDimensions() {
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
        private java.util.List<Dimensions> dimensions; 
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
         * <p>The quota dimensions.
         * The dimensions are properties of a quota item. A combination of dimensions (Dimensions) and a quota ID (QuotaActionCode) uniquely identifies a quota item.</p>
         * <blockquote>
         * <p>Some cloud services require dimensions. You can call <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> to query the quota dimensions supported by a cloud service. The <code>Requisite</code> response parameter indicates whether a dimension is required.</p>
         * </blockquote>
         */
        public Builder dimensions(java.util.List<Dimensions> dimensions) {
            this.putBodyParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The keyword for searching quota increase applications.</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster</p>
         */
        public Builder keyWord(String keyWord) {
            this.putBodyParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * <p>The maximum number of records to return in this query.</p>
         * <p>Valid values: 1 to 200. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that marks the position from which you want to start the query. Leave this parameter empty to query from the beginning.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The abbreviation of the cloud service name.</p>
         * 
         * <strong>example:</strong>
         * <p>csk</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>q_i5uzm3</p>
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        /**
         * <p>The quota category. Valid values:</p>
         * <ul>
         * <li>CommonQuota: general quota.</li>
         * <li>FlowControl: API rate limit.</li>
         * <li>WhiteListLabel: privilege.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CommonQuota</p>
         */
        public Builder quotaCategory(String quotaCategory) {
            this.putBodyParameter("QuotaCategory", quotaCategory);
            this.quotaCategory = quotaCategory;
            return this;
        }

        /**
         * <p>The approval status of the quota increase application. Valid values:</p>
         * <ul>
         * <li><p>Disagree: Rejected.</p>
         * </li>
         * <li><p>Agree: Approved.</p>
         * </li>
         * <li><p>Process: Under review.</p>
         * </li>
         * <li><p>Cancel: Closed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Agree</p>
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

    /**
     * 
     * {@link ListQuotaApplicationsRequest} extends {@link TeaModel}
     *
     * <p>ListQuotaApplicationsRequest</p>
     */
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

            private Builder() {
            } 

            private Builder(Dimensions model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The key of the quota dimension.</p>
             * <blockquote>
             * <p><code>Dimensions.N.Key</code> and <code>Dimensions.N.Value</code> must be specified together. The valid values of N depend on the number of dimensions supported by the cloud service. You can call <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> to query the quota dimensions supported by a cloud service. The length of the returned array is the value of N.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>regionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the quota dimension.</p>
             * <blockquote>
             * <p><code>Dimensions.N.Key</code> and <code>Dimensions.N.Value</code> must be specified together. The valid values of N depend on the number of dimensions supported by the cloud service. You can call <a href="~~ListProductQuotaDimensions~~">ListProductQuotaDimensions</a> to query the quota dimensions supported by a cloud service. The length of the returned array is the value of N.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
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
