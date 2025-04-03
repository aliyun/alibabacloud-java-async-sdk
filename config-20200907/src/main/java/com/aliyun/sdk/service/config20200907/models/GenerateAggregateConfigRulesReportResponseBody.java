// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link GenerateAggregateConfigRulesReportResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateAggregateConfigRulesReportResponseBody</p>
 */
public class GenerateAggregateConfigRulesReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AggregatorId")
    private String aggregatorId;

    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateAggregateConfigRulesReportResponseBody(Builder builder) {
        this.aggregatorId = builder.aggregatorId;
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAggregateConfigRulesReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return aggregatorId
     */
    public String getAggregatorId() {
        return this.aggregatorId;
    }

    /**
     * @return reportId
     */
    public String getReportId() {
        return this.reportId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String aggregatorId; 
        private String reportId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GenerateAggregateConfigRulesReportResponseBody model) {
            this.aggregatorId = model.aggregatorId;
            this.reportId = model.reportId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the account group.</p>
         * 
         * <strong>example:</strong>
         * <p>ca-f632626622af0079****</p>
         */
        public Builder aggregatorId(String aggregatorId) {
            this.aggregatorId = aggregatorId;
            return this;
        }

        /**
         * <p>The ID of the compliance evaluation report.</p>
         * 
         * <strong>example:</strong>
         * <p>crp-88176457e0d900c9****</p>
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6EC7AED1-172F-42AE-9C12-295BC2ADB751</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateAggregateConfigRulesReportResponseBody build() {
            return new GenerateAggregateConfigRulesReportResponseBody(this);
        } 

    } 

}
