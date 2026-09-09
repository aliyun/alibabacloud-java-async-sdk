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
         * <p>The processing time.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * <p>The response data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The data type.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>051EEB18-049A-17FF-A5E0-14A5B127C798</p>
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

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-01-01 00:00:00</p>
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
             * <p>A description of the customer\&quot;s intent.</p>
             * 
             * <strong>example:</strong>
             * <p>客户希望与真人接触，不想和AI客服继续对话。</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The intent name.</p>
             * 
             * <strong>example:</strong>
             * <p>客户要求转人工</p>
             */
            public Builder intentionName(String intentionName) {
                this.intentionName = intentionName;
                return this;
            }

            /**
             * <p>The scripted reply based on the customer\&quot;s intent.</p>
             * 
             * <strong>example:</strong>
             * <p>很抱歉，我这里无法直接为您转接，您可以拨打我司客服热线进行咨询。</p>
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
             * <p>The <code>description</code> field provides a detailed description of the user\&quot;s intent.</p>
             * 
             * <strong>example:</strong>
             * <p>客户明确表示投诉/退订/不要打电话/骂人等拒绝营销</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The intent name.</p>
             * 
             * <strong>example:</strong>
             * <p>客户明确表示拒绝营销</p>
             */
            public Builder intentionName(String intentionName) {
                this.intentionName = intentionName;
                return this;
            }

            /**
             * <p>The <code>intentionScript</code> field contains the service agent\&quot;s reply script for the user\&quot;s intent.</p>
             * 
             * <strong>example:</strong>
             * <p>非常抱歉，给您带来了不好的体验。如您无需再接受我们的官方来电，请回复“我要退订”四个字！</p>
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
             * <p>The analysis process. This field has a value if the analysis process is enabled during the real-time conversation.</p>
             * 
             * <strong>example:</strong>
             * <p>客户回答的内容与提供的意图列表描述均不匹配，没有表达出对账单、还款、天气或其他服务的具体需求或问题。</p>
             */
            public Builder analysisProcess(String analysisProcess) {
                this.analysisProcess = analysisProcess;
                return this;
            }

            /**
             * <p>The <code>conversationList</code> field records the conversation content.</p>
             * 
             * <strong>example:</strong>
             * <p>##客服##:您好，请问是张三先生是吧？\n ##客户##:人工客服\n ##客服##:您好，我是2804，很高兴为您服务！\n ##客服##:您好，请问有什么可以帮到您？\n ##客户##:好的 谢谢\n</p>
             */
            public Builder conversationList(String conversationList) {
                this.conversationList = conversationList;
                return this;
            }

            /**
             * <p>The list of hit intents.</p>
             */
            public Builder hitIntentionList(java.util.List<HitIntentionList> hitIntentionList) {
                this.hitIntentionList = hitIntentionList;
                return this;
            }

            /**
             * <p>The intent list.</p>
             */
            public Builder intentionList(java.util.List<IntentionList> intentionList) {
                this.intentionList = intentionList;
                return this;
            }

            /**
             * <p>The model processing time, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1382</p>
             */
            public Builder modelCostTime(Long modelCostTime) {
                this.modelCostTime = modelCostTime;
                return this;
            }

            /**
             * <p>The recall list.</p>
             * 
             * <strong>example:</strong>
             * <h2>Example:\n- 对话内容为：\&quot;##客服##:您好，请问有什么可以帮到您？\n ##客户##:暂时没有了。谢谢。\&quot;时，用户意图为：\&quot;客户想要挂断电话\&quot;\n- 对话内容为：\&quot;##客服##:您好，请问有什么可以帮到您？\n ##客户##:哎你好。\&quot;时，用户意图为：\&quot;客户询问来电目的\&quot;\n- 对话内容为：\&quot;##客服##:您好，请问有什么可以帮到您？\n ##客户##:我现在财务状况很好，谢谢关心。\&quot;时，用户意图为：\&quot;客户拒绝贷款\&quot;\n- 对话内容为：\&quot;##客服##:您好，请问有什么可以帮到您？\n ##客户##:不用了，谢谢，不要再打电话了，谢谢。\&quot;时，用户意图为：\&quot;投诉/退订/不要打电话/骂人\&quot;\n- 对话内容为：\&quot;##客服##:您好，请问有什么可以帮到您？\n ##客户##:你好。\&quot;时，用户意图为：\&quot;客户询问来电目的\&quot;</h2>
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
