// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeIstioGatewayRouteDetailResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeIstioGatewayRouteDetailResponseBody</p>
 */
public class DescribeIstioGatewayRouteDetailResponseBody extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("Namespace")
    private String namespace;

    @NameInMap("Priority")
    private Integer priority;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("RouteDetail")
    private RouteDetail routeDetail;

    @NameInMap("Status")
    private Integer status;

    private DescribeIstioGatewayRouteDetailResponseBody(Builder builder) {
        this.description = builder.description;
        this.namespace = builder.namespace;
        this.priority = builder.priority;
        this.requestId = builder.requestId;
        this.routeDetail = builder.routeDetail;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeIstioGatewayRouteDetailResponseBody create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return namespace
     */
    public String getNamespace() {
        return this.namespace;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return routeDetail
     */
    public RouteDetail getRouteDetail() {
        return this.routeDetail;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder {
        private String description; 
        private String namespace; 
        private Integer priority; 
        private String requestId; 
        private RouteDetail routeDetail; 
        private Integer status; 

        /**
         * The description of the routing rule.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * The namespace.
         */
        public Builder namespace(String namespace) {
            this.namespace = namespace;
            return this;
        }

        /**
         * The priority of the routing rule. The value of this parameter is an integer. A smaller value indicates a higher priority.
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The detailed information about the routing rule.
         */
        public Builder routeDetail(RouteDetail routeDetail) {
            this.routeDetail = routeDetail;
            return this;
        }

        /**
         * The status of the routing rule. Valid values:
         * <p>
         * 
         * *   `0`: The routing rule is valid.
         * *   `1`: The routing rule is invalid.
         * *   `2`: An error occurs during the creation or update of the routing rule.
         */
        public Builder status(Integer status) {
            this.status = status;
            return this;
        }

        public DescribeIstioGatewayRouteDetailResponseBody build() {
            return new DescribeIstioGatewayRouteDetailResponseBody(this);
        } 

    } 

    public static class Delegate extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Namespace")
        private String namespace;

        private Delegate(Builder builder) {
            this.name = builder.name;
            this.namespace = builder.namespace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delegate create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        public static final class Builder {
            private String name; 
            private String namespace; 

            /**
             * The name of the virtual service.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The namespace to which the virtual service belongs.
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            public Delegate build() {
                return new Delegate(this);
            } 

        } 

    }
    public static class Percentage extends TeaModel {
        @NameInMap("Value")
        private Float value;

        private Percentage(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Percentage create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float value; 

            /**
             * The percentage of requests that are mirrored to another destination except for the original destination, which is expressed as a decimal.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public Percentage build() {
                return new Percentage(this);
            } 

        } 

    }
    public static class Abort extends TeaModel {
        @NameInMap("HttpStatus")
        private Integer httpStatus;

        @NameInMap("Percentage")
        private Percentage percentage;

        private Abort(Builder builder) {
            this.httpStatus = builder.httpStatus;
            this.percentage = builder.percentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Abort create() {
            return builder().build();
        }

        /**
         * @return httpStatus
         */
        public Integer getHttpStatus() {
            return this.httpStatus;
        }

        /**
         * @return percentage
         */
        public Percentage getPercentage() {
            return this.percentage;
        }

        public static final class Builder {
            private Integer httpStatus; 
            private Percentage percentage; 

            /**
             * The HTTP status code.
             */
            public Builder httpStatus(Integer httpStatus) {
                this.httpStatus = httpStatus;
                return this;
            }

            /**
             * The percentage of requests that are aborted with the specified error code.
             */
            public Builder percentage(Percentage percentage) {
                this.percentage = percentage;
                return this;
            }

            public Abort build() {
                return new Abort(this);
            } 

        } 

    }
    public static class DelayPercentage extends TeaModel {
        @NameInMap("Value")
        private Float value;

        private DelayPercentage(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DelayPercentage create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float value; 

            /**
             * The percentage of requests that are aborted with the specified error code, which is expressed as a decimal.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public DelayPercentage build() {
                return new DelayPercentage(this);
            } 

        } 

    }
    public static class Delay extends TeaModel {
        @NameInMap("ExponentialDelay")
        private String exponentialDelay;

        @NameInMap("FixedDelay")
        private String fixedDelay;

        @NameInMap("Percentage")
        private DelayPercentage percentage;

        private Delay(Builder builder) {
            this.exponentialDelay = builder.exponentialDelay;
            this.fixedDelay = builder.fixedDelay;
            this.percentage = builder.percentage;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Delay create() {
            return builder().build();
        }

        /**
         * @return exponentialDelay
         */
        public String getExponentialDelay() {
            return this.exponentialDelay;
        }

        /**
         * @return fixedDelay
         */
        public String getFixedDelay() {
            return this.fixedDelay;
        }

        /**
         * @return percentage
         */
        public DelayPercentage getPercentage() {
            return this.percentage;
        }

        public static final class Builder {
            private String exponentialDelay; 
            private String fixedDelay; 
            private DelayPercentage percentage; 

            /**
             * The duration for request delay is expressed as 2 raised to the power of x. You must specify the value of x.
             */
            public Builder exponentialDelay(String exponentialDelay) {
                this.exponentialDelay = exponentialDelay;
                return this;
            }

            /**
             * The fixed duration for request delay.
             */
            public Builder fixedDelay(String fixedDelay) {
                this.fixedDelay = fixedDelay;
                return this;
            }

            /**
             * The percentage of requests to which the delay fault is injected.
             */
            public Builder percentage(DelayPercentage percentage) {
                this.percentage = percentage;
                return this;
            }

            public Delay build() {
                return new Delay(this);
            } 

        } 

    }
    public static class Fault extends TeaModel {
        @NameInMap("Abort")
        private Abort abort;

        @NameInMap("Delay")
        private Delay delay;

        private Fault(Builder builder) {
            this.abort = builder.abort;
            this.delay = builder.delay;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Fault create() {
            return builder().build();
        }

        /**
         * @return abort
         */
        public Abort getAbort() {
            return this.abort;
        }

        /**
         * @return delay
         */
        public Delay getDelay() {
            return this.delay;
        }

        public static final class Builder {
            private Abort abort; 
            private Delay delay; 

            /**
             * The configurations for aborting requests with specified error codes.
             */
            public Builder abort(Abort abort) {
                this.abort = abort;
                return this;
            }

            /**
             * The duration to delay a request.
             */
            public Builder delay(Delay delay) {
                this.delay = delay;
                return this;
            }

            public Fault build() {
                return new Fault(this);
            } 

        } 

    }
    public static class HTTPRedirect extends TeaModel {
        @NameInMap("Authority")
        private String authority;

        @NameInMap("RedirectCode")
        private Integer redirectCode;

        @NameInMap("Uri")
        private String uri;

        private HTTPRedirect(Builder builder) {
            this.authority = builder.authority;
            this.redirectCode = builder.redirectCode;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HTTPRedirect create() {
            return builder().build();
        }

        /**
         * @return authority
         */
        public String getAuthority() {
            return this.authority;
        }

        /**
         * @return redirectCode
         */
        public Integer getRedirectCode() {
            return this.redirectCode;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String authority; 
            private Integer redirectCode; 
            private String uri; 

            /**
             * The value to be used to overwrite the value of the Authority or Host header during redirection.
             */
            public Builder authority(String authority) {
                this.authority = authority;
                return this;
            }

            /**
             * The HTTP status code to be used to indicate URL redirection. Default value: 301.
             */
            public Builder redirectCode(Integer redirectCode) {
                this.redirectCode = redirectCode;
                return this;
            }

            /**
             * The value to be used to overwrite the URL path during redirection.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public HTTPRedirect build() {
                return new HTTPRedirect(this);
            } 

        } 

    }
    public static class Mirror extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("Subset")
        private String subset;

        private Mirror(Builder builder) {
            this.host = builder.host;
            this.subset = builder.subset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Mirror create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return subset
         */
        public String getSubset() {
            return this.subset;
        }

        public static final class Builder {
            private String host; 
            private String subset; 

            /**
             * The name of the service defined in the service registry.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The name of the service subset.
             */
            public Builder subset(String subset) {
                this.subset = subset;
                return this;
            }

            public Mirror build() {
                return new Mirror(this);
            } 

        } 

    }
    public static class MirrorPercentage extends TeaModel {
        @NameInMap("Value")
        private Float value;

        private MirrorPercentage(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MirrorPercentage create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Float getValue() {
            return this.value;
        }

        public static final class Builder {
            private Float value; 

            /**
             * The percentage of requests that are aborted with the specified error code, which is expressed as a decimal.
             */
            public Builder value(Float value) {
                this.value = value;
                return this;
            }

            public MirrorPercentage build() {
                return new MirrorPercentage(this);
            } 

        } 

    }
    public static class RetryRemoteLocalities extends TeaModel {
        @NameInMap("Value")
        private Boolean value;

        private RetryRemoteLocalities(Builder builder) {
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RetryRemoteLocalities create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public Boolean getValue() {
            return this.value;
        }

        public static final class Builder {
            private Boolean value; 

            /**
             * Specifies whether to allow retries to other localities. Valid values:
             * <p>
             * 
             * *   `true`
             * *   `false`
             * 
             * Default value: `false`.
             */
            public Builder value(Boolean value) {
                this.value = value;
                return this;
            }

            public RetryRemoteLocalities build() {
                return new RetryRemoteLocalities(this);
            } 

        } 

    }
    public static class Retries extends TeaModel {
        @NameInMap("Attempts")
        private Integer attempts;

        @NameInMap("PerTryTimeout")
        private String perTryTimeout;

        @NameInMap("RetryOn")
        private String retryOn;

        @NameInMap("RetryRemoteLocalities")
        private RetryRemoteLocalities retryRemoteLocalities;

        private Retries(Builder builder) {
            this.attempts = builder.attempts;
            this.perTryTimeout = builder.perTryTimeout;
            this.retryOn = builder.retryOn;
            this.retryRemoteLocalities = builder.retryRemoteLocalities;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Retries create() {
            return builder().build();
        }

        /**
         * @return attempts
         */
        public Integer getAttempts() {
            return this.attempts;
        }

        /**
         * @return perTryTimeout
         */
        public String getPerTryTimeout() {
            return this.perTryTimeout;
        }

        /**
         * @return retryOn
         */
        public String getRetryOn() {
            return this.retryOn;
        }

        /**
         * @return retryRemoteLocalities
         */
        public RetryRemoteLocalities getRetryRemoteLocalities() {
            return this.retryRemoteLocalities;
        }

        public static final class Builder {
            private Integer attempts; 
            private String perTryTimeout; 
            private String retryOn; 
            private RetryRemoteLocalities retryRemoteLocalities; 

            /**
             * The number of retries that are allowed for a request.
             */
            public Builder attempts(Integer attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * The timeout period for each retry.
             */
            public Builder perTryTimeout(String perTryTimeout) {
                this.perTryTimeout = perTryTimeout;
                return this;
            }

            /**
             * The condition for retries. Example: `connect-failure,refused-stream,503`.
             */
            public Builder retryOn(String retryOn) {
                this.retryOn = retryOn;
                return this;
            }

            /**
             * Specifies whether to allow retries to other localities.
             */
            public Builder retryRemoteLocalities(RetryRemoteLocalities retryRemoteLocalities) {
                this.retryRemoteLocalities = retryRemoteLocalities;
                return this;
            }

            public Retries build() {
                return new Retries(this);
            } 

        } 

    }
    public static class Rewrite extends TeaModel {
        @NameInMap("Authority")
        private String authority;

        @NameInMap("Uri")
        private String uri;

        private Rewrite(Builder builder) {
            this.authority = builder.authority;
            this.uri = builder.uri;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Rewrite create() {
            return builder().build();
        }

        /**
         * @return authority
         */
        public String getAuthority() {
            return this.authority;
        }

        /**
         * @return uri
         */
        public String getUri() {
            return this.uri;
        }

        public static final class Builder {
            private String authority; 
            private String uri; 

            /**
             * The value to be used to overwrite the value of the Authority or Host header.
             */
            public Builder authority(String authority) {
                this.authority = authority;
                return this;
            }

            /**
             * The value to be used to overwrite the path or prefix of the URI.
             */
            public Builder uri(String uri) {
                this.uri = uri;
                return this;
            }

            public Rewrite build() {
                return new Rewrite(this);
            } 

        } 

    }
    public static class HTTPAdvancedOptions extends TeaModel {
        @NameInMap("Delegate")
        private Delegate delegate;

        @NameInMap("Fault")
        private Fault fault;

        @NameInMap("HTTPRedirect")
        private HTTPRedirect HTTPRedirect;

        @NameInMap("Mirror")
        private Mirror mirror;

        @NameInMap("MirrorPercentage")
        private MirrorPercentage mirrorPercentage;

        @NameInMap("Retries")
        private Retries retries;

        @NameInMap("Rewrite")
        private Rewrite rewrite;

        @NameInMap("Timeout")
        private String timeout;

        private HTTPAdvancedOptions(Builder builder) {
            this.delegate = builder.delegate;
            this.fault = builder.fault;
            this.HTTPRedirect = builder.HTTPRedirect;
            this.mirror = builder.mirror;
            this.mirrorPercentage = builder.mirrorPercentage;
            this.retries = builder.retries;
            this.rewrite = builder.rewrite;
            this.timeout = builder.timeout;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HTTPAdvancedOptions create() {
            return builder().build();
        }

        /**
         * @return delegate
         */
        public Delegate getDelegate() {
            return this.delegate;
        }

        /**
         * @return fault
         */
        public Fault getFault() {
            return this.fault;
        }

        /**
         * @return HTTPRedirect
         */
        public HTTPRedirect getHTTPRedirect() {
            return this.HTTPRedirect;
        }

        /**
         * @return mirror
         */
        public Mirror getMirror() {
            return this.mirror;
        }

        /**
         * @return mirrorPercentage
         */
        public MirrorPercentage getMirrorPercentage() {
            return this.mirrorPercentage;
        }

        /**
         * @return retries
         */
        public Retries getRetries() {
            return this.retries;
        }

        /**
         * @return rewrite
         */
        public Rewrite getRewrite() {
            return this.rewrite;
        }

        /**
         * @return timeout
         */
        public String getTimeout() {
            return this.timeout;
        }

        public static final class Builder {
            private Delegate delegate; 
            private Fault fault; 
            private HTTPRedirect HTTPRedirect; 
            private Mirror mirror; 
            private MirrorPercentage mirrorPercentage; 
            private Retries retries; 
            private Rewrite rewrite; 
            private String timeout; 

            /**
             * The virtual service that defines traffic routing.
             */
            public Builder delegate(Delegate delegate) {
                this.delegate = delegate;
                return this;
            }

            /**
             * The configurations of fault injection.
             */
            public Builder fault(Fault fault) {
                this.fault = fault;
                return this;
            }

            /**
             * The HTTP redirection rule.
             */
            public Builder HTTPRedirect(HTTPRedirect HTTPRedirect) {
                this.HTTPRedirect = HTTPRedirect;
                return this;
            }

            /**
             * The configurations for mirroring HTTP traffic to another destination in addition to forwarding requests to the specified destination.
             */
            public Builder mirror(Mirror mirror) {
                this.mirror = mirror;
                return this;
            }

            /**
             * The percentage of requests that are aborted with the specified error code.
             */
            public Builder mirrorPercentage(MirrorPercentage mirrorPercentage) {
                this.mirrorPercentage = mirrorPercentage;
                return this;
            }

            /**
             * The configurations of retries for failed requests.
             */
            public Builder retries(Retries retries) {
                this.retries = retries;
                return this;
            }

            /**
             * The configurations for rewriting the virtual service.
             */
            public Builder rewrite(Rewrite rewrite) {
                this.rewrite = rewrite;
                return this;
            }

            /**
             * The timeout period for requests.
             */
            public Builder timeout(String timeout) {
                this.timeout = timeout;
                return this;
            }

            public HTTPAdvancedOptions build() {
                return new HTTPAdvancedOptions(this);
            } 

        } 

    }
    public static class Headers extends TeaModel {
        @NameInMap("MatchingContent")
        private String matchingContent;

        @NameInMap("MatchingMode")
        private String matchingMode;

        @NameInMap("Name")
        private String name;

        private Headers(Builder builder) {
            this.matchingContent = builder.matchingContent;
            this.matchingMode = builder.matchingMode;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return matchingContent
         */
        public String getMatchingContent() {
            return this.matchingContent;
        }

        /**
         * @return matchingMode
         */
        public String getMatchingMode() {
            return this.matchingMode;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String matchingContent; 
            private String matchingMode; 
            private String name; 

            /**
             * The header value to be matched.
             */
            public Builder matchingContent(String matchingContent) {
                this.matchingContent = matchingContent;
                return this;
            }

            /**
             * The matching mode for the header value. Valid values:
             * <p>
             * 
             * *   `exact`: exact match
             * *   `prefix`: match by prefix
             * *   `regex`: match by regular expression
             */
            public Builder matchingMode(String matchingMode) {
                this.matchingMode = matchingMode;
                return this;
            }

            /**
             * The header key to be matched.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    public static class TLSMatchAttributes extends TeaModel {
        @NameInMap("SNIHosts")
        private java.util.List < String > SNIHosts;

        @NameInMap("TLSPort")
        private Integer TLSPort;

        private TLSMatchAttributes(Builder builder) {
            this.SNIHosts = builder.SNIHosts;
            this.TLSPort = builder.TLSPort;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TLSMatchAttributes create() {
            return builder().build();
        }

        /**
         * @return SNIHosts
         */
        public java.util.List < String > getSNIHosts() {
            return this.SNIHosts;
        }

        /**
         * @return TLSPort
         */
        public Integer getTLSPort() {
            return this.TLSPort;
        }

        public static final class Builder {
            private java.util.List < String > SNIHosts; 
            private Integer TLSPort; 

            /**
             * The Server Name Indication (SNI) values to be matched.
             */
            public Builder SNIHosts(java.util.List < String > SNIHosts) {
                this.SNIHosts = SNIHosts;
                return this;
            }

            /**
             * The TLS port.
             */
            public Builder TLSPort(Integer TLSPort) {
                this.TLSPort = TLSPort;
                return this;
            }

            public TLSMatchAttributes build() {
                return new TLSMatchAttributes(this);
            } 

        } 

    }
    public static class URI extends TeaModel {
        @NameInMap("MatchingContent")
        private String matchingContent;

        @NameInMap("MatchingMode")
        private String matchingMode;

        private URI(Builder builder) {
            this.matchingContent = builder.matchingContent;
            this.matchingMode = builder.matchingMode;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static URI create() {
            return builder().build();
        }

        /**
         * @return matchingContent
         */
        public String getMatchingContent() {
            return this.matchingContent;
        }

        /**
         * @return matchingMode
         */
        public String getMatchingMode() {
            return this.matchingMode;
        }

        public static final class Builder {
            private String matchingContent; 
            private String matchingMode; 

            /**
             * The content to be matched.
             */
            public Builder matchingContent(String matchingContent) {
                this.matchingContent = matchingContent;
                return this;
            }

            /**
             * The matching mode. Valid values:
             * <p>
             * 
             * *   `exact`: exact match
             * *   `prefix`: match by prefix
             * *   `regex`: match by regular expression
             */
            public Builder matchingMode(String matchingMode) {
                this.matchingMode = matchingMode;
                return this;
            }

            public URI build() {
                return new URI(this);
            } 

        } 

    }
    public static class MatchRequest extends TeaModel {
        @NameInMap("Headers")
        private java.util.List < Headers> headers;

        @NameInMap("Ports")
        private java.util.List < Integer > ports;

        @NameInMap("TLSMatchAttributes")
        private java.util.List < TLSMatchAttributes> TLSMatchAttributes;

        @NameInMap("URI")
        private URI URI;

        private MatchRequest(Builder builder) {
            this.headers = builder.headers;
            this.ports = builder.ports;
            this.TLSMatchAttributes = builder.TLSMatchAttributes;
            this.URI = builder.URI;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchRequest create() {
            return builder().build();
        }

        /**
         * @return headers
         */
        public java.util.List < Headers> getHeaders() {
            return this.headers;
        }

        /**
         * @return ports
         */
        public java.util.List < Integer > getPorts() {
            return this.ports;
        }

        /**
         * @return TLSMatchAttributes
         */
        public java.util.List < TLSMatchAttributes> getTLSMatchAttributes() {
            return this.TLSMatchAttributes;
        }

        /**
         * @return URI
         */
        public URI getURI() {
            return this.URI;
        }

        public static final class Builder {
            private java.util.List < Headers> headers; 
            private java.util.List < Integer > ports; 
            private java.util.List < TLSMatchAttributes> TLSMatchAttributes; 
            private URI URI; 

            /**
             * The request headers to be matched.
             */
            public Builder headers(java.util.List < Headers> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * The ports.
             */
            public Builder ports(java.util.List < Integer > ports) {
                this.ports = ports;
                return this;
            }

            /**
             * The matching rules for Transport Layer Security (TLS) traffic.
             */
            public Builder TLSMatchAttributes(java.util.List < TLSMatchAttributes> TLSMatchAttributes) {
                this.TLSMatchAttributes = TLSMatchAttributes;
                return this;
            }

            /**
             * The matching rule for URIs.
             */
            public Builder URI(URI URI) {
                this.URI = URI;
                return this;
            }

            public MatchRequest build() {
                return new MatchRequest(this);
            } 

        } 

    }
    public static class Port extends TeaModel {
        @NameInMap("Number")
        private Integer number;

        private Port(Builder builder) {
            this.number = builder.number;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Port create() {
            return builder().build();
        }

        /**
         * @return number
         */
        public Integer getNumber() {
            return this.number;
        }

        public static final class Builder {
            private Integer number; 

            /**
             * The ports of the specified hosts to which the traffic is routed.
             */
            public Builder number(Integer number) {
                this.number = number;
                return this;
            }

            public Port build() {
                return new Port(this);
            } 

        } 

    }
    public static class Destination extends TeaModel {
        @NameInMap("Host")
        private String host;

        @NameInMap("Port")
        private Port port;

        @NameInMap("Subset")
        private String subset;

        private Destination(Builder builder) {
            this.host = builder.host;
            this.port = builder.port;
            this.subset = builder.subset;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Destination create() {
            return builder().build();
        }

        /**
         * @return host
         */
        public String getHost() {
            return this.host;
        }

        /**
         * @return port
         */
        public Port getPort() {
            return this.port;
        }

        /**
         * @return subset
         */
        public String getSubset() {
            return this.subset;
        }

        public static final class Builder {
            private String host; 
            private Port port; 
            private String subset; 

            /**
             * The name of the service defined in the service registry.
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * The ports of the specified hosts from which the traffic is routed.
             */
            public Builder port(Port port) {
                this.port = port;
                return this;
            }

            /**
             * The name of the service subset.
             */
            public Builder subset(String subset) {
                this.subset = subset;
                return this;
            }

            public Destination build() {
                return new Destination(this);
            } 

        } 

    }
    public static class Request extends TeaModel {
        @NameInMap("Add")
        private java.util.Map < String, ? > add;

        @NameInMap("Remove")
        private java.util.List < String > remove;

        @NameInMap("Set")
        private java.util.Map < String, String > set;

        private Request(Builder builder) {
            this.add = builder.add;
            this.remove = builder.remove;
            this.set = builder.set;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Request create() {
            return builder().build();
        }

        /**
         * @return add
         */
        public java.util.Map < String, ? > getAdd() {
            return this.add;
        }

        /**
         * @return remove
         */
        public java.util.List < String > getRemove() {
            return this.remove;
        }

        /**
         * @return set
         */
        public java.util.Map < String, String > getSet() {
            return this.set;
        }

        public static final class Builder {
            private java.util.Map < String, ? > add; 
            private java.util.List < String > remove; 
            private java.util.Map < String, String > set; 

            /**
             * The values to be added to the header key.
             */
            public Builder add(java.util.Map < String, ? > add) {
                this.add = add;
                return this;
            }

            /**
             * The header value to be deleted.
             */
            public Builder remove(java.util.List < String > remove) {
                this.remove = remove;
                return this;
            }

            /**
             * The header key to be used to overwrite the original header key.
             */
            public Builder set(java.util.Map < String, String > set) {
                this.set = set;
                return this;
            }

            public Request build() {
                return new Request(this);
            } 

        } 

    }
    public static class Response extends TeaModel {
        @NameInMap("Add")
        private java.util.Map < String, ? > add;

        @NameInMap("Remove")
        private java.util.List < String > remove;

        @NameInMap("Set")
        private java.util.Map < String, ? > set;

        private Response(Builder builder) {
            this.add = builder.add;
            this.remove = builder.remove;
            this.set = builder.set;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Response create() {
            return builder().build();
        }

        /**
         * @return add
         */
        public java.util.Map < String, ? > getAdd() {
            return this.add;
        }

        /**
         * @return remove
         */
        public java.util.List < String > getRemove() {
            return this.remove;
        }

        /**
         * @return set
         */
        public java.util.Map < String, ? > getSet() {
            return this.set;
        }

        public static final class Builder {
            private java.util.Map < String, ? > add; 
            private java.util.List < String > remove; 
            private java.util.Map < String, ? > set; 

            /**
             * The values to be added to the header key.
             */
            public Builder add(java.util.Map < String, ? > add) {
                this.add = add;
                return this;
            }

            /**
             * The header value to be deleted.
             */
            public Builder remove(java.util.List < String > remove) {
                this.remove = remove;
                return this;
            }

            /**
             * The header key to be used to overwrite the original header key.
             */
            public Builder set(java.util.Map < String, ? > set) {
                this.set = set;
                return this;
            }

            public Response build() {
                return new Response(this);
            } 

        } 

    }
    public static class RouteDestinationsHeaders extends TeaModel {
        @NameInMap("Request")
        private Request request;

        @NameInMap("Response")
        private Response response;

        private RouteDestinationsHeaders(Builder builder) {
            this.request = builder.request;
            this.response = builder.response;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteDestinationsHeaders create() {
            return builder().build();
        }

        /**
         * @return request
         */
        public Request getRequest() {
            return this.request;
        }

        /**
         * @return response
         */
        public Response getResponse() {
            return this.response;
        }

        public static final class Builder {
            private Request request; 
            private Response response; 

            /**
             * The request header to be matched.
             */
            public Builder request(Request request) {
                this.request = request;
                return this;
            }

            /**
             * The processing of the headers of the response that is to be returned.
             */
            public Builder response(Response response) {
                this.response = response;
                return this;
            }

            public RouteDestinationsHeaders build() {
                return new RouteDestinationsHeaders(this);
            } 

        } 

    }
    public static class RouteDestinations extends TeaModel {
        @NameInMap("Destination")
        private Destination destination;

        @NameInMap("Headers")
        private RouteDestinationsHeaders headers;

        @NameInMap("Weight")
        private Integer weight;

        private RouteDestinations(Builder builder) {
            this.destination = builder.destination;
            this.headers = builder.headers;
            this.weight = builder.weight;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteDestinations create() {
            return builder().build();
        }

        /**
         * @return destination
         */
        public Destination getDestination() {
            return this.destination;
        }

        /**
         * @return headers
         */
        public RouteDestinationsHeaders getHeaders() {
            return this.headers;
        }

        /**
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Destination destination; 
            private RouteDestinationsHeaders headers; 
            private Integer weight; 

            /**
             * The unique endpoint of the destination service to which the specified requests are sent.
             */
            public Builder destination(Destination destination) {
                this.destination = destination;
                return this;
            }

            /**
             * The list of the request headers to be matched.
             */
            public Builder headers(RouteDestinationsHeaders headers) {
                this.headers = headers;
                return this;
            }

            /**
             * The traffic weight. Valid values: 1 to 100.
             */
            public Builder weight(Integer weight) {
                this.weight = weight;
                return this;
            }

            public RouteDestinations build() {
                return new RouteDestinations(this);
            } 

        } 

    }
    public static class RouteDetail extends TeaModel {
        @NameInMap("Domains")
        private java.util.List < String > domains;

        @NameInMap("HTTPAdvancedOptions")
        private HTTPAdvancedOptions HTTPAdvancedOptions;

        @NameInMap("HasUnsafeFeatures")
        private Boolean hasUnsafeFeatures;

        @NameInMap("MatchRequest")
        private MatchRequest matchRequest;

        @NameInMap("RawVSRoute")
        private String rawVSRoute;

        @NameInMap("RouteDestinations")
        private java.util.List < RouteDestinations> routeDestinations;

        @NameInMap("RouteName")
        private String routeName;

        @NameInMap("RouteType")
        private String routeType;

        private RouteDetail(Builder builder) {
            this.domains = builder.domains;
            this.HTTPAdvancedOptions = builder.HTTPAdvancedOptions;
            this.hasUnsafeFeatures = builder.hasUnsafeFeatures;
            this.matchRequest = builder.matchRequest;
            this.rawVSRoute = builder.rawVSRoute;
            this.routeDestinations = builder.routeDestinations;
            this.routeName = builder.routeName;
            this.routeType = builder.routeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RouteDetail create() {
            return builder().build();
        }

        /**
         * @return domains
         */
        public java.util.List < String > getDomains() {
            return this.domains;
        }

        /**
         * @return HTTPAdvancedOptions
         */
        public HTTPAdvancedOptions getHTTPAdvancedOptions() {
            return this.HTTPAdvancedOptions;
        }

        /**
         * @return hasUnsafeFeatures
         */
        public Boolean getHasUnsafeFeatures() {
            return this.hasUnsafeFeatures;
        }

        /**
         * @return matchRequest
         */
        public MatchRequest getMatchRequest() {
            return this.matchRequest;
        }

        /**
         * @return rawVSRoute
         */
        public String getRawVSRoute() {
            return this.rawVSRoute;
        }

        /**
         * @return routeDestinations
         */
        public java.util.List < RouteDestinations> getRouteDestinations() {
            return this.routeDestinations;
        }

        /**
         * @return routeName
         */
        public String getRouteName() {
            return this.routeName;
        }

        /**
         * @return routeType
         */
        public String getRouteType() {
            return this.routeType;
        }

        public static final class Builder {
            private java.util.List < String > domains; 
            private HTTPAdvancedOptions HTTPAdvancedOptions; 
            private Boolean hasUnsafeFeatures; 
            private MatchRequest matchRequest; 
            private String rawVSRoute; 
            private java.util.List < RouteDestinations> routeDestinations; 
            private String routeName; 
            private String routeType; 

            /**
             * Domains.
             */
            public Builder domains(java.util.List < String > domains) {
                this.domains = domains;
                return this;
            }

            /**
             * The advanced settings for routing HTTP traffic.
             */
            public Builder HTTPAdvancedOptions(HTTPAdvancedOptions HTTPAdvancedOptions) {
                this.HTTPAdvancedOptions = HTTPAdvancedOptions;
                return this;
            }

            /**
             * If the value is true, the original YAML file contains features that are not supported on the current interface.
             */
            public Builder hasUnsafeFeatures(Boolean hasUnsafeFeatures) {
                this.hasUnsafeFeatures = hasUnsafeFeatures;
                return this;
            }

            /**
             * The matching rules for traffic routing.
             */
            public Builder matchRequest(MatchRequest matchRequest) {
                this.matchRequest = matchRequest;
                return this;
            }

            /**
             * The original YAML file of the virtual service that is serialized into a JSON string.
             */
            public Builder rawVSRoute(String rawVSRoute) {
                this.rawVSRoute = rawVSRoute;
                return this;
            }

            /**
             * The endpoints of destination services for Layer 4 weighted routing.
             */
            public Builder routeDestinations(java.util.List < RouteDestinations> routeDestinations) {
                this.routeDestinations = routeDestinations;
                return this;
            }

            /**
             * The name of the routing rule.
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * The type of the traffic to be routed. Valid values: `HTTP`, `TLS`, and `TCP`.
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            public RouteDetail build() {
                return new RouteDetail(this);
            } 

        } 

    }
}
