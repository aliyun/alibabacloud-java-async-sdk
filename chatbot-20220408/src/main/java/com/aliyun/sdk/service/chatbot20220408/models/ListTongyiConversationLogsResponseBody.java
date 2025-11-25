// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.chatbot20220408.models;

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
 * {@link ListTongyiConversationLogsResponseBody} extends {@link TeaModel}
 *
 * <p>ListTongyiConversationLogsResponseBody</p>
 */
public class ListTongyiConversationLogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CostTime")
    private String costTime;

    @com.aliyun.core.annotation.NameInMap("Datas")
    private java.util.List<java.util.Map<String, ?>> datas;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SessionFlowDebugInfo")
    private SessionFlowDebugInfo sessionFlowDebugInfo;

    private ListTongyiConversationLogsResponseBody(Builder builder) {
        this.costTime = builder.costTime;
        this.datas = builder.datas;
        this.requestId = builder.requestId;
        this.sessionFlowDebugInfo = builder.sessionFlowDebugInfo;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListTongyiConversationLogsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<java.util.Map<String, ?>> getDatas() {
        return this.datas;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sessionFlowDebugInfo
     */
    public SessionFlowDebugInfo getSessionFlowDebugInfo() {
        return this.sessionFlowDebugInfo;
    }

    public static final class Builder {
        private String costTime; 
        private java.util.List<java.util.Map<String, ?>> datas; 
        private String requestId; 
        private SessionFlowDebugInfo sessionFlowDebugInfo; 

        private Builder() {
        } 

        private Builder(ListTongyiConversationLogsResponseBody model) {
            this.costTime = model.costTime;
            this.datas = model.datas;
            this.requestId = model.requestId;
            this.sessionFlowDebugInfo = model.sessionFlowDebugInfo;
        } 

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
        public Builder datas(java.util.List<java.util.Map<String, ?>> datas) {
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

        /**
         * SessionFlowDebugInfo.
         */
        public Builder sessionFlowDebugInfo(SessionFlowDebugInfo sessionFlowDebugInfo) {
            this.sessionFlowDebugInfo = sessionFlowDebugInfo;
            return this;
        }

        public ListTongyiConversationLogsResponseBody build() {
            return new ListTongyiConversationLogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListTongyiConversationLogsResponseBody} extends {@link TeaModel}
     *
     * <p>ListTongyiConversationLogsResponseBody</p>
     */
    public static class SessionFlowDebugInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiParams")
        private java.util.Map<String, ?> apiParams;

        @com.aliyun.core.annotation.NameInMap("SlotParams")
        private java.util.Map<String, ?> slotParams;

        private SessionFlowDebugInfo(Builder builder) {
            this.apiParams = builder.apiParams;
            this.slotParams = builder.slotParams;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SessionFlowDebugInfo create() {
            return builder().build();
        }

        /**
         * @return apiParams
         */
        public java.util.Map<String, ?> getApiParams() {
            return this.apiParams;
        }

        /**
         * @return slotParams
         */
        public java.util.Map<String, ?> getSlotParams() {
            return this.slotParams;
        }

        public static final class Builder {
            private java.util.Map<String, ?> apiParams; 
            private java.util.Map<String, ?> slotParams; 

            private Builder() {
            } 

            private Builder(SessionFlowDebugInfo model) {
                this.apiParams = model.apiParams;
                this.slotParams = model.slotParams;
            } 

            /**
             * ApiParams.
             */
            public Builder apiParams(java.util.Map<String, ?> apiParams) {
                this.apiParams = apiParams;
                return this;
            }

            /**
             * SlotParams.
             */
            public Builder slotParams(java.util.Map<String, ?> slotParams) {
                this.slotParams = slotParams;
                return this;
            }

            public SessionFlowDebugInfo build() {
                return new SessionFlowDebugInfo(this);
            } 

        } 

    }
}
