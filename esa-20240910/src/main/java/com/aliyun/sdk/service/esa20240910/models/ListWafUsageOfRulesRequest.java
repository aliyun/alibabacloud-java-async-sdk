// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private ListWafUsageOfRulesRequest(Builder builder) {
        super(builder);
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
        private String phase; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ListWafUsageOfRulesRequest request) {
            super(request);
            this.phase = request.phase;
            this.siteId = request.siteId;
        } 

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.putQueryParameter("Phase", phase);
            this.phase = phase;
            return this;
        }

        /**
         * SiteId.
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
