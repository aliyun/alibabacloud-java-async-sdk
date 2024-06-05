// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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
         * Specifies whether to record custom headers in the access log. Valid values:
         * <p>
         * 
         * *   **true**
         * *   **false** (default)
         * 
         * > You can set this parameter to **true** only if the access log feature is enabled by specifying **AccessLogEnabled**.
         */
        public Builder accessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
            this.putQueryParameter("AccessLogRecordCustomizedHeadersEnabled", accessLogRecordCustomizedHeadersEnabled);
            this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
            return this;
        }

        /**
         * The configuration information about the Xtrace feature.
         */
        public Builder accessLogTracingConfig(AccessLogTracingConfig accessLogTracingConfig) {
            this.putQueryParameter("AccessLogTracingConfig", accessLogTracingConfig);
            this.accessLogTracingConfig = accessLogTracingConfig;
            return this;
        }

        /**
         * The client token that is used to ensure the idempotence of the request.
         * <p>
         * 
         * You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.
         * 
         * > If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * Specifies whether to perform only a dry run, without performing the actual request. Valid values:
         * <p>
         * 
         * *   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.
         * *   **false**: (default): performs a dry run and performs the actual request. If the request passes the dry run, a **2xx HTTP** status code is returned and the operation is performed.
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * The ID of the Application Load Balancer (ALB) listener.
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
             * Specifies whether to enable the Xtrace feature. Valid values:
             * <p>
             * 
             * *   **true**
             * *   **false** (default)
             * 
             * > You can set this parameter to **true** only if the access log feature is enabled by specifying **AccessLogEnabled**.
             */
            public Builder tracingEnabled(Boolean tracingEnabled) {
                this.tracingEnabled = tracingEnabled;
                return this;
            }

            /**
             * The sampling rate of the Xtrace feature.
             * <p>
             * 
             * Valid values: **1 to 10000**.
             * 
             * > This parameter takes effect only if you set **TracingEnabled** to **true**.
             */
            public Builder tracingSample(Integer tracingSample) {
                this.tracingSample = tracingSample;
                return this;
            }

            /**
             * The type of Xtrace. Set the value to **Zipkin**.
             * <p>
             * 
             * > This parameter takes effect only if you set **TracingEnabled** to **true**.
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
