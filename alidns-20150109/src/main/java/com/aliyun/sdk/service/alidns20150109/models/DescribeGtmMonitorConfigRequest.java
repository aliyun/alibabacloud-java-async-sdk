// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alidns20150109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeGtmMonitorConfigRequest} extends {@link RequestModel}
 *
 * <p>DescribeGtmMonitorConfigRequest</p>
 */
public class DescribeGtmMonitorConfigRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Lang")
    private String lang;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MonitorConfigId")
    @com.aliyun.core.annotation.Validation(required = true)
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

        private Builder(DescribeGtmMonitorConfigRequest request) {
            super(request);
            this.lang = request.lang;
            this.monitorConfigId = request.monitorConfigId;
        } 

        /**
         * <p>The language of the values of specific response parameters.</p>
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
         * <p>The ID of the health check configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
