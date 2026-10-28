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
 * {@link ListProductQuotasRequest} extends {@link RequestModel}
 *
 * <p>ListProductQuotasRequest</p>
 */
public class ListProductQuotasRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Dimensions")
    private java.util.List<Dimensions> dimensions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupCode")
    private String groupCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeyWord")
    private String keyWord;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaActionCode")
    private String quotaActionCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaCategory")
    private String quotaCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortField")
    private String sortField;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SortOrder")
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
    public java.util.List<Dimensions> getDimensions() {
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
        private java.util.List<Dimensions> dimensions; 
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
         * <p>The quota dimensions.</p>
         */
        public Builder dimensions(java.util.List<Dimensions> dimensions) {
            this.putBodyParameter("Dimensions", dimensions);
            this.dimensions = dimensions;
            return this;
        }

        /**
         * <p>The code of the dimension group.</p>
         * 
         * <strong>example:</strong>
         * <p>entconsole_w1j3ms****</p>
         */
        public Builder groupCode(String groupCode) {
            this.putBodyParameter("GroupCode", groupCode);
            this.groupCode = groupCode;
            return this;
        }

        /**
         * <p>The search keyword for the quota.</p>
         * <blockquote>
         * <p>This parameter applies only to Elastic Computing Service server instance type quotas (ecs-spec). The search scope includes <code>QuotaName</code> and <code>QuotaActionCode</code>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>security</p>
         */
        public Builder keyWord(String keyWord) {
            this.putBodyParameter("KeyWord", keyWord);
            this.keyWord = keyWord;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in a single request.</p>
         * <p>Valid values: 1 to 100. Default value: 30.</p>
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
         * <p>The token used to retrieve the next page of results.</p>
         * <ul>
         * <li>Leave this parameter empty for the first request or when no more results are available.</li>
         * <li>If more results are available, set this parameter to the NextToken value returned when you invoke the previous API call.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AAAAAd****</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The abbreviation of the cloud service.</p>
         * <blockquote>
         * <p>For more information about how to obtain the abbreviation of a cloud service, see <code>ProductCode</code> in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
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
         * <p>The quota category.</p>
         * <p>Default value: CommonQuota.</p>
         * 
         * <strong>example:</strong>
         * <p>FlowControl</p>
         */
        public Builder quotaCategory(String quotaCategory) {
            this.putBodyParameter("QuotaCategory", quotaCategory);
            this.quotaCategory = quotaCategory;
            return this;
        }

        /**
         * <p>The sorting method supported by the quota.</p>
         * <blockquote>
         * <p>This parameter applies only to Elastic Computing Service server instance type quotas (ecs-spec). If no Settings are specified, it is left empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>TIME</p>
         */
        public Builder sortField(String sortField) {
            this.putBodyParameter("SortField", sortField);
            this.sortField = sortField;
            return this;
        }

        /**
         * <p>The sorting method supported by the quota.</p>
         * <blockquote>
         * <p>This parameter applies only to Elastic Computing Service server instance type quotas (ecs-spec). If no Settings are specified, it is left empty.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Ascending</p>
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

    /**
     * 
     * {@link ListProductQuotasRequest} extends {@link TeaModel}
     *
     * <p>ListProductQuotasRequest</p>
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
             * <p>The value range of N depends on the number of dimensions supported by the corresponding cloud service.</p>
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
             * <p>The value range of N depends on the number of dimensions supported by the corresponding cloud service.</p>
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
