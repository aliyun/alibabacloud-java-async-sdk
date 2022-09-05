// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CallChainInfo} extends {@link TeaModel}
 *
 * <p>CallChainInfo</p>
 */
public class CallChainInfo extends TeaModel {
    @NameInMap("AdditionalInfo")
    private String additionalInfo;

    @NameInMap("AppName")
    private String appName;

    @NameInMap("AppType")
    private String appType;

    @NameInMap("Children")
    private java.util.List < CallChainInfo > children;

    @NameInMap("HaveSpan")
    private Boolean haveSpan;

    @NameInMap("LogMap")
    private java.util.Map < String, java.util.Map<String, ?>> logMap;

    @NameInMap("LogTime")
    private Long logTime;

    @NameInMap("ParentSpanId")
    private String parentSpanId;

    @NameInMap("Pid")
    private String pid;

    @NameInMap("RegionId")
    private String regionId;

    @NameInMap("ResultCode")
    private String resultCode;

    @NameInMap("Rpc")
    private String rpc;

    @NameInMap("RpcId")
    private String rpcId;

    @NameInMap("RpcType")
    private Long rpcType;

    @NameInMap("ServerIp")
    private String serverIp;

    @NameInMap("Span")
    private Long span;

    @NameInMap("SpanId")
    private String spanId;

    @NameInMap("TagMap")
    private java.util.Map < String, String > tagMap;

    @NameInMap("TraceId")
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
         * additionalInfo
         */
        public Builder additionalInfo(String additionalInfo) {
            this.additionalInfo = additionalInfo;
            return this;
        }

        /**
         * appName
         */
        public Builder appName(String appName) {
            this.appName = appName;
            return this;
        }

        /**
         * appType
         */
        public Builder appType(String appType) {
            this.appType = appType;
            return this;
        }

        /**
         * children
         */
        public Builder children(java.util.List < CallChainInfo > children) {
            this.children = children;
            return this;
        }

        /**
         * haveSpan
         */
        public Builder haveSpan(Boolean haveSpan) {
            this.haveSpan = haveSpan;
            return this;
        }

        /**
         * logMap
         */
        public Builder logMap(java.util.Map < String, java.util.Map<String, ?>> logMap) {
            this.logMap = logMap;
            return this;
        }

        /**
         * logTime
         */
        public Builder logTime(Long logTime) {
            this.logTime = logTime;
            return this;
        }

        /**
         * parentSpanId
         */
        public Builder parentSpanId(String parentSpanId) {
            this.parentSpanId = parentSpanId;
            return this;
        }

        /**
         * pid
         */
        public Builder pid(String pid) {
            this.pid = pid;
            return this;
        }

        /**
         * regionId
         */
        public Builder regionId(String regionId) {
            this.regionId = regionId;
            return this;
        }

        /**
         * resultCode
         */
        public Builder resultCode(String resultCode) {
            this.resultCode = resultCode;
            return this;
        }

        /**
         * rpc
         */
        public Builder rpc(String rpc) {
            this.rpc = rpc;
            return this;
        }

        /**
         * rpcId
         */
        public Builder rpcId(String rpcId) {
            this.rpcId = rpcId;
            return this;
        }

        /**
         * rpcType
         */
        public Builder rpcType(Long rpcType) {
            this.rpcType = rpcType;
            return this;
        }

        /**
         * serverIp
         */
        public Builder serverIp(String serverIp) {
            this.serverIp = serverIp;
            return this;
        }

        /**
         * span
         */
        public Builder span(Long span) {
            this.span = span;
            return this;
        }

        /**
         * spanId
         */
        public Builder spanId(String spanId) {
            this.spanId = spanId;
            return this;
        }

        /**
         * tagMap
         */
        public Builder tagMap(java.util.Map < String, String > tagMap) {
            this.tagMap = tagMap;
            return this;
        }

        /**
         * traceId
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
