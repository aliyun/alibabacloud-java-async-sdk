// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

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
 * {@link GetRayDashboardResponseBody} extends {@link TeaModel}
 *
 * <p>GetRayDashboardResponseBody</p>
 */
public class GetRayDashboardResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("metricsEnabled")
    private String metricsEnabled;

    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private GetRayDashboardResponseBody(Builder builder) {
        this.metricsEnabled = builder.metricsEnabled;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetRayDashboardResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return metricsEnabled
     */
    public String getMetricsEnabled() {
        return this.metricsEnabled;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder {
        private String metricsEnabled; 
        private String url; 

        private Builder() {
        } 

        private Builder(GetRayDashboardResponseBody model) {
            this.metricsEnabled = model.metricsEnabled;
            this.url = model.url;
        } 

        /**
         * metricsEnabled.
         */
        public Builder metricsEnabled(String metricsEnabled) {
            this.metricsEnabled = metricsEnabled;
            return this;
        }

        /**
         * url.
         */
        public Builder url(String url) {
            this.url = url;
            return this;
        }

        public GetRayDashboardResponseBody build() {
            return new GetRayDashboardResponseBody(this);
        } 

    } 

}
