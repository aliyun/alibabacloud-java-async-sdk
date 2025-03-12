// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ims20190815.models;

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
 * {@link GenerateGovernanceReportResponseBody} extends {@link TeaModel}
 *
 * <p>GenerateGovernanceReportResponseBody</p>
 */
public class GenerateGovernanceReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("State")
    private String state;

    private GenerateGovernanceReportResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateGovernanceReportResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return state
     */
    public String getState() {
        return this.state;
    }

    public static final class Builder {
        private String requestId; 
        private String state; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>492E130C-76D3-55D5-BE5C-C023E431369A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The report generation status. Valid values:</p>
         * <ul>
         * <li>Started: The system starts to generate a governance report.</li>
         * <li>Progressing: The system is generating a governance report.</li>
         * <li>Completed: A governance report is generated.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Started</p>
         */
        public Builder state(String state) {
            this.state = state;
            return this;
        }

        public GenerateGovernanceReportResponseBody build() {
            return new GenerateGovernanceReportResponseBody(this);
        } 

    } 

}
