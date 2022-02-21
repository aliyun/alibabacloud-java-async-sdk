// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetGtmMonitorStatusRequest} extends {@link RequestModel}
 *
 * <p>SetGtmMonitorStatusRequest</p>
 */
public class SetGtmMonitorStatusRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    private String monitorConfigId;

    @Query
    @NameInMap("Status")
    @Validation(required = true)
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

        private Builder(SetGtmMonitorStatusRequest response) {
            super(response);
            this.lang = response.lang;
            this.monitorConfigId = response.monitorConfigId;
            this.status = response.status;
        } 

        /**
         * Lang.
         */
        public Builder lang(String lang) {
            this.putQueryParameter("Lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * MonitorConfigId.
         */
        public Builder monitorConfigId(String monitorConfigId) {
            this.putQueryParameter("MonitorConfigId", monitorConfigId);
            this.monitorConfigId = monitorConfigId;
            return this;
        }

        /**
         * Status.
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
