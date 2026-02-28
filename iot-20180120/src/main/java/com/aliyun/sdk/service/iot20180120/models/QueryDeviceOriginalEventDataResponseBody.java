// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link QueryDeviceOriginalEventDataResponseBody} extends {@link TeaModel}
 *
 * <p>QueryDeviceOriginalEventDataResponseBody</p>
 */
public class QueryDeviceOriginalEventDataResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryDeviceOriginalEventDataResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDeviceOriginalEventDataResponseBody create() {
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
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(QueryDeviceOriginalEventDataResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The error code returned if the call fails. For more information, see <a href="https://help.aliyun.com/document_detail/87387.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>iot.device.InvalidIoTId</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The event records returned if the call succeeds.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message returned if the call fails.</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>E55E50B7-40EE-4B6B-8BBE-D3ED55CCF565</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call succeeds.</p>
         * <ul>
         * <li>true: The call succeeded.</li>
         * <li>false: The call failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryDeviceOriginalEventDataResponseBody build() {
            return new QueryDeviceOriginalEventDataResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryDeviceOriginalEventDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceOriginalEventDataResponseBody</p>
     */
    public static class EventInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventType")
        private String eventType;

        @com.aliyun.core.annotation.NameInMap("Identifier")
        private String identifier;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutputData")
        private String outputData;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        private EventInfo(Builder builder) {
            this.eventType = builder.eventType;
            this.identifier = builder.identifier;
            this.name = builder.name;
            this.outputData = builder.outputData;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventInfo create() {
            return builder().build();
        }

        /**
         * @return eventType
         */
        public String getEventType() {
            return this.eventType;
        }

        /**
         * @return identifier
         */
        public String getIdentifier() {
            return this.identifier;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputData
         */
        public String getOutputData() {
            return this.outputData;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String eventType; 
            private String identifier; 
            private String name; 
            private String outputData; 
            private String time; 

            private Builder() {
            } 

            private Builder(EventInfo model) {
                this.eventType = model.eventType;
                this.identifier = model.identifier;
                this.name = model.name;
                this.outputData = model.outputData;
                this.time = model.time;
            } 

            /**
             * <p>The type of the event. Valid values:</p>
             * <ul>
             * <li>info: information.</li>
             * <li>alert: alert.</li>
             * <li>error: error.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>info</p>
             */
            public Builder eventType(String eventType) {
                this.eventType = eventType;
                return this;
            }

            /**
             * <p>The identifier of the event.</p>
             * 
             * <strong>example:</strong>
             * <p>PowerOff</p>
             */
            public Builder identifier(String identifier) {
                this.identifier = identifier;
                return this;
            }

            /**
             * <p>The name of the event.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The output parameter of the event. The value is a string in the MAP format.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;structArgs&quot;:{&quot;structchildFLOATf71c20e&quot;:1.23}}</p>
             */
            public Builder outputData(String outputData) {
                this.outputData = outputData;
                return this;
            }

            /**
             * <p>The time when the event occurred. The value is a 13-digit timestamp in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1579163099000</p>
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public EventInfo build() {
                return new EventInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceOriginalEventDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceOriginalEventDataResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("EventInfo")
        private java.util.List<EventInfo> eventInfo;

        private List(Builder builder) {
            this.eventInfo = builder.eventInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return eventInfo
         */
        public java.util.List<EventInfo> getEventInfo() {
            return this.eventInfo;
        }

        public static final class Builder {
            private java.util.List<EventInfo> eventInfo; 

            private Builder() {
            } 

            private Builder(List model) {
                this.eventInfo = model.eventInfo;
            } 

            /**
             * EventInfo.
             */
            public Builder eventInfo(java.util.List<EventInfo> eventInfo) {
                this.eventInfo = eventInfo;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryDeviceOriginalEventDataResponseBody} extends {@link TeaModel}
     *
     * <p>QueryDeviceOriginalEventDataResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private List list;

        @com.aliyun.core.annotation.NameInMap("NextPageToken")
        private String nextPageToken;

        @com.aliyun.core.annotation.NameInMap("NextValid")
        private Boolean nextValid;

        private Data(Builder builder) {
            this.list = builder.list;
            this.nextPageToken = builder.nextPageToken;
            this.nextValid = builder.nextValid;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public List getList() {
            return this.list;
        }

        /**
         * @return nextPageToken
         */
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        /**
         * @return nextValid
         */
        public Boolean getNextValid() {
            return this.nextValid;
        }

        public static final class Builder {
            private List list; 
            private String nextPageToken; 
            private Boolean nextValid; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.nextPageToken = model.nextPageToken;
                this.nextValid = model.nextValid;
            } 

            /**
             * <p>The array of events. Each element represents an event. For more information about the details of the event, see the parameters of the <strong>EventInfo</strong> parameter.</p>
             */
            public Builder list(List list) {
                this.list = list;
                return this;
            }

            /**
             * <p>The identifier of the next page.</p>
             * 
             * <strong>example:</strong>
             * <p>Bo***x44Qx</p>
             */
            public Builder nextPageToken(String nextPageToken) {
                this.nextPageToken = nextPageToken;
                return this;
            }

            /**
             * <p>Indicates whether the next page exists.</p>
             * <ul>
             * <li><strong>true</strong>: The next page exists.</li>
             * <li><strong>false</strong>: The next page does not exist.</li>
             * </ul>
             * <p>If the value <strong><strong><strong>true</strong> is returned, you can add the value of the <strong>NextPageToken</strong> parameter</strong></strong> to the next request. This allows you to query the data that is not included in the current query.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder nextValid(Boolean nextValid) {
                this.nextValid = nextValid;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
