// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHttpDDoSAttackIntelligentProtectionRequest} extends {@link RequestModel}
 *
 * <p>DescribeHttpDDoSAttackIntelligentProtectionRequest</p>
 */
public class DescribeHttpDDoSAttackIntelligentProtectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long siteId;

    private DescribeHttpDDoSAttackIntelligentProtectionRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHttpDDoSAttackIntelligentProtectionRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<DescribeHttpDDoSAttackIntelligentProtectionRequest, Builder> {
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHttpDDoSAttackIntelligentProtectionRequest request) {
            super(request);
            this.siteId = request.siteId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public DescribeHttpDDoSAttackIntelligentProtectionRequest build() {
            return new DescribeHttpDDoSAttackIntelligentProtectionRequest(this);
        } 

    } 

}
