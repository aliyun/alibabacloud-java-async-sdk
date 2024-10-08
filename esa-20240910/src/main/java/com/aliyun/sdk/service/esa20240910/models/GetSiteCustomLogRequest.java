// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetSiteCustomLogRequest} extends {@link RequestModel}
 *
 * <p>GetSiteCustomLogRequest</p>
 */
public class GetSiteCustomLogRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private GetSiteCustomLogRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSiteCustomLogRequest create() {
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

    public static final class Builder extends Request.Builder<GetSiteCustomLogRequest, Builder> {
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(GetSiteCustomLogRequest request) {
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
        public GetSiteCustomLogRequest build() {
            return new GetSiteCustomLogRequest(this);
        } 

    } 

}
