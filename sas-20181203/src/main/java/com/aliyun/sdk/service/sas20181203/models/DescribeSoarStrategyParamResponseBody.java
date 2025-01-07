// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The parameters of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;summary&quot;:[{&quot;name&quot;:&quot;email&quot;,&quot;type&quot;:&quot;String&quot;,&quot;isRequired&quot;:false,&quot;fromProperty&quot;:&quot;notifyConfig.email&quot;}]}</p>
         */
        public Builder params(String params) {
            this.params = params;
            return this;
        }

        /**
         * <p>The process information of the policy.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;edges&quot;:[{&quot;level&quot;:0,&quot;removeFlag&quot;:0,&quot;source&quot;:1,&quot;target&quot;:8}]}</p>
         */
        public Builder processInfo(String processInfo) {
            this.processInfo = processInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6673D49C-A9AB-40DD-B4A2-B92306701AE7</p>
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
