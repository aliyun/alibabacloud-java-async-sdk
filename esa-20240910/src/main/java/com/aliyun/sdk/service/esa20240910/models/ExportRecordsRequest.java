// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExportRecordsRequest} extends {@link RequestModel}
 *
 * <p>ExportRecordsRequest</p>
 */
public class ExportRecordsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private Long siteId;

    private ExportRecordsRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportRecordsRequest create() {
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

    public static final class Builder extends Request.Builder<ExportRecordsRequest, Builder> {
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ExportRecordsRequest request) {
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
        public ExportRecordsRequest build() {
            return new ExportRecordsRequest(this);
        } 

    } 

}
