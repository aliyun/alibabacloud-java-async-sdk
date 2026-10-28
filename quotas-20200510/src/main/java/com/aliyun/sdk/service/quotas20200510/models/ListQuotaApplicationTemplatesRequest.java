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
 * {@link ListQuotaApplicationTemplatesRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaApplicationTemplatesRequest</p>
 */
public class ListQuotaApplicationTemplatesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List<Dimensions> dimensions;

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
    public java.util.List<Dimensions> getDimensions() {
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
        private java.util.List<Dimensions> dimensions; 
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
         * <p>The quota dimensions.</p>
         */
        public Builder dimensions(java.util.List<Dimensions> dimensions) {
            this.putBodyParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The ID of the quota item.</p>
         * 
         * <strong>example:</strong>
         * <p>1****</p>
         */
        public Builder id(String id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The maximum number of records that can be returned for the query. Valid values: 1 to 100. Default value: 30.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token that marks the position from which you want to start the query.</p>
         * <blockquote>
         * <p>If you leave this parameter empty, the query starts from the beginning.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The abbreviation of the Alibaba Cloud service name.</p>
         * <blockquote>
         * <p>To query the abbreviation of an Alibaba Cloud service name, call the <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a> operation and check the value of <code>ProductCode</code> in the response.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>ecs</p>
         */
        public Builder productCode(String productCode) {
            this.putBodyParameter("ProductCode", productCode);
            this.productCode = productCode;
            return this;
        }

        /**
         * <p>The ID of the quota.</p>
         * 
         * <strong>example:</strong>
         * <p>q_security-groups</p>
         */
        public Builder quotaActionCode(String quotaActionCode) {
            this.putBodyParameter("QuotaActionCode", quotaActionCode);
            this.quotaActionCode = quotaActionCode;
            return this;
        }

        /**
         * <p>The quota type. Valid values:</p>
         * <ul>
         * <li><p>CommonQuota: general quota.</p>
         * </li>
         * <li><p>WhiteListLabel: whitelist quota.</p>
         * </li>
         * <li><p>FlowControl: API rate limit.</p>
         * </li>
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

        @Override
        public ListQuotaApplicationTemplatesRequest build() {
            return new ListQuotaApplicationTemplatesRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListQuotaApplicationTemplatesRequest} extends {@link TeaModel}
     *
     * <p>ListQuotaApplicationTemplatesRequest</p>
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
             * <p>The key of the dimension.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
             * </li>
             * <li><p>You must specify both Key and Value for each quota dimension.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>regionId</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The value of the dimension.</p>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>The value range of N varies based on the number of dimensions that are supported by the related Alibaba Cloud service.</p>
             * </li>
             * <li><p>You must specify both Key and Value for each quota dimension.</p>
             * </li>
             * </ul>
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
