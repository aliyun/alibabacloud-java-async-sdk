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
 * {@link GetMainDomainNameRequest} extends {@link RequestModel}
 *
 * <p>GetMainDomainNameRequest</p>
 */
public class GetMainDomainNameRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String siteName;

    private GetMainDomainNameRequest(Builder builder) {
        super(builder);
        this.siteName = builder.siteName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMainDomainNameRequest create() {
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

    public static final class Builder extends Request.Builder<GetMainDomainNameRequest, Builder> {
        private String siteName; 

        private Builder() {
            super();
        } 

        private Builder(GetMainDomainNameRequest request) {
            super(request);
            this.siteName = request.siteName;
        } 

        /**
         * <p>The website name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sub.example.com</p>
         */
        public Builder siteName(String siteName) {
            this.putQueryParameter("SiteName", siteName);
            this.siteName = siteName;
            return this;
        }

        @Override
        public GetMainDomainNameRequest build() {
            return new GetMainDomainNameRequest(this);
        } 

    } 

}
