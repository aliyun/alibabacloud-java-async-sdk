// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
         * <p>Specifies whether to record custom header fields in access logs. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes.</li>
         * <li><strong>false</strong> (default): no.</li>
         * </ul>
         * <blockquote>
         * <p>You can set this parameter to <strong>true</strong> only when the <strong>AccessLogEnabled</strong> switch for the instance is turned on.</p>
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
         * <p>The Xtrace configuration.</p>
         */
        public Builder accessLogTracingConfig(AccessLogTracingConfig accessLogTracingConfig) {
            this.putQueryParameter("AccessLogTracingConfig", accessLogTracingConfig);
            this.accessLogTracingConfig = accessLogTracingConfig;
            return this;
        }

        /**
         * <p>The client token that is used to ensure the idempotence of the request.</p>
         * <p>You can generate the value from your client and make sure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
         * <blockquote>
         * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is unique.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * <p>Specifies whether to perform a dry run. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: performs a dry run and does not update the log configuration of the listener. The system checks whether required parameters are specified, the request format is valid, and the service limits are met. If the request fails the dry run, an error is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
         * </li>
         * <li><p><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an <strong>HTTP_2xx</strong> status code is returned and the operation is performed.</p>
         * </li>
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
         * <p>The ID of the listener for the application load balancing instance.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>lsn-o4u54y73wq7b******</p>
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

            private Builder() {
            } 

            private Builder(AccessLogTracingConfig model) {
                this.tracingEnabled = model.tracingEnabled;
                this.tracingSample = model.tracingSample;
                this.tracingType = model.tracingType;
            } 

            /**
             * <p>Specifies whether to enable the Xtrace feature. Valid values:</p>
             * <ul>
             * <li><strong>true</strong>: yes.</li>
             * <li><strong>false</strong> (default): no.</li>
             * </ul>
             * <blockquote>
             * <p>You can set this parameter to <strong>true</strong> only when the <strong>AccessLogEnabled</strong> switch for the instance is turned on.</p>
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
             * <p>The Xtrace sampling rate.</p>
             * <p>Valid values: <strong>1</strong> to <strong>10000</strong>.</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>TracingEnabled</strong> is set to <strong>true</strong>.</p>
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
             * <p>The Xtrace type. Valid values: <strong>Zipkin</strong> and <strong>OpenTelemetry</strong>.</p>
             * <blockquote>
             * <p>This parameter takes effect only when <strong>TracingEnabled</strong> is set to <strong>true</strong>.</p>
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
