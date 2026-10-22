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
 * {@link DispatchConsoleAPIForPartnerRequest} extends {@link RequestModel}
 *
 * <p>DispatchConsoleAPIForPartnerRequest</p>
 */
public class DispatchConsoleAPIForPartnerRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("LiveToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String liveToken;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Operation")
    @com.aliyun.core.annotation.Validation(required = true)
    private String operation;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Product")
    @com.aliyun.core.annotation.Validation(required = true)
    private String product;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SiteHost")
    private String siteHost;

    private DispatchConsoleAPIForPartnerRequest(Builder builder) {
        super(builder);
        this.liveToken = builder.liveToken;
        this.operation = builder.operation;
        this.params = builder.params;
        this.product = builder.product;
        this.siteHost = builder.siteHost;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DispatchConsoleAPIForPartnerRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return liveToken
     */
    public String getLiveToken() {
        return this.liveToken;
    }

    /**
     * @return operation
     */
    public String getOperation() {
        return this.operation;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return siteHost
     */
    public String getSiteHost() {
        return this.siteHost;
    }

    public static final class Builder extends Request.Builder<DispatchConsoleAPIForPartnerRequest, Builder> {
        private String liveToken; 
        private String operation; 
        private String params; 
        private String product; 
        private String siteHost; 

        private Builder() {
            super();
        } 

        private Builder(DispatchConsoleAPIForPartnerRequest request) {
            super(request);
            this.liveToken = request.liveToken;
            this.operation = request.operation;
            this.params = request.params;
            this.product = request.product;
            this.siteHost = request.siteHost;
        } 

        /**
         * <p>The access token obtained by calling GetUserAccessTokenForPartner.</p>
         * <p>This parameter is required.</p>
         */
        public Builder liveToken(String liveToken) {
            this.putQueryParameter("LiveToken", liveToken);
            this.liveToken = liveToken;
            return this;
        }

        /**
         * <p>Specifies the operation to perform on the alert. Valid values:</p>
         * <ul>
         * <li><strong>deal</strong>: Handles the alert (quarantine).</li>
         * <li><strong>ignore</strong>: Ignores the alert.</li>
         * <li><strong>mark_mis_info</strong>: Marks the alert as a false positive (adds to the whitelist).</li>
         * <li><strong>rm_mark_mis_info</strong>: Unmarks the alert as a false positive (removes from the whitelist).</li>
         * <li><strong>offline_handled</strong>: Marks the alert as handled.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>disable</p>
         */
        public Builder operation(String operation) {
            this.putQueryParameter("Operation", operation);
            this.operation = operation;
            return this;
        }

        /**
         * <p>The error parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>[\&quot;\&quot;]</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The product code.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hbaseue</p>
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * <p>The website domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>abcd.scd.wanwang.xin</p>
         */
        public Builder siteHost(String siteHost) {
            this.putQueryParameter("SiteHost", siteHost);
            this.siteHost = siteHost;
            return this;
        }

        @Override
        public DispatchConsoleAPIForPartnerRequest build() {
            return new DispatchConsoleAPIForPartnerRequest(this);
        } 

    } 

}
