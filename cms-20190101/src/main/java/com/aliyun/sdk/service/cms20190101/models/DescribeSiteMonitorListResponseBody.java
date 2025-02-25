// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

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
         * <p>The status code.</p>
         * <blockquote>
         * <p> The status code 200 indicates that the request was successful.</p>
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
         * <p>The site monitoring tasks that are returned.</p>
         */
        public Builder siteMonitors(SiteMonitors siteMonitors) {
            this.siteMonitors = siteMonitors;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
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
         * <p>The total number of entries returned.</p>
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

            /**
             * <p>The comparison operator of the assertion. Valid values:</p>
             * <ul>
             * <li>contains: contains</li>
             * <li>doesNotContain: does not contain</li>
             * <li>matches: matches regular expressions</li>
             * <li>doesNotMatch: does not match regular expressions</li>
             * <li>is: equal to a numeric value or matches a character</li>
             * <li>isNot: not equal to</li>
             * <li>lessThan: less than</li>
             * <li>moreThan: greater than</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>lessThan</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The parsing path of the assertion.</p>
             * <ul>
             * <li>If the assertion type is <code>body_json</code>, the path is <code>json path</code>.</li>
             * <li>If the assertion type is <code>body_xml</code>, the path is <code>xml path</code>.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>json path</p>
             */
            public Builder property(String property) {
                this.property = property;
                return this;
            }

            /**
             * <p>The numeric value or character used for matching.</p>
             * 
             * <strong>example:</strong>
             * <p>1000</p>
             */
            public Builder target(String target) {
                this.target = target;
                return this;
            }

            /**
             * <p>The assertion type. Valid values:</p>
             * <ul>
             * <li>response_time: checks whether the response time meets expectations.</li>
             * <li>status_code: checks whether the HTTP status code meets expectations.</li>
             * <li>header: checks whether the fields in the response header meet expectations.</li>
             * <li>body_text: checks whether the content in the response body meets expectations by using text matching.</li>
             * <li>body_json: checks whether the content in the response body meets expectations by using JSON parsing (JSONPath).</li>
             * <li>body_xml: checks whether the content in the response body meets expectations by using XML parsing (XPath).</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>response_time</p>
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

            /**
             * <p>The acceptable status code.</p>
             * <blockquote>
             * <p> We recommend that you configure assertions.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder acceptableResponseCode(String acceptableResponseCode) {
                this.acceptableResponseCode = acceptableResponseCode;
                return this;
            }

            /**
             * <p>The assertions.</p>
             */
            public Builder assertions(OptionsJsonAssertions assertions) {
                this.assertions = assertions;
                return this;
            }

            /**
             * <p>The number of retries after a DNS failure occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder attempts(Long attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * <p>Indicates whether the security authentication feature is enabled. Valid values:</p>
             * <ul>
             * <li>0: The feature is enabled.</li>
             * <li>1: The feature is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder authentication(Integer authentication) {
                this.authentication = authentication;
                return this;
            }

            /**
             * <p>Indicates whether the certificate is verified. Valid values:</p>
             * <ul>
             * <li>false (default): The certificate is not verified.</li>
             * <li>true: The certificate is verified.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder certVerify(Boolean certVerify) {
                this.certVerify = certVerify;
                return this;
            }

            /**
             * <p>The cookie of the HTTP request.</p>
             * 
             * <strong>example:</strong>
             * <p>lang=en</p>
             */
            public Builder cookie(String cookie) {
                this.cookie = cookie;
                return this;
            }

            /**
             * <p>Indicates whether MTR is automatically used to diagnose network issues if a task fails. Valid values:</p>
             * <ul>
             * <li>false (default): MTR is not automatically used to diagnose network issues if a task fails.</li>
             * <li>true: MTR is automatically used to diagnose network issues if a task fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder diagnosisMtr(Boolean diagnosisMtr) {
                this.diagnosisMtr = diagnosisMtr;
                return this;
            }

            /**
             * <p>Indicates whether ping requests are automatically sent to detect network latency if a detection task fails. Valid values:</p>
             * <ul>
             * <li>false (default): Ping requests are not automatically sent to detect network latency if a detection task fails.</li>
             * <li>true: Ping requests are automatically sent to detect network latency if a detection task fails.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder diagnosisPing(Boolean diagnosisPing) {
                this.diagnosisPing = diagnosisPing;
                return this;
            }

            /**
             * <p>The relationship between the list of expected aliases or IP addresses and the list of DNS results. Valid values:</p>
             * <ul>
             * <li>IN_DNS: The list of expected values is a subset of the list of DNS results.</li>
             * <li>DNS_IN: The list of DNS results is a subset of the list of expected values.</li>
             * <li>EQUAL: The list of DNS results is the same as the list of expected values.</li>
             * <li>ANY: The list of DNS results intersects with the list of expected values.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IN_DNS</p>
             */
            public Builder dnsMatchRule(String dnsMatchRule) {
                this.dnsMatchRule = dnsMatchRule;
                return this;
            }

            /**
             * <p>The domain name or IP address of the DNS server.</p>
             * 
             * <strong>example:</strong>
             * <p>192.168.XX.XX</p>
             */
            public Builder dnsServer(String dnsServer) {
                this.dnsServer = dnsServer;
                return this;
            }

            /**
             * <p>The type of the DNS record. This parameter is returned only if the TaskType parameter is set to DNS. Valid values:</p>
             * <ul>
             * <li>A (default): a record that specifies an IP address related to the specified host name or domain name.</li>
             * <li>CNAME: a record that maps multiple domain names to a domain name.</li>
             * <li>NS: a record that specifies a DNS server used to parse domain names.</li>
             * <li>MX: a record that links domain names to the address of a mail server.</li>
             * <li>TXT: a record that stores the text information of host name or domain names. The text must be 1 to 512 bytes in length. The TXT record serves as a Sender Policy Framework (SPF) record to fight against spam.</li>
             * <li>AAAA: a record that maps a domain name to the relevant IPv6 address.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>A</p>
             */
            public Builder dnsType(String dnsType) {
                this.dnsType = dnsType;
                return this;
            }

            /**
             * <p>Indicates whether the DNS server of the carrier is used.</p>
             * <ul>
             * <li>true (default): The DNS server of the carrier is used.</li>
             * <li>false: The DNS server of the carrier is not used. The default DNS server or the specified DNS server is used.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder enableOperatorDns(Boolean enableOperatorDns) {
                this.enableOperatorDns = enableOperatorDns;
                return this;
            }

            /**
             * <p>The packet loss rate.</p>
             * <blockquote>
             * <p> This parameter is returned only if the TaskType parameter is set to PING.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>0.5</p>
             */
            public Builder failureRate(Float failureRate) {
                this.failureRate = failureRate;
                return this;
            }

            /**
             * <p>The header of the HTTP request. An HTTP header is a key-value pair in which the key and the value are separated by a colon (:). The format is <code>key1:value1</code>. Each HTTP header occupies a line.</p>
             * 
             * <strong>example:</strong>
             * <p>testKey:testValue</p>
             */
            public Builder header(String header) {
                this.header = header;
                return this;
            }

            /**
             * <p>The HTTP request method. Valid values:</p>
             * <ul>
             * <li>get</li>
             * <li>post</li>
             * <li>head</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>get</p>
             */
            public Builder httpMethod(String httpMethod) {
                this.httpMethod = httpMethod;
                return this;
            }

            /**
             * <p>Indicates whether the password is decoded by using the Base64 algorithm. Valid values:</p>
             * <ul>
             * <li>true: The password is decoded by using the Base64 algorithm.</li>
             * <li>false (default): The password is not decoded by using the Base64 algorithm.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isBase64Encode(String isBase64Encode) {
                this.isBase64Encode = isBase64Encode;
                return this;
            }

            /**
             * <p>Indicates whether the alert rule is included. Valid values:</p>
             * <ul>
             * <li>0: The alert rule is included.</li>
             * <li>1: The alert rule is not included.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder matchRule(Integer matchRule) {
                this.matchRule = matchRule;
                return this;
            }

            /**
             * <p>The password of the SMTP, POP3, or FTP protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>123****</p>
             */
            public Builder password(String password) {
                this.password = password;
                return this;
            }

            /**
             * <p>The number of hops for the PING protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pingNum(Integer pingNum) {
                this.pingNum = pingNum;
                return this;
            }

            /**
             * <p>The port number of the TCP, UDP, SMTP, or POP3 protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
             */
            public Builder port(Integer port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The protocol type of DNS detection. Valid values:</p>
             * <ul>
             * <li>udp (default)</li>
             * <li>tcp</li>
             * <li>tcp-tls</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>udp</p>
             */
            public Builder protocol(String protocol) {
                this.protocol = protocol;
                return this;
            }

            /**
             * <p>Indicates whether the PROXY protocol is enabled. Valid values:</p>
             * <ul>
             * <li>false (default): The PROXY protocol is disabled.</li>
             * <li>true: The PROXY protocol is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder proxyProtocol(Boolean proxyProtocol) {
                this.proxyProtocol = proxyProtocol;
                return this;
            }

            /**
             * <p>The content of the HTTP request.</p>
             * 
             * <strong>example:</strong>
             * <p>cf0f85</p>
             */
            public Builder requestContent(String requestContent) {
                this.requestContent = requestContent;
                return this;
            }

            /**
             * <p>The format of the HTTP request. Valid values:</p>
             * <ul>
             * <li>hex: hexadecimal</li>
             * <li>txt: text</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hex</p>
             */
            public Builder requestFormat(String requestFormat) {
                this.requestFormat = requestFormat;
                return this;
            }

            /**
             * <p>The response to the HTTP request.</p>
             * <ul>
             * <li>Hexadecimal format: If the request content is a byte string and cannot be represented in printable characters, you can convert the byte string to printable characters in the hexadecimal format. If you convert the byte string to printable characters in the hexadecimal format, one byte is converted to two hexadecimal characters. For example, (byte)1 is converted to <code>01</code> and (byte)27 is converted to <code>1B</code>. If the request content is a binary array in the Java format, for example, <code>{(byte)1, (byte)27}</code>, you can convert the binary array to <code>011b</code> or <code>011B</code>. Hexadecimal characters are not case-sensitive in site monitoring tasks. You can enter <code>011B</code> in the request content and set the request_format parameter to hex.</li>
             * <li>Text format: Common text refers to strings that consist of printable characters.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>cf0f85</p>
             */
            public Builder responseContent(String responseContent) {
                this.responseContent = responseContent;
                return this;
            }

            /**
             * <p>The format of the HTTP response. Valid values:</p>
             * <ul>
             * <li>hex: hexadecimal</li>
             * <li>txt: text</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>hex</p>
             */
            public Builder responseFormat(String responseFormat) {
                this.responseFormat = responseFormat;
                return this;
            }

            /**
             * <p>The number of times a failed detection request is retried.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder retryDelay(Integer retryDelay) {
                this.retryDelay = retryDelay;
                return this;
            }

            /**
             * <p>The timeout period. Unit: milliseconds.</p>
             * 
             * <strong>example:</strong>
             * <p>3000</p>
             */
            public Builder timeOut(Long timeOut) {
                this.timeOut = timeOut;
                return this;
            }

            /**
             * <p>Indicates whether redirects are followed if the status code 301 or 302 is returned. Valid values:</p>
             * <ul>
             * <li>true: Redirects are not followed.</li>
             * <li>false (default): Redirects are followed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder unfollowRedirect(Boolean unfollowRedirect) {
                this.unfollowRedirect = unfollowRedirect;
                return this;
            }

            /**
             * <p>The username of the FTP, SMTP, or POP3 protocol.</p>
             * 
             * <strong>example:</strong>
             * <p>testUser</p>
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

            /**
             * <p>The URL or IP address that is monitored by the site monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
             */
            public Builder address(String address) {
                this.address = address;
                return this;
            }

            /**
             * <p>The detection point type. Valid values:</p>
             * <ul>
             * <li>PC</li>
             * <li>MOBILE</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PC</p>
             */
            public Builder agentGroup(String agentGroup) {
                this.agentGroup = agentGroup;
                return this;
            }

            /**
             * <p>The time when the site monitoring task was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-11-01 11:05:18</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The interval at which detection requests are sent. Unit: minutes.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder interval(String interval) {
                this.interval = interval;
                return this;
            }

            /**
             * <p>The extended options of the site monitoring task. The options vary based on the specified protocol. For more information, see <a href="https://help.aliyun.com/document_detail/115048.html">CreateSiteMonitor</a>.</p>
             */
            public Builder optionsJson(OptionsJson optionsJson) {
                this.optionsJson = optionsJson;
                return this;
            }

            /**
             * <p>The ID of the site monitoring task.</p>
             * 
             * <strong>example:</strong>
             * <p>f5783760-1b39-4b6b-80e8-453d962a****</p>
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            /**
             * <p>The name of the site monitoring task.</p>
             */
            public Builder taskName(String taskName) {
                this.taskName = taskName;
                return this;
            }

            /**
             * <p>The task status. Valid values:</p>
             * <ul>
             * <li>1: The task is enabled.</li>
             * <li>2: The task is disabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder taskState(String taskState) {
                this.taskState = taskState;
                return this;
            }

            /**
             * <p>The protocol that is used by the site monitoring task. Valid values: HTTP, PING, TCP, UDP, DNS, SMTP, POP3, and FTP.</p>
             * 
             * <strong>example:</strong>
             * <p>TCP</p>
             */
            public Builder taskType(String taskType) {
                this.taskType = taskType;
                return this;
            }

            /**
             * <p>The time when the site monitoring task was updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-03-08 17:14:31</p>
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
