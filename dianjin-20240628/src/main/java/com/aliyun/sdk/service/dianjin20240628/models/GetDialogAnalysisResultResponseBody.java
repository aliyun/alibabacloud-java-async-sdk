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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * value.
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
             * dialogExecPlan.
             */
            public Builder dialogExecPlan(String dialogExecPlan) {
                this.dialogExecPlan = dialogExecPlan;
                return this;
            }

            /**
             * dialogLabels.
             */
            public Builder dialogLabels(java.util.List<DialogLabels> dialogLabels) {
                this.dialogLabels = dialogLabels;
                return this;
            }

            /**
             * dialogOpenAnalysis.
             */
            public Builder dialogOpenAnalysis(java.util.Map<String, ?> dialogOpenAnalysis) {
                this.dialogOpenAnalysis = dialogOpenAnalysis;
                return this;
            }

            /**
             * dialogProcessAnalysis.
             */
            public Builder dialogProcessAnalysis(java.util.Map<String, ?> dialogProcessAnalysis) {
                this.dialogProcessAnalysis = dialogProcessAnalysis;
                return this;
            }

            /**
             * dialogSop.
             */
            public Builder dialogSop(String dialogSop) {
                this.dialogSop = dialogSop;
                return this;
            }

            /**
             * dialogSummary.
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
             * analysisResp.
             */
            public Builder analysisResp(AnalysisResp analysisResp) {
                this.analysisResp = analysisResp;
                return this;
            }

            /**
             * gmtCreate.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * ossUrl.
             */
            public Builder ossUrl(String ossUrl) {
                this.ossUrl = ossUrl;
                return this;
            }

            /**
             * sessionId.
             */
            public Builder sessionId(String sessionId) {
                this.sessionId = sessionId;
                return this;
            }

            /**
             * status.
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
             * dialogAnalysisRespList.
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
