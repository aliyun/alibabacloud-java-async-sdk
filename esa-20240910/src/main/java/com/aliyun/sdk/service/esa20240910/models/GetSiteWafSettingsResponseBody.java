// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(GetSiteWafSettingsResponseBody model) {
            this.requestId = model.requestId;
            this.settings = model.settings;
        } 

        /**
         * <p>Request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>36af3fcc-43d0-441c-86b1-428951dc8225</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Details of site WAF configuration.</p>
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
