// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeEventsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeEventsResponseBody</p>
 */
public class DescribeEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Events")
    private Events events;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeEventsResponseBody(Builder builder) {
        this.code = builder.code;
        this.events = builder.events;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeEventsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return events
     */
    public Events getEvents() {
        return this.events;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private Events events; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Events.
         */
        public Builder events(Events events) {
            this.events = events;
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
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeEventsResponseBody build() {
            return new DescribeEventsResponseBody(this);
        } 

    } 

    public static class MsgParams extends TeaModel {
        @NameInMap("MsgParam")
        private java.util.List < String > msgParam;

        private MsgParams(Builder builder) {
            this.msgParam = builder.msgParam;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MsgParams create() {
            return builder().build();
        }

        /**
         * @return msgParam
         */
        public java.util.List < String > getMsgParam() {
            return this.msgParam;
        }

        public static final class Builder {
            private java.util.List < String > msgParam; 

            /**
             * MsgParam.
             */
            public Builder msgParam(java.util.List < String > msgParam) {
                this.msgParam = msgParam;
                return this;
            }

            public MsgParams build() {
                return new MsgParams(this);
            } 

        } 

    }
    public static class ObjectAttr extends TeaModel {
        @NameInMap("AttributeName")
        private String attributeName;

        @NameInMap("AttributeValue")
        private String attributeValue;

        private ObjectAttr(Builder builder) {
            this.attributeName = builder.attributeName;
            this.attributeValue = builder.attributeValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectAttr create() {
            return builder().build();
        }

        /**
         * @return attributeName
         */
        public String getAttributeName() {
            return this.attributeName;
        }

        /**
         * @return attributeValue
         */
        public String getAttributeValue() {
            return this.attributeValue;
        }

        public static final class Builder {
            private String attributeName; 
            private String attributeValue; 

            /**
             * AttributeName.
             */
            public Builder attributeName(String attributeName) {
                this.attributeName = attributeName;
                return this;
            }

            /**
             * AttributeValue.
             */
            public Builder attributeValue(String attributeValue) {
                this.attributeValue = attributeValue;
                return this;
            }

            public ObjectAttr build() {
                return new ObjectAttr(this);
            } 

        } 

    }
    public static class ObjectAttrs extends TeaModel {
        @NameInMap("ObjectAttr")
        private java.util.List < ObjectAttr> objectAttr;

        private ObjectAttrs(Builder builder) {
            this.objectAttr = builder.objectAttr;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ObjectAttrs create() {
            return builder().build();
        }

        /**
         * @return objectAttr
         */
        public java.util.List < ObjectAttr> getObjectAttr() {
            return this.objectAttr;
        }

        public static final class Builder {
            private java.util.List < ObjectAttr> objectAttr; 

            /**
             * ObjectAttr.
             */
            public Builder objectAttr(java.util.List < ObjectAttr> objectAttr) {
                this.objectAttr = objectAttr;
                return this;
            }

            public ObjectAttrs build() {
                return new ObjectAttrs(this);
            } 

        } 

    }
    public static class Event extends TeaModel {
        @NameInMap("AppId")
        private String appId;

        @NameInMap("EnvId")
        private String envId;

        @NameInMap("EnventName")
        private String enventName;

        @NameInMap("EventId")
        private String eventId;

        @NameInMap("EventLevel")
        private String eventLevel;

        @NameInMap("EventMessage")
        private String eventMessage;

        @NameInMap("EventTimestamp")
        private Long eventTimestamp;

        @NameInMap("MsgCode")
        private String msgCode;

        @NameInMap("MsgParams")
        private MsgParams msgParams;

        @NameInMap("ObjectAttrs")
        private ObjectAttrs objectAttrs;

        @NameInMap("ObjectId")
        private String objectId;

        @NameInMap("ObjectName")
        private String objectName;

        @NameInMap("ObjectType")
        private String objectType;

        @NameInMap("PrimaryUserId")
        private String primaryUserId;

        @NameInMap("PrimaryUserName")
        private String primaryUserName;

        @NameInMap("SecondUserId")
        private String secondUserId;

        @NameInMap("SecondUserName")
        private String secondUserName;

        @NameInMap("TraceId")
        private String traceId;

        private Event(Builder builder) {
            this.appId = builder.appId;
            this.envId = builder.envId;
            this.enventName = builder.enventName;
            this.eventId = builder.eventId;
            this.eventLevel = builder.eventLevel;
            this.eventMessage = builder.eventMessage;
            this.eventTimestamp = builder.eventTimestamp;
            this.msgCode = builder.msgCode;
            this.msgParams = builder.msgParams;
            this.objectAttrs = builder.objectAttrs;
            this.objectId = builder.objectId;
            this.objectName = builder.objectName;
            this.objectType = builder.objectType;
            this.primaryUserId = builder.primaryUserId;
            this.primaryUserName = builder.primaryUserName;
            this.secondUserId = builder.secondUserId;
            this.secondUserName = builder.secondUserName;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Event create() {
            return builder().build();
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return envId
         */
        public String getEnvId() {
            return this.envId;
        }

        /**
         * @return enventName
         */
        public String getEnventName() {
            return this.enventName;
        }

        /**
         * @return eventId
         */
        public String getEventId() {
            return this.eventId;
        }

        /**
         * @return eventLevel
         */
        public String getEventLevel() {
            return this.eventLevel;
        }

        /**
         * @return eventMessage
         */
        public String getEventMessage() {
            return this.eventMessage;
        }

        /**
         * @return eventTimestamp
         */
        public Long getEventTimestamp() {
            return this.eventTimestamp;
        }

        /**
         * @return msgCode
         */
        public String getMsgCode() {
            return this.msgCode;
        }

        /**
         * @return msgParams
         */
        public MsgParams getMsgParams() {
            return this.msgParams;
        }

        /**
         * @return objectAttrs
         */
        public ObjectAttrs getObjectAttrs() {
            return this.objectAttrs;
        }

        /**
         * @return objectId
         */
        public String getObjectId() {
            return this.objectId;
        }

        /**
         * @return objectName
         */
        public String getObjectName() {
            return this.objectName;
        }

        /**
         * @return objectType
         */
        public String getObjectType() {
            return this.objectType;
        }

        /**
         * @return primaryUserId
         */
        public String getPrimaryUserId() {
            return this.primaryUserId;
        }

        /**
         * @return primaryUserName
         */
        public String getPrimaryUserName() {
            return this.primaryUserName;
        }

        /**
         * @return secondUserId
         */
        public String getSecondUserId() {
            return this.secondUserId;
        }

        /**
         * @return secondUserName
         */
        public String getSecondUserName() {
            return this.secondUserName;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String appId; 
            private String envId; 
            private String enventName; 
            private String eventId; 
            private String eventLevel; 
            private String eventMessage; 
            private Long eventTimestamp; 
            private String msgCode; 
            private MsgParams msgParams; 
            private ObjectAttrs objectAttrs; 
            private String objectId; 
            private String objectName; 
            private String objectType; 
            private String primaryUserId; 
            private String primaryUserName; 
            private String secondUserId; 
            private String secondUserName; 
            private String traceId; 

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * EnvId.
             */
            public Builder envId(String envId) {
                this.envId = envId;
                return this;
            }

            /**
             * EnventName.
             */
            public Builder enventName(String enventName) {
                this.enventName = enventName;
                return this;
            }

            /**
             * EventId.
             */
            public Builder eventId(String eventId) {
                this.eventId = eventId;
                return this;
            }

            /**
             * EventLevel.
             */
            public Builder eventLevel(String eventLevel) {
                this.eventLevel = eventLevel;
                return this;
            }

            /**
             * EventMessage.
             */
            public Builder eventMessage(String eventMessage) {
                this.eventMessage = eventMessage;
                return this;
            }

            /**
             * EventTimestamp.
             */
            public Builder eventTimestamp(Long eventTimestamp) {
                this.eventTimestamp = eventTimestamp;
                return this;
            }

            /**
             * MsgCode.
             */
            public Builder msgCode(String msgCode) {
                this.msgCode = msgCode;
                return this;
            }

            /**
             * MsgParams.
             */
            public Builder msgParams(MsgParams msgParams) {
                this.msgParams = msgParams;
                return this;
            }

            /**
             * ObjectAttrs.
             */
            public Builder objectAttrs(ObjectAttrs objectAttrs) {
                this.objectAttrs = objectAttrs;
                return this;
            }

            /**
             * ObjectId.
             */
            public Builder objectId(String objectId) {
                this.objectId = objectId;
                return this;
            }

            /**
             * ObjectName.
             */
            public Builder objectName(String objectName) {
                this.objectName = objectName;
                return this;
            }

            /**
             * ObjectType.
             */
            public Builder objectType(String objectType) {
                this.objectType = objectType;
                return this;
            }

            /**
             * PrimaryUserId.
             */
            public Builder primaryUserId(String primaryUserId) {
                this.primaryUserId = primaryUserId;
                return this;
            }

            /**
             * PrimaryUserName.
             */
            public Builder primaryUserName(String primaryUserName) {
                this.primaryUserName = primaryUserName;
                return this;
            }

            /**
             * SecondUserId.
             */
            public Builder secondUserId(String secondUserId) {
                this.secondUserId = secondUserId;
                return this;
            }

            /**
             * SecondUserName.
             */
            public Builder secondUserName(String secondUserName) {
                this.secondUserName = secondUserName;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public Event build() {
                return new Event(this);
            } 

        } 

    }
    public static class Events extends TeaModel {
        @NameInMap("Event")
        private java.util.List < Event> event;

        private Events(Builder builder) {
            this.event = builder.event;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Events create() {
            return builder().build();
        }

        /**
         * @return event
         */
        public java.util.List < Event> getEvent() {
            return this.event;
        }

        public static final class Builder {
            private java.util.List < Event> event; 

            /**
             * Event.
             */
            public Builder event(java.util.List < Event> event) {
                this.event = event;
                return this;
            }

            public Events build() {
                return new Events(this);
            } 

        } 

    }
}
