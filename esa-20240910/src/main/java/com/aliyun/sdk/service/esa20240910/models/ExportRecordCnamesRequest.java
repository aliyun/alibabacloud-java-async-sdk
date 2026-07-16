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
 * {@link ExportRecordCnamesRequest} extends {@link RequestModel}
 *
 * <p>ExportRecordCnamesRequest</p>
 */
public class ExportRecordCnamesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private ExportRecordCnamesRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExportRecordCnamesRequest create() {
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

    public static final class Builder extends Request.Builder<ExportRecordCnamesRequest, Builder> {
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(ExportRecordCnamesRequest request) {
            super(request);
            this.siteId = request.siteId;
        } 

        /**
         * <p>The ID of the website. You can call the <a href="~~ListSites~~">ListSites</a> operation to obtain the website ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ExportRecordCnames</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public ExportRecordCnamesRequest build() {
            return new ExportRecordCnamesRequest(this);
        } 

    } 

}
