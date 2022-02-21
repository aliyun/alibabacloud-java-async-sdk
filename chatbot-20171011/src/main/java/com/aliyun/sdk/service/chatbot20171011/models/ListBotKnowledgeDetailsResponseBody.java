// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20171011.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListBotKnowledgeDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListBotKnowledgeDetailsResponseBody</p>
 */
public class ListBotKnowledgeDetailsResponseBody extends TeaModel {
    @NameInMap("CostTime")
    private String costTime;

    @NameInMap("Datas")
    private java.util.List < java.util.Map<String, ?>> datas;

    @NameInMap("RequestId")
    private String requestId;

    private ListBotKnowledgeDetailsResponseBody(Builder builder) {
        this.costTime = builder.costTime;
        this.datas = builder.datas;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListBotKnowledgeDetailsResponseBody create() {
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

        public ListBotKnowledgeDetailsResponseBody build() {
            return new ListBotKnowledgeDetailsResponseBody(this);
        } 

    } 

}
