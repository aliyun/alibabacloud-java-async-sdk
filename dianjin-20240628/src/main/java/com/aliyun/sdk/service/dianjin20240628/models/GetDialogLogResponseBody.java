// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dianjin20240628.models;

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
 * {@link GetDialogLogResponseBody} extends {@link TeaModel}
 *
 * <p>GetDialogLogResponseBody</p>
 */
public class GetDialogLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("cost")
    private Long cost;

    @com.aliyun.core.annotation.NameInMap("data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("dataType")
    private String dataType;

    @com.aliyun.core.annotation.NameInMap("errCode")
    private String errCode;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("time")
    private String time;

    private GetDialogLogResponseBody(Builder builder) {
        this.cost = builder.cost;
        this.data = builder.data;
        this.dataType = builder.dataType;
        this.errCode = builder.errCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.time = builder.time;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDialogLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cost
     */
    public Long getCost() {
        return this.cost;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return errCode
     */
    public String getErrCode() {
        return this.errCode;
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

    /**
     * @return time
     */
    public String getTime() {
        return this.time;
    }

    public static final class Builder {
        private Long cost; 
        private Data data; 
        private String dataType; 
        private String errCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 
        private String time; 

        private Builder() {
        } 

        private Builder(GetDialogLogResponseBody model) {
            this.cost = model.cost;
            this.data = model.data;
            this.dataType = model.dataType;
            this.errCode = model.errCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
            this.time = model.time;
        } 

        /**
         * cost.
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * dataType.
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * errCode.
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * requestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * time.
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public GetDialogLogResponseBody build() {
            return new GetDialogLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDialogLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetDialogLogResponseBody</p>
     */
    public static class HitIntentionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("intentionName")
        private String intentionName;

        @com.aliyun.core.annotation.NameInMap("intentionScript")
        private String intentionScript;

        private HitIntentionList(Builder builder) {
            this.description = builder.description;
            this.intentionName = builder.intentionName;
            this.intentionScript = builder.intentionScript;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HitIntentionList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return intentionName
         */
        public String getIntentionName() {
            return this.intentionName;
        }

        /**
         * @return intentionScript
         */
        public String getIntentionScript() {
            return this.intentionScript;
        }

        public static final class Builder {
            private String description; 
            private String intentionName; 
            private String intentionScript; 

            private Builder() {
            } 

            private Builder(HitIntentionList model) {
                this.description = model.description;
                this.intentionName = model.intentionName;
                this.intentionScript = model.intentionScript;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * intentionName.
             */
            public Builder intentionName(String intentionName) {
                this.intentionName = intentionName;
                return this;
            }

            /**
             * intentionScript.
             */
            public Builder intentionScript(String intentionScript) {
                this.intentionScript = intentionScript;
                return this;
            }

            public HitIntentionList build() {
                return new HitIntentionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDialogLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetDialogLogResponseBody</p>
     */
    public static class IntentionList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("intentionName")
        private String intentionName;

        @com.aliyun.core.annotation.NameInMap("intentionScript")
        private String intentionScript;

        private IntentionList(Builder builder) {
            this.description = builder.description;
            this.intentionName = builder.intentionName;
            this.intentionScript = builder.intentionScript;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static IntentionList create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return intentionName
         */
        public String getIntentionName() {
            return this.intentionName;
        }

        /**
         * @return intentionScript
         */
        public String getIntentionScript() {
            return this.intentionScript;
        }

        public static final class Builder {
            private String description; 
            private String intentionName; 
            private String intentionScript; 

            private Builder() {
            } 

            private Builder(IntentionList model) {
                this.description = model.description;
                this.intentionName = model.intentionName;
                this.intentionScript = model.intentionScript;
            } 

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * intentionName.
             */
            public Builder intentionName(String intentionName) {
                this.intentionName = intentionName;
                return this;
            }

            /**
             * intentionScript.
             */
            public Builder intentionScript(String intentionScript) {
                this.intentionScript = intentionScript;
                return this;
            }

            public IntentionList build() {
                return new IntentionList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDialogLogResponseBody} extends {@link TeaModel}
     *
     * <p>GetDialogLogResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysisProcess")
        private String analysisProcess;

        @com.aliyun.core.annotation.NameInMap("conversationList")
        private String conversationList;

        @com.aliyun.core.annotation.NameInMap("hitIntentionList")
        private java.util.List<HitIntentionList> hitIntentionList;

        @com.aliyun.core.annotation.NameInMap("intentionList")
        private java.util.List<IntentionList> intentionList;

        @com.aliyun.core.annotation.NameInMap("modelCostTime")
        private Long modelCostTime;

        @com.aliyun.core.annotation.NameInMap("recallList")
        private String recallList;

        private Data(Builder builder) {
            this.analysisProcess = builder.analysisProcess;
            this.conversationList = builder.conversationList;
            this.hitIntentionList = builder.hitIntentionList;
            this.intentionList = builder.intentionList;
            this.modelCostTime = builder.modelCostTime;
            this.recallList = builder.recallList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analysisProcess
         */
        public String getAnalysisProcess() {
            return this.analysisProcess;
        }

        /**
         * @return conversationList
         */
        public String getConversationList() {
            return this.conversationList;
        }

        /**
         * @return hitIntentionList
         */
        public java.util.List<HitIntentionList> getHitIntentionList() {
            return this.hitIntentionList;
        }

        /**
         * @return intentionList
         */
        public java.util.List<IntentionList> getIntentionList() {
            return this.intentionList;
        }

        /**
         * @return modelCostTime
         */
        public Long getModelCostTime() {
            return this.modelCostTime;
        }

        /**
         * @return recallList
         */
        public String getRecallList() {
            return this.recallList;
        }

        public static final class Builder {
            private String analysisProcess; 
            private String conversationList; 
            private java.util.List<HitIntentionList> hitIntentionList; 
            private java.util.List<IntentionList> intentionList; 
            private Long modelCostTime; 
            private String recallList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.analysisProcess = model.analysisProcess;
                this.conversationList = model.conversationList;
                this.hitIntentionList = model.hitIntentionList;
                this.intentionList = model.intentionList;
                this.modelCostTime = model.modelCostTime;
                this.recallList = model.recallList;
            } 

            /**
             * analysisProcess.
             */
            public Builder analysisProcess(String analysisProcess) {
                this.analysisProcess = analysisProcess;
                return this;
            }

            /**
             * conversationList.
             */
            public Builder conversationList(String conversationList) {
                this.conversationList = conversationList;
                return this;
            }

            /**
             * hitIntentionList.
             */
            public Builder hitIntentionList(java.util.List<HitIntentionList> hitIntentionList) {
                this.hitIntentionList = hitIntentionList;
                return this;
            }

            /**
             * intentionList.
             */
            public Builder intentionList(java.util.List<IntentionList> intentionList) {
                this.intentionList = intentionList;
                return this;
            }

            /**
             * modelCostTime.
             */
            public Builder modelCostTime(Long modelCostTime) {
                this.modelCostTime = modelCostTime;
                return this;
            }

            /**
             * recallList.
             */
            public Builder recallList(String recallList) {
                this.recallList = recallList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
