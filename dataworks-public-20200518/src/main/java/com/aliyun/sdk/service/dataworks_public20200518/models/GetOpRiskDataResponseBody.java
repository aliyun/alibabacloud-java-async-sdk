// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>0000-ABCD-EFG****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about the high-risk sensitive data. The information includes totalCount and opRiskDatas. opRiskDatas includes the following parameters:</p>
         * <ul>
         * <li>sensType: the type of the sensitive data</li>
         * <li>sensLevel: the sensitivity level of the sensitive data</li>
         * <li>opType: the type of the operation</li>
         * <li>sql: the SQL statement that is executed</li>
         * <li>opAccount: the account that is used to perform the operation</li>
         * <li>opTime: the time when the operation was performed</li>
         * </ul>
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
