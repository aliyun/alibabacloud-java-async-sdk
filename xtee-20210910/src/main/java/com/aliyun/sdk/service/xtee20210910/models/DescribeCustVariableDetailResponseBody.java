// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

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
 * {@link DescribeCustVariableDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustVariableDetailResponseBody</p>
 */
public class DescribeCustVariableDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    private DescribeCustVariableDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustVariableDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List<ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<ResultObject> resultObject; 

        private Builder() {
        } 

        private Builder(DescribeCustVariableDetailResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Return object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeCustVariableDetailResponseBody build() {
            return new DescribeCustVariableDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustVariableDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustVariableDetailResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("dataVersion")
        private Long dataVersion;

        @com.aliyun.core.annotation.NameInMap("description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("eventCodes")
        private String eventCodes;

        @com.aliyun.core.annotation.NameInMap("historyValueType")
        private String historyValueType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("outputs")
        private String outputs;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("timeType")
        private String timeType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("twCount")
        private String twCount;

        @com.aliyun.core.annotation.NameInMap("velocityFC")
        private String velocityFC;

        @com.aliyun.core.annotation.NameInMap("velocityTW")
        private String velocityTW;

        private ResultObject(Builder builder) {
            this.condition = builder.condition;
            this.dataVersion = builder.dataVersion;
            this.description = builder.description;
            this.eventCodes = builder.eventCodes;
            this.historyValueType = builder.historyValueType;
            this.id = builder.id;
            this.object = builder.object;
            this.outputs = builder.outputs;
            this.subject = builder.subject;
            this.timeType = builder.timeType;
            this.title = builder.title;
            this.twCount = builder.twCount;
            this.velocityFC = builder.velocityFC;
            this.velocityTW = builder.velocityTW;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResultObject create() {
            return builder().build();
        }

        /**
         * @return condition
         */
        public String getCondition() {
            return this.condition;
        }

        /**
         * @return dataVersion
         */
        public Long getDataVersion() {
            return this.dataVersion;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eventCodes
         */
        public String getEventCodes() {
            return this.eventCodes;
        }

        /**
         * @return historyValueType
         */
        public String getHistoryValueType() {
            return this.historyValueType;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return object
         */
        public String getObject() {
            return this.object;
        }

        /**
         * @return outputs
         */
        public String getOutputs() {
            return this.outputs;
        }

        /**
         * @return subject
         */
        public String getSubject() {
            return this.subject;
        }

        /**
         * @return timeType
         */
        public String getTimeType() {
            return this.timeType;
        }

        /**
         * @return title
         */
        public String getTitle() {
            return this.title;
        }

        /**
         * @return twCount
         */
        public String getTwCount() {
            return this.twCount;
        }

        /**
         * @return velocityFC
         */
        public String getVelocityFC() {
            return this.velocityFC;
        }

        /**
         * @return velocityTW
         */
        public String getVelocityTW() {
            return this.velocityTW;
        }

        public static final class Builder {
            private String condition; 
            private Long dataVersion; 
            private String description; 
            private String eventCodes; 
            private String historyValueType; 
            private Long id; 
            private String object; 
            private String outputs; 
            private String subject; 
            private String timeType; 
            private String title; 
            private String twCount; 
            private String velocityFC; 
            private String velocityTW; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.condition = model.condition;
                this.dataVersion = model.dataVersion;
                this.description = model.description;
                this.eventCodes = model.eventCodes;
                this.historyValueType = model.historyValueType;
                this.id = model.id;
                this.object = model.object;
                this.outputs = model.outputs;
                this.subject = model.subject;
                this.timeType = model.timeType;
                this.title = model.title;
                this.twCount = model.twCount;
                this.velocityFC = model.velocityFC;
                this.velocityTW = model.velocityTW;
            } 

            /**
             * <p>Condition value.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;currentId&quot;:1,&quot;deepCount&quot;:0,&quot;list&quot;:[{&quot;currentId&quot;:2,&quot;deepCount&quot;:1,&quot;left&quot;:{&quot;code&quot;:&quot;accountId&quot;,&quot;fieldType&quot;:&quot;STRING&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;hasRightVariable&quot;:false,&quot;name&quot;:&quot;accountId&quot;},&quot;operatorCode&quot;:&quot;isNotEmptyWrapper&quot;,&quot;parentId&quot;:1,&quot;right&quot;:{&quot;code&quot;:&quot;&quot;A\nB\nC&quot;&quot;,&quot;functionName&quot;:&quot;&quot;,&quot;name&quot;:&quot;&quot;,&quot;rightVariableType&quot;:&quot;constant&quot;}}],&quot;parentId&quot;:0,&quot;relationship&quot;:&quot;and&quot;}</p>
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * <p>Data version.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder dataVersion(Long dataVersion) {
                this.dataVersion = dataVersion;
                return this;
            }

            /**
             * <p>Description information.</p>
             * 
             * <strong>example:</strong>
             * <p>变量描述</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>Event code.</p>
             * 
             * <strong>example:</strong>
             * <p>de_ahespg8137</p>
             */
            public Builder eventCodes(String eventCodes) {
                this.eventCodes = eventCodes;
                return this;
            }

            /**
             * <p>Value type</p>
             * 
             * <strong>example:</strong>
             * <p>EARLIEST</p>
             */
            public Builder historyValueType(String historyValueType) {
                this.historyValueType = historyValueType;
                return this;
            }

            /**
             * <p>Primary key ID of the cumulative variable</p>
             * 
             * <strong>example:</strong>
             * <p>2793</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Cumulative object</p>
             * 
             * <strong>example:</strong>
             * <p>DEpage</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>Variable return type</p>
             * 
             * <strong>example:</strong>
             * <p>DOUBLE</p>
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * <p>Main object</p>
             * 
             * <strong>example:</strong>
             * <p>DEpname</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * <p>Time slice type</p>
             * 
             * <strong>example:</strong>
             * <p>NEAR</p>
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * <p>Title.</p>
             * 
             * <strong>example:</strong>
             * <p>累计变量求平均值</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Time count</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder twCount(String twCount) {
                this.twCount = twCount;
                return this;
            }

            /**
             * <p>Variable type</p>
             * 
             * <strong>example:</strong>
             * <p>DISTINCT</p>
             */
            public Builder velocityFC(String velocityFC) {
                this.velocityFC = velocityFC;
                return this;
            }

            /**
             * <p>Time slice unit</p>
             * 
             * <strong>example:</strong>
             * <p>HOUR_1</p>
             */
            public Builder velocityTW(String velocityTW) {
                this.velocityTW = velocityTW;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
