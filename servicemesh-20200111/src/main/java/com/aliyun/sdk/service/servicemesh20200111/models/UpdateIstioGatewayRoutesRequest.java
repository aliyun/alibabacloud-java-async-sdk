// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link UpdateIstioGatewayRoutesRequest} extends {@link RequestModel}
 *
 * <p>UpdateIstioGatewayRoutesRequest</p>
 */
public class UpdateIstioGatewayRoutesRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GatewayRoute")
    private GatewayRoute gatewayRoute;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IstioGatewayName")
    private String istioGatewayName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Priority")
    private Integer priority;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String serviceMeshId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Status")
    private Integer status;

    private UpdateIstioGatewayRoutesRequest(Builder builder) {
        super(builder);
        this.description = builder.description;
        this.gatewayRoute = builder.gatewayRoute;
        this.istioGatewayName = builder.istioGatewayName;
        this.priority = builder.priority;
        this.serviceMeshId = builder.serviceMeshId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIstioGatewayRoutesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return gatewayRoute
     */
    public GatewayRoute getGatewayRoute() {
        return this.gatewayRoute;
    }

    /**
     * @return istioGatewayName
     */
    public String getIstioGatewayName() {
        return this.istioGatewayName;
    }

    /**
     * @return priority
     */
    public Integer getPriority() {
        return this.priority;
    }

    /**
     * @return serviceMeshId
     */
    public String getServiceMeshId() {
        return this.serviceMeshId;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<UpdateIstioGatewayRoutesRequest, Builder> {
        private String description; 
        private GatewayRoute gatewayRoute; 
        private String istioGatewayName; 
        private Integer priority; 
        private String serviceMeshId; 
        private Integer status; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIstioGatewayRoutesRequest request) {
            super(request);
            this.description = request.description;
            this.gatewayRoute = request.gatewayRoute;
            this.istioGatewayName = request.istioGatewayName;
            this.priority = request.priority;
            this.serviceMeshId = request.serviceMeshId;
            this.status = request.status;
        } 

        /**
         * <p>The description of the routing rule.</p>
         * 
         * <strong>example:</strong>
         * <p>demo route</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The information about the routing rule to be updated for the ASM gateway.</p>
         */
        public Builder gatewayRoute(GatewayRoute gatewayRoute) {
            String gatewayRouteShrink = shrink(gatewayRoute, "GatewayRoute", "json");
            this.putBodyParameter("GatewayRoute", gatewayRouteShrink);
            this.gatewayRoute = gatewayRoute;
            return this;
        }

        /**
         * <p>The name of the ASM gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>ingressgateway</p>
         */
        public Builder istioGatewayName(String istioGatewayName) {
            this.putBodyParameter("IstioGatewayName", istioGatewayName);
            this.istioGatewayName = istioGatewayName;
            return this;
        }

        /**
         * <p>The priority of the routing rule. The value of this parameter is an integer. A smaller value indicates a higher priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder priority(Integer priority) {
            this.putBodyParameter("Priority", priority);
            this.priority = priority;
            return this;
        }

        /**
         * <p>The ASM instance ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>c08ba3fd1e6484b0f8cc1ad8fe10d****</p>
         */
        public Builder serviceMeshId(String serviceMeshId) {
            this.putBodyParameter("ServiceMeshId", serviceMeshId);
            this.serviceMeshId = serviceMeshId;
            return this;
        }

        /**
         * <p>The status of the routing rule. Valid values:</p>
         * <ul>
         * <li><code>0</code>: The routing rule is valid.</li>
         * <li><code>1</code>: The routing rule is invalid.</li>
         * <li><code>2</code>: An error occurs during the creation or update of the routing rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder status(Integer status) {
            this.putBodyParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public UpdateIstioGatewayRoutesRequest build() {
            return new UpdateIstioGatewayRoutesRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class Delegate extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Namespace")
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

            private Builder() {
            } 

            private Builder(Delegate model) {
                this.name = model.name;
                this.namespace = model.namespace;
            } 

            /**
             * <p>The name of the virtual service.</p>
             * 
             * <strong>example:</strong>
             * <p>reviews</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The namespace to which the virtual service belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class Percentage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(Percentage model) {
                this.value = model.value;
            } 

            /**
             * <p>The percentage of requests that are aborted with the specified error code, which is expressed as a decimal.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class Abort extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("HttpStatus")
        private Integer httpStatus;

        @com.aliyun.core.annotation.NameInMap("Percentage")
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

            private Builder() {
            } 

            private Builder(Abort model) {
                this.httpStatus = model.httpStatus;
                this.percentage = model.percentage;
            } 

            /**
             * <p>The HTTP status code.</p>
             * 
             * <strong>example:</strong>
             * <p>400</p>
             */
            public Builder httpStatus(Integer httpStatus) {
                this.httpStatus = httpStatus;
                return this;
            }

            /**
             * <p>The percentage of requests that are aborted with the specified error code.</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class DelayPercentage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(DelayPercentage model) {
                this.value = model.value;
            } 

            /**
             * <p>The percentage of requests to which the delay fault is injected, which is expressed as a decimal.</p>
             * 
             * <strong>example:</strong>
             * <p>0.1</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class Delay extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("FixedDelay")
        private String fixedDelay;

        @com.aliyun.core.annotation.NameInMap("Percentage")
        private DelayPercentage percentage;

        private Delay(Builder builder) {
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
            private String fixedDelay; 
            private DelayPercentage percentage; 

            private Builder() {
            } 

            private Builder(Delay model) {
                this.fixedDelay = model.fixedDelay;
                this.percentage = model.percentage;
            } 

            /**
             * <p>The fixed duration for request delay.</p>
             * 
             * <strong>example:</strong>
             * <p>5s</p>
             */
            public Builder fixedDelay(String fixedDelay) {
                this.fixedDelay = fixedDelay;
                return this;
            }

            /**
             * <p>The percentage of requests to which the delay fault is injected.</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class Fault extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Abort")
        private Abort abort;

        @com.aliyun.core.annotation.NameInMap("Delay")
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

            private Builder() {
            } 

            private Builder(Fault model) {
                this.abort = model.abort;
                this.delay = model.delay;
            } 

            /**
             * <p>The configurations for aborting requests with specified error codes.</p>
             */
            public Builder abort(Abort abort) {
                this.abort = abort;
                return this;
            }

            /**
             * <p>The duration to delay a request.</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class HTTPRedirect extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authority")
        private String authority;

        @com.aliyun.core.annotation.NameInMap("RedirectCode")
        private Integer redirectCode;

        @com.aliyun.core.annotation.NameInMap("Uri")
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

            private Builder() {
            } 

            private Builder(HTTPRedirect model) {
                this.authority = model.authority;
                this.redirectCode = model.redirectCode;
                this.uri = model.uri;
            } 

            /**
             * <p>The value to be used to overwrite the value of the Authority or Host header during redirection.</p>
             * 
             * <strong>example:</strong>
             * <p>newratings.default.svc.cluster.local</p>
             */
            public Builder authority(String authority) {
                this.authority = authority;
                return this;
            }

            /**
             * <p>The HTTP status code to be used to indicate URL redirection. Default value: 301.</p>
             * 
             * <strong>example:</strong>
             * <p>301</p>
             */
            public Builder redirectCode(Integer redirectCode) {
                this.redirectCode = redirectCode;
                return this;
            }

            /**
             * <p>The value to be used to overwrite the URL path during redirection.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/getProductRatings</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class Mirror extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Subset")
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

            private Builder() {
            } 

            private Builder(Mirror model) {
                this.host = model.host;
                this.subset = model.subset;
            } 

            /**
             * <p>The name of the service defined in the service registry.</p>
             * 
             * <strong>example:</strong>
             * <p>reviews.default.svc.cluster.local</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The name of the service subset.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class MirrorPercentage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(MirrorPercentage model) {
                this.value = model.value;
            } 

            /**
             * <p>The percentage of requests that are mirrored to another destination except for the original destination, which is expressed as a decimal.</p>
             * 
             * <strong>example:</strong>
             * <p>0.2</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class RetryRemoteLocalities extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
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

            private Builder() {
            } 

            private Builder(RetryRemoteLocalities model) {
                this.value = model.value;
            } 

            /**
             * <p>Specifies whether to allow retries to other localities. Valid values:</p>
             * <ul>
             * <li><code>true</code></li>
             * <li><code>false</code></li>
             * </ul>
             * <p>Default value: <code>false</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class Retries extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Attempts")
        private Integer attempts;

        @com.aliyun.core.annotation.NameInMap("PerTryTimeout")
        private String perTryTimeout;

        @com.aliyun.core.annotation.NameInMap("RetryOn")
        private String retryOn;

        @com.aliyun.core.annotation.NameInMap("RetryRemoteLocalities")
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

            private Builder() {
            } 

            private Builder(Retries model) {
                this.attempts = model.attempts;
                this.perTryTimeout = model.perTryTimeout;
                this.retryOn = model.retryOn;
                this.retryRemoteLocalities = model.retryRemoteLocalities;
            } 

            /**
             * <p>The number of retries that are allowed for a request.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder attempts(Integer attempts) {
                this.attempts = attempts;
                return this;
            }

            /**
             * <p>The timeout period for each retry.</p>
             * 
             * <strong>example:</strong>
             * <p>2s</p>
             */
            public Builder perTryTimeout(String perTryTimeout) {
                this.perTryTimeout = perTryTimeout;
                return this;
            }

            /**
             * <p>The condition for retries. Example: <code>connect-failure,refused-stream,503</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>connect-failure,refused-stream,503</p>
             */
            public Builder retryOn(String retryOn) {
                this.retryOn = retryOn;
                return this;
            }

            /**
             * <p>Specifies whether to allow retries to other localities.</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class Rewrite extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Authority")
        private String authority;

        @com.aliyun.core.annotation.NameInMap("Uri")
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

            private Builder() {
            } 

            private Builder(Rewrite model) {
                this.authority = model.authority;
                this.uri = model.uri;
            } 

            /**
             * <p>The value to be used to overwrite the value of the Authority or Host header.</p>
             * 
             * <strong>example:</strong>
             * <p>newratings.default.svc.cluster.local</p>
             */
            public Builder authority(String authority) {
                this.authority = authority;
                return this;
            }

            /**
             * <p>The value to be used to overwrite the path or prefix of the URI.</p>
             * 
             * <strong>example:</strong>
             * <p>/v1/getProductRatings</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class HTTPAdvancedOptions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Delegate")
        private Delegate delegate;

        @com.aliyun.core.annotation.NameInMap("Fault")
        private Fault fault;

        @com.aliyun.core.annotation.NameInMap("HTTPRedirect")
        private HTTPRedirect HTTPRedirect;

        @com.aliyun.core.annotation.NameInMap("Mirror")
        private Mirror mirror;

        @com.aliyun.core.annotation.NameInMap("MirrorPercentage")
        private MirrorPercentage mirrorPercentage;

        @com.aliyun.core.annotation.NameInMap("Retries")
        private Retries retries;

        @com.aliyun.core.annotation.NameInMap("Rewrite")
        private Rewrite rewrite;

        @com.aliyun.core.annotation.NameInMap("Timeout")
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

            private Builder() {
            } 

            private Builder(HTTPAdvancedOptions model) {
                this.delegate = model.delegate;
                this.fault = model.fault;
                this.HTTPRedirect = model.HTTPRedirect;
                this.mirror = model.mirror;
                this.mirrorPercentage = model.mirrorPercentage;
                this.retries = model.retries;
                this.rewrite = model.rewrite;
                this.timeout = model.timeout;
            } 

            /**
             * <p>The virtual service that defines traffic routing.</p>
             */
            public Builder delegate(Delegate delegate) {
                this.delegate = delegate;
                return this;
            }

            /**
             * <p>The configurations of fault injection.</p>
             */
            public Builder fault(Fault fault) {
                this.fault = fault;
                return this;
            }

            /**
             * <p>The HTTP redirection rule.</p>
             */
            public Builder HTTPRedirect(HTTPRedirect HTTPRedirect) {
                this.HTTPRedirect = HTTPRedirect;
                return this;
            }

            /**
             * <p>The configurations for mirroring HTTP traffic to another destination in addition to forwarding requests to the specified destination.</p>
             */
            public Builder mirror(Mirror mirror) {
                this.mirror = mirror;
                return this;
            }

            /**
             * <p>The percentage of requests that are mirrored to another destination except for the original destination.</p>
             */
            public Builder mirrorPercentage(MirrorPercentage mirrorPercentage) {
                this.mirrorPercentage = mirrorPercentage;
                return this;
            }

            /**
             * <p>The configurations of retries for failed requests.</p>
             */
            public Builder retries(Retries retries) {
                this.retries = retries;
                return this;
            }

            /**
             * <p>The configurations for rewriting the virtual service.</p>
             */
            public Builder rewrite(Rewrite rewrite) {
                this.rewrite = rewrite;
                return this;
            }

            /**
             * <p>The timeout period for requests.</p>
             * 
             * <strong>example:</strong>
             * <p>5s</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchingContent")
        private String matchingContent;

        @com.aliyun.core.annotation.NameInMap("MatchingMode")
        private String matchingMode;

        @com.aliyun.core.annotation.NameInMap("Name")
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

            private Builder() {
            } 

            private Builder(Headers model) {
                this.matchingContent = model.matchingContent;
                this.matchingMode = model.matchingMode;
                this.name = model.name;
            } 

            /**
             * <p>The header value to be matched.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder matchingContent(String matchingContent) {
                this.matchingContent = matchingContent;
                return this;
            }

            /**
             * <p>The matching mode for the header value. Valid values:</p>
             * <ul>
             * <li><code>exact</code>: exact match</li>
             * <li><code>prefix</code>: match by prefix</li>
             * <li><code>regex</code>: match by regular expression</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>exact</p>
             */
            public Builder matchingMode(String matchingMode) {
                this.matchingMode = matchingMode;
                return this;
            }

            /**
             * <p>The header key to be matched.</p>
             * 
             * <strong>example:</strong>
             * <p>x-request-id</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class TLSMatchAttributes extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SNIHosts")
        private java.util.List<String> SNIHosts;

        @com.aliyun.core.annotation.NameInMap("TLSPort")
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
        public java.util.List<String> getSNIHosts() {
            return this.SNIHosts;
        }

        /**
         * @return TLSPort
         */
        public Integer getTLSPort() {
            return this.TLSPort;
        }

        public static final class Builder {
            private java.util.List<String> SNIHosts; 
            private Integer TLSPort; 

            private Builder() {
            } 

            private Builder(TLSMatchAttributes model) {
                this.SNIHosts = model.SNIHosts;
                this.TLSPort = model.TLSPort;
            } 

            /**
             * <p>The Server Name Indication (SNI) values to be matched.</p>
             */
            public Builder SNIHosts(java.util.List<String> SNIHosts) {
                this.SNIHosts = SNIHosts;
                return this;
            }

            /**
             * <p>The TLS port.</p>
             * 
             * <strong>example:</strong>
             * <p>443</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class URI extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchingContent")
        private String matchingContent;

        @com.aliyun.core.annotation.NameInMap("MatchingMode")
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

            private Builder() {
            } 

            private Builder(URI model) {
                this.matchingContent = model.matchingContent;
                this.matchingMode = model.matchingMode;
            } 

            /**
             * <p>The content to be matched.</p>
             * 
             * <strong>example:</strong>
             * <p>/ratings/v2/</p>
             */
            public Builder matchingContent(String matchingContent) {
                this.matchingContent = matchingContent;
                return this;
            }

            /**
             * <p>The matching mode for the routing rule. Valid values:</p>
             * <ul>
             * <li><code>exact</code>: exact match</li>
             * <li><code>prefix</code>: match by prefix</li>
             * <li><code>regex</code>: match by regular expression</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>prefix</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class MatchRequest extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Headers")
        private java.util.List<Headers> headers;

        @com.aliyun.core.annotation.NameInMap("Ports")
        private java.util.List<Integer> ports;

        @com.aliyun.core.annotation.NameInMap("TLSMatchAttributes")
        private java.util.List<TLSMatchAttributes> TLSMatchAttributes;

        @com.aliyun.core.annotation.NameInMap("URI")
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
        public java.util.List<Headers> getHeaders() {
            return this.headers;
        }

        /**
         * @return ports
         */
        public java.util.List<Integer> getPorts() {
            return this.ports;
        }

        /**
         * @return TLSMatchAttributes
         */
        public java.util.List<TLSMatchAttributes> getTLSMatchAttributes() {
            return this.TLSMatchAttributes;
        }

        /**
         * @return URI
         */
        public URI getURI() {
            return this.URI;
        }

        public static final class Builder {
            private java.util.List<Headers> headers; 
            private java.util.List<Integer> ports; 
            private java.util.List<TLSMatchAttributes> TLSMatchAttributes; 
            private URI URI; 

            private Builder() {
            } 

            private Builder(MatchRequest model) {
                this.headers = model.headers;
                this.ports = model.ports;
                this.TLSMatchAttributes = model.TLSMatchAttributes;
                this.URI = model.URI;
            } 

            /**
             * <p>The request headers to be matched.</p>
             */
            public Builder headers(java.util.List<Headers> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * <p>The ports.</p>
             */
            public Builder ports(java.util.List<Integer> ports) {
                this.ports = ports;
                return this;
            }

            /**
             * <p>The matching rule for Transport Layer Security (TLS) traffic.</p>
             */
            public Builder TLSMatchAttributes(java.util.List<TLSMatchAttributes> TLSMatchAttributes) {
                this.TLSMatchAttributes = TLSMatchAttributes;
                return this;
            }

            /**
             * <p>The matching rule for URIs.</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class Port extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Number")
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

            private Builder() {
            } 

            private Builder(Port model) {
                this.number = model.number;
            } 

            /**
             * <p>The port number.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class Destination extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Host")
        private String host;

        @com.aliyun.core.annotation.NameInMap("Port")
        private Port port;

        @com.aliyun.core.annotation.NameInMap("Subset")
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

            private Builder() {
            } 

            private Builder(Destination model) {
                this.host = model.host;
                this.port = model.port;
                this.subset = model.subset;
            } 

            /**
             * <p>The name of the service defined in the service registry.</p>
             * 
             * <strong>example:</strong>
             * <p>reviews</p>
             */
            public Builder host(String host) {
                this.host = host;
                return this;
            }

            /**
             * <p>The port of the destination service.</p>
             * <blockquote>
             * <p> If the destination service of the route has only one port, this field can be left empty. If the destination service has multiple ports, you must specify the port number.</p>
             * </blockquote>
             */
            public Builder port(Port port) {
                this.port = port;
                return this;
            }

            /**
             * <p>The name of the service subset.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class RouteDestinations extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Destination")
        private Destination destination;

        @com.aliyun.core.annotation.NameInMap("Weight")
        private Integer weight;

        private RouteDestinations(Builder builder) {
            this.destination = builder.destination;
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
         * @return weight
         */
        public Integer getWeight() {
            return this.weight;
        }

        public static final class Builder {
            private Destination destination; 
            private Integer weight; 

            private Builder() {
            } 

            private Builder(RouteDestinations model) {
                this.destination = model.destination;
                this.weight = model.weight;
            } 

            /**
             * <p>The unique endpoint of the destination service to which the specified requests are sent.</p>
             */
            public Builder destination(Destination destination) {
                this.destination = destination;
                return this;
            }

            /**
             * <p>The weight of the service subset.</p>
             * 
             * <strong>example:</strong>
             * <p>80</p>
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
    /**
     * 
     * {@link UpdateIstioGatewayRoutesRequest} extends {@link TeaModel}
     *
     * <p>UpdateIstioGatewayRoutesRequest</p>
     */
    public static class GatewayRoute extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Domains")
        private java.util.List<String> domains;

        @com.aliyun.core.annotation.NameInMap("HTTPAdvancedOptions")
        private HTTPAdvancedOptions HTTPAdvancedOptions;

        @com.aliyun.core.annotation.NameInMap("MatchRequest")
        private MatchRequest matchRequest;

        @com.aliyun.core.annotation.NameInMap("Namespace")
        private String namespace;

        @com.aliyun.core.annotation.NameInMap("RawVSRoute")
        private Object rawVSRoute;

        @com.aliyun.core.annotation.NameInMap("RouteDestinations")
        private java.util.List<RouteDestinations> routeDestinations;

        @com.aliyun.core.annotation.NameInMap("RouteName")
        private String routeName;

        @com.aliyun.core.annotation.NameInMap("RouteType")
        private String routeType;

        private GatewayRoute(Builder builder) {
            this.domains = builder.domains;
            this.HTTPAdvancedOptions = builder.HTTPAdvancedOptions;
            this.matchRequest = builder.matchRequest;
            this.namespace = builder.namespace;
            this.rawVSRoute = builder.rawVSRoute;
            this.routeDestinations = builder.routeDestinations;
            this.routeName = builder.routeName;
            this.routeType = builder.routeType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static GatewayRoute create() {
            return builder().build();
        }

        /**
         * @return domains
         */
        public java.util.List<String> getDomains() {
            return this.domains;
        }

        /**
         * @return HTTPAdvancedOptions
         */
        public HTTPAdvancedOptions getHTTPAdvancedOptions() {
            return this.HTTPAdvancedOptions;
        }

        /**
         * @return matchRequest
         */
        public MatchRequest getMatchRequest() {
            return this.matchRequest;
        }

        /**
         * @return namespace
         */
        public String getNamespace() {
            return this.namespace;
        }

        /**
         * @return rawVSRoute
         */
        public Object getRawVSRoute() {
            return this.rawVSRoute;
        }

        /**
         * @return routeDestinations
         */
        public java.util.List<RouteDestinations> getRouteDestinations() {
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
            private java.util.List<String> domains; 
            private HTTPAdvancedOptions HTTPAdvancedOptions; 
            private MatchRequest matchRequest; 
            private String namespace; 
            private Object rawVSRoute; 
            private java.util.List<RouteDestinations> routeDestinations; 
            private String routeName; 
            private String routeType; 

            private Builder() {
            } 

            private Builder(GatewayRoute model) {
                this.domains = model.domains;
                this.HTTPAdvancedOptions = model.HTTPAdvancedOptions;
                this.matchRequest = model.matchRequest;
                this.namespace = model.namespace;
                this.rawVSRoute = model.rawVSRoute;
                this.routeDestinations = model.routeDestinations;
                this.routeName = model.routeName;
                this.routeType = model.routeType;
            } 

            /**
             * <p>The list of requested domain names.</p>
             */
            public Builder domains(java.util.List<String> domains) {
                this.domains = domains;
                return this;
            }

            /**
             * <p>The advanced settings for routing HTTP traffic.</p>
             */
            public Builder HTTPAdvancedOptions(HTTPAdvancedOptions HTTPAdvancedOptions) {
                this.HTTPAdvancedOptions = HTTPAdvancedOptions;
                return this;
            }

            /**
             * <p>The matching rules for traffic routing.</p>
             */
            public Builder matchRequest(MatchRequest matchRequest) {
                this.matchRequest = matchRequest;
                return this;
            }

            /**
             * <p>The namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>default</p>
             */
            public Builder namespace(String namespace) {
                this.namespace = namespace;
                return this;
            }

            /**
             * <p>The original YAML file of the virtual service that is serialized in a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>{}</p>
             */
            public Builder rawVSRoute(Object rawVSRoute) {
                this.rawVSRoute = rawVSRoute;
                return this;
            }

            /**
             * <p>The endpoints of destination services for Layer 4 weighted routing.</p>
             */
            public Builder routeDestinations(java.util.List<RouteDestinations> routeDestinations) {
                this.routeDestinations = routeDestinations;
                return this;
            }

            /**
             * <p>The name of the routing rule.</p>
             * 
             * <strong>example:</strong>
             * <p>reviews-v2-routes</p>
             */
            public Builder routeName(String routeName) {
                this.routeName = routeName;
                return this;
            }

            /**
             * <p>The type of the traffic to be routed. Valid values: <code>HTTP</code>, <code>TLS</code>, and <code>TCP</code>.</p>
             * 
             * <strong>example:</strong>
             * <p>HTTP</p>
             */
            public Builder routeType(String routeType) {
                this.routeType = routeType;
                return this;
            }

            public GatewayRoute build() {
                return new GatewayRoute(this);
            } 

        } 

    }
}
