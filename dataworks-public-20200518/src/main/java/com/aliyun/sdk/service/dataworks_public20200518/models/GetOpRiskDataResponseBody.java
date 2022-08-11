// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOpRiskDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetOpRiskDataResponseBody</p>
 */
public class GetOpRiskDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RiskData")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * RiskData.
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
