// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sasrasp20240727.models;

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
 * {@link DescribeAttacksResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAttacksResponseBody</p>
 */
public class DescribeAttacksResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Attacks")
    private java.util.List<Attacks> attacks;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private DescribeAttacksResponseBody(Builder builder) {
        this.attacks = builder.attacks;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAttacksResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return attacks
     */
    public java.util.List<Attacks> getAttacks() {
        return this.attacks;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List<Attacks> attacks; 
        private String requestId; 
        private Long totalCount; 

        private Builder() {
        } 

        private Builder(DescribeAttacksResponseBody model) {
            this.attacks = model.attacks;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * Attacks.
         */
        public Builder attacks(java.util.List<Attacks> attacks) {
            this.attacks = attacks;
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
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeAttacksResponseBody build() {
            return new DescribeAttacksResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAttacksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAttacksResponseBody</p>
     */
    public static class InputParamItemList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ProcessedKey")
        private String processedKey;

        @com.aliyun.core.annotation.NameInMap("RawKey")
        private String rawKey;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private InputParamItemList(Builder builder) {
            this.processedKey = builder.processedKey;
            this.rawKey = builder.rawKey;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InputParamItemList create() {
            return builder().build();
        }

        /**
         * @return processedKey
         */
        public String getProcessedKey() {
            return this.processedKey;
        }

        /**
         * @return rawKey
         */
        public String getRawKey() {
            return this.rawKey;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String processedKey; 
            private String rawKey; 
            private String value; 

            private Builder() {
            } 

            private Builder(InputParamItemList model) {
                this.processedKey = model.processedKey;
                this.rawKey = model.rawKey;
                this.value = model.value;
            } 

            /**
             * ProcessedKey.
             */
            public Builder processedKey(String processedKey) {
                this.processedKey = processedKey;
                return this;
            }

            /**
             * RawKey.
             */
            public Builder rawKey(String rawKey) {
                this.rawKey = rawKey;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public InputParamItemList build() {
                return new InputParamItemList(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeAttacksResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAttacksResponseBody</p>
     */
    public static class Attacks extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppDir")
        private String appDir;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("AppName")
        private String appName;

        @com.aliyun.core.annotation.NameInMap("Avd")
        private String avd;

        @com.aliyun.core.annotation.NameInMap("Cmdline")
        private String cmdline;

        @com.aliyun.core.annotation.NameInMap("Confidence")
        private String confidence;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("ContentLength")
        private Long contentLength;

        @com.aliyun.core.annotation.NameInMap("Count")
        private Long count;

        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("Headers")
        private String headers;

        @com.aliyun.core.annotation.NameInMap("HostId")
        private String hostId;

        @com.aliyun.core.annotation.NameInMap("Hostname")
        private String hostname;

        @com.aliyun.core.annotation.NameInMap("InputParamItemList")
        private java.util.List<InputParamItemList> inputParamItemList;

        @com.aliyun.core.annotation.NameInMap("InstallType")
        private Long installType;

        @com.aliyun.core.annotation.NameInMap("Ip")
        private String ip;

        @com.aliyun.core.annotation.NameInMap("Jdk")
        private String jdk;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("LanguageVersion")
        private String languageVersion;

        @com.aliyun.core.annotation.NameInMap("MaxTimestamp")
        private Long maxTimestamp;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("MiddlewareInstanceId")
        private String middlewareInstanceId;

        @com.aliyun.core.annotation.NameInMap("MinTimestamp")
        private Long minTimestamp;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("OsArch")
        private String osArch;

        @com.aliyun.core.annotation.NameInMap("OsVersion")
        private String osVersion;

        @com.aliyun.core.annotation.NameInMap("Param")
        private String param;

        @com.aliyun.core.annotation.NameInMap("Payload")
        private String payload;

        @com.aliyun.core.annotation.NameInMap("PayloadLength")
        private Long payloadLength;

        @com.aliyun.core.annotation.NameInMap("Pid")
        private String pid;

        @com.aliyun.core.annotation.NameInMap("RaspVersion")
        private String raspVersion;

        @com.aliyun.core.annotation.NameInMap("Region")
        private String region;

        @com.aliyun.core.annotation.NameInMap("Remote")
        private String remote;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("RuleResult")
        private String ruleResult;

        @com.aliyun.core.annotation.NameInMap("Severity")
        private String severity;

        @com.aliyun.core.annotation.NameInMap("Stacktrace")
        private java.util.List<String> stacktrace;

        @com.aliyun.core.annotation.NameInMap("Time")
        private String time;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private Long timestamp;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("UnionId")
        private String unionId;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Attacks(Builder builder) {
            this.appDir = builder.appDir;
            this.appId = builder.appId;
            this.appName = builder.appName;
            this.avd = builder.avd;
            this.cmdline = builder.cmdline;
            this.confidence = builder.confidence;
            this.content = builder.content;
            this.contentLength = builder.contentLength;
            this.count = builder.count;
            this.data = builder.data;
            this.headers = builder.headers;
            this.hostId = builder.hostId;
            this.hostname = builder.hostname;
            this.inputParamItemList = builder.inputParamItemList;
            this.installType = builder.installType;
            this.ip = builder.ip;
            this.jdk = builder.jdk;
            this.language = builder.language;
            this.languageVersion = builder.languageVersion;
            this.maxTimestamp = builder.maxTimestamp;
            this.message = builder.message;
            this.method = builder.method;
            this.middlewareInstanceId = builder.middlewareInstanceId;
            this.minTimestamp = builder.minTimestamp;
            this.os = builder.os;
            this.osArch = builder.osArch;
            this.osVersion = builder.osVersion;
            this.param = builder.param;
            this.payload = builder.payload;
            this.payloadLength = builder.payloadLength;
            this.pid = builder.pid;
            this.raspVersion = builder.raspVersion;
            this.region = builder.region;
            this.remote = builder.remote;
            this.result = builder.result;
            this.ruleResult = builder.ruleResult;
            this.severity = builder.severity;
            this.stacktrace = builder.stacktrace;
            this.time = builder.time;
            this.timestamp = builder.timestamp;
            this.type = builder.type;
            this.unionId = builder.unionId;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Attacks create() {
            return builder().build();
        }

        /**
         * @return appDir
         */
        public String getAppDir() {
            return this.appDir;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return appName
         */
        public String getAppName() {
            return this.appName;
        }

        /**
         * @return avd
         */
        public String getAvd() {
            return this.avd;
        }

        /**
         * @return cmdline
         */
        public String getCmdline() {
            return this.cmdline;
        }

        /**
         * @return confidence
         */
        public String getConfidence() {
            return this.confidence;
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return contentLength
         */
        public Long getContentLength() {
            return this.contentLength;
        }

        /**
         * @return count
         */
        public Long getCount() {
            return this.count;
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return headers
         */
        public String getHeaders() {
            return this.headers;
        }

        /**
         * @return hostId
         */
        public String getHostId() {
            return this.hostId;
        }

        /**
         * @return hostname
         */
        public String getHostname() {
            return this.hostname;
        }

        /**
         * @return inputParamItemList
         */
        public java.util.List<InputParamItemList> getInputParamItemList() {
            return this.inputParamItemList;
        }

        /**
         * @return installType
         */
        public Long getInstallType() {
            return this.installType;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return jdk
         */
        public String getJdk() {
            return this.jdk;
        }

        /**
         * @return language
         */
        public String getLanguage() {
            return this.language;
        }

        /**
         * @return languageVersion
         */
        public String getLanguageVersion() {
            return this.languageVersion;
        }

        /**
         * @return maxTimestamp
         */
        public Long getMaxTimestamp() {
            return this.maxTimestamp;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return middlewareInstanceId
         */
        public String getMiddlewareInstanceId() {
            return this.middlewareInstanceId;
        }

        /**
         * @return minTimestamp
         */
        public Long getMinTimestamp() {
            return this.minTimestamp;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return osArch
         */
        public String getOsArch() {
            return this.osArch;
        }

        /**
         * @return osVersion
         */
        public String getOsVersion() {
            return this.osVersion;
        }

        /**
         * @return param
         */
        public String getParam() {
            return this.param;
        }

        /**
         * @return payload
         */
        public String getPayload() {
            return this.payload;
        }

        /**
         * @return payloadLength
         */
        public Long getPayloadLength() {
            return this.payloadLength;
        }

        /**
         * @return pid
         */
        public String getPid() {
            return this.pid;
        }

        /**
         * @return raspVersion
         */
        public String getRaspVersion() {
            return this.raspVersion;
        }

        /**
         * @return region
         */
        public String getRegion() {
            return this.region;
        }

        /**
         * @return remote
         */
        public String getRemote() {
            return this.remote;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return ruleResult
         */
        public String getRuleResult() {
            return this.ruleResult;
        }

        /**
         * @return severity
         */
        public String getSeverity() {
            return this.severity;
        }

        /**
         * @return stacktrace
         */
        public java.util.List<String> getStacktrace() {
            return this.stacktrace;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        /**
         * @return timestamp
         */
        public Long getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return unionId
         */
        public String getUnionId() {
            return this.unionId;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String appDir; 
            private String appId; 
            private String appName; 
            private String avd; 
            private String cmdline; 
            private String confidence; 
            private String content; 
            private Long contentLength; 
            private Long count; 
            private String data; 
            private String headers; 
            private String hostId; 
            private String hostname; 
            private java.util.List<InputParamItemList> inputParamItemList; 
            private Long installType; 
            private String ip; 
            private String jdk; 
            private String language; 
            private String languageVersion; 
            private Long maxTimestamp; 
            private String message; 
            private String method; 
            private String middlewareInstanceId; 
            private Long minTimestamp; 
            private String os; 
            private String osArch; 
            private String osVersion; 
            private String param; 
            private String payload; 
            private Long payloadLength; 
            private String pid; 
            private String raspVersion; 
            private String region; 
            private String remote; 
            private String result; 
            private String ruleResult; 
            private String severity; 
            private java.util.List<String> stacktrace; 
            private String time; 
            private Long timestamp; 
            private String type; 
            private String unionId; 
            private String url; 

            private Builder() {
            } 

            private Builder(Attacks model) {
                this.appDir = model.appDir;
                this.appId = model.appId;
                this.appName = model.appName;
                this.avd = model.avd;
                this.cmdline = model.cmdline;
                this.confidence = model.confidence;
                this.content = model.content;
                this.contentLength = model.contentLength;
                this.count = model.count;
                this.data = model.data;
                this.headers = model.headers;
                this.hostId = model.hostId;
                this.hostname = model.hostname;
                this.inputParamItemList = model.inputParamItemList;
                this.installType = model.installType;
                this.ip = model.ip;
                this.jdk = model.jdk;
                this.language = model.language;
                this.languageVersion = model.languageVersion;
                this.maxTimestamp = model.maxTimestamp;
                this.message = model.message;
                this.method = model.method;
                this.middlewareInstanceId = model.middlewareInstanceId;
                this.minTimestamp = model.minTimestamp;
                this.os = model.os;
                this.osArch = model.osArch;
                this.osVersion = model.osVersion;
                this.param = model.param;
                this.payload = model.payload;
                this.payloadLength = model.payloadLength;
                this.pid = model.pid;
                this.raspVersion = model.raspVersion;
                this.region = model.region;
                this.remote = model.remote;
                this.result = model.result;
                this.ruleResult = model.ruleResult;
                this.severity = model.severity;
                this.stacktrace = model.stacktrace;
                this.time = model.time;
                this.timestamp = model.timestamp;
                this.type = model.type;
                this.unionId = model.unionId;
                this.url = model.url;
            } 

            /**
             * AppDir.
             */
            public Builder appDir(String appDir) {
                this.appDir = appDir;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
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
             * Avd.
             */
            public Builder avd(String avd) {
                this.avd = avd;
                return this;
            }

            /**
             * Cmdline.
             */
            public Builder cmdline(String cmdline) {
                this.cmdline = cmdline;
                return this;
            }

            /**
             * Confidence.
             */
            public Builder confidence(String confidence) {
                this.confidence = confidence;
                return this;
            }

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * ContentLength.
             */
            public Builder contentLength(Long contentLength) {
                this.contentLength = contentLength;
                return this;
            }

            /**
             * Count.
             */
            public Builder count(Long count) {
                this.count = count;
                return this;
            }

            /**
             * Data.
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * Headers.
             */
            public Builder headers(String headers) {
                this.headers = headers;
                return this;
            }

            /**
             * HostId.
             */
            public Builder hostId(String hostId) {
                this.hostId = hostId;
                return this;
            }

            /**
             * Hostname.
             */
            public Builder hostname(String hostname) {
                this.hostname = hostname;
                return this;
            }

            /**
             * InputParamItemList.
             */
            public Builder inputParamItemList(java.util.List<InputParamItemList> inputParamItemList) {
                this.inputParamItemList = inputParamItemList;
                return this;
            }

            /**
             * InstallType.
             */
            public Builder installType(Long installType) {
                this.installType = installType;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * Jdk.
             */
            public Builder jdk(String jdk) {
                this.jdk = jdk;
                return this;
            }

            /**
             * Language.
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * LanguageVersion.
             */
            public Builder languageVersion(String languageVersion) {
                this.languageVersion = languageVersion;
                return this;
            }

            /**
             * MaxTimestamp.
             */
            public Builder maxTimestamp(Long maxTimestamp) {
                this.maxTimestamp = maxTimestamp;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * MiddlewareInstanceId.
             */
            public Builder middlewareInstanceId(String middlewareInstanceId) {
                this.middlewareInstanceId = middlewareInstanceId;
                return this;
            }

            /**
             * MinTimestamp.
             */
            public Builder minTimestamp(Long minTimestamp) {
                this.minTimestamp = minTimestamp;
                return this;
            }

            /**
             * Os.
             */
            public Builder os(String os) {
                this.os = os;
                return this;
            }

            /**
             * OsArch.
             */
            public Builder osArch(String osArch) {
                this.osArch = osArch;
                return this;
            }

            /**
             * OsVersion.
             */
            public Builder osVersion(String osVersion) {
                this.osVersion = osVersion;
                return this;
            }

            /**
             * Param.
             */
            public Builder param(String param) {
                this.param = param;
                return this;
            }

            /**
             * Payload.
             */
            public Builder payload(String payload) {
                this.payload = payload;
                return this;
            }

            /**
             * PayloadLength.
             */
            public Builder payloadLength(Long payloadLength) {
                this.payloadLength = payloadLength;
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
             * RaspVersion.
             */
            public Builder raspVersion(String raspVersion) {
                this.raspVersion = raspVersion;
                return this;
            }

            /**
             * Region.
             */
            public Builder region(String region) {
                this.region = region;
                return this;
            }

            /**
             * Remote.
             */
            public Builder remote(String remote) {
                this.remote = remote;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * RuleResult.
             */
            public Builder ruleResult(String ruleResult) {
                this.ruleResult = ruleResult;
                return this;
            }

            /**
             * Severity.
             */
            public Builder severity(String severity) {
                this.severity = severity;
                return this;
            }

            /**
             * Stacktrace.
             */
            public Builder stacktrace(java.util.List<String> stacktrace) {
                this.stacktrace = stacktrace;
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
             * Timestamp.
             */
            public Builder timestamp(Long timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>unionId。</p>
             * 
             * <strong>example:</strong>
             * <p>23yaet4dg6ek3s7aj</p>
             */
            public Builder unionId(String unionId) {
                this.unionId = unionId;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Attacks build() {
                return new Attacks(this);
            } 

        } 

    }
}
