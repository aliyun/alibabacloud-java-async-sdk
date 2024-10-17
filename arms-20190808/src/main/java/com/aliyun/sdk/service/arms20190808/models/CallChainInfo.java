// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CallChainInfo} extends {@link TeaModel}
 *
 * <p>CallChainInfo</p>
 */
public class CallChainInfo extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AdditionalInfo")
    private String additionalInfo;

    @com.aliyun.core.annotation.NameInMap("AppName")
    private String appName;

    @com.aliyun.core.annotation.NameInMap("AppType")
    private String appType;

    @com.aliyun.core.annotation.NameInMap("Children")
    private java.util.List < CallChainInfo > children;

    @com.aliyun.core.annotation.NameInMap("HaveSpan")
    private Boolean haveSpan;

    @com.aliyun.core.annotation.NameInMap("LogMap")
    private java.util.Map < String, java.util.Map<String, ?>> logMap;

    @com.aliyun.core.annotation.NameInMap("LogTime")
    private Long logTime;

    @com.aliyun.core.annotation.NameInMap("ParentSpanId")
    private String parentSpanId;

    @com.aliyun.core.annotation.NameInMap("Pid")
    private String pid;

    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.NameInMap("ResultCode")
    private String resultCode;

    @com.aliyun.core.annotation.NameInMap("Rpc")
    private String rpc;

    @com.aliyun.core.annotation.NameInMap("RpcId")
    private String rpcId;

    @com.aliyun.core.annotation.NameInMap("RpcType")
    private Long rpcType;

    @com.aliyun.core.annotation.NameInMap("ServerIp")
    private String serverIp;

    @com.aliyun.core.annotation.NameInMap("Span")
    private Long span;

    @com.aliyun.core.annotation.NameInMap("SpanId")
    private String spanId;

    @com.aliyun.core.annotation.NameInMap("TagMap")
    private java.util.Map < String, String > tagMap;

    @com.aliyun.core.annotation.NameInMap("TraceId")
    private String traceId;

    private CallChainInfo(Builder builder) {
        this.additionalInfo = builder.additionalInfo;
        this.appName = builder.appName;
        this.appType = builder.appType;
        this.children = builder.children;
        this.haveSpan = builder.haveSpan;
        this.logMap = builder.logMap;
        this.logTime = builder.logTime;
        this.parentSpanId = builder.parentSpanId;
        this.pid = builder.pid;
        this.regionId = builder.regionId;
        this.resultCode = builder.resultCode;
        this.rpc = builder.rpc;
        this.rpcId = builder.rpcId;
        this.rpcType = builder.rpcType;
        this.serverIp = builder.serverIp;
        this.span = builder.span;
        this.spanId = builder.spanId;
        this.tagMap = builder.tagMap;
        this.traceId = builder.traceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CallChainInfo create() {
        return builder().build();
    }

    /**
     * @return additionalInfo
     */
    public String getAdditionalInfo() {
        return this.additionalInfo;
    }

    /**
     * @return appName
     */
    public String getAppName() {
        return this.appName;
    }

    /**
     * @return appType
     */
    public String getAppType() {
        return this.appType;
    }

    /**
     * @return children
     */
    public java.util.List < CallChainInfo > getChildren() {
        return this.children;
    }

    /**
     * @return haveSpan
     */
    public Boolean getHaveSpan() {
        return this.haveSpan;
    }

    /**
     * @return logMap
     */
    public java.util.Map < String, java.util.Map<String, ?>> getLogMap() {
        return this.logMap;
    }

    /**
     * @return logTime
     */
    public Long getLogTime() {
        return this.logTime;
    }

    /**
     * @return parentSpanId
     */
    public String getParentSpanId() {
        return this.parentSpanId;
    }

    /**
     * @return pid
     */
    public String getPid() {
        return this.pid;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resultCode
     */
    public String getResultCode() {
        return this.resultCode;
    }

    /**
     * @return rpc
     */
    public String getRpc() {
        return this.rpc;
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
     * @return serverIp
     */
    public String getServerIp() {
        return this.serverIp;
    }

    /**
     * @return span
     */
    public Long getSpan() {
        return this.span;
    }

    /**
     * @return spanId
     */
    public String getSpanId() {
        return this.spanId;
    }

    /**
     * @return tagMap
     */
    public java.util.Map < String, String > getTagMap() {
        return this.tagMap;
    }

    /**
     * @return traceId
     */
    public String getTraceId() {
        return this.traceId;
    }

    public static final class Builder {
        private String additionalInfo; 
        private String appName; 
        private String appType; 
        private java.util.List < CallChainInfo > children; 
        private Boolean haveSpan; 
        private java.util.Map < String, java.util.Map<String, ?>> logMap; 
        private Long logTime; 
        private String parentSpanId; 
        private String pid; 
        private String regionId; 
        private String resultCode; 
        private String rpc; 
        private String rpcId; 
        private Long rpcType; 
        private String serverIp; 
        private Long span; 
        private String spanId; 
        private java.util.Map < String, String > tagMap; 
        private String traceId; 

        /**
         * AdditionalInfo.
         */
        public Builder additionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        /**
         * AppName.
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * AppType.
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * Children.
         */
        public Builder children(java.util.List < CallChainInfo > children) {
            this.children = children;
            return this;
        }

        /**
         * HaveSpan.
         */
        public Builder haveSpan(Boolean haveSpan) {
            this.haveSpan = haveSpan;
            return this;
        }

        /**
         * LogMap.
         */
        public Builder logMap(java.util.Map < String, java.util.Map<String, ?>> logMap) {
            this.logMap = logMap;
            return this;
        }

        /**
         * LogTime.
         */
        public Builder logTime(Long logTime) {
            this.logTime = logTime;
            return this;
        }

        /**
         * ParentSpanId.
         */
        public Builder parentSpanId(String parentSpanId) {
            this.parentSpanId = parentSpanId;
            return this;
        }

        /**
         * Pid.
         */
        public Builder pid(String pid) {
            this.pid = pid;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * ResultCode.
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * Rpc.
         */
        public Builder rpc(String rpc) {
            this.rpc = rpc;
            return this;
        }

        /**
         * RpcId.
         */
        public Builder rpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }

        /**
         * RpcType.
         */
        public Builder rpcType(Long rpcType) {
            this.rpcType = rpcType;
            return this;
        }

        /**
         * ServerIp.
         */
        public Builder serverIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }

        /**
         * Span.
         */
        public Builder span(Long span) {
            this.span = span;
            return this;
        }

        /**
         * SpanId.
         */
        public Builder spanId(String spanId) {
            this.spanId = spanId;
            return this;
        }

        /**
         * TagMap.
         */
        public Builder tagMap(java.util.Map < String, String > tagMap) {
            this.tagMap = tagMap;
            return this;
        }

        /**
         * TraceId.
         */
        public Builder traceId(String traceId) {
            this.traceId = traceId;
            return this;
        }

        public CallChainInfo build() {
            return new CallChainInfo(this);
        } 

    } 

}
