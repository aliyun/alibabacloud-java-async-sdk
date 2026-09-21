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
 * {@link GetPurgeQuotaRequest} extends {@link RequestModel}
 *
 * <p>GetPurgeQuotaRequest</p>
 */
public class GetPurgeQuotaRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    private GetPurgeQuotaRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPurgeQuotaRequest create() {
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

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<GetPurgeQuotaRequest, Builder> {
        private Long siteId; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(GetPurgeQuotaRequest request) {
            super(request);
            this.siteId = request.siteId;
            this.type = request.type;
        } 

        /**
         * <p>The site ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the site ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456789****</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * <p>The refresh task type. Valid values:</p>
         * <ul>
         * <li><strong>file</strong> (default): file refresh.</li>
         * <li><strong>cachetag</strong>: cache tag refresh.</li>
         * <li><strong>directory</strong>: directory refresh.</li>
         * <li><strong>ignoreParams</strong>: parameter-stripped refresh.</li>
         * <li><strong>hostname</strong>: hostname refresh.</li>
         * <li><strong>purgeall</strong>: refreshes all cached content under the site.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        public Builder type(String type) {
            this.putQueryParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public GetPurgeQuotaRequest build() {
            return new GetPurgeQuotaRequest(this);
        } 

    } 

}
