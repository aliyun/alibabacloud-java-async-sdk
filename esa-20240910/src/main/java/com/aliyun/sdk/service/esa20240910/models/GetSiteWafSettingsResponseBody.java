// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSiteWafSettingsResponseBody} extends {@link TeaModel}
 *
 * <p>GetSiteWafSettingsResponseBody</p>
 */
public class GetSiteWafSettingsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Settings")
    private WafSiteSettings settings;

    private GetSiteWafSettingsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.settings = builder.settings;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSiteWafSettingsResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return settings
     */
    public WafSiteSettings getSettings() {
        return this.settings;
    }

    public static final class Builder {
        private String requestId; 
        private WafSiteSettings settings; 

        /**
         * <p>Id of the request</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Settings.
         */
        public Builder settings(WafSiteSettings settings) {
            this.settings = settings;
            return this;
        }

        public GetSiteWafSettingsResponseBody build() {
            return new GetSiteWafSettingsResponseBody(this);
        } 

    } 

}
