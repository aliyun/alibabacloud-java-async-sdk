// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiops20200806.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeRiskResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeRiskResponseBody</p>
 */
public class DescribeRiskResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskAssessment")
    private java.util.Map < String, ? > riskAssessment;

    @NameInMap("Status")
    private String status;

    private DescribeRiskResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.riskAssessment = builder.riskAssessment;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeRiskResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskAssessment
     */
    public java.util.Map < String, ? > getRiskAssessment() {
        return this.riskAssessment;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private java.util.Map < String, ? > riskAssessment; 
        private String status; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RiskAssessment.
         */
        public Builder riskAssessment(java.util.Map < String, ? > riskAssessment) {
            this.riskAssessment = riskAssessment;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeRiskResponseBody build() {
            return new DescribeRiskResponseBody(this);
        } 

    } 

}
