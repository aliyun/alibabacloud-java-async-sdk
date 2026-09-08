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
 * {@link GetGatewayQuotaRuleSubjectUsageRequest} extends {@link RequestModel}
 *
 * <p>GetGatewayQuotaRuleSubjectUsageRequest</p>
 */
public class GetGatewayQuotaRuleSubjectUsageRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("subjectId")
    private String subjectId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("filterFailedRequests")
    private Boolean filterFailedRequests;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    private GetGatewayQuotaRuleSubjectUsageRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.ruleId = builder.ruleId;
        this.subjectId = builder.subjectId;
        this.endTime = builder.endTime;
        this.filterFailedRequests = builder.filterFailedRequests;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetGatewayQuotaRuleSubjectUsageRequest create() {
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
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return subjectId
     */
    public String getSubjectId() {
        return this.subjectId;
    }

    /**
     * @return endTime
     */
    public Long getEndTime() {
        return this.endTime;
    }

    /**
     * @return filterFailedRequests
     */
    public Boolean getFilterFailedRequests() {
        return this.filterFailedRequests;
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
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<GetGatewayQuotaRuleSubjectUsageRequest, Builder> {
        private String gatewayId; 
        private String ruleId; 
        private String subjectId; 
        private Long endTime; 
        private Boolean filterFailedRequests; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(GetGatewayQuotaRuleSubjectUsageRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.ruleId = request.ruleId;
            this.subjectId = request.subjectId;
            this.endTime = request.endTime;
            this.filterFailedRequests = request.filterFailedRequests;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.startTime = request.startTime;
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
         * <p>The rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>qr-d8j7fpmm1hks65kxxxxx</p>
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The ID of the subject (consumer or consumer group).</p>
         * 
         * <strong>example:</strong>
         * <p>cs-d8kkaium1xxxxxxxxxxx</p>
         */
        public Builder subjectId(String subjectId) {
            this.putPathParameter("subjectId", subjectId);
            this.subjectId = subjectId;
            return this;
        }

        /**
         * <p>The end time for querying consumption record details, in UNIX timestamp format (seconds). If only this parameter is specified, the system automatically calculates startTime based on the rule cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1788425220</p>
         */
        public Builder endTime(Long endTime) {
            this.putQueryParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to filter out zero values.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder filterFailedRequests(Boolean filterFailedRequests) {
            this.putQueryParameter("filterFailedRequests", filterFailedRequests);
            this.filterFailedRequests = filterFailedRequests;
            return this;
        }

        /**
         * <p>The page number of the detailed consumption (request) records of the subject within the cycle.</p>
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
         * <p>The number of detailed consumption (request) records per page for the subject within the cycle. Maximum value: 10.</p>
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
         * <p>The start time for querying consumption record details, in UNIX timestamp format (seconds). If only this parameter is specified, the system automatically calculates endTime based on the rule cycle.</p>
         * 
         * <strong>example:</strong>
         * <p>1788338820</p>
         */
        public Builder startTime(Long startTime) {
            this.putQueryParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public GetGatewayQuotaRuleSubjectUsageRequest build() {
            return new GetGatewayQuotaRuleSubjectUsageRequest(this);
        } 

    } 

}
