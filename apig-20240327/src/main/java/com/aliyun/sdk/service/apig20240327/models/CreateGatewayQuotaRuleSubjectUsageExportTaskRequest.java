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
 * {@link CreateGatewayQuotaRuleSubjectUsageExportTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateGatewayQuotaRuleSubjectUsageExportTaskRequest</p>
 */
public class CreateGatewayQuotaRuleSubjectUsageExportTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ruleId")
    private String ruleId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("subjectId")
    private String subjectId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("clientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("endTime")
    private Long endTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("filterFailedRequests")
    private Boolean filterFailedRequests;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("format")
    private String format;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    private CreateGatewayQuotaRuleSubjectUsageExportTaskRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.ruleId = builder.ruleId;
        this.subjectId = builder.subjectId;
        this.clientToken = builder.clientToken;
        this.endTime = builder.endTime;
        this.filterFailedRequests = builder.filterFailedRequests;
        this.format = builder.format;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateGatewayQuotaRuleSubjectUsageExportTaskRequest create() {
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
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
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
     * @return format
     */
    public String getFormat() {
        return this.format;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder extends Request.Builder<CreateGatewayQuotaRuleSubjectUsageExportTaskRequest, Builder> {
        private String gatewayId; 
        private String ruleId; 
        private String subjectId; 
        private String clientToken; 
        private Long endTime; 
        private Boolean filterFailedRequests; 
        private String format; 
        private Long startTime; 

        private Builder() {
            super();
        } 

        private Builder(CreateGatewayQuotaRuleSubjectUsageExportTaskRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.ruleId = request.ruleId;
            this.subjectId = request.subjectId;
            this.clientToken = request.clientToken;
            this.endTime = request.endTime;
            this.filterFailedRequests = request.filterFailedRequests;
            this.format = request.format;
            this.startTime = request.startTime;
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
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * endTime.
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * filterFailedRequests.
         */
        public Builder filterFailedRequests(Boolean filterFailedRequests) {
            this.putBodyParameter("filterFailedRequests", filterFailedRequests);
            this.filterFailedRequests = filterFailedRequests;
            return this;
        }

        /**
         * format.
         */
        public Builder format(String format) {
            this.putBodyParameter("format", format);
            this.format = format;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.putBodyParameter("startTime", startTime);
            this.startTime = startTime;
            return this;
        }

        @Override
        public CreateGatewayQuotaRuleSubjectUsageExportTaskRequest build() {
            return new CreateGatewayQuotaRuleSubjectUsageExportTaskRequest(this);
        } 

    } 

}
