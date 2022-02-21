// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBotColdDsDatasResponseBody} extends {@link TeaModel}
 *
 * <p>ListBotColdDsDatasResponseBody</p>
 */
public class ListBotColdDsDatasResponseBody extends TeaModel {
    @NameInMap("CostTime")
    private String costTime;

    @NameInMap("Datas")
    private java.util.List < java.util.Map<String, ?>> datas;

    @NameInMap("RequestId")
    private String requestId;

    private ListBotColdDsDatasResponseBody(Builder builder) {
        this.costTime = builder.costTime;
        this.datas = builder.datas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBotColdDsDatasResponseBody create() {
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

        public ListBotColdDsDatasResponseBody build() {
            return new ListBotColdDsDatasResponseBody(this);
        } 

    } 

}
