// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudfw20171207.models;

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
 * {@link DescribeInvadeEventNameListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInvadeEventNameListResponseBody</p>
 */
public class DescribeInvadeEventNameListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("EventNameList")
    private java.util.List<EventNameList> eventNameList;

    @com.aliyun.core.annotation.NameInMap("NameList")
    private java.util.List<String> nameList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInvadeEventNameListResponseBody(Builder builder) {
        this.eventNameList = builder.eventNameList;
        this.nameList = builder.nameList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInvadeEventNameListResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return eventNameList
     */
    public java.util.List<EventNameList> getEventNameList() {
        return this.eventNameList;
    }

    /**
     * @return nameList
     */
    public java.util.List<String> getNameList() {
        return this.nameList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<EventNameList> eventNameList; 
        private java.util.List<String> nameList; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeInvadeEventNameListResponseBody model) {
            this.eventNameList = model.eventNameList;
            this.nameList = model.nameList;
            this.requestId = model.requestId;
        } 

        /**
         * <p>A list of anomalous activity names.</p>
         */
        public Builder eventNameList(java.util.List<EventNameList> eventNameList) {
            this.eventNameList = eventNameList;
            return this;
        }

        /**
         * <p>A list of vulnerability names.</p>
         */
        public Builder nameList(java.util.List<String> nameList) {
            this.nameList = nameList;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6ABAA264-E7B5-5D66-8FC3-9253100****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInvadeEventNameListResponseBody build() {
            return new DescribeInvadeEventNameListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeInvadeEventNameListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeInvadeEventNameListResponseBody</p>
     */
    public static class EventNameList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventKey")
        private String eventKey;

        @com.aliyun.core.annotation.NameInMap("EventName")
        private String eventName;

        private EventNameList(Builder builder) {
            this.eventKey = builder.eventKey;
            this.eventName = builder.eventName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventNameList create() {
            return builder().build();
        }

        /**
         * @return eventKey
         */
        public String getEventKey() {
            return this.eventKey;
        }

        /**
         * @return eventName
         */
        public String getEventName() {
            return this.eventName;
        }

        public static final class Builder {
            private String eventKey; 
            private String eventName; 

            private Builder() {
            } 

            private Builder(EventNameList model) {
                this.eventKey = model.eventKey;
                this.eventName = model.eventName;
            } 

            /**
             * <p>The unique identifier of the vulnerability event.</p>
             * 
             * <strong>example:</strong>
             * <p>CActivity</p>
             */
            public Builder eventKey(String eventKey) {
                this.eventKey = eventKey;
                return this;
            }

            /**
             * <p>The name of the vulnerability event.</p>
             * 
             * <strong>example:</strong>
             * <p>Suspicious central control communication</p>
             */
            public Builder eventName(String eventName) {
                this.eventName = eventName;
                return this;
            }

            public EventNameList build() {
                return new EventNameList(this);
            } 

        } 

    }
}
