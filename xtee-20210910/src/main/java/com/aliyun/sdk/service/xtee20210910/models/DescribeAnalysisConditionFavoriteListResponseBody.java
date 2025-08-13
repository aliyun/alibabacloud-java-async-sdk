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
 * {@link DescribeAnalysisConditionFavoriteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnalysisConditionFavoriteListResponseBody</p>
 */
public class DescribeAnalysisConditionFavoriteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List<ResultObject> resultObject;

    private DescribeAnalysisConditionFavoriteListResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.resultObject = builder.resultObject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAnalysisConditionFavoriteListResponseBody create() {
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

        private Builder(DescribeAnalysisConditionFavoriteListResponseBody model) {
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
         * <p>Returned object</p>
         */
        public Builder resultObject(java.util.List<ResultObject> resultObject) {
            this.resultObject = resultObject;
            return this;
        }

        public DescribeAnalysisConditionFavoriteListResponseBody build() {
            return new DescribeAnalysisConditionFavoriteListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAnalysisConditionFavoriteListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAnalysisConditionFavoriteListResponseBody</p>
     */
    public static class ResultObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("condition")
        private String condition;

        @com.aliyun.core.annotation.NameInMap("eventBeginTime")
        private Long eventBeginTime;

        @com.aliyun.core.annotation.NameInMap("eventCodes")
        private String eventCodes;

        @com.aliyun.core.annotation.NameInMap("eventEndTime")
        private Long eventEndTime;

        @com.aliyun.core.annotation.NameInMap("fieldName")
        private String fieldName;

        @com.aliyun.core.annotation.NameInMap("fieldValue")
        private String fieldValue;

        @com.aliyun.core.annotation.NameInMap("id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private ResultObject(Builder builder) {
            this.condition = builder.condition;
            this.eventBeginTime = builder.eventBeginTime;
            this.eventCodes = builder.eventCodes;
            this.eventEndTime = builder.eventEndTime;
            this.fieldName = builder.fieldName;
            this.fieldValue = builder.fieldValue;
            this.id = builder.id;
            this.name = builder.name;
            this.type = builder.type;
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
         * @return eventBeginTime
         */
        public Long getEventBeginTime() {
            return this.eventBeginTime;
        }

        /**
         * @return eventCodes
         */
        public String getEventCodes() {
            return this.eventCodes;
        }

        /**
         * @return eventEndTime
         */
        public Long getEventEndTime() {
            return this.eventEndTime;
        }

        /**
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String condition; 
            private Long eventBeginTime; 
            private String eventCodes; 
            private Long eventEndTime; 
            private String fieldName; 
            private String fieldValue; 
            private Long id; 
            private String name; 
            private String type; 

            private Builder() {
            } 

            private Builder(ResultObject model) {
                this.condition = model.condition;
                this.eventBeginTime = model.eventBeginTime;
                this.eventCodes = model.eventCodes;
                this.eventEndTime = model.eventEndTime;
                this.fieldName = model.fieldName;
                this.fieldValue = model.fieldValue;
                this.id = model.id;
                this.name = model.name;
                this.type = model.type;
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
             * <p>Event start timestamp.</p>
             * 
             * <strong>example:</strong>
             * <p>1752076800000</p>
             */
            public Builder eventBeginTime(Long eventBeginTime) {
                this.eventBeginTime = eventBeginTime;
                return this;
            }

            /**
             * <p>Event codes.</p>
             * 
             * <strong>example:</strong>
             * <p>de_ahespg8137</p>
             */
            public Builder eventCodes(String eventCodes) {
                this.eventCodes = eventCodes;
                return this;
            }

            /**
             * <p>Event end time.</p>
             * 
             * <strong>example:</strong>
             * <p>1753891199000</p>
             */
            public Builder eventEndTime(Long eventEndTime) {
                this.eventEndTime = eventEndTime;
                return this;
            }

            /**
             * <p>Field name.</p>
             * 
             * <strong>example:</strong>
             * <p>age</p>
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * <p>Field value.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
                return this;
            }

            /**
             * <p>Primary key ID</p>
             * 
             * <strong>example:</strong>
             * <p>497</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Condition name</p>
             * 
             * <strong>example:</strong>
             * <p>查询条件1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>Type, BASIC: Basic query, ADVANCE: Advanced query, BATCH: Batch query</p>
             * 
             * <strong>example:</strong>
             * <p>BASIC</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public ResultObject build() {
                return new ResultObject(this);
            } 

        } 

    }
}
