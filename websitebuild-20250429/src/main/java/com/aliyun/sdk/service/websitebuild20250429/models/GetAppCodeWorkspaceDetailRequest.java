// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.websitebuild20250429.models;

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
 * {@link GetAppCodeWorkspaceDetailRequest} extends {@link RequestModel}
 *
 * <p>GetAppCodeWorkspaceDetailRequest</p>
 */
public class GetAppCodeWorkspaceDetailRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteId")
    private String siteId;

    private GetAppCodeWorkspaceDetailRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.siteId = builder.siteId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetAppCodeWorkspaceDetailRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return siteId
     */
    public String getSiteId() {
        return this.siteId;
    }

    public static final class Builder extends Request.Builder<GetAppCodeWorkspaceDetailRequest, Builder> {
        private String regionId; 
        private String siteId; 

        private Builder() {
            super();
        } 

        private Builder(GetAppCodeWorkspaceDetailRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.siteId = request.siteId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * SiteId.
         */
        public Builder siteId(String siteId) {
            this.putQueryParameter("SiteId", siteId);
            this.siteId = siteId;
            return this;
        }

        @Override
        public GetAppCodeWorkspaceDetailRequest build() {
            return new GetAppCodeWorkspaceDetailRequest(this);
        } 

    } 

}
