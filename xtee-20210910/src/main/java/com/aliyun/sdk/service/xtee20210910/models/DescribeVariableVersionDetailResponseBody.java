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
 * {@link DescribeVariableVersionDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeVariableVersionDetailResponseBody</p>
 */
public class DescribeVariableVersionDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private ResultObject resultObject;

    private DescribeVariableVersionDetailResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeVariableVersionDetailResponseBody create() {
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
    public ResultObject getResultObject() {
        return this.resultObject;
    }

    public static final class Builder {
        private String requestId; 
        private ResultObject resultObject; 

        private Builder() {
        } 

        private Builder(DescribeVariableVersionDetailResponseBody model) {
            this.requestId = model.requestId;
            this.resultObject = model.resultObject;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Returned object.</p>
         */
        public Builder resultObject(ResultObject resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeVariableVersionDetailResponseBody build() {
            return new DescribeVariableVersionDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeVariableVersionDetailResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeVariableVersionDetailResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("global")
        private Boolean global;

        @com.aliyun.core.annotation.NameInMap("historyValueType")
        private String historyValueType;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("object")
        private String object;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("subject")
        private String subject;

        @com.aliyun.core.annotation.NameInMap("timeType")
        private String timeType;

        @com.aliyun.core.annotation.NameInMap("title")
        private String title;

        @com.aliyun.core.annotation.NameInMap("topN")
        private Long topN;

        @com.aliyun.core.annotation.NameInMap("twCount")
        private Long twCount;

        @com.aliyun.core.annotation.NameInMap("velocityFC")
        private String velocityFC;

        @com.aliyun.core.annotation.NameInMap("velocityTW")
        private String velocityTW;

        private ResultObject(Builder builder) {
            this.condition = builder.condition;
            this.dataVersion = builder.dataVersion;
            this.description = builder.description;
            this.eventCodes = builder.eventCodes;
            this.global = builder.global;
            this.historyValueType = builder.historyValueType;
            this.id = builder.id;
            this.object = builder.object;
            this.status = builder.status;
            this.subject = builder.subject;
            this.timeType = builder.timeType;
            this.title = builder.title;
            this.topN = builder.topN;
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
         * @return global
         */
        public Boolean getGlobal() {
            return this.global;
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
         * @return status
         */
        public String getStatus() {
            return this.status;
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
         * @return topN
         */
        public Long getTopN() {
            return this.topN;
        }

        /**
         * @return twCount
         */
        public Long getTwCount() {
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
            private Boolean global; 
            private String historyValueType; 
            private Long id; 
            private String object; 
            private String status; 
            private String subject; 
            private String timeType; 
            private String title; 
            private Long topN; 
            private Long twCount; 
            private String velocityFC; 
            private String velocityTW; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.condition = model.condition;
                this.dataVersion = model.dataVersion;
                this.description = model.description;
                this.eventCodes = model.eventCodes;
                this.global = model.global;
                this.historyValueType = model.historyValueType;
                this.id = model.id;
                this.object = model.object;
                this.status = model.status;
                this.subject = model.subject;
                this.timeType = model.timeType;
                this.title = model.title;
                this.topN = model.topN;
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
             * <p>Variable description information.</p>
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
             * <p>de_awkhwh0314</p>
             */
            public Builder eventCodes(String eventCodes) {
                this.eventCodes = eventCodes;
                return this;
            }

            /**
             * <p>Global cumulative. Not currently available externally.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder global(Boolean global) {
                this.global = global;
                return this;
            }

            /**
             * <p>Historical value parameter type.</p>
             * 
             * <strong>example:</strong>
             * <p>COUNT</p>
             */
            public Builder historyValueType(String historyValueType) {
                this.historyValueType = historyValueType;
                return this;
            }

            /**
             * <p>Primary key ID of the version.</p>
             * 
             * <strong>example:</strong>
             * <p>3434</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Subordinate attribute (single selection, sourced from the event attribute list code).</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder object(String object) {
                this.object = object;
                return this;
            }

            /**
             * <p>Status.</p>
             * 
             * <strong>example:</strong>
             * <p>ENABLE</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>Main attribute (multiple separated by commas, up to 5, sourced from the event attribute list code).</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder subject(String subject) {
                this.subject = subject;
                return this;
            }

            /**
             * <p>Time slice type.</p>
             * 
             * <strong>example:</strong>
             * <p>CURRENT</p>
             */
            public Builder timeType(String timeType) {
                this.timeType = timeType;
                return this;
            }

            /**
             * <p>Title.</p>
             * 
             * <strong>example:</strong>
             * <p>累计个数</p>
             */
            public Builder title(String title) {
                this.title = title;
                return this;
            }

            /**
             * <p>Top N.</p>
             * 
             * <strong>example:</strong>
             * <p>topN累计</p>
             */
            public Builder topN(Long topN) {
                this.topN = topN;
                return this;
            }

            /**
             * <p>Number of time slices.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder twCount(Long twCount) {
                this.twCount = twCount;
                return this;
            }

            /**
             * <p>Cumulative indicator processing function.</p>
             * 
             * <strong>example:</strong>
             * <p>COUNT</p>
             */
            public Builder velocityFC(String velocityFC) {
                this.velocityFC = velocityFC;
                return this;
            }

            /**
             * <p>Cumulative indicator time window.</p>
             * 
             * <strong>example:</strong>
             * <p>MONTH_1</p>
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
