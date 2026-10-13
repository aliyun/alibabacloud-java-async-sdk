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
 * {@link GetAgentInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetAgentInfoResponseBody</p>
 */
public class GetAgentInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetAgentInfoResponseBody(Builder builder) {
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAgentInfoResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetAgentInfoResponseBody model) {
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The business space data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Parameter.Invalid</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>FC384CE1-8D42-1900-84E1-F33F990F2B5E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAgentInfoResponseBody build() {
            return new GetAgentInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAgentInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetAgentInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgentKey")
        private String agentKey;

        @com.aliyun.core.annotation.NameInMap("AgentName")
        private String agentName;

        private Data(Builder builder) {
            this.agentKey = builder.agentKey;
            this.agentName = builder.agentName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return agentKey
         */
        public String getAgentKey() {
            return this.agentKey;
        }

        /**
         * @return agentName
         */
        public String getAgentName() {
            return this.agentName;
        }

        public static final class Builder {
            private String agentKey; 
            private String agentName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.agentKey = model.agentKey;
                this.agentName = model.agentName;
            } 

            /**
             * <p>The signature of the business space, used to specify the business space when calling PaaS API operations.</p>
             * 
             * <strong>example:</strong>
             * <p>4e7400028e6f4a7393ed3acf6a7b8927_p_beebot_public</p>
             */
            public Builder agentKey(String agentKey) {
                this.agentKey = agentKey;
                return this;
            }

            /**
             * <p>The name of the business space.</p>
             * 
             * <strong>example:</strong>
             * <p>BusinessSpace_881</p>
             */
            public Builder agentName(String agentName) {
                this.agentName = agentName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
