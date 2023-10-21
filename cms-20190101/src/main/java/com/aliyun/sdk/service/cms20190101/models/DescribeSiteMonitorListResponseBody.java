// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeSiteMonitorListResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeSiteMonitorListResponseBody</p>
 */
public class DescribeSiteMonitorListResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SiteMonitors")
    private SiteMonitors siteMonitors;

    @NameInMap("Success")
    private String success;

    @NameInMap("TotalCount")
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

        /**
         * The HTTP status code.
         * <p>
         * 
         * >  The status code 200 indicates that the call was successful.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The site monitoring tasks that are returned.
         */
        public Builder siteMonitors(SiteMonitors siteMonitors) {
            this.siteMonitors = siteMonitors;
            return this;
        }

        /**
         * Indicates whether the call was successful. Valid values:
         * <p>
         * 
         * *   true: The call was successful.
         * *   false: The call failed.
         */
        public Builder success(String success) {
            this.success = success;
            return this;
        }

        /**
         * The total number of returned entries.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeSiteMonitorListResponseBody build() {
            return new DescribeSiteMonitorListResponseBody(this);
        } 

    } 

    public static class Assertions extends TeaModel {
        @NameInMap("operator")
        private String operator;

        @NameInMap("property")
        private String property;

        @NameInMap("target")
        private String target;

        @NameInMap("type")
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

            /**
             * The comparison operator of the assertion. Valid values:
             * <p>
             * 
             * *   contains: contains
             * *   doesNotContain: does not contain
             * *   matches: matches regular expressions
             * *   doesNotMatch: does not match regular expressions
             * *   is: equal to a numeric value or matches a character
             * *   isNot: not equal to
             * *   lessThan: less than
             * *   moreThan: greater than
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * The parsing path of the assertion.
             * <p>
             * 
             * *   If the assertion type is `body_json`, the path is `json path`.
             * *   If the assertion type is `body_xml`, the path is `xml path`.
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * The numeric value or character used for matching.
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * The type of the assertion. Valid values:
             * <p>
             * 
             * *   response_time: checks whether the response time meets expectations.
             * *   status_code: checks whether the HTTP status code meets expectations.
             * *   header: checks whether the fields in the response header meet expectations.
             * *   body_text: checks whether the content in the response body meets expectations by using text matching.
             * *   body_json: checks whether the content in the response body meets expectations by using JSON parsing (JSONPath).
             * *   body_xml: checks whether the content in the response body meets expectations by using XML parsing (XPath).
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
    public static class OptionsJsonAssertions extends TeaModel {
        @NameInMap("assertions")
        private java.util.List < Assertions> assertions;

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
        public java.util.List < Assertions> getAssertions() {
            return this.assertions;
        }

        public static final class Builder {
            private java.util.List < Assertions> assertions; 

            /**
             * assertions.
             */
            public Builder assertions(java.util.List < Assertions> assertions) {
                this.assertions = assertions;
                return this;
            }

            public OptionsJsonAssertions build() {
                return new OptionsJsonAssertions(this);
            } 

        } 

    }
    public static class OptionsJson extends TeaModel {
        @NameInMap("acceptable_response_code")
        private String acceptableResponseCode;

        @NameInMap("assertions")
        private OptionsJsonAssertions assertions;

        @NameInMap("attempts")
        private Long attempts;

        @NameInMap("authentication")
        private Integer authentication;

        @NameInMap("cert_verify")
        private Boolean certVerify;

        @NameInMap("cookie")
        private String cookie;

        @NameInMap("diagnosis_mtr")
        private Boolean diagnosisMtr;

        @NameInMap("diagnosis_ping")
        private Boolean diagnosisPing;

        @NameInMap("dns_match_rule")
        private String dnsMatchRule;

        @NameInMap("dns_server")
        private String dnsServer;

        @NameInMap("dns_type")
        private String dnsType;

        @NameInMap("enable_operator_dns")
        private Boolean enableOperatorDns;

        @NameInMap("failure_rate")
        private Float failureRate;

        @NameInMap("header")
        private String header;

        @NameInMap("http_method")
        private String httpMethod;

        @NameInMap("isBase64Encode")
        private String isBase64Encode;

        @NameInMap("match_rule")
        private Integer matchRule;

        @NameInMap("password")
        private String password;

        @NameInMap("ping_num")
        private Integer pingNum;

        @NameInMap("port")
        private Integer port;

        @NameInMap("protocol")
        private String protocol;

        @NameInMap("proxy_protocol")
        private Boolean proxyProtocol;

        @NameInMap("request_content")
        private String requestContent;

        @NameInMap("request_format")
        private String requestFormat;

        @NameInMap("response_content")
        private String responseContent;

        @NameInMap("response_format")
        private String responseFormat;

        @NameInMap("retry_delay")
        private Integer retryDelay;

        @NameInMap("time_out")
        private Long timeOut;

        @NameInMap("unfollow_redirect")
        private Boolean unfollowRedirect;

        @NameInMap("username")
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

            /**
             * The acceptable status code.
             * <p>
             * 
             * >  We recommend that you configure assertions.
             */
            public Builder acceptableResponseCode(String acceptableResponseCode) {
                this.acceptableResponseCode = acceptableResponseCode;
                return this;
            }

            /**
             * The assertions.
             */
            public Builder assertions(OptionsJsonAssertions assertions) {
                this.assertions = assertions;
                return this;
            }

            /**
             * The number of retries after a DNS failure occurred.
             */
            public Builder attempts(Long attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * Indicates whether the security authentication feature is enabled. Valid values:
             * <p>
             * 
             * *   0: The feature is enabled.
             * *   1: The feature is disabled.
             */
            public Builder authentication(Integer authentication) {
                this.authentication = authentication;
                return this;
            }

            /**
             * Indicates whether the certificate is verified. Valid values:
             * <p>
             * 
             * *   false (default value): The certificate is not verified.
             * *   true: The certificate is verified.
             */
            public Builder certVerify(Boolean certVerify) {
                this.certVerify = certVerify;
                return this;
            }

            /**
             * The cookie of the HTTP request.
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * Indicates whether MTR is automatically used to diagnose network issues if a task fails. Valid values:
             * <p>
             * 
             * *   false (default value): MTR is not automatically used to diagnose network issues if a task fails.
             * *   true: MTR is automatically used to diagnose network issues if a task fails.
             */
            public Builder diagnosisMtr(Boolean diagnosisMtr) {
                this.diagnosisMtr = diagnosisMtr;
                return this;
            }

            /**
             * Indicates whether ping requests are automatically sent to detect network latency if a detection task fails. Valid values:
             * <p>
             * 
             * *   false (default value): Ping requests are not automatically sent to detect network latency if a detection task fails.
             * *   true: Ping requests are automatically sent to detect network latency if a detection task fails.
             */
            public Builder diagnosisPing(Boolean diagnosisPing) {
                this.diagnosisPing = diagnosisPing;
                return this;
            }

            /**
             * The relationship between the list of expected aliases or IP addresses and the list of DNS results. Valid values:
             * <p>
             * 
             * *   IN_DNS: The list of expected values is a subset of the list of DNS results.
             * *   DNS_IN: The list of DNS results is a subset of the list of expected values.
             * *   EQUAL: The list of DNS results is the same as the list of expected values.
             * *   ANY: The list of DNS results intersects with the list of expected values.
             */
            public Builder dnsMatchRule(String dnsMatchRule) {
                this.dnsMatchRule = dnsMatchRule;
                return this;
            }

            /**
             * The domain name or IP address of the DNS server.
             */
            public Builder dnsServer(String dnsServer) {
                this.dnsServer = dnsServer;
                return this;
            }

            /**
             * The type of the DNS record. This parameter is returned only if the TaskType parameter is set to DNS. Valid values:
             * <p>
             * 
             * *   A (default value): a record that specifies an IP address related to the specified host name or domain name.
             * *   CNAME: a record that maps multiple domain names to a domain name.
             * *   NS: a record that specifies a DNS server used to parse domain names.
             * *   MX: a record that links domain names to the address of a mail server.
             * *   TXT: a record that stores the text information of host name or domain names. The text must be 1 to 512 bytes in length. The TXT record serves as a Sender Policy Framework (SPF) record to fight against spam.
             * *   AAAA: a record that maps a domain name to the relevant IPv6 address.
             */
            public Builder dnsType(String dnsType) {
                this.dnsType = dnsType;
                return this;
            }

            /**
             * Indicates whether the DNS server of the carrier is used.
             * <p>
             * 
             * *   true (default value): The DNS server of the carrier is used.
             * *   false: The DNS server of the carrier is not used. The default DNS server or the specified DNS server is used.
             */
            public Builder enableOperatorDns(Boolean enableOperatorDns) {
                this.enableOperatorDns = enableOperatorDns;
                return this;
            }

            /**
             * The packet loss rate.
             * <p>
             * 
             * >  This parameter is returned only if the TaskType parameter is set to PING.
             */
            public Builder failureRate(Float failureRate) {
                this.failureRate = failureRate;
                return this;
            }

            /**
             * The header of the HTTP request. An HTTP header is a key-value pair in which the key and the value are separated by a colon (:). The format is `key1:value1`. Each HTTP header occupies a line.
             */
            public Builder header(String header) {
                this.header = header;
                return this;
            }

            /**
             * The HTTP request method. Valid values:
             * <p>
             * 
             * *   get
             * *   post
             * *   head
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * Indicates whether the password is decoded by using the Base64 algorithm. Valid values:
             * <p>
             * 
             * *   true: The password is decoded by using the Base64 algorithm.
             * *   false (default value): The password is not decoded by using the Base64 algorithm.
             */
            public Builder isBase64Encode(String isBase64Encode) {
                this.isBase64Encode = isBase64Encode;
                return this;
            }

            /**
             * Indicates whether the alert rule is included. Valid values:
             * <p>
             * 
             * *   0: The alert rule is included.
             * *   1: The alert rule is not included.
             */
            public Builder matchRule(Integer matchRule) {
                this.matchRule = matchRule;
                return this;
            }

            /**
             * The password of the SMTP, POP3, or FTP protocol.
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * The number of hops for the PING protocol.
             */
            public Builder pingNum(Integer pingNum) {
                this.pingNum = pingNum;
                return this;
            }

            /**
             * The port number of the TCP, UDP, SMTP, or POP3 protocol.
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * The protocol type of DNS detection. Valid values:
             * <p>
             * 
             * *   udp (default value)
             * *   tcp
             * *   tcp-tls
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * Indicates whether the PROXY protocol is enabled. Valid values:
             * <p>
             * 
             * *   false (default value): The PROXY protocol is disabled.
             * *   true: The PROXY protocol is enabled.
             */
            public Builder proxyProtocol(Boolean proxyProtocol) {
                this.proxyProtocol = proxyProtocol;
                return this;
            }

            /**
             * The content of the HTTP request.
             */
            public Builder requestContent(String requestContent) {
                this.requestContent = requestContent;
                return this;
            }

            /**
             * The format of the HTTP request. Valid values:
             * <p>
             * 
             * *   hex: hexadecimal
             * *   txt: text
             */
            public Builder requestFormat(String requestFormat) {
                this.requestFormat = requestFormat;
                return this;
            }

            /**
             * The response to the HTTP request.
             * <p>
             * 
             * *   Hexadecimal format: If the request content is a byte string and cannot be represented in printable characters, you can convert the byte string to printable characters in the hexadecimal format. If you convert the byte string to printable characters in the hexadecimal format, one byte is converted to two hexadecimal characters. For example, (byte)1 is converted to `01` and (byte)27 is converted to `1B`. If the request content is a binary array in the Java format, for example, `{(byte)1, (byte)27}`, you can convert the binary array to `011b` or `011B`. Hexadecimal characters are not case-sensitive in site monitoring tasks. You can enter `011B` in the request content and set the request_format parameter to hex.
             * *   Text format: Common text refers to strings that consist of printable characters.
             */
            public Builder responseContent(String responseContent) {
                this.responseContent = responseContent;
                return this;
            }

            /**
             * The format of the HTTP response. Valid values:
             * <p>
             * 
             * *   hex: hexadecimal
             * *   txt: text
             */
            public Builder responseFormat(String responseFormat) {
                this.responseFormat = responseFormat;
                return this;
            }

            /**
             * The number of times a failed detection request is retried.
             */
            public Builder retryDelay(Integer retryDelay) {
                this.retryDelay = retryDelay;
                return this;
            }

            /**
             * The timeout period. Unit: milliseconds.
             */
            public Builder timeOut(Long timeOut) {
                this.timeOut = timeOut;
                return this;
            }

            /**
             * Indicates whether redirects are followed if the status code 301 or 302 is returned. Valid values:
             * <p>
             * 
             * *   true: Redirects are not followed.
             * *   false (default value): Redirects are followed.
             */
            public Builder unfollowRedirect(Boolean unfollowRedirect) {
                this.unfollowRedirect = unfollowRedirect;
                return this;
            }

            /**
             * The username of the FTP, SMTP, or POP3 protocol.
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
    public static class SiteMonitor extends TeaModel {
        @NameInMap("Address")
        private String address;

        @NameInMap("AgentGroup")
        private String agentGroup;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("Interval")
        private String interval;

        @NameInMap("OptionsJson")
        private OptionsJson optionsJson;

        @NameInMap("TaskId")
        private String taskId;

        @NameInMap("TaskName")
        private String taskName;

        @NameInMap("TaskState")
        private String taskState;

        @NameInMap("TaskType")
        private String taskType;

        @NameInMap("UpdateTime")
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

            /**
             * The URL or IP address that is monitored by the site monitoring task.
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
             * The time when the site monitoring task was created.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * The interval at which detection requests are sent. Unit: minutes.
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * The extended options of the site monitoring task. The options vary based on the specified protocol. For more information, see [CreateSiteMonitor](~~115048~~).
             */
            public Builder optionsJson(OptionsJson optionsJson) {
                this.optionsJson = optionsJson;
                return this;
            }

            /**
             * The ID of the site monitoring task.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * The name of the site monitoring task.
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * The status of the task. Valid values:
             * <p>
             * 
             * *   1: The task is enabled.
             * *   2: The task is disabled.
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * The protocol that is used by the site monitoring task. Valid values: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * The time when the site monitoring task was updated.
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
    public static class SiteMonitors extends TeaModel {
        @NameInMap("SiteMonitor")
        private java.util.List < SiteMonitor> siteMonitor;

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
        public java.util.List < SiteMonitor> getSiteMonitor() {
            return this.siteMonitor;
        }

        public static final class Builder {
            private java.util.List < SiteMonitor> siteMonitor; 

            /**
             * SiteMonitor.
             */
            public Builder siteMonitor(java.util.List < SiteMonitor> siteMonitor) {
                this.siteMonitor = siteMonitor;
                return this;
            }

            public SiteMonitors build() {
                return new SiteMonitors(this);
            } 

        } 

    }
}
