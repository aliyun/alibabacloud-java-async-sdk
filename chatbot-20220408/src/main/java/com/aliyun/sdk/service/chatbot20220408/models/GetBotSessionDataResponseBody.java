// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBotSessionDataResponseBody} extends {@link TeaModel}
 *
 * <p>GetBotSessionDataResponseBody</p>
 */
public class GetBotSessionDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CostTime")
    private String costTime;

    @com.aliyun.core.annotation.NameInMap("Datas")
    private java.util.List < java.util.Map<String, ?>> datas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetBotSessionDataResponseBody(Builder builder) {
        this.costTime = builder.costTime;
        this.datas = builder.datas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetBotSessionDataResponseBody create() {
        return builder().build();
    }

    /**
     * @return costTime
     */
    public String getCostTime() {
        return this.costTime;
    }

    /**
     * @return datas
     */
    public java.util.List < java.util.Map<String, ?>> getDatas() {
        return this.datas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String costTime; 
        private java.util.List < java.util.Map<String, ?>> datas; 
        private String requestId; 

        /**
         * CostTime.
         */
        public Builder costTime(String costTime) {
            this.costTime = costTime;
            return this;
        }

        /**
         * Datas.
         */
        public Builder datas(java.util.List < java.util.Map<String, ?>> datas) {
            this.datas = datas;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetBotSessionDataResponseBody build() {
            return new GetBotSessionDataResponseBody(this);
        } 

    } 

}
