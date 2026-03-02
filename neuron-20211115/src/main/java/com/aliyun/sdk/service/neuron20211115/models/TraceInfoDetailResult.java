// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link TraceInfoDetailResult} extends {@link TeaModel}
 *
 * <p>TraceInfoDetailResult</p>
 */
public class TraceInfoDetailResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("traceDetails")
    private java.util.List<TraceDetails> traceDetails;

    private TraceInfoDetailResult(Builder builder) {
        this.traceDetails = builder.traceDetails;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TraceInfoDetailResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return traceDetails
     */
    public java.util.List<TraceDetails> getTraceDetails() {
        return this.traceDetails;
    }

    public static final class Builder {
        private java.util.List<TraceDetails> traceDetails; 

        private Builder() {
        } 

        private Builder(TraceInfoDetailResult model) {
            this.traceDetails = model.traceDetails;
        } 

        /**
         * traceDetails.
         */
        public Builder traceDetails(java.util.List<TraceDetails> traceDetails) {
            this.traceDetails = traceDetails;
            return this;
        }

        public TraceInfoDetailResult build() {
            return new TraceInfoDetailResult(this);
        } 

    } 

    /**
     * 
     * {@link TraceInfoDetailResult} extends {@link TeaModel}
     *
     * <p>TraceInfoDetailResult</p>
     */
    public static class TraceDetails extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("children")
        private java.util.List<java.util.Map<String, ?>> children;

        @com.aliyun.core.annotation.NameInMap("duration")
        private Long duration;

        @com.aliyun.core.annotation.NameInMap("haveStack")
        private Boolean haveStack;

        @com.aliyun.core.annotation.NameInMap("logEventList")
        private java.util.List<TraceSpansLogEventList> logEventList;

        @com.aliyun.core.annotation.NameInMap("operationName")
        private String operationName;

        @com.aliyun.core.annotation.NameInMap("parentSpanId")
        private String parentSpanId;

        @com.aliyun.core.annotation.NameInMap("resultCode")
        private String resultCode;

        @com.aliyun.core.annotation.NameInMap("rpcId")
        private String rpcId;

        @com.aliyun.core.annotation.NameInMap("rpcType")
        private Long rpcType;

        @com.aliyun.core.annotation.NameInMap("rpcTypeName")
        private String rpcTypeName;

        @com.aliyun.core.annotation.NameInMap("serviceIp")
        private String serviceIp;

        @com.aliyun.core.annotation.NameInMap("serviceName")
        private String serviceName;

        @com.aliyun.core.annotation.NameInMap("spanId")
        private String spanId;

        @com.aliyun.core.annotation.NameInMap("tagEntryList")
        private java.util.List<TagEntry> tagEntryList;

        @com.aliyun.core.annotation.NameInMap("timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("traceId")
        private String traceId;

        private TraceDetails(Builder builder) {
            this.children = builder.children;
            this.duration = builder.duration;
            this.haveStack = builder.haveStack;
            this.logEventList = builder.logEventList;
            this.operationName = builder.operationName;
            this.parentSpanId = builder.parentSpanId;
            this.resultCode = builder.resultCode;
            this.rpcId = builder.rpcId;
            this.rpcType = builder.rpcType;
            this.rpcTypeName = builder.rpcTypeName;
            this.serviceIp = builder.serviceIp;
            this.serviceName = builder.serviceName;
            this.spanId = builder.spanId;
            this.tagEntryList = builder.tagEntryList;
            this.timestamp = builder.timestamp;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceDetails create() {
            return builder().build();
        }

        /**
         * @return children
         */
        public java.util.List<java.util.Map<String, ?>> getChildren() {
            return this.children;
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        /**
         * @return haveStack
         */
        public Boolean getHaveStack() {
            return this.haveStack;
        }

        /**
         * @return logEventList
         */
        public java.util.List<TraceSpansLogEventList> getLogEventList() {
            return this.logEventList;
        }

        /**
         * @return operationName
         */
        public String getOperationName() {
            return this.operationName;
        }

        /**
         * @return parentSpanId
         */
        public String getParentSpanId() {
            return this.parentSpanId;
        }

        /**
         * @return resultCode
         */
        public String getResultCode() {
            return this.resultCode;
        }

        /**
         * @return rpcId
         */
        public String getRpcId() {
            return this.rpcId;
        }

        /**
         * @return rpcType
         */
        public Long getRpcType() {
            return this.rpcType;
        }

        /**
         * @return rpcTypeName
         */
        public String getRpcTypeName() {
            return this.rpcTypeName;
        }

        /**
         * @return serviceIp
         */
        public String getServiceIp() {
            return this.serviceIp;
        }

        /**
         * @return serviceName
         */
        public String getServiceName() {
            return this.serviceName;
        }

        /**
         * @return spanId
         */
        public String getSpanId() {
            return this.spanId;
        }

        /**
         * @return tagEntryList
         */
        public java.util.List<TagEntry> getTagEntryList() {
            return this.tagEntryList;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private java.util.List<java.util.Map<String, ?>> children; 
            private Long duration; 
            private Boolean haveStack; 
            private java.util.List<TraceSpansLogEventList> logEventList; 
            private String operationName; 
            private String parentSpanId; 
            private String resultCode; 
            private String rpcId; 
            private Long rpcType; 
            private String rpcTypeName; 
            private String serviceIp; 
            private String serviceName; 
            private String spanId; 
            private java.util.List<TagEntry> tagEntryList; 
            private Long timestamp; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(TraceDetails model) {
                this.children = model.children;
                this.duration = model.duration;
                this.haveStack = model.haveStack;
                this.logEventList = model.logEventList;
                this.operationName = model.operationName;
                this.parentSpanId = model.parentSpanId;
                this.resultCode = model.resultCode;
                this.rpcId = model.rpcId;
                this.rpcType = model.rpcType;
                this.rpcTypeName = model.rpcTypeName;
                this.serviceIp = model.serviceIp;
                this.serviceName = model.serviceName;
                this.spanId = model.spanId;
                this.tagEntryList = model.tagEntryList;
                this.timestamp = model.timestamp;
                this.traceId = model.traceId;
            } 

            /**
             * children.
             */
            public Builder children(java.util.List<java.util.Map<String, ?>> children) {
                this.children = children;
                return this;
            }

            /**
             * duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            /**
             * haveStack.
             */
            public Builder haveStack(Boolean haveStack) {
                this.haveStack = haveStack;
                return this;
            }

            /**
             * logEventList.
             */
            public Builder logEventList(java.util.List<TraceSpansLogEventList> logEventList) {
                this.logEventList = logEventList;
                return this;
            }

            /**
             * operationName.
             */
            public Builder operationName(String operationName) {
                this.operationName = operationName;
                return this;
            }

            /**
             * parentSpanId.
             */
            public Builder parentSpanId(String parentSpanId) {
                this.parentSpanId = parentSpanId;
                return this;
            }

            /**
             * resultCode.
             */
            public Builder resultCode(String resultCode) {
                this.resultCode = resultCode;
                return this;
            }

            /**
             * rpcId.
             */
            public Builder rpcId(String rpcId) {
                this.rpcId = rpcId;
                return this;
            }

            /**
             * rpcType.
             */
            public Builder rpcType(Long rpcType) {
                this.rpcType = rpcType;
                return this;
            }

            /**
             * rpcTypeName.
             */
            public Builder rpcTypeName(String rpcTypeName) {
                this.rpcTypeName = rpcTypeName;
                return this;
            }

            /**
             * serviceIp.
             */
            public Builder serviceIp(String serviceIp) {
                this.serviceIp = serviceIp;
                return this;
            }

            /**
             * serviceName.
             */
            public Builder serviceName(String serviceName) {
                this.serviceName = serviceName;
                return this;
            }

            /**
             * spanId.
             */
            public Builder spanId(String spanId) {
                this.spanId = spanId;
                return this;
            }

            /**
             * tagEntryList.
             */
            public Builder tagEntryList(java.util.List<TagEntry> tagEntryList) {
                this.tagEntryList = tagEntryList;
                return this;
            }

            /**
             * timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * traceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public TraceDetails build() {
                return new TraceDetails(this);
            } 

        } 

    }
}
