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
    @com.aliyun.core.annotation.NameInMap("pageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("pageSize")
    private Integer pageSize;

    private GetGatewayQuotaRuleSubjectUsageRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.ruleId = builder.ruleId;
        this.subjectId = builder.subjectId;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
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

    public static final class Builder extends Request.Builder<GetGatewayQuotaRuleSubjectUsageRequest, Builder> {
        private String gatewayId; 
        private String ruleId; 
        private String subjectId; 
        private Integer pageNumber; 
        private Integer pageSize; 

        private Builder() {
            super();
        } 

        private Builder(GetGatewayQuotaRuleSubjectUsageRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.ruleId = request.ruleId;
            this.subjectId = request.subjectId;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
        } 

        /**
         * gatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * ruleId.
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * subjectId.
         */
        public Builder subjectId(String subjectId) {
            this.putPathParameter("subjectId", subjectId);
            this.subjectId = subjectId;
            return this;
        }

        /**
         * pageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("pageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * pageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("pageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        @Override
        public GetGatewayQuotaRuleSubjectUsageRequest build() {
            return new GetGatewayQuotaRuleSubjectUsageRequest(this);
        } 

    } 

}
