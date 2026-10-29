// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeCustomEventAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomEventAttributeResponseBody</p>
 */
public class DescribeCustomEventAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("CustomEvents")
    private CustomEvents customEvents;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    private DescribeCustomEventAttributeResponseBody(Builder builder) {
        this.code = builder.code;
        this.customEvents = builder.customEvents;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomEventAttributeResponseBody create() {
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
     * @return customEvents
     */
    public CustomEvents getCustomEvents() {
        return this.customEvents;
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
    public String getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private CustomEvents customEvents; 
        private String message; 
        private String requestId; 
        private String success; 

        private Builder() {
        } 

        private Builder(DescribeCustomEventAttributeResponseBody model) {
            this.code = model.code;
            this.customEvents = model.customEvents;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>The status code 200 indicates that the request was successful.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * CustomEvents.
         */
        public Builder customEvents(CustomEvents customEvents) {
            this.customEvents = customEvents;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>userId:173651113438**** and name:&quot;BABEL_CHECK&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>60912C8D-B340-4253-ADE7-61ACDFD25CFC</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values: Valid values:</p>
         * <ul>
         * <li><p>true</p>
         * </li>
         * <li><p>false</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        public DescribeCustomEventAttributeResponseBody build() {
            return new DescribeCustomEventAttributeResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCustomEventAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomEventAttributeResponseBody</p>
     */
    public static class CustomEvent extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("GroupId")
        private String groupId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private CustomEvent(Builder builder) {
            this.content = builder.content;
            this.groupId = builder.groupId;
            this.id = builder.id;
            this.name = builder.name;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomEvent create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return groupId
         */
        public String getGroupId() {
            return this.groupId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String content; 
            private String groupId; 
            private String id; 
            private String name; 
            private String time; 

            private Builder() {
            } 

            private Builder(CustomEvent model) {
                this.content = model.content;
                this.groupId = model.groupId;
                this.id = model.id;
                this.name = model.name;
                this.time = model.time;
            } 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * GroupId.
             */
            public Builder groupId(String groupId) {
                this.groupId = groupId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public CustomEvent build() {
                return new CustomEvent(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCustomEventAttributeResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCustomEventAttributeResponseBody</p>
     */
    public static class CustomEvents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CustomEvent")
        private java.util.List<CustomEvent> customEvent;

        private CustomEvents(Builder builder) {
            this.customEvent = builder.customEvent;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CustomEvents create() {
            return builder().build();
        }

        /**
         * @return customEvent
         */
        public java.util.List<CustomEvent> getCustomEvent() {
            return this.customEvent;
        }

        public static final class Builder {
            private java.util.List<CustomEvent> customEvent; 

            private Builder() {
            } 

            private Builder(CustomEvents model) {
                this.customEvent = model.customEvent;
            } 

            /**
             * CustomEvent.
             */
            public Builder customEvent(java.util.List<CustomEvent> customEvent) {
                this.customEvent = customEvent;
                return this;
            }

            public CustomEvents build() {
                return new CustomEvents(this);
            } 

        } 

    }
}
