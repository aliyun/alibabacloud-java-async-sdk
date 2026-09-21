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
 * {@link ListWafUsageOfRulesRequest} extends {@link RequestModel}
 *
 * <p>ListWafUsageOfRulesRequest</p>
 */
public class ListWafUsageOfRulesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private ListWafUsageOfRulesRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.phase = builder.phase;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListWafUsageOfRulesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return phase
     */
    public String getPhase() {
        return this.phase;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ListWafUsageOfRulesRequest, Builder> {
        private String instanceId; 
        private String phase; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListWafUsageOfRulesRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.phase = request.phase;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The WAF instance ID.</p>
         * <p>If this parameter is left empty, the API returns an empty result. We recommend that you always specify this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>esa-site-b0wdsrlba3nk</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The phase in which the WAF rule runs. This parameter is required.</p>
         * <p>Common values: http_custom, http_ratelimit, http_anti_scan, http_bot, http_managed, http_whitelist, and http_threat_intelligence.</p>
         * <blockquote>
         * <p>Note: This parameter is required on the server side. If this parameter is not specified, the API returns InvalidParameter (400).</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>http_custom</p>
         */
        public Builder phase(String phase) {
            this.putQueryParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ListWafUsageOfRulesRequest build() {
            return new ListWafUsageOfRulesRequest(this);
        } 

    } 

}
