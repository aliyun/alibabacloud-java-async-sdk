// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
 * {@link DescribeSiteMonitorListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSiteMonitorListResponseBody</p>
 */
public class DescribeSiteMonitorListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SiteMonitors")
    private SiteMonitors siteMonitors;

    @com.aliyun.core.annotation.NameInMap("Success")
    private String success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeSiteMonitorListResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.siteMonitors = builder.siteMonitors;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeSiteMonitorListResponseBody create() {
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
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return siteMonitors
     */
    public SiteMonitors getSiteMonitors() {
        return this.siteMonitors;
    }

    /**
     * @return success
     */
    public String getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private SiteMonitors siteMonitors; 
        private String success; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeSiteMonitorListResponseBody model) {
            this.code = model.code;
            this.message = model.message;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.siteMonitors = model.siteMonitors;
            this.success = model.success;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The status code.</p>
         * <blockquote>
         * <p>200 indicates success.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>successful</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>A80DB41C-AF6C-50E1-ADB5-66DCBA3D266B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * SiteMonitors.
         */
        public Builder siteMonitors(SiteMonitors siteMonitors) {
            this.siteMonitors = siteMonitors;
            return this;
        }

        /**
         * <p>Indicates whether the operation was successful. Valid values:</p>
         * <ul>
         * <li><p>true: Successful.</p>
         * </li>
         * <li><p>false: Failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * <p>The total number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSiteMonitorListResponseBody build() {
            return new DescribeSiteMonitorListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeSiteMonitorListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorListResponseBody</p>
     */
    public static class Assertions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("property")
        private String property;

        @com.aliyun.core.annotation.NameInMap("target")
        private String target;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        private Assertions(Builder builder) {
            this.operator = builder.operator;
            this.property = builder.property;
            this.target = builder.target;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Assertions create() {
            return builder().build();
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return property
         */
        public String getProperty() {
            return this.property;
        }

        /**
         * @return target
         */
        public String getTarget() {
            return this.target;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String operator; 
            private String property; 
            private String target; 
            private String type; 

            private Builder() {
            } 

            private Builder(Assertions model) {
                this.operator = model.operator;
                this.property = model.property;
                this.target = model.target;
                this.type = model.type;
            } 

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * property.
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * target.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Assertions build() {
                return new Assertions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorListResponseBody</p>
     */
    public static class OptionsJsonAssertions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("assertions")
        private java.util.List<Assertions> assertions;

        private OptionsJsonAssertions(Builder builder) {
            this.assertions = builder.assertions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionsJsonAssertions create() {
            return builder().build();
        }

        /**
         * @return assertions
         */
        public java.util.List<Assertions> getAssertions() {
            return this.assertions;
        }

        public static final class Builder {
            private java.util.List<Assertions> assertions; 

            private Builder() {
            } 

            private Builder(OptionsJsonAssertions model) {
                this.assertions = model.assertions;
            } 

            /**
             * assertions.
             */
            public Builder assertions(java.util.List<Assertions> assertions) {
                this.assertions = assertions;
                return this;
            }

            public OptionsJsonAssertions build() {
                return new OptionsJsonAssertions(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorListResponseBody</p>
     */
    public static class OptionsJson extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("acceptable_response_code")
        private String acceptableResponseCode;

        @com.aliyun.core.annotation.NameInMap("assertions")
        private OptionsJsonAssertions assertions;

        @com.aliyun.core.annotation.NameInMap("attempts")
        private Long attempts;

        @com.aliyun.core.annotation.NameInMap("authentication")
        private Integer authentication;

        @com.aliyun.core.annotation.NameInMap("cert_verify")
        private Boolean certVerify;

        @com.aliyun.core.annotation.NameInMap("cookie")
        private String cookie;

        @com.aliyun.core.annotation.NameInMap("diagnosis_mtr")
        private Boolean diagnosisMtr;

        @com.aliyun.core.annotation.NameInMap("diagnosis_ping")
        private Boolean diagnosisPing;

        @com.aliyun.core.annotation.NameInMap("dns_match_rule")
        private String dnsMatchRule;

        @com.aliyun.core.annotation.NameInMap("dns_server")
        private String dnsServer;

        @com.aliyun.core.annotation.NameInMap("dns_type")
        private String dnsType;

        @com.aliyun.core.annotation.NameInMap("enable_operator_dns")
        private Boolean enableOperatorDns;

        @com.aliyun.core.annotation.NameInMap("failure_rate")
        private Float failureRate;

        @com.aliyun.core.annotation.NameInMap("header")
        private String header;

        @com.aliyun.core.annotation.NameInMap("http_method")
        private String httpMethod;

        @com.aliyun.core.annotation.NameInMap("isBase64Encode")
        private String isBase64Encode;

        @com.aliyun.core.annotation.NameInMap("match_rule")
        private Integer matchRule;

        @com.aliyun.core.annotation.NameInMap("password")
        private String password;

        @com.aliyun.core.annotation.NameInMap("ping_num")
        private Integer pingNum;

        @com.aliyun.core.annotation.NameInMap("port")
        private Integer port;

        @com.aliyun.core.annotation.NameInMap("protocol")
        private String protocol;

        @com.aliyun.core.annotation.NameInMap("proxy_protocol")
        private Boolean proxyProtocol;

        @com.aliyun.core.annotation.NameInMap("request_content")
        private String requestContent;

        @com.aliyun.core.annotation.NameInMap("request_format")
        private String requestFormat;

        @com.aliyun.core.annotation.NameInMap("response_content")
        private String responseContent;

        @com.aliyun.core.annotation.NameInMap("response_format")
        private String responseFormat;

        @com.aliyun.core.annotation.NameInMap("retry_delay")
        private Integer retryDelay;

        @com.aliyun.core.annotation.NameInMap("time_out")
        private Long timeOut;

        @com.aliyun.core.annotation.NameInMap("unfollow_redirect")
        private Boolean unfollowRedirect;

        @com.aliyun.core.annotation.NameInMap("username")
        private String username;

        private OptionsJson(Builder builder) {
            this.acceptableResponseCode = builder.acceptableResponseCode;
            this.assertions = builder.assertions;
            this.attempts = builder.attempts;
            this.authentication = builder.authentication;
            this.certVerify = builder.certVerify;
            this.cookie = builder.cookie;
            this.diagnosisMtr = builder.diagnosisMtr;
            this.diagnosisPing = builder.diagnosisPing;
            this.dnsMatchRule = builder.dnsMatchRule;
            this.dnsServer = builder.dnsServer;
            this.dnsType = builder.dnsType;
            this.enableOperatorDns = builder.enableOperatorDns;
            this.failureRate = builder.failureRate;
            this.header = builder.header;
            this.httpMethod = builder.httpMethod;
            this.isBase64Encode = builder.isBase64Encode;
            this.matchRule = builder.matchRule;
            this.password = builder.password;
            this.pingNum = builder.pingNum;
            this.port = builder.port;
            this.protocol = builder.protocol;
            this.proxyProtocol = builder.proxyProtocol;
            this.requestContent = builder.requestContent;
            this.requestFormat = builder.requestFormat;
            this.responseContent = builder.responseContent;
            this.responseFormat = builder.responseFormat;
            this.retryDelay = builder.retryDelay;
            this.timeOut = builder.timeOut;
            this.unfollowRedirect = builder.unfollowRedirect;
            this.username = builder.username;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OptionsJson create() {
            return builder().build();
        }

        /**
         * @return acceptableResponseCode
         */
        public String getAcceptableResponseCode() {
            return this.acceptableResponseCode;
        }

        /**
         * @return assertions
         */
        public OptionsJsonAssertions getAssertions() {
            return this.assertions;
        }

        /**
         * @return attempts
         */
        public Long getAttempts() {
            return this.attempts;
        }

        /**
         * @return authentication
         */
        public Integer getAuthentication() {
            return this.authentication;
        }

        /**
         * @return certVerify
         */
        public Boolean getCertVerify() {
            return this.certVerify;
        }

        /**
         * @return cookie
         */
        public String getCookie() {
            return this.cookie;
        }

        /**
         * @return diagnosisMtr
         */
        public Boolean getDiagnosisMtr() {
            return this.diagnosisMtr;
        }

        /**
         * @return diagnosisPing
         */
        public Boolean getDiagnosisPing() {
            return this.diagnosisPing;
        }

        /**
         * @return dnsMatchRule
         */
        public String getDnsMatchRule() {
            return this.dnsMatchRule;
        }

        /**
         * @return dnsServer
         */
        public String getDnsServer() {
            return this.dnsServer;
        }

        /**
         * @return dnsType
         */
        public String getDnsType() {
            return this.dnsType;
        }

        /**
         * @return enableOperatorDns
         */
        public Boolean getEnableOperatorDns() {
            return this.enableOperatorDns;
        }

        /**
         * @return failureRate
         */
        public Float getFailureRate() {
            return this.failureRate;
        }

        /**
         * @return header
         */
        public String getHeader() {
            return this.header;
        }

        /**
         * @return httpMethod
         */
        public String getHttpMethod() {
            return this.httpMethod;
        }

        /**
         * @return isBase64Encode
         */
        public String getIsBase64Encode() {
            return this.isBase64Encode;
        }

        /**
         * @return matchRule
         */
        public Integer getMatchRule() {
            return this.matchRule;
        }

        /**
         * @return password
         */
        public String getPassword() {
            return this.password;
        }

        /**
         * @return pingNum
         */
        public Integer getPingNum() {
            return this.pingNum;
        }

        /**
         * @return port
         */
        public Integer getPort() {
            return this.port;
        }

        /**
         * @return protocol
         */
        public String getProtocol() {
            return this.protocol;
        }

        /**
         * @return proxyProtocol
         */
        public Boolean getProxyProtocol() {
            return this.proxyProtocol;
        }

        /**
         * @return requestContent
         */
        public String getRequestContent() {
            return this.requestContent;
        }

        /**
         * @return requestFormat
         */
        public String getRequestFormat() {
            return this.requestFormat;
        }

        /**
         * @return responseContent
         */
        public String getResponseContent() {
            return this.responseContent;
        }

        /**
         * @return responseFormat
         */
        public String getResponseFormat() {
            return this.responseFormat;
        }

        /**
         * @return retryDelay
         */
        public Integer getRetryDelay() {
            return this.retryDelay;
        }

        /**
         * @return timeOut
         */
        public Long getTimeOut() {
            return this.timeOut;
        }

        /**
         * @return unfollowRedirect
         */
        public Boolean getUnfollowRedirect() {
            return this.unfollowRedirect;
        }

        /**
         * @return username
         */
        public String getUsername() {
            return this.username;
        }

        public static final class Builder {
            private String acceptableResponseCode; 
            private OptionsJsonAssertions assertions; 
            private Long attempts; 
            private Integer authentication; 
            private Boolean certVerify; 
            private String cookie; 
            private Boolean diagnosisMtr; 
            private Boolean diagnosisPing; 
            private String dnsMatchRule; 
            private String dnsServer; 
            private String dnsType; 
            private Boolean enableOperatorDns; 
            private Float failureRate; 
            private String header; 
            private String httpMethod; 
            private String isBase64Encode; 
            private Integer matchRule; 
            private String password; 
            private Integer pingNum; 
            private Integer port; 
            private String protocol; 
            private Boolean proxyProtocol; 
            private String requestContent; 
            private String requestFormat; 
            private String responseContent; 
            private String responseFormat; 
            private Integer retryDelay; 
            private Long timeOut; 
            private Boolean unfollowRedirect; 
            private String username; 

            private Builder() {
            } 

            private Builder(OptionsJson model) {
                this.acceptableResponseCode = model.acceptableResponseCode;
                this.assertions = model.assertions;
                this.attempts = model.attempts;
                this.authentication = model.authentication;
                this.certVerify = model.certVerify;
                this.cookie = model.cookie;
                this.diagnosisMtr = model.diagnosisMtr;
                this.diagnosisPing = model.diagnosisPing;
                this.dnsMatchRule = model.dnsMatchRule;
                this.dnsServer = model.dnsServer;
                this.dnsType = model.dnsType;
                this.enableOperatorDns = model.enableOperatorDns;
                this.failureRate = model.failureRate;
                this.header = model.header;
                this.httpMethod = model.httpMethod;
                this.isBase64Encode = model.isBase64Encode;
                this.matchRule = model.matchRule;
                this.password = model.password;
                this.pingNum = model.pingNum;
                this.port = model.port;
                this.protocol = model.protocol;
                this.proxyProtocol = model.proxyProtocol;
                this.requestContent = model.requestContent;
                this.requestFormat = model.requestFormat;
                this.responseContent = model.responseContent;
                this.responseFormat = model.responseFormat;
                this.retryDelay = model.retryDelay;
                this.timeOut = model.timeOut;
                this.unfollowRedirect = model.unfollowRedirect;
                this.username = model.username;
            } 

            /**
             * acceptable_response_code.
             */
            public Builder acceptableResponseCode(String acceptableResponseCode) {
                this.acceptableResponseCode = acceptableResponseCode;
                return this;
            }

            /**
             * assertions.
             */
            public Builder assertions(OptionsJsonAssertions assertions) {
                this.assertions = assertions;
                return this;
            }

            /**
             * attempts.
             */
            public Builder attempts(Long attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * authentication.
             */
            public Builder authentication(Integer authentication) {
                this.authentication = authentication;
                return this;
            }

            /**
             * cert_verify.
             */
            public Builder certVerify(Boolean certVerify) {
                this.certVerify = certVerify;
                return this;
            }

            /**
             * cookie.
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * diagnosis_mtr.
             */
            public Builder diagnosisMtr(Boolean diagnosisMtr) {
                this.diagnosisMtr = diagnosisMtr;
                return this;
            }

            /**
             * diagnosis_ping.
             */
            public Builder diagnosisPing(Boolean diagnosisPing) {
                this.diagnosisPing = diagnosisPing;
                return this;
            }

            /**
             * dns_match_rule.
             */
            public Builder dnsMatchRule(String dnsMatchRule) {
                this.dnsMatchRule = dnsMatchRule;
                return this;
            }

            /**
             * dns_server.
             */
            public Builder dnsServer(String dnsServer) {
                this.dnsServer = dnsServer;
                return this;
            }

            /**
             * dns_type.
             */
            public Builder dnsType(String dnsType) {
                this.dnsType = dnsType;
                return this;
            }

            /**
             * enable_operator_dns.
             */
            public Builder enableOperatorDns(Boolean enableOperatorDns) {
                this.enableOperatorDns = enableOperatorDns;
                return this;
            }

            /**
             * failure_rate.
             */
            public Builder failureRate(Float failureRate) {
                this.failureRate = failureRate;
                return this;
            }

            /**
             * header.
             */
            public Builder header(String header) {
                this.header = header;
                return this;
            }

            /**
             * http_method.
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * isBase64Encode.
             */
            public Builder isBase64Encode(String isBase64Encode) {
                this.isBase64Encode = isBase64Encode;
                return this;
            }

            /**
             * match_rule.
             */
            public Builder matchRule(Integer matchRule) {
                this.matchRule = matchRule;
                return this;
            }

            /**
             * password.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * ping_num.
             */
            public Builder pingNum(Integer pingNum) {
                this.pingNum = pingNum;
                return this;
            }

            /**
             * port.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * protocol.
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * proxy_protocol.
             */
            public Builder proxyProtocol(Boolean proxyProtocol) {
                this.proxyProtocol = proxyProtocol;
                return this;
            }

            /**
             * request_content.
             */
            public Builder requestContent(String requestContent) {
                this.requestContent = requestContent;
                return this;
            }

            /**
             * request_format.
             */
            public Builder requestFormat(String requestFormat) {
                this.requestFormat = requestFormat;
                return this;
            }

            /**
             * response_content.
             */
            public Builder responseContent(String responseContent) {
                this.responseContent = responseContent;
                return this;
            }

            /**
             * response_format.
             */
            public Builder responseFormat(String responseFormat) {
                this.responseFormat = responseFormat;
                return this;
            }

            /**
             * retry_delay.
             */
            public Builder retryDelay(Integer retryDelay) {
                this.retryDelay = retryDelay;
                return this;
            }

            /**
             * time_out.
             */
            public Builder timeOut(Long timeOut) {
                this.timeOut = timeOut;
                return this;
            }

            /**
             * unfollow_redirect.
             */
            public Builder unfollowRedirect(Boolean unfollowRedirect) {
                this.unfollowRedirect = unfollowRedirect;
                return this;
            }

            /**
             * username.
             */
            public Builder username(String username) {
                this.username = username;
                return this;
            }

            public OptionsJson build() {
                return new OptionsJson(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorListResponseBody</p>
     */
    public static class SiteMonitor extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Address")
        private String address;

        @com.aliyun.core.annotation.NameInMap("AgentGroup")
        private String agentGroup;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("Interval")
        private String interval;

        @com.aliyun.core.annotation.NameInMap("OptionsJson")
        private OptionsJson optionsJson;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        @com.aliyun.core.annotation.NameInMap("TaskName")
        private String taskName;

        @com.aliyun.core.annotation.NameInMap("TaskState")
        private String taskState;

        @com.aliyun.core.annotation.NameInMap("TaskType")
        private String taskType;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        private SiteMonitor(Builder builder) {
            this.address = builder.address;
            this.agentGroup = builder.agentGroup;
            this.createTime = builder.createTime;
            this.interval = builder.interval;
            this.optionsJson = builder.optionsJson;
            this.taskId = builder.taskId;
            this.taskName = builder.taskName;
            this.taskState = builder.taskState;
            this.taskType = builder.taskType;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteMonitor create() {
            return builder().build();
        }

        /**
         * @return address
         */
        public String getAddress() {
            return this.address;
        }

        /**
         * @return agentGroup
         */
        public String getAgentGroup() {
            return this.agentGroup;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return interval
         */
        public String getInterval() {
            return this.interval;
        }

        /**
         * @return optionsJson
         */
        public OptionsJson getOptionsJson() {
            return this.optionsJson;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        /**
         * @return taskName
         */
        public String getTaskName() {
            return this.taskName;
        }

        /**
         * @return taskState
         */
        public String getTaskState() {
            return this.taskState;
        }

        /**
         * @return taskType
         */
        public String getTaskType() {
            return this.taskType;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private String address; 
            private String agentGroup; 
            private String createTime; 
            private String interval; 
            private OptionsJson optionsJson; 
            private String taskId; 
            private String taskName; 
            private String taskState; 
            private String taskType; 
            private String updateTime; 

            private Builder() {
            } 

            private Builder(SiteMonitor model) {
                this.address = model.address;
                this.agentGroup = model.agentGroup;
                this.createTime = model.createTime;
                this.interval = model.interval;
                this.optionsJson = model.optionsJson;
                this.taskId = model.taskId;
                this.taskName = model.taskName;
                this.taskState = model.taskState;
                this.taskType = model.taskType;
                this.updateTime = model.updateTime;
            } 

            /**
             * Address.
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * AgentGroup.
             */
            public Builder agentGroup(String agentGroup) {
                this.agentGroup = agentGroup;
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
             * Interval.
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * OptionsJson.
             */
            public Builder optionsJson(OptionsJson optionsJson) {
                this.optionsJson = optionsJson;
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
             * TaskName.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * TaskState.
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * TaskType.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public SiteMonitor build() {
                return new SiteMonitor(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeSiteMonitorListResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeSiteMonitorListResponseBody</p>
     */
    public static class SiteMonitors extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SiteMonitor")
        private java.util.List<SiteMonitor> siteMonitor;

        private SiteMonitors(Builder builder) {
            this.siteMonitor = builder.siteMonitor;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SiteMonitors create() {
            return builder().build();
        }

        /**
         * @return siteMonitor
         */
        public java.util.List<SiteMonitor> getSiteMonitor() {
            return this.siteMonitor;
        }

        public static final class Builder {
            private java.util.List<SiteMonitor> siteMonitor; 

            private Builder() {
            } 

            private Builder(SiteMonitors model) {
                this.siteMonitor = model.siteMonitor;
            } 

            /**
             * SiteMonitor.
             */
            public Builder siteMonitor(java.util.List<SiteMonitor> siteMonitor) {
                this.siteMonitor = siteMonitor;
                return this;
            }

            public SiteMonitors build() {
                return new SiteMonitors(this);
            } 

        } 

    }
}
