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
 * {@link ActivateVersionManagementRequest} extends {@link RequestModel}
 *
 * <p>ActivateVersionManagementRequest</p>
 */
public class ActivateVersionManagementRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private ActivateVersionManagementRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ActivateVersionManagementRequest create() {
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

    public static final class Builder extends Request.Builder<ActivateVersionManagementRequest, Builder> {
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ActivateVersionManagementRequest request) {
            super(request);
            this.siteId = request.siteId;
        } 

        /**
         * <p>Site ID, which can be obtained by calling the <a href="~~ListSites~~">ListSites</a> API.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11223***</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ActivateVersionManagementRequest build() {
            return new ActivateVersionManagementRequest(this);
        } 

    } 

}
