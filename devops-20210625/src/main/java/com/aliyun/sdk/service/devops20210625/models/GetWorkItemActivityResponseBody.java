// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWorkItemActivityResponseBody} extends {@link TeaModel}
 *
 * <p>GetWorkItemActivityResponseBody</p>
 */
public class GetWorkItemActivityResponseBody extends TeaModel {
    @NameInMap("activities")
    private java.util.List < Activities> activities;

    @NameInMap("errorCode")
    private String errorCode;

    @NameInMap("errorMsg")
    private String errorMsg;

    @NameInMap("requestId")
    private String requestId;

    @NameInMap("success")
    private Boolean success;

    private GetWorkItemActivityResponseBody(Builder builder) {
        this.activities = builder.activities;
        this.errorCode = builder.errorCode;
        this.errorMsg = builder.errorMsg;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkItemActivityResponseBody create() {
        return builder().build();
    }

    /**
     * @return activities
     */
    public java.util.List < Activities> getActivities() {
        return this.activities;
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMsg
     */
    public String getErrorMsg() {
        return this.errorMsg;
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
        private java.util.List < Activities> activities; 
        private String errorCode; 
        private String errorMsg; 
        private String requestId; 
        private Boolean success; 

        /**
         * 动态信息
         */
        public Builder activities(java.util.List < Activities> activities) {
            this.activities = activities;
            return this;
        }

        /**
         * 错误码
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * 错误信息
         */
        public Builder errorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }

        /**
         * 请求id，每次请求都是唯一值，便于后续排查问题
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * true或者false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetWorkItemActivityResponseBody build() {
            return new GetWorkItemActivityResponseBody(this);
        } 

    } 

    public static class NewValue extends TeaModel {
        @NameInMap("displayValue")
        private String displayValue;

        @NameInMap("plainValue")
        private String plainValue;

        @NameInMap("resourceType")
        private String resourceType;

        private NewValue(Builder builder) {
            this.displayValue = builder.displayValue;
            this.plainValue = builder.plainValue;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NewValue create() {
            return builder().build();
        }

        /**
         * @return displayValue
         */
        public String getDisplayValue() {
            return this.displayValue;
        }

        /**
         * @return plainValue
         */
        public String getPlainValue() {
            return this.plainValue;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String displayValue; 
            private String plainValue; 
            private String resourceType; 

            /**
             * displayValue.
             */
            public Builder displayValue(String displayValue) {
                this.displayValue = displayValue;
                return this;
            }

            /**
             * plainValue.
             */
            public Builder plainValue(String plainValue) {
                this.plainValue = plainValue;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public NewValue build() {
                return new NewValue(this);
            } 

        } 

    }
    public static class OldValue extends TeaModel {
        @NameInMap("displayValue")
        private String displayValue;

        @NameInMap("plainValue")
        private String plainValue;

        @NameInMap("resourceType")
        private String resourceType;

        private OldValue(Builder builder) {
            this.displayValue = builder.displayValue;
            this.plainValue = builder.plainValue;
            this.resourceType = builder.resourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OldValue create() {
            return builder().build();
        }

        /**
         * @return displayValue
         */
        public String getDisplayValue() {
            return this.displayValue;
        }

        /**
         * @return plainValue
         */
        public String getPlainValue() {
            return this.plainValue;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        public static final class Builder {
            private String displayValue; 
            private String plainValue; 
            private String resourceType; 

            /**
             * displayValue.
             */
            public Builder displayValue(String displayValue) {
                this.displayValue = displayValue;
                return this;
            }

            /**
             * plainValue.
             */
            public Builder plainValue(String plainValue) {
                this.plainValue = plainValue;
                return this;
            }

            /**
             * resourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            public OldValue build() {
                return new OldValue(this);
            } 

        } 

    }
    public static class Property extends TeaModel {
        @NameInMap("displayName")
        private String displayName;

        @NameInMap("propertyIdentifier")
        private String propertyIdentifier;

        @NameInMap("propertyName")
        private String propertyName;

        @NameInMap("propertyType")
        private String propertyType;

        private Property(Builder builder) {
            this.displayName = builder.displayName;
            this.propertyIdentifier = builder.propertyIdentifier;
            this.propertyName = builder.propertyName;
            this.propertyType = builder.propertyType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Property create() {
            return builder().build();
        }

        /**
         * @return displayName
         */
        public String getDisplayName() {
            return this.displayName;
        }

        /**
         * @return propertyIdentifier
         */
        public String getPropertyIdentifier() {
            return this.propertyIdentifier;
        }

        /**
         * @return propertyName
         */
        public String getPropertyName() {
            return this.propertyName;
        }

        /**
         * @return propertyType
         */
        public String getPropertyType() {
            return this.propertyType;
        }

        public static final class Builder {
            private String displayName; 
            private String propertyIdentifier; 
            private String propertyName; 
            private String propertyType; 

            /**
             * 属性的展示名
             */
            public Builder displayName(String displayName) {
                this.displayName = displayName;
                return this;
            }

            /**
             * 资源id
             */
            public Builder propertyIdentifier(String propertyIdentifier) {
                this.propertyIdentifier = propertyIdentifier;
                return this;
            }

            /**
             * 属性key
             */
            public Builder propertyName(String propertyName) {
                this.propertyName = propertyName;
                return this;
            }

            /**
             * 类型
             */
            public Builder propertyType(String propertyType) {
                this.propertyType = propertyType;
                return this;
            }

            public Property build() {
                return new Property(this);
            } 

        } 

    }
    public static class Activities extends TeaModel {
        @NameInMap("actionType")
        private String actionType;

        @NameInMap("eventId")
        private Long eventId;

        @NameInMap("eventTime")
        private Long eventTime;

        @NameInMap("eventType")
        private String eventType;

        @NameInMap("newValue")
        private java.util.List < NewValue> newValue;

        @NameInMap("oldValue")
        private java.util.List < OldValue> oldValue;

        @NameInMap("operator")
        private String operator;

        @NameInMap("parentEventId")
        private Long parentEventId;

        @NameInMap("property")
        private Property property;

        @NameInMap("resourceIdentifier")
        private String resourceIdentifier;

        private Activities(Builder builder) {
            this.actionType = builder.actionType;
            this.eventId = builder.eventId;
            this.eventTime = builder.eventTime;
            this.eventType = builder.eventType;
            this.newValue = builder.newValue;
            this.oldValue = builder.oldValue;
            this.operator = builder.operator;
            this.parentEventId = builder.parentEventId;
            this.property = builder.property;
            this.resourceIdentifier = builder.resourceIdentifier;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Activities create() {
            return builder().build();
        }

        /**
         * @return actionType
         */
        public String getActionType() {
            return this.actionType;
        }

        /**
         * @return eventId
         */
        public Long getEventId() {
            return this.eventId;
        }

        /**
         * @return eventTime
         */
        public Long getEventTime() {
            return this.eventTime;
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return newValue
         */
        public java.util.List < NewValue> getNewValue() {
            return this.newValue;
        }

        /**
         * @return oldValue
         */
        public java.util.List < OldValue> getOldValue() {
            return this.oldValue;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return parentEventId
         */
        public Long getParentEventId() {
            return this.parentEventId;
        }

        /**
         * @return property
         */
        public Property getProperty() {
            return this.property;
        }

        /**
         * @return resourceIdentifier
         */
        public String getResourceIdentifier() {
            return this.resourceIdentifier;
        }

        public static final class Builder {
            private String actionType; 
            private Long eventId; 
            private Long eventTime; 
            private String eventType; 
            private java.util.List < NewValue> newValue; 
            private java.util.List < OldValue> oldValue; 
            private String operator; 
            private Long parentEventId; 
            private Property property; 
            private String resourceIdentifier; 

            /**
             * 动作类型
             */
            public Builder actionType(String actionType) {
                this.actionType = actionType;
                return this;
            }

            /**
             * 事件id
             */
            public Builder eventId(Long eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * 事件时间
             */
            public Builder eventTime(Long eventTime) {
                this.eventTime = eventTime;
                return this;
            }

            /**
             * 事件类型
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * newValue.
             */
            public Builder newValue(java.util.List < NewValue> newValue) {
                this.newValue = newValue;
                return this;
            }

            /**
             * oldValue.
             */
            public Builder oldValue(java.util.List < OldValue> oldValue) {
                this.oldValue = oldValue;
                return this;
            }

            /**
             * 操作者
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * 父事件id
             */
            public Builder parentEventId(Long parentEventId) {
                this.parentEventId = parentEventId;
                return this;
            }

            /**
             * 修改属性
             */
            public Builder property(Property property) {
                this.property = property;
                return this;
            }

            /**
             * 操作对象
             */
            public Builder resourceIdentifier(String resourceIdentifier) {
                this.resourceIdentifier = resourceIdentifier;
                return this;
            }

            public Activities build() {
                return new Activities(this);
            } 

        } 

    }
}
