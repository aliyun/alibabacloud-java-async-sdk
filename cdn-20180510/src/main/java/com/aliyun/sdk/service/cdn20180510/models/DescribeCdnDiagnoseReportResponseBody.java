// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cdn20180510.models;

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
 * {@link DescribeCdnDiagnoseReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCdnDiagnoseReportResponseBody</p>
 */
public class DescribeCdnDiagnoseReportResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Content")
    private Content content;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeCdnDiagnoseReportResponseBody(Builder builder) {
        this.content = builder.content;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCdnDiagnoseReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return content
     */
    public Content getContent() {
        return this.content;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Content content; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeCdnDiagnoseReportResponseBody model) {
            this.content = model.content;
            this.requestId = model.requestId;
        } 

        /**
         * Content.
         */
        public Builder content(Content content) {
            this.content = content;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeCdnDiagnoseReportResponseBody build() {
            return new DescribeCdnDiagnoseReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeCdnDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDiagnoseReportResponseBody</p>
     */
    public static class ClientInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BrowserInfo")
        private String browserInfo;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("UAString")
        private String UAString;

        private ClientInfo(Builder builder) {
            this.browserInfo = builder.browserInfo;
            this.os = builder.os;
            this.UAString = builder.UAString;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClientInfo create() {
            return builder().build();
        }

        /**
         * @return browserInfo
         */
        public String getBrowserInfo() {
            return this.browserInfo;
        }

        /**
         * @return os
         */
        public String getOs() {
            return this.os;
        }

        /**
         * @return UAString
         */
        public String getUAString() {
            return this.UAString;
        }

        public static final class Builder {
            private String browserInfo; 
            private String os; 
            private String UAString; 

            private Builder() {
            } 

            private Builder(ClientInfo model) {
                this.browserInfo = model.browserInfo;
                this.os = model.os;
                this.UAString = model.UAString;
            } 

            /**
             * BrowserInfo.
             */
            public Builder browserInfo(String browserInfo) {
                this.browserInfo = browserInfo;
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
             * UAString.
             */
            public Builder UAString(String UAString) {
                this.UAString = UAString;
                return this;
            }

            public ClientInfo build() {
                return new ClientInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDiagnoseReportResponseBody</p>
     */
    public static class L1Tengine extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Addr")
        private String addr;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("ErrorLog")
        private String errorLog;

        @com.aliyun.core.annotation.NameInMap("Fbt")
        private String fbt;

        @com.aliyun.core.annotation.NameInMap("Intro")
        private String intro;

        @com.aliyun.core.annotation.NameInMap("ReqHeader")
        private String reqHeader;

        @com.aliyun.core.annotation.NameInMap("ReqTime")
        private String reqTime;

        @com.aliyun.core.annotation.NameInMap("RespHeader")
        private String respHeader;

        @com.aliyun.core.annotation.NameInMap("RespSize")
        private Long respSize;

        @com.aliyun.core.annotation.NameInMap("Rt")
        private String rt;

        @com.aliyun.core.annotation.NameInMap("Station")
        private String station;

        private L1Tengine(Builder builder) {
            this.addr = builder.addr;
            this.code = builder.code;
            this.errorLog = builder.errorLog;
            this.fbt = builder.fbt;
            this.intro = builder.intro;
            this.reqHeader = builder.reqHeader;
            this.reqTime = builder.reqTime;
            this.respHeader = builder.respHeader;
            this.respSize = builder.respSize;
            this.rt = builder.rt;
            this.station = builder.station;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static L1Tengine create() {
            return builder().build();
        }

        /**
         * @return addr
         */
        public String getAddr() {
            return this.addr;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return errorLog
         */
        public String getErrorLog() {
            return this.errorLog;
        }

        /**
         * @return fbt
         */
        public String getFbt() {
            return this.fbt;
        }

        /**
         * @return intro
         */
        public String getIntro() {
            return this.intro;
        }

        /**
         * @return reqHeader
         */
        public String getReqHeader() {
            return this.reqHeader;
        }

        /**
         * @return reqTime
         */
        public String getReqTime() {
            return this.reqTime;
        }

        /**
         * @return respHeader
         */
        public String getRespHeader() {
            return this.respHeader;
        }

        /**
         * @return respSize
         */
        public Long getRespSize() {
            return this.respSize;
        }

        /**
         * @return rt
         */
        public String getRt() {
            return this.rt;
        }

        /**
         * @return station
         */
        public String getStation() {
            return this.station;
        }

        public static final class Builder {
            private String addr; 
            private String code; 
            private String errorLog; 
            private String fbt; 
            private String intro; 
            private String reqHeader; 
            private String reqTime; 
            private String respHeader; 
            private Long respSize; 
            private String rt; 
            private String station; 

            private Builder() {
            } 

            private Builder(L1Tengine model) {
                this.addr = model.addr;
                this.code = model.code;
                this.errorLog = model.errorLog;
                this.fbt = model.fbt;
                this.intro = model.intro;
                this.reqHeader = model.reqHeader;
                this.reqTime = model.reqTime;
                this.respHeader = model.respHeader;
                this.respSize = model.respSize;
                this.rt = model.rt;
                this.station = model.station;
            } 

            /**
             * Addr.
             */
            public Builder addr(String addr) {
                this.addr = addr;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * ErrorLog.
             */
            public Builder errorLog(String errorLog) {
                this.errorLog = errorLog;
                return this;
            }

            /**
             * Fbt.
             */
            public Builder fbt(String fbt) {
                this.fbt = fbt;
                return this;
            }

            /**
             * Intro.
             */
            public Builder intro(String intro) {
                this.intro = intro;
                return this;
            }

            /**
             * ReqHeader.
             */
            public Builder reqHeader(String reqHeader) {
                this.reqHeader = reqHeader;
                return this;
            }

            /**
             * ReqTime.
             */
            public Builder reqTime(String reqTime) {
                this.reqTime = reqTime;
                return this;
            }

            /**
             * RespHeader.
             */
            public Builder respHeader(String respHeader) {
                this.respHeader = respHeader;
                return this;
            }

            /**
             * RespSize.
             */
            public Builder respSize(Long respSize) {
                this.respSize = respSize;
                return this;
            }

            /**
             * Rt.
             */
            public Builder rt(String rt) {
                this.rt = rt;
                return this;
            }

            /**
             * Station.
             */
            public Builder station(String station) {
                this.station = station;
                return this;
            }

            public L1Tengine build() {
                return new L1Tengine(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDiagnoseReportResponseBody</p>
     */
    public static class Report extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientInfo")
        private String clientInfo;

        @com.aliyun.core.annotation.NameInMap("DiagnoseResult")
        private String diagnoseResult;

        @com.aliyun.core.annotation.NameInMap("L1Node")
        private String l1Node;

        @com.aliyun.core.annotation.NameInMap("L1Tengine")
        private L1Tengine l1Tengine;

        @com.aliyun.core.annotation.NameInMap("SourceInfo")
        private java.util.List<String> sourceInfo;

        private Report(Builder builder) {
            this.clientInfo = builder.clientInfo;
            this.diagnoseResult = builder.diagnoseResult;
            this.l1Node = builder.l1Node;
            this.l1Tengine = builder.l1Tengine;
            this.sourceInfo = builder.sourceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Report create() {
            return builder().build();
        }

        /**
         * @return clientInfo
         */
        public String getClientInfo() {
            return this.clientInfo;
        }

        /**
         * @return diagnoseResult
         */
        public String getDiagnoseResult() {
            return this.diagnoseResult;
        }

        /**
         * @return l1Node
         */
        public String getL1Node() {
            return this.l1Node;
        }

        /**
         * @return l1Tengine
         */
        public L1Tengine getL1Tengine() {
            return this.l1Tengine;
        }

        /**
         * @return sourceInfo
         */
        public java.util.List<String> getSourceInfo() {
            return this.sourceInfo;
        }

        public static final class Builder {
            private String clientInfo; 
            private String diagnoseResult; 
            private String l1Node; 
            private L1Tengine l1Tengine; 
            private java.util.List<String> sourceInfo; 

            private Builder() {
            } 

            private Builder(Report model) {
                this.clientInfo = model.clientInfo;
                this.diagnoseResult = model.diagnoseResult;
                this.l1Node = model.l1Node;
                this.l1Tengine = model.l1Tengine;
                this.sourceInfo = model.sourceInfo;
            } 

            /**
             * ClientInfo.
             */
            public Builder clientInfo(String clientInfo) {
                this.clientInfo = clientInfo;
                return this;
            }

            /**
             * DiagnoseResult.
             */
            public Builder diagnoseResult(String diagnoseResult) {
                this.diagnoseResult = diagnoseResult;
                return this;
            }

            /**
             * L1Node.
             */
            public Builder l1Node(String l1Node) {
                this.l1Node = l1Node;
                return this;
            }

            /**
             * L1Tengine.
             */
            public Builder l1Tengine(L1Tengine l1Tengine) {
                this.l1Tengine = l1Tengine;
                return this;
            }

            /**
             * SourceInfo.
             */
            public Builder sourceInfo(java.util.List<String> sourceInfo) {
                this.sourceInfo = sourceInfo;
                return this;
            }

            public Report build() {
                return new Report(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeCdnDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeCdnDiagnoseReportResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private String aliuid;

        @com.aliyun.core.annotation.NameInMap("ClientAddr")
        private String clientAddr;

        @com.aliyun.core.annotation.NameInMap("ClientInfo")
        private ClientInfo clientInfo;

        @com.aliyun.core.annotation.NameInMap("ClientIp")
        private String clientIp;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DiagnoseId")
        private String diagnoseId;

        @com.aliyun.core.annotation.NameInMap("DiagnoseReportLink")
        private String diagnoseReportLink;

        @com.aliyun.core.annotation.NameInMap("DiagnoseUrl")
        private String diagnoseUrl;

        @com.aliyun.core.annotation.NameInMap("Domain")
        private String domain;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private Long expireTime;

        @com.aliyun.core.annotation.NameInMap("RemainDiagnoseTimes")
        private Long remainDiagnoseTimes;

        @com.aliyun.core.annotation.NameInMap("Report")
        private Report report;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Long status;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TimeConsuming")
        private Long timeConsuming;

        @com.aliyun.core.annotation.NameInMap("TraceDisplayLink")
        private String traceDisplayLink;

        @com.aliyun.core.annotation.NameInMap("TraceId")
        private String traceId;

        private Content(Builder builder) {
            this.aliuid = builder.aliuid;
            this.clientAddr = builder.clientAddr;
            this.clientInfo = builder.clientInfo;
            this.clientIp = builder.clientIp;
            this.createTime = builder.createTime;
            this.diagnoseId = builder.diagnoseId;
            this.diagnoseReportLink = builder.diagnoseReportLink;
            this.diagnoseUrl = builder.diagnoseUrl;
            this.domain = builder.domain;
            this.expireTime = builder.expireTime;
            this.remainDiagnoseTimes = builder.remainDiagnoseTimes;
            this.report = builder.report;
            this.state = builder.state;
            this.status = builder.status;
            this.taskId = builder.taskId;
            this.timeConsuming = builder.timeConsuming;
            this.traceDisplayLink = builder.traceDisplayLink;
            this.traceId = builder.traceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return aliuid
         */
        public String getAliuid() {
            return this.aliuid;
        }

        /**
         * @return clientAddr
         */
        public String getClientAddr() {
            return this.clientAddr;
        }

        /**
         * @return clientInfo
         */
        public ClientInfo getClientInfo() {
            return this.clientInfo;
        }

        /**
         * @return clientIp
         */
        public String getClientIp() {
            return this.clientIp;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return diagnoseId
         */
        public String getDiagnoseId() {
            return this.diagnoseId;
        }

        /**
         * @return diagnoseReportLink
         */
        public String getDiagnoseReportLink() {
            return this.diagnoseReportLink;
        }

        /**
         * @return diagnoseUrl
         */
        public String getDiagnoseUrl() {
            return this.diagnoseUrl;
        }

        /**
         * @return domain
         */
        public String getDomain() {
            return this.domain;
        }

        /**
         * @return expireTime
         */
        public Long getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return remainDiagnoseTimes
         */
        public Long getRemainDiagnoseTimes() {
            return this.remainDiagnoseTimes;
        }

        /**
         * @return report
         */
        public Report getReport() {
            return this.report;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return timeConsuming
         */
        public Long getTimeConsuming() {
            return this.timeConsuming;
        }

        /**
         * @return traceDisplayLink
         */
        public String getTraceDisplayLink() {
            return this.traceDisplayLink;
        }

        /**
         * @return traceId
         */
        public String getTraceId() {
            return this.traceId;
        }

        public static final class Builder {
            private String aliuid; 
            private String clientAddr; 
            private ClientInfo clientInfo; 
            private String clientIp; 
            private String createTime; 
            private String diagnoseId; 
            private String diagnoseReportLink; 
            private String diagnoseUrl; 
            private String domain; 
            private Long expireTime; 
            private Long remainDiagnoseTimes; 
            private Report report; 
            private String state; 
            private Long status; 
            private String taskId; 
            private Long timeConsuming; 
            private String traceDisplayLink; 
            private String traceId; 

            private Builder() {
            } 

            private Builder(Content model) {
                this.aliuid = model.aliuid;
                this.clientAddr = model.clientAddr;
                this.clientInfo = model.clientInfo;
                this.clientIp = model.clientIp;
                this.createTime = model.createTime;
                this.diagnoseId = model.diagnoseId;
                this.diagnoseReportLink = model.diagnoseReportLink;
                this.diagnoseUrl = model.diagnoseUrl;
                this.domain = model.domain;
                this.expireTime = model.expireTime;
                this.remainDiagnoseTimes = model.remainDiagnoseTimes;
                this.report = model.report;
                this.state = model.state;
                this.status = model.status;
                this.taskId = model.taskId;
                this.timeConsuming = model.timeConsuming;
                this.traceDisplayLink = model.traceDisplayLink;
                this.traceId = model.traceId;
            } 

            /**
             * Aliuid.
             */
            public Builder aliuid(String aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * ClientAddr.
             */
            public Builder clientAddr(String clientAddr) {
                this.clientAddr = clientAddr;
                return this;
            }

            /**
             * ClientInfo.
             */
            public Builder clientInfo(ClientInfo clientInfo) {
                this.clientInfo = clientInfo;
                return this;
            }

            /**
             * ClientIp.
             */
            public Builder clientIp(String clientIp) {
                this.clientIp = clientIp;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DiagnoseId.
             */
            public Builder diagnoseId(String diagnoseId) {
                this.diagnoseId = diagnoseId;
                return this;
            }

            /**
             * DiagnoseReportLink.
             */
            public Builder diagnoseReportLink(String diagnoseReportLink) {
                this.diagnoseReportLink = diagnoseReportLink;
                return this;
            }

            /**
             * DiagnoseUrl.
             */
            public Builder diagnoseUrl(String diagnoseUrl) {
                this.diagnoseUrl = diagnoseUrl;
                return this;
            }

            /**
             * Domain.
             */
            public Builder domain(String domain) {
                this.domain = domain;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(Long expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * RemainDiagnoseTimes.
             */
            public Builder remainDiagnoseTimes(Long remainDiagnoseTimes) {
                this.remainDiagnoseTimes = remainDiagnoseTimes;
                return this;
            }

            /**
             * Report.
             */
            public Builder report(Report report) {
                this.report = report;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * TimeConsuming.
             */
            public Builder timeConsuming(Long timeConsuming) {
                this.timeConsuming = timeConsuming;
                return this;
            }

            /**
             * TraceDisplayLink.
             */
            public Builder traceDisplayLink(String traceDisplayLink) {
                this.traceDisplayLink = traceDisplayLink;
                return this;
            }

            /**
             * TraceId.
             */
            public Builder traceId(String traceId) {
                this.traceId = traceId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
}
