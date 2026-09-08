// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

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
 * {@link ListIvrTrackingDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>ListIvrTrackingDetailsResponseBody</p>
 */
public class ListIvrTrackingDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ListIvrTrackingDetailsResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListIvrTrackingDetailsResponseBody create() {
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
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(ListIvrTrackingDetailsResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Response code.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>Data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
            return this;
        }

        /**
         * <p>Response message.</p>
         * 
         * <strong>example:</strong>
         * <p>无</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>D2RB671A-3E24-4A04-81E6-6C4F5B39DF75</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListIvrTrackingDetailsResponseBody build() {
            return new ListIvrTrackingDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListIvrTrackingDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIvrTrackingDetailsResponseBody</p>
     */
    public static class List extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Callee")
        private String callee;

        @com.aliyun.core.annotation.NameInMap("Caller")
        private String caller;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelVariables")
        private String channelVariables;

        @com.aliyun.core.annotation.NameInMap("ContactId")
        private String contactId;

        @com.aliyun.core.annotation.NameInMap("EnterTime")
        private Long enterTime;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("FlowName")
        private String flowName;

        @com.aliyun.core.annotation.NameInMap("Instance")
        private String instance;

        @com.aliyun.core.annotation.NameInMap("LeaveTime")
        private Long leaveTime;

        @com.aliyun.core.annotation.NameInMap("NodeExitCode")
        private String nodeExitCode;

        @com.aliyun.core.annotation.NameInMap("NodeId")
        private String nodeId;

        @com.aliyun.core.annotation.NameInMap("NodeName")
        private String nodeName;

        @com.aliyun.core.annotation.NameInMap("NodeProperties")
        private java.util.Map<String, ?> nodeProperties;

        @com.aliyun.core.annotation.NameInMap("NodeType")
        private String nodeType;

        @com.aliyun.core.annotation.NameInMap("NodeVariables")
        private java.util.Map<String, ?> nodeVariables;

        private List(Builder builder) {
            this.callee = builder.callee;
            this.caller = builder.caller;
            this.channelId = builder.channelId;
            this.channelVariables = builder.channelVariables;
            this.contactId = builder.contactId;
            this.enterTime = builder.enterTime;
            this.flowId = builder.flowId;
            this.flowName = builder.flowName;
            this.instance = builder.instance;
            this.leaveTime = builder.leaveTime;
            this.nodeExitCode = builder.nodeExitCode;
            this.nodeId = builder.nodeId;
            this.nodeName = builder.nodeName;
            this.nodeProperties = builder.nodeProperties;
            this.nodeType = builder.nodeType;
            this.nodeVariables = builder.nodeVariables;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return callee
         */
        public String getCallee() {
            return this.callee;
        }

        /**
         * @return caller
         */
        public String getCaller() {
            return this.caller;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelVariables
         */
        public String getChannelVariables() {
            return this.channelVariables;
        }

        /**
         * @return contactId
         */
        public String getContactId() {
            return this.contactId;
        }

        /**
         * @return enterTime
         */
        public Long getEnterTime() {
            return this.enterTime;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return flowName
         */
        public String getFlowName() {
            return this.flowName;
        }

        /**
         * @return instance
         */
        public String getInstance() {
            return this.instance;
        }

        /**
         * @return leaveTime
         */
        public Long getLeaveTime() {
            return this.leaveTime;
        }

        /**
         * @return nodeExitCode
         */
        public String getNodeExitCode() {
            return this.nodeExitCode;
        }

        /**
         * @return nodeId
         */
        public String getNodeId() {
            return this.nodeId;
        }

        /**
         * @return nodeName
         */
        public String getNodeName() {
            return this.nodeName;
        }

        /**
         * @return nodeProperties
         */
        public java.util.Map<String, ?> getNodeProperties() {
            return this.nodeProperties;
        }

        /**
         * @return nodeType
         */
        public String getNodeType() {
            return this.nodeType;
        }

        /**
         * @return nodeVariables
         */
        public java.util.Map<String, ?> getNodeVariables() {
            return this.nodeVariables;
        }

        public static final class Builder {
            private String callee; 
            private String caller; 
            private String channelId; 
            private String channelVariables; 
            private String contactId; 
            private Long enterTime; 
            private String flowId; 
            private String flowName; 
            private String instance; 
            private Long leaveTime; 
            private String nodeExitCode; 
            private String nodeId; 
            private String nodeName; 
            private java.util.Map<String, ?> nodeProperties; 
            private String nodeType; 
            private java.util.Map<String, ?> nodeVariables; 

            private Builder() {
            } 

            private Builder(List model) {
                this.callee = model.callee;
                this.caller = model.caller;
                this.channelId = model.channelId;
                this.channelVariables = model.channelVariables;
                this.contactId = model.contactId;
                this.enterTime = model.enterTime;
                this.flowId = model.flowId;
                this.flowName = model.flowName;
                this.instance = model.instance;
                this.leaveTime = model.leaveTime;
                this.nodeExitCode = model.nodeExitCode;
                this.nodeId = model.nodeId;
                this.nodeName = model.nodeName;
                this.nodeProperties = model.nodeProperties;
                this.nodeType = model.nodeType;
                this.nodeVariables = model.nodeVariables;
            } 

            /**
             * <p>Callee number.</p>
             * 
             * <strong>example:</strong>
             * <p>0533128****</p>
             */
            public Builder callee(String callee) {
                this.callee = callee;
                return this;
            }

            /**
             * <p>The calling number.</p>
             * 
             * <strong>example:</strong>
             * <p>1332315****</p>
             */
            public Builder caller(String caller) {
                this.caller = caller;
                return this;
            }

            /**
             * <p>Voice channel ID.</p>
             * 
             * <strong>example:</strong>
             * <p>65cp2c15-92ac-4e67-98b2-073a3c541c5d</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>Channel-associated data.</p>
             * 
             * <strong>example:</strong>
             * <p>A=B;C=D</p>
             */
            public Builder channelVariables(String channelVariables) {
                this.channelVariables = channelVariables;
                return this;
            }

            /**
             * <p>Call ID.</p>
             * 
             * <strong>example:</strong>
             * <p>job-10963442671187****</p>
             */
            public Builder contactId(String contactId) {
                this.contactId = contactId;
                return this;
            }

            /**
             * <p>The time when the call entered this IVR edge zone, in Unix timestamp format, in milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>1621910542876</p>
             */
            public Builder enterTime(Long enterTime) {
                this.enterTime = enterTime;
                return this;
            }

            /**
             * <p>Contact flow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>abc99462-1058-47d0-a114-f145ea7444ff</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>The name of the contact flow.</p>
             * 
             * <strong>example:</strong>
             * <p>测试IVR</p>
             */
            public Builder flowName(String flowName) {
                this.flowName = flowName;
                return this;
            }

            /**
             * <p>Instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>ccc-test</p>
             */
            public Builder instance(String instance) {
                this.instance = instance;
                return this;
            }

            /**
             * <p>Time when leaving this IVR node.</p>
             * 
             * <strong>example:</strong>
             * <p>1621910545105</p>
             */
            public Builder leaveTime(Long leaveTime) {
                this.leaveTime = leaveTime;
                return this;
            }

            /**
             * <p>Status code of the edge zone.</p>
             * 
             * <strong>example:</strong>
             * <p>Success</p>
             */
            public Builder nodeExitCode(String nodeExitCode) {
                this.nodeExitCode = nodeExitCode;
                return this;
            }

            /**
             * <p>Node ID.</p>
             * 
             * <strong>example:</strong>
             * <p>e0bc19a3</p>
             */
            public Builder nodeId(String nodeId) {
                this.nodeId = nodeId;
                return this;
            }

            /**
             * <p>Edge zone name.</p>
             * 
             * <strong>example:</strong>
             * <p>放音</p>
             */
            public Builder nodeName(String nodeName) {
                this.nodeName = nodeName;
                return this;
            }

            /**
             * <p>A collection of properties of the edge zone.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;say&quot;:&quot;您好。&quot;}</p>
             */
            public Builder nodeProperties(java.util.Map<String, ?> nodeProperties) {
                this.nodeProperties = nodeProperties;
                return this;
            }

            /**
             * <p>File Type.</p>
             * 
             * <strong>example:</strong>
             * <p>PLAY_SAY</p>
             */
            public Builder nodeType(String nodeType) {
                this.nodeType = nodeType;
                return this;
            }

            /**
             * <p>Node variables.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;digits&quot;:&quot;2&quot;}</p>
             */
            public Builder nodeVariables(java.util.Map<String, ?> nodeVariables) {
                this.nodeVariables = nodeVariables;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListIvrTrackingDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>ListIvrTrackingDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("List")
        private java.util.List<List> list;

        @com.aliyun.core.annotation.NameInMap("PageNumber")
        private Integer pageNumber;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.list = builder.list;
            this.pageNumber = builder.pageNumber;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
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
        public java.util.List<List> getList() {
            return this.list;
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
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List<List> list; 
            private Integer pageNumber; 
            private Integer pageSize; 
            private Integer totalCount; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.list = model.list;
                this.pageNumber = model.pageNumber;
                this.pageSize = model.pageSize;
                this.totalCount = model.totalCount;
            } 

            /**
             * <p>List of IVR tracking details.</p>
             */
            public Builder list(java.util.List<List> list) {
                this.list = list;
                return this;
            }

            /**
             * <p>Page number, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNumber(Integer pageNumber) {
                this.pageNumber = pageNumber;
                return this;
            }

            /**
             * <p>Page size, ranging from 1 to 100.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>Total count.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
