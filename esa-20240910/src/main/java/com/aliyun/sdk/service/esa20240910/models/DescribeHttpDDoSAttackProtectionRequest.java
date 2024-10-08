// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeHttpDDoSAttackProtectionRequest} extends {@link RequestModel}
 *
 * <p>DescribeHttpDDoSAttackProtectionRequest</p>
 */
public class DescribeHttpDDoSAttackProtectionRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true, minimum = 1)
    private Long siteId;

    private DescribeHttpDDoSAttackProtectionRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHttpDDoSAttackProtectionRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeHttpDDoSAttackProtectionRequest, Builder> {
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(DescribeHttpDDoSAttackProtectionRequest request) {
            super(request);
            this.siteId = request.siteId;
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
        public DescribeHttpDDoSAttackProtectionRequest build() {
            return new DescribeHttpDDoSAttackProtectionRequest(this);
        } 

    } 

}
