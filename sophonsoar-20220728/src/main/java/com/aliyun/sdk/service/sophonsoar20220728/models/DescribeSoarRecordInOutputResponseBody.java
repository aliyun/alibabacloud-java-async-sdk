// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sophonsoar20220728.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeSoarRecordInOutputResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSoarRecordInOutputResponseBody</p>
 */
public class DescribeSoarRecordInOutputResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("InOutputInfo")
    private String inOutputInfo;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeSoarRecordInOutputResponseBody(Builder builder) {
        this.inOutputInfo = builder.inOutputInfo;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSoarRecordInOutputResponseBody create() {
        return builder().build();
    }

    /**
     * @return inOutputInfo
     */
    public String getInOutputInfo() {
        return this.inOutputInfo;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String inOutputInfo; 
        private String requestId; 

        /**
         * <p>The execution result of the component action.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;actionUuid&quot;: &quot;3896a25d-4967-493c-942e-4e60f27da1f7-xxxxx&quot;,
         *     &quot;outputSummary&quot;: {
         *         &quot;datalist&quot;: [
         *             {
         *                 &quot;a&quot;: &quot;a&quot;
         *             }
         *         ],
         *         &quot;total_data_successful&quot;: 1,
         *         &quot;total_data&quot;: 1,
         *         &quot;total_exe_successful&quot;: 1,
         *         &quot;total_exe&quot;: 1,
         *         &quot;total_data_with_dup&quot;: 1,
         *         &quot;status&quot;: true
         *     },
         *     &quot;outputSchema&quot;: {
         *         &quot;a&quot;: &quot;String&quot;,
         *         &quot;startTime&quot;: &quot;DateTime&quot;
         *     },
         *     &quot;inputParams&quot;: {
         *         &quot;inputData&quot;: [
         *             {
         *                 &quot;outputFields&quot;: {
         *                     &quot;a&quot;: &quot;a&quot;
         *                 }
         *             }
         *         ],
         *         &quot;totalSize&quot;: 1
         *     },
         *     &quot;startTime&quot;: &quot;2023-11-13 17:47:28.645&quot;,
         *     &quot;taskName&quot;: &quot;92af3c79-1754-4646-9366-9ddbxxxxx&quot;
         * }</p>
         */
        public Builder inOutputInfo(String inOutputInfo) {
            this.inOutputInfo = inOutputInfo;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>372D8B41-AF8D-573A-9B3F-0924950F241F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeSoarRecordInOutputResponseBody build() {
            return new DescribeSoarRecordInOutputResponseBody(this);
        } 

    } 

}
