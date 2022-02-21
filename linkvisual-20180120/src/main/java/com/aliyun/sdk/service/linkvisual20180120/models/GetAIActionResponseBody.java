// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAIActionResponseBody} extends {@link TeaModel}
 *
 * <p>GetAIActionResponseBody</p>
 */
public class GetAIActionResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private GetAIActionResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAIActionResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String code; 
        private Data data; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetAIActionResponseBody build() {
            return new GetAIActionResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ActionConfig")
        private String actionConfig;

        @NameInMap("ActionId")
        private String actionId;

        @NameInMap("ActionIndex")
        private Integer actionIndex;

        @NameInMap("ActionTemplateId")
        private String actionTemplateId;

        @NameInMap("AlgoConfig")
        private String algoConfig;

        @NameInMap("Alog")
        private String alog;

        @NameInMap("PlanId")
        private String planId;

        private Data(Builder builder) {
            this.action = builder.action;
            this.actionConfig = builder.actionConfig;
            this.actionId = builder.actionId;
            this.actionIndex = builder.actionIndex;
            this.actionTemplateId = builder.actionTemplateId;
            this.algoConfig = builder.algoConfig;
            this.alog = builder.alog;
            this.planId = builder.planId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionConfig
         */
        public String getActionConfig() {
            return this.actionConfig;
        }

        /**
         * @return actionId
         */
        public String getActionId() {
            return this.actionId;
        }

        /**
         * @return actionIndex
         */
        public Integer getActionIndex() {
            return this.actionIndex;
        }

        /**
         * @return actionTemplateId
         */
        public String getActionTemplateId() {
            return this.actionTemplateId;
        }

        /**
         * @return algoConfig
         */
        public String getAlgoConfig() {
            return this.algoConfig;
        }

        /**
         * @return alog
         */
        public String getAlog() {
            return this.alog;
        }

        /**
         * @return planId
         */
        public String getPlanId() {
            return this.planId;
        }

        public static final class Builder {
            private String action; 
            private String actionConfig; 
            private String actionId; 
            private Integer actionIndex; 
            private String actionTemplateId; 
            private String algoConfig; 
            private String alog; 
            private String planId; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ActionConfig.
             */
            public Builder actionConfig(String actionConfig) {
                this.actionConfig = actionConfig;
                return this;
            }

            /**
             * ActionId.
             */
            public Builder actionId(String actionId) {
                this.actionId = actionId;
                return this;
            }

            /**
             * ActionIndex.
             */
            public Builder actionIndex(Integer actionIndex) {
                this.actionIndex = actionIndex;
                return this;
            }

            /**
             * ActionTemplateId.
             */
            public Builder actionTemplateId(String actionTemplateId) {
                this.actionTemplateId = actionTemplateId;
                return this;
            }

            /**
             * AlgoConfig.
             */
            public Builder algoConfig(String algoConfig) {
                this.algoConfig = algoConfig;
                return this;
            }

            /**
             * Alog.
             */
            public Builder alog(String alog) {
                this.alog = alog;
                return this;
            }

            /**
             * PlanId.
             */
            public Builder planId(String planId) {
                this.planId = planId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
