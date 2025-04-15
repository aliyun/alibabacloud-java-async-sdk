// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eventbridge20200401.models;

import com.aliyun.sdk.gateway.eventbridge.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.eventbridge.models.*;

/**
 * 
 * {@link ListAliyunOfficialEventSourcesResponseBody} extends {@link TeaModel}
 *
 * <p>ListAliyunOfficialEventSourcesResponseBody</p>
 */
public class ListAliyunOfficialEventSourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ListAliyunOfficialEventSourcesResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAliyunOfficialEventSourcesResponseBody create() {
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
     * @return data
     */
    public Data getData() {
        return this.data;
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
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(ListAliyunOfficialEventSourcesResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The response code. The value Success indicates that the request is successful. Other values indicate that the request failed. For a list of error codes, see Error codes.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned error message.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidArgument</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5f80e9b3-98d5-4f51-8412-c758818a03e4</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the operation is successful. If the operation is successful, the value true is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ListAliyunOfficialEventSourcesResponseBody build() {
            return new ListAliyunOfficialEventSourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAliyunOfficialEventSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAliyunOfficialEventSourcesResponseBody</p>
     */
    public static class EventTypes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventSourceName")
        private String eventSourceName;

        @com.aliyun.core.annotation.NameInMap("GroupName")
        private String groupName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ShortName")
        private String shortName;

        private EventTypes(Builder builder) {
            this.eventSourceName = builder.eventSourceName;
            this.groupName = builder.groupName;
            this.name = builder.name;
            this.shortName = builder.shortName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventTypes create() {
            return builder().build();
        }

        /**
         * @return eventSourceName
         */
        public String getEventSourceName() {
            return this.eventSourceName;
        }

        /**
         * @return groupName
         */
        public String getGroupName() {
            return this.groupName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return shortName
         */
        public String getShortName() {
            return this.shortName;
        }

        public static final class Builder {
            private String eventSourceName; 
            private String groupName; 
            private String name; 
            private String shortName; 

            private Builder() {
            } 

            private Builder(EventTypes model) {
                this.eventSourceName = model.eventSourceName;
                this.groupName = model.groupName;
                this.name = model.name;
                this.shortName = model.shortName;
            } 

            /**
             * <p>The name of the event source.</p>
             * 
             * <strong>example:</strong>
             * <p>name</p>
             */
            public Builder eventSourceName(String eventSourceName) {
                this.eventSourceName = eventSourceName;
                return this;
            }

            /**
             * <p>The name of the group to which the event type belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyuncvc:MeetingEvent</p>
             */
            public Builder groupName(String groupName) {
                this.groupName = groupName;
                return this;
            }

            /**
             * <p>The full name of the event type.</p>
             * 
             * <strong>example:</strong>
             * <p>aliyuncvc:MeetingEvent:MeetingStateEvent</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The short name of the event type.</p>
             * 
             * <strong>example:</strong>
             * <p>MeetingStateEvent</p>
             */
            public Builder shortName(String shortName) {
                this.shortName = shortName;
                return this;
            }

            public EventTypes build() {
                return new EventTypes(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAliyunOfficialEventSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAliyunOfficialEventSourcesResponseBody</p>
     */
    public static class EventSourceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Arn")
        private String arn;

        @com.aliyun.core.annotation.NameInMap("Ctime")
        private Float ctime;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EventBusName")
        private String eventBusName;

        @com.aliyun.core.annotation.NameInMap("EventTypes")
        private java.util.List<EventTypes> eventTypes;

        @com.aliyun.core.annotation.NameInMap("FullName")
        private String fullName;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private EventSourceList(Builder builder) {
            this.arn = builder.arn;
            this.ctime = builder.ctime;
            this.description = builder.description;
            this.eventBusName = builder.eventBusName;
            this.eventTypes = builder.eventTypes;
            this.fullName = builder.fullName;
            this.name = builder.name;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventSourceList create() {
            return builder().build();
        }

        /**
         * @return arn
         */
        public String getArn() {
            return this.arn;
        }

        /**
         * @return ctime
         */
        public Float getCtime() {
            return this.ctime;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return eventBusName
         */
        public String getEventBusName() {
            return this.eventBusName;
        }

        /**
         * @return eventTypes
         */
        public java.util.List<EventTypes> getEventTypes() {
            return this.eventTypes;
        }

        /**
         * @return fullName
         */
        public String getFullName() {
            return this.fullName;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String arn; 
            private Float ctime; 
            private String description; 
            private String eventBusName; 
            private java.util.List<EventTypes> eventTypes; 
            private String fullName; 
            private String name; 
            private String status; 
            private String type; 

            private Builder() {
            } 

            private Builder(EventSourceList model) {
                this.arn = model.arn;
                this.ctime = model.ctime;
                this.description = model.description;
                this.eventBusName = model.eventBusName;
                this.eventTypes = model.eventTypes;
                this.fullName = model.fullName;
                this.name = model.name;
                this.status = model.status;
                this.type = model.type;
            } 

            /**
             * <p>The Alibaba Cloud Resource Name (ARN) of the event bus.</p>
             * 
             * <strong>example:</strong>
             * <p>acs:eventbridge:cn-hangzhou:SYSTEM:eventsource/acs.aliyuncvc</p>
             */
            public Builder arn(String arn) {
                this.arn = arn;
                return this;
            }

            /**
             * <p>The time when the event source was created. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1607071602000</p>
             */
            public Builder ctime(Float ctime) {
                this.ctime = ctime;
                return this;
            }

            /**
             * <p>The description of the event source.</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The name of the event source to which the event type belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>acs.aliyuncvc</p>
             */
            public Builder eventBusName(String eventBusName) {
                this.eventBusName = eventBusName;
                return this;
            }

            /**
             * <p>The event types.</p>
             */
            public Builder eventTypes(java.util.List<EventTypes> eventTypes) {
                this.eventTypes = eventTypes;
                return this;
            }

            /**
             * <p>The full name of the event source.</p>
             * 
             * <strong>example:</strong>
             * <p>E-MapReduce</p>
             */
            public Builder fullName(String fullName) {
                this.fullName = fullName;
                return this;
            }

            /**
             * <p>The name of the event source.</p>
             * 
             * <strong>example:</strong>
             * <p>acs.aliyuncvc</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The status of the event source. Valid value: Activated.</p>
             * 
             * <strong>example:</strong>
             * <p>Activated</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the event source.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EventSourceList build() {
                return new EventSourceList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAliyunOfficialEventSourcesResponseBody} extends {@link TeaModel}
     *
     * <p>ListAliyunOfficialEventSourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventSourceList")
        private java.util.List<EventSourceList> eventSourceList;

        private Data(Builder builder) {
            this.eventSourceList = builder.eventSourceList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return eventSourceList
         */
        public java.util.List<EventSourceList> getEventSourceList() {
            return this.eventSourceList;
        }

        public static final class Builder {
            private java.util.List<EventSourceList> eventSourceList; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.eventSourceList = model.eventSourceList;
            } 

            /**
             * <p>The event sources.</p>
             */
            public Builder eventSourceList(java.util.List<EventSourceList> eventSourceList) {
                this.eventSourceList = eventSourceList;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
