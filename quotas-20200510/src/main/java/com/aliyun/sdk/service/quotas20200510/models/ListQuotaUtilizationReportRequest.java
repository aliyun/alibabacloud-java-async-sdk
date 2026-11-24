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
 * {@link ListQuotaUtilizationReportRequest} extends {@link RequestModel}
 *
 * <p>ListQuotaUtilizationReportRequest</p>
 */
public class ListQuotaUtilizationReportRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Adjustable")
    private Boolean adjustable;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("KeyWords")
    private String keyWords;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ProductCode")
    private String productCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaCategory")
    private String quotaCategory;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QuotaRegionId")
    private String quotaRegionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UtilizationStatuses")
    private java.util.List<String> utilizationStatuses;

    private ListQuotaUtilizationReportRequest(Builder builder) {
        super(builder);
        this.adjustable = builder.adjustable;
        this.keyWords = builder.keyWords;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.productCode = builder.productCode;
        this.quotaCategory = builder.quotaCategory;
        this.quotaRegionId = builder.quotaRegionId;
        this.utilizationStatuses = builder.utilizationStatuses;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListQuotaUtilizationReportRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return adjustable
     */
    public Boolean getAdjustable() {
        return this.adjustable;
    }

    /**
     * @return keyWords
     */
    public String getKeyWords() {
        return this.keyWords;
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
     * @return quotaCategory
     */
    public String getQuotaCategory() {
        return this.quotaCategory;
    }

    /**
     * @return quotaRegionId
     */
    public String getQuotaRegionId() {
        return this.quotaRegionId;
    }

    /**
     * @return utilizationStatuses
     */
    public java.util.List<String> getUtilizationStatuses() {
        return this.utilizationStatuses;
    }

    public static final class Builder extends Request.Builder<ListQuotaUtilizationReportRequest, Builder> {
        private Boolean adjustable; 
        private String keyWords; 
        private Integer maxResults; 
        private String nextToken; 
        private String productCode; 
        private String quotaCategory; 
        private String quotaRegionId; 
        private java.util.List<String> utilizationStatuses; 

        private Builder() {
            super();
        } 

        private Builder(ListQuotaUtilizationReportRequest request) {
            super(request);
            this.adjustable = request.adjustable;
            this.keyWords = request.keyWords;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.productCode = request.productCode;
            this.quotaCategory = request.quotaCategory;
            this.quotaRegionId = request.quotaRegionId;
            this.utilizationStatuses = request.utilizationStatuses;
        } 

        /**
         * <p>Specifies whether to filter quotas by adjustability. Valid values:</p>
         * <ul>
         * <li>true: Queries only adjustable quotas.</li>
         * <li>false: Queries only non-adjustable quotas.
         * If this parameter is not specified, quotas are not filtered by adjustability.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder adjustable(Boolean adjustable) {
            this.putBodyParameter("Adjustable", adjustable);
            this.adjustable = adjustable;
            return this;
        }

        /**
         * <p>The search keyword. Performs a fuzzy match based on the quota name or quota ID.</p>
         * 
         * <strong>example:</strong>
         * <p>abc</p>
         */
        public Builder keyWords(String keyWords) {
            this.putBodyParameter("KeyWords", keyWords);
            this.keyWords = keyWords;
            return this;
        }

        /**
         * <p>The maximum number of entries to return for this query.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putBodyParameter("MaxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Do not specify this parameter for the first query. For subsequent queries, pass the NextToken value returned in the previous response as is, and keep the quota type and filter conditions unchanged. Do not parse or construct the token.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJvZmZzZXQiOjEwLCJvdHNOZXh0VG9rZW4iOiJDQUVTR3dvWkNoY0tFM1J2ZEdGc1gzVnpZV2RsWDNCbGNtTmxiblFRQVJnQkl1RUJDZ2tCQUFBQUFBQUFXVUFLMHdFRHpnQUFBREZUTXpFek9ETXdNemN6TnpNNE16VXpPVE0xTXpjek5qTXpNekV6TlRNNE16Z3VVek01TXpjek5UTTJOalkyTWpZeE16Y3laRFl5TmpJek16WXhNbVF6TkRNMk16RXpOREprTmpFek9UTTRNemN5WkRZMk16WTJORE16TXpVMk16TXhNemt6TURZMk16RXpNUzVUTmpFMk16YzBOamsyWmpabE56UTNNall4TmprMll5NVRNelkyTWpZMU16a3pPRE0yTmpRek1qSmtNekV6TlRNeU5qRXlaRE0wTXpFek1UWTJNbVEyTWpZME16TXpNVEprTXpNMk16WXlOalV6TkRNMU16VXpNalkwTXpVek1qTTMiLCJ0YXNrSWQiOiI5NzU2ZmJhNy1iYjNhLTQ2MTQtYTk4Ny1mNmQzNWMxOTBmMTEiLCJ1aWQiOiIxODA3Nzg1OTU3NjMxNTg4IiwidXRpbGl6YXRpb25TdGF0dXNlcyI6IiJ9</p>
         */
        public Builder nextToken(String nextToken) {
            this.putBodyParameter("NextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The abbreviation of the cloud service.</p>
         * <blockquote>
         * <p>For information about how to obtain the abbreviation of a cloud service, see ProductCode in <a href="https://help.aliyun.com/document_detail/440555.html">ListProducts</a>.</p>
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
         * <p>CommonQuota, FlowControl</p>
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
         * <p>The region ID of the quota, such as cn-hangzhou. If this parameter is not specified or is left empty, quotas are not filtered by region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder quotaRegionId(String quotaRegionId) {
            this.putBodyParameter("QuotaRegionId", quotaRegionId);
            this.quotaRegionId = quotaRegionId;
            return this;
        }

        /**
         * <p>The utilization statuses. You can specify multiple values. If this parameter is not specified or an empty list is passed, quotas are not filtered by utilization status.</p>
         */
        public Builder utilizationStatuses(java.util.List<String> utilizationStatuses) {
            this.putBodyParameter("UtilizationStatuses", utilizationStatuses);
            this.utilizationStatuses = utilizationStatuses;
            return this;
        }

        @Override
        public ListQuotaUtilizationReportRequest build() {
            return new ListQuotaUtilizationReportRequest(this);
        } 

    } 

}
