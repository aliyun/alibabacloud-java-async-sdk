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
         * <p>The ID of the gateway. Required. Specifies the gateway for which you want to export consumption details.</p>
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
         * <p>The ID of the quota rule. Required. The rule must belong to the gateway specified by gatewayId.</p>
         * 
         * <strong>example:</strong>
         * <p>qr-123456</p>
         */
        public Builder ruleId(String ruleId) {
            this.putPathParameter("ruleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * <p>The ID of the consumption subject. Required. Pass the consumer ID (with the cs- prefix) for consumer rules, and the consumer group ID (with the csg- prefix) for consumer group rules. When you create a task, the subject must be bound to the specified rule, and the subject type must match the rule.</p>
         * 
         * <strong>example:</strong>
         * <p>cs-123456</p>
         */
        public Builder subjectId(String subjectId) {
            this.putPathParameter("subjectId", subjectId);
            this.subjectId = subjectId;
            return this;
        }

        /**
         * <p>The optional token used for request idempotency. It can be up to 128 bytes in length after leading and trailing whitespaces are removed. We recommend that you use ASCII characters.</p>
         * <p>When the same user retries with the same token and identical request parameters in the current region, the existing task is reused and its current status is returned. If the same token corresponds to different parameters, a parameter error is returned. The compared parameters include gatewayId, ruleId, subjectId, filterFailedRequests, format, and whether startTime and endTime are passed and their values. Omitting the time is not equivalent to explicitly passing 0.</p>
         * <p>Reusing a task does not recalculate the time range or regenerate the file. When you need to re-export data (including when the original task fails or the file expires), use a new token.</p>
         * 
         * <strong>example:</strong>
         * <p>usage-export-20260729-001</p>
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>The end time of the export time range. Use a non-negative Unix timestamp in seconds. This time is exclusive.</p>
         * <p>If only endTime is specified, one rule period is deduced forward from this time as the startTime. If neither is specified, the end time is the task creation time. If both are specified, endTime must be greater than or equal to startTime, and the span cannot exceed one rule period.</p>
         * 
         * <strong>example:</strong>
         * <p>1783935200</p>
         */
        public Builder endTime(Long endTime) {
            this.putBodyParameter("endTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>Specifies whether to export only consumption details with valid usage. Default value: false.</p>
         * <ul>
         * <li>false: Does not filter records by usage.</li>
         * <li>true: Filters out records with zero usage based on the token or credit metering dimension of the rule, and retains only records with usage.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder filterFailedRequests(Boolean filterFailedRequests) {
            this.putBodyParameter("filterFailedRequests", filterFailedRequests);
            this.filterFailedRequests = filterFailedRequests;
            return this;
        }

        /**
         * <p>The format of the exported file. Currently, only CSV_GZIP is supported. If omitted or an empty string is passed, this format is used by default. The file is a GZIP-compressed CSV file named <code>{taskId}.csv.gz</code> and must be decompressed before reading.</p>
         * 
         * <strong>example:</strong>
         * <p>CSV_GZIP</p>
         */
        public Builder format(String format) {
            this.putBodyParameter("format", format);
            this.format = format;
            return this;
        }

        /**
         * <p>The start time of the export time range. Use a non-negative Unix timestamp in seconds. This time is inclusive.</p>
         * <ul>
         * <li>If neither startTime nor endTime is specified: The start point of the current rule epoch to the node creation time is used.</li>
         * <li>If only startTime is specified: One rule epoch is deduced backward from this time as the endTime.</li>
         * <li>If both are specified: endTime must be greater than or equal to startTime, and the span cannot exceed one rule epoch.</li>
         * </ul>
         * <p>The actual export start point is also limited by the rule creation time, rule reset, or the effective start point of purge history records. You can confirm this by querying the effectiveWindowStart returned by the node.</p>
         * 
         * <strong>example:</strong>
         * <p>1783931600</p>
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
