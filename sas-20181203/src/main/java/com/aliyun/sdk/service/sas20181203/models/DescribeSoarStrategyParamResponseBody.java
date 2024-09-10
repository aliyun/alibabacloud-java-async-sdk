// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSoarStrategyParamResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSoarStrategyParamResponseBody</p>
 */
public class DescribeSoarStrategyParamResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.NameInMap("ProcessInfo")
    private String processInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSoarStrategyParamResponseBody(Builder builder) {
        this.params = builder.params;
        this.processInfo = builder.processInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarStrategyParamResponseBody create() {
        return builder().build();
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return processInfo
     */
    public String getProcessInfo() {
        return this.processInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String params; 
        private String processInfo; 
        private String requestId; 

        /**
         * The parameters of the policy.
         */
        public Builder params(String params) {
            this.params = params;
            return this;
        }

        /**
         * The process information of the policy.
         */
        public Builder processInfo(String processInfo) {
            this.processInfo = processInfo;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSoarStrategyParamResponseBody build() {
            return new DescribeSoarStrategyParamResponseBody(this);
        } 

    } 

}
