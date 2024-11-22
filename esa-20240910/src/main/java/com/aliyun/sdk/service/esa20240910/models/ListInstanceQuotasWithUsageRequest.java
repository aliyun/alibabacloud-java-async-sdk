// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListInstanceQuotasWithUsageRequest} extends {@link RequestModel}
 *
 * <p>ListInstanceQuotasWithUsageRequest</p>
 */
public class ListInstanceQuotasWithUsageRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("QuotaNames")
    @com.aliyun.core.annotation.Validation(required = true)
    private String quotaNames;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private ListInstanceQuotasWithUsageRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.quotaNames = builder.quotaNames;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListInstanceQuotasWithUsageRequest create() {
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
     * @return quotaNames
     */
    public String getQuotaNames() {
        return this.quotaNames;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<ListInstanceQuotasWithUsageRequest, Builder> {
        private String instanceId; 
        private String quotaNames; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListInstanceQuotasWithUsageRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.quotaNames = request.quotaNames;
            this.siteId = request.siteId;
        } 

        /**
         * <p>The plan ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>sp-xcdn-96wblslz****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The quota names in the plan. Separate the quota names with commas (,). You can query up to 10 quota names at a time. Valid values:</p>
         * <ul>
         * <li><strong>customHttpCert</strong>: the custom certificates.</li>
         * <li><strong>transition_rule</strong>: the transform rules.</li>
         * <li><strong>waiting_room</strong>: the waiting rooms.</li>
         * <li><strong>https|rule_quota</strong>: the SSL/TLS rules.</li>
         * <li><strong>cache_rules|rule_quota</strong>: the cache rules.</li>
         * <li><strong>configuration_rules|rule_quota</strong>: the configuration rules.</li>
         * <li><strong>redirect_rules|rule_quota</strong>: the redirect rules.</li>
         * <li><strong>compression_rules|rule_quota</strong>: the compression rules.</li>
         * <li><strong>origin_rules|rule_quota</strong>: the origin rules.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>customHttpCert</p>
         */
        public Builder quotaNames(String quotaNames) {
            this.putQueryParameter("QuotaNames", quotaNames);
            this.quotaNames = quotaNames;
            return this;
        }

        /**
         * <p>The website ID, which can be obtained by calling the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>1232223****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ListInstanceQuotasWithUsageRequest build() {
            return new ListInstanceQuotasWithUsageRequest(this);
        } 

    } 

}
