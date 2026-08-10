// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.green20220926.models;

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
 * {@link GetAiAppNodeDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetAiAppNodeDetailResponseBody</p>
 */
public class GetAiAppNodeDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("Channel")
    private String channel;

    @com.aliyun.core.annotation.NameInMap("EventData")
    private java.util.List<EventData> eventData;

    @com.aliyun.core.annotation.NameInMap("NodeId")
    private String nodeId;

    @com.aliyun.core.annotation.NameInMap("NodeName")
    private String nodeName;

    @com.aliyun.core.annotation.NameInMap("NodeType")
    private String nodeType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("RiskLevel")
    private String riskLevel;

    private GetAiAppNodeDetailResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.channel = builder.channel;
        this.eventData = builder.eventData;
        this.nodeId = builder.nodeId;
        this.nodeName = builder.nodeName;
        this.nodeType = builder.nodeType;
        this.requestId = builder.requestId;
        this.riskLevel = builder.riskLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAiAppNodeDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return channel
     */
    public String getChannel() {
        return this.channel;
    }

    /**
     * @return eventData
     */
    public java.util.List<EventData> getEventData() {
        return this.eventData;
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
     * @return nodeType
     */
    public String getNodeType() {
        return this.nodeType;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return riskLevel
     */
    public String getRiskLevel() {
        return this.riskLevel;
    }

    public static final class Builder {
        private String appId; 
        private String channel; 
        private java.util.List<EventData> eventData; 
        private String nodeId; 
        private String nodeName; 
        private String nodeType; 
        private String requestId; 
        private String riskLevel; 

        private Builder() {
        } 

        private Builder(GetAiAppNodeDetailResponseBody model) {
            this.appId = model.appId;
            this.channel = model.channel;
            this.eventData = model.eventData;
            this.nodeId = model.nodeId;
            this.nodeName = model.nodeName;
            this.nodeType = model.nodeType;
            this.requestId = model.requestId;
            this.riskLevel = model.riskLevel;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * Channel.
         */
        public Builder channel(String channel) {
            this.channel = channel;
            return this;
        }

        /**
         * EventData.
         */
        public Builder eventData(java.util.List<EventData> eventData) {
            this.eventData = eventData;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.nodeId = nodeId;
            return this;
        }

        /**
         * NodeName.
         */
        public Builder nodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }

        /**
         * NodeType.
         */
        public Builder nodeType(String nodeType) {
            this.nodeType = nodeType;
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
         * RiskLevel.
         */
        public Builder riskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }

        public GetAiAppNodeDetailResponseBody build() {
            return new GetAiAppNodeDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetAiAppNodeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiAppNodeDetailResponseBody</p>
     */
    public static class Labels extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Label")
        private String label;

        @com.aliyun.core.annotation.NameInMap("LabelDesc")
        private String labelDesc;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        private Labels(Builder builder) {
            this.label = builder.label;
            this.labelDesc = builder.labelDesc;
            this.riskLevel = builder.riskLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Labels create() {
            return builder().build();
        }

        /**
         * @return label
         */
        public String getLabel() {
            return this.label;
        }

        /**
         * @return labelDesc
         */
        public String getLabelDesc() {
            return this.labelDesc;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public static final class Builder {
            private String label; 
            private String labelDesc; 
            private String riskLevel; 

            private Builder() {
            } 

            private Builder(Labels model) {
                this.label = model.label;
                this.labelDesc = model.labelDesc;
                this.riskLevel = model.riskLevel;
            } 

            /**
             * Label.
             */
            public Builder label(String label) {
                this.label = label;
                return this;
            }

            /**
             * LabelDesc.
             */
            public Builder labelDesc(String labelDesc) {
                this.labelDesc = labelDesc;
                return this;
            }

            /**
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            public Labels build() {
                return new Labels(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetAiAppNodeDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetAiAppNodeDetailResponseBody</p>
     */
    public static class EventData extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Channel")
        private String channel;

        @com.aliyun.core.annotation.NameInMap("Labels")
        private java.util.List<Labels> labels;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RiskLevel")
        private String riskLevel;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private EventData(Builder builder) {
            this.channel = builder.channel;
            this.labels = builder.labels;
            this.name = builder.name;
            this.riskLevel = builder.riskLevel;
            this.time = builder.time;
            this.traceId = builder.traceId;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EventData create() {
            return builder().build();
        }

        /**
         * @return channel
         */
        public String getChannel() {
            return this.channel;
        }

        /**
         * @return labels
         */
        public java.util.List<Labels> getLabels() {
            return this.labels;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return riskLevel
         */
        public String getRiskLevel() {
            return this.riskLevel;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String channel; 
            private java.util.List<Labels> labels; 
            private String name; 
            private String riskLevel; 
            private String time; 
            private String traceId; 
            private String type; 

            private Builder() {
            } 

            private Builder(EventData model) {
                this.channel = model.channel;
                this.labels = model.labels;
                this.name = model.name;
                this.riskLevel = model.riskLevel;
                this.time = model.time;
                this.traceId = model.traceId;
                this.type = model.type;
            } 

            /**
             * Channel.
             */
            public Builder channel(String channel) {
                this.channel = channel;
                return this;
            }

            /**
             * Labels.
             */
            public Builder labels(java.util.List<Labels> labels) {
                this.labels = labels;
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
             * RiskLevel.
             */
            public Builder riskLevel(String riskLevel) {
                this.riskLevel = riskLevel;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public EventData build() {
                return new EventData(this);
            } 

        } 

    }
}
