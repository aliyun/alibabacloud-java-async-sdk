// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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
 * {@link GetCustomerConfigResponseBody} extends {@link TeaModel}
 *
 * <p>GetCustomerConfigResponseBody</p>
 */
public class GetCustomerConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.NameInMap("AuditConfig")
    private String auditConfig;

    @com.aliyun.core.annotation.NameInMap("DownloadSwitch")
    private String downloadSwitch;

    @com.aliyun.core.annotation.NameInMap("MetricConfig")
    private String metricConfig;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetCustomerConfigResponseBody(Builder builder) {
        this.appId = builder.appId;
        this.auditConfig = builder.auditConfig;
        this.downloadSwitch = builder.downloadSwitch;
        this.metricConfig = builder.metricConfig;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetCustomerConfigResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return auditConfig
     */
    public String getAuditConfig() {
        return this.auditConfig;
    }

    /**
     * @return downloadSwitch
     */
    public String getDownloadSwitch() {
        return this.downloadSwitch;
    }

    /**
     * @return metricConfig
     */
    public String getMetricConfig() {
        return this.metricConfig;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String appId; 
        private String auditConfig; 
        private String downloadSwitch; 
        private String metricConfig; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetCustomerConfigResponseBody model) {
            this.appId = model.appId;
            this.auditConfig = model.auditConfig;
            this.downloadSwitch = model.downloadSwitch;
            this.metricConfig = model.metricConfig;
            this.requestId = model.requestId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.appId = appId;
            return this;
        }

        /**
         * AuditConfig.
         */
        public Builder auditConfig(String auditConfig) {
            this.auditConfig = auditConfig;
            return this;
        }

        /**
         * DownloadSwitch.
         */
        public Builder downloadSwitch(String downloadSwitch) {
            this.downloadSwitch = downloadSwitch;
            return this;
        }

        /**
         * MetricConfig.
         */
        public Builder metricConfig(String metricConfig) {
            this.metricConfig = metricConfig;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetCustomerConfigResponseBody build() {
            return new GetCustomerConfigResponseBody(this);
        } 

    } 

}
