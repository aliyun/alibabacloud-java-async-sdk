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
 * {@link StackInfo} extends {@link TeaModel}
 *
 * <p>StackInfo</p>
 */
public class StackInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("api")
    private String api;

    @com.aliyun.core.annotation.NameInMap("duration")
    private Long duration;

    @com.aliyun.core.annotation.NameInMap("exception")
    private String exception;

    @com.aliyun.core.annotation.NameInMap("extInfo")
    private StackInfoExtInfo extInfo;

    @com.aliyun.core.annotation.NameInMap("line")
    private String line;

    @com.aliyun.core.annotation.NameInMap("rpcId")
    private String rpcId;

    @com.aliyun.core.annotation.NameInMap("serviceName")
    private String serviceName;

    @com.aliyun.core.annotation.NameInMap("startTime")
    private Long startTime;

    private StackInfo(Builder builder) {
        this.api = builder.api;
        this.duration = builder.duration;
        this.exception = builder.exception;
        this.extInfo = builder.extInfo;
        this.line = builder.line;
        this.rpcId = builder.rpcId;
        this.serviceName = builder.serviceName;
        this.startTime = builder.startTime;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StackInfo create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return api
     */
    public String getApi() {
        return this.api;
    }

    /**
     * @return duration
     */
    public Long getDuration() {
        return this.duration;
    }

    /**
     * @return exception
     */
    public String getException() {
        return this.exception;
    }

    /**
     * @return extInfo
     */
    public StackInfoExtInfo getExtInfo() {
        return this.extInfo;
    }

    /**
     * @return line
     */
    public String getLine() {
        return this.line;
    }

    /**
     * @return rpcId
     */
    public String getRpcId() {
        return this.rpcId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    /**
     * @return startTime
     */
    public Long getStartTime() {
        return this.startTime;
    }

    public static final class Builder {
        private String api; 
        private Long duration; 
        private String exception; 
        private StackInfoExtInfo extInfo; 
        private String line; 
        private String rpcId; 
        private String serviceName; 
        private Long startTime; 

        private Builder() {
        } 

        private Builder(StackInfo model) {
            this.api = model.api;
            this.duration = model.duration;
            this.exception = model.exception;
            this.extInfo = model.extInfo;
            this.line = model.line;
            this.rpcId = model.rpcId;
            this.serviceName = model.serviceName;
            this.startTime = model.startTime;
        } 

        /**
         * api.
         */
        public Builder api(String api) {
            this.api = api;
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
         * exception.
         */
        public Builder exception(String exception) {
            this.exception = exception;
            return this;
        }

        /**
         * extInfo.
         */
        public Builder extInfo(StackInfoExtInfo extInfo) {
            this.extInfo = extInfo;
            return this;
        }

        /**
         * line.
         */
        public Builder line(String line) {
            this.line = line;
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
         * serviceName.
         */
        public Builder serviceName(String serviceName) {
            this.serviceName = serviceName;
            return this;
        }

        /**
         * startTime.
         */
        public Builder startTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }

        public StackInfo build() {
            return new StackInfo(this);
        } 

    } 

}
