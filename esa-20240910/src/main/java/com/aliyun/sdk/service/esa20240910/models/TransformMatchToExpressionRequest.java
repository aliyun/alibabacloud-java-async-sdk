// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TransformMatchToExpressionRequest} extends {@link RequestModel}
 *
 * <p>TransformMatchToExpressionRequest</p>
 */
public class TransformMatchToExpressionRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Match")
    private WafRuleMatch match;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Phase")
    private String phase;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private TransformMatchToExpressionRequest(Builder builder) {
        super(builder);
        this.match = builder.match;
        this.phase = builder.phase;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TransformMatchToExpressionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return match
     */
    public WafRuleMatch getMatch() {
        return this.match;
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

    public static final class Builder extends Request.Builder<TransformMatchToExpressionRequest, Builder> {
        private WafRuleMatch match; 
        private String phase; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(TransformMatchToExpressionRequest request) {
            super(request);
            this.match = request.match;
            this.phase = request.phase;
            this.siteId = request.siteId;
        } 

        /**
         * Match.
         */
        public Builder match(WafRuleMatch match) {
            String matchShrink = shrink(match, "Match", "json");
            this.putBodyParameter("Match", matchShrink);
            this.match = match;
            return this;
        }

        /**
         * Phase.
         */
        public Builder phase(String phase) {
            this.putBodyParameter("Phase", phase);
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
        public TransformMatchToExpressionRequest build() {
            return new TransformMatchToExpressionRequest(this);
        } 

    } 

}
