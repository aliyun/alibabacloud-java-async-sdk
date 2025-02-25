// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

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
 * {@link SetDnsGtmMonitorStatusRequest} extends {@link RequestModel}
 *
 * <p>SetDnsGtmMonitorStatusRequest</p>
 */
public class SetDnsGtmMonitorStatusRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String monitorConfigId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Status")
    @com.aliyun.core.annotation.Validation(required = true)
    private String status;

    private SetDnsGtmMonitorStatusRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.monitorConfigId = builder.monitorConfigId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetDnsGtmMonitorStatusRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return monitorConfigId
     */
    public String getMonitorConfigId() {
        return this.monitorConfigId;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    public static final class Builder extends Request.Builder<SetDnsGtmMonitorStatusRequest, Builder> {
        private String lang; 
        private String monitorConfigId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SetDnsGtmMonitorStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.monitorConfigId = request.monitorConfigId;
            this.status = request.status;
        } 

        /**
         * <p>The language of the values for specific response parameters. Default value: en. Valid values: en, zh, and ja.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The ID of the health check task.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>MonitorConfigId1</p>
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.putQueryParameter("MonitorConfigId", monitorConfigId);
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * <p>Specifies whether to enable the health check feature. Valid values:</p>
         * <ul>
         * <li>OPEN: enables the health check feature.</li>
         * <li>CLOSE: disables the health check feature.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetDnsGtmMonitorStatusRequest build() {
            return new SetDnsGtmMonitorStatusRequest(this);
        } 

    } 

}
