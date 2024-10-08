// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateSiteAccessTypeRequest} extends {@link RequestModel}
 *
 * <p>UpdateSiteAccessTypeRequest</p>
 */
public class UpdateSiteAccessTypeRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AccessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String accessType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long siteId;

    private UpdateSiteAccessTypeRequest(Builder builder) {
        super(builder);
        this.accessType = builder.accessType;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateSiteAccessTypeRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessType
     */
    public String getAccessType() {
        return this.accessType;
    }

    /**
     * @return siteId
     */
    public Long getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<UpdateSiteAccessTypeRequest, Builder> {
        private String accessType; 
        private Long siteId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateSiteAccessTypeRequest request) {
            super(request);
            this.accessType = request.accessType;
            this.siteId = request.siteId;
        } 

        /**
         * AccessType.
         */
        public Builder accessType(String accessType) {
            this.putQueryParameter("AccessType", accessType);
            this.accessType = accessType;
            return this;
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
        public UpdateSiteAccessTypeRequest build() {
            return new UpdateSiteAccessTypeRequest(this);
        } 

    } 

}
