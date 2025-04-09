// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

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
 * {@link DescribeIntentResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIntentResponseBody</p>
 */
public class DescribeIntentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Intent")
    private Intent intent;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DescribeIntentResponseBody(Builder builder) {
        this.code = builder.code;
        this.httpStatusCode = builder.httpStatusCode;
        this.intent = builder.intent;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIntentResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return intent
     */
    public Intent getIntent() {
        return this.intent;
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
        private String code; 
        private Integer httpStatusCode; 
        private Intent intent; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DescribeIntentResponseBody model) {
            this.code = model.code;
            this.httpStatusCode = model.httpStatusCode;
            this.intent = model.intent;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * Intent.
         */
        public Builder intent(Intent intent) {
            this.intent = intent;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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

        public DescribeIntentResponseBody build() {
            return new DescribeIntentResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeIntentResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeIntentResponseBody</p>
     */
    public static class Intent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("IntentDescription")
        private String intentDescription;

        @com.aliyun.core.annotation.NameInMap("IntentId")
        private String intentId;

        @com.aliyun.core.annotation.NameInMap("IntentName")
        private String intentName;

        @com.aliyun.core.annotation.NameInMap("Keywords")
        private String keywords;

        @com.aliyun.core.annotation.NameInMap("ScriptId")
        private String scriptId;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private Long updateTime;

        @com.aliyun.core.annotation.NameInMap("Utterances")
        private String utterances;

        private Intent(Builder builder) {
            this.createTime = builder.createTime;
            this.intentDescription = builder.intentDescription;
            this.intentId = builder.intentId;
            this.intentName = builder.intentName;
            this.keywords = builder.keywords;
            this.scriptId = builder.scriptId;
            this.updateTime = builder.updateTime;
            this.utterances = builder.utterances;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Intent create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return intentDescription
         */
        public String getIntentDescription() {
            return this.intentDescription;
        }

        /**
         * @return intentId
         */
        public String getIntentId() {
            return this.intentId;
        }

        /**
         * @return intentName
         */
        public String getIntentName() {
            return this.intentName;
        }

        /**
         * @return keywords
         */
        public String getKeywords() {
            return this.keywords;
        }

        /**
         * @return scriptId
         */
        public String getScriptId() {
            return this.scriptId;
        }

        /**
         * @return updateTime
         */
        public Long getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return utterances
         */
        public String getUtterances() {
            return this.utterances;
        }

        public static final class Builder {
            private Long createTime; 
            private String intentDescription; 
            private String intentId; 
            private String intentName; 
            private String keywords; 
            private String scriptId; 
            private Long updateTime; 
            private String utterances; 

            private Builder() {
            } 

            private Builder(Intent model) {
                this.createTime = model.createTime;
                this.intentDescription = model.intentDescription;
                this.intentId = model.intentId;
                this.intentName = model.intentName;
                this.keywords = model.keywords;
                this.scriptId = model.scriptId;
                this.updateTime = model.updateTime;
                this.utterances = model.utterances;
            } 

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * IntentDescription.
             */
            public Builder intentDescription(String intentDescription) {
                this.intentDescription = intentDescription;
                return this;
            }

            /**
             * IntentId.
             */
            public Builder intentId(String intentId) {
                this.intentId = intentId;
                return this;
            }

            /**
             * IntentName.
             */
            public Builder intentName(String intentName) {
                this.intentName = intentName;
                return this;
            }

            /**
             * Keywords.
             */
            public Builder keywords(String keywords) {
                this.keywords = keywords;
                return this;
            }

            /**
             * ScriptId.
             */
            public Builder scriptId(String scriptId) {
                this.scriptId = scriptId;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(Long updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * Utterances.
             */
            public Builder utterances(String utterances) {
                this.utterances = utterances;
                return this;
            }

            public Intent build() {
                return new Intent(this);
            } 

        } 

    }
}
