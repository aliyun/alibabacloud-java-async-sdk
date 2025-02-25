// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tag20180828.models;

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
 * {@link GenerateConfigRuleReportResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateConfigRuleReportResponseBody</p>
 */
public class GenerateConfigRuleReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ReportId")
    private String reportId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GenerateConfigRuleReportResponseBody(Builder builder) {
        this.reportId = builder.reportId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateConfigRuleReportResponseBody create() {
        return builder().build();
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
        private String reportId; 
        private String requestId; 

        /**
         * <p>The ID of the resource non-compliance report.</p>
         * 
         * <strong>example:</strong>
         * <p>crp-ao0786618088006c****</p>
         */
        public Builder reportId(String reportId) {
            this.reportId = reportId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>37B2AC06-89D8-5D95-98DF-3E68C12BDE05</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GenerateConfigRuleReportResponseBody build() {
            return new GenerateConfigRuleReportResponseBody(this);
        } 

    } 

}
