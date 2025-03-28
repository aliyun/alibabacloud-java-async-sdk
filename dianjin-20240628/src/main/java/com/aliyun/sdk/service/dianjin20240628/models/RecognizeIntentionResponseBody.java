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
 * {@link RecognizeIntentionResponseBody} extends {@link TeaModel}
 *
 * <p>RecognizeIntentionResponseBody</p>
 */
public class RecognizeIntentionResponseBody extends TeaModel {
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

    private RecognizeIntentionResponseBody(Builder builder) {
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

    public static RecognizeIntentionResponseBody create() {
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

        private Builder(RecognizeIntentionResponseBody model) {
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

        public RecognizeIntentionResponseBody build() {
            return new RecognizeIntentionResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link RecognizeIntentionResponseBody} extends {@link TeaModel}
     *
     * <p>RecognizeIntentionResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysisProcess")
        private String analysisProcess;

        @com.aliyun.core.annotation.NameInMap("intentionCode")
        private String intentionCode;

        @com.aliyun.core.annotation.NameInMap("intentionName")
        private String intentionName;

        @com.aliyun.core.annotation.NameInMap("intentionScript")
        private String intentionScript;

        @com.aliyun.core.annotation.NameInMap("recommendIntention")
        private String recommendIntention;

        @com.aliyun.core.annotation.NameInMap("recommendScript")
        private String recommendScript;

        private Data(Builder builder) {
            this.analysisProcess = builder.analysisProcess;
            this.intentionCode = builder.intentionCode;
            this.intentionName = builder.intentionName;
            this.intentionScript = builder.intentionScript;
            this.recommendIntention = builder.recommendIntention;
            this.recommendScript = builder.recommendScript;
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
         * @return intentionCode
         */
        public String getIntentionCode() {
            return this.intentionCode;
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

        /**
         * @return recommendIntention
         */
        public String getRecommendIntention() {
            return this.recommendIntention;
        }

        /**
         * @return recommendScript
         */
        public String getRecommendScript() {
            return this.recommendScript;
        }

        public static final class Builder {
            private String analysisProcess; 
            private String intentionCode; 
            private String intentionName; 
            private String intentionScript; 
            private String recommendIntention; 
            private String recommendScript; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.analysisProcess = model.analysisProcess;
                this.intentionCode = model.intentionCode;
                this.intentionName = model.intentionName;
                this.intentionScript = model.intentionScript;
                this.recommendIntention = model.recommendIntention;
                this.recommendScript = model.recommendScript;
            } 

            /**
             * analysisProcess.
             */
            public Builder analysisProcess(String analysisProcess) {
                this.analysisProcess = analysisProcess;
                return this;
            }

            /**
             * intentionCode.
             */
            public Builder intentionCode(String intentionCode) {
                this.intentionCode = intentionCode;
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

            /**
             * recommendIntention.
             */
            public Builder recommendIntention(String recommendIntention) {
                this.recommendIntention = recommendIntention;
                return this;
            }

            /**
             * recommendScript.
             */
            public Builder recommendScript(String recommendScript) {
                this.recommendScript = recommendScript;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
