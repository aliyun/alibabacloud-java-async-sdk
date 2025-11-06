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
 * {@link GetUserAccessTokenForPartnerRequest} extends {@link RequestModel}
 *
 * <p>GetUserAccessTokenForPartnerRequest</p>
 */
public class GetUserAccessTokenForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteHost")
    private String siteHost;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Ticket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ticket;

    private GetUserAccessTokenForPartnerRequest(Builder builder) {
        super(builder);
        this.siteHost = builder.siteHost;
        this.ticket = builder.ticket;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetUserAccessTokenForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return siteHost
     */
    public String getSiteHost() {
        return this.siteHost;
    }

    /**
     * @return ticket
     */
    public String getTicket() {
        return this.ticket;
    }

    public static final class Builder extends Request.Builder<GetUserAccessTokenForPartnerRequest, Builder> {
        private String siteHost; 
        private String ticket; 

        private Builder() {
            super();
        } 

        private Builder(GetUserAccessTokenForPartnerRequest request) {
            super(request);
            this.siteHost = request.siteHost;
            this.ticket = request.ticket;
        } 

        /**
         * SiteHost.
         */
        public Builder siteHost(String siteHost) {
            this.putQueryParameter("SiteHost", siteHost);
            this.siteHost = siteHost;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2f68fe1e-d9d5-4803-94d0-2fc81032e91d</p>
         */
        public Builder ticket(String ticket) {
            this.putQueryParameter("Ticket", ticket);
            this.ticket = ticket;
            return this;
        }

        @Override
        public GetUserAccessTokenForPartnerRequest build() {
            return new GetUserAccessTokenForPartnerRequest(this);
        } 

    } 

}
