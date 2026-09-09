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
 * {@link GetDialogAnalysisResultResponseBody} extends {@link TeaModel}
 *
 * <p>GetDialogAnalysisResultResponseBody</p>
 */
public class GetDialogAnalysisResultResponseBody extends TeaModel {
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

    private GetDialogAnalysisResultResponseBody(Builder builder) {
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

    public static GetDialogAnalysisResultResponseBody create() {
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

        private Builder(GetDialogAnalysisResultResponseBody model) {
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
         * <p>Processing time in milliseconds</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder cost(Long cost) {
            this.cost = cost;
            return this;
        }

        /**
         * <p>Response data</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>Data type</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        public Builder dataType(String dataType) {
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>Error code</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder errCode(String errCode) {
            this.errCode = errCode;
            return this;
        }

        /**
         * <p>Error message</p>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>88A006F0-B565-53BA-B38A-DBDF9D0B2935</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request succeeded</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * <p>Timestamp</p>
         * 
         * <strong>example:</strong>
         * <p>2024-04-24 11:54:34</p>
         */
        public Builder time(String time) {
            this.time = time;
            return this;
        }

        public GetDialogAnalysisResultResponseBody build() {
            return new GetDialogAnalysisResultResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetDialogAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetDialogAnalysisResultResponseBody</p>
     */
    public static class DialogLabels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("value")
        private String value;

        private DialogLabels(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogLabels create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String name; 
            private String value; 

            private Builder() {
            } 

            private Builder(DialogLabels model) {
                this.name = model.name;
                this.value = model.value;
            } 

            /**
             * <p>Label name</p>
             * 
             * <strong>example:</strong>
             * <p>额度不足</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Label value</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public DialogLabels build() {
                return new DialogLabels(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDialogAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetDialogAnalysisResultResponseBody</p>
     */
    public static class AnalysisResp extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dialogExecPlan")
        private String dialogExecPlan;

        @com.aliyun.core.annotation.NameInMap("dialogLabels")
        private java.util.List<DialogLabels> dialogLabels;

        @com.aliyun.core.annotation.NameInMap("dialogOpenAnalysis")
        private java.util.Map<String, ?> dialogOpenAnalysis;

        @com.aliyun.core.annotation.NameInMap("dialogProcessAnalysis")
        private java.util.Map<String, ?> dialogProcessAnalysis;

        @com.aliyun.core.annotation.NameInMap("dialogSop")
        private String dialogSop;

        @com.aliyun.core.annotation.NameInMap("dialogSummary")
        private String dialogSummary;

        private AnalysisResp(Builder builder) {
            this.dialogExecPlan = builder.dialogExecPlan;
            this.dialogLabels = builder.dialogLabels;
            this.dialogOpenAnalysis = builder.dialogOpenAnalysis;
            this.dialogProcessAnalysis = builder.dialogProcessAnalysis;
            this.dialogSop = builder.dialogSop;
            this.dialogSummary = builder.dialogSummary;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AnalysisResp create() {
            return builder().build();
        }

        /**
         * @return dialogExecPlan
         */
        public String getDialogExecPlan() {
            return this.dialogExecPlan;
        }

        /**
         * @return dialogLabels
         */
        public java.util.List<DialogLabels> getDialogLabels() {
            return this.dialogLabels;
        }

        /**
         * @return dialogOpenAnalysis
         */
        public java.util.Map<String, ?> getDialogOpenAnalysis() {
            return this.dialogOpenAnalysis;
        }

        /**
         * @return dialogProcessAnalysis
         */
        public java.util.Map<String, ?> getDialogProcessAnalysis() {
            return this.dialogProcessAnalysis;
        }

        /**
         * @return dialogSop
         */
        public String getDialogSop() {
            return this.dialogSop;
        }

        /**
         * @return dialogSummary
         */
        public String getDialogSummary() {
            return this.dialogSummary;
        }

        public static final class Builder {
            private String dialogExecPlan; 
            private java.util.List<DialogLabels> dialogLabels; 
            private java.util.Map<String, ?> dialogOpenAnalysis; 
            private java.util.Map<String, ?> dialogProcessAnalysis; 
            private String dialogSop; 
            private String dialogSummary; 

            private Builder() {
            } 

            private Builder(AnalysisResp model) {
                this.dialogExecPlan = model.dialogExecPlan;
                this.dialogLabels = model.dialogLabels;
                this.dialogOpenAnalysis = model.dialogOpenAnalysis;
                this.dialogProcessAnalysis = model.dialogProcessAnalysis;
                this.dialogSop = model.dialogSop;
                this.dialogSummary = model.dialogSummary;
            } 

            /**
             * <p>Session execution plan</p>
             * 
             * <strong>example:</strong>
             * <ol>
             * <li>客服应再次确认客户的疑问是否已解决，特别是关于额度的具体数额。\n2. 如果客户仍有疑问，提供客服热线电话，建议客户直接拨打以获取更详细的帮助。\n3. 提醒客户检查短信中的链接，以便快速查看和操作。\n4. 记录此次通话中客户表现出的任何不适或不便，确保后续跟进时更加体贴。\n5. 发送一条包含操作指南的短信，确保客户能够轻松找到并使用服务。\n6. 结束通话前，再次感谢客户的支持，并表达希望客户早日康复的愿望。</li>
             * </ol>
             */
            public Builder dialogExecPlan(String dialogExecPlan) {
                this.dialogExecPlan = dialogExecPlan;
                return this;
            }

            /**
             * <p>List of session labels</p>
             */
            public Builder dialogLabels(java.util.List<DialogLabels> dialogLabels) {
                this.dialogLabels = dialogLabels;
                return this;
            }

            /**
             * <p>Session open analysis</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;dialogues&quot;: [
             *         {
             *             &quot;round&quot;: 1,
             *             &quot;result&quot;: [
             *                 {
             *                     &quot;key&quot;: &quot;对话主题&quot;,
             *                     &quot;value&quot;: &quot;XX&quot;
             *                 },
             *                 {
             *                     &quot;key&quot;: &quot;客户反应&quot;,
             *                     &quot;value&quot;: &quot;XXX&quot;
             *                 },
             *                 {
             *                     &quot;key&quot;: &quot;客户反应分析&quot;,
             *                     &quot;value&quot;: &quot;XXX&quot;
             *                 },
             *                 {
             *                     &quot;key&quot;: &quot;客服话术&quot;,
             *                     &quot;value&quot;: &quot;XXX&quot;
             *                 },
             *                 {
             *                     &quot;key&quot;: &quot;本轮客服话术修改建议&quot;,
             *                     &quot;value&quot;: &quot;XXX&quot;
             *                 }
             *             ]
             *         },
             *         {
             *             &quot;round&quot;: 2,
             *             &quot;result&quot;: [
             *                 {
             *                     &quot;key&quot;: &quot;对话主题&quot;,
             *                     &quot;value&quot;: &quot;XX&quot;
             *                 },
             *                 {
             *                     &quot;key&quot;: &quot;客户反应&quot;,
             *                     &quot;value&quot;: &quot;XXX&quot;
             *                 },
             *                 {
             *                     &quot;key&quot;: &quot;客户反应分析&quot;,
             *                     &quot;value&quot;: &quot;XXX&quot;
             *                 },
             *                 {
             *                     &quot;key&quot;: &quot;客服话术&quot;,
             *                     &quot;value&quot;: &quot;XXX&quot;
             *                 },
             *                 {
             *                     &quot;key&quot;: &quot;本轮客服话术修改建议&quot;,
             *                     &quot;value&quot;: &quot;XXX&quot;
             *                 }
             *             ]
             *         }
             *     ],
             *   &quot;dialogOpenAnalysisStr&quot;:&quot;第一轮对话：对话主题-xx##客户反应-xx##客户反应分析-xx##客服话术-xx##本轮客服话术修改建议-xx
             * 第二轮对话：对话主题-xx##客户反应-xx##客户反应分析-xx##客服话术-xx##本轮客服话术修改建议-xx&quot;
             * }</p>
             */
            public Builder dialogOpenAnalysis(java.util.Map<String, ?> dialogOpenAnalysis) {
                this.dialogOpenAnalysis = dialogOpenAnalysis;
                return this;
            }

            /**
             * <p>Session process analysis</p>
             * 
             * <strong>example:</strong>
             * <p>{
             *     &quot;dialogues&quot;: [
             *         {
             *             &quot;round&quot;: 1,
             *             &quot;result&quot;: [
             *                 {
             *                     &quot;key&quot;: &quot;客服&quot;,
             *                     &quot;value&quot;: &quot;客服回应标签&quot;
             *                 },
             *                 {
             *                     &quot;key&quot;: &quot;客户&quot;,
             *                     &quot;value&quot;: &quot;客户回应态度标签&quot;
             *                 }
             *             ]
             *         },
             *         {
             *             &quot;round&quot;: 2,
             *             &quot;result&quot;: [
             *                 {
             *                     &quot;key&quot;: &quot;客服&quot;,
             *                     &quot;value&quot;: &quot;客服回应标签&quot;
             *                 },
             *                 {
             *                     &quot;key&quot;: &quot;客户&quot;,
             *                     &quot;value&quot;: &quot;客户回应态度标签&quot;
             *                 }
             *             ]
             *         }
             *     ],
             * &quot;dialogProcessAnalysisStr&quot;:&quot;第一轮对话：客服-客服回应标签，客户-客户回应态度标签
             * 第二轮对话：客服-客服回应标签，客户-客户回应态度标签&quot;
             * }</p>
             */
            public Builder dialogProcessAnalysis(java.util.Map<String, ?> dialogProcessAnalysis) {
                this.dialogProcessAnalysis = dialogProcessAnalysis;
                return this;
            }

            /**
             * <p>Session SOP</p>
             * 
             * <strong>example:</strong>
             * <p>产品介绍</p>
             */
            public Builder dialogSop(String dialogSop) {
                this.dialogSop = dialogSop;
                return this;
            }

            /**
             * <p>Session summary</p>
             * 
             * <strong>example:</strong>
             * <ul>
             * <li>是否有资金需求：不确定，客户未明确表示有无资金需求。\n- 是否有意向：不确定，客户未明确表达意向。\n- 是否可营销：不可营销，客户对客服的多次询问未表现出兴趣，且对话中提到因不适希望减少联系。\n- 待满足需求：客户希望了解具体的预审额度信息。</li>
             * </ul>
             */
            public Builder dialogSummary(String dialogSummary) {
                this.dialogSummary = dialogSummary;
                return this;
            }

            public AnalysisResp build() {
                return new AnalysisResp(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDialogAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetDialogAnalysisResultResponseBody</p>
     */
    public static class DialogAnalysisRespList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysisResp")
        private AnalysisResp analysisResp;

        @com.aliyun.core.annotation.NameInMap("gmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("ossUrl")
        private String ossUrl;

        @com.aliyun.core.annotation.NameInMap("sessionId")
        private String sessionId;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private DialogAnalysisRespList(Builder builder) {
            this.analysisResp = builder.analysisResp;
            this.gmtCreate = builder.gmtCreate;
            this.ossUrl = builder.ossUrl;
            this.sessionId = builder.sessionId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DialogAnalysisRespList create() {
            return builder().build();
        }

        /**
         * @return analysisResp
         */
        public AnalysisResp getAnalysisResp() {
            return this.analysisResp;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return ossUrl
         */
        public String getOssUrl() {
            return this.ossUrl;
        }

        /**
         * @return sessionId
         */
        public String getSessionId() {
            return this.sessionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private AnalysisResp analysisResp; 
            private String gmtCreate; 
            private String ossUrl; 
            private String sessionId; 
            private String status; 

            private Builder() {
            } 

            private Builder(DialogAnalysisRespList model) {
                this.analysisResp = model.analysisResp;
                this.gmtCreate = model.gmtCreate;
                this.ossUrl = model.ossUrl;
                this.sessionId = model.sessionId;
                this.status = model.status;
            } 

            /**
             * <p>Session analysis result</p>
             */
            public Builder analysisResp(AnalysisResp analysisResp) {
                this.analysisResp = analysisResp;
                return this;
            }

            /**
             * <p>Session creation time</p>
             * 
             * <strong>example:</strong>
             * <p>2024-04-24 11:54:34</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>OSS URL for the session analysis result. The URL expires in one hour.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://xxx.oss-cn-beijing.aliyuncs.com/dialog-analysis/2024-12-30/2/1826661605606129665">https://xxx.oss-cn-beijing.aliyuncs.com/dialog-analysis/2024-12-30/2/1826661605606129665</a></p>
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * <p>Session ID</p>
             * 
             * <strong>example:</strong>
             * <p>183764873624</p>
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * <p>Task execution status for session analysis.</p>
             * <ul>
             * <li><p>init means the task has not started</p>
             * </li>
             * <li><p>pending means the task is queued</p>
             * </li>
             * <li><p>running means the task is in progress</p>
             * </li>
             * <li><p>error means the task failed</p>
             * </li>
             * <li><p>success means the task completed successfully</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public DialogAnalysisRespList build() {
                return new DialogAnalysisRespList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetDialogAnalysisResultResponseBody} extends {@link TeaModel}
     *
     * <p>GetDialogAnalysisResultResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("dialogAnalysisRespList")
        private java.util.List<DialogAnalysisRespList> dialogAnalysisRespList;

        private Data(Builder builder) {
            this.dialogAnalysisRespList = builder.dialogAnalysisRespList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dialogAnalysisRespList
         */
        public java.util.List<DialogAnalysisRespList> getDialogAnalysisRespList() {
            return this.dialogAnalysisRespList;
        }

        public static final class Builder {
            private java.util.List<DialogAnalysisRespList> dialogAnalysisRespList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dialogAnalysisRespList = model.dialogAnalysisRespList;
            } 

            /**
             * <p>List of session analysis results</p>
             */
            public Builder dialogAnalysisRespList(java.util.List<DialogAnalysisRespList> dialogAnalysisRespList) {
                this.dialogAnalysisRespList = dialogAnalysisRespList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
