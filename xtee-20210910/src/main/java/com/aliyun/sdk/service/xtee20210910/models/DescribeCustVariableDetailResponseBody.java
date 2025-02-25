// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustVariableDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustVariableDetailResponseBody</p>
 */
public class DescribeCustVariableDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

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

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return resultObject
     */
    public java.util.List < ResultObject> getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < ResultObject> resultObject; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * resultObject.
         */
        public Builder resultObject(java.util.List < ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeCustVariableDetailResponseBody build() {
            return new DescribeCustVariableDetailResponseBody(this);
        } 

    } 

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

            /**
             * condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * dataVersion.
             */
            public Builder dataVersion(Long dataVersion) {
                this.dataVersion = dataVersion;
                return this;
            }

            /**
             * description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * eventCodes.
             */
            public Builder eventCodes(String eventCodes) {
                this.eventCodes = eventCodes;
                return this;
            }

            /**
             * historyValueType.
             */
            public Builder historyValueType(String historyValueType) {
                this.historyValueType = historyValueType;
                return this;
            }

            /**
             * id.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * object.
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * outputs.
             */
            public Builder outputs(String outputs) {
                this.outputs = outputs;
                return this;
            }

            /**
             * subject.
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * timeType.
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * title.
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * twCount.
             */
            public Builder twCount(String twCount) {
                this.twCount = twCount;
                return this;
            }

            /**
             * velocityFC.
             */
            public Builder velocityFC(String velocityFC) {
                this.velocityFC = velocityFC;
                return this;
            }

            /**
             * velocityTW.
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
