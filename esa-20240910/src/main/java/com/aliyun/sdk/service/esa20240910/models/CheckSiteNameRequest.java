// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link CheckSiteNameRequest} extends {@link RequestModel}
 *
 * <p>CheckSiteNameRequest</p>
 */
public class CheckSiteNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String siteName;

    private CheckSiteNameRequest(Builder builder) {
        super(builder);
        this.siteName = builder.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckSiteNameRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return siteName
     */
    public String getSiteName() {
        return this.siteName;
    }

    public static final class Builder extends Request.Builder<CheckSiteNameRequest, Builder> {
        private String siteName; 

        private Builder() {
            super();
        } 

        private Builder(CheckSiteNameRequest request) {
            super(request);
            this.siteName = request.siteName;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        public Builder siteName(String siteName) {
            this.putQueryParameter("SiteName", siteName);
            this.siteName = siteName;
            return this;
        }

        @Override
        public CheckSiteNameRequest build() {
            return new CheckSiteNameRequest(this);
        } 

    } 

}
