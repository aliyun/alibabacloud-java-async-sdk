// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link ListGatewayQuotaRulesRequest} extends {@link RequestModel}
 *
 * <p>ListGatewayQuotaRulesRequest</p>
 */
public class ListGatewayQuotaRulesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("keyword")
    private String keyword;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("maxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("nextToken")
    private String nextToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ruleStatus")
    private String ruleStatus;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("subjectNameLike")
    private String subjectNameLike;

    private ListGatewayQuotaRulesRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.keyword = builder.keyword;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.ruleStatus = builder.ruleStatus;
        this.subjectNameLike = builder.subjectNameLike;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListGatewayQuotaRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    /**
     * @return keyword
     */
    public String getKeyword() {
        return this.keyword;
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
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return ruleStatus
     */
    public String getRuleStatus() {
        return this.ruleStatus;
    }

    /**
     * @return subjectNameLike
     */
    public String getSubjectNameLike() {
        return this.subjectNameLike;
    }

    public static final class Builder extends Request.Builder<ListGatewayQuotaRulesRequest, Builder> {
        private String gatewayId; 
        private String keyword; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String ruleStatus; 
        private String subjectNameLike; 

        private Builder() {
            super();
        } 

        private Builder(ListGatewayQuotaRulesRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.keyword = request.keyword;
            this.maxResults = request.maxResults;
            this.nextToken = request.nextToken;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.ruleStatus = request.ruleStatus;
            this.subjectNameLike = request.subjectNameLike;
        } 

        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-123456</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>The keyword in the rule name used for fuzzy matching.</p>
         * 
         * <strong>example:</strong>
         * <p>daily</p>
         */
        public Builder keyword(String keyword) {
            this.putQueryParameter("keyword", keyword);
            this.keyword = keyword;
            return this;
        }

        /**
         * <p>The maximum number of entries to return in a single call. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.putQueryParameter("maxResults", maxResults);
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. This parameter is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>C4tM8BlBJwHSNyjWpGaci4/7dKNGp1JMgsKtvCagmtY=</p>
         */
        public Builder nextToken(String nextToken) {
            this.putQueryParameter("nextToken", nextToken);
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The status of the rule. Valid values: enabled and disabled. If you do not specify this parameter, all rules are queried.</p>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        public Builder ruleStatus(String ruleStatus) {
            this.putQueryParameter("ruleStatus", ruleStatus);
            this.ruleStatus = ruleStatus;
            return this;
        }

        /**
         * <p>The keyword in the name of the associated subject for fuzzy matching based on the consumer or consumer group name.</p>
         * 
         * <strong>example:</strong>
         * <p>alpha</p>
         */
        public Builder subjectNameLike(String subjectNameLike) {
            this.putQueryParameter("subjectNameLike", subjectNameLike);
            this.subjectNameLike = subjectNameLike;
            return this;
        }

        @Override
        public ListGatewayQuotaRulesRequest build() {
            return new ListGatewayQuotaRulesRequest(this);
        } 

    } 

}
