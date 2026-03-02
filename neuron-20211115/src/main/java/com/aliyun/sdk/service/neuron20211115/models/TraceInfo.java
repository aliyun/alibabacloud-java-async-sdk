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
 * {@link TraceInfo} extends {@link TeaModel}
 *
 * <p>TraceInfo</p>
 */
public class TraceInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("operationName")
    private String operationName;

    @com.aliyun.core.annotation.NameInMap("serviceIp")
    private String serviceIp;

    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("timestamp")
    private Long timestamp;

    @com.aliyun.core.annotation.NameInMap("traceId")
    private String traceId;

    private TraceInfo(Builder builder) {
        this.duration = builder.duration;
        this.operationName = builder.operationName;
        this.serviceIp = builder.serviceIp;
        this.serviceName = builder.serviceName;
        this.timestamp = builder.timestamp;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TraceInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return operationName
     */
    public String getOperationName() {
        return this.operationName;
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
        private Long duration; 
        private String operationName; 
        private String serviceIp; 
        private String serviceName; 
        private Long timestamp; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(TraceInfo model) {
            this.duration = model.duration;
            this.operationName = model.operationName;
            this.serviceIp = model.serviceIp;
            this.serviceName = model.serviceName;
            this.timestamp = model.timestamp;
            this.traceId = model.traceId;
        } 

        /**
         * duration.
         */
        public Builder duration(Long duration) {
            this.duration = duration;
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

        public TraceInfo build() {
            return new TraceInfo(this);
        } 

    } 

}
