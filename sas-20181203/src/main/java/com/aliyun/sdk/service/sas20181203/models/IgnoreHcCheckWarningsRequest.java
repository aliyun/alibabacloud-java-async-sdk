// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link IgnoreHcCheckWarningsRequest} extends {@link RequestModel}
 *
 * <p>IgnoreHcCheckWarningsRequest</p>
 */
public class IgnoreHcCheckWarningsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckIds")
    private String checkIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CheckWarningIds")
    private String checkWarningIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Reason")
    private String reason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskId")
    private String riskId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Source")
    private String source;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long type;

    private IgnoreHcCheckWarningsRequest(Builder builder) {
        super(builder);
        this.checkIds = builder.checkIds;
        this.checkWarningIds = builder.checkWarningIds;
        this.reason = builder.reason;
        this.riskId = builder.riskId;
        this.source = builder.source;
        this.sourceIp = builder.sourceIp;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static IgnoreHcCheckWarningsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return checkIds
     */
    public String getCheckIds() {
        return this.checkIds;
    }

    /**
     * @return checkWarningIds
     */
    public String getCheckWarningIds() {
        return this.checkWarningIds;
    }

    /**
     * @return reason
     */
    public String getReason() {
        return this.reason;
    }

    /**
     * @return riskId
     */
    public String getRiskId() {
        return this.riskId;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return type
     */
    public Long getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<IgnoreHcCheckWarningsRequest, Builder> {
        private String checkIds; 
        private String checkWarningIds; 
        private String reason; 
        private String riskId; 
        private String source; 
        private String sourceIp; 
        private Long type; 

        private Builder() {
            super();
        } 

        private Builder(IgnoreHcCheckWarningsRequest request) {
            super(request);
            this.checkIds = request.checkIds;
            this.checkWarningIds = request.checkWarningIds;
            this.reason = request.reason;
            this.riskId = request.riskId;
            this.source = request.source;
            this.sourceIp = request.sourceIp;
            this.type = request.type;
        } 

        /**
         * The ID of the check item.
         * <p>
         * 
         * >  You can call the [DescribeCheckWarnings](~~116182~~) operation to query the IDs of check items.
         */
        public Builder checkIds(String checkIds) {
            this.putQueryParameter("CheckIds", checkIds);
            this.checkIds = checkIds;
            return this;
        }

        /**
         * The ID of the alert that is triggered by the check item. Separate multiple IDs with commas (,).
         * <p>
         * 
         * >  You can call the [DescribeCheckWarnings](~~116182~~) operation to query the IDs of alerts that are triggered by check items.
         */
        public Builder checkWarningIds(String checkWarningIds) {
            this.putQueryParameter("CheckWarningIds", checkWarningIds);
            this.checkWarningIds = checkWarningIds;
            return this;
        }

        /**
         * The reason for the current operation.
         */
        public Builder reason(String reason) {
            this.putQueryParameter("Reason", reason);
            this.reason = reason;
            return this;
        }

        /**
         * The ID of the risk item that you want to ignore or cancel ignoring.
         * <p>
         * 
         * >  You can call the [DescribeCheckWarningSummary](~~116179~~) operation to query the IDs of risk items.
         */
        public Builder riskId(String riskId) {
            this.putQueryParameter("RiskId", riskId);
            this.riskId = riskId;
            return this;
        }

        /**
         * The data source. If this parameter is left empty, the server baseline results are queried by default. Valid values:
         * <p>
         * * **default**: server
         * * **agentless**
         */
        public Builder source(String source) {
            this.putQueryParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The type of the operation that you want to perform. Valid values:
         * <p>
         * 
         * *   **1**: ignores a risk item
         * *   **2**: cancels ignoring a risk item
         */
        public Builder type(Long type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public IgnoreHcCheckWarningsRequest build() {
            return new IgnoreHcCheckWarningsRequest(this);
        } 

    } 

}
