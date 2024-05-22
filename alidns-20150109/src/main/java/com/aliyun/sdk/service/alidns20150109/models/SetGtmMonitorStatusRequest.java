// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGtmMonitorStatusRequest} extends {@link RequestModel}
 *
 * <p>SetGtmMonitorStatusRequest</p>
 */
public class SetGtmMonitorStatusRequest extends Request {
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

    private SetGtmMonitorStatusRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.monitorConfigId = builder.monitorConfigId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetGtmMonitorStatusRequest create() {
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

    public static final class Builder extends Request.Builder<SetGtmMonitorStatusRequest, Builder> {
        private String lang; 
        private String monitorConfigId; 
        private String status; 

        private Builder() {
            super();
        } 

        private Builder(SetGtmMonitorStatusRequest request) {
            super(request);
            this.lang = request.lang;
            this.monitorConfigId = request.monitorConfigId;
            this.status = request.status;
        } 

        /**
         * The language used by the user.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * The health check ID.
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.putQueryParameter("MonitorConfigId", monitorConfigId);
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * Specifies whether health check is enabled for the address pool. Valid values:
         * <p>
         * 
         * *   **OPEN**: Enabled
         * *   **CLOSE**: Disabled
         */
        public Builder status(String status) {
            this.putQueryParameter("Status", status);
            this.status = status;
            return this;
        }

        @Override
        public SetGtmMonitorStatusRequest build() {
            return new SetGtmMonitorStatusRequest(this);
        } 

    } 

}
