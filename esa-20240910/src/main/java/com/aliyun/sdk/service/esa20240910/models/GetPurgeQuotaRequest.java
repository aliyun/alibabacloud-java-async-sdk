// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Type")
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
         * <p>The website ID. You can call the <a href="https://help.aliyun.com/document_detail/2850189.html">ListSites</a> operation to obtain the ID.</p>
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
         * <p>The type of the purge task. Valid values:</p>
         * <ul>
         * <li><strong>file</strong> (default): purges the cache by file.</li>
         * <li><strong>cachetag</strong>: purges the cache by cache tag.</li>
         * <li><strong>directory</strong>: purges the cache by directory.</li>
         * <li><strong>ignoreParams</strong>: purges the cache by URL with specific parameters ignored.</li>
         * <li><strong>hostname</strong>: purges the cache by hostname.</li>
         * <li><strong>purgeall</strong>: purges all cache.</li>
         * </ul>
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
