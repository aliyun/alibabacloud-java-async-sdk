// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link DescribeTraceDiagnoseReportResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTraceDiagnoseReportResponseBody</p>
 */
public class DescribeTraceDiagnoseReportResponseBody extends TeaModel {
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

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

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

    private DescribeTraceDiagnoseReportResponseBody(Builder builder) {
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
        this.requestId = builder.requestId;
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

    public static DescribeTraceDiagnoseReportResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
        private String requestId; 
        private String state; 
        private Long status; 
        private String taskId; 
        private Long timeConsuming; 
        private String traceDisplayLink; 
        private String traceId; 

        private Builder() {
        } 

        private Builder(DescribeTraceDiagnoseReportResponseBody model) {
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
            this.requestId = model.requestId;
            this.state = model.state;
            this.status = model.status;
            this.taskId = model.taskId;
            this.timeConsuming = model.timeConsuming;
            this.traceDisplayLink = model.traceDisplayLink;
            this.traceId = model.traceId;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>15C66C7B-671A-4297-9187-2C4477247A74</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
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

        public DescribeTraceDiagnoseReportResponseBody build() {
            return new DescribeTraceDiagnoseReportResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTraceDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTraceDiagnoseReportResponseBody</p>
     */
    public static class ClientInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BrowserInfo")
        private String browserInfo;

        @com.aliyun.core.annotation.NameInMap("Os")
        private String os;

        @com.aliyun.core.annotation.NameInMap("UaString")
        private String uaString;

        private ClientInfo(Builder builder) {
            this.browserInfo = builder.browserInfo;
            this.os = builder.os;
            this.uaString = builder.uaString;
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
         * @return uaString
         */
        public String getUaString() {
            return this.uaString;
        }

        public static final class Builder {
            private String browserInfo; 
            private String os; 
            private String uaString; 

            private Builder() {
            } 

            private Builder(ClientInfo model) {
                this.browserInfo = model.browserInfo;
                this.os = model.os;
                this.uaString = model.uaString;
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
             * UaString.
             */
            public Builder uaString(String uaString) {
                this.uaString = uaString;
                return this;
            }

            public ClientInfo build() {
                return new ClientInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTraceDiagnoseReportResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTraceDiagnoseReportResponseBody</p>
     */
    public static class Report extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClientInfo")
        private String clientInfo;

        @com.aliyun.core.annotation.NameInMap("DiagnoseResult")
        private String diagnoseResult;

        @com.aliyun.core.annotation.NameInMap("ResponseHeader")
        private String responseHeader;

        @com.aliyun.core.annotation.NameInMap("StaticHtml")
        private String staticHtml;

        private Report(Builder builder) {
            this.clientInfo = builder.clientInfo;
            this.diagnoseResult = builder.diagnoseResult;
            this.responseHeader = builder.responseHeader;
            this.staticHtml = builder.staticHtml;
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
         * @return responseHeader
         */
        public String getResponseHeader() {
            return this.responseHeader;
        }

        /**
         * @return staticHtml
         */
        public String getStaticHtml() {
            return this.staticHtml;
        }

        public static final class Builder {
            private String clientInfo; 
            private String diagnoseResult; 
            private String responseHeader; 
            private String staticHtml; 

            private Builder() {
            } 

            private Builder(Report model) {
                this.clientInfo = model.clientInfo;
                this.diagnoseResult = model.diagnoseResult;
                this.responseHeader = model.responseHeader;
                this.staticHtml = model.staticHtml;
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
             * ResponseHeader.
             */
            public Builder responseHeader(String responseHeader) {
                this.responseHeader = responseHeader;
                return this;
            }

            /**
             * StaticHtml.
             */
            public Builder staticHtml(String staticHtml) {
                this.staticHtml = staticHtml;
                return this;
            }

            public Report build() {
                return new Report(this);
            } 

        } 

    }
}
