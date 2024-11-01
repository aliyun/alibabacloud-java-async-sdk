// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateListenerLogConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateListenerLogConfigRequest</p>
 */
public class UpdateListenerLogConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessLogRecordCustomizedHeadersEnabled")
    private Boolean accessLogRecordCustomizedHeadersEnabled;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessLogTracingConfig")
    private AccessLogTracingConfig accessLogTracingConfig;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ClientToken")
    private String clientToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DryRun")
    private Boolean dryRun;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ListenerId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String listenerId;

    private UpdateListenerLogConfigRequest(Builder builder) {
        super(builder);
        this.accessLogRecordCustomizedHeadersEnabled = builder.accessLogRecordCustomizedHeadersEnabled;
        this.accessLogTracingConfig = builder.accessLogTracingConfig;
        this.clientToken = builder.clientToken;
        this.dryRun = builder.dryRun;
        this.listenerId = builder.listenerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateListenerLogConfigRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessLogRecordCustomizedHeadersEnabled
     */
    public Boolean getAccessLogRecordCustomizedHeadersEnabled() {
        return this.accessLogRecordCustomizedHeadersEnabled;
    }

    /**
     * @return accessLogTracingConfig
     */
    public AccessLogTracingConfig getAccessLogTracingConfig() {
        return this.accessLogTracingConfig;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return dryRun
     */
    public Boolean getDryRun() {
        return this.dryRun;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    public static final class Builder extends Request.Builder<UpdateListenerLogConfigRequest, Builder> {
        private Boolean accessLogRecordCustomizedHeadersEnabled; 
        private AccessLogTracingConfig accessLogTracingConfig; 
        private String clientToken; 
        private Boolean dryRun; 
        private String listenerId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateListenerLogConfigRequest request) {
            super(request);
            this.accessLogRecordCustomizedHeadersEnabled = request.accessLogRecordCustomizedHeadersEnabled;
            this.accessLogTracingConfig = request.accessLogTracingConfig;
            this.clientToken = request.clientToken;
            this.dryRun = request.dryRun;
            this.listenerId = request.listenerId;
        } 

        /**
         * <p>Specifies whether to record custom headers in the access log. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * <blockquote>
         * <p>You can set this parameter to <strong>true</strong> only if the access log feature is enabled by specifying <strong>AccessLogEnabled</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder accessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
            this.putQueryParameter("AccessLogRecordCustomizedHeadersEnabled", accessLogRecordCustomizedHeadersEnabled);
            this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
            return this;
        }

        /**
         * <p>The configuration information about the Xtrace feature.</p>
         */
        public Builder accessLogTracingConfig(AccessLogTracingConfig accessLogTracingConfig) {
            this.putQueryParameter("AccessLogTracingConfig", accessLogTracingConfig);
            this.accessLogTracingConfig = accessLogTracingConfig;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
         * <li><strong>false</strong>: (default): performs a dry run and performs the actual request. If the request passes the dry run, a <strong>2xx HTTP</strong> status code is returned and the operation is performed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * <p>The ID of the Application Load Balancer (ALB) listener.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsr-bp1bpn0kn908w4nbw****</p>
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        @Override
        public UpdateListenerLogConfigRequest build() {
            return new UpdateListenerLogConfigRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateListenerLogConfigRequest} extends {@link TeaModel}
     *
     * <p>UpdateListenerLogConfigRequest</p>
     */
    public static class AccessLogTracingConfig extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("TracingEnabled")
        @com.aliyun.core.annotation.Validation(required = true)
        private Boolean tracingEnabled;

        @com.aliyun.core.annotation.NameInMap("TracingSample")
        private Integer tracingSample;

        @com.aliyun.core.annotation.NameInMap("TracingType")
        private String tracingType;

        private AccessLogTracingConfig(Builder builder) {
            this.tracingEnabled = builder.tracingEnabled;
            this.tracingSample = builder.tracingSample;
            this.tracingType = builder.tracingType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccessLogTracingConfig create() {
            return builder().build();
        }

        /**
         * @return tracingEnabled
         */
        public Boolean getTracingEnabled() {
            return this.tracingEnabled;
        }

        /**
         * @return tracingSample
         */
        public Integer getTracingSample() {
            return this.tracingSample;
        }

        /**
         * @return tracingType
         */
        public String getTracingType() {
            return this.tracingType;
        }

        public static final class Builder {
            private Boolean tracingEnabled; 
            private Integer tracingSample; 
            private String tracingType; 

            /**
             * <p>Specifies whether to enable the Xtrace feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong></li>
             * <li><strong>false</strong> (default)</li>
             * </ul>
             * <blockquote>
             * <p>You can set this parameter to <strong>true</strong> only if the access log feature is enabled by specifying <strong>AccessLogEnabled</strong>.</p>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder tracingEnabled(Boolean tracingEnabled) {
                this.tracingEnabled = tracingEnabled;
                return this;
            }

            /**
             * <p>The sampling rate of the Xtrace feature.</p>
             * <p>Valid values: <strong>1 to 10000</strong>.</p>
             * <blockquote>
             * <p>This parameter takes effect only if you set <strong>TracingEnabled</strong> to <strong>true</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>100</p>
             */
            public Builder tracingSample(Integer tracingSample) {
                this.tracingSample = tracingSample;
                return this;
            }

            /**
             * <p>The type of Xtrace. Set the value to <strong>Zipkin</strong>.</p>
             * <blockquote>
             * <p>This parameter takes effect only if you set <strong>TracingEnabled</strong> to <strong>true</strong>.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>Zipkin</p>
             */
            public Builder tracingType(String tracingType) {
                this.tracingType = tracingType;
                return this;
            }

            public AccessLogTracingConfig build() {
                return new AccessLogTracingConfig(this);
            } 

        } 

    }
}
