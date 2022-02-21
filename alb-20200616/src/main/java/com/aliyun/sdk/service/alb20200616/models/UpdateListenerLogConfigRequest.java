// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateListenerLogConfigRequest} extends {@link RequestModel}
 *
 * <p>UpdateListenerLogConfigRequest</p>
 */
public class UpdateListenerLogConfigRequest extends Request {
    @Query
    @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
    private Boolean accessLogRecordCustomizedHeadersEnabled;

    @Query
    @NameInMap("AccessLogTracingConfig")
    private AccessLogTracingConfig accessLogTracingConfig;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("DryRun")
    private Boolean dryRun;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
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

        private Builder(UpdateListenerLogConfigRequest response) {
            super(response);
            this.accessLogRecordCustomizedHeadersEnabled = response.accessLogRecordCustomizedHeadersEnabled;
            this.accessLogTracingConfig = response.accessLogTracingConfig;
            this.clientToken = response.clientToken;
            this.dryRun = response.dryRun;
            this.listenerId = response.listenerId;
        } 

        /**
         * 是否开启携带自定义Header
         */
        public Builder accessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
            this.putQueryParameter("AccessLogRecordCustomizedHeadersEnabled", accessLogRecordCustomizedHeadersEnabled);
            this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
            return this;
        }

        /**
         * 访问日志xtrace字段相关的配置
         */
        public Builder accessLogTracingConfig(AccessLogTracingConfig accessLogTracingConfig) {
            this.putQueryParameter("AccessLogTracingConfig", accessLogTracingConfig);
            this.accessLogTracingConfig = accessLogTracingConfig;
            return this;
        }

        /**
         * 幂等标识
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         *  是否只预检此次请求
         */
        public Builder dryRun(Boolean dryRun) {
            this.putQueryParameter("DryRun", dryRun);
            this.dryRun = dryRun;
            return this;
        }

        /**
         * 监听标识
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
        @NameInMap("TracingEnabled")
        @Validation(required = true)
        private Boolean tracingEnabled;

        @NameInMap("TracingSample")
        private Integer tracingSample;

        @NameInMap("TracingType")
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
             * Xtrace功能状态
             */
            public Builder tracingEnabled(Boolean tracingEnabled) {
                this.tracingEnabled = tracingEnabled;
                return this;
            }

            /**
             * xtrace的采样率
             */
            public Builder tracingSample(Integer tracingSample) {
                this.tracingSample = tracingSample;
                return this;
            }

            /**
             * xtrace的类型
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
