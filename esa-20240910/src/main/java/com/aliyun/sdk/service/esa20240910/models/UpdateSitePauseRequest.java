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
 * {@link UpdateSitePauseRequest} extends {@link RequestModel}
 *
 * <p>UpdateSitePauseRequest</p>
 */
public class UpdateSitePauseRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Paused")
    @com.aliyun.core.annotation.Validation(required = true)
    private Boolean paused;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UpdateSitePauseRequest(Builder builder) {
        super(builder);
        this.paused = builder.paused;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSitePauseRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return paused
     */
    public Boolean getPaused() {
        return this.paused;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UpdateSitePauseRequest, Builder> {
        private Boolean paused; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSitePauseRequest request) {
            super(request);
            this.paused = request.paused;
            this.siteId = request.siteId;
        } 

        /**
         * <p>Specifies whether to temporarily pause the proxy acceleration feature for the entire site. After the feature is paused, all DNS records directly return record values to the client. Valid values:</p>
         * <ul>
         * <li>true: Pauses site acceleration.</li>
         * <li>false: Resumes normal site acceleration.</li>
         * </ul>
         * <p>When site acceleration is paused, only activated sites with NS access mode are supported.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder paused(Boolean paused) {
            this.putQueryParameter("Paused", paused);
            this.paused = paused;
            return this;
        }

        /**
         * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID. Check the Status field to confirm the site status and the AccessType field to confirm the access mode of the site.</p>
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
        public UpdateSitePauseRequest build() {
            return new UpdateSitePauseRequest(this);
        } 

    } 

}
