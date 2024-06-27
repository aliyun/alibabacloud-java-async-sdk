// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.xtee20210910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAnalysisConditionFavoriteListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAnalysisConditionFavoriteListResponseBody</p>
 */
public class DescribeAnalysisConditionFavoriteListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("resultObject")
    private java.util.List < ResultObject> resultObject;

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

        public DescribeAnalysisConditionFavoriteListResponseBody build() {
            return new DescribeAnalysisConditionFavoriteListResponseBody(this);
        } 

    } 

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

            /**
             * condition.
             */
            public Builder condition(String condition) {
                this.condition = condition;
                return this;
            }

            /**
             * eventBeginTime.
             */
            public Builder eventBeginTime(Long eventBeginTime) {
                this.eventBeginTime = eventBeginTime;
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
             * eventEndTime.
             */
            public Builder eventEndTime(Long eventEndTime) {
                this.eventEndTime = eventEndTime;
                return this;
            }

            /**
             * fieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * fieldValue.
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
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
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * type.
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
