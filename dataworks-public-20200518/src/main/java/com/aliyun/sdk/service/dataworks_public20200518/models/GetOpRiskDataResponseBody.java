// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpRiskDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpRiskDataResponseBody</p>
 */
public class GetOpRiskDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskData")
    private String riskData;

    private GetOpRiskDataResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.riskData = builder.riskData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetOpRiskDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskData
     */
    public String getRiskData() {
        return this.riskData;
    }

    public static final class Builder {
        private String requestId; 
        private String riskData; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The information of the risky sensitive data returned. The information includes totalCount and opRiskDatas.
         * <p>
         * 
         * opRiskDatas includes the following parameters:
         * 
         * *   sensType: the type of the sensitive data
         * *   sensLevel: the sensitivity level of the sensitive data
         * *   opType: the type of the operation
         * *   sql: the SQL statement that is executed
         * *   opAccount: the account that is used to perform the operation
         * *   opTime: the time when the operation was performed
         */
        public Builder riskData(String riskData) {
            this.riskData = riskData;
            return this;
        }

        public GetOpRiskDataResponseBody build() {
            return new GetOpRiskDataResponseBody(this);
        } 

    } 

}
