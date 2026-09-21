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
 * {@link GetWafRulesetRequest} extends {@link RequestModel}
 *
 * <p>GetWafRulesetRequest</p>
 */
public class GetWafRulesetRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private GetWafRulesetRequest(Builder builder) {
        super(builder);
        this.id = builder.id;
        this.phase = builder.phase;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWafRulesetRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return id
     */
    public Long getId() {
        return this.id;
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

    public static final class Builder extends Request.Builder<GetWafRulesetRequest, Builder> {
        private Long id; 
        private String phase; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(GetWafRulesetRequest request) {
            super(request);
            this.id = request.id;
            this.phase = request.phase;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The ID of the WAF ruleset. You can call the <a href="https://help.aliyun.com/document_detail/2878359.html">ListWafRulesets</a> operation to obtain the ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10000001</p>
         */
        public Builder id(Long id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The WAF rule execution phase. Valid values:</p>
         * <ul>
         * <li>http_whitelist: whitelist rules</li>
         * <li>http_custom: custom rules</li>
         * <li>http_managed: managed rules</li>
         * <li>http_anti_scan: scan protection rules</li>
         * <li>http_ratelimit: rate limiting rules</li>
         * <li>ip_access_rule: IP access rules</li>
         * <li>http_bot: advanced mode bots</li>
         * <li>http_security_level_rule: security rules</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>http_bot</p>
         */
        public Builder phase(String phase) {
            this.putQueryParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
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
        public GetWafRulesetRequest build() {
            return new GetWafRulesetRequest(this);
        } 

    } 

}
