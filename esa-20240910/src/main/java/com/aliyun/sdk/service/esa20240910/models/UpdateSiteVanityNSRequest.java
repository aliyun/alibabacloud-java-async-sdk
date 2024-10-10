// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateSiteVanityNSRequest} extends {@link RequestModel}
 *
 * <p>UpdateSiteVanityNSRequest</p>
 */
public class UpdateSiteVanityNSRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VanityNSList")
    private String vanityNSList;

    private UpdateSiteVanityNSRequest(Builder builder) {
        super(builder);
        this.siteId = builder.siteId;
        this.vanityNSList = builder.vanityNSList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSiteVanityNSRequest create() {
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
     * @return vanityNSList
     */
    public String getVanityNSList() {
        return this.vanityNSList;
    }

    public static final class Builder extends Request.Builder<UpdateSiteVanityNSRequest, Builder> {
        private Long siteId; 
        private String vanityNSList; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSiteVanityNSRequest request) {
            super(request);
            this.siteId = request.siteId;
            this.vanityNSList = request.vanityNSList;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890123</p>
         */
        public Builder siteId(Long siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        /**
         * VanityNSList.
         */
        public Builder vanityNSList(String vanityNSList) {
            this.putQueryParameter("VanityNSList", vanityNSList);
            this.vanityNSList = vanityNSList;
            return this;
        }

        @Override
        public UpdateSiteVanityNSRequest build() {
            return new UpdateSiteVanityNSRequest(this);
        } 

    } 

}
