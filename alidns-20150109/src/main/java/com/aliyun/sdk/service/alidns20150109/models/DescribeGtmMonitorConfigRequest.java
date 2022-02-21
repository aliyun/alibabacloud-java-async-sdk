// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeGtmMonitorConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeGtmMonitorConfigRequest</p>
 */
public class DescribeGtmMonitorConfigRequest extends Request {
    @Query
    @NameInMap("Lang")
    private String lang;

    @Query
    @NameInMap("MonitorConfigId")
    @Validation(required = true)
    private String monitorConfigId;

    private DescribeGtmMonitorConfigRequest(Builder builder) {
        super(builder);
        this.lang = builder.lang;
        this.monitorConfigId = builder.monitorConfigId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeGtmMonitorConfigRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeGtmMonitorConfigRequest, Builder> {
        private String lang; 
        private String monitorConfigId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeGtmMonitorConfigRequest response) {
            super(response);
            this.lang = response.lang;
            this.monitorConfigId = response.monitorConfigId;
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

        @Override
        public DescribeGtmMonitorConfigRequest build() {
            return new DescribeGtmMonitorConfigRequest(this);
        } 

    } 

}
