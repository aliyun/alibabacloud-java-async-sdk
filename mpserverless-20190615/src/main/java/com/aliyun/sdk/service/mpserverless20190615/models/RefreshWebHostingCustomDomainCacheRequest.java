// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RefreshWebHostingCustomDomainCacheRequest} extends {@link RequestModel}
 *
 * <p>RefreshWebHostingCustomDomainCacheRequest</p>
 */
public class RefreshWebHostingCustomDomainCacheRequest extends Request {
    @Body
    @NameInMap("DomainName")
    @Validation(required = true)
    private String domainName;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    private RefreshWebHostingCustomDomainCacheRequest(Builder builder) {
        super(builder);
        this.domainName = builder.domainName;
        this.spaceId = builder.spaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RefreshWebHostingCustomDomainCacheRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return domainName
     */
    public String getDomainName() {
        return this.domainName;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    public static final class Builder extends Request.Builder<RefreshWebHostingCustomDomainCacheRequest, Builder> {
        private String domainName; 
        private String spaceId; 

        private Builder() {
            super();
        } 

        private Builder(RefreshWebHostingCustomDomainCacheRequest request) {
            super(request);
            this.domainName = request.domainName;
            this.spaceId = request.spaceId;
        } 

        /**
         * DomainName.
         */
        public Builder domainName(String domainName) {
            this.putBodyParameter("DomainName", domainName);
            this.domainName = domainName;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        @Override
        public RefreshWebHostingCustomDomainCacheRequest build() {
            return new RefreshWebHostingCustomDomainCacheRequest(this);
        } 

    } 

}
